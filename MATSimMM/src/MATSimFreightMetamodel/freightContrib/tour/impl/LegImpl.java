/**
 */
package MATSimFreightMetamodel.freightContrib.tour.impl;

import MATSimFreightMetamodel.freightContrib.tour.Leg;
import MATSimFreightMetamodel.freightContrib.tour.TourPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.impl.LegImpl#getExpectedTransportTime <em>Expected Transport Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.impl.LegImpl#getExpectedDepartureTime <em>Expected Departure Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegImpl extends TourElementImpl implements Leg {
	/**
	 * The default value of the '{@link #getExpectedTransportTime() <em>Expected Transport Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedTransportTime()
	 * @generated
	 * @ordered
	 */
	protected static final double EXPECTED_TRANSPORT_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExpectedTransportTime() <em>Expected Transport Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedTransportTime()
	 * @generated
	 * @ordered
	 */
	protected double expectedTransportTime = EXPECTED_TRANSPORT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedDepartureTime() <em>Expected Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected static final double EXPECTED_DEPARTURE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExpectedDepartureTime() <em>Expected Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected double expectedDepartureTime = EXPECTED_DEPARTURE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TourPackage.Literals.LEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExpectedTransportTime() {
		return expectedTransportTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedTransportTime(double newExpectedTransportTime) {
		double oldExpectedTransportTime = expectedTransportTime;
		expectedTransportTime = newExpectedTransportTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TourPackage.LEG__EXPECTED_TRANSPORT_TIME, oldExpectedTransportTime, expectedTransportTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExpectedDepartureTime() {
		return expectedDepartureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedDepartureTime(double newExpectedDepartureTime) {
		double oldExpectedDepartureTime = expectedDepartureTime;
		expectedDepartureTime = newExpectedDepartureTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TourPackage.LEG__EXPECTED_DEPARTURE_TIME, oldExpectedDepartureTime, expectedDepartureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TourPackage.LEG__EXPECTED_TRANSPORT_TIME:
				return getExpectedTransportTime();
			case TourPackage.LEG__EXPECTED_DEPARTURE_TIME:
				return getExpectedDepartureTime();
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
			case TourPackage.LEG__EXPECTED_TRANSPORT_TIME:
				setExpectedTransportTime((Double)newValue);
				return;
			case TourPackage.LEG__EXPECTED_DEPARTURE_TIME:
				setExpectedDepartureTime((Double)newValue);
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
			case TourPackage.LEG__EXPECTED_TRANSPORT_TIME:
				setExpectedTransportTime(EXPECTED_TRANSPORT_TIME_EDEFAULT);
				return;
			case TourPackage.LEG__EXPECTED_DEPARTURE_TIME:
				setExpectedDepartureTime(EXPECTED_DEPARTURE_TIME_EDEFAULT);
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
			case TourPackage.LEG__EXPECTED_TRANSPORT_TIME:
				return expectedTransportTime != EXPECTED_TRANSPORT_TIME_EDEFAULT;
			case TourPackage.LEG__EXPECTED_DEPARTURE_TIME:
				return expectedDepartureTime != EXPECTED_DEPARTURE_TIME_EDEFAULT;
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
		result.append(" (expectedTransportTime: ");
		result.append(expectedTransportTime);
		result.append(", expectedDepartureTime: ");
		result.append(expectedDepartureTime);
		result.append(')');
		return result.toString();
	}

} //LegImpl
