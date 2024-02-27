/**
 */
package MATSimFreightMetamodel.freightContrib;

import MATSimFreightMetamodel.matsim.core.network.Link;

import MATSimFreightMetamodel.matsim.vehicles.Vehicle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierVehicle#getEarliestStartTime <em>Earliest Start Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierVehicle#getLatestEndTime <em>Latest End Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierVehicle#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierVehicle()
 * @model
 * @generated
 */
public interface CarrierVehicle extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Earliest Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earliest Start Time</em>' attribute.
	 * @see #setEarliestStartTime(double)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierVehicle_EarliestStartTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getEarliestStartTime();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierVehicle#getEarliestStartTime <em>Earliest Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earliest Start Time</em>' attribute.
	 * @see #getEarliestStartTime()
	 * @generated
	 */
	void setEarliestStartTime(double value);

	/**
	 * Returns the value of the '<em><b>Latest End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest End Time</em>' attribute.
	 * @see #setLatestEndTime(double)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierVehicle_LatestEndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getLatestEndTime();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierVehicle#getLatestEndTime <em>Latest End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest End Time</em>' attribute.
	 * @see #getLatestEndTime()
	 * @generated
	 */
	void setLatestEndTime(double value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Link)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierVehicle_Location()
	 * @model required="true"
	 * @generated
	 */
	Link getLocation();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierVehicle#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Link value);

} // CarrierVehicle
