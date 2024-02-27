/**
 */
package MATSimFreightMetamodel.matsim.vehicles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleTypes#getVehicleTypes <em>Vehicle Types</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleTypes#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleTypes()
 * @model
 * @generated
 */
public interface VehicleTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicle Types</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.matsim.vehicles.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Types</em>' containment reference list.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleTypes_VehicleTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<VehicleType> getVehicleTypes();

	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.matsim.vehicles.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * should be person vehicles
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicles</em>' reference list.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleTypes_Vehicles()
	 * @model
	 * @generated
	 */
	EList<Vehicle> getVehicles();

} // VehicleTypes
