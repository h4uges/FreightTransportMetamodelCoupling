/**
 */
package CommonFreightTransportMetamodel.utils;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Id </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.HasId_#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getHasId_()
 * @model abstract="true"
 * @generated
 */
public interface HasId_ extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getHasId__Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.HasId_#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // HasId_
