/**
 */
package MATSimFreightMetamodel.matsim.households;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.matsim.core.population.Person;

import MATSimFreightMetamodel.matsim.vehicles.Vehicle;

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
 *   <li>{@link MATSimFreightMetamodel.matsim.households.Household#getMembers <em>Members</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.Household#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.Household#getIncome <em>Income</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.matsim.households.HouseholdsPackage#getHousehold()
 * @model
 * @generated
 */
public interface Household extends Entity {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.matsim.core.population.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see MATSimFreightMetamodel.matsim.households.HouseholdsPackage#getHousehold_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getMembers();

	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.matsim.vehicles.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * containment
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicles</em>' containment reference list.
	 * @see MATSimFreightMetamodel.matsim.households.HouseholdsPackage#getHousehold_Vehicles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vehicle> getVehicles();

	/**
	 * Returns the value of the '<em><b>Income</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income</em>' containment reference.
	 * @see #setIncome(Income)
	 * @see MATSimFreightMetamodel.matsim.households.HouseholdsPackage#getHousehold_Income()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Income getIncome();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.households.Household#getIncome <em>Income</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Income</em>' containment reference.
	 * @see #getIncome()
	 * @generated
	 */
	void setIncome(Income value);

} // Household
