/**
 */
package CommonFreightTransportMetamodel.localEntities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage
 * @generated
 */
public interface LocalEntitiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LocalEntitiesFactory eINSTANCE = CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Business Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Branch</em>'.
	 * @generated
	 */
	BusinessBranch createBusinessBranch();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population</em>'.
	 * @generated
	 */
	Population createPopulation();

	/**
	 * Returns a new object of class '<em>Business</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business</em>'.
	 * @generated
	 */
	Business createBusiness();

	/**
	 * Returns a new object of class '<em>Household</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Household</em>'.
	 * @generated
	 */
	Household createHousehold();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LocalEntitiesPackage getLocalEntitiesPackage();

} //LocalEntitiesFactory
