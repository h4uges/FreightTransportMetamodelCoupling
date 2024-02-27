/**
 */
package logiToppMetamodel.logiTopp.business;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.business.BusinessPackage
 * @generated
 */
public interface BusinessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessFactory eINSTANCE = logiToppMetamodel.logiTopp.business.impl.BusinessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Business</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business</em>'.
	 * @generated
	 */
	Business createBusiness();

	/**
	 * Returns a new object of class '<em>Opening Hour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opening Hour</em>'.
	 * @generated
	 */
	OpeningHour createOpeningHour();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BusinessPackage getBusinessPackage();

} //BusinessFactory
