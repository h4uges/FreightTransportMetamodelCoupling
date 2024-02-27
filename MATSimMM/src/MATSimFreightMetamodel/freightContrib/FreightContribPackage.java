/**
 */
package MATSimFreightMetamodel.freightContrib;

import MATSimFreightMetamodel.base.BasePackage;

import MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see MATSimFreightMetamodel.freightContrib.FreightContribFactory
 * @model kind="package"
 * @generated
 */
public interface FreightContribPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "freightContrib";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/MATSimFreightMetamodel/freightContrib";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "freightContrib";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FreightContribPackage eINSTANCE = MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl.init();

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierImpl <em>Carrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierImpl
	 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrier()
	 * @generated
	 */
	int CARRIER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__PLAN = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__SERVICES = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shipments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__SHIPMENTS = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Carrier Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__CARRIER_CAPABILITIES = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierCapabilitiesImpl <em>Carrier Capabilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierCapabilitiesImpl
	 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierCapabilities()
	 * @generated
	 */
	int CARRIER_CAPABILITIES = 1;

	/**
	 * The feature id for the '<em><b>Carrier Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CAPABILITIES__CARRIER_VEHICLES = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CAPABILITIES__VEHICLE_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Fleet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CAPABILITIES__FLEET_SIZE = 2;

	/**
	 * The number of structural features of the '<em>Carrier Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CAPABILITIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Carrier Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CAPABILITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierPlanImpl <em>Carrier Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierPlanImpl
	 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierPlan()
	 * @generated
	 */
	int CARRIER_PLAN = 2;

	/**
	 * The feature id for the '<em><b>Scheduled Tours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_PLAN__SCHEDULED_TOURS = 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_PLAN__SCORE = 1;

	/**
	 * The number of structural features of the '<em>Carrier Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_PLAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Carrier Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierContainerImpl <em>Carrier Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierContainerImpl
	 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierContainer()
	 * @generated
	 */
	int CARRIER_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Carriers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONTAINER__CARRIERS = 0;

	/**
	 * The number of structural features of the '<em>Carrier Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Carrier Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierServiceImpl <em>Carrier Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierServiceImpl
	 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierService()
	 * @generated
	 */
	int CARRIER_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE__NAME = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE__SERVICE_DURATION = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE__TIME_WINDOW = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Capacity Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE__CAPACITY_DEMAND = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE__LOCATION = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Carrier Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Carrier Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierShipmentImpl <em>Carrier Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierShipmentImpl
	 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierShipment()
	 * @generated
	 */
	int CARRIER_SHIPMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT__SIZE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pickup Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT__PICKUP_TIME_WINDOW = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delivery Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pickup Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT__PICKUP_SERVICE_TIME = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Delivery Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT__DELIVERY_SERVICE_TIME = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT__FROM = BasePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT__TO = BasePackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Carrier Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Carrier Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.impl.ScheduledTourImpl <em>Scheduled Tour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.impl.ScheduledTourImpl
	 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getScheduledTour()
	 * @generated
	 */
	int SCHEDULED_TOUR = 6;

	/**
	 * The feature id for the '<em><b>Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TOUR__DEPARTURE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TOUR__VEHICLE = 1;

	/**
	 * The feature id for the '<em><b>Tour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TOUR__TOUR = 2;

	/**
	 * The number of structural features of the '<em>Scheduled Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TOUR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scheduled Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.impl.TimeWindowImpl <em>Time Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.impl.TimeWindowImpl
	 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getTimeWindow()
	 * @generated
	 */
	int TIME_WINDOW = 7;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__END = 1;

	/**
	 * The number of structural features of the '<em>Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierVehicleImpl <em>Carrier Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierVehicleImpl
	 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierVehicle()
	 * @generated
	 */
	int CARRIER_VEHICLE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_VEHICLE__ID = VehiclesPackage.VEHICLE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_VEHICLE__TYPE = VehiclesPackage.VEHICLE__TYPE;

	/**
	 * The feature id for the '<em><b>Earliest Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_VEHICLE__EARLIEST_START_TIME = VehiclesPackage.VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latest End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_VEHICLE__LATEST_END_TIME = VehiclesPackage.VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_VEHICLE__LOCATION = VehiclesPackage.VEHICLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Carrier Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_VEHICLE_FEATURE_COUNT = VehiclesPackage.VEHICLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Carrier Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_VEHICLE_OPERATION_COUNT = VehiclesPackage.VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.FleetSize <em>Fleet Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.FleetSize
	 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getFleetSize()
	 * @generated
	 */
	int FLEET_SIZE = 9;


	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.Carrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.Carrier
	 * @generated
	 */
	EClass getCarrier();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.freightContrib.Carrier#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.Carrier#getPlan()
	 * @see #getCarrier()
	 * @generated
	 */
	EReference getCarrier_Plan();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightContrib.Carrier#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.Carrier#getServices()
	 * @see #getCarrier()
	 * @generated
	 */
	EReference getCarrier_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightContrib.Carrier#getShipments <em>Shipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shipments</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.Carrier#getShipments()
	 * @see #getCarrier()
	 * @generated
	 */
	EReference getCarrier_Shipments();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.freightContrib.Carrier#getCarrierCapabilities <em>Carrier Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carrier Capabilities</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.Carrier#getCarrierCapabilities()
	 * @see #getCarrier()
	 * @generated
	 */
	EReference getCarrier_CarrierCapabilities();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.CarrierCapabilities <em>Carrier Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Capabilities</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierCapabilities
	 * @generated
	 */
	EClass getCarrierCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightContrib.CarrierCapabilities#getCarrierVehicles <em>Carrier Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrier Vehicles</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierCapabilities#getCarrierVehicles()
	 * @see #getCarrierCapabilities()
	 * @generated
	 */
	EReference getCarrierCapabilities_CarrierVehicles();

	/**
	 * Returns the meta object for the reference list '{@link MATSimFreightMetamodel.freightContrib.CarrierCapabilities#getVehicleTypes <em>Vehicle Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vehicle Types</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierCapabilities#getVehicleTypes()
	 * @see #getCarrierCapabilities()
	 * @generated
	 */
	EReference getCarrierCapabilities_VehicleTypes();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.CarrierCapabilities#getFleetSize <em>Fleet Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fleet Size</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierCapabilities#getFleetSize()
	 * @see #getCarrierCapabilities()
	 * @generated
	 */
	EAttribute getCarrierCapabilities_FleetSize();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.CarrierPlan <em>Carrier Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Plan</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierPlan
	 * @generated
	 */
	EClass getCarrierPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightContrib.CarrierPlan#getScheduledTours <em>Scheduled Tours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduled Tours</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierPlan#getScheduledTours()
	 * @see #getCarrierPlan()
	 * @generated
	 */
	EReference getCarrierPlan_ScheduledTours();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.CarrierPlan#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierPlan#getScore()
	 * @see #getCarrierPlan()
	 * @generated
	 */
	EAttribute getCarrierPlan_Score();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.CarrierContainer <em>Carrier Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Container</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierContainer
	 * @generated
	 */
	EClass getCarrierContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightContrib.CarrierContainer#getCarriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carriers</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierContainer#getCarriers()
	 * @see #getCarrierContainer()
	 * @generated
	 */
	EReference getCarrierContainer_Carriers();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.CarrierService <em>Carrier Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Service</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierService
	 * @generated
	 */
	EClass getCarrierService();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.CarrierService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierService#getName()
	 * @see #getCarrierService()
	 * @generated
	 */
	EAttribute getCarrierService_Name();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.CarrierService#getServiceDuration <em>Service Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Duration</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierService#getServiceDuration()
	 * @see #getCarrierService()
	 * @generated
	 */
	EAttribute getCarrierService_ServiceDuration();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.freightContrib.CarrierService#getTimeWindow <em>Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Window</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierService#getTimeWindow()
	 * @see #getCarrierService()
	 * @generated
	 */
	EReference getCarrierService_TimeWindow();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.CarrierService#getCapacityDemand <em>Capacity Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Demand</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierService#getCapacityDemand()
	 * @see #getCarrierService()
	 * @generated
	 */
	EAttribute getCarrierService_CapacityDemand();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.CarrierService#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierService#getLocation()
	 * @see #getCarrierService()
	 * @generated
	 */
	EReference getCarrierService_Location();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment <em>Carrier Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Shipment</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierShipment
	 * @generated
	 */
	EClass getCarrierShipment();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierShipment#getSize()
	 * @see #getCarrierShipment()
	 * @generated
	 */
	EAttribute getCarrierShipment_Size();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getPickupTimeWindow <em>Pickup Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pickup Time Window</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierShipment#getPickupTimeWindow()
	 * @see #getCarrierShipment()
	 * @generated
	 */
	EReference getCarrierShipment_PickupTimeWindow();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getDeliveryTimeWindow <em>Delivery Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delivery Time Window</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierShipment#getDeliveryTimeWindow()
	 * @see #getCarrierShipment()
	 * @generated
	 */
	EReference getCarrierShipment_DeliveryTimeWindow();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getPickupServiceTime <em>Pickup Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pickup Service Time</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierShipment#getPickupServiceTime()
	 * @see #getCarrierShipment()
	 * @generated
	 */
	EAttribute getCarrierShipment_PickupServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getDeliveryServiceTime <em>Delivery Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Service Time</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierShipment#getDeliveryServiceTime()
	 * @see #getCarrierShipment()
	 * @generated
	 */
	EAttribute getCarrierShipment_DeliveryServiceTime();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierShipment#getFrom()
	 * @see #getCarrierShipment()
	 * @generated
	 */
	EReference getCarrierShipment_From();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierShipment#getTo()
	 * @see #getCarrierShipment()
	 * @generated
	 */
	EReference getCarrierShipment_To();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.ScheduledTour <em>Scheduled Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Tour</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.ScheduledTour
	 * @generated
	 */
	EClass getScheduledTour();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.ScheduledTour#getDepartureTime <em>Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure Time</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.ScheduledTour#getDepartureTime()
	 * @see #getScheduledTour()
	 * @generated
	 */
	EAttribute getScheduledTour_DepartureTime();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.ScheduledTour#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.ScheduledTour#getVehicle()
	 * @see #getScheduledTour()
	 * @generated
	 */
	EReference getScheduledTour_Vehicle();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.freightContrib.ScheduledTour#getTour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tour</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.ScheduledTour#getTour()
	 * @see #getScheduledTour()
	 * @generated
	 */
	EReference getScheduledTour_Tour();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.TimeWindow <em>Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Window</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.TimeWindow
	 * @generated
	 */
	EClass getTimeWindow();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.TimeWindow#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.TimeWindow#getStart()
	 * @see #getTimeWindow()
	 * @generated
	 */
	EAttribute getTimeWindow_Start();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.TimeWindow#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.TimeWindow#getEnd()
	 * @see #getTimeWindow()
	 * @generated
	 */
	EAttribute getTimeWindow_End();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.CarrierVehicle <em>Carrier Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Vehicle</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierVehicle
	 * @generated
	 */
	EClass getCarrierVehicle();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.CarrierVehicle#getEarliestStartTime <em>Earliest Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Start Time</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierVehicle#getEarliestStartTime()
	 * @see #getCarrierVehicle()
	 * @generated
	 */
	EAttribute getCarrierVehicle_EarliestStartTime();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.CarrierVehicle#getLatestEndTime <em>Latest End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest End Time</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierVehicle#getLatestEndTime()
	 * @see #getCarrierVehicle()
	 * @generated
	 */
	EAttribute getCarrierVehicle_LatestEndTime();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.CarrierVehicle#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierVehicle#getLocation()
	 * @see #getCarrierVehicle()
	 * @generated
	 */
	EReference getCarrierVehicle_Location();

	/**
	 * Returns the meta object for enum '{@link MATSimFreightMetamodel.freightContrib.FleetSize <em>Fleet Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fleet Size</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.FleetSize
	 * @generated
	 */
	EEnum getFleetSize();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FreightContribFactory getFreightContribFactory();

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
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierImpl <em>Carrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierImpl
		 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrier()
		 * @generated
		 */
		EClass CARRIER = eINSTANCE.getCarrier();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER__PLAN = eINSTANCE.getCarrier_Plan();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER__SERVICES = eINSTANCE.getCarrier_Services();

		/**
		 * The meta object literal for the '<em><b>Shipments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER__SHIPMENTS = eINSTANCE.getCarrier_Shipments();

		/**
		 * The meta object literal for the '<em><b>Carrier Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER__CARRIER_CAPABILITIES = eINSTANCE.getCarrier_CarrierCapabilities();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierCapabilitiesImpl <em>Carrier Capabilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierCapabilitiesImpl
		 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierCapabilities()
		 * @generated
		 */
		EClass CARRIER_CAPABILITIES = eINSTANCE.getCarrierCapabilities();

		/**
		 * The meta object literal for the '<em><b>Carrier Vehicles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CAPABILITIES__CARRIER_VEHICLES = eINSTANCE.getCarrierCapabilities_CarrierVehicles();

		/**
		 * The meta object literal for the '<em><b>Vehicle Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CAPABILITIES__VEHICLE_TYPES = eINSTANCE.getCarrierCapabilities_VehicleTypes();

		/**
		 * The meta object literal for the '<em><b>Fleet Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_CAPABILITIES__FLEET_SIZE = eINSTANCE.getCarrierCapabilities_FleetSize();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierPlanImpl <em>Carrier Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierPlanImpl
		 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierPlan()
		 * @generated
		 */
		EClass CARRIER_PLAN = eINSTANCE.getCarrierPlan();

		/**
		 * The meta object literal for the '<em><b>Scheduled Tours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_PLAN__SCHEDULED_TOURS = eINSTANCE.getCarrierPlan_ScheduledTours();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_PLAN__SCORE = eINSTANCE.getCarrierPlan_Score();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierContainerImpl <em>Carrier Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierContainerImpl
		 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierContainer()
		 * @generated
		 */
		EClass CARRIER_CONTAINER = eINSTANCE.getCarrierContainer();

		/**
		 * The meta object literal for the '<em><b>Carriers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CONTAINER__CARRIERS = eINSTANCE.getCarrierContainer_Carriers();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierServiceImpl <em>Carrier Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierServiceImpl
		 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierService()
		 * @generated
		 */
		EClass CARRIER_SERVICE = eINSTANCE.getCarrierService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SERVICE__NAME = eINSTANCE.getCarrierService_Name();

		/**
		 * The meta object literal for the '<em><b>Service Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SERVICE__SERVICE_DURATION = eINSTANCE.getCarrierService_ServiceDuration();

		/**
		 * The meta object literal for the '<em><b>Time Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SERVICE__TIME_WINDOW = eINSTANCE.getCarrierService_TimeWindow();

		/**
		 * The meta object literal for the '<em><b>Capacity Demand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SERVICE__CAPACITY_DEMAND = eINSTANCE.getCarrierService_CapacityDemand();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SERVICE__LOCATION = eINSTANCE.getCarrierService_Location();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierShipmentImpl <em>Carrier Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierShipmentImpl
		 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierShipment()
		 * @generated
		 */
		EClass CARRIER_SHIPMENT = eINSTANCE.getCarrierShipment();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT__SIZE = eINSTANCE.getCarrierShipment_Size();

		/**
		 * The meta object literal for the '<em><b>Pickup Time Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT__PICKUP_TIME_WINDOW = eINSTANCE.getCarrierShipment_PickupTimeWindow();

		/**
		 * The meta object literal for the '<em><b>Delivery Time Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW = eINSTANCE.getCarrierShipment_DeliveryTimeWindow();

		/**
		 * The meta object literal for the '<em><b>Pickup Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT__PICKUP_SERVICE_TIME = eINSTANCE.getCarrierShipment_PickupServiceTime();

		/**
		 * The meta object literal for the '<em><b>Delivery Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT__DELIVERY_SERVICE_TIME = eINSTANCE.getCarrierShipment_DeliveryServiceTime();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT__FROM = eINSTANCE.getCarrierShipment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT__TO = eINSTANCE.getCarrierShipment_To();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.impl.ScheduledTourImpl <em>Scheduled Tour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.impl.ScheduledTourImpl
		 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getScheduledTour()
		 * @generated
		 */
		EClass SCHEDULED_TOUR = eINSTANCE.getScheduledTour();

		/**
		 * The meta object literal for the '<em><b>Departure Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_TOUR__DEPARTURE_TIME = eINSTANCE.getScheduledTour_DepartureTime();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULED_TOUR__VEHICLE = eINSTANCE.getScheduledTour_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Tour</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULED_TOUR__TOUR = eINSTANCE.getScheduledTour_Tour();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.impl.TimeWindowImpl <em>Time Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.impl.TimeWindowImpl
		 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getTimeWindow()
		 * @generated
		 */
		EClass TIME_WINDOW = eINSTANCE.getTimeWindow();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_WINDOW__START = eINSTANCE.getTimeWindow_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_WINDOW__END = eINSTANCE.getTimeWindow_End();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.impl.CarrierVehicleImpl <em>Carrier Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.impl.CarrierVehicleImpl
		 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getCarrierVehicle()
		 * @generated
		 */
		EClass CARRIER_VEHICLE = eINSTANCE.getCarrierVehicle();

		/**
		 * The meta object literal for the '<em><b>Earliest Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_VEHICLE__EARLIEST_START_TIME = eINSTANCE.getCarrierVehicle_EarliestStartTime();

		/**
		 * The meta object literal for the '<em><b>Latest End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_VEHICLE__LATEST_END_TIME = eINSTANCE.getCarrierVehicle_LatestEndTime();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_VEHICLE__LOCATION = eINSTANCE.getCarrierVehicle_Location();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.FleetSize <em>Fleet Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.FleetSize
		 * @see MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl#getFleetSize()
		 * @generated
		 */
		EEnum FLEET_SIZE = eINSTANCE.getFleetSize();

	}

} //FreightContribPackage
