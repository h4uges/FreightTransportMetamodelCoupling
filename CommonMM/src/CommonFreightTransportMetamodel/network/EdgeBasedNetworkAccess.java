/**
 */
package CommonFreightTransportMetamodel.network;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Based Network Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess#getEdge <em>Edge</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess#getEdgePosition <em>Edge Position</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getEdgeBasedNetworkAccess()
 * @model
 * @generated
 */
public interface EdgeBasedNetworkAccess extends NetworkAccess {
	/**
	 * Returns the value of the '<em><b>Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' reference.
	 * @see #setEdge(Edge)
	 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getEdgeBasedNetworkAccess_Edge()
	 * @model required="true"
	 * @generated
	 */
	Edge getEdge();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess#getEdge <em>Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge</em>' reference.
	 * @see #getEdge()
	 * @generated
	 */
	void setEdge(Edge value);

	/**
	 * Returns the value of the '<em><b>Edge Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Position</em>' attribute.
	 * @see #setEdgePosition(double)
	 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getEdgeBasedNetworkAccess_EdgePosition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getEdgePosition();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess#getEdgePosition <em>Edge Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Position</em>' attribute.
	 * @see #getEdgePosition()
	 * @generated
	 */
	void setEdgePosition(double value);

} // EdgeBasedNetworkAccess
