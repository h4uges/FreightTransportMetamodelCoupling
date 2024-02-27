/**
 */
package MATSimFreightMetamodel.freightContrib.events.impl;

import MATSimFreightMetamodel.freightContrib.CarrierShipment;

import MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent;
import MATSimFreightMetamodel.freightContrib.events.EventsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Shipment Pickup Start Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentPickupStartEventImpl#getPickupDuration <em>Pickup Duration</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentPickupStartEventImpl#getCapacityDemand <em>Capacity Demand</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentPickupStartEventImpl#getCarrierShipment <em>Carrier Shipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierShipmentPickupStartEventImpl extends CarrierEventImpl implements CarrierShipmentPickupStartEvent {
	/**
	 * The default value of the '{@link #getPickupDuration() <em>Pickup Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickupDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double PICKUP_DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPickupDuration() <em>Pickup Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickupDuration()
	 * @generated
	 * @ordered
	 */
	protected double pickupDuration = PICKUP_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacityDemand() <em>Capacity Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityDemand()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_DEMAND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacityDemand() <em>Capacity Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityDemand()
	 * @generated
	 * @ordered
	 */
	protected int capacityDemand = CAPACITY_DEMAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCarrierShipment() <em>Carrier Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierShipment()
	 * @generated
	 * @ordered
	 */
	protected CarrierShipment carrierShipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierShipmentPickupStartEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.CARRIER_SHIPMENT_PICKUP_START_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPickupDuration() {
		return pickupDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPickupDuration(double newPickupDuration) {
		double oldPickupDuration = pickupDuration;
		pickupDuration = newPickupDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__PICKUP_DURATION, oldPickupDuration, pickupDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacityDemand() {
		return capacityDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacityDemand(int newCapacityDemand) {
		int oldCapacityDemand = capacityDemand;
		capacityDemand = newCapacityDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__CAPACITY_DEMAND, oldCapacityDemand, capacityDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierShipment getCarrierShipment() {
		if (carrierShipment != null && carrierShipment.eIsProxy()) {
			InternalEObject oldCarrierShipment = (InternalEObject)carrierShipment;
			carrierShipment = (CarrierShipment)eResolveProxy(oldCarrierShipment);
			if (carrierShipment != oldCarrierShipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__CARRIER_SHIPMENT, oldCarrierShipment, carrierShipment));
			}
		}
		return carrierShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierShipment basicGetCarrierShipment() {
		return carrierShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierShipment(CarrierShipment newCarrierShipment) {
		CarrierShipment oldCarrierShipment = carrierShipment;
		carrierShipment = newCarrierShipment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__CARRIER_SHIPMENT, oldCarrierShipment, carrierShipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__PICKUP_DURATION:
				return getPickupDuration();
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__CAPACITY_DEMAND:
				return getCapacityDemand();
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__CARRIER_SHIPMENT:
				if (resolve) return getCarrierShipment();
				return basicGetCarrierShipment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__PICKUP_DURATION:
				setPickupDuration((Double)newValue);
				return;
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__CAPACITY_DEMAND:
				setCapacityDemand((Integer)newValue);
				return;
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__CARRIER_SHIPMENT:
				setCarrierShipment((CarrierShipment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__PICKUP_DURATION:
				setPickupDuration(PICKUP_DURATION_EDEFAULT);
				return;
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__CAPACITY_DEMAND:
				setCapacityDemand(CAPACITY_DEMAND_EDEFAULT);
				return;
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__CARRIER_SHIPMENT:
				setCarrierShipment((CarrierShipment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__PICKUP_DURATION:
				return pickupDuration != PICKUP_DURATION_EDEFAULT;
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__CAPACITY_DEMAND:
				return capacityDemand != CAPACITY_DEMAND_EDEFAULT;
			case EventsPackage.CARRIER_SHIPMENT_PICKUP_START_EVENT__CARRIER_SHIPMENT:
				return carrierShipment != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pickupDuration: ");
		result.append(pickupDuration);
		result.append(", capacityDemand: ");
		result.append(capacityDemand);
		result.append(')');
		return result.toString();
	}

} //CarrierShipmentPickupStartEventImpl
