/**
 */
package logiToppMetamodel.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.base.RelativeTime#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.base.BasePackage#getRelativeTime()
 * @model
 * @generated
 */
public interface RelativeTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(int)
	 * @see logiToppMetamodel.base.BasePackage#getRelativeTime_Seconds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getSeconds();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.base.RelativeTime#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(int value);

} // RelativeTime
