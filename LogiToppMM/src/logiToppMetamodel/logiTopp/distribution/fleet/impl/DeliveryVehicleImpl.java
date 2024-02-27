/**
 */
package logiToppMetamodel.logiTopp.distribution.fleet.impl;

import logiToppMetamodel.base.Time;
import logiToppMetamodel.base.impl.EntityImpl;

import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;
import logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage;
import logiToppMetamodel.logiTopp.distribution.fleet.VehicleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.impl.DeliveryVehicleImpl#getVehicleType <em>Vehicle Type</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.impl.DeliveryVehicleImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.impl.DeliveryVehicleImpl#getEarliestStartTime <em>Earliest Start Time</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.impl.DeliveryVehicleImpl#getLatestEndTime <em>Latest End Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliveryVehicleImpl extends EntityImpl implements DeliveryVehicle {
	/**
	 * The default value of the '{@link #getVehicleType() <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleType()
	 * @generated
	 * @ordered
	 */
	protected static final VehicleType VEHICLE_TYPE_EDEFAULT = VehicleType.TRUCK;

	/**
	 * The cached value of the '{@link #getVehicleType() <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleType()
	 * @generated
	 * @ordered
	 */
	protected VehicleType vehicleType = VEHICLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEarliestStartTime() <em>Earliest Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestStartTime()
	 * @generated
	 * @ordered
	 */
	protected Time earliestStartTime;

	/**
	 * The cached value of the '{@link #getLatestEndTime() <em>Latest End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestEndTime()
	 * @generated
	 * @ordered
	 */
	protected Time latestEndTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryVehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.DELIVERY_VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleType getVehicleType() {
		return vehicleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicleType(VehicleType newVehicleType) {
		VehicleType oldVehicleType = vehicleType;
		vehicleType = newVehicleType == null ? VEHICLE_TYPE_EDEFAULT : newVehicleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FleetPackage.DELIVERY_VEHICLE__VEHICLE_TYPE, oldVehicleType, vehicleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FleetPackage.DELIVERY_VEHICLE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getEarliestStartTime() {
		if (earliestStartTime != null && earliestStartTime.eIsProxy()) {
			InternalEObject oldEarliestStartTime = (InternalEObject)earliestStartTime;
			earliestStartTime = (Time)eResolveProxy(oldEarliestStartTime);
			if (earliestStartTime != oldEarliestStartTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FleetPackage.DELIVERY_VEHICLE__EARLIEST_START_TIME, oldEarliestStartTime, earliestStartTime));
			}
		}
		return earliestStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetEarliestStartTime() {
		return earliestStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEarliestStartTime(Time newEarliestStartTime) {
		Time oldEarliestStartTime = earliestStartTime;
		earliestStartTime = newEarliestStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FleetPackage.DELIVERY_VEHICLE__EARLIEST_START_TIME, oldEarliestStartTime, earliestStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getLatestEndTime() {
		if (latestEndTime != null && latestEndTime.eIsProxy()) {
			InternalEObject oldLatestEndTime = (InternalEObject)latestEndTime;
			latestEndTime = (Time)eResolveProxy(oldLatestEndTime);
			if (latestEndTime != oldLatestEndTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FleetPackage.DELIVERY_VEHICLE__LATEST_END_TIME, oldLatestEndTime, latestEndTime));
			}
		}
		return latestEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetLatestEndTime() {
		return latestEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatestEndTime(Time newLatestEndTime) {
		Time oldLatestEndTime = latestEndTime;
		latestEndTime = newLatestEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FleetPackage.DELIVERY_VEHICLE__LATEST_END_TIME, oldLatestEndTime, latestEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FleetPackage.DELIVERY_VEHICLE__VEHICLE_TYPE:
				return getVehicleType();
			case FleetPackage.DELIVERY_VEHICLE__CAPACITY:
				return getCapacity();
			case FleetPackage.DELIVERY_VEHICLE__EARLIEST_START_TIME:
				if (resolve) return getEarliestStartTime();
				return basicGetEarliestStartTime();
			case FleetPackage.DELIVERY_VEHICLE__LATEST_END_TIME:
				if (resolve) return getLatestEndTime();
				return basicGetLatestEndTime();
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
			case FleetPackage.DELIVERY_VEHICLE__VEHICLE_TYPE:
				setVehicleType((VehicleType)newValue);
				return;
			case FleetPackage.DELIVERY_VEHICLE__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case FleetPackage.DELIVERY_VEHICLE__EARLIEST_START_TIME:
				setEarliestStartTime((Time)newValue);
				return;
			case FleetPackage.DELIVERY_VEHICLE__LATEST_END_TIME:
				setLatestEndTime((Time)newValue);
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
			case FleetPackage.DELIVERY_VEHICLE__VEHICLE_TYPE:
				setVehicleType(VEHICLE_TYPE_EDEFAULT);
				return;
			case FleetPackage.DELIVERY_VEHICLE__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case FleetPackage.DELIVERY_VEHICLE__EARLIEST_START_TIME:
				setEarliestStartTime((Time)null);
				return;
			case FleetPackage.DELIVERY_VEHICLE__LATEST_END_TIME:
				setLatestEndTime((Time)null);
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
			case FleetPackage.DELIVERY_VEHICLE__VEHICLE_TYPE:
				return vehicleType != VEHICLE_TYPE_EDEFAULT;
			case FleetPackage.DELIVERY_VEHICLE__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case FleetPackage.DELIVERY_VEHICLE__EARLIEST_START_TIME:
				return earliestStartTime != null;
			case FleetPackage.DELIVERY_VEHICLE__LATEST_END_TIME:
				return latestEndTime != null;
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
		result.append(" (vehicleType: ");
		result.append(vehicleType);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //DeliveryVehicleImpl
