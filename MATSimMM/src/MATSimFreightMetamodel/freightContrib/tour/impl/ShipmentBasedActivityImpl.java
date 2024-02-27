/**
 */
package MATSimFreightMetamodel.freightContrib.tour.impl;

import MATSimFreightMetamodel.freightContrib.CarrierShipment;

import MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity;
import MATSimFreightMetamodel.freightContrib.tour.TourPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Based Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.impl.ShipmentBasedActivityImpl#getShipment <em>Shipment</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.impl.ShipmentBasedActivityImpl#getExpectedArrivalTime <em>Expected Arrival Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ShipmentBasedActivityImpl extends TourActivityImpl implements ShipmentBasedActivity {
	/**
	 * The cached value of the '{@link #getShipment() <em>Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipment()
	 * @generated
	 * @ordered
	 */
	protected CarrierShipment shipment;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentBasedActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TourPackage.Literals.SHIPMENT_BASED_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierShipment getShipment() {
		if (shipment != null && shipment.eIsProxy()) {
			InternalEObject oldShipment = (InternalEObject)shipment;
			shipment = (CarrierShipment)eResolveProxy(oldShipment);
			if (shipment != oldShipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TourPackage.SHIPMENT_BASED_ACTIVITY__SHIPMENT, oldShipment, shipment));
			}
		}
		return shipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierShipment basicGetShipment() {
		return shipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipment(CarrierShipment newShipment) {
		CarrierShipment oldShipment = shipment;
		shipment = newShipment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TourPackage.SHIPMENT_BASED_ACTIVITY__SHIPMENT, oldShipment, shipment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TourPackage.SHIPMENT_BASED_ACTIVITY__EXPECTED_ARRIVAL_TIME, oldExpectedArrivalTime, expectedArrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TourPackage.SHIPMENT_BASED_ACTIVITY__SHIPMENT:
				if (resolve) return getShipment();
				return basicGetShipment();
			case TourPackage.SHIPMENT_BASED_ACTIVITY__EXPECTED_ARRIVAL_TIME:
				return getExpectedArrivalTime();
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
			case TourPackage.SHIPMENT_BASED_ACTIVITY__SHIPMENT:
				setShipment((CarrierShipment)newValue);
				return;
			case TourPackage.SHIPMENT_BASED_ACTIVITY__EXPECTED_ARRIVAL_TIME:
				setExpectedArrivalTime((Double)newValue);
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
			case TourPackage.SHIPMENT_BASED_ACTIVITY__SHIPMENT:
				setShipment((CarrierShipment)null);
				return;
			case TourPackage.SHIPMENT_BASED_ACTIVITY__EXPECTED_ARRIVAL_TIME:
				setExpectedArrivalTime(EXPECTED_ARRIVAL_TIME_EDEFAULT);
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
			case TourPackage.SHIPMENT_BASED_ACTIVITY__SHIPMENT:
				return shipment != null;
			case TourPackage.SHIPMENT_BASED_ACTIVITY__EXPECTED_ARRIVAL_TIME:
				return expectedArrivalTime != EXPECTED_ARRIVAL_TIME_EDEFAULT;
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

} //ShipmentBasedActivityImpl
