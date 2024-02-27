/**
 */
package MATSimFreightMetamodel.matsim.households;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.matsim.households.HouseholdsPackage
 * @generated
 */
public interface HouseholdsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HouseholdsFactory eINSTANCE = MATSimFreightMetamodel.matsim.households.impl.HouseholdsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Household</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Household</em>'.
	 * @generated
	 */
	Household createHousehold();

	/**
	 * Returns a new object of class '<em>Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population</em>'.
	 * @generated
	 */
	Population createPopulation();

	/**
	 * Returns a new object of class '<em>Income</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Income</em>'.
	 * @generated
	 */
	Income createIncome();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HouseholdsPackage getHouseholdsPackage();

} //HouseholdsFactory
