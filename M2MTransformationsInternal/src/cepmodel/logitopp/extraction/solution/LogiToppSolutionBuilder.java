package cepmodel.logitopp.extraction.solution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import cepmodel.logitopp.extraction.LogiToppBuilderBase;
import cepmodel.logitopp.extraction.LogiToppExtractionUtil;
import cepmodel.logitopp.extraction.LogiToppInputFileRegistry;
import cepmodel.logitopp.extraction.demand.LogiToppDemandBuilder;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.transportinfrastructure.LogiToppTransportInfrastructureBuilder;
import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.dataExchange.Solution;
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

public class LogiToppSolutionBuilder extends LogiToppBuilderBase {
	private Map<String, PlannedDeliveryTour> tours = new HashMap<>();

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
		fileRegisty.plannedToursCSVs.forEach(this::parsePlannedToursCsv);
		List<PlannedDeliveryTour> sortedTours = tours.values().stream()
				.sorted((t1, t2) -> Integer.compare(Integer.valueOf(t1.getId()), Integer.valueOf(t2.getId()))).toList();
		return LogiToppSolutionUtil.createSolution(ImmutableList.copyOf(sortedTours));
	}

	private void parsePlannedToursCsv(String filePath) {
		try (CSVParser csvParser = getCSVParser(filePath)) {

			Map<String, List<CSVRecord>> rawTours = csvParser.getRecords().stream()
					.collect(Collectors.groupingBy(t -> t.get("tourId")));
			rawTours.values().forEach(inputTour -> inputTour.sort(
					(s1, s2) -> Integer.compare(Integer.valueOf(s1.get("stopNo")), Integer.valueOf(s2.get("stopNo")))));

			for (List<CSVRecord> rawTour : rawTours.values()) {
				// parse tour metadata
				CSVRecord anyTourRecord = rawTour.get(0);
				String tourId = anyTourRecord.get("tourId");
				String distributionCenterId = anyTourRecord.get("fromDepotId");
				DistributionCenter distributionCenter = transportInfrastructureBuilder
						.getDistributionCenter(distributionCenterId);
				VehicleType vehicleType = VehicleType.get(Integer.valueOf(anyTourRecord.get("vehicleType")));
				Time plannedAt = LogiToppExtractionUtil
						.createTime(Integer.valueOf(anyTourRecord.get("dispatchSimMin")) * 60);

				// parse tour stops
				List<ParcelActivity> stops = new ArrayList<>();
				for (CSVRecord rawTourRow : rawTour) {
					ParcelActivity stop = createIntermediateStop(rawTourRow);
					stops.add(stop);
				}
				// assume: only one hub stop, parcel not loaded and unloaded at tour
				ParcelActivity newFirstStop = createFirstStop(rawTour.getFirst(), plannedAt, stops);
				ParcelActivity newLastStop = createLastStop(newFirstStop, stops.getLast(), stops);
				stops.add(0, newFirstStop);
				stops.add(newLastStop);

				RelativeTime plannedDuration = LogiToppExtractionUtil
						.getDurationBetween(stops.getFirst().getPlannedTime(), stops.getLast().getPlannedTime());

				PlannedDeliveryTour tour = LogiToppSolutionUtil.createPlannedDeliveryTour(tourId, distributionCenter,
						vehicleType, plannedAt, plannedDuration, ImmutableList.copyOf(stops));
				tours.put(tourId, tour);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private ParcelActivity createIntermediateStop(CSVRecord inputStop) {
		int stopNumber = Integer.parseInt(inputStop.get("stopNo"));

		ZoneAndLocation stopZoneAndLocation = parseStopLocation(inputStop, true);
		double distance = Double.parseDouble(inputStop.get("distance"));
		int tripDurationMinutes = Integer.parseInt(inputStop.get("tripDur"));
		Time plannedTime = LogiToppExtractionUtil.createTime(Integer.valueOf(inputStop.get("plannedTimeSimMin")) * 60);
		int deliveryDurationMinutes = Integer.parseInt(inputStop.get("deliveryDur"));
		DeliveryVehicle vehicle = transportInfrastructureBuilder.getDeliveryVehicle(inputStop.get("vehicleId"));

		Set<Parcel> deliveries = parseShipments(inputStop.get("deliveries"), inputStop.get("nestedDeliveries"));
		Set<Parcel> pickUps = parseShipments(inputStop.get("pickups"), inputStop.get("nestedPickups"));

		return LogiToppSolutionUtil.createParcelActivity(stopNumber, stopZoneAndLocation, distance, tripDurationMinutes,
				plannedTime, deliveryDurationMinutes, vehicle, ImmutableSet.copyOf(deliveries),
				ImmutableSet.copyOf(pickUps));
	}

	private ParcelActivity createFirstStop(CSVRecord firstStopRecord, Time plannedAt, List<ParcelActivity> stops) {
		ZoneAndLocation stopZoneAndLocation = parseStopLocation(firstStopRecord, false);
		DeliveryVehicle vehicle = transportInfrastructureBuilder.getDeliveryVehicle(firstStopRecord.get("vehicleId"));
		Set<Parcel> pickUps = stops.stream().map(stop -> stop.getParcels()).flatMap(List::stream)
				.collect(Collectors.toSet());

		return LogiToppSolutionUtil.createParcelActivity(0, stopZoneAndLocation, 0, 0, EcoreUtil.copy(plannedAt), 0,
				vehicle, ImmutableSet.of(), ImmutableSet.copyOf(pickUps));
	}

	private ParcelActivity createLastStop(ParcelActivity firstStop, ParcelActivity secondLastStop,
			List<ParcelActivity> stops) {
		// simplification: trip duration = 0, simplification: trip distance = 0,
		// simplification: same time as lastStop.time + lastStop.deliveryDuration
		Set<Parcel> deliveries = stops.stream().map(stop -> stop.getPickUps()).flatMap(List::stream)
				.collect(Collectors.toSet());
		Time plannedAt = LogiToppExtractionUtil.addDurationToTime(secondLastStop.getPlannedTime(),
				LogiToppExtractionUtil.createRelativeTime(0, 0, secondLastStop.getDeliveryDuration(), 0));

		return LogiToppSolutionUtil.createParcelActivity(secondLastStop.getNo() + 1,
				EcoreUtil.copy(firstStop.getStopLocation()), 0, 0, plannedAt, 0, firstStop.getVehicle(),
				ImmutableSet.copyOf(deliveries), ImmutableSet.of());
	}

	private ZoneAndLocation parseStopLocation(CSVRecord inputStop, boolean toRelevant) {
		String prefix = toRelevant ? "to" : "from";

		double x = Double.parseDouble(inputStop.get(prefix + "X"));
		double y = Double.parseDouble(inputStop.get(prefix + "Y"));
		String edgeId = inputStop.get(prefix + "Edge");
		double edgePos = Double.parseDouble(inputStop.get(prefix + "EdgePos"));
		Location stopLocation = networkBuilder.createLocation(x, y, edgeId, edgePos);
		Zone zone = networkBuilder.getZone(inputStop.get(prefix + "Zone"));
		ZoneAndLocation stopZoneAndLocation = NetworkFactory.eINSTANCE.createZoneAndLocation();
		stopZoneAndLocation.setLocation(stopLocation);
		stopZoneAndLocation.setZone(zone);
		return stopZoneAndLocation;
	}

	private Set<Parcel> parseShipments(String parcelString1, String parcelString2) {
		Set<Parcel> result = new HashSet<>();

		Stream<String> inputValues = Stream.concat(Arrays.stream(parcelString1.split(",")),
				Arrays.stream(parcelString2.split(",")));

		result.addAll(inputValues.filter(str -> !str.isEmpty()).map(String::trim).map(Integer::valueOf)
				.filter(num -> num >= 0).map(parcelId -> demandBuilder.getParcel(parcelId.toString()))
				.collect(Collectors.toSet()));
		return result;
	}
}
