/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolution;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;
import CommonFreightTransportMetamodel.logisticSolution.PlannedTour;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logistic Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionImpl#getShipmentRecords <em>Shipment Records</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionImpl#getTours <em>Tours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogisticSolutionImpl extends MinimalEObjectImpl.Container implements LogisticSolution {
	/**
	 * The cached value of the '{@link #getShipmentRecords() <em>Shipment Records</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<ShipmentRecord> shipmentRecords;

	/**
	 * The cached value of the '{@link #getTours() <em>Tours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTours()
	 * @generated
	 * @ordered
	 */
	protected EList<PlannedTour> tours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticSolutionPackage.Literals.LOGISTIC_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShipmentRecord> getShipmentRecords() {
		if (shipmentRecords == null) {
			shipmentRecords = new EObjectContainmentEList<ShipmentRecord>(ShipmentRecord.class, this, LogisticSolutionPackage.LOGISTIC_SOLUTION__SHIPMENT_RECORDS);
		}
		return shipmentRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlannedTour> getTours() {
		if (tours == null) {
			tours = new EObjectContainmentEList<PlannedTour>(PlannedTour.class, this, LogisticSolutionPackage.LOGISTIC_SOLUTION__TOURS);
		}
		return tours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticSolutionPackage.LOGISTIC_SOLUTION__SHIPMENT_RECORDS:
				return ((InternalEList<?>)getShipmentRecords()).basicRemove(otherEnd, msgs);
			case LogisticSolutionPackage.LOGISTIC_SOLUTION__TOURS:
				return ((InternalEList<?>)getTours()).basicRemove(otherEnd, msgs);
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
			case LogisticSolutionPackage.LOGISTIC_SOLUTION__SHIPMENT_RECORDS:
				return getShipmentRecords();
			case LogisticSolutionPackage.LOGISTIC_SOLUTION__TOURS:
				return getTours();
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
			case LogisticSolutionPackage.LOGISTIC_SOLUTION__SHIPMENT_RECORDS:
				getShipmentRecords().clear();
				getShipmentRecords().addAll((Collection<? extends ShipmentRecord>)newValue);
				return;
			case LogisticSolutionPackage.LOGISTIC_SOLUTION__TOURS:
				getTours().clear();
				getTours().addAll((Collection<? extends PlannedTour>)newValue);
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
			case LogisticSolutionPackage.LOGISTIC_SOLUTION__SHIPMENT_RECORDS:
				getShipmentRecords().clear();
				return;
			case LogisticSolutionPackage.LOGISTIC_SOLUTION__TOURS:
				getTours().clear();
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
			case LogisticSolutionPackage.LOGISTIC_SOLUTION__SHIPMENT_RECORDS:
				return shipmentRecords != null && !shipmentRecords.isEmpty();
			case LogisticSolutionPackage.LOGISTIC_SOLUTION__TOURS:
				return tours != null && !tours.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogisticSolutionImpl
