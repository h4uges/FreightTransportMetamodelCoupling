/**
 */
package MATSimFreightMetamodel.matsim.vehicles;

import MATSimFreightMetamodel.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.Vehicle#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicle()
 * @model abstract="true"
 * @generated
 */
public interface Vehicle extends Entity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Containment
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(VehicleType)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicle_Type()
	 * @model required="true"
	 * @generated
	 */
	VehicleType getType();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.Vehicle#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(VehicleType value);

} // Vehicle
