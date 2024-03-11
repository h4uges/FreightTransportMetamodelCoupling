package cepmodel.coupling.common2common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.ImmutableList;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;
import CommonFreightTransportMetamodel.localEntities.BusinessBranch;
import CommonFreightTransportMetamodel.logisticDemand.Demand;
import CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandFactory;
import CommonFreightTransportMetamodel.logisticDemand.Shipment;
import CommonFreightTransportMetamodel.logisticDemand.SplittedShipment;
import CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticHub;
import CommonFreightTransportMetamodel.logisticNetwork.Shop;
import CommonFreightTransportMetamodel.logisticNetwork.Vehicle;
import CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot;
import CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop;
import CommonFreightTransportMetamodel.logisticSolution.PlannedTour;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;
import CommonFreightTransportMetamodel.logisticSolution.StartEndStop;
import CommonFreightTransportMetamodel.logisticSolution.Stop;
import CommonFreightTransportMetamodel.logisticSolution.Tour;
import CommonFreightTransportMetamodel.network.Location_;
import CommonFreightTransportMetamodel.utils.Durration_;
import CommonFreightTransportMetamodel.utils.MultiDayTimeWindow;
import CommonFreightTransportMetamodel.utils.MultiDayTimestamp;
import CommonFreightTransportMetamodel.utils.SingleDayTimeWindow;
import CommonFreightTransportMetamodel.utils.SingleDayTimestamp;
import CommonFreightTransportMetamodel.utils.TimeWindow_;
import CommonFreightTransportMetamodel.utils.Timestamp_;
import CommonFreightTransportMetamodel.utils.UtilsFactory;

/*
 * assumptions:
 * - we work on a solution (that handels every shipment completly)
 * - we work on a MultiDayRepresentation
 * 
 * TODO: documentation
 */
public class MultiToSingleDayService {
	private int requestedSimulationDay = 0;

	public void setRequestedSimulationDay(int requestedSimulationDay) {
		this.requestedSimulationDay = requestedSimulationDay;
	}

	private class ModifiedShipmentRecord {
		final ShipmentRecord shipmentRecord;
		final ImmutableList<ShipmentRecordEntry> removedShipmentRecordEntries;
		final ShipmentRecordEntry latestDeltedBeforeRemaining;
		final ShipmentRecordEntry firstDeletedAfterRemaining;
		final boolean allEntriesRemoved;

		public ModifiedShipmentRecord(ShipmentRecord shipmentRecord,
				ImmutableList<ShipmentRecordEntry> removedShipmentRecordEntries,
				ShipmentRecordEntry latestDeltedBeforeRemaining, ShipmentRecordEntry firstDeletedAfterRemaining) {
			this.shipmentRecord = shipmentRecord;
			this.removedShipmentRecordEntries = removedShipmentRecordEntries;
			this.latestDeltedBeforeRemaining = latestDeltedBeforeRemaining;
			this.firstDeletedAfterRemaining = firstDeletedAfterRemaining;
			this.allEntriesRemoved = shipmentRecord.getEntries().isEmpty();
		}
	}

	public void applyTransformation(CommonFreightTransportMetamodelRoot root) {
		ImmutableList<ModifiedShipmentRecord> modifiedShipmentRecords = updateShipmentRecords(root);
		updateTours(root, modifiedShipmentRecords);
		updateExistingShipments(root, modifiedShipmentRecords);
		replaceMultiDayRepresentationBySingleDayRepresentation(root);

		// sort
		CommonMetamodelUtil.sortDemandAndSolution(root);
	}

	// ---- ShipmentRecords ----

	/*
	 * detect shipment record entries that are not in the simulated day, remove them
	 * and restore the shipment record. Also delete empty shipment records and
	 * corresponding shipments
	 */
	private ImmutableList<ModifiedShipmentRecord> updateShipmentRecords(CommonFreightTransportMetamodelRoot root) {
		ImmutableList<ModifiedShipmentRecord> modifiedShipmentRecords = removeShipmentRecordEntriesOutsideSelectedDay(
				root);
		repairModifiedShipmentRecords(modifiedShipmentRecords);
		removeEmptyShipmentRecordsAndCorrespondingShipments(root, modifiedShipmentRecords);
		return modifiedShipmentRecords;
	}

	/*
	 * Remove record entries where part of time window is not inside requested
	 * simulation day Returns a list of modified shipment records
	 */
	private ImmutableList<ModifiedShipmentRecord> removeShipmentRecordEntriesOutsideSelectedDay(
			CommonFreightTransportMetamodelRoot root) {
		List<ModifiedShipmentRecord> modifiedShipmentRecords = new ArrayList<>();
		for (ShipmentRecord shipmentRecord : root.getLogisticSolution().getShipmentRecords()) {
			List<ShipmentRecordEntry> removedShipmentRecordEntries = new ArrayList<>();
			ShipmentRecordEntry latestDeltedBeforeRemaining = null;
			ShipmentRecordEntry firstDeletedAfterRemaining = null;

			ShipmentRecordEntry lastDeletedEntry = null;
			boolean lastEntryHasBeenDeleted = false;

			Iterator<ShipmentRecordEntry> entryIterator = shipmentRecord.getEntries().iterator();
			int entryCount = 0;
			while (entryIterator.hasNext()) {
				ShipmentRecordEntry currentEntry = entryIterator.next();
				boolean entryGetsRemoved = isNotCompleteWithinRequestedSimulationDay(currentEntry);

				if (entryGetsRemoved) {
					if (!lastEntryHasBeenDeleted && entryCount > 0) {
						firstDeletedAfterRemaining = currentEntry;
					}

					removedShipmentRecordEntries.add(currentEntry);
					entryIterator.remove();

					lastDeletedEntry = currentEntry;
					lastEntryHasBeenDeleted = true;
				} else {
					if (lastEntryHasBeenDeleted) {
						latestDeltedBeforeRemaining = lastDeletedEntry;
					}

					lastEntryHasBeenDeleted = false;
				}
				entryCount++;
			}

			if (!removedShipmentRecordEntries.isEmpty()) {
				modifiedShipmentRecords.add(
						new ModifiedShipmentRecord(shipmentRecord, ImmutableList.copyOf(removedShipmentRecordEntries),
								latestDeltedBeforeRemaining, firstDeletedAfterRemaining));
			}
		}
		return ImmutableList.copyOf(modifiedShipmentRecords);
	}

	/*
	 * Update no and id of modified shipment records
	 */
	private void repairModifiedShipmentRecords(ImmutableList<ModifiedShipmentRecord> modifiedShipmentRecords) {
		for (ModifiedShipmentRecord modifiedShipmentRecord : modifiedShipmentRecords) {
			if (!modifiedShipmentRecord.allEntriesRemoved) {
				ShipmentRecord shipmentRecord = modifiedShipmentRecord.shipmentRecord;
				for (int i = 0; i < shipmentRecord.getEntries().size(); i++) {
					shipmentRecord.getEntries().get(i).setId(shipmentRecord.getShipment().getId() + "_record_" + i);
					shipmentRecord.getEntries().get(i).setNo(i);
				}
			}
		}
	}

	/*
	 * Removes shipment records and corresponding shipments where all elements have
	 * been removed.
	 */
	private void removeEmptyShipmentRecordsAndCorrespondingShipments(CommonFreightTransportMetamodelRoot root,
			ImmutableList<ModifiedShipmentRecord> modifiedShipmentRecords) {
		// remove empty shipment records and corresponding shipments
		for (ModifiedShipmentRecord modifiedShipmentRecord : modifiedShipmentRecords) {
			if (modifiedShipmentRecord.allEntriesRemoved) {
				root.getDemand().getShipments().remove(modifiedShipmentRecord.shipmentRecord.getShipment());
				root.getLogisticSolution().getShipmentRecords().remove(modifiedShipmentRecord.shipmentRecord);
			}
		}
	}

	// ---- Tours ----

	/*
	 * update tours based on the modified shipment records
	 */
	private void updateTours(CommonFreightTransportMetamodelRoot root,
			ImmutableList<ModifiedShipmentRecord> modifiedShipmentRecords) {
		removeDeletedShipmentRecordEntriesFromTours(modifiedShipmentRecords);
		removeEmptyStopsFromTours(root);
		removeEmptyTours(root);
		moveStartEndPointsOnTours(root);
	}

	/*
	 * For every deleted shipment record entry remove the shipment from the
	 * corresponding tour stop
	 */
	private void removeDeletedShipmentRecordEntriesFromTours(
			ImmutableList<ModifiedShipmentRecord> modifiedShipmentRecords) {

		for (ModifiedShipmentRecord modifiedShipmentRecord : modifiedShipmentRecords) {
			for (ShipmentRecordEntry deletedShipmentRecordEntry : modifiedShipmentRecord.removedShipmentRecordEntries) {
				Tour tour = deletedShipmentRecordEntry.getTour();
				for (Stop stop : tour.getStops()) {
					if (stop instanceof PickUpDeliveryStop pickUpDeliveryStop) {
						pickUpDeliveryStop.getLoadedShipments()
								.remove(modifiedShipmentRecord.shipmentRecord.getShipment());
						pickUpDeliveryStop.getUnloadedShipments()
								.remove(modifiedShipmentRecord.shipmentRecord.getShipment());
					}
				}
			}
		}
	}

	/*
	 * Remove PickUpDeliveryStops from tours where no shipments are picked-up or
	 * delivered and update stop id and stop number
	 */
	private void removeEmptyStopsFromTours(CommonFreightTransportMetamodelRoot root) {
		for (Tour tour : root.getLogisticSolution().getTours()) {
			Iterator<Stop> stopIterator = tour.getStops().iterator();
			int stopNum = 0;
			while (stopIterator.hasNext()) {
				Stop currentStop = stopIterator.next();
				if (currentStop instanceof PickUpDeliveryStop pickUpDeliveryStop
						&& pickUpDeliveryStop.getLoadedShipments().isEmpty()
						&& pickUpDeliveryStop.getUnloadedShipments().isEmpty()) {
					stopIterator.remove();
				} else {
					currentStop.setId(tour.getId() + "_" + stopNum);
					currentStop.setNo(stopNum);
					stopNum++;
				}
			}
		}
	}

	/*
	 * delete tours that don't contain a PickUpDeliveryStop
	 */
	private void removeEmptyTours(CommonFreightTransportMetamodelRoot root) {
		Iterator<PlannedTour> tourIterator = root.getLogisticSolution().getTours().iterator();
		while (tourIterator.hasNext()) {
			Tour currentTour = tourIterator.next();
			boolean isEmpty = currentTour.getStops().stream().noneMatch(PickUpDeliveryStop.class::isInstance);
			if (isEmpty) {
				tourIterator.remove();
			}
		}
	}

	/*
	 * heuristic: move time window into simulation day DISCUSS
	 */
	private void moveStartEndPointsOnTours(CommonFreightTransportMetamodelRoot root) {
		for (PlannedTour plannedTour : root.getLogisticSolution().getTours()) {
			for (Stop stop : plannedTour.getStops()) {
				if (stop instanceof StartEndStop startEndStop) {
					moveIntoSimulationDay(startEndStop.getStopTimeWindow());
				}
			}
		}
	}

	// ---- shipments ----

	/*
	 * DISCUSS: - newShipment: origin, destination, arrivalAtOrigin,
	 * arrivalTimeWindow TODO: documentation
	 */
	private void updateExistingShipments(CommonFreightTransportMetamodelRoot root,
			ImmutableList<ModifiedShipmentRecord> modifiedShipmentRecords) {
		Map<Shipment, SplittedShipment> shipment2ModifiedShipment = new HashMap<>();

		// create shortend shipments
		for (ModifiedShipmentRecord modifiedShipmentRecord : modifiedShipmentRecords) {
			if (!modifiedShipmentRecord.allEntriesRemoved) {
				Shipment originalShipment = modifiedShipmentRecord.shipmentRecord.getShipment();
				SplittedShipment newShipment = createShortendShipment(originalShipment, modifiedShipmentRecord);
				shipment2ModifiedShipment.put(originalShipment, newShipment);
			}
		}

		// move times of all shipments into simulation day
		for (Shipment shipment : root.getDemand().getShipments()) {
			moveIntoSimulationDay(CommonMetamodelUtil.getArrivalAtOrigin(shipment));
			moveIntoSimulationDay(CommonMetamodelUtil.getArrivalAtDestination(shipment));
		}

		// update references in tours, shipment records and demand
		for (Map.Entry<Shipment, SplittedShipment> shipment2ModifiedShipmentTupel : shipment2ModifiedShipment
				.entrySet()) {
			Shipment oldShipment = shipment2ModifiedShipmentTupel.getKey();
			SplittedShipment newShipment = shipment2ModifiedShipmentTupel.getValue();
			EMFElementReplacer.replaceElementAtTypes(root, oldShipment, newShipment,
					List.of(ShipmentRecord.class, PickUpDeliveryStop.class, Demand.class));
		}
	}

	/*
	 * TODO: documentation
	 */
	private SplittedShipment createShortendShipment(Shipment originalShipment,
			ModifiedShipmentRecord modifiedShipmentRecord) {
		SplittedShipment newShipment = LogisticDemandFactory.eINSTANCE.createSplittedShipment();

		newShipment.setId(originalShipment + "_shortend");
		newShipment.setOriginalShipmentReference(CommonMetamodelUtil.createOriginalShipmentReference(originalShipment));
		newShipment.setResponsibleCEPSP(originalShipment.getResponsibleCEPSP());
		newShipment.setSize(EcoreUtil.copy(originalShipment.getSize()));

		// origin
		// if the original origin is valid and present - we take it
		// otherwise: we take the location of the pickup stop
		Optional<Location_> origin = getOrigin(originalShipment);
		if (modifiedShipmentRecord.latestDeltedBeforeRemaining == null && origin.isPresent()) {
			newShipment.setOrigin(origin.get());
		} else {
			newShipment.setOrigin(CommonMetamodelUtil.getStopLocation(
					modifiedShipmentRecord.shipmentRecord.getEntries().getFirst().getPickUpStop().getStopLocation()));
		}

		// destination
		// if the original destination is valid and present - we take it
		// otherwise: we take the location of the delivery stop
		Optional<Location_> destination = getDestination(originalShipment);
		if (modifiedShipmentRecord.firstDeletedAfterRemaining == null && destination.isPresent()) {
			newShipment.setDestination(destination.get());
		} else {
			newShipment.setDestination(CommonMetamodelUtil.getStopLocation(
					modifiedShipmentRecord.shipmentRecord.getEntries().getLast().getDeliveryStop().getStopLocation()));
		}

		// arrivalAtOrigin
		// default: we copy the value from the original shipment
		// if latestDeltedBeforeRemaining is present: we take the arrival time from this
		// leg and add the minimum hub time
		// we then ensure that the timestamp is within the requested simulation day
		newShipment.setArrivalAtOrigin(CommonMetamodelUtil.getArrivalAtOrigin(originalShipment));
		if (modifiedShipmentRecord.latestDeltedBeforeRemaining != null) {
			MultiDayTimestamp latestPriviousArrival = ((MultiDayTimeWindow) modifiedShipmentRecord.latestDeltedBeforeRemaining
					.getDeliveryStop().getStopTimeWindow()).getTo();
			Durration_ minimumDurationAtHub = ((LogisticHub) modifiedShipmentRecord.latestDeltedBeforeRemaining
					.getToSpec()).getMinimumTranshipmentTime();

			newShipment.setArrivalAtOrigin(
					CommonMetamodelUtil.addDurationToTimestamp(latestPriviousArrival, minimumDurationAtHub));
		}
		moveIntoSimulationDay(newShipment.getArrivalAtOrigin());

		// arrivalTimeWindow
		// default: we copy the value from the original shipment
		// if firstDeletedAfterRemaining is present: we take the departure time from
		// this leg and subtract the minimum hub time
		// when then ensure that the timeWindow is within the requested simulation day
		newShipment.setArrivalAtDestinationTimeWindow(CommonMetamodelUtil.getArrivalAtDestination(originalShipment));
		if (modifiedShipmentRecord.firstDeletedAfterRemaining != null) {
			MultiDayTimestamp nextDeparture = ((MultiDayTimeWindow) modifiedShipmentRecord.firstDeletedAfterRemaining
					.getPickUpStop().getStopTimeWindow()).getFrom();
			Durration_ minimumDurationAtHub = ((LogisticHub) modifiedShipmentRecord.firstDeletedAfterRemaining
					.getFromSpec()).getMinimumTranshipmentTime();
			MultiDayTimestamp latestArrivalTime = CommonMetamodelUtil.subtractDurationFromTimestamp(nextDeparture,
					minimumDurationAtHub);

			MultiDayTimeWindow newArrivalAtDestinationTimeWindow = UtilsFactory.eINSTANCE.createMultiDayTimeWindow();
			newArrivalAtDestinationTimeWindow.setFrom(null);
			newArrivalAtDestinationTimeWindow.setFrom(latestArrivalTime);
			newShipment.setArrivalAtDestinationTimeWindow(newArrivalAtDestinationTimeWindow);
		}
		moveIntoSimulationDay(newShipment.getArrivalAtDestinationTimeWindow());

		return newShipment;
	}

	// ---- TIMES ----

	/*
	 * TODO: documentation
	 * 
	 */
	private void replaceMultiDayRepresentationBySingleDayRepresentation(CommonFreightTransportMetamodelRoot root) {
		updateTimeWindowsUsedInInfrastructure(root);

		// first pass: map every MultiDayTimeWindow
		Map<MultiDayTimeWindow, SingleDayTimeWindow> multiDayTimeWindow2SingleDayTimeWindow = new HashMap<>();
		Iterator<EObject> iterator = root.eAllContents();
		while (iterator.hasNext()) {
			EObject currentObject = iterator.next();
			if (currentObject instanceof MultiDayTimeWindow multiDayTimeWindow) {
				assert (isCompleteWithinRequestedSimulationDay(multiDayTimeWindow));
				SingleDayTimeWindow singleDayTimeWindow = mapMultiDayTimeWindowToSingleDayTimeWindow(
						multiDayTimeWindow);
				multiDayTimeWindow2SingleDayTimeWindow.put(multiDayTimeWindow, singleDayTimeWindow);
			}
		}
		EMFElementReplacer.replaceManyElements(root, multiDayTimeWindow2SingleDayTimeWindow);

		// second pass: map every remaining MultiDayTimeStamp
		Map<MultiDayTimestamp, SingleDayTimestamp> multiDayTimeStamp2SingleDayTimestamp = new HashMap<>();
		iterator = root.eAllContents();
		while (iterator.hasNext()) {
			EObject currentObject = iterator.next();
			if (currentObject instanceof MultiDayTimestamp multiDayTimestamp) {
				assert (isWithinRequestedSimulationDay(multiDayTimestamp));
				SingleDayTimestamp singleDayTimeWindow = mapMultiDayTimeStampToSingleDayTimestamp(multiDayTimestamp);
				multiDayTimeStamp2SingleDayTimestamp.put(multiDayTimestamp, singleDayTimeWindow);
			}
		}
		EMFElementReplacer.replaceManyElements(root, multiDayTimeStamp2SingleDayTimestamp);
	}

	private SingleDayTimeWindow mapMultiDayTimeWindowToSingleDayTimeWindow(MultiDayTimeWindow multiDayTimeWindow) {
		SingleDayTimeWindow result = UtilsFactory.eINSTANCE.createSingleDayTimeWindow();
		if (multiDayTimeWindow.getFrom() != null) {
			result.setFrom(mapMultiDayTimeStampToSingleDayTimestamp(multiDayTimeWindow.getFrom()));
		}
		if (multiDayTimeWindow.getTo() != null) {
			result.setTo(mapMultiDayTimeStampToSingleDayTimestamp(multiDayTimeWindow.getTo()));
		}

		return result;
	}

	private SingleDayTimestamp mapMultiDayTimeStampToSingleDayTimestamp(MultiDayTimestamp multiDayTimestamp) {
		SingleDayTimestamp result = UtilsFactory.eINSTANCE.createSingleDayTimestamp();
		result.setHour(multiDayTimestamp.getHour());
		result.setMinute(multiDayTimestamp.getMinute());
		result.setSecond(multiDayTimestamp.getSecond());
		return result;
	}

	private void updateTimeWindowsUsedInInfrastructure(CommonFreightTransportMetamodelRoot root) {
		List<BusinessBranch> allBranches = root.getPopulation().getBusinesses().stream()
				.flatMap(business -> business.getBranches().stream()).toList();
		List<Vehicle> allVehicles = root.getLogisticNetwork().getCEPSPs().stream()
				.flatMap(cepsp -> cepsp.getVehicleDepots().stream()).flatMap(depot -> depot.getVehicles().stream())
				.toList();
		List<VehicleDepot> allDepots = root.getLogisticNetwork().getCEPSPs().stream()
				.flatMap(cepsp -> cepsp.getVehicleDepots().stream()).toList();
		List<LogisticHub> allHubs = root.getLogisticNetwork().getCEPSPs().stream()
				.flatMap(cepsp -> cepsp.getLogisticHubs().stream()).toList();
		List<Shop> allShops = root.getLogisticNetwork().getPublicServicePoints().stream().filter(Shop.class::isInstance)
				.map(Shop.class::cast).toList();

		allBranches.forEach(branch -> updateTimeWindows(branch.getOpeningHours()));
		allVehicles.forEach(vehicle -> updateTimeWindows(vehicle.getOperationHours()));
		allDepots.forEach(depot -> updateTimeWindows(depot.getOperationHours()));
		allHubs.forEach(hub -> updateTimeWindows(hub.getOperationHours()));
		allShops.forEach(shop -> updateTimeWindows(shop.getOpeningHours()));
	}

	private void updateTimeWindows(Collection<TimeWindow_> timeWindows) {
		Iterator<TimeWindow_> openingHours = timeWindows.iterator();
		while (openingHours.hasNext()) {
			MultiDayTimeWindow openingHour = (MultiDayTimeWindow) openingHours.next();
			if (isPartiallyWithinRequestedSimulationDay(openingHour)) {
				moveIntoSimulationDay(openingHour);
			} else {
				openingHours.remove();
			}
		}
	}

	// ---- helper ----

	private boolean isNotCompleteWithinRequestedSimulationDay(ShipmentRecordEntry shipmentRecordEntry) {
		MultiDayTimeWindow timeWindow = (MultiDayTimeWindow) shipmentRecordEntry.getTimeWindow();
		// assumption: timeWindows of shipment records are never open
		assert (timeWindow.getFrom() != null);
		assert (timeWindow.getTo() != null);

		return (timeWindow.getFrom().getSimulationDay() != requestedSimulationDay)
				|| (timeWindow.getTo().getSimulationDay() != requestedSimulationDay);
	}

	private boolean isCompleteWithinRequestedSimulationDay(MultiDayTimeWindow timeWindow) {
		boolean isLeftOpen = timeWindow.getFrom() == null;
		boolean isRightOpen = timeWindow.getTo() == null;

		if (isLeftOpen && isRightOpen) {
			return true;
		} else if (isLeftOpen && !isRightOpen) {
			return timeWindow.getTo().getSimulationDay() == requestedSimulationDay;
		} else if (!isLeftOpen && isRightOpen) {
			return timeWindow.getFrom().getSimulationDay() == requestedSimulationDay;
		} else {
			return timeWindow.getFrom().getSimulationDay() == requestedSimulationDay
					&& timeWindow.getTo().getSimulationDay() == requestedSimulationDay;
		}
	}

	private boolean isPartiallyWithinRequestedSimulationDay(MultiDayTimeWindow timeWindow) {
		boolean isLeftOpen = timeWindow.getFrom() == null;
		boolean isRightOpen = timeWindow.getTo() == null;

		if (isLeftOpen && isRightOpen) {
			return true;
		} else if (isLeftOpen && !isRightOpen) {
			return timeWindow.getTo().getSimulationDay() >= requestedSimulationDay;
		} else if (!isLeftOpen && isRightOpen) {
			return timeWindow.getFrom().getSimulationDay() <= requestedSimulationDay;
		} else {
			return timeWindow.getFrom().getSimulationDay() <= requestedSimulationDay
					&& timeWindow.getTo().getSimulationDay() >= requestedSimulationDay;
		}
	}

	private boolean isWithinRequestedSimulationDay(MultiDayTimestamp multiDayTimestamp) {
		return multiDayTimestamp.getSimulationDay() == requestedSimulationDay;
	}

	private Optional<Location_> getOrigin(Shipment shipment) {
		if (shipment instanceof FromInsideStudyAreaShipmentBase fromInsideStudyAreaShipment) {
			return Optional.of(fromInsideStudyAreaShipment.getOrigin());
		}
		return Optional.empty();
	}

	private Optional<Location_> getDestination(Shipment shipment) {
		if (shipment instanceof ToInsideStudyAreaShipment toInsideStudyAreaShipment) {
			return Optional.of(toInsideStudyAreaShipment.getDestination());
		}
		return Optional.empty();
	}

	private void moveIntoSimulationDay(Timestamp_ timestamp) {
		MultiDayTimestamp multiDayTimestamp = (MultiDayTimestamp) timestamp;

		if (multiDayTimestamp.getSimulationDay() < requestedSimulationDay) {
			multiDayTimestamp.setSimulationDay(requestedSimulationDay);
			multiDayTimestamp.setHour(0);
			multiDayTimestamp.setMinute(0);
			multiDayTimestamp.setSecond(0);
		}
		if (multiDayTimestamp.getSimulationDay() > requestedSimulationDay) {
			multiDayTimestamp.setSimulationDay(requestedSimulationDay);
			multiDayTimestamp.setHour(23);
			multiDayTimestamp.setMinute(59);
			multiDayTimestamp.setSecond(59);
		}
	}

	private void moveIntoSimulationDay(TimeWindow_ timeWindow) {
		MultiDayTimeWindow multiDayTimeWindow = (MultiDayTimeWindow) timeWindow;

		if (multiDayTimeWindow.getFrom() != null) {
			moveIntoSimulationDay(multiDayTimeWindow.getFrom());
		}
		if (multiDayTimeWindow.getTo() != null) {
			moveIntoSimulationDay(multiDayTimeWindow.getTo());
		}
	}
}
