/**
 */
package CommonFreightTransportMetamodel.logisticNetwork;

import CommonFreightTransportMetamodel.utils.UtilsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkFactory
 * @model kind="package"
 * @generated
 */
public interface LogisticNetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logisticNetwork";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/commonFreightTransportMetamodel/logisticNetwork";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logisticNetwork";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogisticNetworkPackage eINSTANCE = CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.CEPSPImpl <em>CEPSP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.CEPSPImpl
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getCEPSP()
	 * @generated
	 */
	int CEPSP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEPSP__ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Vehicle Depots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEPSP__VEHICLE_DEPOTS = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logistic Hubs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEPSP__LOGISTIC_HUBS = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEPSP__NAME = UtilsPackage.HAS_ID__FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Used Public Service Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEPSP__USED_PUBLIC_SERVICE_POINTS = UtilsPackage.HAS_ID__FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Delivery Partners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEPSP__DELIVERY_PARTNERS = UtilsPackage.HAS_ID__FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pick Up Partners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEPSP__PICK_UP_PARTNERS = UtilsPackage.HAS_ID__FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>CEPSP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEPSP_FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>CEPSP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEPSP_OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkImpl <em>Logistic Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkImpl
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getLogisticNetwork()
	 * @generated
	 */
	int LOGISTIC_NETWORK = 1;

	/**
	 * The feature id for the '<em><b>CEPS Ps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_NETWORK__CEPS_PS = 0;

	/**
	 * The feature id for the '<em><b>Public Service Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_NETWORK__PUBLIC_SERVICE_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Logistic Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_NETWORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Logistic Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticFacilityImpl <em>Logistic Facility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticFacilityImpl
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getLogisticFacility()
	 * @generated
	 */
	int LOGISTIC_FACILITY = 9;

	/**
	 * The number of structural features of the '<em>Logistic Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_FACILITY_FEATURE_COUNT = UtilsPackage.SHIPMENTL_LEG_START_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logistic Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_FACILITY_OPERATION_COUNT = UtilsPackage.SHIPMENTL_LEG_START_END_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.PublicServicePointImpl <em>Public Service Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.PublicServicePointImpl
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getPublicServicePoint()
	 * @generated
	 */
	int PUBLIC_SERVICE_POINT = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SERVICE_POINT__LOCATION = LOGISTIC_FACILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Storage Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SERVICE_POINT__STORAGE_CAPACITY = LOGISTIC_FACILITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Public Service Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SERVICE_POINT_FEATURE_COUNT = LOGISTIC_FACILITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Public Service Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SERVICE_POINT_OPERATION_COUNT = LOGISTIC_FACILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.PackstationImpl <em>Packstation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.PackstationImpl
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getPackstation()
	 * @generated
	 */
	int PACKSTATION = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKSTATION__LOCATION = PUBLIC_SERVICE_POINT__LOCATION;

	/**
	 * The feature id for the '<em><b>Storage Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKSTATION__STORAGE_CAPACITY = PUBLIC_SERVICE_POINT__STORAGE_CAPACITY;

	/**
	 * The number of structural features of the '<em>Packstation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKSTATION_FEATURE_COUNT = PUBLIC_SERVICE_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Packstation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKSTATION_OPERATION_COUNT = PUBLIC_SERVICE_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.ShopImpl <em>Shop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.ShopImpl
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getShop()
	 * @generated
	 */
	int SHOP = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__LOCATION = PUBLIC_SERVICE_POINT__LOCATION;

	/**
	 * The feature id for the '<em><b>Storage Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__STORAGE_CAPACITY = PUBLIC_SERVICE_POINT__STORAGE_CAPACITY;

	/**
	 * The feature id for the '<em><b>Opening Hours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__OPENING_HOURS = PUBLIC_SERVICE_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP_FEATURE_COUNT = PUBLIC_SERVICE_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP_OPERATION_COUNT = PUBLIC_SERVICE_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleDepotImpl <em>Vehicle Depot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleDepotImpl
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getVehicleDepot()
	 * @generated
	 */
	int VEHICLE_DEPOT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DEPOT__ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DEPOT__LOCATION = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Hours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DEPOT__OPERATION_HOURS = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DEPOT__VEHICLES = UtilsPackage.HAS_ID__FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vehicle Depot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DEPOT_FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Vehicle Depot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_DEPOT_OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl <em>Logistic Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getLogisticHub()
	 * @generated
	 */
	int LOGISTIC_HUB = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB__ID = LOGISTIC_FACILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Storage Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB__STORAGE_CAPACITY = LOGISTIC_FACILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB__LOCATION = LOGISTIC_FACILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation Hours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB__OPERATION_HOURS = LOGISTIC_FACILITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accepted Vehicle Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB__ACCEPTED_VEHICLE_TYPES = LOGISTIC_FACILITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Minimum Transhipment Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME = LOGISTIC_FACILITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB__IS_EXIT = LOGISTIC_FACILITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB__IS_ENTRY = LOGISTIC_FACILITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Logistic Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB_FEATURE_COUNT = LOGISTIC_FACILITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Logistic Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB_OPERATION_COUNT = LOGISTIC_FACILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.UsedPublicServicePointImpl <em>Used Public Service Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.UsedPublicServicePointImpl
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getUsedPublicServicePoint()
	 * @generated
	 */
	int USED_PUBLIC_SERVICE_POINT = 7;

	/**
	 * The feature id for the '<em><b>Public Service Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_PUBLIC_SERVICE_POINT__PUBLIC_SERVICE_POINT = 0;

	/**
	 * The feature id for the '<em><b>Granted Storage Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY = 1;

	/**
	 * The number of structural features of the '<em>Used Public Service Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_PUBLIC_SERVICE_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Used Public Service Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_PUBLIC_SERVICE_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleImpl
	 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Storage Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__STORAGE_CAPACITY = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Hours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__OPERATION_HOURS = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__TYPE = UtilsPackage.HAS_ID__FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Depot</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__DEPOT = UtilsPackage.HAS_ID__FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP <em>CEPSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEPSP</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.CEPSP
	 * @generated
	 */
	EClass getCEPSP();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getVehicleDepots <em>Vehicle Depots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicle Depots</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getVehicleDepots()
	 * @see #getCEPSP()
	 * @generated
	 */
	EReference getCEPSP_VehicleDepots();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getLogisticHubs <em>Logistic Hubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logistic Hubs</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getLogisticHubs()
	 * @see #getCEPSP()
	 * @generated
	 */
	EReference getCEPSP_LogisticHubs();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getName()
	 * @see #getCEPSP()
	 * @generated
	 */
	EAttribute getCEPSP_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getUsedPublicServicePoints <em>Used Public Service Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used Public Service Points</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getUsedPublicServicePoints()
	 * @see #getCEPSP()
	 * @generated
	 */
	EReference getCEPSP_UsedPublicServicePoints();

	/**
	 * Returns the meta object for the reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getDeliveryPartners <em>Delivery Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delivery Partners</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getDeliveryPartners()
	 * @see #getCEPSP()
	 * @generated
	 */
	EReference getCEPSP_DeliveryPartners();

	/**
	 * Returns the meta object for the reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getPickUpPartners <em>Pick Up Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pick Up Partners</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.CEPSP#getPickUpPartners()
	 * @see #getCEPSP()
	 * @generated
	 */
	EReference getCEPSP_PickUpPartners();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork <em>Logistic Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Network</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork
	 * @generated
	 */
	EClass getLogisticNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork#getCEPSPs <em>CEPS Ps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CEPS Ps</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork#getCEPSPs()
	 * @see #getLogisticNetwork()
	 * @generated
	 */
	EReference getLogisticNetwork_CEPSPs();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork#getPublicServicePoints <em>Public Service Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public Service Points</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork#getPublicServicePoints()
	 * @see #getLogisticNetwork()
	 * @generated
	 */
	EReference getLogisticNetwork_PublicServicePoints();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint <em>Public Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Service Point</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint
	 * @generated
	 */
	EClass getPublicServicePoint();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint#getLocation()
	 * @see #getPublicServicePoint()
	 * @generated
	 */
	EReference getPublicServicePoint_Location();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint#getStorageCapacity <em>Storage Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Storage Capacity</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint#getStorageCapacity()
	 * @see #getPublicServicePoint()
	 * @generated
	 */
	EReference getPublicServicePoint_StorageCapacity();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticNetwork.Packstation <em>Packstation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packstation</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Packstation
	 * @generated
	 */
	EClass getPackstation();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticNetwork.Shop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shop</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Shop
	 * @generated
	 */
	EClass getShop();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.Shop#getOpeningHours <em>Opening Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opening Hours</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Shop#getOpeningHours()
	 * @see #getShop()
	 * @generated
	 */
	EReference getShop_OpeningHours();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot <em>Vehicle Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Depot</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot
	 * @generated
	 */
	EClass getVehicleDepot();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getLocation()
	 * @see #getVehicleDepot()
	 * @generated
	 */
	EReference getVehicleDepot_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getOperationHours <em>Operation Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Hours</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getOperationHours()
	 * @see #getVehicleDepot()
	 * @generated
	 */
	EReference getVehicleDepot_OperationHours();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicles</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot#getVehicles()
	 * @see #getVehicleDepot()
	 * @generated
	 */
	EReference getVehicleDepot_Vehicles();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub <em>Logistic Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Hub</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticHub
	 * @generated
	 */
	EClass getLogisticHub();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getStorageCapacity <em>Storage Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Storage Capacity</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getStorageCapacity()
	 * @see #getLogisticHub()
	 * @generated
	 */
	EReference getLogisticHub_StorageCapacity();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getLocation()
	 * @see #getLogisticHub()
	 * @generated
	 */
	EReference getLogisticHub_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getOperationHours <em>Operation Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Hours</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getOperationHours()
	 * @see #getLogisticHub()
	 * @generated
	 */
	EReference getLogisticHub_OperationHours();

	/**
	 * Returns the meta object for the attribute list '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getAcceptedVehicleTypes <em>Accepted Vehicle Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Vehicle Types</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getAcceptedVehicleTypes()
	 * @see #getLogisticHub()
	 * @generated
	 */
	EAttribute getLogisticHub_AcceptedVehicleTypes();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getMinimumTranshipmentTime <em>Minimum Transhipment Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum Transhipment Time</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#getMinimumTranshipmentTime()
	 * @see #getLogisticHub()
	 * @generated
	 */
	EReference getLogisticHub_MinimumTranshipmentTime();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#isIsExit <em>Is Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exit</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#isIsExit()
	 * @see #getLogisticHub()
	 * @generated
	 */
	EAttribute getLogisticHub_IsExit();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#isIsEntry <em>Is Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Entry</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticHub#isIsEntry()
	 * @see #getLogisticHub()
	 * @generated
	 */
	EAttribute getLogisticHub_IsEntry();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint <em>Used Public Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used Public Service Point</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint
	 * @generated
	 */
	EClass getUsedPublicServicePoint();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint#getPublicServicePoint <em>Public Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Public Service Point</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint#getPublicServicePoint()
	 * @see #getUsedPublicServicePoint()
	 * @generated
	 */
	EReference getUsedPublicServicePoint_PublicServicePoint();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint#getGrantedStorageCapacity <em>Granted Storage Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Granted Storage Capacity</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint#getGrantedStorageCapacity()
	 * @see #getUsedPublicServicePoint()
	 * @generated
	 */
	EReference getUsedPublicServicePoint_GrantedStorageCapacity();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getStorageCapacity <em>Storage Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Storage Capacity</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getStorageCapacity()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_StorageCapacity();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getOperationHours <em>Operation Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Hours</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getOperationHours()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_OperationHours();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getType()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Type();

	/**
	 * Returns the meta object for the container reference '{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getDepot <em>Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Depot</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Vehicle#getDepot()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Depot();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticFacility <em>Logistic Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Facility</em>'.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticFacility
	 * @generated
	 */
	EClass getLogisticFacility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogisticNetworkFactory getLogisticNetworkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.CEPSPImpl <em>CEPSP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.CEPSPImpl
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getCEPSP()
		 * @generated
		 */
		EClass CEPSP = eINSTANCE.getCEPSP();

		/**
		 * The meta object literal for the '<em><b>Vehicle Depots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEPSP__VEHICLE_DEPOTS = eINSTANCE.getCEPSP_VehicleDepots();

		/**
		 * The meta object literal for the '<em><b>Logistic Hubs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEPSP__LOGISTIC_HUBS = eINSTANCE.getCEPSP_LogisticHubs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEPSP__NAME = eINSTANCE.getCEPSP_Name();

		/**
		 * The meta object literal for the '<em><b>Used Public Service Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEPSP__USED_PUBLIC_SERVICE_POINTS = eINSTANCE.getCEPSP_UsedPublicServicePoints();

		/**
		 * The meta object literal for the '<em><b>Delivery Partners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEPSP__DELIVERY_PARTNERS = eINSTANCE.getCEPSP_DeliveryPartners();

		/**
		 * The meta object literal for the '<em><b>Pick Up Partners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEPSP__PICK_UP_PARTNERS = eINSTANCE.getCEPSP_PickUpPartners();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkImpl <em>Logistic Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkImpl
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getLogisticNetwork()
		 * @generated
		 */
		EClass LOGISTIC_NETWORK = eINSTANCE.getLogisticNetwork();

		/**
		 * The meta object literal for the '<em><b>CEPS Ps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_NETWORK__CEPS_PS = eINSTANCE.getLogisticNetwork_CEPSPs();

		/**
		 * The meta object literal for the '<em><b>Public Service Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_NETWORK__PUBLIC_SERVICE_POINTS = eINSTANCE.getLogisticNetwork_PublicServicePoints();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.PublicServicePointImpl <em>Public Service Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.PublicServicePointImpl
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getPublicServicePoint()
		 * @generated
		 */
		EClass PUBLIC_SERVICE_POINT = eINSTANCE.getPublicServicePoint();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_SERVICE_POINT__LOCATION = eINSTANCE.getPublicServicePoint_Location();

		/**
		 * The meta object literal for the '<em><b>Storage Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_SERVICE_POINT__STORAGE_CAPACITY = eINSTANCE.getPublicServicePoint_StorageCapacity();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.PackstationImpl <em>Packstation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.PackstationImpl
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getPackstation()
		 * @generated
		 */
		EClass PACKSTATION = eINSTANCE.getPackstation();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.ShopImpl <em>Shop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.ShopImpl
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getShop()
		 * @generated
		 */
		EClass SHOP = eINSTANCE.getShop();

		/**
		 * The meta object literal for the '<em><b>Opening Hours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOP__OPENING_HOURS = eINSTANCE.getShop_OpeningHours();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleDepotImpl <em>Vehicle Depot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleDepotImpl
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getVehicleDepot()
		 * @generated
		 */
		EClass VEHICLE_DEPOT = eINSTANCE.getVehicleDepot();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DEPOT__LOCATION = eINSTANCE.getVehicleDepot_Location();

		/**
		 * The meta object literal for the '<em><b>Operation Hours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DEPOT__OPERATION_HOURS = eINSTANCE.getVehicleDepot_OperationHours();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_DEPOT__VEHICLES = eINSTANCE.getVehicleDepot_Vehicles();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl <em>Logistic Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getLogisticHub()
		 * @generated
		 */
		EClass LOGISTIC_HUB = eINSTANCE.getLogisticHub();

		/**
		 * The meta object literal for the '<em><b>Storage Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_HUB__STORAGE_CAPACITY = eINSTANCE.getLogisticHub_StorageCapacity();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_HUB__LOCATION = eINSTANCE.getLogisticHub_Location();

		/**
		 * The meta object literal for the '<em><b>Operation Hours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_HUB__OPERATION_HOURS = eINSTANCE.getLogisticHub_OperationHours();

		/**
		 * The meta object literal for the '<em><b>Accepted Vehicle Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGISTIC_HUB__ACCEPTED_VEHICLE_TYPES = eINSTANCE.getLogisticHub_AcceptedVehicleTypes();

		/**
		 * The meta object literal for the '<em><b>Minimum Transhipment Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME = eINSTANCE.getLogisticHub_MinimumTranshipmentTime();

		/**
		 * The meta object literal for the '<em><b>Is Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGISTIC_HUB__IS_EXIT = eINSTANCE.getLogisticHub_IsExit();

		/**
		 * The meta object literal for the '<em><b>Is Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGISTIC_HUB__IS_ENTRY = eINSTANCE.getLogisticHub_IsEntry();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.UsedPublicServicePointImpl <em>Used Public Service Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.UsedPublicServicePointImpl
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getUsedPublicServicePoint()
		 * @generated
		 */
		EClass USED_PUBLIC_SERVICE_POINT = eINSTANCE.getUsedPublicServicePoint();

		/**
		 * The meta object literal for the '<em><b>Public Service Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_PUBLIC_SERVICE_POINT__PUBLIC_SERVICE_POINT = eINSTANCE.getUsedPublicServicePoint_PublicServicePoint();

		/**
		 * The meta object literal for the '<em><b>Granted Storage Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY = eINSTANCE.getUsedPublicServicePoint_GrantedStorageCapacity();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleImpl
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Storage Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__STORAGE_CAPACITY = eINSTANCE.getVehicle_StorageCapacity();

		/**
		 * The meta object literal for the '<em><b>Operation Hours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__OPERATION_HOURS = eINSTANCE.getVehicle_OperationHours();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__TYPE = eINSTANCE.getVehicle_Type();

		/**
		 * The meta object literal for the '<em><b>Depot</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__DEPOT = eINSTANCE.getVehicle_Depot();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticFacilityImpl <em>Logistic Facility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticFacilityImpl
		 * @see CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl#getLogisticFacility()
		 * @generated
		 */
		EClass LOGISTIC_FACILITY = eINSTANCE.getLogisticFacility();

	}

} //LogisticNetworkPackage
