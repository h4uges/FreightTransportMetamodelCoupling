/**
 */
package CommonFreightTransportMetamodel.network.impl;

import CommonFreightTransportMetamodel.network.NetworkPackage;
import CommonFreightTransportMetamodel.network.Node;

import CommonFreightTransportMetamodel.utils.Coordinate;

import CommonFreightTransportMetamodel.utils.impl.HasId_Impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.network.impl.NodeImpl#getCoordinate <em>Coordinate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends HasId_Impl implements Node {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.NODE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkPackage.NODE__COORDINATE, oldCoordinate, newCoordinate);
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
				msgs = ((InternalEObject)coordinate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.NODE__COORDINATE, null, msgs);
			if (newCoordinate != null)
				msgs = ((InternalEObject)newCoordinate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.NODE__COORDINATE, null, msgs);
			msgs = basicSetCoordinate(newCoordinate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.NODE__COORDINATE, newCoordinate, newCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkPackage.NODE__COORDINATE:
				return basicSetCoordinate(null, msgs);
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
			case NetworkPackage.NODE__COORDINATE:
				return getCoordinate();
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
			case NetworkPackage.NODE__COORDINATE:
				setCoordinate((Coordinate)newValue);
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
			case NetworkPackage.NODE__COORDINATE:
				setCoordinate((Coordinate)null);
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
			case NetworkPackage.NODE__COORDINATE:
				return coordinate != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
