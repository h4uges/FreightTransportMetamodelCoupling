package cepmodel.logitopp.extraction.solution;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import logiToppMetamodel.LogiToppMetamodelFactory;
import logiToppMetamodel.Solution;
import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.distribution.delivery.DeliveryFactory;
import logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity;
import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;
import logiToppMetamodel.logiTopp.distribution.fleet.VehicleType;
import logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour;
import logiToppMetamodel.logiTopp.distribution.tours.ToursFactory;
import logiToppMetamodel.logiTopp.parcels.Parcel;
import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;

public class LogiToppSolutionUtil {

	public static Solution createSolution(ImmutableList<PlannedDeliveryTour> plannedTours) {
		Solution result = LogiToppMetamodelFactory.eINSTANCE.createSolution();
		result.getPlannedTours().addAll(plannedTours);
		return result;
	}

	public static PlannedDeliveryTour createPlannedDeliveryTour(String id, DistributionCenter distributionCenter,
			VehicleType vehicleType, Time plannedAt, RelativeTime plannedDuration,
			ImmutableList<ParcelActivity> stops) {
		PlannedDeliveryTour result = ToursFactory.eINSTANCE.createPlannedDeliveryTour();

		result.setId(id);
		result.setDistributionCenter(distributionCenter);
		result.setVehicleType(vehicleType);
		result.setPlannedAt(plannedAt);
		result.setPlannedDuration(plannedDuration);
		result.getStops().addAll(stops);

		return result;
	}

	public static ParcelActivity createParcelActivity(int stopNumber, ZoneAndLocation stopLocation, double distance,
			int tripDurationMinutes, Time plannedTime, int deliveryDurationMinutes, DeliveryVehicle vehicle,
			ImmutableSet<Parcel> deliveries, ImmutableSet<Parcel> pickUps) {
		ParcelActivity result = DeliveryFactory.eINSTANCE.createParcelActivity();

		result.setNo(stopNumber);
		result.setStopLocation(stopLocation);

		result.setDistance(distance);
		result.setTripDuration(tripDurationMinutes);
		result.setPlannedTime(plannedTime);
		result.setDeliveryDuration(deliveryDurationMinutes);

		result.setVehicle(vehicle);
		result.getParcels().addAll(deliveries);
		result.getPickUps().addAll(pickUps);

		return result;
	}
}
