/**
 */
package CommonFreightTransportMetamodel.results.impl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticFacility;

import CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.results.FailedDeliveryAttempt;
import CommonFreightTransportMetamodel.results.ResultsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failed Delivery Attempt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.impl.FailedDeliveryAttemptImpl#getFailedDeliveryLocation <em>Failed Delivery Location</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.results.impl.FailedDeliveryAttemptImpl#getFailedDeliveryFacility <em>Failed Delivery Facility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailedDeliveryAttemptImpl extends ShipmentRecordEntryImpl implements FailedDeliveryAttempt {
	/**
	 * The cached value of the '{@link #getFailedDeliveryLocation() <em>Failed Delivery Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedDeliveryLocation()
	 * @generated
	 * @ordered
	 */
	protected Location_ failedDeliveryLocation;

	/**
	 * The cached value of the '{@link #getFailedDeliveryFacility() <em>Failed Delivery Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedDeliveryFacility()
	 * @generated
	 * @ordered
	 */
	protected LogisticFacility failedDeliveryFacility;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailedDeliveryAttemptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.FAILED_DELIVERY_ATTEMPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location_ getFailedDeliveryLocation() {
		return failedDeliveryLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailedDeliveryLocation(Location_ newFailedDeliveryLocation, NotificationChain msgs) {
		Location_ oldFailedDeliveryLocation = failedDeliveryLocation;
		failedDeliveryLocation = newFailedDeliveryLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION, oldFailedDeliveryLocation, newFailedDeliveryLocation);
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
	public void setFailedDeliveryLocation(Location_ newFailedDeliveryLocation) {
		if (newFailedDeliveryLocation != failedDeliveryLocation) {
			NotificationChain msgs = null;
			if (failedDeliveryLocation != null)
				msgs = ((InternalEObject)failedDeliveryLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION, null, msgs);
			if (newFailedDeliveryLocation != null)
				msgs = ((InternalEObject)newFailedDeliveryLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION, null, msgs);
			msgs = basicSetFailedDeliveryLocation(newFailedDeliveryLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION, newFailedDeliveryLocation, newFailedDeliveryLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticFacility getFailedDeliveryFacility() {
		if (failedDeliveryFacility != null && failedDeliveryFacility.eIsProxy()) {
			InternalEObject oldFailedDeliveryFacility = (InternalEObject)failedDeliveryFacility;
			failedDeliveryFacility = (LogisticFacility)eResolveProxy(oldFailedDeliveryFacility);
			if (failedDeliveryFacility != oldFailedDeliveryFacility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_FACILITY, oldFailedDeliveryFacility, failedDeliveryFacility));
			}
		}
		return failedDeliveryFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticFacility basicGetFailedDeliveryFacility() {
		return failedDeliveryFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailedDeliveryFacility(LogisticFacility newFailedDeliveryFacility) {
		LogisticFacility oldFailedDeliveryFacility = failedDeliveryFacility;
		failedDeliveryFacility = newFailedDeliveryFacility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_FACILITY, oldFailedDeliveryFacility, failedDeliveryFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION:
				return basicSetFailedDeliveryLocation(null, msgs);
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
			case ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION:
				return getFailedDeliveryLocation();
			case ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_FACILITY:
				if (resolve) return getFailedDeliveryFacility();
				return basicGetFailedDeliveryFacility();
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
			case ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION:
				setFailedDeliveryLocation((Location_)newValue);
				return;
			case ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_FACILITY:
				setFailedDeliveryFacility((LogisticFacility)newValue);
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
			case ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION:
				setFailedDeliveryLocation((Location_)null);
				return;
			case ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_FACILITY:
				setFailedDeliveryFacility((LogisticFacility)null);
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
			case ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION:
				return failedDeliveryLocation != null;
			case ResultsPackage.FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_FACILITY:
				return failedDeliveryFacility != null;
		}
		return super.eIsSet(featureID);
	}

} //FailedDeliveryAttemptImpl
