/**
 */
package logiToppMetamodel.mobiTopp.network;

import logiToppMetamodel.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Node#getCoord <em>Coord</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Entity {
	/**
	 * Returns the value of the '<em><b>Coord</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coord</em>' containment reference.
	 * @see #setCoord(Point2D)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getNode_Coord()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point2D getCoord();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Node#getCoord <em>Coord</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord</em>' containment reference.
	 * @see #getCoord()
	 * @generated
	 */
	void setCoord(Point2D value);

} // Node
