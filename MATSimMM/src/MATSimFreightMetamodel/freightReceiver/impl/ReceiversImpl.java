/**
 */
package MATSimFreightMetamodel.freightReceiver.impl;

import MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage;
import MATSimFreightMetamodel.freightReceiver.ProductType;
import MATSimFreightMetamodel.freightReceiver.Receiver;
import MATSimFreightMetamodel.freightReceiver.Receivers;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receivers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiversImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiversImpl#getProductTypes <em>Product Types</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiversImpl#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiversImpl extends MinimalEObjectImpl.Container implements Receivers {
	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Receiver> receivers;

	/**
	 * The cached value of the '{@link #getProductTypes() <em>Product Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductType> productTypes;

	/**
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiversImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightReceiverPackage.Literals.RECEIVERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Receiver> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectContainmentEList<Receiver>(Receiver.class, this, FreightReceiverPackage.RECEIVERS__RECEIVERS);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductType> getProductTypes() {
		if (productTypes == null) {
			productTypes = new EObjectContainmentEList<ProductType>(ProductType.class, this, FreightReceiverPackage.RECEIVERS__PRODUCT_TYPES);
		}
		return productTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.RECEIVERS__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreightReceiverPackage.RECEIVERS__RECEIVERS:
				return ((InternalEList<?>)getReceivers()).basicRemove(otherEnd, msgs);
			case FreightReceiverPackage.RECEIVERS__PRODUCT_TYPES:
				return ((InternalEList<?>)getProductTypes()).basicRemove(otherEnd, msgs);
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
			case FreightReceiverPackage.RECEIVERS__RECEIVERS:
				return getReceivers();
			case FreightReceiverPackage.RECEIVERS__PRODUCT_TYPES:
				return getProductTypes();
			case FreightReceiverPackage.RECEIVERS__DESC:
				return getDesc();
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
			case FreightReceiverPackage.RECEIVERS__RECEIVERS:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends Receiver>)newValue);
				return;
			case FreightReceiverPackage.RECEIVERS__PRODUCT_TYPES:
				getProductTypes().clear();
				getProductTypes().addAll((Collection<? extends ProductType>)newValue);
				return;
			case FreightReceiverPackage.RECEIVERS__DESC:
				setDesc((String)newValue);
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
			case FreightReceiverPackage.RECEIVERS__RECEIVERS:
				getReceivers().clear();
				return;
			case FreightReceiverPackage.RECEIVERS__PRODUCT_TYPES:
				getProductTypes().clear();
				return;
			case FreightReceiverPackage.RECEIVERS__DESC:
				setDesc(DESC_EDEFAULT);
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
			case FreightReceiverPackage.RECEIVERS__RECEIVERS:
				return receivers != null && !receivers.isEmpty();
			case FreightReceiverPackage.RECEIVERS__PRODUCT_TYPES:
				return productTypes != null && !productTypes.isEmpty();
			case FreightReceiverPackage.RECEIVERS__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (desc: ");
		result.append(desc);
		result.append(')');
		return result.toString();
	}

} //ReceiversImpl
