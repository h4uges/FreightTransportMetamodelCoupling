/**
 */
package MATSimFreightMetamodel.freightContrib;

import MATSimFreightMetamodel.matsim.vehicles.VehicleType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierCapabilities#getCarrierVehicles <em>Carrier Vehicles</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierCapabilities#getVehicleTypes <em>Vehicle Types</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierCapabilities#getFleetSize <em>Fleet Size</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierCapabilities()
 * @model
 * @generated
 */
public interface CarrierCapabilities extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier Vehicles</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightContrib.CarrierVehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Vehicles</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierCapabilities_CarrierVehicles()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarrierVehicle> getCarrierVehicles();

	/**
	 * Returns the value of the '<em><b>Vehicle Types</b></em>' reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.matsim.vehicles.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Types</em>' reference list.
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierCapabilities_VehicleTypes()
	 * @model
	 * @generated
	 */
	EList<VehicleType> getVehicleTypes();

	/**
	 * Returns the value of the '<em><b>Fleet Size</b></em>' attribute.
	 * The literals are from the enumeration {@link MATSimFreightMetamodel.freightContrib.FleetSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fleet Size</em>' attribute.
	 * @see MATSimFreightMetamodel.freightContrib.FleetSize
	 * @see #setFleetSize(FleetSize)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierCapabilities_FleetSize()
	 * @model required="true"
	 * @generated
	 */
	FleetSize getFleetSize();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierCapabilities#getFleetSize <em>Fleet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fleet Size</em>' attribute.
	 * @see MATSimFreightMetamodel.freightContrib.FleetSize
	 * @see #getFleetSize()
	 * @generated
	 */
	void setFleetSize(FleetSize value);

} // CarrierCapabilities
