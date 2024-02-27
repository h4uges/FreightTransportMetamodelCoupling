/**
 */
package logiToppMetamodel.mobiTopp.network;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Line#getStart <em>Start</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Line#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Point2D)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getLine_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point2D getStart();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Line#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Point2D value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Point2D)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getLine_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point2D getEnd();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Line#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Point2D value);

} // Line
