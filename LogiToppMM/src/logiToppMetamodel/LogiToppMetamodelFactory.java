/**
 */
package logiToppMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.LogiToppMetamodelPackage
 * @generated
 */
public interface LogiToppMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogiToppMetamodelFactory eINSTANCE = logiToppMetamodel.impl.LogiToppMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Demand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Demand</em>'.
	 * @generated
	 */
	Demand createDemand();

	/**
	 * Returns a new object of class '<em>Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population</em>'.
	 * @generated
	 */
	Population createPopulation();

	/**
	 * Returns a new object of class '<em>Transport Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Infrastructure</em>'.
	 * @generated
	 */
	TransportInfrastructure createTransportInfrastructure();

	/**
	 * Returns a new object of class '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution</em>'.
	 * @generated
	 */
	Solution createSolution();

	/**
	 * Returns a new object of class '<em>Demand Exchange Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Demand Exchange Root</em>'.
	 * @generated
	 */
	DemandExchangeRoot createDemandExchangeRoot();

	/**
	 * Returns a new object of class '<em>Solution Exchange Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Exchange Root</em>'.
	 * @generated
	 */
	SolutionExchangeRoot createSolutionExchangeRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogiToppMetamodelPackage getLogiToppMetamodelPackage();

} //LogiToppMetamodelFactory
