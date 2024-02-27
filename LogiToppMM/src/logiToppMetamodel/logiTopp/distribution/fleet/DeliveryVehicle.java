/**
 */
package logiToppMetamodel.logiTopp.distribution.fleet;

import logiToppMetamodel.base.Entity;
import logiToppMetamodel.base.Time;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getVehicleType <em>Vehicle Type</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getEarliestStartTime <em>Earliest Start Time</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getLatestEndTime <em>Latest End Time</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage#getDeliveryVehicle()
 * @model
 * @generated
 */
public interface DeliveryVehicle extends Entity {
	/**
	 * Returns the value of the '<em><b>Vehicle Type</b></em>' attribute.
	 * The default value is <code>"TRUCK"</code>.
	 * The literals are from the enumeration {@link logiToppMetamodel.logiTopp.distribution.fleet.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Type</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.VehicleType
	 * @see #setVehicleType(VehicleType)
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage#getDeliveryVehicle_VehicleType()
	 * @model default="TRUCK" required="true"
	 * @generated
	 */
	VehicleType getVehicleType();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getVehicleType <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Type</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.VehicleType
	 * @see #getVehicleType()
	 * @generated
	 */
	void setVehicleType(VehicleType value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage#getDeliveryVehicle_Capacity()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Earliest Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earliest Start Time</em>' reference.
	 * @see #setEarliestStartTime(Time)
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage#getDeliveryVehicle_EarliestStartTime()
	 * @model required="true"
	 * @generated
	 */
	Time getEarliestStartTime();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getEarliestStartTime <em>Earliest Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earliest Start Time</em>' reference.
	 * @see #getEarliestStartTime()
	 * @generated
	 */
	void setEarliestStartTime(Time value);

	/**
	 * Returns the value of the '<em><b>Latest End Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest End Time</em>' reference.
	 * @see #setLatestEndTime(Time)
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage#getDeliveryVehicle_LatestEndTime()
	 * @model required="true"
	 * @generated
	 */
	Time getLatestEndTime();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getLatestEndTime <em>Latest End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest End Time</em>' reference.
	 * @see #getLatestEndTime()
	 * @generated
	 */
	void setLatestEndTime(Time value);

} // DeliveryVehicle
