/**
 */
package logiToppMetamodel.logiTopp.distribution.tours.impl;

import java.util.Collection;

import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;

import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;

import logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity;

import logiToppMetamodel.logiTopp.distribution.fleet.VehicleType;

import logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour;
import logiToppMetamodel.logiTopp.distribution.tours.ToursPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Delivery Tour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.tours.impl.PlannedDeliveryTourImpl#getStops <em>Stops</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.tours.impl.PlannedDeliveryTourImpl#getVehicleType <em>Vehicle Type</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.tours.impl.PlannedDeliveryTourImpl#getPlannedDuration <em>Planned Duration</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.tours.impl.PlannedDeliveryTourImpl#getPlannedAt <em>Planned At</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.tours.impl.PlannedDeliveryTourImpl#getExecutingCEPSP <em>Executing CEPSP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlannedDeliveryTourImpl extends MinimalEObjectImpl.Container implements PlannedDeliveryTour {
	/**
	 * The cached value of the '{@link #getStops() <em>Stops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStops()
	 * @generated
	 * @ordered
	 */
	protected EList<ParcelActivity> stops;

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
	 * The cached value of the '{@link #getPlannedDuration() <em>Planned Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedDuration()
	 * @generated
	 * @ordered
	 */
	protected RelativeTime plannedDuration;

	/**
	 * The cached value of the '{@link #getPlannedAt() <em>Planned At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedAt()
	 * @generated
	 * @ordered
	 */
	protected Time plannedAt;

	/**
	 * The cached value of the '{@link #getExecutingCEPSP() <em>Executing CEPSP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutingCEPSP()
	 * @generated
	 * @ordered
	 */
	protected CEPServiceProvider executingCEPSP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedDeliveryTourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToursPackage.Literals.PLANNED_DELIVERY_TOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParcelActivity> getStops() {
		if (stops == null) {
			stops = new EObjectContainmentEList<ParcelActivity>(ParcelActivity.class, this, ToursPackage.PLANNED_DELIVERY_TOUR__STOPS);
		}
		return stops;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.PLANNED_DELIVERY_TOUR__VEHICLE_TYPE, oldVehicleType, vehicleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativeTime getPlannedDuration() {
		return plannedDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedDuration(RelativeTime newPlannedDuration, NotificationChain msgs) {
		RelativeTime oldPlannedDuration = plannedDuration;
		plannedDuration = newPlannedDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_DURATION, oldPlannedDuration, newPlannedDuration);
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
	public void setPlannedDuration(RelativeTime newPlannedDuration) {
		if (newPlannedDuration != plannedDuration) {
			NotificationChain msgs = null;
			if (plannedDuration != null)
				msgs = ((InternalEObject)plannedDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_DURATION, null, msgs);
			if (newPlannedDuration != null)
				msgs = ((InternalEObject)newPlannedDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_DURATION, null, msgs);
			msgs = basicSetPlannedDuration(newPlannedDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_DURATION, newPlannedDuration, newPlannedDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getPlannedAt() {
		return plannedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedAt(Time newPlannedAt, NotificationChain msgs) {
		Time oldPlannedAt = plannedAt;
		plannedAt = newPlannedAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_AT, oldPlannedAt, newPlannedAt);
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
	public void setPlannedAt(Time newPlannedAt) {
		if (newPlannedAt != plannedAt) {
			NotificationChain msgs = null;
			if (plannedAt != null)
				msgs = ((InternalEObject)plannedAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_AT, null, msgs);
			if (newPlannedAt != null)
				msgs = ((InternalEObject)newPlannedAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_AT, null, msgs);
			msgs = basicSetPlannedAt(newPlannedAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_AT, newPlannedAt, newPlannedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CEPServiceProvider getExecutingCEPSP() {
		if (executingCEPSP != null && executingCEPSP.eIsProxy()) {
			InternalEObject oldExecutingCEPSP = (InternalEObject)executingCEPSP;
			executingCEPSP = (CEPServiceProvider)eResolveProxy(oldExecutingCEPSP);
			if (executingCEPSP != oldExecutingCEPSP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToursPackage.PLANNED_DELIVERY_TOUR__EXECUTING_CEPSP, oldExecutingCEPSP, executingCEPSP));
			}
		}
		return executingCEPSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEPServiceProvider basicGetExecutingCEPSP() {
		return executingCEPSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutingCEPSP(CEPServiceProvider newExecutingCEPSP) {
		CEPServiceProvider oldExecutingCEPSP = executingCEPSP;
		executingCEPSP = newExecutingCEPSP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToursPackage.PLANNED_DELIVERY_TOUR__EXECUTING_CEPSP, oldExecutingCEPSP, executingCEPSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToursPackage.PLANNED_DELIVERY_TOUR__STOPS:
				return ((InternalEList<?>)getStops()).basicRemove(otherEnd, msgs);
			case ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_DURATION:
				return basicSetPlannedDuration(null, msgs);
			case ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_AT:
				return basicSetPlannedAt(null, msgs);
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
			case ToursPackage.PLANNED_DELIVERY_TOUR__STOPS:
				return getStops();
			case ToursPackage.PLANNED_DELIVERY_TOUR__VEHICLE_TYPE:
				return getVehicleType();
			case ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_DURATION:
				return getPlannedDuration();
			case ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_AT:
				return getPlannedAt();
			case ToursPackage.PLANNED_DELIVERY_TOUR__EXECUTING_CEPSP:
				if (resolve) return getExecutingCEPSP();
				return basicGetExecutingCEPSP();
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
			case ToursPackage.PLANNED_DELIVERY_TOUR__STOPS:
				getStops().clear();
				getStops().addAll((Collection<? extends ParcelActivity>)newValue);
				return;
			case ToursPackage.PLANNED_DELIVERY_TOUR__VEHICLE_TYPE:
				setVehicleType((VehicleType)newValue);
				return;
			case ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_DURATION:
				setPlannedDuration((RelativeTime)newValue);
				return;
			case ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_AT:
				setPlannedAt((Time)newValue);
				return;
			case ToursPackage.PLANNED_DELIVERY_TOUR__EXECUTING_CEPSP:
				setExecutingCEPSP((CEPServiceProvider)newValue);
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
			case ToursPackage.PLANNED_DELIVERY_TOUR__STOPS:
				getStops().clear();
				return;
			case ToursPackage.PLANNED_DELIVERY_TOUR__VEHICLE_TYPE:
				setVehicleType(VEHICLE_TYPE_EDEFAULT);
				return;
			case ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_DURATION:
				setPlannedDuration((RelativeTime)null);
				return;
			case ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_AT:
				setPlannedAt((Time)null);
				return;
			case ToursPackage.PLANNED_DELIVERY_TOUR__EXECUTING_CEPSP:
				setExecutingCEPSP((CEPServiceProvider)null);
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
			case ToursPackage.PLANNED_DELIVERY_TOUR__STOPS:
				return stops != null && !stops.isEmpty();
			case ToursPackage.PLANNED_DELIVERY_TOUR__VEHICLE_TYPE:
				return vehicleType != VEHICLE_TYPE_EDEFAULT;
			case ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_DURATION:
				return plannedDuration != null;
			case ToursPackage.PLANNED_DELIVERY_TOUR__PLANNED_AT:
				return plannedAt != null;
			case ToursPackage.PLANNED_DELIVERY_TOUR__EXECUTING_CEPSP:
				return executingCEPSP != null;
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
		result.append(')');
		return result.toString();
	}

} //PlannedDeliveryTourImpl
