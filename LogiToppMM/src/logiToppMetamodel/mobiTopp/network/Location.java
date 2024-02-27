/**
 */
package logiToppMetamodel.mobiTopp.network;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Location#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Location#getRoadPosition <em>Road Position</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Location#getRoadAccessEdge <em>Road Access Edge</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' containment reference.
	 * @see #setCoordinate(Point2D)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getLocation_Coordinate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point2D getCoordinate();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Location#getCoordinate <em>Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate</em>' containment reference.
	 * @see #getCoordinate()
	 * @generated
	 */
	void setCoordinate(Point2D value);

	/**
	 * Returns the value of the '<em><b>Road Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Road Position</em>' attribute.
	 * @see #setRoadPosition(double)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getLocation_RoadPosition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getRoadPosition();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Location#getRoadPosition <em>Road Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Road Position</em>' attribute.
	 * @see #getRoadPosition()
	 * @generated
	 */
	void setRoadPosition(double value);

	/**
	 * Returns the value of the '<em><b>Road Access Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Road Access Edge</em>' reference.
	 * @see #setRoadAccessEdge(Edge)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getLocation_RoadAccessEdge()
	 * @model required="true"
	 * @generated
	 */
	Edge getRoadAccessEdge();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Location#getRoadAccessEdge <em>Road Access Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Road Access Edge</em>' reference.
	 * @see #getRoadAccessEdge()
	 * @generated
	 */
	void setRoadAccessEdge(Edge value);

} // Location
