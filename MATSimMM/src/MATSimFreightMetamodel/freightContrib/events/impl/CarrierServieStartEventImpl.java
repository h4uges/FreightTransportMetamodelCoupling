/**
 */
package MATSimFreightMetamodel.freightContrib.events.impl;

import MATSimFreightMetamodel.freightContrib.CarrierService;

import MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent;
import MATSimFreightMetamodel.freightContrib.events.EventsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Servie Start Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierServieStartEventImpl#getCarrierService <em>Carrier Service</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierServieStartEventImpl#getServiceDuration <em>Service Duration</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierServieStartEventImpl#getCapacityDemand <em>Capacity Demand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierServieStartEventImpl extends CarrierEventImpl implements CarrierServieStartEvent {
	/**
	 * The cached value of the '{@link #getCarrierService() <em>Carrier Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierService()
	 * @generated
	 * @ordered
	 */
	protected CarrierService carrierService;

	/**
	 * The default value of the '{@link #getServiceDuration() <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double SERVICE_DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getServiceDuration() <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDuration()
	 * @generated
	 * @ordered
	 */
	protected double serviceDuration = SERVICE_DURATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierServieStartEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.CARRIER_SERVIE_START_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierService getCarrierService() {
		if (carrierService != null && carrierService.eIsProxy()) {
			InternalEObject oldCarrierService = (InternalEObject)carrierService;
			carrierService = (CarrierService)eResolveProxy(oldCarrierService);
			if (carrierService != oldCarrierService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventsPackage.CARRIER_SERVIE_START_EVENT__CARRIER_SERVICE, oldCarrierService, carrierService));
			}
		}
		return carrierService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierService basicGetCarrierService() {
		return carrierService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierService(CarrierService newCarrierService) {
		CarrierService oldCarrierService = carrierService;
		carrierService = newCarrierService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.CARRIER_SERVIE_START_EVENT__CARRIER_SERVICE, oldCarrierService, carrierService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getServiceDuration() {
		return serviceDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceDuration(double newServiceDuration) {
		double oldServiceDuration = serviceDuration;
		serviceDuration = newServiceDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.CARRIER_SERVIE_START_EVENT__SERVICE_DURATION, oldServiceDuration, serviceDuration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.CARRIER_SERVIE_START_EVENT__CAPACITY_DEMAND, oldCapacityDemand, capacityDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.CARRIER_SERVIE_START_EVENT__CARRIER_SERVICE:
				if (resolve) return getCarrierService();
				return basicGetCarrierService();
			case EventsPackage.CARRIER_SERVIE_START_EVENT__SERVICE_DURATION:
				return getServiceDuration();
			case EventsPackage.CARRIER_SERVIE_START_EVENT__CAPACITY_DEMAND:
				return getCapacityDemand();
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
			case EventsPackage.CARRIER_SERVIE_START_EVENT__CARRIER_SERVICE:
				setCarrierService((CarrierService)newValue);
				return;
			case EventsPackage.CARRIER_SERVIE_START_EVENT__SERVICE_DURATION:
				setServiceDuration((Double)newValue);
				return;
			case EventsPackage.CARRIER_SERVIE_START_EVENT__CAPACITY_DEMAND:
				setCapacityDemand((Integer)newValue);
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
			case EventsPackage.CARRIER_SERVIE_START_EVENT__CARRIER_SERVICE:
				setCarrierService((CarrierService)null);
				return;
			case EventsPackage.CARRIER_SERVIE_START_EVENT__SERVICE_DURATION:
				setServiceDuration(SERVICE_DURATION_EDEFAULT);
				return;
			case EventsPackage.CARRIER_SERVIE_START_EVENT__CAPACITY_DEMAND:
				setCapacityDemand(CAPACITY_DEMAND_EDEFAULT);
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
			case EventsPackage.CARRIER_SERVIE_START_EVENT__CARRIER_SERVICE:
				return carrierService != null;
			case EventsPackage.CARRIER_SERVIE_START_EVENT__SERVICE_DURATION:
				return serviceDuration != SERVICE_DURATION_EDEFAULT;
			case EventsPackage.CARRIER_SERVIE_START_EVENT__CAPACITY_DEMAND:
				return capacityDemand != CAPACITY_DEMAND_EDEFAULT;
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
		result.append(" (serviceDuration: ");
		result.append(serviceDuration);
		result.append(", capacityDemand: ");
		result.append(capacityDemand);
		result.append(')');
		return result.toString();
	}

} //CarrierServieStartEventImpl
