/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;
import CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Inside Study Area Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.ToInsideStudyAreaShipmentImpl#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ToInsideStudyAreaShipmentImpl extends ToInsideStudyAreaShipmentBaseImpl implements ToInsideStudyAreaShipment {
	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer receiver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToInsideStudyAreaShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticDemandPackage.Literals.TO_INSIDE_STUDY_AREA_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiver(CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer newReceiver) {
		CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
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
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT__RECEIVER:
				setReceiver((CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer)newValue);
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
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT__RECEIVER:
				setReceiver((CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer)null);
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
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT__RECEIVER:
				return receiver != null;
		}
		return super.eIsSet(featureID);
	}

} //ToInsideStudyAreaShipmentImpl
