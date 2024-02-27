/**
 */
package CommonFreightTransportMetamodel.network;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Based Network Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.network.NodeBasedNetworkAccess#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getNodeBasedNetworkAccess()
 * @model
 * @generated
 */
public interface NodeBasedNetworkAccess extends NetworkAccess {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getNodeBasedNetworkAccess_Node()
	 * @model required="true"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.network.NodeBasedNetworkAccess#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

} // NodeBasedNetworkAccess
