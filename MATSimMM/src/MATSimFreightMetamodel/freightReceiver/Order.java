/**
 */
package MATSimFreightMetamodel.freightReceiver;

import MATSimFreightMetamodel.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Order#getReceiverProduct <em>Receiver Product</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Order#getOrderQuantity <em>Order Quantity</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Order#getDailyOrderQuantity <em>Daily Order Quantity</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Order#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Order#getNumberOfWeekleyDeliveries <em>Number Of Weekley Deliveries</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends Entity {
	/**
	 * Returns the value of the '<em><b>Receiver Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Product</em>' reference.
	 * @see #setReceiverProduct(ReceiverProduct)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getOrder_ReceiverProduct()
	 * @model required="true"
	 * @generated
	 */
	ReceiverProduct getReceiverProduct();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.Order#getReceiverProduct <em>Receiver Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Product</em>' reference.
	 * @see #getReceiverProduct()
	 * @generated
	 */
	void setReceiverProduct(ReceiverProduct value);

	/**
	 * Returns the value of the '<em><b>Order Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Quantity</em>' attribute.
	 * @see #setOrderQuantity(double)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getOrder_OrderQuantity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getOrderQuantity();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.Order#getOrderQuantity <em>Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Quantity</em>' attribute.
	 * @see #getOrderQuantity()
	 * @generated
	 */
	void setOrderQuantity(double value);

	/**
	 * Returns the value of the '<em><b>Daily Order Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Order Quantity</em>' attribute.
	 * @see #setDailyOrderQuantity(double)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getOrder_DailyOrderQuantity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getDailyOrderQuantity();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.Order#getDailyOrderQuantity <em>Daily Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Order Quantity</em>' attribute.
	 * @see #getDailyOrderQuantity()
	 * @generated
	 */
	void setDailyOrderQuantity(double value);

	/**
	 * Returns the value of the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Time</em>' attribute.
	 * @see #setServiceTime(double)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getOrder_ServiceTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getServiceTime();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.Order#getServiceTime <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Time</em>' attribute.
	 * @see #getServiceTime()
	 * @generated
	 */
	void setServiceTime(double value);

	/**
	 * Returns the value of the '<em><b>Number Of Weekley Deliveries</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Weekley Deliveries</em>' attribute.
	 * @see #setNumberOfWeekleyDeliveries(double)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getOrder_NumberOfWeekleyDeliveries()
	 * @model default="5" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getNumberOfWeekleyDeliveries();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.Order#getNumberOfWeekleyDeliveries <em>Number Of Weekley Deliveries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Weekley Deliveries</em>' attribute.
	 * @see #getNumberOfWeekleyDeliveries()
	 * @generated
	 */
	void setNumberOfWeekleyDeliveries(double value);

} // Order
