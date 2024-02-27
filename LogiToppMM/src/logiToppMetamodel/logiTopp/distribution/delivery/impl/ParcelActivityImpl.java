/**
 */
package logiToppMetamodel.logiTopp.distribution.delivery.impl;

import java.util.Collection;

import logiToppMetamodel.base.Time;

import logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage;
import logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity;

import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;

import logiToppMetamodel.logiTopp.parcels.Parcel;

import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parcel Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl#getNo <em>No</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl#getParcels <em>Parcels</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl#getPickUps <em>Pick Ups</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl#getStopLocation <em>Stop Location</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl#getPlannedTime <em>Planned Time</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl#getTripDuration <em>Trip Duration</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl#getDeliveryDuration <em>Delivery Duration</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParcelActivityImpl extends MinimalEObjectImpl.Container implements ParcelActivity {
	/**
	 * The default value of the '{@link #getNo() <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNo() <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo()
	 * @generated
	 * @ordered
	 */
	protected int no = NO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParcels() <em>Parcels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParcels()
	 * @generated
	 * @ordered
	 */
	protected EList<Parcel> parcels;

	/**
	 * The cached value of the '{@link #getPickUps() <em>Pick Ups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickUps()
	 * @generated
	 * @ordered
	 */
	protected EList<Parcel> pickUps;

	/**
	 * The cached value of the '{@link #getStopLocation() <em>Stop Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopLocation()
	 * @generated
	 * @ordered
	 */
	protected ZoneAndLocation stopLocation;

	/**
	 * The cached value of the '{@link #getPlannedTime() <em>Planned Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedTime()
	 * @generated
	 * @ordered
	 */
	protected Time plannedTime;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTripDuration() <em>Trip Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int TRIP_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTripDuration() <em>Trip Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripDuration()
	 * @generated
	 * @ordered
	 */
	protected int tripDuration = TRIP_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryDuration() <em>Delivery Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DELIVERY_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeliveryDuration() <em>Delivery Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDuration()
	 * @generated
	 * @ordered
	 */
	protected int deliveryDuration = DELIVERY_DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected DeliveryVehicle vehicle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParcelActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeliveryPackage.Literals.PARCEL_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNo() {
		return no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNo(int newNo) {
		int oldNo = no;
		no = newNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeliveryPackage.PARCEL_ACTIVITY__NO, oldNo, no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parcel> getParcels() {
		if (parcels == null) {
			parcels = new EObjectResolvingEList<Parcel>(Parcel.class, this, DeliveryPackage.PARCEL_ACTIVITY__PARCELS);
		}
		return parcels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parcel> getPickUps() {
		if (pickUps == null) {
			pickUps = new EObjectResolvingEList<Parcel>(Parcel.class, this, DeliveryPackage.PARCEL_ACTIVITY__PICK_UPS);
		}
		return pickUps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZoneAndLocation getStopLocation() {
		return stopLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopLocation(ZoneAndLocation newStopLocation, NotificationChain msgs) {
		ZoneAndLocation oldStopLocation = stopLocation;
		stopLocation = newStopLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeliveryPackage.PARCEL_ACTIVITY__STOP_LOCATION, oldStopLocation, newStopLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopLocation(ZoneAndLocation newStopLocation) {
		if (newStopLocation != stopLocation) {
			NotificationChain msgs = null;
			if (stopLocation != null)
				msgs = ((InternalEObject)stopLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeliveryPackage.PARCEL_ACTIVITY__STOP_LOCATION, null, msgs);
			if (newStopLocation != null)
				msgs = ((InternalEObject)newStopLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeliveryPackage.PARCEL_ACTIVITY__STOP_LOCATION, null, msgs);
			msgs = basicSetStopLocation(newStopLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeliveryPackage.PARCEL_ACTIVITY__STOP_LOCATION, newStopLocation, newStopLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getPlannedTime() {
		if (plannedTime != null && plannedTime.eIsProxy()) {
			InternalEObject oldPlannedTime = (InternalEObject)plannedTime;
			plannedTime = (Time)eResolveProxy(oldPlannedTime);
			if (plannedTime != oldPlannedTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeliveryPackage.PARCEL_ACTIVITY__PLANNED_TIME, oldPlannedTime, plannedTime));
			}
		}
		return plannedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetPlannedTime() {
		return plannedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannedTime(Time newPlannedTime) {
		Time oldPlannedTime = plannedTime;
		plannedTime = newPlannedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeliveryPackage.PARCEL_ACTIVITY__PLANNED_TIME, oldPlannedTime, plannedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeliveryPackage.PARCEL_ACTIVITY__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTripDuration() {
		return tripDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTripDuration(int newTripDuration) {
		int oldTripDuration = tripDuration;
		tripDuration = newTripDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeliveryPackage.PARCEL_ACTIVITY__TRIP_DURATION, oldTripDuration, tripDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDeliveryDuration() {
		return deliveryDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryDuration(int newDeliveryDuration) {
		int oldDeliveryDuration = deliveryDuration;
		deliveryDuration = newDeliveryDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeliveryPackage.PARCEL_ACTIVITY__DELIVERY_DURATION, oldDeliveryDuration, deliveryDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeliveryVehicle getVehicle() {
		if (vehicle != null && vehicle.eIsProxy()) {
			InternalEObject oldVehicle = (InternalEObject)vehicle;
			vehicle = (DeliveryVehicle)eResolveProxy(oldVehicle);
			if (vehicle != oldVehicle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeliveryPackage.PARCEL_ACTIVITY__VEHICLE, oldVehicle, vehicle));
			}
		}
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryVehicle basicGetVehicle() {
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicle(DeliveryVehicle newVehicle) {
		DeliveryVehicle oldVehicle = vehicle;
		vehicle = newVehicle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeliveryPackage.PARCEL_ACTIVITY__VEHICLE, oldVehicle, vehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeliveryPackage.PARCEL_ACTIVITY__STOP_LOCATION:
				return basicSetStopLocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeliveryPackage.PARCEL_ACTIVITY__NO:
				return getNo();
			case DeliveryPackage.PARCEL_ACTIVITY__PARCELS:
				return getParcels();
			case DeliveryPackage.PARCEL_ACTIVITY__PICK_UPS:
				return getPickUps();
			case DeliveryPackage.PARCEL_ACTIVITY__STOP_LOCATION:
				return getStopLocation();
			case DeliveryPackage.PARCEL_ACTIVITY__PLANNED_TIME:
				if (resolve) return getPlannedTime();
				return basicGetPlannedTime();
			case DeliveryPackage.PARCEL_ACTIVITY__DISTANCE:
				return getDistance();
			case DeliveryPackage.PARCEL_ACTIVITY__TRIP_DURATION:
				return getTripDuration();
			case DeliveryPackage.PARCEL_ACTIVITY__DELIVERY_DURATION:
				return getDeliveryDuration();
			case DeliveryPackage.PARCEL_ACTIVITY__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeliveryPackage.PARCEL_ACTIVITY__NO:
				setNo((Integer)newValue);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__PARCELS:
				getParcels().clear();
				getParcels().addAll((Collection<? extends Parcel>)newValue);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__PICK_UPS:
				getPickUps().clear();
				getPickUps().addAll((Collection<? extends Parcel>)newValue);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__STOP_LOCATION:
				setStopLocation((ZoneAndLocation)newValue);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__PLANNED_TIME:
				setPlannedTime((Time)newValue);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__DISTANCE:
				setDistance((Double)newValue);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__TRIP_DURATION:
				setTripDuration((Integer)newValue);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__DELIVERY_DURATION:
				setDeliveryDuration((Integer)newValue);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__VEHICLE:
				setVehicle((DeliveryVehicle)newValue);
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
			case DeliveryPackage.PARCEL_ACTIVITY__NO:
				setNo(NO_EDEFAULT);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__PARCELS:
				getParcels().clear();
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__PICK_UPS:
				getPickUps().clear();
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__STOP_LOCATION:
				setStopLocation((ZoneAndLocation)null);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__PLANNED_TIME:
				setPlannedTime((Time)null);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__TRIP_DURATION:
				setTripDuration(TRIP_DURATION_EDEFAULT);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__DELIVERY_DURATION:
				setDeliveryDuration(DELIVERY_DURATION_EDEFAULT);
				return;
			case DeliveryPackage.PARCEL_ACTIVITY__VEHICLE:
				setVehicle((DeliveryVehicle)null);
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
			case DeliveryPackage.PARCEL_ACTIVITY__NO:
				return no != NO_EDEFAULT;
			case DeliveryPackage.PARCEL_ACTIVITY__PARCELS:
				return parcels != null && !parcels.isEmpty();
			case DeliveryPackage.PARCEL_ACTIVITY__PICK_UPS:
				return pickUps != null && !pickUps.isEmpty();
			case DeliveryPackage.PARCEL_ACTIVITY__STOP_LOCATION:
				return stopLocation != null;
			case DeliveryPackage.PARCEL_ACTIVITY__PLANNED_TIME:
				return plannedTime != null;
			case DeliveryPackage.PARCEL_ACTIVITY__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case DeliveryPackage.PARCEL_ACTIVITY__TRIP_DURATION:
				return tripDuration != TRIP_DURATION_EDEFAULT;
			case DeliveryPackage.PARCEL_ACTIVITY__DELIVERY_DURATION:
				return deliveryDuration != DELIVERY_DURATION_EDEFAULT;
			case DeliveryPackage.PARCEL_ACTIVITY__VEHICLE:
				return vehicle != null;
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
		result.append(" (no: ");
		result.append(no);
		result.append(", distance: ");
		result.append(distance);
		result.append(", tripDuration: ");
		result.append(tripDuration);
		result.append(", deliveryDuration: ");
		result.append(deliveryDuration);
		result.append(')');
		return result.toString();
	}

} //ParcelActivityImpl
