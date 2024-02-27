/**
 */
package CommonFreightTransportMetamodel.logisticNetwork;

import CommonFreightTransportMetamodel.network.Location_;
import CommonFreightTransportMetamodel.network.VehicleType_;

import CommonFreightTransportMetamodel.utils.Dimension;
import CommonFreightTransportMetamodel.utils.Durration_;
import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.TimeWindow_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logistic Hub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getStorageCapacity <em>Storage Capacity</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getLocation <em>Location</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getOperationHours <em>Operation Hours</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getAcceptedVehicleTypes <em>Accepted Vehicle Types</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getMinimumTranshipmentTime <em>Minimum Transhipment Time</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#isIsExit <em>Is Exit</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#isIsEntry <em>Is Entry</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getLogisticHub()
 * @model
 * @generated
 */
public interface LogisticHub extends LogisticFacility, HasId_ {
	/**
	 * Returns the value of the '<em><b>Storage Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Capacity</em>' containment reference.
	 * @see #setStorageCapacity(Dimension)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getLogisticHub_StorageCapacity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dimension getStorageCapacity();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getStorageCapacity <em>Storage Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Capacity</em>' containment reference.
	 * @see #getStorageCapacity()
	 * @generated
	 */
	void setStorageCapacity(Dimension value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location_)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getLogisticHub_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location_ getLocation();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getLocation <em>Location</em>}' containment reference.
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
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getLogisticHub_OperationHours()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeWindow_> getOperationHours();

	/**
	 * Returns the value of the '<em><b>Accepted Vehicle Types</b></em>' attribute list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.network.VehicleType_}.
	 * The literals are from the enumeration {@link CommonFreightTransportMetamodel.network.VehicleType_}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Vehicle Types</em>' attribute list.
	 * @see CommonFreightTransportMetamodel.network.VehicleType_
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getLogisticHub_AcceptedVehicleTypes()
	 * @model
	 * @generated
	 */
	EList<VehicleType_> getAcceptedVehicleTypes();

	/**
	 * Returns the value of the '<em><b>Minimum Transhipment Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Transhipment Time</em>' containment reference.
	 * @see #setMinimumTranshipmentTime(Durration_)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getLogisticHub_MinimumTranshipmentTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Durration_ getMinimumTranshipmentTime();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getMinimumTranshipmentTime <em>Minimum Transhipment Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Transhipment Time</em>' containment reference.
	 * @see #getMinimumTranshipmentTime()
	 * @generated
	 */
	void setMinimumTranshipmentTime(Durration_ value);

	/**
	 * Returns the value of the '<em><b>Is Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exit</em>' attribute.
	 * @see #setIsExit(boolean)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getLogisticHub_IsExit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isIsExit();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#isIsExit <em>Is Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exit</em>' attribute.
	 * @see #isIsExit()
	 * @generated
	 */
	void setIsExit(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Entry</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Entry</em>' attribute.
	 * @see #setIsEntry(boolean)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getLogisticHub_IsEntry()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isIsEntry();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#isIsEntry <em>Is Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entry</em>' attribute.
	 * @see #isIsEntry()
	 * @generated
	 */
	void setIsEntry(boolean value);

} // LogisticHub
