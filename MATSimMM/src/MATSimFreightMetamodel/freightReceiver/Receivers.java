/**
 */
package MATSimFreightMetamodel.freightReceiver;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receivers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Receivers#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Receivers#getProductTypes <em>Product Types</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Receivers#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceivers()
 * @model
 * @generated
 */
public interface Receivers extends EObject {
	/**
	 * Returns the value of the '<em><b>Receivers</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightReceiver.Receiver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivers</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceivers_Receivers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Receiver> getReceivers();

	/**
	 * Returns the value of the '<em><b>Product Types</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightReceiver.ProductType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Types</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceivers_ProductTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductType> getProductTypes();

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceivers_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.Receivers#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

} // Receivers
