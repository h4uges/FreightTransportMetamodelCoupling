/**
 */
package logiToppMetamodel.mobiTopp.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.ZoneArea#getSize <em>Size</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.ZoneArea#getBorders <em>Borders</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getZoneArea()
 * @model
 * @generated
 */
public interface ZoneArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getZoneArea_Size()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.ZoneArea#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Returns the value of the '<em><b>Borders</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.mobiTopp.network.Polygon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borders</em>' containment reference list.
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getZoneArea_Borders()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Polygon> getBorders();

} // ZoneArea
