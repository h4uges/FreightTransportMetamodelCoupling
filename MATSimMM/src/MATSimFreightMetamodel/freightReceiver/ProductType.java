/**
 */
package MATSimFreightMetamodel.freightReceiver;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.matsim.core.network.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ProductType#getDesc <em>Desc</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ProductType#getReqCapacity <em>Req Capacity</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ProductType#getOriginLink <em>Origin Link</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getProductType()
 * @model
 * @generated
 */
public interface ProductType extends Entity {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getProductType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.ProductType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Req Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Capacity</em>' attribute.
	 * @see #setReqCapacity(double)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getProductType_ReqCapacity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getReqCapacity();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.ProductType#getReqCapacity <em>Req Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Capacity</em>' attribute.
	 * @see #getReqCapacity()
	 * @generated
	 */
	void setReqCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Origin Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Link</em>' reference.
	 * @see #setOriginLink(Link)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getProductType_OriginLink()
	 * @model required="true"
	 * @generated
	 */
	Link getOriginLink();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.ProductType#getOriginLink <em>Origin Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Link</em>' reference.
	 * @see #getOriginLink()
	 * @generated
	 */
	void setOriginLink(Link value);

} // ProductType
