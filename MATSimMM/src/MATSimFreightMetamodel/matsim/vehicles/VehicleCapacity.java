/**
 */
package MATSimFreightMetamodel.matsim.vehicles;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Capacity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getSeats <em>Seats</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getStandingRoom <em>Standing Room</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getVolumeInCubicMeters <em>Volume In Cubic Meters</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getWeightInTons <em>Weight In Tons</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleCapacity()
 * @model
 * @generated
 */
public interface VehicleCapacity extends EObject {
	/**
	 * Returns the value of the '<em><b>Seats</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats</em>' attribute.
	 * @see #setSeats(int)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleCapacity_Seats()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getSeats();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getSeats <em>Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats</em>' attribute.
	 * @see #getSeats()
	 * @generated
	 */
	void setSeats(int value);

	/**
	 * Returns the value of the '<em><b>Standing Room</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standing Room</em>' attribute.
	 * @see #setStandingRoom(int)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleCapacity_StandingRoom()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getStandingRoom();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getStandingRoom <em>Standing Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standing Room</em>' attribute.
	 * @see #getStandingRoom()
	 * @generated
	 */
	void setStandingRoom(int value);

	/**
	 * Returns the value of the '<em><b>Volume In Cubic Meters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume In Cubic Meters</em>' attribute.
	 * @see #setVolumeInCubicMeters(double)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleCapacity_VolumeInCubicMeters()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getVolumeInCubicMeters();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getVolumeInCubicMeters <em>Volume In Cubic Meters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume In Cubic Meters</em>' attribute.
	 * @see #getVolumeInCubicMeters()
	 * @generated
	 */
	void setVolumeInCubicMeters(double value);

	/**
	 * Returns the value of the '<em><b>Weight In Tons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight In Tons</em>' attribute.
	 * @see #setWeightInTons(double)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleCapacity_WeightInTons()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getWeightInTons();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getWeightInTons <em>Weight In Tons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight In Tons</em>' attribute.
	 * @see #getWeightInTons()
	 * @generated
	 */
	void setWeightInTons(double value);

	/**
	 * Returns the value of the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' attribute.
	 * @see #setOther(double)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleCapacity_Other()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getOther();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getOther <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' attribute.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(double value);

} // VehicleCapacity
