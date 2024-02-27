/**
 */
package MATSimFreightMetamodel.freightContrib.tour.util;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.freightContrib.tour.*;

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
 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage
 * @generated
 */
public class TourSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TourPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TourSwitch() {
		if (modelPackage == null) {
			modelPackage = TourPackage.eINSTANCE;
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
			case TourPackage.TOUR: {
				Tour tour = (Tour)theEObject;
				T result = caseTour(tour);
				if (result == null) result = caseEntity(tour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TourPackage.TOUR_ELEMENT: {
				TourElement tourElement = (TourElement)theEObject;
				T result = caseTourElement(tourElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TourPackage.LEG: {
				Leg leg = (Leg)theEObject;
				T result = caseLeg(leg);
				if (result == null) result = caseTourElement(leg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TourPackage.TOUR_ACTIVITY: {
				TourActivity tourActivity = (TourActivity)theEObject;
				T result = caseTourActivity(tourActivity);
				if (result == null) result = caseTourElement(tourActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TourPackage.SERVICE_ACTIVITY: {
				ServiceActivity serviceActivity = (ServiceActivity)theEObject;
				T result = caseServiceActivity(serviceActivity);
				if (result == null) result = caseTourActivity(serviceActivity);
				if (result == null) result = caseTourElement(serviceActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TourPackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = caseTourActivity(start);
				if (result == null) result = caseTourElement(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TourPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseTourActivity(end);
				if (result == null) result = caseTourElement(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TourPackage.SHIPMENT_BASED_ACTIVITY: {
				ShipmentBasedActivity shipmentBasedActivity = (ShipmentBasedActivity)theEObject;
				T result = caseShipmentBasedActivity(shipmentBasedActivity);
				if (result == null) result = caseTourActivity(shipmentBasedActivity);
				if (result == null) result = caseTourElement(shipmentBasedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TourPackage.PICKUP: {
				Pickup pickup = (Pickup)theEObject;
				T result = casePickup(pickup);
				if (result == null) result = caseShipmentBasedActivity(pickup);
				if (result == null) result = caseTourActivity(pickup);
				if (result == null) result = caseTourElement(pickup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TourPackage.DELIVERY: {
				Delivery delivery = (Delivery)theEObject;
				T result = caseDelivery(delivery);
				if (result == null) result = caseShipmentBasedActivity(delivery);
				if (result == null) result = caseTourActivity(delivery);
				if (result == null) result = caseTourElement(delivery);
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
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTourElement(TourElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeg(Leg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTourActivity(TourActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceActivity(ServiceActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipment Based Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipment Based Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipmentBasedActivity(ShipmentBasedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pickup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pickup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePickup(Pickup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelivery(Delivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
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

} //TourSwitch
