/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticFacility;

import CommonFreightTransportMetamodel.logisticSolution.LogisticFacilityStop;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logistic Facility Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticFacilityStopImpl#getLogisticFacility <em>Logistic Facility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogisticFacilityStopImpl extends PickUpDeliveryStopImpl implements LogisticFacilityStop {
	/**
	 * The cached value of the '{@link #getLogisticFacility() <em>Logistic Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogisticFacility()
	 * @generated
	 * @ordered
	 */
	protected LogisticFacility logisticFacility;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticFacilityStopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticSolutionPackage.Literals.LOGISTIC_FACILITY_STOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticFacility getLogisticFacility() {
		if (logisticFacility != null && logisticFacility.eIsProxy()) {
			InternalEObject oldLogisticFacility = (InternalEObject)logisticFacility;
			logisticFacility = (LogisticFacility)eResolveProxy(oldLogisticFacility);
			if (logisticFacility != oldLogisticFacility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticSolutionPackage.LOGISTIC_FACILITY_STOP__LOGISTIC_FACILITY, oldLogisticFacility, logisticFacility));
			}
		}
		return logisticFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticFacility basicGetLogisticFacility() {
		return logisticFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogisticFacility(LogisticFacility newLogisticFacility) {
		LogisticFacility oldLogisticFacility = logisticFacility;
		logisticFacility = newLogisticFacility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.LOGISTIC_FACILITY_STOP__LOGISTIC_FACILITY, oldLogisticFacility, logisticFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogisticSolutionPackage.LOGISTIC_FACILITY_STOP__LOGISTIC_FACILITY:
				if (resolve) return getLogisticFacility();
				return basicGetLogisticFacility();
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
			case LogisticSolutionPackage.LOGISTIC_FACILITY_STOP__LOGISTIC_FACILITY:
				setLogisticFacility((LogisticFacility)newValue);
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
			case LogisticSolutionPackage.LOGISTIC_FACILITY_STOP__LOGISTIC_FACILITY:
				setLogisticFacility((LogisticFacility)null);
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
			case LogisticSolutionPackage.LOGISTIC_FACILITY_STOP__LOGISTIC_FACILITY:
				return logisticFacility != null;
		}
		return super.eIsSet(featureID);
	}

} //LogisticFacilityStopImpl
