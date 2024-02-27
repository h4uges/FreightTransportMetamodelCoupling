/**
 */
package MATSimFreightMetamodel.matsim.core.network;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.matsim.core.Coord;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Node#getCoord <em>Coord</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Entity {
	/**
	 * Returns the value of the '<em><b>Coord</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord</em>' containment reference.
	 * @see #setCoord(Coord)
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getNode_Coord()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coord getCoord();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.core.network.Node#getCoord <em>Coord</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord</em>' containment reference.
	 * @see #getCoord()
	 * @generated
	 */
	void setCoord(Coord value);

} // Node
