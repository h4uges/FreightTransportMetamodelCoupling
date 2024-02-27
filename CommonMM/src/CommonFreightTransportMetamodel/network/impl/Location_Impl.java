/**
 */
package CommonFreightTransportMetamodel.network.impl;

import CommonFreightTransportMetamodel.network.Location_;
import CommonFreightTransportMetamodel.network.NetworkAccess;
import CommonFreightTransportMetamodel.network.NetworkPackage;

import CommonFreightTransportMetamodel.utils.Coordinate;

import CommonFreightTransportMetamodel.utils.impl.HasId_Impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.network.impl.Location_Impl#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.network.impl.Location_Impl#getNetworkAccess <em>Network Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Location_Impl extends HasId_Impl implements Location_ {
	/**
	 * The cached value of the '{@link #getCoordinate() <em>Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinate()
	 * @generated
	 * @ordered
	 */
	protected Coordinate coordinate;

	/**
	 * The cached value of the '{@link #getNetworkAccess() <em>Network Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAccess()
	 * @generated
	 * @ordered
	 */
	protected NetworkAccess networkAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Location_Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.LOCATION_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coordinate getCoordinate() {
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinate(Coordinate newCoordinate, NotificationChain msgs) {
		Coordinate oldCoordinate = coordinate;
		coordinate = newCoordinate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkPackage.LOCATION___COORDINATE, oldCoordinate, newCoordinate);
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
	public void setCoordinate(Coordinate newCoordinate) {
		if (newCoordinate != coordinate) {
			NotificationChain msgs = null;
			if (coordinate != null)
				msgs = ((InternalEObject)coordinate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.LOCATION___COORDINATE, null, msgs);
			if (newCoordinate != null)
				msgs = ((InternalEObject)newCoordinate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.LOCATION___COORDINATE, null, msgs);
			msgs = basicSetCoordinate(newCoordinate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LOCATION___COORDINATE, newCoordinate, newCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkAccess getNetworkAccess() {
		return networkAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkAccess(NetworkAccess newNetworkAccess, NotificationChain msgs) {
		NetworkAccess oldNetworkAccess = networkAccess;
		networkAccess = newNetworkAccess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkPackage.LOCATION___NETWORK_ACCESS, oldNetworkAccess, newNetworkAccess);
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
	public void setNetworkAccess(NetworkAccess newNetworkAccess) {
		if (newNetworkAccess != networkAccess) {
			NotificationChain msgs = null;
			if (networkAccess != null)
				msgs = ((InternalEObject)networkAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.LOCATION___NETWORK_ACCESS, null, msgs);
			if (newNetworkAccess != null)
				msgs = ((InternalEObject)newNetworkAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.LOCATION___NETWORK_ACCESS, null, msgs);
			msgs = basicSetNetworkAccess(newNetworkAccess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LOCATION___NETWORK_ACCESS, newNetworkAccess, newNetworkAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkPackage.LOCATION___COORDINATE:
				return basicSetCoordinate(null, msgs);
			case NetworkPackage.LOCATION___NETWORK_ACCESS:
				return basicSetNetworkAccess(null, msgs);
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
			case NetworkPackage.LOCATION___COORDINATE:
				return getCoordinate();
			case NetworkPackage.LOCATION___NETWORK_ACCESS:
				return getNetworkAccess();
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
			case NetworkPackage.LOCATION___COORDINATE:
				setCoordinate((Coordinate)newValue);
				return;
			case NetworkPackage.LOCATION___NETWORK_ACCESS:
				setNetworkAccess((NetworkAccess)newValue);
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
			case NetworkPackage.LOCATION___COORDINATE:
				setCoordinate((Coordinate)null);
				return;
			case NetworkPackage.LOCATION___NETWORK_ACCESS:
				setNetworkAccess((NetworkAccess)null);
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
			case NetworkPackage.LOCATION___COORDINATE:
				return coordinate != null;
			case NetworkPackage.LOCATION___NETWORK_ACCESS:
				return networkAccess != null;
		}
		return super.eIsSet(featureID);
	}

} //Location_Impl
