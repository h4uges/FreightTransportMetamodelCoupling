/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipment;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Inside Study Area Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.FromInsideStudyAreaShipmentImpl#getProducer <em>Producer</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FromInsideStudyAreaShipmentImpl extends FromInsideStudyAreaShipmentBaseImpl implements FromInsideStudyAreaShipment {
	/**
	 * The cached value of the '{@link #getProducer() <em>Producer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducer()
	 * @generated
	 * @ordered
	 */
	protected CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer producer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromInsideStudyAreaShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticDemandPackage.Literals.FROM_INSIDE_STUDY_AREA_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer getProducer() {
		if (producer != null && producer.eIsProxy()) {
			InternalEObject oldProducer = (InternalEObject)producer;
			producer = (CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer)eResolveProxy(oldProducer);
			if (producer != oldProducer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT__PRODUCER, oldProducer, producer));
			}
		}
		return producer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer basicGetProducer() {
		return producer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProducer(CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer newProducer) {
		CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer oldProducer = producer;
		producer = newProducer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT__PRODUCER, oldProducer, producer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT__PRODUCER:
				if (resolve) return getProducer();
				return basicGetProducer();
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
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT__PRODUCER:
				setProducer((CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer)newValue);
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
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT__PRODUCER:
				setProducer((CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer)null);
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
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT__PRODUCER:
				return producer != null;
		}
		return super.eIsSet(featureID);
	}

} //FromInsideStudyAreaShipmentImpl
