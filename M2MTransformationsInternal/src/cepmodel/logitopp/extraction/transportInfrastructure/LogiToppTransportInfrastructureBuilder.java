package cepmodel.logitopp.extraction.transportInfrastructure;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

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

public class LogiToppTransportInfrastructureBuilder {
	private final Map<String, Set<String>> dcId2ServiceAreaZones = new HashMap<String, Set<String>>();
	private final Map<String, CEPServiceProvider> cepsps = new HashMap<String, CEPServiceProvider>();
	private final Map<String, DistributionCenter> distributionCenters = new HashMap<String, DistributionCenter>();
	private final Map<String, DeliveryVehicle> deliveryVehicles = new HashMap<String, DeliveryVehicle>();
	private final List<Connection> connections = new ArrayList<Connection>();

	private LogiToppNetworkBuilder networkBuilder;
	private final LogiToppInputFileRegistry fileRegisty;

	public LogiToppTransportInfrastructureBuilder(LogiToppInputFileRegistry fileRegisty,
			LogiToppNetworkBuilder networkBuilder) {
		this.fileRegisty = fileRegisty;
		this.networkBuilder = networkBuilder;
	}

	public TransportInfrastructure createTransportInfrastructure() {
		fileRegisty.serviceAreaCSVs.forEach(file -> parseServiceAreaCsv(file));
		fileRegisty.distributionCenterCSVs.forEach(file -> parseDistributionCenterCsv(file));
		fileRegisty.depotLocationCSVs.forEach(file -> parseDepotLocationCsv(file));
		fileRegisty.fleetCSVs.forEach(file -> parseFleetCsv(file));
		fileRegisty.depotRelationCSVs.forEach(file -> parseDepotRelationsCsv(file));
		fileRegisty.timeTableCSVs.forEach(file -> parseTimeTableCsv(file));

		TimeTable timeTable = LogiToppTransportInfrastructureUtil.createTimeTable(ImmutableList.copyOf(connections));
		return LogiToppTransportInfrastructureUtil.createTransportInfrastructure(ImmutableSet.copyOf(cepsps.values()),
				timeTable);
	}

	private void parseServiceAreaCsv(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader()
						.setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String dcId = record.get("id");
				String zoneId = record.get("zone");

				dcId2ServiceAreaZones.computeIfAbsent(dcId, t -> new HashSet<String>());
				dcId2ServiceAreaZones.get(dcId).add(zoneId);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseDistributionCenterCsv(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String id = record.get("id");
				String name = record.get("name");
				String cepsp = record.get("cepsp");

				int vehicleType = Integer.valueOf(record.get("vehicle_type"));
				int numAttempts = Integer.valueOf(record.get("attempts"));

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
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader()
						.setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String distributionCenterId = record.get("id");
				String zoneId = record.get("id");
				double x = Double.valueOf(record.get("x"));
				double y = Double.valueOf(record.get("y"));
				String edgeId = record.get("edge");
				double edgePos = Double.valueOf(record.get("pos"));

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
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader()
						.setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String distributionCenterId = record.get("ownerId");
				String vehicleId = record.get("vehicleId");
				int vehicleType = Integer.valueOf(record.get("vehicleTypeCode"));

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
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String fromDepotId = record.get("from_depot");
				String toDepotId = record.get("to_depot");

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
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String fromId = record.get("from_depot");
				String toId = record.get("to_depot");
				Weekday departDay = Weekday.get(Integer.valueOf(record.get("depart_day")));
				int departHour = Integer.valueOf(record.get("depart_hour"));
				int departMin = Integer.valueOf(record.get("depart_min"));
				int tripDuration = Integer.valueOf(record.get("trip_duration"));
				// TODO: major - verify connection capacity
				int capacity = Integer.valueOf(record.get("capacity"));

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
