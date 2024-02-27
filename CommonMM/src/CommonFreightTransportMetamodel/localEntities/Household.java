/**
 */
package CommonFreightTransportMetamodel.localEntities;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Household</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.localEntities.Household#getLocation <em>Location</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.localEntities.Household#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#getHousehold()
 * @model
 * @generated
 */
public interface Household extends HasId_, ShipmentlLegStartEndPoint {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location_)
	 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#getHousehold_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location_ getLocation();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.localEntities.Household#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location_ value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.localEntities.Person}.
	 * It is bidirectional and its opposite is '{@link CommonFreightTransportMetamodel.localEntities.Person#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#getHousehold_Member()
	 * @see CommonFreightTransportMetamodel.localEntities.Person#getHousehold
	 * @model opposite="household" containment="true"
	 * @generated
	 */
	EList<Person> getMember();

} // Household
