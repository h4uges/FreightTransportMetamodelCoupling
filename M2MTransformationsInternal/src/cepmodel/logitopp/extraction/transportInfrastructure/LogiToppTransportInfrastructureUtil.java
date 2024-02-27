package cepmodel.logitopp.extraction.transportInfrastructure;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import logiToppMetamodel.LogiToppMetamodelFactory;
import logiToppMetamodel.TransportInfrastructure;
import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.distribution.DistributionFactory;
import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;
import logiToppMetamodel.logiTopp.distribution.fleet.Fleet;
import logiToppMetamodel.logiTopp.distribution.fleet.FleetFactory;
import logiToppMetamodel.logiTopp.distribution.fleet.VehicleType;
import logiToppMetamodel.logiTopp.distribution.region.RegionFactory;
import logiToppMetamodel.logiTopp.distribution.region.RegionalReach;
import logiToppMetamodel.logiTopp.distribution.timetable.Connection;
import logiToppMetamodel.logiTopp.distribution.timetable.TimeTable;
import logiToppMetamodel.logiTopp.distribution.timetable.TimetableFactory;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;

public class LogiToppTransportInfrastructureUtil {
	
	public static TransportInfrastructure createTransportInfrastructure(ImmutableSet<CEPServiceProvider> cepsps, TimeTable timeTable) {
		TransportInfrastructure result = LogiToppMetamodelFactory.eINSTANCE.createTransportInfrastructure();
		
		result.getCepServiceProviders().addAll(cepsps);
		result.setTimetable(timeTable);
		
		return result;
	}

	public static CEPServiceProvider createCEPSP(int id, String name) {
		CEPServiceProvider result = DistributionFactory.eINSTANCE.createCEPServiceProvider();
		
		result.setId(id);
		result.setName(name);
		
		return result;
	}
	
	public static DistributionCenter createDistributionCenter(int id, String name, Location location, Zone zone, int numAttempts, Fleet fleet, RegionalReach regionalStructure) {
		DistributionCenter result = DistributionFactory.eINSTANCE.createDistributionCenter();
		
		result.setId(id);
		result.setName(name);
		
		result.setLocation(location);
		result.setZone(zone);
		
		result.setAttempts(numAttempts);
		result.setFleet(fleet);
		result.setRegionalStructure(regionalStructure);
		
		return result;
	}
	
	public static Fleet createFleet(int vehicleType, ImmutableList<DeliveryVehicle>vehicles) {
		Fleet result = FleetFactory.eINSTANCE.createFleet();
		
		result.setVehicleType(VehicleType.get(vehicleType));
		result.getDeliveryVehicles().addAll(vehicles);
		
		return result;
	}

	public static DeliveryVehicle createDeliveryVehicle(int id, int vehicleType, int vehicleCapacity) {
		DeliveryVehicle result = FleetFactory.eINSTANCE.createDeliveryVehicle();
		result.setId(id);
		result.setVehicleType(VehicleType.get(vehicleType));
		result.setCapacity(vehicleCapacity);
		// TODO Auto-generated method stub
		return null;
	}
	
	public static int vehicleType2Capacity(int vehicleTypeNum) {
		VehicleType vehicleType = VehicleType.get(vehicleTypeNum);
		
		switch (vehicleType) {
		case VehicleType.OTHERS: return 0;
		case VehicleType.BIKE: return 120*80*940;
		case VehicleType.TRUCK: return 12*100*100*100;
		case VehicleType.TRAM: return 0;
		
		
		default: throw new IllegalArgumentException("Unexpected value: " + vehicleType);
		}
	}
	
	public static RegionalReach createRegionalReach() {
		RegionalReach result = RegionFactory.eINSTANCE.createRegionalReach();
		
		// TODO: set values?
		
		return result;
	}
	
	public static TimeTable createTimeTable(ImmutableList<Connection> connections) {
		TimeTable result = TimetableFactory.eINSTANCE.createTimeTable();
		result.getConnections().addAll(connections);
		return result;
	}
	
	public static Connection createConnection(DistributionCenter fromDc, DistributionCenter toDc, Time departureTime, RelativeTime duration) {
		Connection result = TimetableFactory.eINSTANCE.createConnection();
		result.setFrom(fromDc);
		result.setTo(toDc);
		result.setDeparture(departureTime);
		result.setDuration(duration);
		return result;
	}
	
}
