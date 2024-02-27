/**
 */
package logiToppMetamodel.mobiTopp.network;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Point2D#getX <em>X</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Point2D#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getPoint2D()
 * @model
 * @generated
 */
public interface Point2D extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getPoint2D_X()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Point2D#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getPoint2D_Y()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Point2D#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

} // Point2D
