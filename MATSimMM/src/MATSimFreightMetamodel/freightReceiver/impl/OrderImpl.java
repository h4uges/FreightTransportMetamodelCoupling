/**
 */
package MATSimFreightMetamodel.freightReceiver.impl;

import MATSimFreightMetamodel.base.impl.EntityImpl;

import MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage;
import MATSimFreightMetamodel.freightReceiver.Order;
import MATSimFreightMetamodel.freightReceiver.ReceiverProduct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.OrderImpl#getReceiverProduct <em>Receiver Product</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.OrderImpl#getOrderQuantity <em>Order Quantity</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.OrderImpl#getDailyOrderQuantity <em>Daily Order Quantity</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.OrderImpl#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.OrderImpl#getNumberOfWeekleyDeliveries <em>Number Of Weekley Deliveries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends EntityImpl implements Order {
	/**
	 * The cached value of the '{@link #getReceiverProduct() <em>Receiver Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverProduct()
	 * @generated
	 * @ordered
	 */
	protected ReceiverProduct receiverProduct;

	/**
	 * The default value of the '{@link #getOrderQuantity() <em>Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final double ORDER_QUANTITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOrderQuantity() <em>Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderQuantity()
	 * @generated
	 * @ordered
	 */
	protected double orderQuantity = ORDER_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDailyOrderQuantity() <em>Daily Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyOrderQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final double DAILY_ORDER_QUANTITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDailyOrderQuantity() <em>Daily Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDailyOrderQuantity()
	 * @generated
	 * @ordered
	 */
	protected double dailyOrderQuantity = DAILY_ORDER_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final double SERVICE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTime()
	 * @generated
	 * @ordered
	 */
	protected double serviceTime = SERVICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfWeekleyDeliveries() <em>Number Of Weekley Deliveries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWeekleyDeliveries()
	 * @generated
	 * @ordered
	 */
	protected static final double NUMBER_OF_WEEKLEY_DELIVERIES_EDEFAULT = 5.0;

	/**
	 * The cached value of the '{@link #getNumberOfWeekleyDeliveries() <em>Number Of Weekley Deliveries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWeekleyDeliveries()
	 * @generated
	 * @ordered
	 */
	protected double numberOfWeekleyDeliveries = NUMBER_OF_WEEKLEY_DELIVERIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightReceiverPackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReceiverProduct getReceiverProduct() {
		if (receiverProduct != null && receiverProduct.eIsProxy()) {
			InternalEObject oldReceiverProduct = (InternalEObject)receiverProduct;
			receiverProduct = (ReceiverProduct)eResolveProxy(oldReceiverProduct);
			if (receiverProduct != oldReceiverProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreightReceiverPackage.ORDER__RECEIVER_PRODUCT, oldReceiverProduct, receiverProduct));
			}
		}
		return receiverProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiverProduct basicGetReceiverProduct() {
		return receiverProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiverProduct(ReceiverProduct newReceiverProduct) {
		ReceiverProduct oldReceiverProduct = receiverProduct;
		receiverProduct = newReceiverProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.ORDER__RECEIVER_PRODUCT, oldReceiverProduct, receiverProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOrderQuantity() {
		return orderQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderQuantity(double newOrderQuantity) {
		double oldOrderQuantity = orderQuantity;
		orderQuantity = newOrderQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.ORDER__ORDER_QUANTITY, oldOrderQuantity, orderQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDailyOrderQuantity() {
		return dailyOrderQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDailyOrderQuantity(double newDailyOrderQuantity) {
		double oldDailyOrderQuantity = dailyOrderQuantity;
		dailyOrderQuantity = newDailyOrderQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.ORDER__DAILY_ORDER_QUANTITY, oldDailyOrderQuantity, dailyOrderQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getServiceTime() {
		return serviceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceTime(double newServiceTime) {
		double oldServiceTime = serviceTime;
		serviceTime = newServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.ORDER__SERVICE_TIME, oldServiceTime, serviceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNumberOfWeekleyDeliveries() {
		return numberOfWeekleyDeliveries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfWeekleyDeliveries(double newNumberOfWeekleyDeliveries) {
		double oldNumberOfWeekleyDeliveries = numberOfWeekleyDeliveries;
		numberOfWeekleyDeliveries = newNumberOfWeekleyDeliveries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.ORDER__NUMBER_OF_WEEKLEY_DELIVERIES, oldNumberOfWeekleyDeliveries, numberOfWeekleyDeliveries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreightReceiverPackage.ORDER__RECEIVER_PRODUCT:
				if (resolve) return getReceiverProduct();
				return basicGetReceiverProduct();
			case FreightReceiverPackage.ORDER__ORDER_QUANTITY:
				return getOrderQuantity();
			case FreightReceiverPackage.ORDER__DAILY_ORDER_QUANTITY:
				return getDailyOrderQuantity();
			case FreightReceiverPackage.ORDER__SERVICE_TIME:
				return getServiceTime();
			case FreightReceiverPackage.ORDER__NUMBER_OF_WEEKLEY_DELIVERIES:
				return getNumberOfWeekleyDeliveries();
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
			case FreightReceiverPackage.ORDER__RECEIVER_PRODUCT:
				setReceiverProduct((ReceiverProduct)newValue);
				return;
			case FreightReceiverPackage.ORDER__ORDER_QUANTITY:
				setOrderQuantity((Double)newValue);
				return;
			case FreightReceiverPackage.ORDER__DAILY_ORDER_QUANTITY:
				setDailyOrderQuantity((Double)newValue);
				return;
			case FreightReceiverPackage.ORDER__SERVICE_TIME:
				setServiceTime((Double)newValue);
				return;
			case FreightReceiverPackage.ORDER__NUMBER_OF_WEEKLEY_DELIVERIES:
				setNumberOfWeekleyDeliveries((Double)newValue);
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
			case FreightReceiverPackage.ORDER__RECEIVER_PRODUCT:
				setReceiverProduct((ReceiverProduct)null);
				return;
			case FreightReceiverPackage.ORDER__ORDER_QUANTITY:
				setOrderQuantity(ORDER_QUANTITY_EDEFAULT);
				return;
			case FreightReceiverPackage.ORDER__DAILY_ORDER_QUANTITY:
				setDailyOrderQuantity(DAILY_ORDER_QUANTITY_EDEFAULT);
				return;
			case FreightReceiverPackage.ORDER__SERVICE_TIME:
				setServiceTime(SERVICE_TIME_EDEFAULT);
				return;
			case FreightReceiverPackage.ORDER__NUMBER_OF_WEEKLEY_DELIVERIES:
				setNumberOfWeekleyDeliveries(NUMBER_OF_WEEKLEY_DELIVERIES_EDEFAULT);
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
			case FreightReceiverPackage.ORDER__RECEIVER_PRODUCT:
				return receiverProduct != null;
			case FreightReceiverPackage.ORDER__ORDER_QUANTITY:
				return orderQuantity != ORDER_QUANTITY_EDEFAULT;
			case FreightReceiverPackage.ORDER__DAILY_ORDER_QUANTITY:
				return dailyOrderQuantity != DAILY_ORDER_QUANTITY_EDEFAULT;
			case FreightReceiverPackage.ORDER__SERVICE_TIME:
				return serviceTime != SERVICE_TIME_EDEFAULT;
			case FreightReceiverPackage.ORDER__NUMBER_OF_WEEKLEY_DELIVERIES:
				return numberOfWeekleyDeliveries != NUMBER_OF_WEEKLEY_DELIVERIES_EDEFAULT;
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
		result.append(" (orderQuantity: ");
		result.append(orderQuantity);
		result.append(", dailyOrderQuantity: ");
		result.append(dailyOrderQuantity);
		result.append(", serviceTime: ");
		result.append(serviceTime);
		result.append(", numberOfWeekleyDeliveries: ");
		result.append(numberOfWeekleyDeliveries);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
