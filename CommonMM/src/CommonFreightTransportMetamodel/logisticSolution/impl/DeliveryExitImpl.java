/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticSolution.DeliveryExit;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery Exit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.DeliveryExitImpl#getDeliveryLeg <em>Delivery Leg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliveryExitImpl extends ShipmentExitImpl implements DeliveryExit {
	/**
	 * The cached value of the '{@link #getDeliveryLeg() <em>Delivery Leg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryLeg()
	 * @generated
	 * @ordered
	 */
	protected ShipmentRecordEntry deliveryLeg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryExitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticSolutionPackage.Literals.DELIVERY_EXIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentRecordEntry getDeliveryLeg() {
		if (deliveryLeg != null && deliveryLeg.eIsProxy()) {
			InternalEObject oldDeliveryLeg = (InternalEObject)deliveryLeg;
			deliveryLeg = (ShipmentRecordEntry)eResolveProxy(oldDeliveryLeg);
			if (deliveryLeg != oldDeliveryLeg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticSolutionPackage.DELIVERY_EXIT__DELIVERY_LEG, oldDeliveryLeg, deliveryLeg));
			}
		}
		return deliveryLeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentRecordEntry basicGetDeliveryLeg() {
		return deliveryLeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryLeg(ShipmentRecordEntry newDeliveryLeg) {
		ShipmentRecordEntry oldDeliveryLeg = deliveryLeg;
		deliveryLeg = newDeliveryLeg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.DELIVERY_EXIT__DELIVERY_LEG, oldDeliveryLeg, deliveryLeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogisticSolutionPackage.DELIVERY_EXIT__DELIVERY_LEG:
				if (resolve) return getDeliveryLeg();
				return basicGetDeliveryLeg();
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
			case LogisticSolutionPackage.DELIVERY_EXIT__DELIVERY_LEG:
				setDeliveryLeg((ShipmentRecordEntry)newValue);
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
			case LogisticSolutionPackage.DELIVERY_EXIT__DELIVERY_LEG:
				setDeliveryLeg((ShipmentRecordEntry)null);
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
			case LogisticSolutionPackage.DELIVERY_EXIT__DELIVERY_LEG:
				return deliveryLeg != null;
		}
		return super.eIsSet(featureID);
	}

} //DeliveryExitImpl
