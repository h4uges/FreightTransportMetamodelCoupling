/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticDemand.Shipment;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;
import CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pick Up Delivery Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.PickUpDeliveryStopImpl#getUnloadedShipments <em>Unloaded Shipments</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.PickUpDeliveryStopImpl#getLoadedShipments <em>Loaded Shipments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PickUpDeliveryStopImpl extends StopImpl implements PickUpDeliveryStop {
	/**
	 * The cached value of the '{@link #getUnloadedShipments() <em>Unloaded Shipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnloadedShipments()
	 * @generated
	 * @ordered
	 */
	protected EList<Shipment> unloadedShipments;

	/**
	 * The cached value of the '{@link #getLoadedShipments() <em>Loaded Shipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadedShipments()
	 * @generated
	 * @ordered
	 */
	protected EList<Shipment> loadedShipments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PickUpDeliveryStopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticSolutionPackage.Literals.PICK_UP_DELIVERY_STOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Shipment> getUnloadedShipments() {
		if (unloadedShipments == null) {
			unloadedShipments = new EObjectResolvingEList<Shipment>(Shipment.class, this, LogisticSolutionPackage.PICK_UP_DELIVERY_STOP__UNLOADED_SHIPMENTS);
		}
		return unloadedShipments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Shipment> getLoadedShipments() {
		if (loadedShipments == null) {
			loadedShipments = new EObjectResolvingEList<Shipment>(Shipment.class, this, LogisticSolutionPackage.PICK_UP_DELIVERY_STOP__LOADED_SHIPMENTS);
		}
		return loadedShipments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogisticSolutionPackage.PICK_UP_DELIVERY_STOP__UNLOADED_SHIPMENTS:
				return getUnloadedShipments();
			case LogisticSolutionPackage.PICK_UP_DELIVERY_STOP__LOADED_SHIPMENTS:
				return getLoadedShipments();
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
			case LogisticSolutionPackage.PICK_UP_DELIVERY_STOP__UNLOADED_SHIPMENTS:
				getUnloadedShipments().clear();
				getUnloadedShipments().addAll((Collection<? extends Shipment>)newValue);
				return;
			case LogisticSolutionPackage.PICK_UP_DELIVERY_STOP__LOADED_SHIPMENTS:
				getLoadedShipments().clear();
				getLoadedShipments().addAll((Collection<? extends Shipment>)newValue);
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
			case LogisticSolutionPackage.PICK_UP_DELIVERY_STOP__UNLOADED_SHIPMENTS:
				getUnloadedShipments().clear();
				return;
			case LogisticSolutionPackage.PICK_UP_DELIVERY_STOP__LOADED_SHIPMENTS:
				getLoadedShipments().clear();
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
			case LogisticSolutionPackage.PICK_UP_DELIVERY_STOP__UNLOADED_SHIPMENTS:
				return unloadedShipments != null && !unloadedShipments.isEmpty();
			case LogisticSolutionPackage.PICK_UP_DELIVERY_STOP__LOADED_SHIPMENTS:
				return loadedShipments != null && !loadedShipments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PickUpDeliveryStopImpl
