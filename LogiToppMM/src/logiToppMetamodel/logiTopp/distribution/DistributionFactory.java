/**
 */
package logiToppMetamodel.logiTopp.distribution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.DistributionPackage
 * @generated
 */
public interface DistributionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DistributionFactory eINSTANCE = logiToppMetamodel.logiTopp.distribution.impl.DistributionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CEP Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEP Service Provider</em>'.
	 * @generated
	 */
	CEPServiceProvider createCEPServiceProvider();

	/**
	 * Returns a new object of class '<em>Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Center</em>'.
	 * @generated
	 */
	DistributionCenter createDistributionCenter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DistributionPackage getDistributionPackage();

} //DistributionFactory
