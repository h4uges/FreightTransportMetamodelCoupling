/**
 */
package CommonFreightTransportMetamodel.logisticNetwork;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.TimeWindow_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Depot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getLocation <em>Location</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getOperationHours <em>Operation Hours</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getVehicleDepot()
 * @model
 * @generated
 */
public interface VehicleDepot extends HasId_ {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location_)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getVehicleDepot_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location_ getLocation();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location_ value);

	/**
	 * Returns the value of the '<em><b>Operation Hours</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.utils.TimeWindow_}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Hours</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getVehicleDepot_OperationHours()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeWindow_> getOperationHours();

	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle}.
	 * It is bidirectional and its opposite is '{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getDepot <em>Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicles</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getVehicleDepot_Vehicles()
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getDepot
	 * @model opposite="depot" containment="true"
	 * @generated
	 */
	EList<Vehicle> getVehicles();

} // VehicleDepot
