/**
 */
package logiToppMetamodel.mobiTopp.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Polygon#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon extends EObject {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.mobiTopp.network.Line}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getPolygon_Lines()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<Line> getLines();

} // Polygon
