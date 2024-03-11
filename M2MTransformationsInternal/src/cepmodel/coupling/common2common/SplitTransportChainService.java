package cepmodel.coupling.common2common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;
import CommonFreightTransportMetamodel.logisticDemand.Demand;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandFactory;
import CommonFreightTransportMetamodel.logisticDemand.Shipment;
import CommonFreightTransportMetamodel.logisticDemand.SplittedShipment;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticHub;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionFactory;
import CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;
import CommonFreightTransportMetamodel.logisticSolution.Stop;
import CommonFreightTransportMetamodel.logisticSolution.Tour;
import CommonFreightTransportMetamodel.utils.Durration_;
import CommonFreightTransportMetamodel.utils.MultiDayTimeWindow;
import CommonFreightTransportMetamodel.utils.MultiDayTimestamp;

public class SplitTransportChainService {
	Map<Shipment, Collection<Shipment>> shipment2splittedShipments;
	Map<Shipment, ShipmentRecordEntry> splittedShipment2ShipmentRecordEntry;
	Map<Shipment, Shipment> splittedShipment2OriginalShipment;

	public void applyTransformation(CommonFreightTransportMetamodelRoot root) {
		shipment2splittedShipments = new HashMap<>();
		splittedShipment2ShipmentRecordEntry = new HashMap<>();
		splittedShipment2OriginalShipment = new HashMap<>();

		EList<ShipmentRecord> shipmentRecords = root.getLogisticSolution().getShipmentRecords();

		// step 1 : split shipments
		for (ShipmentRecord shipmentRecord : shipmentRecords) {
			Shipment shipment = shipmentRecord.getShipment();

			// case: no split
			if (shipmentRecord.getEntries().size() <= 1) {
				shipment2splittedShipments.put(shipment, List.of(shipment));
				splittedShipment2ShipmentRecordEntry.put(shipment, shipmentRecord.getEntries().get(0));
				splittedShipment2OriginalShipment.put(shipment, shipment);
				continue;
			}

			// case: split needed
			List<Shipment> newShipments = new ArrayList<>();
			for (ShipmentRecordEntry shipmentRecordEntry : shipmentRecord.getEntries()) {
				Shipment newShipment = createSplittedShipmentFromShipmentRecordEntry(shipment, shipmentRecordEntry,
						shipmentRecord);
				newShipments.add(newShipment);
				splittedShipment2ShipmentRecordEntry.put(newShipment, shipmentRecordEntry);
				splittedShipment2OriginalShipment.put(newShipment, shipment);
			}
			shipment2splittedShipments.put(shipment, newShipments);
		}

		// step 2: replace old shipments by new shipments in tours
		for (Entry<Shipment, ShipmentRecordEntry> replaceTupel : splittedShipment2ShipmentRecordEntry.entrySet()) {
			Tour tour = replaceTupel.getValue().getTour();
			Shipment originalShipment = splittedShipment2OriginalShipment.get(replaceTupel.getKey());
			Shipment newShipment = replaceTupel.getKey();

			for (Stop stop : tour.getStops()) {
				if (stop instanceof PickUpDeliveryStop pickUpDeliveryStop) {
					int mayBeLoadedIndex = pickUpDeliveryStop.getLoadedShipments().indexOf(originalShipment);
					int mayBeUnloadedIndex = pickUpDeliveryStop.getUnloadedShipments().indexOf(originalShipment);

					if (mayBeLoadedIndex != -1) {
						pickUpDeliveryStop.getLoadedShipments().set(mayBeLoadedIndex, newShipment);
					}
					if (mayBeUnloadedIndex != -1) {
						pickUpDeliveryStop.getUnloadedShipments().set(mayBeUnloadedIndex, newShipment);
					}
				}
			}
		}

		// step 3: replace old shipment records by new shipment records
		List<ShipmentRecord> newShipmentRecords = new ArrayList<>();

		for (Entry<Shipment, ShipmentRecordEntry> replaceTupel : splittedShipment2ShipmentRecordEntry.entrySet()) {
			Shipment newShipment = replaceTupel.getKey();
			ShipmentRecordEntry originalShipmentRecordEntry = replaceTupel.getValue();
			newShipmentRecords
					.add(createNewShipmentRecordFromSlittedShipment(newShipment, originalShipmentRecordEntry));
		}
		root.getLogisticSolution().getShipmentRecords().removeIf(elem -> true);
		root.getLogisticSolution().getShipmentRecords().addAll(newShipmentRecords);

		// step 4: replace demand
		Demand demand = root.getDemand();
		demand.getShipments().removeIf(el -> true);
		demand.getShipments().addAll(splittedShipment2ShipmentRecordEntry.keySet());
		
		// sort
		CommonMetamodelUtil.sortDemandAndSolution(root);
	}

	private Shipment createSplittedShipmentFromShipmentRecordEntry(Shipment originalShipment,
			ShipmentRecordEntry shipmentRecordEntry, ShipmentRecord shipmentRecord) {
		SplittedShipment result = LogisticDemandFactory.eINSTANCE.createSplittedShipment();

		result.setId(originalShipment.getId() + "_" + shipmentRecordEntry.getNo());
		result.setOriginalShipmentReference(CommonMetamodelUtil.createOriginalShipmentReference(originalShipment));

		result.setSize(EcoreUtil.copy(originalShipment.getSize()));
		result.setResponsibleCEPSP(shipmentRecordEntry.getExecutingCEPSP());

		result.setOrigin(CommonMetamodelUtil.getStopLocation(shipmentRecordEntry.getPickUpStop().getStopLocation()));
		result.setDestination(
				CommonMetamodelUtil.getStopLocation(shipmentRecordEntry.getDeliveryStop().getStopLocation()));

		// TODO: major - correct definition of times (arrival at origin, destination
		// time window)
		// TODO: discuss
		Optional<ShipmentRecordEntry> optionalPreviousShipmentEntry = shipmentRecord.getEntries().stream().filter(
				currentShipmentRecordEntry -> currentShipmentRecordEntry.getNo() == shipmentRecordEntry.getNo() - 1)
				.findFirst();
		Optional<ShipmentRecordEntry> optionalNextShipmentEntry = shipmentRecord.getEntries().stream().filter(
				currentShipmentRecordEntry -> currentShipmentRecordEntry.getNo() == shipmentRecordEntry.getNo() + 1)
				.findFirst();

		if (optionalPreviousShipmentEntry.isPresent()) {
			MultiDayTimestamp latestPriviusArrival = ((MultiDayTimeWindow) optionalPreviousShipmentEntry.get()
					.getDeliveryStop().getStopTimeWindow()).getTo();
			Durration_ minimumDurationAtHub = ((LogisticHub) optionalPreviousShipmentEntry.get().getToSpec())
					.getMinimumTranshipmentTime();

			result.setArrivalAtOrigin(
					CommonMetamodelUtil.addDurationToTimestamp(latestPriviusArrival, minimumDurationAtHub));
		} else {
			result.setArrivalAtOrigin(EcoreUtil.copy(CommonMetamodelUtil.getArrivalAtOrigin(originalShipment)));
		}

		if (optionalNextShipmentEntry.isPresent()) {
			result.setArrivalAtDestinationTimeWindow(
					EcoreUtil.copy(shipmentRecordEntry.getDeliveryStop().getStopTimeWindow()));
		} else {
			result.setArrivalAtDestinationTimeWindow(EcoreUtil.copy(CommonMetamodelUtil.getArrivalAtDestination(originalShipment)));
		}

		return result;
	}

	private ShipmentRecord createNewShipmentRecordFromSlittedShipment(Shipment newShipment,
			ShipmentRecordEntry originalShipmentRecordEntry) {
		ShipmentRecord newShipmentRecord = LogisticSolutionFactory.eINSTANCE.createShipmentRecord();
		ShipmentRecordEntry newShipmentRecordEntry = LogisticSolutionFactory.eINSTANCE.createShipmentRecordEntry();
		newShipmentRecord.getEntries().add(newShipmentRecordEntry);

		newShipmentRecord.setId(newShipment.getId() + "_record");
		newShipmentRecord.setShipment(newShipment);
		newShipmentRecord.setRepsonsibleCEPSP(newShipment.getResponsibleCEPSP());

		newShipmentRecordEntry.setId(newShipmentRecord.getId() + "_0");
		newShipmentRecordEntry.setNo(0);
		newShipmentRecordEntry.setExecutingCEPSP(newShipment.getResponsibleCEPSP());
		newShipmentRecordEntry.setTour(originalShipmentRecordEntry.getTour());
		newShipmentRecordEntry.setPickUpStop(originalShipmentRecordEntry.getPickUpStop());
		newShipmentRecordEntry.setDeliveryStop(originalShipmentRecordEntry.getDeliveryStop());
		newShipmentRecordEntry.setFromSpec(originalShipmentRecordEntry.getFromSpec());
		newShipmentRecordEntry.setToSpec(originalShipmentRecordEntry.getToSpec());
		newShipmentRecordEntry.setTimeWindow(originalShipmentRecordEntry.getTimeWindow());

		return newShipmentRecord;
	}

	
}