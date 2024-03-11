package cepmodel.logitopp.extraction.transportInfrastructure;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.base.Weekday;
import logiToppMetamodel.dataExchange.DataExchangeFactory;
import logiToppMetamodel.dataExchange.TransportInfrastructure;
import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.distribution.DistributionFactory;
import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;
import logiToppMetamodel.logiTopp.distribution.fleet.Fleet;
import logiToppMetamodel.logiTopp.distribution.fleet.FleetFactory;
import logiToppMetamodel.logiTopp.distribution.fleet.VehicleType;
import logiToppMetamodel.logiTopp.distribution.region.RegionFactory;
import logiToppMetamodel.logiTopp.distribution.region.RegionalReach;
import logiToppMetamodel.logiTopp.distribution.region.ServiceArea;
import logiToppMetamodel.logiTopp.distribution.timetable.Connection;
import logiToppMetamodel.logiTopp.distribution.timetable.TimeTable;
import logiToppMetamodel.logiTopp.distribution.timetable.TimetableFactory;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;

public class LogiToppTransportInfrastructureUtil {

	public static TransportInfrastructure createTransportInfrastructure(ImmutableSet<CEPServiceProvider> cepsps,
			TimeTable timeTable) {
		TransportInfrastructure result = DataExchangeFactory.eINSTANCE.createTransportInfrastructure();

		result.getCepServiceProviders().addAll(cepsps);
		result.setTimetable(timeTable);

		return result;
	}

	public static CEPServiceProvider createCEPSP(String id, String name) {
		CEPServiceProvider result = DistributionFactory.eINSTANCE.createCEPServiceProvider();

		result.setId(id);
		result.setName(name);

		return result;
	}

	public static DistributionCenter createDistributionCenter(String id, String name, Location location, Zone zone,
			int numAttempts, RegionalReach regionalStructure, Fleet fleet) {
		DistributionCenter result = DistributionFactory.eINSTANCE.createDistributionCenter();

		result.setId(id);
		result.setName(name);

		result.setLocation(location);
		result.setZone(zone);

		result.setAttempts(numAttempts);
		result.setRegionalStructure(regionalStructure);
		result.setFleet(fleet);

		return result;
	}

	public static Fleet createFleet(int vehicleType) {
		Fleet result = FleetFactory.eINSTANCE.createFleet();
		result.setVehicleType(VehicleType.get(vehicleType));
		return result;
	}

	public static DeliveryVehicle createDeliveryVehicle(String id, int vehicleType, Time earliestStartTime, Time latestEndTime) {
		DeliveryVehicle result = FleetFactory.eINSTANCE.createDeliveryVehicle();

		result.setId(id);
		result.setVehicleType(VehicleType.get(vehicleType));
		result.setCapacity(vehicleType2Capacity(result.getVehicleType()));
		earliestStartTime.setDay(Weekday.MONDAY);
		latestEndTime.setDay(Weekday.MONDAY);
		result.setEarliestStartTime(earliestStartTime);
		result.setLatestEndTime(latestEndTime);

		return result;
	}

	public static int vehicleType2Capacity(VehicleType vehicleType) {
		switch (vehicleType) {
		case VehicleType.OTHERS:
			return 0;
		case VehicleType.BIKE:
			return 120 * 80 * 940;
		case VehicleType.TRUCK:
			return 12 * 100 * 100 * 100;
		case VehicleType.TRAM:
			return 0;

		default:
			throw new IllegalArgumentException("Unexpected value: " + vehicleType);
		}
	}

	public static RegionalReach createRegionalReach(ServiceArea serviceArea) {
		RegionalReach result = RegionFactory.eINSTANCE.createRegionalReach();

		result.setServiceArea(serviceArea);

		return result;
	}

	public static ServiceArea createServiceArea(ImmutableSet<Zone> zones) {
		ServiceArea result = RegionFactory.eINSTANCE.createServiceArea();

		result.getZones().addAll(zones);

		return result;
	}

	public static TimeTable createTimeTable(ImmutableList<Connection> connections) {
		TimeTable result = TimetableFactory.eINSTANCE.createTimeTable();
		result.getConnections().addAll(connections);
		return result;
	}

	public static Connection createConnection(DistributionCenter fromDc, DistributionCenter toDc, Time departureTime,
			RelativeTime duration) {
		Connection result = TimetableFactory.eINSTANCE.createConnection();
		result.setFrom(fromDc);
		result.setTo(toDc);
		result.setDeparture(departureTime);
		result.setDuration(duration);
		return result;
	}

}
