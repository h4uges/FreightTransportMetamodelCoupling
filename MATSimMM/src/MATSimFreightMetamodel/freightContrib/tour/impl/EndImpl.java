/**
 */
package MATSimFreightMetamodel.freightContrib.tour.impl;

import MATSimFreightMetamodel.freightContrib.TimeWindow;

import MATSimFreightMetamodel.freightContrib.tour.End;
import MATSimFreightMetamodel.freightContrib.tour.TourPackage;

import MATSimFreightMetamodel.matsim.core.network.Link;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.impl.EndImpl#getTimeWindow <em>Time Window</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.impl.EndImpl#getExpectedArrivalTime <em>Expected Arrival Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.impl.EndImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndImpl extends TourActivityImpl implements End {
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
	 * The default value of the '{@link #getExpectedArrivalTime() <em>Expected Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected static final double EXPECTED_ARRIVAL_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExpectedArrivalTime() <em>Expected Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected double expectedArrivalTime = EXPECTED_ARRIVAL_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
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
	protected EndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TourPackage.Literals.END;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TourPackage.END__TIME_WINDOW, oldTimeWindow, newTimeWindow);
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
				msgs = ((InternalEObject)timeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TourPackage.END__TIME_WINDOW, null, msgs);
			if (newTimeWindow != null)
				msgs = ((InternalEObject)newTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TourPackage.END__TIME_WINDOW, null, msgs);
			msgs = basicSetTimeWindow(newTimeWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TourPackage.END__TIME_WINDOW, newTimeWindow, newTimeWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExpectedArrivalTime() {
		return expectedArrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedArrivalTime(double newExpectedArrivalTime) {
		double oldExpectedArrivalTime = expectedArrivalTime;
		expectedArrivalTime = newExpectedArrivalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TourPackage.END__EXPECTED_ARRIVAL_TIME, oldExpectedArrivalTime, expectedArrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Link newLocation, NotificationChain msgs) {
		Link oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TourPackage.END__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Link newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TourPackage.END__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TourPackage.END__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TourPackage.END__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TourPackage.END__TIME_WINDOW:
				return basicSetTimeWindow(null, msgs);
			case TourPackage.END__LOCATION:
				return basicSetLocation(null, msgs);
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
			case TourPackage.END__TIME_WINDOW:
				return getTimeWindow();
			case TourPackage.END__EXPECTED_ARRIVAL_TIME:
				return getExpectedArrivalTime();
			case TourPackage.END__LOCATION:
				return getLocation();
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
			case TourPackage.END__TIME_WINDOW:
				setTimeWindow((TimeWindow)newValue);
				return;
			case TourPackage.END__EXPECTED_ARRIVAL_TIME:
				setExpectedArrivalTime((Double)newValue);
				return;
			case TourPackage.END__LOCATION:
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
			case TourPackage.END__TIME_WINDOW:
				setTimeWindow((TimeWindow)null);
				return;
			case TourPackage.END__EXPECTED_ARRIVAL_TIME:
				setExpectedArrivalTime(EXPECTED_ARRIVAL_TIME_EDEFAULT);
				return;
			case TourPackage.END__LOCATION:
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
			case TourPackage.END__TIME_WINDOW:
				return timeWindow != null;
			case TourPackage.END__EXPECTED_ARRIVAL_TIME:
				return expectedArrivalTime != EXPECTED_ARRIVAL_TIME_EDEFAULT;
			case TourPackage.END__LOCATION:
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
		result.append(" (expectedArrivalTime: ");
		result.append(expectedArrivalTime);
		result.append(')');
		return result.toString();
	}

} //EndImpl
