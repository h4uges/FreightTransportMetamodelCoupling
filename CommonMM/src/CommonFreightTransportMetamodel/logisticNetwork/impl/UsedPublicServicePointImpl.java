/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.impl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;
import CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint;
import CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint;

import CommonFreightTransportMetamodel.utils.Dimension;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Used Public Service Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.UsedPublicServicePointImpl#getPublicServicePoint <em>Public Service Point</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.UsedPublicServicePointImpl#getGrantedStorageCapacity <em>Granted Storage Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsedPublicServicePointImpl extends MinimalEObjectImpl.Container implements UsedPublicServicePoint {
	/**
	 * The cached value of the '{@link #getPublicServicePoint() <em>Public Service Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicServicePoint()
	 * @generated
	 * @ordered
	 */
	protected PublicServicePoint publicServicePoint;

	/**
	 * The cached value of the '{@link #getGrantedStorageCapacity() <em>Granted Storage Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrantedStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected Dimension grantedStorageCapacity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsedPublicServicePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticNetworkPackage.Literals.USED_PUBLIC_SERVICE_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicServicePoint getPublicServicePoint() {
		if (publicServicePoint != null && publicServicePoint.eIsProxy()) {
			InternalEObject oldPublicServicePoint = (InternalEObject)publicServicePoint;
			publicServicePoint = (PublicServicePoint)eResolveProxy(oldPublicServicePoint);
			if (publicServicePoint != oldPublicServicePoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__PUBLIC_SERVICE_POINT, oldPublicServicePoint, publicServicePoint));
			}
		}
		return publicServicePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicServicePoint basicGetPublicServicePoint() {
		return publicServicePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicServicePoint(PublicServicePoint newPublicServicePoint) {
		PublicServicePoint oldPublicServicePoint = publicServicePoint;
		publicServicePoint = newPublicServicePoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__PUBLIC_SERVICE_POINT, oldPublicServicePoint, publicServicePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension getGrantedStorageCapacity() {
		return grantedStorageCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrantedStorageCapacity(Dimension newGrantedStorageCapacity, NotificationChain msgs) {
		Dimension oldGrantedStorageCapacity = grantedStorageCapacity;
		grantedStorageCapacity = newGrantedStorageCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY, oldGrantedStorageCapacity, newGrantedStorageCapacity);
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
	public void setGrantedStorageCapacity(Dimension newGrantedStorageCapacity) {
		if (newGrantedStorageCapacity != grantedStorageCapacity) {
			NotificationChain msgs = null;
			if (grantedStorageCapacity != null)
				msgs = ((InternalEObject)grantedStorageCapacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY, null, msgs);
			if (newGrantedStorageCapacity != null)
				msgs = ((InternalEObject)newGrantedStorageCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY, null, msgs);
			msgs = basicSetGrantedStorageCapacity(newGrantedStorageCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY, newGrantedStorageCapacity, newGrantedStorageCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY:
				return basicSetGrantedStorageCapacity(null, msgs);
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
			case LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__PUBLIC_SERVICE_POINT:
				if (resolve) return getPublicServicePoint();
				return basicGetPublicServicePoint();
			case LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY:
				return getGrantedStorageCapacity();
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
			case LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__PUBLIC_SERVICE_POINT:
				setPublicServicePoint((PublicServicePoint)newValue);
				return;
			case LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY:
				setGrantedStorageCapacity((Dimension)newValue);
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
			case LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__PUBLIC_SERVICE_POINT:
				setPublicServicePoint((PublicServicePoint)null);
				return;
			case LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY:
				setGrantedStorageCapacity((Dimension)null);
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
			case LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__PUBLIC_SERVICE_POINT:
				return publicServicePoint != null;
			case LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY:
				return grantedStorageCapacity != null;
		}
		return super.eIsSet(featureID);
	}

} //UsedPublicServicePointImpl
