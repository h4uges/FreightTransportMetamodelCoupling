/**
 */
package MATSimFreightMetamodel.freightReceiver.impl;

import MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage;
import MATSimFreightMetamodel.freightReceiver.ProductType;
import MATSimFreightMetamodel.freightReceiver.ReceiverProduct;
import MATSimFreightMetamodel.freightReceiver.ReorderPolicy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receiver Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverProductImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverProductImpl#getStockOnHand <em>Stock On Hand</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverProductImpl#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiverProductImpl extends MinimalEObjectImpl.Container implements ReceiverProduct {
	/**
	 * The cached value of the '{@link #getProductType() <em>Product Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductType()
	 * @generated
	 * @ordered
	 */
	protected ProductType productType;

	/**
	 * The default value of the '{@link #getStockOnHand() <em>Stock On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockOnHand()
	 * @generated
	 * @ordered
	 */
	protected static final double STOCK_ON_HAND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStockOnHand() <em>Stock On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockOnHand()
	 * @generated
	 * @ordered
	 */
	protected double stockOnHand = STOCK_ON_HAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected ReorderPolicy policy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiverProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightReceiverPackage.Literals.RECEIVER_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductType getProductType() {
		if (productType != null && productType.eIsProxy()) {
			InternalEObject oldProductType = (InternalEObject)productType;
			productType = (ProductType)eResolveProxy(oldProductType);
			if (productType != oldProductType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreightReceiverPackage.RECEIVER_PRODUCT__PRODUCT_TYPE, oldProductType, productType));
			}
		}
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType basicGetProductType() {
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductType(ProductType newProductType) {
		ProductType oldProductType = productType;
		productType = newProductType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.RECEIVER_PRODUCT__PRODUCT_TYPE, oldProductType, productType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStockOnHand() {
		return stockOnHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStockOnHand(double newStockOnHand) {
		double oldStockOnHand = stockOnHand;
		stockOnHand = newStockOnHand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.RECEIVER_PRODUCT__STOCK_ON_HAND, oldStockOnHand, stockOnHand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReorderPolicy getPolicy() {
		if (policy != null && policy.eIsProxy()) {
			InternalEObject oldPolicy = (InternalEObject)policy;
			policy = (ReorderPolicy)eResolveProxy(oldPolicy);
			if (policy != oldPolicy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreightReceiverPackage.RECEIVER_PRODUCT__POLICY, oldPolicy, policy));
			}
		}
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReorderPolicy basicGetPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicy(ReorderPolicy newPolicy) {
		ReorderPolicy oldPolicy = policy;
		policy = newPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.RECEIVER_PRODUCT__POLICY, oldPolicy, policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreightReceiverPackage.RECEIVER_PRODUCT__PRODUCT_TYPE:
				if (resolve) return getProductType();
				return basicGetProductType();
			case FreightReceiverPackage.RECEIVER_PRODUCT__STOCK_ON_HAND:
				return getStockOnHand();
			case FreightReceiverPackage.RECEIVER_PRODUCT__POLICY:
				if (resolve) return getPolicy();
				return basicGetPolicy();
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
			case FreightReceiverPackage.RECEIVER_PRODUCT__PRODUCT_TYPE:
				setProductType((ProductType)newValue);
				return;
			case FreightReceiverPackage.RECEIVER_PRODUCT__STOCK_ON_HAND:
				setStockOnHand((Double)newValue);
				return;
			case FreightReceiverPackage.RECEIVER_PRODUCT__POLICY:
				setPolicy((ReorderPolicy)newValue);
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
			case FreightReceiverPackage.RECEIVER_PRODUCT__PRODUCT_TYPE:
				setProductType((ProductType)null);
				return;
			case FreightReceiverPackage.RECEIVER_PRODUCT__STOCK_ON_HAND:
				setStockOnHand(STOCK_ON_HAND_EDEFAULT);
				return;
			case FreightReceiverPackage.RECEIVER_PRODUCT__POLICY:
				setPolicy((ReorderPolicy)null);
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
			case FreightReceiverPackage.RECEIVER_PRODUCT__PRODUCT_TYPE:
				return productType != null;
			case FreightReceiverPackage.RECEIVER_PRODUCT__STOCK_ON_HAND:
				return stockOnHand != STOCK_ON_HAND_EDEFAULT;
			case FreightReceiverPackage.RECEIVER_PRODUCT__POLICY:
				return policy != null;
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
		result.append(" (stockOnHand: ");
		result.append(stockOnHand);
		result.append(')');
		return result.toString();
	}

} //ReceiverProductImpl
