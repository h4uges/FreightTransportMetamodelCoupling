/**
 */
package CommonFreightTransportMetamodel.logisticNetwork;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.Dimension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Service Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint#getLocation <em>Location</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint#getStorageCapacity <em>Storage Capacity</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getPublicServicePoint()
 * @model abstract="true"
 * @generated
 */
public interface PublicServicePoint extends LogisticFacility {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location_)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getPublicServicePoint_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location_ getLocation();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location_ value);

	/**
	 * Returns the value of the '<em><b>Storage Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Capacity</em>' containment reference.
	 * @see #setStorageCapacity(Dimension)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getPublicServicePoint_StorageCapacity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dimension getStorageCapacity();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint#getStorageCapacity <em>Storage Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Capacity</em>' containment reference.
	 * @see #getStorageCapacity()
	 * @generated
	 */
	void setStorageCapacity(Dimension value);

} // PublicServicePoint
