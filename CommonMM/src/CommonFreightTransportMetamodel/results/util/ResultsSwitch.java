/**
 */
package CommonFreightTransportMetamodel.results.util;

import CommonFreightTransportMetamodel.logisticSolution.DeliveryExit;
import CommonFreightTransportMetamodel.logisticSolution.PickUpEntry;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentExit;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;
import CommonFreightTransportMetamodel.logisticSolution.Tour;

import CommonFreightTransportMetamodel.results.*;

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
 * @see CommonFreightTransportMetamodel.results.ResultsPackage
 * @generated
 */
public class ResultsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResultsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSwitch() {
		if (modelPackage == null) {
			modelPackage = ResultsPackage.eINSTANCE;
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
			case ResultsPackage.FAILED_PICKUP_ATTEMPT: {
				FailedPickupAttempt failedPickupAttempt = (FailedPickupAttempt)theEObject;
				T result = caseFailedPickupAttempt(failedPickupAttempt);
				if (result == null) result = caseShipmentRecordEntry(failedPickupAttempt);
				if (result == null) result = caseHasId_(failedPickupAttempt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.FAILED_DELIVERY_ATTEMPT: {
				FailedDeliveryAttempt failedDeliveryAttempt = (FailedDeliveryAttempt)theEObject;
				T result = caseFailedDeliveryAttempt(failedDeliveryAttempt);
				if (result == null) result = caseShipmentRecordEntry(failedDeliveryAttempt);
				if (result == null) result = caseHasId_(failedDeliveryAttempt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.INITIAL_FAILED_DELIVERY_ATTEMPT: {
				InitialFailedDeliveryAttempt initialFailedDeliveryAttempt = (InitialFailedDeliveryAttempt)theEObject;
				T result = caseInitialFailedDeliveryAttempt(initialFailedDeliveryAttempt);
				if (result == null) result = caseFailedDeliveryAttempt(initialFailedDeliveryAttempt);
				if (result == null) result = caseShipmentRecordEntry(initialFailedDeliveryAttempt);
				if (result == null) result = caseHasId_(initialFailedDeliveryAttempt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.RESULT_DELIVERY_EXIT: {
				ResultDeliveryExit resultDeliveryExit = (ResultDeliveryExit)theEObject;
				T result = caseResultDeliveryExit(resultDeliveryExit);
				if (result == null) result = caseDeliveryExit(resultDeliveryExit);
				if (result == null) result = caseShipmentExit(resultDeliveryExit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.RESULT_PICK_UP_ENTRY: {
				ResultPickUpEntry resultPickUpEntry = (ResultPickUpEntry)theEObject;
				T result = caseResultPickUpEntry(resultPickUpEntry);
				if (result == null) result = casePickUpEntry(resultPickUpEntry);
				if (result == null) result = caseShipmentEntry(resultPickUpEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.EXECUTED_TOUR: {
				ExecutedTour executedTour = (ExecutedTour)theEObject;
				T result = caseExecutedTour(executedTour);
				if (result == null) result = caseTour(executedTour);
				if (result == null) result = caseHasId_(executedTour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.TOUR_STOP_MAPPING: {
				TourStopMapping tourStopMapping = (TourStopMapping)theEObject;
				T result = caseTourStopMapping(tourStopMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultsPackage.RESULTS: {
				Results results = (Results)theEObject;
				T result = caseResults(results);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failed Pickup Attempt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failed Pickup Attempt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailedPickupAttempt(FailedPickupAttempt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failed Delivery Attempt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failed Delivery Attempt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailedDeliveryAttempt(FailedDeliveryAttempt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Failed Delivery Attempt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Failed Delivery Attempt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialFailedDeliveryAttempt(InitialFailedDeliveryAttempt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Delivery Exit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Delivery Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultDeliveryExit(ResultDeliveryExit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Pick Up Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Pick Up Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultPickUpEntry(ResultPickUpEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executed Tour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executed Tour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutedTour(ExecutedTour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tour Stop Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tour Stop Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTourStopMapping(TourStopMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResults(Results object) {
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

} //ResultsSwitch
