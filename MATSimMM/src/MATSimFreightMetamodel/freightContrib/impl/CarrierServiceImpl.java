/**
 */
package MATSimFreightMetamodel.freightContrib.impl;

import MATSimFreightMetamodel.base.impl.EntityImpl;

import MATSimFreightMetamodel.freightContrib.CarrierService;
import MATSimFreightMetamodel.freightContrib.FreightContribPackage;
import MATSimFreightMetamodel.freightContrib.TimeWindow;

import MATSimFreightMetamodel.matsim.core.network.Link;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierServiceImpl#getServiceDuration <em>Service Duration</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierServiceImpl#getTimeWindow <em>Time Window</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierServiceImpl#getCapacityDemand <em>Capacity Demand</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierServiceImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierServiceImpl extends EntityImpl implements CarrierService {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getTimeWindow() <em>Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeWindow()
	 * @generated
	 * @ordered
	 */
	protected TimeWindow timeWindow;

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
	protected CarrierServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightContribPackage.Literals.CARRIER_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SERVICE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SERVICE__SERVICE_DURATION, oldServiceDuration, serviceDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWindow getTimeWindow() {
		return timeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeWindow(TimeWindow newTimeWindow, NotificationChain msgs) {
		TimeWindow oldTimeWindow = timeWindow;
		timeWindow = newTimeWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SERVICE__TIME_WINDOW, oldTimeWindow, newTimeWindow);
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
	public void setTimeWindow(TimeWindow newTimeWindow) {
		if (newTimeWindow != timeWindow) {
			NotificationChain msgs = null;
			if (timeWindow != null)
				msgs = ((InternalEObject)timeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.CARRIER_SERVICE__TIME_WINDOW, null, msgs);
			if (newTimeWindow != null)
				msgs = ((InternalEObject)newTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.CARRIER_SERVICE__TIME_WINDOW, null, msgs);
			msgs = basicSetTimeWindow(newTimeWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SERVICE__TIME_WINDOW, newTimeWindow, newTimeWindow));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SERVICE__CAPACITY_DEMAND, oldCapacityDemand, capacityDemand));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreightContribPackage.CARRIER_SERVICE__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SERVICE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreightContribPackage.CARRIER_SERVICE__TIME_WINDOW:
				return basicSetTimeWindow(null, msgs);
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
			case FreightContribPackage.CARRIER_SERVICE__NAME:
				return getName();
			case FreightContribPackage.CARRIER_SERVICE__SERVICE_DURATION:
				return getServiceDuration();
			case FreightContribPackage.CARRIER_SERVICE__TIME_WINDOW:
				return getTimeWindow();
			case FreightContribPackage.CARRIER_SERVICE__CAPACITY_DEMAND:
				return getCapacityDemand();
			case FreightContribPackage.CARRIER_SERVICE__LOCATION:
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
			case FreightContribPackage.CARRIER_SERVICE__NAME:
				setName((String)newValue);
				return;
			case FreightContribPackage.CARRIER_SERVICE__SERVICE_DURATION:
				setServiceDuration((Double)newValue);
				return;
			case FreightContribPackage.CARRIER_SERVICE__TIME_WINDOW:
				setTimeWindow((TimeWindow)newValue);
				return;
			case FreightContribPackage.CARRIER_SERVICE__CAPACITY_DEMAND:
				setCapacityDemand((Integer)newValue);
				return;
			case FreightContribPackage.CARRIER_SERVICE__LOCATION:
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
			case FreightContribPackage.CARRIER_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FreightContribPackage.CARRIER_SERVICE__SERVICE_DURATION:
				setServiceDuration(SERVICE_DURATION_EDEFAULT);
				return;
			case FreightContribPackage.CARRIER_SERVICE__TIME_WINDOW:
				setTimeWindow((TimeWindow)null);
				return;
			case FreightContribPackage.CARRIER_SERVICE__CAPACITY_DEMAND:
				setCapacityDemand(CAPACITY_DEMAND_EDEFAULT);
				return;
			case FreightContribPackage.CARRIER_SERVICE__LOCATION:
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
			case FreightContribPackage.CARRIER_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FreightContribPackage.CARRIER_SERVICE__SERVICE_DURATION:
				return serviceDuration != SERVICE_DURATION_EDEFAULT;
			case FreightContribPackage.CARRIER_SERVICE__TIME_WINDOW:
				return timeWindow != null;
			case FreightContribPackage.CARRIER_SERVICE__CAPACITY_DEMAND:
				return capacityDemand != CAPACITY_DEMAND_EDEFAULT;
			case FreightContribPackage.CARRIER_SERVICE__LOCATION:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", serviceDuration: ");
		result.append(serviceDuration);
		result.append(", capacityDemand: ");
		result.append(capacityDemand);
		result.append(')');
		return result.toString();
	}

} //CarrierServiceImpl
