package cepmodel.coupling.common2common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;
import CommonFreightTransportMetamodel.localEntities.BusinessBranch;
import CommonFreightTransportMetamodel.localEntities.Household;
import CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipment;
import CommonFreightTransportMetamodel.logisticDemand.Shipment;
import CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticHub;
import CommonFreightTransportMetamodel.logisticNetwork.Packstation;
import CommonFreightTransportMetamodel.logisticNetwork.Shop;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionFactory;
import CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop;
import CommonFreightTransportMetamodel.logisticSolution.PlannedTour;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;
import CommonFreightTransportMetamodel.logisticSolution.Stop;
import CommonFreightTransportMetamodel.network.Location;
import CommonFreightTransportMetamodel.utils.MultiDayTimeWindow;
import CommonFreightTransportMetamodel.utils.ShipmentLegStartEndPoint;
import CommonFreightTransportMetamodel.utils.UtilsFactory;

// creates shipment records for logistic solutions that don't contain any
public class CreateShipmentRecordsService {

	private static class RawShipmentRecordEntry {
		Shipment shipment;
		PlannedTour plannedTour;
		PickUpDeliveryStop pickUpStop;
		PickUpDeliveryStop deliveryStop;

		public RawShipmentRecordEntry(Shipment shipment, PlannedTour plannedTour, PickUpDeliveryStop pickUpStop,
				PickUpDeliveryStop deliveryStop) {
			this.shipment = shipment;
			this.plannedTour = plannedTour;
			this.pickUpStop = pickUpStop;
			this.deliveryStop = deliveryStop;
		}
	}

	public void applyTransformation(CommonFreightTransportMetamodelRoot root) {
		assertInvariants(root);

		Map<Location, ShipmentLegStartEndPoint> location2ShipmentLegStartEndPoint = buildLocation2ShipmentLegStartEndPoint(
				root);
		Map<Shipment, List<RawShipmentRecordEntry>> shipment2RawShipmentRecords = buildRawShipmentRecords(root);

		// create shipment records
		List<ShipmentRecord> shipmentRecords = new ArrayList<>();
		for (Shipment shipment : root.getDemand().getShipments()) {
			if (!shipment2RawShipmentRecords.containsKey(shipment)) {
				assert false;
				continue;
			}

			List<RawShipmentRecordEntry> sortedLegs = shipment2RawShipmentRecords.get(shipment);

			// initialize shipment record
			ShipmentRecord shipmentRecord = LogisticSolutionFactory.eINSTANCE.createShipmentRecord();
			shipmentRecord.setId(shipment.getId() + "_record");
			shipmentRecord.setShipment(shipment);
			shipmentRecord.setRepsonsibleCEPSP(shipment.getResponsibleCEPSP());

			// add shipment record entries
			for (int entryNum = 0; entryNum < sortedLegs.size(); entryNum++) {
				RawShipmentRecordEntry sortedLeg = sortedLegs.get(entryNum);

				ShipmentRecordEntry shipmentRecordEntry = LogisticSolutionFactory.eINSTANCE.createShipmentRecordEntry();
				shipmentRecordEntry.setId(sortedLeg.shipment.getId() + "_record_" + entryNum);
				shipmentRecordEntry.setNo(entryNum);
				shipmentRecordEntry.setExecutingCEPSP(sortedLeg.plannedTour.getExecutingCEPSP());
				shipmentRecordEntry.setTour(sortedLeg.plannedTour);
				shipmentRecordEntry.setPickUpStop(sortedLeg.pickUpStop);
				shipmentRecordEntry.setDeliveryStop(sortedLeg.deliveryStop);

				// Normally fromSpec and toSpec should be determined by the location. This is
				// not the case if a custom stop location is used in the case of a pickup and
				// delivery. For cases we can directly use the producer/consumer of the shipment
				shipmentRecordEntry.setFromSpec(location2ShipmentLegStartEndPoint
						.get(CommonMetamodelUtil.getStopLocation(sortedLeg.pickUpStop.getStopLocation())));
				shipmentRecordEntry.setToSpec(location2ShipmentLegStartEndPoint
						.get(CommonMetamodelUtil.getStopLocation(sortedLeg.deliveryStop.getStopLocation())));
				if (entryNum == 0 && shipment instanceof FromInsideStudyAreaShipment fromInsideStudyAreaShipment
						&& shipmentRecordEntry.getFromSpec() == null) {
					shipmentRecordEntry.setFromSpec(fromInsideStudyAreaShipment.getProducer());
				} else if (entryNum == sortedLegs.size() - 1
						&& shipment instanceof ToInsideStudyAreaShipment toInsideStudyAreaShipment
						&& shipmentRecordEntry.getToSpec() == null) {
					shipmentRecordEntry.setToSpec(toInsideStudyAreaShipment.getReceiver());
				}

				MultiDayTimeWindow tw = UtilsFactory.eINSTANCE.createMultiDayTimeWindow();
				tw.setFrom(EcoreUtil.copy(((MultiDayTimeWindow) sortedLeg.pickUpStop.getStopTimeWindow()).getFrom()));
				tw.setTo((EcoreUtil.copy((MultiDayTimeWindow) sortedLeg.deliveryStop.getStopTimeWindow()).getTo()));
				shipmentRecordEntry.setTimeWindow(tw);

				shipmentRecord.getEntries().add(shipmentRecordEntry);
			}
			shipmentRecords.add(shipmentRecord);
		}

		root.getLogisticSolution().getShipmentRecords().addAll(shipmentRecords);
		CommonMetamodelUtil.sortDemandAndSolution(root);
	}

	private void assertInvariants(CommonFreightTransportMetamodelRoot root) {
		// TODO: add invariant that no results are contained
		assert root.getLogisticSolution().getShipmentRecords().isEmpty();
	}

	private int compareLegsByTime(RawShipmentRecordEntry l1, RawShipmentRecordEntry l2) {
		// Compare the pickUpTimeWindow of the from value and assume from is set
		MultiDayTimeWindow l1PickUpTimeWindow = (MultiDayTimeWindow) l1.pickUpStop.getStopTimeWindow();
		MultiDayTimeWindow l2PickUpTimeWindow = (MultiDayTimeWindow) l2.pickUpStop.getStopTimeWindow();
		return CommonMetamodelUtil.compareTimes(l1PickUpTimeWindow.getFrom(), l2PickUpTimeWindow.getFrom());
	}

	private Map<Location, ShipmentLegStartEndPoint> buildLocation2ShipmentLegStartEndPoint(
			CommonFreightTransportMetamodelRoot root) {
		Map<Location, ShipmentLegStartEndPoint> location2ShipmentLegStartEndPoint = new HashMap<>();
		TreeIterator<EObject> modelElementsIterator = root.eAllContents();
		while (modelElementsIterator.hasNext()) {
			EObject modelElement = modelElementsIterator.next();
			if (modelElement instanceof ShipmentLegStartEndPoint shipmentLegStartEndPoint) {
				Location location = getLocationFromShipmentLegStartEndPoint(shipmentLegStartEndPoint);
				location2ShipmentLegStartEndPoint.put(location, shipmentLegStartEndPoint);
			}
		}
		return location2ShipmentLegStartEndPoint;
	}

	private Location getLocationFromShipmentLegStartEndPoint(ShipmentLegStartEndPoint shipmentLegStartEndPoint) {
		if (shipmentLegStartEndPoint instanceof Packstation packstation) {
			return packstation.getLocation();
		} else if (shipmentLegStartEndPoint instanceof Shop shop) {
			return shop.getLocation();
		} else if (shipmentLegStartEndPoint instanceof LogisticHub logisticHub) {
			return logisticHub.getLocation();
		} else if (shipmentLegStartEndPoint instanceof BusinessBranch businessBranch) {
			return businessBranch.getLocation();
		} else if (shipmentLegStartEndPoint instanceof Household household) {
			return household.getLocation();
		} else {
			assert (false);
			return null;
		}
	}

	private Map<Shipment, List<RawShipmentRecordEntry>> buildRawShipmentRecords(
			CommonFreightTransportMetamodelRoot root) {
		Map<Shipment, Set<RawShipmentRecordEntry>> shipment2RawShipmentRecordEntries = new HashMap<>();
		List<PlannedTour> plannedTours = root.getLogisticSolution().getTours();
		for (PlannedTour plannedTour : plannedTours) {
			getRawShipmentRecordEntriesAssociatedWithTour(plannedTour).forEach(leg -> {
				shipment2RawShipmentRecordEntries.putIfAbsent(leg.shipment, new HashSet<>());
				shipment2RawShipmentRecordEntries.get(leg.shipment).add(leg);
			});
		}

		Map<Shipment, List<RawShipmentRecordEntry>> result = new HashMap<>();
		shipment2RawShipmentRecordEntries.forEach((shipment, shipmentRecordEntries) -> result.put(shipment,
				shipmentRecordEntries.stream().sorted(this::compareLegsByTime).toList()));
		return result;
	}

	private Collection<RawShipmentRecordEntry> getRawShipmentRecordEntriesAssociatedWithTour(PlannedTour plannedTour) {
		Set<Shipment> handledShipments = new HashSet<>();
		Map<Shipment, PickUpDeliveryStop> shipment2PickUpStop = new HashMap<>();
		Map<Shipment, PickUpDeliveryStop> shipment2DeliveryStop = new HashMap<>();

		for (Stop stop : plannedTour.getStops()) {
			if (stop instanceof PickUpDeliveryStop pickUpDeliveryStop) {
				handledShipments.addAll(pickUpDeliveryStop.getLoadedShipments());
				handledShipments.addAll(pickUpDeliveryStop.getUnloadedShipments());

				for (Shipment shipment : pickUpDeliveryStop.getLoadedShipments()) {
					shipment2PickUpStop.put(shipment, pickUpDeliveryStop);
				}
				for (Shipment shipment : pickUpDeliveryStop.getUnloadedShipments()) {
					shipment2DeliveryStop.put(shipment, pickUpDeliveryStop);
				}
			}
		}

		return handledShipments.stream().map(shipment -> new RawShipmentRecordEntry(shipment, plannedTour,
				shipment2PickUpStop.get(shipment), shipment2DeliveryStop.get(shipment))).toList();
	}
}
