/**
 */
package logiToppMetamodel.mobiTopp.citizens;

import logiToppMetamodel.base.Entity;

import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Household</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * - domCode
 * - type
 * - numberOfCars
 * - numberOfMinors
 * - numberOfNotSimulatedChildren
 * - nominalSize
 * - income
 * - incomeClass
 * - economicalStatus
 * - availableCars
 * - ownedCars
 * - canChargePrivately
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.citizens.Household#getLocation <em>Location</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.citizens.Household#getMembers <em>Members</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.citizens.Household#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.citizens.CitizensPackage#getHousehold()
 * @model
 * @generated
 */
public interface Household extends Entity {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see logiToppMetamodel.mobiTopp.citizens.CitizensPackage#getHousehold_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.citizens.Household#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.mobiTopp.citizens.Person}.
	 * It is bidirectional and its opposite is '{@link logiToppMetamodel.mobiTopp.citizens.Person#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see logiToppMetamodel.mobiTopp.citizens.CitizensPackage#getHousehold_Members()
	 * @see logiToppMetamodel.mobiTopp.citizens.Person#getHousehold
	 * @model opposite="household" containment="true" required="true"
	 * @generated
	 */
	EList<Person> getMembers();

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link logiToppMetamodel.mobiTopp.network.Zone#getHouseholds <em>Households</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference.
	 * @see #setZone(Zone)
	 * @see logiToppMetamodel.mobiTopp.citizens.CitizensPackage#getHousehold_Zone()
	 * @see logiToppMetamodel.mobiTopp.network.Zone#getHouseholds
	 * @model opposite="households" required="true"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.citizens.Household#getZone <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

} // Household
