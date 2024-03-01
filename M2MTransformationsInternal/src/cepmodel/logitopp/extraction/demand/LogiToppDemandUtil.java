package cepmodel.logitopp.extraction.demand;

import com.google.common.collect.ImmutableList;

import logiToppMetamodel.Demand;
import logiToppMetamodel.LogiToppMetamodelFactory;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.logiTopp.ParcelConsumer;
import logiToppMetamodel.logiTopp.ParcelProducer;
import logiToppMetamodel.logiTopp.parcels.BusinessParcel;
import logiToppMetamodel.logiTopp.parcels.Parcel;
import logiToppMetamodel.logiTopp.parcels.ParcelDestinationType;
import logiToppMetamodel.logiTopp.parcels.ParcelsFactory;
import logiToppMetamodel.logiTopp.parcels.PrivateParcel;
import logiToppMetamodel.logiTopp.parcels.ShipmentSize;
import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;

public class LogiToppDemandUtil {

	public static Demand createDemand(ImmutableList<Parcel> parcels) {
		Demand result = LogiToppMetamodelFactory.eINSTANCE.createDemand();
		result.getParcels().addAll(parcels);
		return result;
	}

	public static BusinessParcel createBusinessParcel(String id, ParcelProducer producer, ParcelConsumer consumer,
			ZoneAndLocation destination, ShipmentSize shipmentSize, boolean isPickup, Time arrivalAtOrigin) {
		BusinessParcel result = ParcelsFactory.eINSTANCE.createBusinessParcel();

		result.setId(id);

		result.setProducer(producer);
		result.setConsumer(consumer);

		result.setZoneAndLocation(destination);

		result.setShipmentSize(shipmentSize);
		result.setIsPickup(isPickup);

		result.setArrivalAtOrigin(arrivalAtOrigin);

		return result;
	}

	public static PrivateParcel createPrivateParcel(String id, ParcelProducer producer, ParcelConsumer consumer,
			ZoneAndLocation destination, ShipmentSize shipmentSize, ParcelDestinationType destinationType,
			boolean isPickup, Time arrivalAtOrigin) {
		PrivateParcel result = ParcelsFactory.eINSTANCE.createPrivateParcel();

		result.setId(id);

		result.setProducer(producer);
		result.setConsumer(consumer);

		result.setZoneAndLocation(destination);

		result.setDestinationType(destinationType);
		result.setShipmentSize(shipmentSize);
		result.setIsPickup(isPickup);

		result.setArrivalAtOrigin(arrivalAtOrigin);

		return result;
	}

}
