/**
 */
package logiToppMetamodel.logiTopp.distribution.tours;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.tours.ToursPackage
 * @generated
 */
public interface ToursFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToursFactory eINSTANCE = logiToppMetamodel.logiTopp.distribution.tours.impl.ToursFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Planned Delivery Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Delivery Tour</em>'.
	 * @generated
	 */
	PlannedDeliveryTour createPlannedDeliveryTour();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToursPackage getToursPackage();

} //ToursFactory
