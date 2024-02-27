/**
 */
package MATSimFreightMetamodel.freightReceiver;

import MATSimFreightMetamodel.freightContrib.Carrier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ReceiverOrder#getCost <em>Cost</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ReceiverOrder#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ReceiverOrder#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverOrder()
 * @model
 * @generated
 */
public interface ReceiverOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverOrder_Cost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.ReceiverOrder#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverOrder_Carrier()
	 * @model required="true"
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.ReceiverOrder#getCarrier <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' reference.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(Carrier value);

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightReceiver.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverOrder_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

} // ReceiverOrder
