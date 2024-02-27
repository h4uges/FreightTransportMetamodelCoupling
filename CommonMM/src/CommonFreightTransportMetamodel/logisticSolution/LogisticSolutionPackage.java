/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

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
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionFactory
 * @model kind="package"
 * @generated
 */
public interface LogisticSolutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logisticSolution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/commonFreightTransportMetamodel/logisticSolution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logisticSolution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogisticSolutionPackage eINSTANCE = CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.TourImpl <em>Tour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.TourImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getTour()
	 * @generated
	 */
	int TOUR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__STOPS = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__VEHICLE = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.StopImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Stop Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__STOP_TIME_WINDOW = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__NO = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stop Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__STOP_LOCATION = UtilsPackage.HAS_ID__FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordImpl <em>Shipment Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getShipmentRecord()
	 * @generated
	 */
	int SHIPMENT_RECORD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD__ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD__SHIPMENT = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD__ENTRIES = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repsonsible CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD__REPSONSIBLE_CEPSP = UtilsPackage.HAS_ID__FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD__ENTRY = UtilsPackage.HAS_ID__FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD__EXIT = UtilsPackage.HAS_ID__FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Shipment Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Shipment Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.StartEndStopImpl <em>Start End Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.StartEndStopImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getStartEndStop()
	 * @generated
	 */
	int START_END_STOP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_STOP__ID = STOP__ID;

	/**
	 * The feature id for the '<em><b>Stop Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_STOP__STOP_TIME_WINDOW = STOP__STOP_TIME_WINDOW;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_STOP__NO = STOP__NO;

	/**
	 * The feature id for the '<em><b>Stop Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_STOP__STOP_LOCATION = STOP__STOP_LOCATION;

	/**
	 * The feature id for the '<em><b>Depot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_STOP__DEPOT = STOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start End Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_STOP_FEATURE_COUNT = STOP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start End Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_STOP_OPERATION_COUNT = STOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.PickUpDeliveryStopImpl <em>Pick Up Delivery Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.PickUpDeliveryStopImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getPickUpDeliveryStop()
	 * @generated
	 */
	int PICK_UP_DELIVERY_STOP = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_DELIVERY_STOP__ID = STOP__ID;

	/**
	 * The feature id for the '<em><b>Stop Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_DELIVERY_STOP__STOP_TIME_WINDOW = STOP__STOP_TIME_WINDOW;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_DELIVERY_STOP__NO = STOP__NO;

	/**
	 * The feature id for the '<em><b>Stop Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_DELIVERY_STOP__STOP_LOCATION = STOP__STOP_LOCATION;

	/**
	 * The feature id for the '<em><b>Unloaded Shipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_DELIVERY_STOP__UNLOADED_SHIPMENTS = STOP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded Shipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_DELIVERY_STOP__LOADED_SHIPMENTS = STOP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pick Up Delivery Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_DELIVERY_STOP_FEATURE_COUNT = STOP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pick Up Delivery Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_DELIVERY_STOP_OPERATION_COUNT = STOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticFacilityStopImpl <em>Logistic Facility Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticFacilityStopImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getLogisticFacilityStop()
	 * @generated
	 */
	int LOGISTIC_FACILITY_STOP = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_FACILITY_STOP__ID = PICK_UP_DELIVERY_STOP__ID;

	/**
	 * The feature id for the '<em><b>Stop Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_FACILITY_STOP__STOP_TIME_WINDOW = PICK_UP_DELIVERY_STOP__STOP_TIME_WINDOW;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_FACILITY_STOP__NO = PICK_UP_DELIVERY_STOP__NO;

	/**
	 * The feature id for the '<em><b>Stop Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_FACILITY_STOP__STOP_LOCATION = PICK_UP_DELIVERY_STOP__STOP_LOCATION;

	/**
	 * The feature id for the '<em><b>Unloaded Shipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_FACILITY_STOP__UNLOADED_SHIPMENTS = PICK_UP_DELIVERY_STOP__UNLOADED_SHIPMENTS;

	/**
	 * The feature id for the '<em><b>Loaded Shipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_FACILITY_STOP__LOADED_SHIPMENTS = PICK_UP_DELIVERY_STOP__LOADED_SHIPMENTS;

	/**
	 * The feature id for the '<em><b>Logistic Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_FACILITY_STOP__LOGISTIC_FACILITY = PICK_UP_DELIVERY_STOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logistic Facility Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_FACILITY_STOP_FEATURE_COUNT = PICK_UP_DELIVERY_STOP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logistic Facility Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_FACILITY_STOP_OPERATION_COUNT = PICK_UP_DELIVERY_STOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.NormalStopImpl <em>Normal Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.NormalStopImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getNormalStop()
	 * @generated
	 */
	int NORMAL_STOP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STOP__ID = PICK_UP_DELIVERY_STOP__ID;

	/**
	 * The feature id for the '<em><b>Stop Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STOP__STOP_TIME_WINDOW = PICK_UP_DELIVERY_STOP__STOP_TIME_WINDOW;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STOP__NO = PICK_UP_DELIVERY_STOP__NO;

	/**
	 * The feature id for the '<em><b>Stop Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STOP__STOP_LOCATION = PICK_UP_DELIVERY_STOP__STOP_LOCATION;

	/**
	 * The feature id for the '<em><b>Unloaded Shipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STOP__UNLOADED_SHIPMENTS = PICK_UP_DELIVERY_STOP__UNLOADED_SHIPMENTS;

	/**
	 * The feature id for the '<em><b>Loaded Shipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STOP__LOADED_SHIPMENTS = PICK_UP_DELIVERY_STOP__LOADED_SHIPMENTS;

	/**
	 * The number of structural features of the '<em>Normal Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STOP_FEATURE_COUNT = PICK_UP_DELIVERY_STOP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Normal Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STOP_OPERATION_COUNT = PICK_UP_DELIVERY_STOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl <em>Shipment Record Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getShipmentRecordEntry()
	 * @generated
	 */
	int SHIPMENT_RECORD_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_ENTRY__ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Executing CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_ENTRY__EXECUTING_CEPSP = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_ENTRY__NO = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_ENTRY__FROM = UtilsPackage.HAS_ID__FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_ENTRY__TO = UtilsPackage.HAS_ID__FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_ENTRY__TIME_WINDOW = UtilsPackage.HAS_ID__FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_ENTRY__FROM_SPEC = UtilsPackage.HAS_ID__FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>To Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_ENTRY__TO_SPEC = UtilsPackage.HAS_ID__FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_ENTRY__TOUR = UtilsPackage.HAS_ID__FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Shipment Record Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_ENTRY_FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Shipment Record Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECORD_ENTRY_OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentEntryImpl <em>Shipment Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentEntryImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getShipmentEntry()
	 * @generated
	 */
	int SHIPMENT_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ENTRY__TIME = 0;

	/**
	 * The number of structural features of the '<em>Shipment Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Shipment Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentExitImpl <em>Shipment Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentExitImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getShipmentExit()
	 * @generated
	 */
	int SHIPMENT_EXIT = 9;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_EXIT__TIME = 0;

	/**
	 * The number of structural features of the '<em>Shipment Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_EXIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Shipment Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_EXIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticHubEntryImpl <em>Logistic Hub Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticHubEntryImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getLogisticHubEntry()
	 * @generated
	 */
	int LOGISTIC_HUB_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB_ENTRY__TIME = SHIPMENT_ENTRY__TIME;

	/**
	 * The feature id for the '<em><b>Logistic Hub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB_ENTRY__LOGISTIC_HUB = SHIPMENT_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logistic Hub Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB_ENTRY_FEATURE_COUNT = SHIPMENT_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logistic Hub Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB_ENTRY_OPERATION_COUNT = SHIPMENT_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.PickUpEntryImpl <em>Pick Up Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.PickUpEntryImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getPickUpEntry()
	 * @generated
	 */
	int PICK_UP_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_ENTRY__TIME = SHIPMENT_ENTRY__TIME;

	/**
	 * The feature id for the '<em><b>Pick Up Leg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_ENTRY__PICK_UP_LEG = SHIPMENT_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pick Up Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_ENTRY_FEATURE_COUNT = SHIPMENT_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pick Up Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_UP_ENTRY_OPERATION_COUNT = SHIPMENT_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticHubExitImpl <em>Logistic Hub Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticHubExitImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getLogisticHubExit()
	 * @generated
	 */
	int LOGISTIC_HUB_EXIT = 12;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB_EXIT__TIME = SHIPMENT_EXIT__TIME;

	/**
	 * The feature id for the '<em><b>Logistic Hub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB_EXIT__LOGISTIC_HUB = SHIPMENT_EXIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logistic Hub Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB_EXIT_FEATURE_COUNT = SHIPMENT_EXIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logistic Hub Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_HUB_EXIT_OPERATION_COUNT = SHIPMENT_EXIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.DeliveryExitImpl <em>Delivery Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.DeliveryExitImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getDeliveryExit()
	 * @generated
	 */
	int DELIVERY_EXIT = 13;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_EXIT__TIME = SHIPMENT_EXIT__TIME;

	/**
	 * The feature id for the '<em><b>Delivery Leg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_EXIT__DELIVERY_LEG = SHIPMENT_EXIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delivery Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_EXIT_FEATURE_COUNT = SHIPMENT_EXIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delivery Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_EXIT_OPERATION_COUNT = SHIPMENT_EXIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.PlannedTourImpl <em>Planned Tour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.PlannedTourImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getPlannedTour()
	 * @generated
	 */
	int PLANNED_TOUR = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUR__ID = TOUR__ID;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUR__STOPS = TOUR__STOPS;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUR__VEHICLE = TOUR__VEHICLE;

	/**
	 * The feature id for the '<em><b>Executing CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUR__EXECUTING_CEPSP = TOUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Planned Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUR_FEATURE_COUNT = TOUR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Planned Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_TOUR_OPERATION_COUNT = TOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.StopLocationImpl <em>Stop Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.StopLocationImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getStopLocation()
	 * @generated
	 */
	int STOP_LOCATION = 15;

	/**
	 * The number of structural features of the '<em>Stop Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_LOCATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Stop Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.ReferenceStopLocationImpl <em>Reference Stop Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.ReferenceStopLocationImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getReferenceStopLocation()
	 * @generated
	 */
	int REFERENCE_STOP_LOCATION = 16;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_STOP_LOCATION__LOCATION = STOP_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Stop Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_STOP_LOCATION_FEATURE_COUNT = STOP_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Stop Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_STOP_LOCATION_OPERATION_COUNT = STOP_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.CustomStopLocationImpl <em>Custom Stop Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.CustomStopLocationImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getCustomStopLocation()
	 * @generated
	 */
	int CUSTOM_STOP_LOCATION = 17;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STOP_LOCATION__LOCATION = STOP_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Stop Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STOP_LOCATION_FEATURE_COUNT = STOP_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Stop Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STOP_LOCATION_OPERATION_COUNT = STOP_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionImpl <em>Logistic Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionImpl
	 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getLogisticSolution()
	 * @generated
	 */
	int LOGISTIC_SOLUTION = 18;

	/**
	 * The feature id for the '<em><b>Shipment Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_SOLUTION__SHIPMENT_RECORDS = 0;

	/**
	 * The feature id for the '<em><b>Tours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_SOLUTION__TOURS = 1;

	/**
	 * The number of structural features of the '<em>Logistic Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_SOLUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Logistic Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_SOLUTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.Tour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tour</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.Tour
	 * @generated
	 */
	EClass getTour();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticSolution.Tour#getStops <em>Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stops</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.Tour#getStops()
	 * @see #getTour()
	 * @generated
	 */
	EReference getTour_Stops();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.Tour#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.Tour#getVehicle()
	 * @see #getTour()
	 * @generated
	 */
	EReference getTour_Vehicle();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.Stop#getStopTimeWindow <em>Stop Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Time Window</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.Stop#getStopTimeWindow()
	 * @see #getStop()
	 * @generated
	 */
	EReference getStop_StopTimeWindow();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.logisticSolution.Stop#getNo <em>No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.Stop#getNo()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_No();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.Stop#getStopLocation <em>Stop Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Location</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.Stop#getStopLocation()
	 * @see #getStop()
	 * @generated
	 */
	EReference getStop_StopLocation();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord <em>Shipment Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Record</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord
	 * @generated
	 */
	EClass getShipmentRecord();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getShipment()
	 * @see #getShipmentRecord()
	 * @generated
	 */
	EReference getShipmentRecord_Shipment();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getEntries()
	 * @see #getShipmentRecord()
	 * @generated
	 */
	EReference getShipmentRecord_Entries();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getRepsonsibleCEPSP <em>Repsonsible CEPSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repsonsible CEPSP</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getRepsonsibleCEPSP()
	 * @see #getShipmentRecord()
	 * @generated
	 */
	EReference getShipmentRecord_RepsonsibleCEPSP();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getEntry()
	 * @see #getShipmentRecord()
	 * @generated
	 */
	EReference getShipmentRecord_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getExit()
	 * @see #getShipmentRecord()
	 * @generated
	 */
	EReference getShipmentRecord_Exit();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.StartEndStop <em>Start End Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start End Stop</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.StartEndStop
	 * @generated
	 */
	EClass getStartEndStop();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.StartEndStop#getDepot <em>Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depot</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.StartEndStop#getDepot()
	 * @see #getStartEndStop()
	 * @generated
	 */
	EReference getStartEndStop_Depot();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop <em>Pick Up Delivery Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick Up Delivery Stop</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop
	 * @generated
	 */
	EClass getPickUpDeliveryStop();

	/**
	 * Returns the meta object for the reference list '{@link CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop#getUnloadedShipments <em>Unloaded Shipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unloaded Shipments</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop#getUnloadedShipments()
	 * @see #getPickUpDeliveryStop()
	 * @generated
	 */
	EReference getPickUpDeliveryStop_UnloadedShipments();

	/**
	 * Returns the meta object for the reference list '{@link CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop#getLoadedShipments <em>Loaded Shipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loaded Shipments</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop#getLoadedShipments()
	 * @see #getPickUpDeliveryStop()
	 * @generated
	 */
	EReference getPickUpDeliveryStop_LoadedShipments();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticFacilityStop <em>Logistic Facility Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Facility Stop</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticFacilityStop
	 * @generated
	 */
	EClass getLogisticFacilityStop();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticFacilityStop#getLogisticFacility <em>Logistic Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logistic Facility</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticFacilityStop#getLogisticFacility()
	 * @see #getLogisticFacilityStop()
	 * @generated
	 */
	EReference getLogisticFacilityStop_LogisticFacility();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.NormalStop <em>Normal Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Stop</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.NormalStop
	 * @generated
	 */
	EClass getNormalStop();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry <em>Shipment Record Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Record Entry</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry
	 * @generated
	 */
	EClass getShipmentRecordEntry();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getExecutingCEPSP <em>Executing CEPSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executing CEPSP</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getExecutingCEPSP()
	 * @see #getShipmentRecordEntry()
	 * @generated
	 */
	EReference getShipmentRecordEntry_ExecutingCEPSP();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getNo <em>No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getNo()
	 * @see #getShipmentRecordEntry()
	 * @generated
	 */
	EAttribute getShipmentRecordEntry_No();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getFrom()
	 * @see #getShipmentRecordEntry()
	 * @generated
	 */
	EReference getShipmentRecordEntry_From();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTo()
	 * @see #getShipmentRecordEntry()
	 * @generated
	 */
	EReference getShipmentRecordEntry_To();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTimeWindow <em>Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Window</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTimeWindow()
	 * @see #getShipmentRecordEntry()
	 * @generated
	 */
	EReference getShipmentRecordEntry_TimeWindow();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getFromSpec <em>From Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Spec</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getFromSpec()
	 * @see #getShipmentRecordEntry()
	 * @generated
	 */
	EReference getShipmentRecordEntry_FromSpec();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getToSpec <em>To Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Spec</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getToSpec()
	 * @see #getShipmentRecordEntry()
	 * @generated
	 */
	EReference getShipmentRecordEntry_ToSpec();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tour</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTour()
	 * @see #getShipmentRecordEntry()
	 * @generated
	 */
	EReference getShipmentRecordEntry_Tour();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry <em>Shipment Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Entry</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry
	 * @generated
	 */
	EClass getShipmentEntry();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry#getTime()
	 * @see #getShipmentEntry()
	 * @generated
	 */
	EReference getShipmentEntry_Time();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentExit <em>Shipment Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Exit</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentExit
	 * @generated
	 */
	EClass getShipmentExit();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentExit#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentExit#getTime()
	 * @see #getShipmentExit()
	 * @generated
	 */
	EReference getShipmentExit_Time();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry <em>Logistic Hub Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Hub Entry</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry
	 * @generated
	 */
	EClass getLogisticHubEntry();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry#getLogisticHub <em>Logistic Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logistic Hub</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry#getLogisticHub()
	 * @see #getLogisticHubEntry()
	 * @generated
	 */
	EReference getLogisticHubEntry_LogisticHub();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.PickUpEntry <em>Pick Up Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick Up Entry</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.PickUpEntry
	 * @generated
	 */
	EClass getPickUpEntry();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.PickUpEntry#getPickUpLeg <em>Pick Up Leg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pick Up Leg</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.PickUpEntry#getPickUpLeg()
	 * @see #getPickUpEntry()
	 * @generated
	 */
	EReference getPickUpEntry_PickUpLeg();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticHubExit <em>Logistic Hub Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Hub Exit</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticHubExit
	 * @generated
	 */
	EClass getLogisticHubExit();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticHubExit#getLogisticHub <em>Logistic Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logistic Hub</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticHubExit#getLogisticHub()
	 * @see #getLogisticHubExit()
	 * @generated
	 */
	EReference getLogisticHubExit_LogisticHub();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.DeliveryExit <em>Delivery Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Exit</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.DeliveryExit
	 * @generated
	 */
	EClass getDeliveryExit();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.DeliveryExit#getDeliveryLeg <em>Delivery Leg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delivery Leg</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.DeliveryExit#getDeliveryLeg()
	 * @see #getDeliveryExit()
	 * @generated
	 */
	EReference getDeliveryExit_DeliveryLeg();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.PlannedTour <em>Planned Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planned Tour</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.PlannedTour
	 * @generated
	 */
	EClass getPlannedTour();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.PlannedTour#getExecutingCEPSP <em>Executing CEPSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executing CEPSP</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.PlannedTour#getExecutingCEPSP()
	 * @see #getPlannedTour()
	 * @generated
	 */
	EReference getPlannedTour_ExecutingCEPSP();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.StopLocation <em>Stop Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Location</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.StopLocation
	 * @generated
	 */
	EClass getStopLocation();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.ReferenceStopLocation <em>Reference Stop Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Stop Location</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ReferenceStopLocation
	 * @generated
	 */
	EClass getReferenceStopLocation();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticSolution.ReferenceStopLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ReferenceStopLocation#getLocation()
	 * @see #getReferenceStopLocation()
	 * @generated
	 */
	EReference getReferenceStopLocation_Location();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.CustomStopLocation <em>Custom Stop Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Stop Location</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.CustomStopLocation
	 * @generated
	 */
	EClass getCustomStopLocation();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticSolution.CustomStopLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.CustomStopLocation#getLocation()
	 * @see #getCustomStopLocation()
	 * @generated
	 */
	EReference getCustomStopLocation_Location();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticSolution <em>Logistic Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Solution</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolution
	 * @generated
	 */
	EClass getLogisticSolution();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticSolution#getShipmentRecords <em>Shipment Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shipment Records</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolution#getShipmentRecords()
	 * @see #getLogisticSolution()
	 * @generated
	 */
	EReference getLogisticSolution_ShipmentRecords();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticSolution#getTours <em>Tours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tours</em>'.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolution#getTours()
	 * @see #getLogisticSolution()
	 * @generated
	 */
	EReference getLogisticSolution_Tours();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogisticSolutionFactory getLogisticSolutionFactory();

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
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.TourImpl <em>Tour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.TourImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getTour()
		 * @generated
		 */
		EClass TOUR = eINSTANCE.getTour();

		/**
		 * The meta object literal for the '<em><b>Stops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR__STOPS = eINSTANCE.getTour_Stops();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR__VEHICLE = eINSTANCE.getTour_Vehicle();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.StopImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '<em><b>Stop Time Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP__STOP_TIME_WINDOW = eINSTANCE.getStop_StopTimeWindow();

		/**
		 * The meta object literal for the '<em><b>No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__NO = eINSTANCE.getStop_No();

		/**
		 * The meta object literal for the '<em><b>Stop Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP__STOP_LOCATION = eINSTANCE.getStop_StopLocation();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordImpl <em>Shipment Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getShipmentRecord()
		 * @generated
		 */
		EClass SHIPMENT_RECORD = eINSTANCE.getShipmentRecord();

		/**
		 * The meta object literal for the '<em><b>Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD__SHIPMENT = eINSTANCE.getShipmentRecord_Shipment();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD__ENTRIES = eINSTANCE.getShipmentRecord_Entries();

		/**
		 * The meta object literal for the '<em><b>Repsonsible CEPSP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD__REPSONSIBLE_CEPSP = eINSTANCE.getShipmentRecord_RepsonsibleCEPSP();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD__ENTRY = eINSTANCE.getShipmentRecord_Entry();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD__EXIT = eINSTANCE.getShipmentRecord_Exit();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.StartEndStopImpl <em>Start End Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.StartEndStopImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getStartEndStop()
		 * @generated
		 */
		EClass START_END_STOP = eINSTANCE.getStartEndStop();

		/**
		 * The meta object literal for the '<em><b>Depot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_END_STOP__DEPOT = eINSTANCE.getStartEndStop_Depot();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.PickUpDeliveryStopImpl <em>Pick Up Delivery Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.PickUpDeliveryStopImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getPickUpDeliveryStop()
		 * @generated
		 */
		EClass PICK_UP_DELIVERY_STOP = eINSTANCE.getPickUpDeliveryStop();

		/**
		 * The meta object literal for the '<em><b>Unloaded Shipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICK_UP_DELIVERY_STOP__UNLOADED_SHIPMENTS = eINSTANCE.getPickUpDeliveryStop_UnloadedShipments();

		/**
		 * The meta object literal for the '<em><b>Loaded Shipments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICK_UP_DELIVERY_STOP__LOADED_SHIPMENTS = eINSTANCE.getPickUpDeliveryStop_LoadedShipments();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticFacilityStopImpl <em>Logistic Facility Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticFacilityStopImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getLogisticFacilityStop()
		 * @generated
		 */
		EClass LOGISTIC_FACILITY_STOP = eINSTANCE.getLogisticFacilityStop();

		/**
		 * The meta object literal for the '<em><b>Logistic Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_FACILITY_STOP__LOGISTIC_FACILITY = eINSTANCE.getLogisticFacilityStop_LogisticFacility();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.NormalStopImpl <em>Normal Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.NormalStopImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getNormalStop()
		 * @generated
		 */
		EClass NORMAL_STOP = eINSTANCE.getNormalStop();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl <em>Shipment Record Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getShipmentRecordEntry()
		 * @generated
		 */
		EClass SHIPMENT_RECORD_ENTRY = eINSTANCE.getShipmentRecordEntry();

		/**
		 * The meta object literal for the '<em><b>Executing CEPSP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD_ENTRY__EXECUTING_CEPSP = eINSTANCE.getShipmentRecordEntry_ExecutingCEPSP();

		/**
		 * The meta object literal for the '<em><b>No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECORD_ENTRY__NO = eINSTANCE.getShipmentRecordEntry_No();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD_ENTRY__FROM = eINSTANCE.getShipmentRecordEntry_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD_ENTRY__TO = eINSTANCE.getShipmentRecordEntry_To();

		/**
		 * The meta object literal for the '<em><b>Time Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD_ENTRY__TIME_WINDOW = eINSTANCE.getShipmentRecordEntry_TimeWindow();

		/**
		 * The meta object literal for the '<em><b>From Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD_ENTRY__FROM_SPEC = eINSTANCE.getShipmentRecordEntry_FromSpec();

		/**
		 * The meta object literal for the '<em><b>To Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD_ENTRY__TO_SPEC = eINSTANCE.getShipmentRecordEntry_ToSpec();

		/**
		 * The meta object literal for the '<em><b>Tour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECORD_ENTRY__TOUR = eINSTANCE.getShipmentRecordEntry_Tour();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentEntryImpl <em>Shipment Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentEntryImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getShipmentEntry()
		 * @generated
		 */
		EClass SHIPMENT_ENTRY = eINSTANCE.getShipmentEntry();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ENTRY__TIME = eINSTANCE.getShipmentEntry_Time();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentExitImpl <em>Shipment Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentExitImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getShipmentExit()
		 * @generated
		 */
		EClass SHIPMENT_EXIT = eINSTANCE.getShipmentExit();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_EXIT__TIME = eINSTANCE.getShipmentExit_Time();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticHubEntryImpl <em>Logistic Hub Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticHubEntryImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getLogisticHubEntry()
		 * @generated
		 */
		EClass LOGISTIC_HUB_ENTRY = eINSTANCE.getLogisticHubEntry();

		/**
		 * The meta object literal for the '<em><b>Logistic Hub</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_HUB_ENTRY__LOGISTIC_HUB = eINSTANCE.getLogisticHubEntry_LogisticHub();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.PickUpEntryImpl <em>Pick Up Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.PickUpEntryImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getPickUpEntry()
		 * @generated
		 */
		EClass PICK_UP_ENTRY = eINSTANCE.getPickUpEntry();

		/**
		 * The meta object literal for the '<em><b>Pick Up Leg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICK_UP_ENTRY__PICK_UP_LEG = eINSTANCE.getPickUpEntry_PickUpLeg();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticHubExitImpl <em>Logistic Hub Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticHubExitImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getLogisticHubExit()
		 * @generated
		 */
		EClass LOGISTIC_HUB_EXIT = eINSTANCE.getLogisticHubExit();

		/**
		 * The meta object literal for the '<em><b>Logistic Hub</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_HUB_EXIT__LOGISTIC_HUB = eINSTANCE.getLogisticHubExit_LogisticHub();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.DeliveryExitImpl <em>Delivery Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.DeliveryExitImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getDeliveryExit()
		 * @generated
		 */
		EClass DELIVERY_EXIT = eINSTANCE.getDeliveryExit();

		/**
		 * The meta object literal for the '<em><b>Delivery Leg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY_EXIT__DELIVERY_LEG = eINSTANCE.getDeliveryExit_DeliveryLeg();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.PlannedTourImpl <em>Planned Tour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.PlannedTourImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getPlannedTour()
		 * @generated
		 */
		EClass PLANNED_TOUR = eINSTANCE.getPlannedTour();

		/**
		 * The meta object literal for the '<em><b>Executing CEPSP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_TOUR__EXECUTING_CEPSP = eINSTANCE.getPlannedTour_ExecutingCEPSP();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.StopLocationImpl <em>Stop Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.StopLocationImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getStopLocation()
		 * @generated
		 */
		EClass STOP_LOCATION = eINSTANCE.getStopLocation();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.ReferenceStopLocationImpl <em>Reference Stop Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.ReferenceStopLocationImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getReferenceStopLocation()
		 * @generated
		 */
		EClass REFERENCE_STOP_LOCATION = eINSTANCE.getReferenceStopLocation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_STOP_LOCATION__LOCATION = eINSTANCE.getReferenceStopLocation_Location();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.CustomStopLocationImpl <em>Custom Stop Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.CustomStopLocationImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getCustomStopLocation()
		 * @generated
		 */
		EClass CUSTOM_STOP_LOCATION = eINSTANCE.getCustomStopLocation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_STOP_LOCATION__LOCATION = eINSTANCE.getCustomStopLocation_Location();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionImpl <em>Logistic Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionImpl
		 * @see CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl#getLogisticSolution()
		 * @generated
		 */
		EClass LOGISTIC_SOLUTION = eINSTANCE.getLogisticSolution();

		/**
		 * The meta object literal for the '<em><b>Shipment Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_SOLUTION__SHIPMENT_RECORDS = eINSTANCE.getLogisticSolution_ShipmentRecords();

		/**
		 * The meta object literal for the '<em><b>Tours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_SOLUTION__TOURS = eINSTANCE.getLogisticSolution_Tours();

	}

} //LogisticSolutionPackage
