/**
 */
package MATSimFreightMetamodel.freightContrib.events.util;

import MATSimFreightMetamodel.freightContrib.events.*;

import MATSimFreightMetamodel.matsim.core.Event;

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
 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage
 * @generated
 */
public class EventsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EventsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsSwitch() {
		if (modelPackage == null) {
			modelPackage = EventsPackage.eINSTANCE;
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
			case EventsPackage.CARRIER_EVENT: {
				CarrierEvent carrierEvent = (CarrierEvent)theEObject;
				T result = caseCarrierEvent(carrierEvent);
				if (result == null) result = caseEvent(carrierEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CARRIER_SHIPMENT_DELIVERY_START_EVENT: {
				CarrierShipmentDeliveryStartEvent carrierShipmentDeliveryStartEvent = (CarrierShipmentDeliveryStartEvent)theEObject;
				T result = caseCarrierShipmentDeliveryStartEvent(carrierShipmentDeliveryStartEvent);
				if (result == null) result = caseCarrierEvent(carrierShipmentDeliveryStartEvent);
				if (result == null) result = caseEvent(carrierShipmentDeliveryStartEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CARRIER_SHIPMENT_DELIVERY_END_EVENT: {
				CarrierShipmentDeliveryEndEvent carrierShipmentDeliveryEndEvent = (CarrierShipmentDeliveryEndEvent)theEObject;
				T result = caseCarrierShipmentDeliveryEndEvent(carrierShipmentDeliveryEndEvent);
				if (result == null) result = caseCarrierEvent(carrierShipmentDeliveryEndEvent);
				if (result == null) result = caseEvent(carrierShipmentDeliveryEndEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CARRIER_SERVIE_START_EVENT: {
				CarrierServieStartEvent carrierServieStartEvent = (CarrierServieStartEvent)theEObject;
				T result = caseCarrierServieStartEvent(carrierServieStartEvent);
				if (result == null) result = caseCarrierEvent(carrierServieStartEvent);
				if (result == null) result = caseEvent(carrierServieStartEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CARRIER_SERVICE_END_EVENT: {
				CarrierServiceEndEvent carrierServiceEndEvent = (CarrierServiceEndEvent)theEObject;
				T result = caseCarrierServiceEndEvent(carrierServiceEndEvent);
				if (result == null) result = caseCarrierEvent(carrierServiceEndEvent);
				if (result == null) result = caseEvent(carrierServiceEndEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CARRIER_TOUR_START_EVENT: {
				CarrierTourStartEvent carrierTourStartEvent = (CarrierTourStartEvent)theEObject;
				T result = caseCarrierTourStartEvent(carrierTourStartEvent);
				if (result == null) result = caseCarrierEvent(carrierTourStartEvent);
				if (result == null) result = caseEvent(carrierTourStartEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CARRIER_TOUR_END_EVENT: {
				CarrierTourEndEvent carrierTourEndEvent = (CarrierTourEndEvent)theEObject;
				T result = caseCarrierTourEndEvent(carrierTourEndEvent);
				if (result == null) result = caseCarrierEvent(carrierTourEndEvent);
				if (result == null) result = caseEvent(carrierTourEndEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT: {
				CarrierShipmentPickupStartEvent carrierShipmentPickupStartEvent = (CarrierShipmentPickupStartEvent)theEObject;
				T result = caseCarrierShipmentPickupStartEvent(carrierShipmentPickupStartEvent);
				if (result == null) result = caseCarrierEvent(carrierShipmentPickupStartEvent);
				if (result == null) result = caseEvent(carrierShipmentPickupStartEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_END_EVENT: {
				CarrierShipmentPickupEndEvent carrierShipmentPickupEndEvent = (CarrierShipmentPickupEndEvent)theEObject;
				T result = caseCarrierShipmentPickupEndEvent(carrierShipmentPickupEndEvent);
				if (result == null) result = caseCarrierEvent(carrierShipmentPickupEndEvent);
				if (result == null) result = caseEvent(carrierShipmentPickupEndEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierEvent(CarrierEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Shipment Delivery Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Shipment Delivery Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierShipmentDeliveryStartEvent(CarrierShipmentDeliveryStartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Shipment Delivery End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Shipment Delivery End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierShipmentDeliveryEndEvent(CarrierShipmentDeliveryEndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Servie Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Servie Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierServieStartEvent(CarrierServieStartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Service End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Service End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierServiceEndEvent(CarrierServiceEndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Tour Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Tour Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierTourStartEvent(CarrierTourStartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Tour End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Tour End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierTourEndEvent(CarrierTourEndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Shipment Pickup Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Shipment Pickup Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierShipmentPickupStartEvent(CarrierShipmentPickupStartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Shipment Pickup End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Shipment Pickup End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierShipmentPickupEndEvent(CarrierShipmentPickupEndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
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

} //EventsSwitch
