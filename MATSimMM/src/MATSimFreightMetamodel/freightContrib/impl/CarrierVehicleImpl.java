/**
 */
package MATSimFreightMetamodel.freightContrib.impl;

import MATSimFreightMetamodel.freightContrib.CarrierVehicle;
import MATSimFreightMetamodel.freightContrib.FreightContribPackage;

import MATSimFreightMetamodel.matsim.core.network.Link;

import MATSimFreightMetamodel.matsim.vehicles.impl.VehicleImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierVehicleImpl#getEarliestStartTime <em>Earliest Start Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierVehicleImpl#getLatestEndTime <em>Latest End Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierVehicleImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierVehicleImpl extends VehicleImpl implements CarrierVehicle {
	/**
	 * The default value of the '{@link #getEarliestStartTime() <em>Earliest Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final double EARLIEST_START_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEarliestStartTime() <em>Earliest Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestStartTime()
	 * @generated
	 * @ordered
	 */
	protected double earliestStartTime = EARLIEST_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatestEndTime() <em>Latest End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final double LATEST_END_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLatestEndTime() <em>Latest End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestEndTime()
	 * @generated
	 * @ordered
	 */
	protected double latestEndTime = LATEST_END_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Link location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierVehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightContribPackage.Literals.CARRIER_VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEarliestStartTime() {
		return earliestStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEarliestStartTime(double newEarliestStartTime) {
		double oldEarliestStartTime = earliestStartTime;
		earliestStartTime = newEarliestStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_VEHICLE__EARLIEST_START_TIME, oldEarliestStartTime, earliestStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLatestEndTime() {
		return latestEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatestEndTime(double newLatestEndTime) {
		double oldLatestEndTime = latestEndTime;
		latestEndTime = newLatestEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_VEHICLE__LATEST_END_TIME, oldLatestEndTime, latestEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Link)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreightContribPackage.CARRIER_VEHICLE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(Link newLocation) {
		Link oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_VEHICLE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreightContribPackage.CARRIER_VEHICLE__EARLIEST_START_TIME:
				return getEarliestStartTime();
			case FreightContribPackage.CARRIER_VEHICLE__LATEST_END_TIME:
				return getLatestEndTime();
			case FreightContribPackage.CARRIER_VEHICLE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case FreightContribPackage.CARRIER_VEHICLE__EARLIEST_START_TIME:
				setEarliestStartTime((Double)newValue);
				return;
			case FreightContribPackage.CARRIER_VEHICLE__LATEST_END_TIME:
				setLatestEndTime((Double)newValue);
				return;
			case FreightContribPackage.CARRIER_VEHICLE__LOCATION:
				setLocation((Link)newValue);
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
			case FreightContribPackage.CARRIER_VEHICLE__EARLIEST_START_TIME:
				setEarliestStartTime(EARLIEST_START_TIME_EDEFAULT);
				return;
			case FreightContribPackage.CARRIER_VEHICLE__LATEST_END_TIME:
				setLatestEndTime(LATEST_END_TIME_EDEFAULT);
				return;
			case FreightContribPackage.CARRIER_VEHICLE__LOCATION:
				setLocation((Link)null);
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
			case FreightContribPackage.CARRIER_VEHICLE__EARLIEST_START_TIME:
				return earliestStartTime != EARLIEST_START_TIME_EDEFAULT;
			case FreightContribPackage.CARRIER_VEHICLE__LATEST_END_TIME:
				return latestEndTime != LATEST_END_TIME_EDEFAULT;
			case FreightContribPackage.CARRIER_VEHICLE__LOCATION:
				return location != null;
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
		result.append(" (earliestStartTime: ");
		result.append(earliestStartTime);
		result.append(", latestEndTime: ");
		result.append(latestEndTime);
		result.append(')');
		return result.toString();
	}

} //CarrierVehicleImpl
