package cepmodel.coupling.common2common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;
import CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase;
import CommonFreightTransportMetamodel.logisticDemand.FromOutsideStudyAreaShipment;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandFactory;
import CommonFreightTransportMetamodel.logisticDemand.OriginalShipmentReference;
import CommonFreightTransportMetamodel.logisticDemand.Shipment;
import CommonFreightTransportMetamodel.logisticDemand.SplittedShipment;
import CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase;
import CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment;
import CommonFreightTransportMetamodel.logisticSolution.CustomStopLocation;
import CommonFreightTransportMetamodel.logisticSolution.ReferenceStopLocation;
import CommonFreightTransportMetamodel.logisticSolution.StopLocation;
import CommonFreightTransportMetamodel.network.Location;
import CommonFreightTransportMetamodel.utils.Durration;
import CommonFreightTransportMetamodel.utils.HasId;
import CommonFreightTransportMetamodel.utils.MultiDayTimestamp;
import CommonFreightTransportMetamodel.utils.TimeWindow;
import CommonFreightTransportMetamodel.utils.Timestamp;
import CommonFreightTransportMetamodel.utils.UtilsFactory;

public class CommonMetamodelUtil {

	private CommonMetamodelUtil() {
	}

	public static MultiDayTimestamp createMultiDayTimeStamp(int simulationDay, int hour, int minute, int second) {
		MultiDayTimestamp result = UtilsFactory.eINSTANCE.createMultiDayTimestamp();
		result.setSimulationDay(simulationDay);
		result.setHour(hour);
		result.setMinute(minute);
		result.setSecond(second);
		return result;
	}

	public static int compareTimes(MultiDayTimestamp firstTime, MultiDayTimestamp secondTime) {
		return Integer.compare(getSecondRepresentation(firstTime), getSecondRepresentation(secondTime));
	}

	private static int getSecondRepresentation(MultiDayTimestamp time) {
		return time.getSimulationDay() * 24 * 60 * 60 + time.getHour() * 60 * 60 + time.getMinute() * 60
				+ time.getSecond();
	}

	private static int getSecondRepresentation(Durration duration) {
		return duration.getDays() * 24 * 60 * 60 + duration.getHours() * 60 * 60 + duration.getMinutes() * 60
				+ duration.getSeconds();
	}

	public static MultiDayTimestamp addDurationToTimestamp(MultiDayTimestamp timestamp, Durration duration) {
		int timestampSeconds = getSecondRepresentation(timestamp);
		int durationSeconds = getSecondRepresentation(duration);

		return createMultiDayTimestampFromSeconds(timestampSeconds + durationSeconds);
	}

	public static MultiDayTimestamp subtractDurationFromTimestamp(MultiDayTimestamp timestamp, Durration duration) {
		int timestampSeconds = getSecondRepresentation(timestamp);
		int durationSeconds = getSecondRepresentation(duration);

		return createMultiDayTimestampFromSeconds(timestampSeconds - durationSeconds);
	}

	private static MultiDayTimestamp createMultiDayTimestampFromSeconds(int seconds) {
		MultiDayTimestamp result = UtilsFactory.eINSTANCE.createMultiDayTimestamp();

		result.setSimulationDay(seconds / (24 * 3600));
		result.setHour((seconds % (24 * 3600)) / 3600);
		result.setMinute((seconds % 3600) / 60);
		result.setSecond(seconds % 60);

		return result;
	}

	public static Location getStopLocation(StopLocation stopLocation) {
		if (stopLocation instanceof CustomStopLocation customStopLocation) {
			return customStopLocation.getLocation();
		}
		if (stopLocation instanceof ReferenceStopLocation referenceStopLocation) {
			return referenceStopLocation.getLocation();
		}
		assert false;
		return null;
	}

	public static Timestamp getArrivalAtOrigin(Shipment shipment) {
		if (shipment instanceof FromInsideStudyAreaShipmentBase fromInsideStudyAreaShipmentBase) {
			return fromInsideStudyAreaShipmentBase.getArrivalAtOrigin();
		}
		if (shipment instanceof FromOutsideStudyAreaShipment fromOutsideStudyAreaShipment) {
			return fromOutsideStudyAreaShipment.getArrivalAtOriginDepot();
		}
		assert (false);
		return null;
	}

	public static TimeWindow getArrivalAtDestination(Shipment shipment) {
		if (shipment instanceof ToInsideStudyAreaShipmentBase toInsideStudyAreaShipmentBase) {
			return toInsideStudyAreaShipmentBase.getArrivalAtDestinationTimeWindow();
		}
		if (shipment instanceof ToOutsideStudyAreaShipment toOutsideStudyAreaShipment) {
			return toOutsideStudyAreaShipment.getArrivalAtDepotTimeWindow();
		}
		assert (false);
		return null;
	}

	public static OriginalShipmentReference createOriginalShipmentReference(Shipment originalShipment) {
		if (originalShipment instanceof SplittedShipment splittedShipment) {
			OriginalShipmentReference result = LogisticDemandFactory.eINSTANCE.createOriginalShipmentReference();
			result.setOriginalID(originalShipment.getId());
			result.setOriginalShipmentReference(EcoreUtil.copy(splittedShipment.getOriginalShipmentReference()));
			return result;
		}

		OriginalShipmentReference result = LogisticDemandFactory.eINSTANCE.createOriginalShipmentReference();
		result.setOriginalID(originalShipment.getId());
		return result;
	}

	public static void sortDemandAndSolution(CommonFreightTransportMetamodelRoot root) {
		sortEList(root.getLogisticSolution().getShipmentRecords(), Comparator.comparing(HasId::getId));
		sortEList(root.getLogisticSolution().getTours(), Comparator.comparing(HasId::getId));
		sortEList(root.getDemand().getShipments(), Comparator.comparing(HasId::getId));
	}

	private static <T> void sortEList(EList<T> eList, Comparator<? super T> comparator) {
		List<T> javaList = new ArrayList<>(eList);
		Collections.sort(javaList, comparator);
		eList.removeIf(x -> true);
		eList.addAll(javaList);
	}
}
