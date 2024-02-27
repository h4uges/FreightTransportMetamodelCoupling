/**
 */
package MATSimFreightMetamodel.freightReceiver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getProductType <em>Product Type</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getStockOnHand <em>Stock On Hand</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverProduct()
 * @model
 * @generated
 */
public interface ReceiverProduct extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type</em>' reference.
	 * @see #setProductType(ProductType)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverProduct_ProductType()
	 * @model required="true"
	 * @generated
	 */
	ProductType getProductType();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getProductType <em>Product Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' reference.
	 * @see #getProductType()
	 * @generated
	 */
	void setProductType(ProductType value);

	/**
	 * Returns the value of the '<em><b>Stock On Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock On Hand</em>' attribute.
	 * @see #setStockOnHand(double)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverProduct_StockOnHand()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getStockOnHand();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getStockOnHand <em>Stock On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock On Hand</em>' attribute.
	 * @see #getStockOnHand()
	 * @generated
	 */
	void setStockOnHand(double value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' reference.
	 * @see #setPolicy(ReorderPolicy)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverProduct_Policy()
	 * @model required="true"
	 * @generated
	 */
	ReorderPolicy getPolicy();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getPolicy <em>Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(ReorderPolicy value);

} // ReceiverProduct
