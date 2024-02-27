/**
 */
package logiToppMetamodel.logiTopp.distribution.fleet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage
 * @generated
 */
public interface FleetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FleetFactory eINSTANCE = logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fleet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fleet</em>'.
	 * @generated
	 */
	Fleet createFleet();

	/**
	 * Returns a new object of class '<em>Delivery Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delivery Vehicle</em>'.
	 * @generated
	 */
	DeliveryVehicle createDeliveryVehicle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FleetPackage getFleetPackage();

} //FleetFactory
