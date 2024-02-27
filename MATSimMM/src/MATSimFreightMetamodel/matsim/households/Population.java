/**
 */
package MATSimFreightMetamodel.matsim.households;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.Population#getHouseholds <em>Households</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.matsim.households.HouseholdsPackage#getPopulation()
 * @model
 * @generated
 */
public interface Population extends EObject {
	/**
	 * Returns the value of the '<em><b>Households</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.matsim.households.Household}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Households</em>' containment reference list.
	 * @see MATSimFreightMetamodel.matsim.households.HouseholdsPackage#getPopulation_Households()
	 * @model containment="true"
	 * @generated
	 */
	EList<Household> getHouseholds();

} // Population
