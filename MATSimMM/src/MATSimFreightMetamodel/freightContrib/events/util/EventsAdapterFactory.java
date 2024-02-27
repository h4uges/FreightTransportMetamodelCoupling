/**
 */
package MATSimFreightMetamodel.freightContrib.events.util;

import MATSimFreightMetamodel.freightContrib.events.*;

import MATSimFreightMetamodel.matsim.core.Event;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage
 * @generated
 */
public class EventsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EventsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EventsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventsSwitch<Adapter> modelSwitch =
		new EventsSwitch<Adapter>() {
			@Override
			public Adapter caseCarrierEvent(CarrierEvent object) {
				return createCarrierEventAdapter();
			}
			@Override
			public Adapter caseCarrierShipmentDeliveryStartEvent(CarrierShipmentDeliveryStartEvent object) {
				return createCarrierShipmentDeliveryStartEventAdapter();
			}
			@Override
			public Adapter caseCarrierShipmentDeliveryEndEvent(CarrierShipmentDeliveryEndEvent object) {
				return createCarrierShipmentDeliveryEndEventAdapter();
			}
			@Override
			public Adapter caseCarrierServieStartEvent(CarrierServieStartEvent object) {
				return createCarrierServieStartEventAdapter();
			}
			@Override
			public Adapter caseCarrierServiceEndEvent(CarrierServiceEndEvent object) {
				return createCarrierServiceEndEventAdapter();
			}
			@Override
			public Adapter caseCarrierTourStartEvent(CarrierTourStartEvent object) {
				return createCarrierTourStartEventAdapter();
			}
			@Override
			public Adapter caseCarrierTourEndEvent(CarrierTourEndEvent object) {
				return createCarrierTourEndEventAdapter();
			}
			@Override
			public Adapter caseCarrierShipmentPickupStartEvent(CarrierShipmentPickupStartEvent object) {
				return createCarrierShipmentPickupStartEventAdapter();
			}
			@Override
			public Adapter caseCarrierShipmentPickupEndEvent(CarrierShipmentPickupEndEvent object) {
				return createCarrierShipmentPickupEndEventAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierEvent <em>Carrier Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierEvent
	 * @generated
	 */
	public Adapter createCarrierEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryStartEvent <em>Carrier Shipment Delivery Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryStartEvent
	 * @generated
	 */
	public Adapter createCarrierShipmentDeliveryStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent <em>Carrier Shipment Delivery End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent
	 * @generated
	 */
	public Adapter createCarrierShipmentDeliveryEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent <em>Carrier Servie Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent
	 * @generated
	 */
	public Adapter createCarrierServieStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent <em>Carrier Service End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent
	 * @generated
	 */
	public Adapter createCarrierServiceEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierTourStartEvent <em>Carrier Tour Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierTourStartEvent
	 * @generated
	 */
	public Adapter createCarrierTourStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierTourEndEvent <em>Carrier Tour End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierTourEndEvent
	 * @generated
	 */
	public Adapter createCarrierTourEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent <em>Carrier Shipment Pickup Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent
	 * @generated
	 */
	public Adapter createCarrierShipmentPickupStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupEndEvent <em>Carrier Shipment Pickup End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupEndEvent
	 * @generated
	 */
	public Adapter createCarrierShipmentPickupEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.matsim.core.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.matsim.core.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EventsAdapterFactory
