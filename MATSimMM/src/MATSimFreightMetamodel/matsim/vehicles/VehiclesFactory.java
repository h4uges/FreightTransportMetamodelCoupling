/**
 */
package MATSimFreightMetamodel.matsim.vehicles;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage
 * @generated
 */
public interface VehiclesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VehiclesFactory eINSTANCE = MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vehicle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Type</em>'.
	 * @generated
	 */
	VehicleType createVehicleType();

	/**
	 * Returns a new object of class '<em>Vehicle Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Capacity</em>'.
	 * @generated
	 */
	VehicleCapacity createVehicleCapacity();

	/**
	 * Returns a new object of class '<em>Vehicle Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Types</em>'.
	 * @generated
	 */
	VehicleTypes createVehicleTypes();

	/**
	 * Returns a new object of class '<em>Person Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Vehicle</em>'.
	 * @generated
	 */
	PersonVehicle createPersonVehicle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VehiclesPackage getVehiclesPackage();

} //VehiclesFactory
