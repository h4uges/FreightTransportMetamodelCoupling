/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;
import CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment;

import CommonFreightTransportMetamodel.utils.TimeWindow_;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Outside Study Area Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.ToOutsideStudyAreaShipmentImpl#getArrivalAtDepotTimeWindow <em>Arrival At Depot Time Window</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ToOutsideStudyAreaShipmentImpl extends MinimalEObjectImpl.Container implements ToOutsideStudyAreaShipment {
	/**
	 * The cached value of the '{@link #getArrivalAtDepotTimeWindow() <em>Arrival At Depot Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalAtDepotTimeWindow()
	 * @generated
	 * @ordered
	 */
	protected TimeWindow_ arrivalAtDepotTimeWindow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToOutsideStudyAreaShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticDemandPackage.Literals.TO_OUTSIDE_STUDY_AREA_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWindow_ getArrivalAtDepotTimeWindow() {
		return arrivalAtDepotTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalAtDepotTimeWindow(TimeWindow_ newArrivalAtDepotTimeWindow, NotificationChain msgs) {
		TimeWindow_ oldArrivalAtDepotTimeWindow = arrivalAtDepotTimeWindow;
		arrivalAtDepotTimeWindow = newArrivalAtDepotTimeWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW, oldArrivalAtDepotTimeWindow, newArrivalAtDepotTimeWindow);
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
	public void setArrivalAtDepotTimeWindow(TimeWindow_ newArrivalAtDepotTimeWindow) {
		if (newArrivalAtDepotTimeWindow != arrivalAtDepotTimeWindow) {
			NotificationChain msgs = null;
			if (arrivalAtDepotTimeWindow != null)
				msgs = ((InternalEObject)arrivalAtDepotTimeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW, null, msgs);
			if (newArrivalAtDepotTimeWindow != null)
				msgs = ((InternalEObject)newArrivalAtDepotTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW, null, msgs);
			msgs = basicSetArrivalAtDepotTimeWindow(newArrivalAtDepotTimeWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW, newArrivalAtDepotTimeWindow, newArrivalAtDepotTimeWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW:
				return basicSetArrivalAtDepotTimeWindow(null, msgs);
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
			case LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW:
				return getArrivalAtDepotTimeWindow();
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
			case LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW:
				setArrivalAtDepotTimeWindow((TimeWindow_)newValue);
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
			case LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW:
				setArrivalAtDepotTimeWindow((TimeWindow_)null);
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
			case LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW:
				return arrivalAtDepotTimeWindow != null;
		}
		return super.eIsSet(featureID);
	}

} //ToOutsideStudyAreaShipmentImpl
