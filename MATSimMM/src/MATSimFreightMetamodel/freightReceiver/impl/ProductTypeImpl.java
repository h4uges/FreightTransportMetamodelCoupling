/**
 */
package MATSimFreightMetamodel.freightReceiver.impl;

import MATSimFreightMetamodel.base.impl.EntityImpl;

import MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage;
import MATSimFreightMetamodel.freightReceiver.ProductType;

import MATSimFreightMetamodel.matsim.core.network.Link;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ProductTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ProductTypeImpl#getReqCapacity <em>Req Capacity</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ProductTypeImpl#getOriginLink <em>Origin Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductTypeImpl extends EntityImpl implements ProductType {
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
	 * The default value of the '{@link #getReqCapacity() <em>Req Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double REQ_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReqCapacity() <em>Req Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqCapacity()
	 * @generated
	 * @ordered
	 */
	protected double reqCapacity = REQ_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOriginLink() <em>Origin Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginLink()
	 * @generated
	 * @ordered
	 */
	protected Link originLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightReceiverPackage.Literals.PRODUCT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.PRODUCT_TYPE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getReqCapacity() {
		return reqCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReqCapacity(double newReqCapacity) {
		double oldReqCapacity = reqCapacity;
		reqCapacity = newReqCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.PRODUCT_TYPE__REQ_CAPACITY, oldReqCapacity, reqCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getOriginLink() {
		if (originLink != null && originLink.eIsProxy()) {
			InternalEObject oldOriginLink = (InternalEObject)originLink;
			originLink = (Link)eResolveProxy(oldOriginLink);
			if (originLink != oldOriginLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreightReceiverPackage.PRODUCT_TYPE__ORIGIN_LINK, oldOriginLink, originLink));
			}
		}
		return originLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetOriginLink() {
		return originLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginLink(Link newOriginLink) {
		Link oldOriginLink = originLink;
		originLink = newOriginLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.PRODUCT_TYPE__ORIGIN_LINK, oldOriginLink, originLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreightReceiverPackage.PRODUCT_TYPE__DESC:
				return getDesc();
			case FreightReceiverPackage.PRODUCT_TYPE__REQ_CAPACITY:
				return getReqCapacity();
			case FreightReceiverPackage.PRODUCT_TYPE__ORIGIN_LINK:
				if (resolve) return getOriginLink();
				return basicGetOriginLink();
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
			case FreightReceiverPackage.PRODUCT_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case FreightReceiverPackage.PRODUCT_TYPE__REQ_CAPACITY:
				setReqCapacity((Double)newValue);
				return;
			case FreightReceiverPackage.PRODUCT_TYPE__ORIGIN_LINK:
				setOriginLink((Link)newValue);
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
			case FreightReceiverPackage.PRODUCT_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case FreightReceiverPackage.PRODUCT_TYPE__REQ_CAPACITY:
				setReqCapacity(REQ_CAPACITY_EDEFAULT);
				return;
			case FreightReceiverPackage.PRODUCT_TYPE__ORIGIN_LINK:
				setOriginLink((Link)null);
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
			case FreightReceiverPackage.PRODUCT_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case FreightReceiverPackage.PRODUCT_TYPE__REQ_CAPACITY:
				return reqCapacity != REQ_CAPACITY_EDEFAULT;
			case FreightReceiverPackage.PRODUCT_TYPE__ORIGIN_LINK:
				return originLink != null;
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
		result.append(", reqCapacity: ");
		result.append(reqCapacity);
		result.append(')');
		return result.toString();
	}

} //ProductTypeImpl
