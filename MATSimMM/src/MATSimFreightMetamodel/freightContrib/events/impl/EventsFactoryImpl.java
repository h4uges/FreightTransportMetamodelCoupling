/**
 */
package MATSimFreightMetamodel.freightContrib.events.impl;

import MATSimFreightMetamodel.freightContrib.events.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventsFactoryImpl extends EFactoryImpl implements EventsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventsFactory init() {
		try {
			EventsFactory theEventsFactory = (EventsFactory)EPackage.Registry.INSTANCE.getEFactory(EventsPackage.eNS_URI);
			if (theEventsFactory != null) {
				return theEventsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EventsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EventsPackage.CARRIER_SHIPMENT_DELIVERY_START_EVENT: return createCarrierShipmentDeliveryStartEvent();
			case EventsPackage.CARRIER_SHIPMENT_DELIVERY_END_EVENT: return createCarrierShipmentDeliveryEndEvent();
			case EventsPackage.CARRIER_SERVIE_START_EVENT: return createCarrierServieStartEvent();
			case EventsPackage.CARRIER_SERVICE_END_EVENT: return createCarrierServiceEndEvent();
			case EventsPackage.CARRIER_TOUR_START_EVENT: return createCarrierTourStartEvent();
			case EventsPackage.CARRIER_TOUR_END_EVENT: return createCarrierTourEndEvent();
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT: return createCarrierShipmentPickupStartEvent();
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_END_EVENT: return createCarrierShipmentPickupEndEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierShipmentDeliveryStartEvent createCarrierShipmentDeliveryStartEvent() {
		CarrierShipmentDeliveryStartEventImpl carrierShipmentDeliveryStartEvent = new CarrierShipmentDeliveryStartEventImpl();
		return carrierShipmentDeliveryStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierShipmentDeliveryEndEvent createCarrierShipmentDeliveryEndEvent() {
		CarrierShipmentDeliveryEndEventImpl carrierShipmentDeliveryEndEvent = new CarrierShipmentDeliveryEndEventImpl();
		return carrierShipmentDeliveryEndEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierServieStartEvent createCarrierServieStartEvent() {
		CarrierServieStartEventImpl carrierServieStartEvent = new CarrierServieStartEventImpl();
		return carrierServieStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierServiceEndEvent createCarrierServiceEndEvent() {
		CarrierServiceEndEventImpl carrierServiceEndEvent = new CarrierServiceEndEventImpl();
		return carrierServiceEndEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierTourStartEvent createCarrierTourStartEvent() {
		CarrierTourStartEventImpl carrierTourStartEvent = new CarrierTourStartEventImpl();
		return carrierTourStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierTourEndEvent createCarrierTourEndEvent() {
		CarrierTourEndEventImpl carrierTourEndEvent = new CarrierTourEndEventImpl();
		return carrierTourEndEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierShipmentPickupStartEvent createCarrierShipmentPickupStartEvent() {
		CarrierShipmentPickupStartEventImpl carrierShipmentPickupStartEvent = new CarrierShipmentPickupStartEventImpl();
		return carrierShipmentPickupStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierShipmentPickupEndEvent createCarrierShipmentPickupEndEvent() {
		CarrierShipmentPickupEndEventImpl carrierShipmentPickupEndEvent = new CarrierShipmentPickupEndEventImpl();
		return carrierShipmentPickupEndEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventsPackage getEventsPackage() {
		return (EventsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EventsPackage getPackage() {
		return EventsPackage.eINSTANCE;
	}

} //EventsFactoryImpl
