/**
 */
package logiToppMetamodel.mobiTopp.network;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone And Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.ZoneAndLocation#getLocation <em>Location</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.ZoneAndLocation#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getZoneAndLocation()
 * @model
 * @generated
 */
public interface ZoneAndLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getZoneAndLocation_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.ZoneAndLocation#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference.
	 * @see #setZone(Zone)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getZoneAndLocation_Zone()
	 * @model required="true"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.ZoneAndLocation#getZone <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

} // ZoneAndLocation
