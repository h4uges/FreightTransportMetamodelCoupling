/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.impl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;
import CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.Dimension;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Service Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.PublicServicePointImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.PublicServicePointImpl#getStorageCapacity <em>Storage Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PublicServicePointImpl extends LogisticFacilityImpl implements PublicServicePoint {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location_ location;

	/**
	 * The cached value of the '{@link #getStorageCapacity() <em>Storage Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected Dimension storageCapacity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicServicePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticNetworkPackage.Literals.PUBLIC_SERVICE_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location_ getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location_ newLocation, NotificationChain msgs) {
		Location_ oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.PUBLIC_SERVICE_POINT__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Location_ newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.PUBLIC_SERVICE_POINT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.PUBLIC_SERVICE_POINT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.PUBLIC_SERVICE_POINT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension getStorageCapacity() {
		return storageCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorageCapacity(Dimension newStorageCapacity, NotificationChain msgs) {
		Dimension oldStorageCapacity = storageCapacity;
		storageCapacity = newStorageCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.PUBLIC_SERVICE_POINT__STORAGE_CAPACITY, oldStorageCapacity, newStorageCapacity);
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
	public void setStorageCapacity(Dimension newStorageCapacity) {
		if (newStorageCapacity != storageCapacity) {
			NotificationChain msgs = null;
			if (storageCapacity != null)
				msgs = ((InternalEObject)storageCapacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.PUBLIC_SERVICE_POINT__STORAGE_CAPACITY, null, msgs);
			if (newStorageCapacity != null)
				msgs = ((InternalEObject)newStorageCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.PUBLIC_SERVICE_POINT__STORAGE_CAPACITY, null, msgs);
			msgs = basicSetStorageCapacity(newStorageCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.PUBLIC_SERVICE_POINT__STORAGE_CAPACITY, newStorageCapacity, newStorageCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticNetworkPackage.PUBLIC_SERVICE_POINT__LOCATION:
				return basicSetLocation(null, msgs);
			case LogisticNetworkPackage.PUBLIC_SERVICE_POINT__STORAGE_CAPACITY:
				return basicSetStorageCapacity(null, msgs);
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
			case LogisticNetworkPackage.PUBLIC_SERVICE_POINT__LOCATION:
				return getLocation();
			case LogisticNetworkPackage.PUBLIC_SERVICE_POINT__STORAGE_CAPACITY:
				return getStorageCapacity();
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
			case LogisticNetworkPackage.PUBLIC_SERVICE_POINT__LOCATION:
				setLocation((Location_)newValue);
				return;
			case LogisticNetworkPackage.PUBLIC_SERVICE_POINT__STORAGE_CAPACITY:
				setStorageCapacity((Dimension)newValue);
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
			case LogisticNetworkPackage.PUBLIC_SERVICE_POINT__LOCATION:
				setLocation((Location_)null);
				return;
			case LogisticNetworkPackage.PUBLIC_SERVICE_POINT__STORAGE_CAPACITY:
				setStorageCapacity((Dimension)null);
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
			case LogisticNetworkPackage.PUBLIC_SERVICE_POINT__LOCATION:
				return location != null;
			case LogisticNetworkPackage.PUBLIC_SERVICE_POINT__STORAGE_CAPACITY:
				return storageCapacity != null;
		}
		return super.eIsSet(featureID);
	}

} //PublicServicePointImpl
