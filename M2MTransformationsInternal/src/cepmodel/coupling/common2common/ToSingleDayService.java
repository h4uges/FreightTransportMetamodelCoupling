package cepmodel.coupling.common2common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.javatuples.Pair;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticHub;
import CommonFreightTransportMetamodel.logisticSolution.DeliveryExit;
import CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry;
import CommonFreightTransportMetamodel.logisticSolution.LogisticHubExit;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionFactory;
import CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop;
import CommonFreightTransportMetamodel.logisticSolution.PickUpEntry;
import CommonFreightTransportMetamodel.logisticSolution.PlannedTour;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;
import CommonFreightTransportMetamodel.logisticSolution.Stop;
import CommonFreightTransportMetamodel.logisticSolution.Tour;
import CommonFreightTransportMetamodel.utils.MultiDayTimeWindow;

public class ToSingleDayService {
	private int requestedSimulationDay = 0;

	public void setRequestedSimulationDay(int requestedSimulationDay) {
		this.requestedSimulationDay = requestedSimulationDay;
	}

	public void applyTransformation(CommonFreightTransportMetamodelRoot root) {
		// currently: case solution (result)

		// step 1: remove record entries where part of time-window is not inside
		// selected day
		List<Pair<ShipmentRecordEntry, ShipmentRecord>> removedShipmentRecordEntries = removeShipmentRecordEntriesOutSideSelectedDay(
				root);
		// step 2: remove empty shipment records
		List<ShipmentRecord> removedShipmentRecords = removeEmptyShipmentRecords(root);
		// step 3: restore shipment records (entry, exit, entry-numbers)
		restoreShipmentRecords(root);
		// step 4: remove shipment from tours where corresponding entry has been deleted
		removeDeletedShipmentRecordsFromTours(removedShipmentRecordEntries);
		// step 5: remove empty stops from tour and restore stop numbers
		removeEmptyStopsFromTours(root);
		// step 6: delete empty tours
		deleteEmptyTours(root);
		// step 7: move start & endpoints on tour
		// TODO: add implementation

		// step 8: remove shipments with deleted shipment record from demand
		root.getDemand().getShipments().removeAll(removedShipmentRecords.stream()
				.map(removedShipmentRecord -> removedShipmentRecord.getShipment()).toList());
		// step 9: update existing shipments (...)
		// TODO: add implementation

		// step 10: update times on whole model
		// TODO: add implementation
	}

	private List<Pair<ShipmentRecordEntry, ShipmentRecord>> removeShipmentRecordEntriesOutSideSelectedDay(
			CommonFreightTransportMetamodelRoot root) {
		List<Pair<ShipmentRecordEntry, ShipmentRecord>> removedShipmentRecordEntries = new ArrayList<Pair<ShipmentRecordEntry, ShipmentRecord>>();

		for (ShipmentRecord shipmentRecord : root.getLogisticSolution().getShipmentRecords()) {
			Iterator<ShipmentRecordEntry> iterator = shipmentRecord.getEntries().iterator();
			while (iterator.hasNext()) {
				ShipmentRecordEntry shipmentRecordEntry = iterator.next();
				boolean entryGetsRemoved = isNotCompleteWithinRequestedSimulationDay(shipmentRecordEntry);
				if (entryGetsRemoved) {
					iterator.remove();
					removedShipmentRecordEntries.add(Pair.with(shipmentRecordEntry, shipmentRecord));
				}
			}
		}
		return removedShipmentRecordEntries;
	}

	private List<ShipmentRecord> removeEmptyShipmentRecords(CommonFreightTransportMetamodelRoot root) {
		List<ShipmentRecord> removedShipmentRecords = new ArrayList<ShipmentRecord>();

		Iterator<ShipmentRecord> iterator = root.getLogisticSolution().getShipmentRecords().iterator();
		while (iterator.hasNext()) {
			ShipmentRecord shipmentRecord = iterator.next();

			if (shipmentRecord.getEntries().isEmpty()) {
				iterator.remove();
				removedShipmentRecords.add(shipmentRecord);
			}
		}
		return removedShipmentRecords;
	}

	private void restoreShipmentRecords(CommonFreightTransportMetamodelRoot root) {
		for (ShipmentRecord shipmentRecord : root.getLogisticSolution().getShipmentRecords()) {
			// restore entry numbers
			for (int i = 0; i < shipmentRecord.getEntries().size(); i++) {
				// TODO: also change id's?
				shipmentRecord.getEntries().get(i).setNo(i);
			}

			// restore entry
			ShipmentRecordEntry newEntry = shipmentRecord.getEntries().getFirst();
			if (LogisticHub.class.isInstance(newEntry.getFromSpec())) {
				LogisticHubEntry newLogisticHubEntry = LogisticSolutionFactory.eINSTANCE.createLogisticHubEntry();
				newLogisticHubEntry.setLogisticHub((LogisticHub) newEntry.getFromSpec());
				newLogisticHubEntry.setTime(null); // TODO
				shipmentRecord.setEntry(newLogisticHubEntry);
			} else {
				PickUpEntry newPickUpEntry = LogisticSolutionFactory.eINSTANCE.createPickUpEntry();
				newPickUpEntry.setPickUpLeg(newEntry);
				newPickUpEntry.setTime(null); // TODO
				shipmentRecord.setEntry(newPickUpEntry);
			}

			// restore exit
			ShipmentRecordEntry newExit = shipmentRecord.getEntries().getLast();
			if (LogisticHub.class.isInstance(newEntry.getToSpec())) {
				LogisticHubExit newLogisticHubExit = LogisticSolutionFactory.eINSTANCE.createLogisticHubExit();
				newLogisticHubExit.setLogisticHub((LogisticHub) newEntry.getToSpec());
				newLogisticHubExit.setTime(null); // TODO
				shipmentRecord.setExit(newLogisticHubExit);
			} else {
				DeliveryExit newDeliveryExit = LogisticSolutionFactory.eINSTANCE.createDeliveryExit();
				newDeliveryExit.setDeliveryLeg(newExit);
				newDeliveryExit.setTime(null); // TODO
				shipmentRecord.setExit(newDeliveryExit);
			}
		}
	}

	private void removeDeletedShipmentRecordsFromTours(
			List<Pair<ShipmentRecordEntry, ShipmentRecord>> removedShipmentRecordEntries) {
		for (Pair<ShipmentRecordEntry, ShipmentRecord> deletedShipmentRecordEntryPair : removedShipmentRecordEntries) {
			ShipmentRecordEntry deletedShipmentRecordEntry = deletedShipmentRecordEntryPair.getValue0();
			ShipmentRecord deletedShipmentRecordEntryRecord = deletedShipmentRecordEntryPair.getValue1();

			Tour tour = deletedShipmentRecordEntry.getTour();
			for (Stop stop : tour.getStops()) {
				if (stop instanceof PickUpDeliveryStop) {
					PickUpDeliveryStop pickUpDeliveryStop = (PickUpDeliveryStop) stop;
					pickUpDeliveryStop.getLoadedShipments().remove(deletedShipmentRecordEntryRecord.getShipment());
					pickUpDeliveryStop.getUnloadedShipments().remove(deletedShipmentRecordEntryRecord.getShipment());
				}
			}
		}
	}

	private void removeEmptyStopsFromTours(CommonFreightTransportMetamodelRoot root) {
		for (Tour tour : root.getLogisticSolution().getTours()) {
			Iterator<Stop> stopIterator = tour.getStops().iterator();
			int stopNum = 0;
			while (stopIterator.hasNext()) {
				Stop currentStop = stopIterator.next();
				if (currentStop instanceof PickUpDeliveryStop) {
					PickUpDeliveryStop pickUpDeliveryStop = (PickUpDeliveryStop) currentStop;
					boolean stopCanBeRemoved = pickUpDeliveryStop.getLoadedShipments().isEmpty()
							&& pickUpDeliveryStop.getUnloadedShipments().isEmpty();
					if (stopCanBeRemoved) {
						stopIterator.remove();
					} else {
						// TODO: restoreIds?
						currentStop.setNo(stopNum);
						stopNum++;
					}
				}
			}
		}
	}

	private void deleteEmptyTours(CommonFreightTransportMetamodelRoot root) {
		Iterator<PlannedTour> tourIterator = root.getLogisticSolution().getTours().iterator();
		while (tourIterator.hasNext()) {
			Tour currentTour = tourIterator.next();
			boolean isEmpty = currentTour.getStops().stream()
					.anyMatch(stop -> PickUpDeliveryStop.class.isInstance(stop));
			if (isEmpty) {
				tourIterator.remove();
			}
		}
	}

	private boolean isNotCompleteWithinRequestedSimulationDay(ShipmentRecordEntry shipmentRecordEntry) {
		MultiDayTimeWindow timeWindow = (MultiDayTimeWindow) shipmentRecordEntry.getTimeWindow();

		return (timeWindow.getFrom() != null && timeWindow.getFrom().getSimulationDay() != requestedSimulationDay)
				|| (timeWindow.getTo() != null && timeWindow.getTo().getSimulationDay() != requestedSimulationDay);
	}

}
