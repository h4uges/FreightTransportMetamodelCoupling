/**
 */
package logiToppMetamodel.logiTopp.distribution.fleet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fleet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.Fleet#getVehicleType <em>Vehicle Type</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.Fleet#getDeliveryVehicles <em>Delivery Vehicles</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage#getFleet()
 * @model
 * @generated
 */
public interface Fleet extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicle Type</b></em>' attribute.
	 * The default value is <code>"TRUCK"</code>.
	 * The literals are from the enumeration {@link logiToppMetamodel.logiTopp.distribution.fleet.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Type</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.VehicleType
	 * @see #setVehicleType(VehicleType)
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage#getFleet_VehicleType()
	 * @model default="TRUCK" required="true"
	 * @generated
	 */
	VehicleType getVehicleType();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.fleet.Fleet#getVehicleType <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Type</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.VehicleType
	 * @see #getVehicleType()
	 * @generated
	 */
	void setVehicleType(VehicleType value);

	/**
	 * Returns the value of the '<em><b>Delivery Vehicles</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Vehicles</em>' containment reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage#getFleet_DeliveryVehicles()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeliveryVehicle> getDeliveryVehicles();

} // Fleet
