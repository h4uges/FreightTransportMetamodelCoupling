/**
 */
package logiToppMetamodel.logiTopp.distribution.region;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.region.RegionPackage
 * @generated
 */
public interface RegionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegionFactory eINSTANCE = logiToppMetamodel.logiTopp.distribution.region.impl.RegionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Regional Reach</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regional Reach</em>'.
	 * @generated
	 */
	RegionalReach createRegionalReach();

	/**
	 * Returns a new object of class '<em>Service Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Area</em>'.
	 * @generated
	 */
	ServiceArea createServiceArea();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RegionPackage getRegionPackage();

} //RegionFactory
