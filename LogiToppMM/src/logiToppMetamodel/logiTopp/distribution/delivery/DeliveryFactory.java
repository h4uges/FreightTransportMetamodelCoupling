/**
 */
package logiToppMetamodel.logiTopp.distribution.delivery;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage
 * @generated
 */
public interface DeliveryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeliveryFactory eINSTANCE = logiToppMetamodel.logiTopp.distribution.delivery.impl.DeliveryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parcel Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parcel Activity</em>'.
	 * @generated
	 */
	ParcelActivity createParcelActivity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeliveryPackage getDeliveryPackage();

} //DeliveryFactory
