/**
 */
package CommonFreightTransportMetamodel.results.impl;

import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord;

import CommonFreightTransportMetamodel.results.ExecutedTour;
import CommonFreightTransportMetamodel.results.Results;
import CommonFreightTransportMetamodel.results.ResultsPackage;

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
 * An implementation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.impl.ResultsImpl#getShipmentRecords <em>Shipment Records</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.results.impl.ResultsImpl#getExecutedTours <em>Executed Tours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultsImpl extends MinimalEObjectImpl.Container implements Results {
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
	 * The cached value of the '{@link #getExecutedTours() <em>Executed Tours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedTours()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutedTour> executedTours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShipmentRecord> getShipmentRecords() {
		if (shipmentRecords == null) {
			shipmentRecords = new EObjectContainmentEList<ShipmentRecord>(ShipmentRecord.class, this, ResultsPackage.RESULTS__SHIPMENT_RECORDS);
		}
		return shipmentRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExecutedTour> getExecutedTours() {
		if (executedTours == null) {
			executedTours = new EObjectContainmentEList<ExecutedTour>(ExecutedTour.class, this, ResultsPackage.RESULTS__EXECUTED_TOURS);
		}
		return executedTours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.RESULTS__SHIPMENT_RECORDS:
				return ((InternalEList<?>)getShipmentRecords()).basicRemove(otherEnd, msgs);
			case ResultsPackage.RESULTS__EXECUTED_TOURS:
				return ((InternalEList<?>)getExecutedTours()).basicRemove(otherEnd, msgs);
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
			case ResultsPackage.RESULTS__SHIPMENT_RECORDS:
				return getShipmentRecords();
			case ResultsPackage.RESULTS__EXECUTED_TOURS:
				return getExecutedTours();
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
			case ResultsPackage.RESULTS__SHIPMENT_RECORDS:
				getShipmentRecords().clear();
				getShipmentRecords().addAll((Collection<? extends ShipmentRecord>)newValue);
				return;
			case ResultsPackage.RESULTS__EXECUTED_TOURS:
				getExecutedTours().clear();
				getExecutedTours().addAll((Collection<? extends ExecutedTour>)newValue);
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
			case ResultsPackage.RESULTS__SHIPMENT_RECORDS:
				getShipmentRecords().clear();
				return;
			case ResultsPackage.RESULTS__EXECUTED_TOURS:
				getExecutedTours().clear();
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
			case ResultsPackage.RESULTS__SHIPMENT_RECORDS:
				return shipmentRecords != null && !shipmentRecords.isEmpty();
			case ResultsPackage.RESULTS__EXECUTED_TOURS:
				return executedTours != null && !executedTours.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResultsImpl
