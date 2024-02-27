/**
 */
package CommonFreightTransportMetamodel.logisticNetwork;

import CommonFreightTransportMetamodel.utils.HasId_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CEPSP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getVehicleDepots <em>Vehicle Depots</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getLogisticHubs <em>Logistic Hubs</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getName <em>Name</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getUsedPublicServicePoints <em>Used Public Service Points</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getDeliveryPartners <em>Delivery Partners</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getPickUpPartners <em>Pick Up Partners</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getCEPSP()
 * @model
 * @generated
 */
public interface CEPSP extends HasId_ {
	/**
	 * Returns the value of the '<em><b>Vehicle Depots</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Depots</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getCEPSP_VehicleDepots()
	 * @model containment="true"
	 * @generated
	 */
	EList<VehicleDepot> getVehicleDepots();

	/**
	 * Returns the value of the '<em><b>Logistic Hubs</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logistic Hubs</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getCEPSP_LogisticHubs()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogisticHub> getLogisticHubs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getCEPSP_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Used Public Service Points</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Public Service Points</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getCEPSP_UsedPublicServicePoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsedPublicServicePoint> getUsedPublicServicePoints();

	/**
	 * Returns the value of the '<em><b>Delivery Partners</b></em>' reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Partners</em>' reference list.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getCEPSP_DeliveryPartners()
	 * @model
	 * @generated
	 */
	EList<CEPSP> getDeliveryPartners();

	/**
	 * Returns the value of the '<em><b>Pick Up Partners</b></em>' reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick Up Partners</em>' reference list.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getCEPSP_PickUpPartners()
	 * @model
	 * @generated
	 */
	EList<CEPSP> getPickUpPartners();

} // CEPSP
