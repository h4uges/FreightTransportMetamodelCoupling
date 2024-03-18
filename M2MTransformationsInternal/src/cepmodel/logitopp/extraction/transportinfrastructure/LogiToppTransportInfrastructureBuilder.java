package cepmodel.logitopp.extraction.transportinfrastructure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import cepmodel.logitopp.extraction.LogiToppBuilderBase;
import cepmodel.logitopp.extraction.LogiToppExtractionUtil;
import cepmodel.logitopp.extraction.LogiToppInputFileRegistry;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import logiToppMetamodel.base.BaseFactory;
import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.base.Weekday;
import logiToppMetamodel.dataExchange.TransportInfrastructure;
import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;
import logiToppMetamodel.logiTopp.distribution.fleet.Fleet;
import logiToppMetamodel.logiTopp.distribution.region.RegionalReach;
import logiToppMetamodel.logiTopp.distribution.region.ServiceArea;
import logiToppMetamodel.logiTopp.distribution.timetable.Connection;
import logiToppMetamodel.logiTopp.distribution.timetable.TimeTable;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;

public class LogiToppTransportInfrastructureBuilder extends LogiToppBuilderBase {
	private final Map<String, Set<String>> dcId2ServiceAreaZones = new HashMap<>();
	private final Map<String, CEPServiceProvider> cepsps = new HashMap<>();
	private final Map<String, DistributionCenter> distributionCenters = new HashMap<>();
	private final Map<String, DeliveryVehicle> deliveryVehicles = new HashMap<>();
	private final List<Connection> connections = new ArrayList<>();

	private LogiToppNetworkBuilder networkBuilder;
	private final LogiToppInputFileRegistry fileRegisty;

	public LogiToppTransportInfrastructureBuilder(LogiToppInputFileRegistry fileRegisty,
			LogiToppNetworkBuilder networkBuilder) {
		this.fileRegisty = fileRegisty;
		this.networkBuilder = networkBuilder;
	}

	public TransportInfrastructure createTransportInfrastructure() {
		fileRegisty.serviceAreaCSVs.forEach(this::parseServiceAreaCsv);
		fileRegisty.distributionCenterCSVs.forEach(this::parseDistributionCenterCsv);
		fileRegisty.depotLocationCSVs.forEach(this::parseDepotLocationCsv);
		fileRegisty.fleetCSVs.forEach(this::parseFleetCsv);
		fileRegisty.depotRelationCSVs.forEach(this::parseDepotRelationsCsv);
		fileRegisty.timeTableCSVs.forEach(this::parseTimeTableCsv);

		TimeTable timeTable = LogiToppTransportInfrastructureUtil.createTimeTable(ImmutableList.copyOf(connections));
		return LogiToppTransportInfrastructureUtil.createTransportInfrastructure(ImmutableSet.copyOf(cepsps.values()),
				timeTable);
	}

	private void parseServiceAreaCsv(String filePath) {
		try (CSVParser csvParser = getCSVParser(filePath)) {

			for (CSVRecord csvEntry : csvParser) {
				String dcId = csvEntry.get("id");
				String zoneId = csvEntry.get("zone");

				dcId2ServiceAreaZones.computeIfAbsent(dcId, t -> new HashSet<String>());
				dcId2ServiceAreaZones.get(dcId).add(zoneId);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseDistributionCenterCsv(String filePath) {
		try (CSVParser csvParser = getCSVParser(filePath)) {

			for (CSVRecord csvEntry : csvParser) {
				String id = csvEntry.get("id");
				String name = csvEntry.get("name");
				String cepsp = csvEntry.get("cepsp");

				int vehicleType = Integer.parseInt(csvEntry.get("vehicle_type"));
				int numAttempts = Integer.parseInt(csvEntry.get("attempts"));

				addDistributionCenter(cepsp, id, name, numAttempts, vehicleType);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private CEPServiceProvider addCEPSP(String name) {
		CEPServiceProvider cepsp = LogiToppTransportInfrastructureUtil.createCEPSP(name, name);

		cepsps.put(name, cepsp);
		return cepsp;
	}

	private void addDistributionCenter(String cepspName, String id, String name, int numAttempts, int vehicleType) {
		ServiceArea serviceArea = createServiceArea(id);
		RegionalReach regionalReach = LogiToppTransportInfrastructureUtil.createRegionalReach(serviceArea);
		Fleet fleet = LogiToppTransportInfrastructureUtil.createFleet(vehicleType);

		DistributionCenter distributionCenter = LogiToppTransportInfrastructureUtil.createDistributionCenter(id, name,
				null, null, numAttempts, regionalReach, fleet);

		distributionCenters.put(id, distributionCenter);

		if (!cepsps.containsKey(cepspName)) {
			addCEPSP(cepspName);
		}

		CEPServiceProvider cepsp = cepsps.get(cepspName);
		cepsp.getDistributionCenters().add(distributionCenter);
	}

	private void parseDepotLocationCsv(String filePath) {
		try (CSVParser csvParser = getCSVParser(filePath)) {

			for (CSVRecord csvEntry : csvParser) {
				String distributionCenterId = csvEntry.get("id");
				String zoneId = csvEntry.get("id");
				double x = Double.parseDouble(csvEntry.get("x"));
				double y = Double.parseDouble(csvEntry.get("y"));
				String edgeId = csvEntry.get("edge");
				double edgePos = Double.parseDouble(csvEntry.get("pos"));

				Zone zone = networkBuilder.getZone(zoneId);
				Location location = networkBuilder.createLocation(x, y, edgeId, edgePos);

				DistributionCenter distributionCenter = distributionCenters.get(distributionCenterId);
				distributionCenter.setZone(zone);
				distributionCenter.setLocation(location);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private ServiceArea createServiceArea(String distributionCenterId) {
		Set<String> zoneIds = dcId2ServiceAreaZones.getOrDefault(distributionCenterId, Set.of());
		List<Zone> zones = zoneIds.stream().map(zoneId -> networkBuilder.getZone(zoneId)).toList();

		return LogiToppTransportInfrastructureUtil.createServiceArea(ImmutableSet.copyOf(zones));
	}

	private void parseFleetCsv(String filePath) {
		try (CSVParser csvParser = getCSVParser(filePath)) {

			for (CSVRecord csvEntry : csvParser) {
				String distributionCenterId = csvEntry.get("ownerId");
				String vehicleId = csvEntry.get("vehicleId");
				int vehicleType = Integer.parseInt(csvEntry.get("vehicleTypeCode"));

				addVehicle(distributionCenterId, vehicleId, vehicleType);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addVehicle(String distributionCenterId, String vehicleId, int vehicleType) {
		DeliveryVehicle vehicle = LogiToppTransportInfrastructureUtil.createDeliveryVehicle(vehicleId, vehicleType,
				LogiToppExtractionUtil.createTime(Weekday.MONDAY, 7, 30, 0),
				LogiToppExtractionUtil.createTime(Weekday.MONDAY, 22, 0, 0));
		distributionCenters.get(distributionCenterId).getFleet().getDeliveryVehicles().add(vehicle);
		deliveryVehicles.put(vehicleId, vehicle);
	}

	private void parseDepotRelationsCsv(String filePath) {
		try (CSVParser csvParser = getCSVParser(filePath)) {

			for (CSVRecord csvEntry : csvParser) {
				String fromDepotId = csvEntry.get("from_depot");
				String toDepotId = csvEntry.get("to_depot");

				distributionCenters.get(fromDepotId).getRegionalStructure().getRelatedDeliveryHubs()
						.add(distributionCenters.get(toDepotId));
				distributionCenters.get(toDepotId).getRegionalStructure().getRelatedPickUpHubs()
						.add(distributionCenters.get(fromDepotId));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseTimeTableCsv(String filePath) {
		try (CSVParser csvParser = getCSVParser(filePath)) {
			for (CSVRecord csvEntry : csvParser) {
				String fromId = csvEntry.get("from_depot");
				String toId = csvEntry.get("to_depot");
				Weekday departDay = Weekday.get(Integer.valueOf(csvEntry.get("depart_day")));
				int departHour = Integer.parseInt(csvEntry.get("depart_hour"));
				int departMin = Integer.parseInt(csvEntry.get("depart_min"));
				int tripDuration = Integer.parseInt(csvEntry.get("trip_duration"));

				DistributionCenter fromDc = distributionCenters.get(fromId);
				DistributionCenter toDc = distributionCenters.get(toId);

				Time departureTime = LogiToppExtractionUtil.createTime(departDay, departHour, departMin, 0);
				RelativeTime duration = BaseFactory.eINSTANCE.createRelativeTime();
				duration.setSeconds(tripDuration * 60);

				Connection connection = LogiToppTransportInfrastructureUtil.createConnection(fromDc, toDc,
						departureTime, duration);
				connections.add(connection);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public CEPServiceProvider getCEPSP(String name) {
		return cepsps.get(name);
	}

	public DistributionCenter getDistributionCenter(String distributionCenterId) {
		return distributionCenters.get(distributionCenterId);
	}

	public DeliveryVehicle getDeliveryVehicle(String deliveryVehicleId) {
		return deliveryVehicles.get(deliveryVehicleId);
	}
}
