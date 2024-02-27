/**
 */
package CommonFreightTransportMetamodel.logisticSolution.util;

import CommonFreightTransportMetamodel.logisticSolution.*;

import CommonFreightTransportMetamodel.utils.HasId_;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage
 * @generated
 */
public class LogisticSolutionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogisticSolutionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticSolutionSwitch() {
		if (modelPackage == null) {
			modelPackage = LogisticSolutionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogisticSolutionPackage.TOUR: {
				Tour tour = (Tour)theEObject;
				T result = caseTour(tour);
				if (result == null) result = caseHasId_(tour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.STOP: {
				Stop stop = (Stop)theEObject;
				T result = caseStop(stop);
				if (result == null) result = caseHasId_(stop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.SHIPMENT_RECORD: {
				ShipmentRecord shipmentRecord = (ShipmentRecord)theEObject;
				T result = caseShipmentRecord(shipmentRecord);
				if (result == null) result = caseHasId_(shipmentRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.START_END_STOP: {
				StartEndStop startEndStop = (StartEndStop)theEObject;
				T result = caseStartEndStop(startEndStop);
				if (result == null) result = caseStop(startEndStop);
				if (result == null) result = caseHasId_(startEndStop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.PICK_UP_DELIVERY_STOP: {
				PickUpDeliveryStop pickUpDeliveryStop = (PickUpDeliveryStop)theEObject;
				T result = casePickUpDeliveryStop(pickUpDeliveryStop);
				if (result == null) result = caseStop(pickUpDeliveryStop);
				if (result == null) result = caseHasId_(pickUpDeliveryStop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.LOGISTIC_FACILITY_STOP: {
				LogisticFacilityStop logisticFacilityStop = (LogisticFacilityStop)theEObject;
				T result = caseLogisticFacilityStop(logisticFacilityStop);
				if (result == null) result = casePickUpDeliveryStop(logisticFacilityStop);
				if (result == null) result = caseStop(logisticFacilityStop);
				if (result == null) result = caseHasId_(logisticFacilityStop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.NORMAL_STOP: {
				NormalStop normalStop = (NormalStop)theEObject;
				T result = caseNormalStop(normalStop);
				if (result == null) result = casePickUpDeliveryStop(normalStop);
				if (result == null) result = caseStop(normalStop);
				if (result == null) result = caseHasId_(normalStop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY: {
				ShipmentRecordEntry shipmentRecordEntry = (ShipmentRecordEntry)theEObject;
				T result = caseShipmentRecordEntry(shipmentRecordEntry);
				if (result == null) result = caseHasId_(shipmentRecordEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.SHIPMENT_ENTRY: {
				ShipmentEntry shipmentEntry = (ShipmentEntry)theEObject;
				T result = caseShipmentEntry(shipmentEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.SHIPMENT_EXIT: {
				ShipmentExit shipmentExit = (ShipmentExit)theEObject;
				T result = caseShipmentExit(shipmentExit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.LOGISTIC_HUB_ENTRY: {
				LogisticHubEntry logisticHubEntry = (LogisticHubEntry)theEObject;
				T result = caseLogisticHubEntry(logisticHubEntry);
				if (result == null) result = caseShipmentEntry(logisticHubEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.PICK_UP_ENTRY: {
				PickUpEntry pickUpEntry = (PickUpEntry)theEObject;
				T result = casePickUpEntry(pickUpEntry);
				if (result == null) result = caseShipmentEntry(pickUpEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.LOGISTIC_HUB_EXIT: {
				LogisticHubExit logisticHubExit = (LogisticHubExit)theEObject;
				T result = caseLogisticHubExit(logisticHubExit);
				if (result == null) result = caseShipmentExit(logisticHubExit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.DELIVERY_EXIT: {
				DeliveryExit deliveryExit = (DeliveryExit)theEObject;
				T result = caseDeliveryExit(deliveryExit);
				if (result == null) result = caseShipmentExit(deliveryExit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.PLANNED_TOUR: {
				PlannedTour plannedTour = (PlannedTour)theEObject;
				T result = casePlannedTour(plannedTour);
				if (result == null) result = caseTour(plannedTour);
				if (result == null) result = caseHasId_(plannedTour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.STOP_LOCATION: {
				StopLocation stopLocation = (StopLocation)theEObject;
				T result = caseStopLocation(stopLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.REFERENCE_STOP_LOCATION: {
				ReferenceStopLocation referenceStopLocation = (ReferenceStopLocation)theEObject;
				T result = caseReferenceStopLocation(referenceStopLocation);
				if (result == null) result = caseStopLocation(referenceStopLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.CUSTOM_STOP_LOCATION: {
				CustomStopLocation customStopLocation = (CustomStopLocation)theEObject;
				T result = caseCustomStopLocation(customStopLocation);
				if (result == null) result = caseStopLocation(customStopLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticSolutionPackage.LOGISTIC_SOLUTION: {
				LogisticSolution logisticSolution = (LogisticSolution)theEObject;
				T result = caseLogisticSolution(logisticSolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTour(Tour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStop(Stop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipment Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipment Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipmentRecord(ShipmentRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start End Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start End Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEndStop(StartEndStop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pick Up Delivery Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pick Up Delivery Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePickUpDeliveryStop(PickUpDeliveryStop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Facility Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Facility Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticFacilityStop(LogisticFacilityStop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalStop(NormalStop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipment Record Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipment Record Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipmentRecordEntry(ShipmentRecordEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipment Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipment Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipmentEntry(ShipmentEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipment Exit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipment Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipmentExit(ShipmentExit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Hub Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Hub Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticHubEntry(LogisticHubEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pick Up Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pick Up Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePickUpEntry(PickUpEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Hub Exit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Hub Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticHubExit(LogisticHubExit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery Exit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeliveryExit(DeliveryExit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Tour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Tour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedTour(PlannedTour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopLocation(StopLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Stop Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Stop Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceStopLocation(ReferenceStopLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Stop Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Stop Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomStopLocation(CustomStopLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticSolution(LogisticSolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Id </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Id </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasId_(HasId_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LogisticSolutionSwitch
