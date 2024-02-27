/**
 */
package logiToppMetamodel.logiTopp.distribution.chains.impl;

import logiToppMetamodel.base.Time;

import logiToppMetamodel.logiTopp.distribution.DistributionCenter;

import logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage;
import logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hub To Departure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.impl.HubToDepartureImpl#getHub <em>Hub</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.impl.HubToDepartureImpl#getDepature <em>Depature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HubToDepartureImpl extends MinimalEObjectImpl.Container implements HubToDeparture {
	/**
	 * The cached value of the '{@link #getHub() <em>Hub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHub()
	 * @generated
	 * @ordered
	 */
	protected DistributionCenter hub;

	/**
	 * The cached value of the '{@link #getDepature() <em>Depature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepature()
	 * @generated
	 * @ordered
	 */
	protected Time depature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HubToDepartureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChainsPackage.Literals.HUB_TO_DEPARTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistributionCenter getHub() {
		if (hub != null && hub.eIsProxy()) {
			InternalEObject oldHub = (InternalEObject)hub;
			hub = (DistributionCenter)eResolveProxy(oldHub);
			if (hub != oldHub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChainsPackage.HUB_TO_DEPARTURE__HUB, oldHub, hub));
			}
		}
		return hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionCenter basicGetHub() {
		return hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHub(DistributionCenter newHub) {
		DistributionCenter oldHub = hub;
		hub = newHub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChainsPackage.HUB_TO_DEPARTURE__HUB, oldHub, hub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getDepature() {
		if (depature != null && depature.eIsProxy()) {
			InternalEObject oldDepature = (InternalEObject)depature;
			depature = (Time)eResolveProxy(oldDepature);
			if (depature != oldDepature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChainsPackage.HUB_TO_DEPARTURE__DEPATURE, oldDepature, depature));
			}
		}
		return depature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetDepature() {
		return depature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepature(Time newDepature) {
		Time oldDepature = depature;
		depature = newDepature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChainsPackage.HUB_TO_DEPARTURE__DEPATURE, oldDepature, depature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChainsPackage.HUB_TO_DEPARTURE__HUB:
				if (resolve) return getHub();
				return basicGetHub();
			case ChainsPackage.HUB_TO_DEPARTURE__DEPATURE:
				if (resolve) return getDepature();
				return basicGetDepature();
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
			case ChainsPackage.HUB_TO_DEPARTURE__HUB:
				setHub((DistributionCenter)newValue);
				return;
			case ChainsPackage.HUB_TO_DEPARTURE__DEPATURE:
				setDepature((Time)newValue);
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
			case ChainsPackage.HUB_TO_DEPARTURE__HUB:
				setHub((DistributionCenter)null);
				return;
			case ChainsPackage.HUB_TO_DEPARTURE__DEPATURE:
				setDepature((Time)null);
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
			case ChainsPackage.HUB_TO_DEPARTURE__HUB:
				return hub != null;
			case ChainsPackage.HUB_TO_DEPARTURE__DEPATURE:
				return depature != null;
		}
		return super.eIsSet(featureID);
	}

} //HubToDepartureImpl
