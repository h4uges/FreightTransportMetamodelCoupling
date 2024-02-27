/**
 */
package CommonFreightTransportMetamodel.network;

import CommonFreightTransportMetamodel.utils.Coordinate;
import CommonFreightTransportMetamodel.utils.HasId_;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.network.Node#getCoordinate <em>Coordinate</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends HasId_ {
	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' containment reference.
	 * @see #setCoordinate(Coordinate)
	 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getNode_Coordinate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getCoordinate();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.network.Node#getCoordinate <em>Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate</em>' containment reference.
	 * @see #getCoordinate()
	 * @generated
	 */
	void setCoordinate(Coordinate value);

} // Node
