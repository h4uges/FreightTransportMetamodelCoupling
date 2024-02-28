/**
 */
package logiToppMetamodel.logiTopp.distribution.region.impl;

import java.util.Collection;

import logiToppMetamodel.logiTopp.distribution.DistributionCenter;

import logiToppMetamodel.logiTopp.distribution.region.RegionPackage;
import logiToppMetamodel.logiTopp.distribution.region.RegionalReach;
import logiToppMetamodel.logiTopp.distribution.region.ServiceArea;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regional Reach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.region.impl.RegionalReachImpl#getServiceArea <em>Service Area</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.region.impl.RegionalReachImpl#getRelatedDeliveryHubs <em>Related Delivery Hubs</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.region.impl.RegionalReachImpl#getRelatedPickUpHubs <em>Related Pick Up Hubs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionalReachImpl extends MinimalEObjectImpl.Container implements RegionalReach {
	/**
	 * The cached value of the '{@link #getServiceArea() <em>Service Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceArea()
	 * @generated
	 * @ordered
	 */
	protected ServiceArea serviceArea;

	/**
	 * The cached value of the '{@link #getRelatedDeliveryHubs() <em>Related Delivery Hubs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDeliveryHubs()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionCenter> relatedDeliveryHubs;

	/**
	 * The cached value of the '{@link #getRelatedPickUpHubs() <em>Related Pick Up Hubs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedPickUpHubs()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionCenter> relatedPickUpHubs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalReachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegionPackage.Literals.REGIONAL_REACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceArea getServiceArea() {
		return serviceArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceArea(ServiceArea newServiceArea, NotificationChain msgs) {
		ServiceArea oldServiceArea = serviceArea;
		serviceArea = newServiceArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegionPackage.REGIONAL_REACH__SERVICE_AREA, oldServiceArea, newServiceArea);
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
	public void setServiceArea(ServiceArea newServiceArea) {
		if (newServiceArea != serviceArea) {
			NotificationChain msgs = null;
			if (serviceArea != null)
				msgs = ((InternalEObject)serviceArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegionPackage.REGIONAL_REACH__SERVICE_AREA, null, msgs);
			if (newServiceArea != null)
				msgs = ((InternalEObject)newServiceArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegionPackage.REGIONAL_REACH__SERVICE_AREA, null, msgs);
			msgs = basicSetServiceArea(newServiceArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegionPackage.REGIONAL_REACH__SERVICE_AREA, newServiceArea, newServiceArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DistributionCenter> getRelatedDeliveryHubs() {
		if (relatedDeliveryHubs == null) {
			relatedDeliveryHubs = new EObjectResolvingEList<DistributionCenter>(DistributionCenter.class, this, RegionPackage.REGIONAL_REACH__RELATED_DELIVERY_HUBS);
		}
		return relatedDeliveryHubs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DistributionCenter> getRelatedPickUpHubs() {
		if (relatedPickUpHubs == null) {
			relatedPickUpHubs = new EObjectResolvingEList<DistributionCenter>(DistributionCenter.class, this, RegionPackage.REGIONAL_REACH__RELATED_PICK_UP_HUBS);
		}
		return relatedPickUpHubs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegionPackage.REGIONAL_REACH__SERVICE_AREA:
				return basicSetServiceArea(null, msgs);
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
			case RegionPackage.REGIONAL_REACH__SERVICE_AREA:
				return getServiceArea();
			case RegionPackage.REGIONAL_REACH__RELATED_DELIVERY_HUBS:
				return getRelatedDeliveryHubs();
			case RegionPackage.REGIONAL_REACH__RELATED_PICK_UP_HUBS:
				return getRelatedPickUpHubs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RegionPackage.REGIONAL_REACH__SERVICE_AREA:
				setServiceArea((ServiceArea)newValue);
				return;
			case RegionPackage.REGIONAL_REACH__RELATED_DELIVERY_HUBS:
				getRelatedDeliveryHubs().clear();
				getRelatedDeliveryHubs().addAll((Collection<? extends DistributionCenter>)newValue);
				return;
			case RegionPackage.REGIONAL_REACH__RELATED_PICK_UP_HUBS:
				getRelatedPickUpHubs().clear();
				getRelatedPickUpHubs().addAll((Collection<? extends DistributionCenter>)newValue);
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
			case RegionPackage.REGIONAL_REACH__SERVICE_AREA:
				setServiceArea((ServiceArea)null);
				return;
			case RegionPackage.REGIONAL_REACH__RELATED_DELIVERY_HUBS:
				getRelatedDeliveryHubs().clear();
				return;
			case RegionPackage.REGIONAL_REACH__RELATED_PICK_UP_HUBS:
				getRelatedPickUpHubs().clear();
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
			case RegionPackage.REGIONAL_REACH__SERVICE_AREA:
				return serviceArea != null;
			case RegionPackage.REGIONAL_REACH__RELATED_DELIVERY_HUBS:
				return relatedDeliveryHubs != null && !relatedDeliveryHubs.isEmpty();
			case RegionPackage.REGIONAL_REACH__RELATED_PICK_UP_HUBS:
				return relatedPickUpHubs != null && !relatedPickUpHubs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegionalReachImpl
