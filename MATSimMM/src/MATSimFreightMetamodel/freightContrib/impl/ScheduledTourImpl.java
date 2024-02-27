/**
 */
package MATSimFreightMetamodel.freightContrib.impl;

import MATSimFreightMetamodel.freightContrib.CarrierVehicle;
import MATSimFreightMetamodel.freightContrib.FreightContribPackage;
import MATSimFreightMetamodel.freightContrib.ScheduledTour;

import MATSimFreightMetamodel.freightContrib.tour.Tour;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Tour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.ScheduledTourImpl#getDepartureTime <em>Departure Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.ScheduledTourImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.ScheduledTourImpl#getTour <em>Tour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduledTourImpl extends MinimalEObjectImpl.Container implements ScheduledTour {
	/**
	 * The default value of the '{@link #getDepartureTime() <em>Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPARTURE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepartureTime() <em>Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected double departureTime = DEPARTURE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected CarrierVehicle vehicle;

	/**
	 * The cached value of the '{@link #getTour() <em>Tour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTour()
	 * @generated
	 * @ordered
	 */
	protected Tour tour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduledTourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightContribPackage.Literals.SCHEDULED_TOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDepartureTime() {
		return departureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartureTime(double newDepartureTime) {
		double oldDepartureTime = departureTime;
		departureTime = newDepartureTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.SCHEDULED_TOUR__DEPARTURE_TIME, oldDepartureTime, departureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierVehicle getVehicle() {
		if (vehicle != null && vehicle.eIsProxy()) {
			InternalEObject oldVehicle = (InternalEObject)vehicle;
			vehicle = (CarrierVehicle)eResolveProxy(oldVehicle);
			if (vehicle != oldVehicle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreightContribPackage.SCHEDULED_TOUR__VEHICLE, oldVehicle, vehicle));
			}
		}
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierVehicle basicGetVehicle() {
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicle(CarrierVehicle newVehicle) {
		CarrierVehicle oldVehicle = vehicle;
		vehicle = newVehicle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.SCHEDULED_TOUR__VEHICLE, oldVehicle, vehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tour getTour() {
		return tour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTour(Tour newTour, NotificationChain msgs) {
		Tour oldTour = tour;
		tour = newTour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreightContribPackage.SCHEDULED_TOUR__TOUR, oldTour, newTour);
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
	public void setTour(Tour newTour) {
		if (newTour != tour) {
			NotificationChain msgs = null;
			if (tour != null)
				msgs = ((InternalEObject)tour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.SCHEDULED_TOUR__TOUR, null, msgs);
			if (newTour != null)
				msgs = ((InternalEObject)newTour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.SCHEDULED_TOUR__TOUR, null, msgs);
			msgs = basicSetTour(newTour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.SCHEDULED_TOUR__TOUR, newTour, newTour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreightContribPackage.SCHEDULED_TOUR__TOUR:
				return basicSetTour(null, msgs);
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
			case FreightContribPackage.SCHEDULED_TOUR__DEPARTURE_TIME:
				return getDepartureTime();
			case FreightContribPackage.SCHEDULED_TOUR__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case FreightContribPackage.SCHEDULED_TOUR__TOUR:
				return getTour();
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
			case FreightContribPackage.SCHEDULED_TOUR__DEPARTURE_TIME:
				setDepartureTime((Double)newValue);
				return;
			case FreightContribPackage.SCHEDULED_TOUR__VEHICLE:
				setVehicle((CarrierVehicle)newValue);
				return;
			case FreightContribPackage.SCHEDULED_TOUR__TOUR:
				setTour((Tour)newValue);
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
			case FreightContribPackage.SCHEDULED_TOUR__DEPARTURE_TIME:
				setDepartureTime(DEPARTURE_TIME_EDEFAULT);
				return;
			case FreightContribPackage.SCHEDULED_TOUR__VEHICLE:
				setVehicle((CarrierVehicle)null);
				return;
			case FreightContribPackage.SCHEDULED_TOUR__TOUR:
				setTour((Tour)null);
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
			case FreightContribPackage.SCHEDULED_TOUR__DEPARTURE_TIME:
				return departureTime != DEPARTURE_TIME_EDEFAULT;
			case FreightContribPackage.SCHEDULED_TOUR__VEHICLE:
				return vehicle != null;
			case FreightContribPackage.SCHEDULED_TOUR__TOUR:
				return tour != null;
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
		result.append(" (departureTime: ");
		result.append(departureTime);
		result.append(')');
		return result.toString();
	}

} //ScheduledTourImpl
