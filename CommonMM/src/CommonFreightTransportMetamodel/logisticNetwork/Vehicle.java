/**
 */
package CommonFreightTransportMetamodel.logisticNetwork;

import CommonFreightTransportMetamodel.network.VehicleType_;

import CommonFreightTransportMetamodel.utils.Dimension;
import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.TimeWindow_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getStorageCapacity <em>Storage Capacity</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getOperationHours <em>Operation Hours</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getType <em>Type</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getDepot <em>Depot</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends HasId_ {
	/**
	 * Returns the value of the '<em><b>Storage Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Capacity</em>' containment reference.
	 * @see #setStorageCapacity(Dimension)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getVehicle_StorageCapacity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dimension getStorageCapacity();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getStorageCapacity <em>Storage Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Capacity</em>' containment reference.
	 * @see #getStorageCapacity()
	 * @generated
	 */
	void setStorageCapacity(Dimension value);

	/**
	 * Returns the value of the '<em><b>Operation Hours</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.utils.TimeWindow_}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Hours</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getVehicle_OperationHours()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeWindow_> getOperationHours();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CommonFreightTransportMetamodel.network.VehicleType_}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CommonFreightTransportMetamodel.network.VehicleType_
	 * @see #setType(VehicleType_)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getVehicle_Type()
	 * @model required="true"
	 * @generated
	 */
	VehicleType_ getType();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CommonFreightTransportMetamodel.network.VehicleType_
	 * @see #getType()
	 * @generated
	 */
	void setType(VehicleType_ value);

	/**
	 * Returns the value of the '<em><b>Depot</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depot</em>' container reference.
	 * @see #setDepot(VehicleDepot)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getVehicle_Depot()
	 * @see CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getVehicles
	 * @model opposite="vehicles" required="true" transient="false"
	 * @generated
	 */
	VehicleDepot getDepot();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getDepot <em>Depot</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depot</em>' container reference.
	 * @see #getDepot()
	 * @generated
	 */
	void setDepot(VehicleDepot value);

} // Vehicle
