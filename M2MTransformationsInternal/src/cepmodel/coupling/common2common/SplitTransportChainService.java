package cepmodel.coupling.common2common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;
import CommonFreightTransportMetamodel.logisticDemand.Demand;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandFactory;
import CommonFreightTransportMetamodel.logisticDemand.Shipment;
import CommonFreightTransportMetamodel.logisticDemand.SplittedShipment;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticHub;
import CommonFreightTransportMetamodel.logisticSolution.DeliveryExit;
import CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry;
import CommonFreightTransportMetamodel.logisticSolution.LogisticHubExit;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionFactory;
import CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop;
import CommonFreightTransportMetamodel.logisticSolution.PickUpEntry;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;
import CommonFreightTransportMetamodel.logisticSolution.Stop;
import CommonFreightTransportMetamodel.logisticSolution.Tour;

public class SplitTransportChainService {
	Map<Shipment, Collection<Shipment>> shipment2splittedShipments;
	Map<Shipment, ShipmentRecordEntry> splittedShipment2ShipmentRecordEntry;
	Map<Shipment, Shipment> splittedShipment2OriginalShipment;

	public SplitTransportChainService() {
	}

	public void applyTransformation(CommonFreightTransportMetamodelRoot root) {
		shipment2splittedShipments = new HashMap<Shipment, Collection<Shipment>>();
		splittedShipment2ShipmentRecordEntry = new HashMap<Shipment, ShipmentRecordEntry>();
		splittedShipment2OriginalShipment = new HashMap<Shipment, Shipment>();
		
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
			List<Shipment> newShipments = new ArrayList<Shipment>();
			for (ShipmentRecordEntry shipmentRecordEntry : shipmentRecord.getEntries()) {
				Shipment newShipment = createSplittedShipmentFromShipmentRecordEntry(shipment, shipmentRecordEntry);
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
				if (PickUpDeliveryStop.class.isInstance(stop)) {
					PickUpDeliveryStop pickUpDeliveryStop = (PickUpDeliveryStop) stop;

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
		List<ShipmentRecord> newShipmentRecords = new ArrayList<ShipmentRecord>();
		
		for (Entry<Shipment, ShipmentRecordEntry> replaceTupel : splittedShipment2ShipmentRecordEntry.entrySet()) {
			Shipment newShipment = replaceTupel.getKey();
			ShipmentRecordEntry originalShipmentRecordEntry = replaceTupel.getValue();
			ShipmentRecord orgiginalShipmentRecord = originalShipmentRecordEntry.getRecord();
			newShipmentRecords.add(createNewShipmentRecordFromSlittedShipment(newShipment, originalShipmentRecordEntry, orgiginalShipmentRecord));
		}
		root.getLogisticSolution().getShipmentRecords().removeIf(elem -> true);
		root.getLogisticSolution().getShipmentRecords().addAll(newShipmentRecords);
		
		// step 4: replace demand
		Demand demand = root.getDemand();
		demand.getShipments().removeIf(el -> true);
		demand.getShipments().addAll(splittedShipment2ShipmentRecordEntry.keySet());
	}

	private Shipment createSplittedShipmentFromShipmentRecordEntry(Shipment originalShipment,
			ShipmentRecordEntry shipmentRecordEntry) {
		SplittedShipment result = LogisticDemandFactory.eINSTANCE.createSplittedShipment();

		result.setId(originalShipment.getId() + "_" + shipmentRecordEntry.getNo());
		result.setOriginalId(originalShipment.getId());

		result.setSize(originalShipment.getSize());
		result.setResponsibleCEPSP(shipmentRecordEntry.getExecutingCEPSP());

		result.setOrigin(shipmentRecordEntry.getFrom());
		result.setDestination(shipmentRecordEntry.getTo());
		
		result.setArrivalAtOrigin(null); // TODO
		result.setArrivalAtDestinationTimeWindow(null); // TODO

		return result;
	}
	
	private ShipmentRecord createNewShipmentRecordFromSlittedShipment(Shipment newShipment, ShipmentRecordEntry originalShipmentRecordEntry, ShipmentRecord orgiginalShipmentRecord) {
		ShipmentRecord newShipmentRecord = LogisticSolutionFactory.eINSTANCE.createShipmentRecord();
		ShipmentRecordEntry newShipmentRecordEntry = LogisticSolutionFactory.eINSTANCE.createShipmentRecordEntry();
		newShipmentRecord.getEntries().add(newShipmentRecordEntry);
		
		newShipmentRecord.setId(newShipment.getId());
		newShipmentRecord.setShipment(newShipment);
		newShipmentRecord.setRepsonsibleCEPSP(newShipment.getResponsibleCEPSP());
		
		newShipmentRecordEntry.setId(newShipment.getId() + "_0");
		newShipmentRecordEntry.setNo(0);
		newShipmentRecordEntry.setExecutingCEPSP(newShipment.getResponsibleCEPSP());
		newShipmentRecordEntry.setTour(originalShipmentRecordEntry.getTour());
		newShipmentRecordEntry.setFrom(originalShipmentRecordEntry.getFrom());
		newShipmentRecordEntry.setFromSpec(originalShipmentRecordEntry.getFromSpec());
		newShipmentRecordEntry.setTo(originalShipmentRecordEntry.getTo());
		newShipmentRecordEntry.setToSpec(originalShipmentRecordEntry.getToSpec());
		newShipmentRecordEntry.setTimeWindow(originalShipmentRecordEntry.getTimeWindow());
		
		// entry
		if(LogisticHub.class.isInstance(newShipmentRecordEntry.getFromSpec())) {
			LogisticHub hub = (LogisticHub) newShipmentRecordEntry.getFromSpec();
			LogisticHubEntry entry = LogisticSolutionFactory.eINSTANCE.createLogisticHubEntry();
			entry.setLogisticHub(hub);
			entry.setTime(null); // TODO
			newShipmentRecord.setEntry(entry);
		} else {
			PickUpEntry entry = LogisticSolutionFactory.eINSTANCE.createPickUpEntry();
			entry.setPickUpLeg(newShipmentRecordEntry);
			entry.setTime(null); // TODO
			newShipmentRecord.setEntry(entry);
		}
		
		// exit
		if(LogisticHub.class.isInstance(newShipmentRecordEntry.getToSpec())) {
			LogisticHub hub = (LogisticHub) newShipmentRecordEntry.getFromSpec();
			LogisticHubExit exit = LogisticSolutionFactory.eINSTANCE.createLogisticHubExit();
			exit.setLogisticHub(hub);
			exit.setTime(null); // TODO
			newShipmentRecord.setExit(exit);
		} else {
			DeliveryExit exit = LogisticSolutionFactory.eINSTANCE.createDeliveryExit();
			exit.setDeliveryLeg(newShipmentRecordEntry);
			exit.setTime(null); // TODO
			newShipmentRecord.setExit(exit);
		}
		
		return newShipmentRecord;
	}
}
