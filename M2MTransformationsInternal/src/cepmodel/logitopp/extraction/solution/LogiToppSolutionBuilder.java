package cepmodel.logitopp.extraction.solution;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import cepmodel.logitopp.extraction.LogiToppInputFileRegistry;
import cepmodel.logitopp.extraction.LogiToppExtractionUtil;
import cepmodel.logitopp.extraction.demand.LogiToppDemandBuilder;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.transportInfrastructure.LogiToppTransportInfrastructureBuilder;
import logiToppMetamodel.Solution;
import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity;
import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;
import logiToppMetamodel.logiTopp.distribution.fleet.VehicleType;
import logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour;
import logiToppMetamodel.logiTopp.parcels.Parcel;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.NetworkFactory;
import logiToppMetamodel.mobiTopp.network.Zone;
import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;

public class LogiToppSolutionBuilder {
	private Map<String, PlannedDeliveryTour> tours = new HashMap<String, PlannedDeliveryTour>();

	private LogiToppInputFileRegistry fileRegisty;
	private LogiToppNetworkBuilder networkBuilder;
	private LogiToppTransportInfrastructureBuilder transportInfrastructureBuilder;
	private LogiToppDemandBuilder demandBuilder;

	public LogiToppSolutionBuilder(LogiToppInputFileRegistry fileRegisty, LogiToppNetworkBuilder networkBuilder,
			LogiToppTransportInfrastructureBuilder transportInfrastructureBuilder,
			LogiToppDemandBuilder demandBuilder) {
		this.fileRegisty = fileRegisty;
		this.networkBuilder = networkBuilder;
		this.transportInfrastructureBuilder = transportInfrastructureBuilder;
		this.demandBuilder = demandBuilder;
	}

	public Solution createSolution() {
		fileRegisty.plannedToursCSVs.forEach(file -> parsePlannedToursCsv(file));
		return LogiToppSolutionUtil.createSolution(ImmutableList.copyOf(tours.values()));
	}

	private void parsePlannedToursCsv(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader()
						.setDelimiter(';').build().parse(reader)) {

			Map<String, List<CSVRecord>> inputTours = csvParser.getRecords().stream()
					.collect(Collectors.groupingBy(t -> t.get("tourId")));
			inputTours.values().forEach(inputTour -> inputTour.sort(
					(s1, s2) -> Integer.compare(Integer.valueOf(s1.get("stopNo")), Integer.valueOf(s2.get("stopNo")))));

			for (List<CSVRecord> inputTour : inputTours.values()) {
				CSVRecord firstRecord = inputTour.get(0);
				String tourId = firstRecord.get("tourId");
				String distributionCenterId = firstRecord.get("distributionCenterId");
				DistributionCenter distributionCenter = transportInfrastructureBuilder
						.getDistributionCenter(distributionCenterId);
				VehicleType vehicleType = VehicleType.get(Integer.valueOf(firstRecord.get("vehicleType")));
				int plannedAtMinute = Integer.valueOf(firstRecord.get("dispatchSimMin"));
				Time plannedAt = LogiToppExtractionUtil.createTime(plannedAtMinute * 60);

				List<ParcelActivity> stops = new ArrayList<ParcelActivity>();

				for (CSVRecord inputStop : inputTour) {
					ParcelActivity stop = createIntermediateStop(firstRecord, inputStop);
					stops.add(stop);
				}
				ParcelActivity newFirstStop = createFirstStop(inputTour.getFirst(), plannedAt, stops);
				ParcelActivity newLastStop = createLastStop(stops.getFirst(), stops.getLast(), stops);
				stops.add(0, newFirstStop);
				stops.add(newLastStop);

				RelativeTime plannedDuration = LogiToppExtractionUtil.createRelativeTime(
						stops.getLast().getPlannedTime().getSeconds() - stops.getFirst().getPlannedTime().getSeconds());

				PlannedDeliveryTour tour = LogiToppSolutionUtil.createPlannedDeliveryTour(distributionCenterId,
						distributionCenter, vehicleType, plannedAt, plannedDuration, ImmutableList.copyOf(stops));
				tours.put(tourId, tour);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private ParcelActivity createIntermediateStop(CSVRecord firstRecord, CSVRecord inputStop) {
		int stopNumber = Integer.valueOf(inputStop.get("stopNo"));

		ZoneAndLocation stopZoneAndLocation = parseStopLocation(inputStop, true);
		double distance = Double.valueOf(inputStop.get("distance"));
		int tripDurationMinutes = Integer.valueOf(inputStop.get("tripDur"));
		Time plannedTime = LogiToppExtractionUtil
				.createTime(Integer.valueOf(firstRecord.get("plannedTimeSimMin")) * 60);
		int deliveryDurationMinutes = Integer.valueOf(inputStop.get("deliveryDur"));
		DeliveryVehicle vehicle = transportInfrastructureBuilder.getDeliveryVehicle(inputStop.get("vehicleId"));

		Set<Parcel> deliveries = parseShipments(inputStop.get("deliveries"), inputStop.get("nestedDeliveries"));
		Set<Parcel> pickUps = parseShipments(inputStop.get("pickups"), inputStop.get("nestedPickups"));

		ParcelActivity stop = LogiToppSolutionUtil.createParcelActivity(stopNumber, stopZoneAndLocation, distance,
				tripDurationMinutes, plannedTime, deliveryDurationMinutes, vehicle, ImmutableSet.copyOf(deliveries),
				ImmutableSet.copyOf(pickUps));
		return stop;
	}

	// assume: only one hub stop, parcel not loaded and unloaded at tour
	private ParcelActivity createFirstStop(CSVRecord firstStopRecord, Time plannedAt, List<ParcelActivity> stops) {
		ZoneAndLocation stopZoneAndLocation = parseStopLocation(firstStopRecord, false);
		DeliveryVehicle vehicle = transportInfrastructureBuilder.getDeliveryVehicle(firstStopRecord.get("vehicleId"));
		Set<Parcel> pickUps = stops.stream().map(stop -> stop.getParcels()).flatMap(List::stream)
				.collect(Collectors.toSet());

		return LogiToppSolutionUtil.createParcelActivity(0, stopZoneAndLocation, 0, 0, plannedAt, 0, vehicle,
				ImmutableSet.of(), ImmutableSet.copyOf(pickUps));
	}

	// assume: only one hub stop, parcel not loaded and unloaded at tour
	private ParcelActivity createLastStop(ParcelActivity firstStop, ParcelActivity lastStop,
			List<ParcelActivity> stops) {
		// simplification: trip duration = 0, simplification: trip distance = 0,
		// simplification: same time as "lastStop" + lastStop.deliveryDuration
		Set<Parcel> deliveries = stops.stream().map(stop -> stop.getPickUps()).flatMap(List::stream)
				.collect(Collectors.toSet());
		Time plannedAt = LogiToppExtractionUtil
				.createTime(lastStop.getPlannedTime().getSeconds() + lastStop.getDeliveryDuration() * 60);

		return LogiToppSolutionUtil.createParcelActivity(lastStop.getNo() + 1,
				EcoreUtil.copy(lastStop.getStopLocation()), 0, 0, plannedAt, 0, firstStop.getVehicle(),
				ImmutableSet.copyOf(deliveries), ImmutableSet.of());
	}

	private ZoneAndLocation parseStopLocation(CSVRecord inputStop, boolean toRelevant) {
		String prefix = toRelevant ? "to" : "from";

		double x = Double.valueOf(inputStop.get(prefix + "X"));
		double y = Double.valueOf(inputStop.get(prefix + "Y"));
		String edgeId = inputStop.get(prefix + "Zone");
		double edgePos = Double.valueOf(inputStop.get(prefix + "EdgePos"));
		Location stopLocation = networkBuilder.createLocation(x, y, edgeId, edgePos);
		Zone zone = networkBuilder.getZone(inputStop.get(prefix + "Zone"));
		ZoneAndLocation stopZoneAndLocation = NetworkFactory.eINSTANCE.createZoneAndLocation();
		stopZoneAndLocation.setLocation(stopLocation);
		stopZoneAndLocation.setZone(zone);
		return stopZoneAndLocation;
	}

	private Set<Parcel> parseShipments(String parcelString1, String parcelString2) {
		Set<Parcel> result = new HashSet<Parcel>();

		Stream<String> inputValues = Stream.concat(Arrays.stream(parcelString1.split(",")),
				Arrays.stream(parcelString2.split(",")));

		result.addAll(inputValues.filter(str -> !str.isEmpty()).map(String::trim).map(Integer::valueOf)
				.filter(num -> num >= 0).map(parcelId -> demandBuilder.getParcel(parcelId.toString()))
				.collect(Collectors.toSet()));
		return result;
	}
}
