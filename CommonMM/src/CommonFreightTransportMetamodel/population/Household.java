/**
 */
package CommonFreightTransportMetamodel.population;

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
 *   <li>{@link CommonFreightTransportMetamodel.population.Household#getMember <em>Member</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.population.Household#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.population.PopulationPackage#getHousehold()
 * @model
 * @generated
 */
public interface Household extends HasId_, ShipmentlLegStartEndPoint {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.population.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.population.PopulationPackage#getHousehold_Member()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Person> getMember();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location_)
	 * @see CommonFreightTransportMetamodel.population.PopulationPackage#getHousehold_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location_ getLocation();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.population.Household#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location_ value);

} // Household
