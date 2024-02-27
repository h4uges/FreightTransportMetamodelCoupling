package cepmodel.logitopp.extraction.transportInfrastructure;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import cepmodel.logitopp.extraction.InputFileRegistry;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import logiToppMetamodel.TransportInfrastructure;
import logiToppMetamodel.base.BaseFactory;
import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;
import logiToppMetamodel.logiTopp.distribution.fleet.Fleet;
import logiToppMetamodel.logiTopp.distribution.region.RegionalReach;
import logiToppMetamodel.logiTopp.distribution.timetable.Connection;
import logiToppMetamodel.logiTopp.distribution.timetable.TimeTable;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;

public class LogiToppTransportInfrastructureBuilder {
	private final Map<String, CEPServiceProvider> cepsps = new HashMap<String, CEPServiceProvider>();
	private final Map<Integer, DistributionCenter> distributionCenters = new HashMap<Integer, DistributionCenter>();
	private final List<Connection> connections = new ArrayList<Connection>();
	private int vehicleCount = 0;
	
	private LogiToppNetworkBuilder networkBuilder;
	private final InputFileRegistry fileRegisty;
	
	public LogiToppTransportInfrastructureBuilder(InputFileRegistry fileRegisty, LogiToppNetworkBuilder networkBuilder) {
		this.fileRegisty = fileRegisty;
		this.networkBuilder = networkBuilder;
	}
	
	public TransportInfrastructure createTransportInfrastructure() {
		fileRegisty.distributionCenterCSVs.forEach(file -> parseDistributionCenterCsv(file));
		fileRegisty.depotRelationCSVs.forEach(file -> parseDepotRelationsCsv(file));
		fileRegisty.timeTableCSVs.forEach(file -> parseTimeTableCsv(file));
		
		TimeTable timeTable = LogiToppTransportInfrastructureUtil.createTimeTable(ImmutableList.copyOf(connections));
		return LogiToppTransportInfrastructureUtil.createTransportInfrastructure(ImmutableSet.copyOf(cepsps.values()), timeTable);
	}
	
	private CEPServiceProvider addCEPSP(String name) {
		int id = cepsps.size();
		CEPServiceProvider cepsp = LogiToppTransportInfrastructureUtil.createCEPSP(id, name);
		
		cepsps.put(name, cepsp);
		return cepsp;
	}
	
	public CEPServiceProvider getCEPSP(String name) {
		return cepsps.get(name);
	}
	
	private void addDistributionCenter(String cepspName, int id, String name, double x, double y, int zoneId, int numAttempts, int numVehicles, int vehicleType, int serviceAreaNum) {
		// TODO: handle serviceAreaNum
		RegionalReach regionalReach = LogiToppTransportInfrastructureUtil.createRegionalReach();
		Fleet fleet = createFleet(numVehicles, vehicleType);
		// TODO: handle edgeId, fixEdgePosition (wait for better input data)
		Location location = networkBuilder.createLocation(x, y, 0, 0);
		Zone zone = networkBuilder.getZone(zoneId);
		DistributionCenter distributionCenter = LogiToppTransportInfrastructureUtil.createDistributionCenter(id, name, location, zone, numAttempts, fleet, regionalReach);
		
		distributionCenters.put(id, distributionCenter);
		
		CEPServiceProvider cepsp = cepsps.computeIfAbsent(cepspName, t -> addCEPSP(cepspName));
		cepsp.getDistributionCenters().add(distributionCenter);
	}
	
	// TODO: wait for separate vehicle log
	private Fleet createFleet(int numVehicles, int vehicleType) {
		List<DeliveryVehicle> vehicles = new ArrayList<DeliveryVehicle>();
		
		for(int i = 0; i < numVehicles; i++) {
			int vehicleCapacity = LogiToppTransportInfrastructureUtil.vehicleType2Capacity(vehicleType);
			DeliveryVehicle vehicle = LogiToppTransportInfrastructureUtil.createDeliveryVehicle(vehicleCount++, vehicleType, vehicleCapacity);
			vehicles.add(vehicle);
		}
		
		return LogiToppTransportInfrastructureUtil.createFleet(vehicleType, ImmutableList.copyOf(vehicles));
	}
	
	
	private void parseDistributionCenterCsv(String filePath) {
		try (Reader reader = new FileReader(filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				int id = Integer.valueOf(record.get("id"));
				String name = record.get("name");
				String cepsp = record.get("cepsp");
				
				double x = Double.valueOf(record.get("loc_x"));
				double y = Double.valueOf(record.get("loc_y"));
				int zoneId = Integer.valueOf(record.get("zone"));
				
				int numVehicles = Integer.valueOf(record.get("vehicles"));
				int vehicleType = Integer.valueOf(record.get("vehicle_type"));
				int numAttempts = Integer.valueOf(record.get("attempts"));
				int serviceAreaNum = Integer.valueOf(record.get("service_area"));
				
				addDistributionCenter(cepsp, id, name, x, y, zoneId, numAttempts, numVehicles, vehicleType, serviceAreaNum);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void parseDepotRelationsCsv(String filePath) {
		try (Reader reader = new FileReader(filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				int fromDepotId = Integer.valueOf(record.get("from_depot"));
				int toDepotId = Integer.valueOf(record.get("to_depot"));
				
				distributionCenters.get(fromDepotId).getRegionalStructure().getRelatedDeliveryHubs().add(distributionCenters.get(toDepotId));
				distributionCenters.get(toDepotId).getRegionalStructure().getRelatedPickUpHubs().add(distributionCenters.get(fromDepotId));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void parseTimeTableCsv(String filePath) {
		try (Reader reader = new FileReader(filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				int fromId = Integer.valueOf(record.get("from_depot"));
				int toId = Integer.valueOf(record.get("to_depot"));
				int departDay = Integer.valueOf(record.get("depart_day"));
				int departHour = Integer.valueOf(record.get("depart_hour"));
				int departMin = Integer.valueOf(record.get("depart_min"));
				int tripDuration = Integer.valueOf(record.get("trip_duration"));
				// TODO: decide of handling of capacity (MA)
				int capacity = Integer.valueOf(record.get("capacity"));
				
				DistributionCenter fromDc = distributionCenters.get(fromId);
				DistributionCenter toDc = distributionCenters.get(toId);
				
				Time departureTime = BaseFactory.eINSTANCE.createTime();
				departureTime.setSeconds(departDay * 24 * 60 * 60 + departHour * 60 * 60 + departMin * 60);
				RelativeTime duration = BaseFactory.eINSTANCE.createRelativeTime();
				duration.setSeconds(tripDuration * 60); 
				
				Connection connection = LogiToppTransportInfrastructureUtil.createConnection(fromDc, toDc, departureTime, duration);
				connections.add(connection);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
