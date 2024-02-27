/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.logisticDemand.FromOutsideStudyAreaShipment;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;

import CommonFreightTransportMetamodel.utils.Timestamp_;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Outside Study Area Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.FromOutsideStudyAreaShipmentImpl#getArrivalAtOriginDepot <em>Arrival At Origin Depot</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FromOutsideStudyAreaShipmentImpl extends MinimalEObjectImpl.Container implements FromOutsideStudyAreaShipment {
	/**
	 * The cached value of the '{@link #getArrivalAtOriginDepot() <em>Arrival At Origin Depot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalAtOriginDepot()
	 * @generated
	 * @ordered
	 */
	protected Timestamp_ arrivalAtOriginDepot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromOutsideStudyAreaShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticDemandPackage.Literals.FROM_OUTSIDE_STUDY_AREA_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timestamp_ getArrivalAtOriginDepot() {
		return arrivalAtOriginDepot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalAtOriginDepot(Timestamp_ newArrivalAtOriginDepot, NotificationChain msgs) {
		Timestamp_ oldArrivalAtOriginDepot = arrivalAtOriginDepot;
		arrivalAtOriginDepot = newArrivalAtOriginDepot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT, oldArrivalAtOriginDepot, newArrivalAtOriginDepot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrivalAtOriginDepot(Timestamp_ newArrivalAtOriginDepot) {
		if (newArrivalAtOriginDepot != arrivalAtOriginDepot) {
			NotificationChain msgs = null;
			if (arrivalAtOriginDepot != null)
				msgs = ((InternalEObject)arrivalAtOriginDepot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT, null, msgs);
			if (newArrivalAtOriginDepot != null)
				msgs = ((InternalEObject)newArrivalAtOriginDepot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT, null, msgs);
			msgs = basicSetArrivalAtOriginDepot(newArrivalAtOriginDepot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT, newArrivalAtOriginDepot, newArrivalAtOriginDepot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticDemandPackage.FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT:
				return basicSetArrivalAtOriginDepot(null, msgs);
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
			case LogisticDemandPackage.FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT:
				return getArrivalAtOriginDepot();
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
			case LogisticDemandPackage.FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT:
				setArrivalAtOriginDepot((Timestamp_)newValue);
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
			case LogisticDemandPackage.FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT:
				setArrivalAtOriginDepot((Timestamp_)null);
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
			case LogisticDemandPackage.FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT:
				return arrivalAtOriginDepot != null;
		}
		return super.eIsSet(featureID);
	}

} //FromOutsideStudyAreaShipmentImpl
