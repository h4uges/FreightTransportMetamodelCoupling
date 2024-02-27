/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.Timestamp_;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Inside Study Area Shipment Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.FromInsideStudyAreaShipmentBaseImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.FromInsideStudyAreaShipmentBaseImpl#getArrivalAtOrigin <em>Arrival At Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FromInsideStudyAreaShipmentBaseImpl extends MinimalEObjectImpl.Container implements FromInsideStudyAreaShipmentBase {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Location_ origin;

	/**
	 * The cached value of the '{@link #getArrivalAtOrigin() <em>Arrival At Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalAtOrigin()
	 * @generated
	 * @ordered
	 */
	protected Timestamp_ arrivalAtOrigin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromInsideStudyAreaShipmentBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticDemandPackage.Literals.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location_ getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (Location_)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location_ basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(Location_ newOrigin) {
		Location_ oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timestamp_ getArrivalAtOrigin() {
		return arrivalAtOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalAtOrigin(Timestamp_ newArrivalAtOrigin, NotificationChain msgs) {
		Timestamp_ oldArrivalAtOrigin = arrivalAtOrigin;
		arrivalAtOrigin = newArrivalAtOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN, oldArrivalAtOrigin, newArrivalAtOrigin);
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
	public void setArrivalAtOrigin(Timestamp_ newArrivalAtOrigin) {
		if (newArrivalAtOrigin != arrivalAtOrigin) {
			NotificationChain msgs = null;
			if (arrivalAtOrigin != null)
				msgs = ((InternalEObject)arrivalAtOrigin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN, null, msgs);
			if (newArrivalAtOrigin != null)
				msgs = ((InternalEObject)newArrivalAtOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN, null, msgs);
			msgs = basicSetArrivalAtOrigin(newArrivalAtOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN, newArrivalAtOrigin, newArrivalAtOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN:
				return basicSetArrivalAtOrigin(null, msgs);
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
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN:
				return getArrivalAtOrigin();
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
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN:
				setOrigin((Location_)newValue);
				return;
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN:
				setArrivalAtOrigin((Timestamp_)newValue);
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
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN:
				setOrigin((Location_)null);
				return;
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN:
				setArrivalAtOrigin((Timestamp_)null);
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
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN:
				return origin != null;
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN:
				return arrivalAtOrigin != null;
		}
		return super.eIsSet(featureID);
	}

} //FromInsideStudyAreaShipmentBaseImpl
