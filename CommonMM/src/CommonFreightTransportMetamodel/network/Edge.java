/**
 */
package CommonFreightTransportMetamodel.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.network.Edge#getFrom <em>From</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.network.Edge#getTo <em>To</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.network.Edge#getLength <em>Length</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.network.Edge#getAllowedVehicleTypes <em>Allowed Vehicle Types</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Node)
	 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getEdge_From()
	 * @model required="true"
	 * @generated
	 */
	Node getFrom();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.network.Edge#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Node value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Node)
	 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getEdge_To()
	 * @model required="true"
	 * @generated
	 */
	Node getTo();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.network.Edge#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Node value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getEdge_Length()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.network.Edge#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Allowed Vehicle Types</b></em>' attribute list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.network.VehicleType_}.
	 * The literals are from the enumeration {@link CommonFreightTransportMetamodel.network.VehicleType_}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Vehicle Types</em>' attribute list.
	 * @see CommonFreightTransportMetamodel.network.VehicleType_
	 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getEdge_AllowedVehicleTypes()
	 * @model
	 * @generated
	 */
	EList<VehicleType_> getAllowedVehicleTypes();

} // Edge
