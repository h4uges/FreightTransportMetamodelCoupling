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
import CommonFreightTransportMetamodel.network.Location_;
import CommonFreightTransportMetamodel.utils.MultiDayTimeWindow;
import CommonFreightTransportMetamodel.utils.ShipmentLegStartEndPoint;
import CommonFreightTransportMetamodel.utils.UtilsFactory;

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
		// build location2ShipmentLegStartEndPoint
		Map<Location_, ShipmentLegStartEndPoint> location2ShipmentLegStartEndPoint = new HashMap<>();
		TreeIterator<EObject> modelElementsIterator = root.eAllContents();
		while (modelElementsIterator.hasNext()) {
			EObject modelElement = modelElementsIterator.next();
			if (modelElement instanceof ShipmentLegStartEndPoint shipmentLegStartEndPoint) {
				Location_ location = getLocationFromShipmentLegStartEndPoint(shipmentLegStartEndPoint);
				location2ShipmentLegStartEndPoint.put(location, shipmentLegStartEndPoint);
			}
		}

		// build shipment2RawShipmentRecords
		Map<Shipment, Set<RawShipmentRecordEntry>> shipment2RawShipmentRecords = new HashMap<>();
		List<PlannedTour> plannedTours = root.getLogisticSolution().getTours();
		for (PlannedTour plannedTour : plannedTours) {
			getTourLegs(plannedTour).forEach(leg -> {
				shipment2RawShipmentRecords.putIfAbsent(leg.shipment, new HashSet<>());
				shipment2RawShipmentRecords.get(leg.shipment).add(leg);
			});
		}

		// create shipment records
		List<ShipmentRecord> shipmentRecords = new ArrayList<>();
		for (Shipment shipment : root.getDemand().getShipments()) {
			if (!shipment2RawShipmentRecords.containsKey(shipment)) {
				assert false;
				continue;
			}

			Set<RawShipmentRecordEntry> unsortedLegs = shipment2RawShipmentRecords.get(shipment);
			List<RawShipmentRecordEntry> sortedLegs = unsortedLegs.stream().sorted(this::compareLegsByTime).toList();

			ShipmentRecord shipmentRecord = LogisticSolutionFactory.eINSTANCE.createShipmentRecord();
			shipmentRecord.setId(shipment.getId() + "_record");
			shipmentRecord.setShipment(shipment);
			shipmentRecord.setRepsonsibleCEPSP(shipment.getResponsibleCEPSP());

			for (int entryNum = 0; entryNum < sortedLegs.size(); entryNum++) {
				RawShipmentRecordEntry sortedLeg = sortedLegs.get(entryNum);

				ShipmentRecordEntry shipmentRecordEntry = LogisticSolutionFactory.eINSTANCE.createShipmentRecordEntry();
				shipmentRecordEntry.setId(sortedLeg.shipment.getId() + "_record_" + entryNum);
				shipmentRecordEntry.setNo(entryNum);
				shipmentRecordEntry.setExecutingCEPSP(sortedLeg.plannedTour.getExecutingCEPSP());
				shipmentRecordEntry.setTour(sortedLeg.plannedTour);
				shipmentRecordEntry.setPickUpStop(sortedLeg.pickUpStop);
				shipmentRecordEntry.setDeliveryStop(sortedLeg.deliveryStop);

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

		// sort
		CommonMetamodelUtil.sortDemandAndSolution(root);
	}

	private Location_ getLocationFromShipmentLegStartEndPoint(ShipmentLegStartEndPoint shipmentLegStartEndPoint) {
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

	private int compareLegsByTime(RawShipmentRecordEntry l1, RawShipmentRecordEntry l2) {
		// Compare the pickUpTimeWindow of the from value and assume from is set
		// TODO: assumption: only multi day time window
		MultiDayTimeWindow l1PickUpTimeWindow = (MultiDayTimeWindow) l1.pickUpStop.getStopTimeWindow();
		MultiDayTimeWindow l2PickUpTimeWindow = (MultiDayTimeWindow) l2.pickUpStop.getStopTimeWindow();
		return CommonMetamodelUtil.compareTimes(l1PickUpTimeWindow.getFrom(), l2PickUpTimeWindow.getFrom());
	}

	private Collection<RawShipmentRecordEntry> getTourLegs(PlannedTour plannedTour) {
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
