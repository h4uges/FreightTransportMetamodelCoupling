/**
 */
package logiToppMetamodel.mobiTopp.network;

import logiToppMetamodel.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * - carAllowed
 * - allowedVelocityInKm
 * - length
 * - transportSystems
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Edge#getTwin <em>Twin</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Edge#getFrom <em>From</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Edge#getTo <em>To</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Edge#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends Entity {
	/**
	 * Returns the value of the '<em><b>Twin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twin</em>' reference.
	 * @see #setTwin(Edge)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getEdge_Twin()
	 * @model
	 * @generated
	 */
	Edge getTwin();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Edge#getTwin <em>Twin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Twin</em>' reference.
	 * @see #getTwin()
	 * @generated
	 */
	void setTwin(Edge value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Node)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getEdge_From()
	 * @model required="true"
	 * @generated
	 */
	Node getFrom();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Edge#getFrom <em>From</em>}' reference.
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
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getEdge_To()
	 * @model required="true"
	 * @generated
	 */
	Node getTo();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Edge#getTo <em>To</em>}' reference.
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
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getEdge_Length()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Edge#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

} // Edge
