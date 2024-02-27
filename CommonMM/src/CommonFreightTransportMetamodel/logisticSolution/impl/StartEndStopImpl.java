/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;
import CommonFreightTransportMetamodel.logisticSolution.StartEndStop;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start End Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.StartEndStopImpl#getDepot <em>Depot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartEndStopImpl extends StopImpl implements StartEndStop {
	/**
	 * The cached value of the '{@link #getDepot() <em>Depot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepot()
	 * @generated
	 * @ordered
	 */
	protected VehicleDepot depot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartEndStopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticSolutionPackage.Literals.START_END_STOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleDepot getDepot() {
		if (depot != null && depot.eIsProxy()) {
			InternalEObject oldDepot = (InternalEObject)depot;
			depot = (VehicleDepot)eResolveProxy(oldDepot);
			if (depot != oldDepot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticSolutionPackage.START_END_STOP__DEPOT, oldDepot, depot));
			}
		}
		return depot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleDepot basicGetDepot() {
		return depot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepot(VehicleDepot newDepot) {
		VehicleDepot oldDepot = depot;
		depot = newDepot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.START_END_STOP__DEPOT, oldDepot, depot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogisticSolutionPackage.START_END_STOP__DEPOT:
				if (resolve) return getDepot();
				return basicGetDepot();
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
			case LogisticSolutionPackage.START_END_STOP__DEPOT:
				setDepot((VehicleDepot)newValue);
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
			case LogisticSolutionPackage.START_END_STOP__DEPOT:
				setDepot((VehicleDepot)null);
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
			case LogisticSolutionPackage.START_END_STOP__DEPOT:
				return depot != null;
		}
		return super.eIsSet(featureID);
	}

} //StartEndStopImpl
