/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.impl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;
import CommonFreightTransportMetamodel.logisticNetwork.Shop;

import CommonFreightTransportMetamodel.utils.TimeWindow_;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.ShopImpl#getOpeningHours <em>Opening Hours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShopImpl extends PublicServicePointImpl implements Shop {
	/**
	 * The cached value of the '{@link #getOpeningHours() <em>Opening Hours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningHours()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeWindow_> openingHours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticNetworkPackage.Literals.SHOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeWindow_> getOpeningHours() {
		if (openingHours == null) {
			openingHours = new EObjectContainmentEList<TimeWindow_>(TimeWindow_.class, this, LogisticNetworkPackage.SHOP__OPENING_HOURS);
		}
		return openingHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticNetworkPackage.SHOP__OPENING_HOURS:
				return ((InternalEList<?>)getOpeningHours()).basicRemove(otherEnd, msgs);
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
			case LogisticNetworkPackage.SHOP__OPENING_HOURS:
				return getOpeningHours();
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
			case LogisticNetworkPackage.SHOP__OPENING_HOURS:
				getOpeningHours().clear();
				getOpeningHours().addAll((Collection<? extends TimeWindow_>)newValue);
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
			case LogisticNetworkPackage.SHOP__OPENING_HOURS:
				getOpeningHours().clear();
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
			case LogisticNetworkPackage.SHOP__OPENING_HOURS:
				return openingHours != null && !openingHours.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShopImpl
