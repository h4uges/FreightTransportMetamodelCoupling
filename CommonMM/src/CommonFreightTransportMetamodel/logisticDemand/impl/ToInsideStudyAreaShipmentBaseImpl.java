/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;
import CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.TimeWindow_;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Inside Study Area Shipment Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.ToInsideStudyAreaShipmentBaseImpl#getArrivalAtDestinationTimeWindow <em>Arrival At Destination Time Window</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.ToInsideStudyAreaShipmentBaseImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ToInsideStudyAreaShipmentBaseImpl extends MinimalEObjectImpl.Container implements ToInsideStudyAreaShipmentBase {
	/**
	 * The cached value of the '{@link #getArrivalAtDestinationTimeWindow() <em>Arrival At Destination Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalAtDestinationTimeWindow()
	 * @generated
	 * @ordered
	 */
	protected TimeWindow_ arrivalAtDestinationTimeWindow;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Location_ destination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToInsideStudyAreaShipmentBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticDemandPackage.Literals.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWindow_ getArrivalAtDestinationTimeWindow() {
		return arrivalAtDestinationTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalAtDestinationTimeWindow(TimeWindow_ newArrivalAtDestinationTimeWindow, NotificationChain msgs) {
		TimeWindow_ oldArrivalAtDestinationTimeWindow = arrivalAtDestinationTimeWindow;
		arrivalAtDestinationTimeWindow = newArrivalAtDestinationTimeWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW, oldArrivalAtDestinationTimeWindow, newArrivalAtDestinationTimeWindow);
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
	public void setArrivalAtDestinationTimeWindow(TimeWindow_ newArrivalAtDestinationTimeWindow) {
		if (newArrivalAtDestinationTimeWindow != arrivalAtDestinationTimeWindow) {
			NotificationChain msgs = null;
			if (arrivalAtDestinationTimeWindow != null)
				msgs = ((InternalEObject)arrivalAtDestinationTimeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW, null, msgs);
			if (newArrivalAtDestinationTimeWindow != null)
				msgs = ((InternalEObject)newArrivalAtDestinationTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW, null, msgs);
			msgs = basicSetArrivalAtDestinationTimeWindow(newArrivalAtDestinationTimeWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW, newArrivalAtDestinationTimeWindow, newArrivalAtDestinationTimeWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location_ getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (Location_)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location_ basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(Location_ newDestination) {
		Location_ oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				return basicSetArrivalAtDestinationTimeWindow(null, msgs);
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
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				return getArrivalAtDestinationTimeWindow();
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
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
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				setArrivalAtDestinationTimeWindow((TimeWindow_)newValue);
				return;
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION:
				setDestination((Location_)newValue);
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
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				setArrivalAtDestinationTimeWindow((TimeWindow_)null);
				return;
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION:
				setDestination((Location_)null);
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
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				return arrivalAtDestinationTimeWindow != null;
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION:
				return destination != null;
		}
		return super.eIsSet(featureID);
	}

} //ToInsideStudyAreaShipmentBaseImpl
