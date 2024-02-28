/**
 */
package CommonFreightTransportMetamodel.results;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;

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
 * @see CommonFreightTransportMetamodel.results.ResultsFactory
 * @model kind="package"
 * @generated
 */
public interface ResultsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "results";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/commonFreightTransportMetamodel/results";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "results";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsPackage eINSTANCE = CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.results.impl.FailedPickupAttemptImpl <em>Failed Pickup Attempt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.results.impl.FailedPickupAttemptImpl
	 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getFailedPickupAttempt()
	 * @generated
	 */
	int FAILED_PICKUP_ATTEMPT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT__ID = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Executing CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT__EXECUTING_CEPSP = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__EXECUTING_CEPSP;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT__NO = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__NO;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT__FROM = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT__TO = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO;

	/**
	 * The feature id for the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT__TIME_WINDOW = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TIME_WINDOW;

	/**
	 * The feature id for the '<em><b>From Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT__FROM_SPEC = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM_SPEC;

	/**
	 * The feature id for the '<em><b>To Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT__TO_SPEC = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO_SPEC;

	/**
	 * The feature id for the '<em><b>Tour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT__TOUR = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TOUR;

	/**
	 * The feature id for the '<em><b>Record</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT__RECORD = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD;

	/**
	 * The number of structural features of the '<em>Failed Pickup Attempt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT_FEATURE_COUNT = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failed Pickup Attempt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_PICKUP_ATTEMPT_OPERATION_COUNT = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.results.impl.FailedDeliveryAttemptImpl <em>Failed Delivery Attempt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.results.impl.FailedDeliveryAttemptImpl
	 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getFailedDeliveryAttempt()
	 * @generated
	 */
	int FAILED_DELIVERY_ATTEMPT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__ID = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Executing CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__EXECUTING_CEPSP = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__EXECUTING_CEPSP;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__NO = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__NO;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__FROM = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__TO = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO;

	/**
	 * The feature id for the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__TIME_WINDOW = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TIME_WINDOW;

	/**
	 * The feature id for the '<em><b>From Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__FROM_SPEC = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM_SPEC;

	/**
	 * The feature id for the '<em><b>To Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__TO_SPEC = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO_SPEC;

	/**
	 * The feature id for the '<em><b>Tour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__TOUR = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TOUR;

	/**
	 * The feature id for the '<em><b>Record</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__RECORD = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD;

	/**
	 * The feature id for the '<em><b>Failed Delivery Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failed Delivery Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_FACILITY = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Failed Delivery Attempt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT_FEATURE_COUNT = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Failed Delivery Attempt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILED_DELIVERY_ATTEMPT_OPERATION_COUNT = LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.results.impl.InitialFailedDeliveryAttemptImpl <em>Initial Failed Delivery Attempt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.results.impl.InitialFailedDeliveryAttemptImpl
	 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getInitialFailedDeliveryAttempt()
	 * @generated
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__ID = FAILED_DELIVERY_ATTEMPT__ID;

	/**
	 * The feature id for the '<em><b>Executing CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__EXECUTING_CEPSP = FAILED_DELIVERY_ATTEMPT__EXECUTING_CEPSP;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__NO = FAILED_DELIVERY_ATTEMPT__NO;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__FROM = FAILED_DELIVERY_ATTEMPT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__TO = FAILED_DELIVERY_ATTEMPT__TO;

	/**
	 * The feature id for the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__TIME_WINDOW = FAILED_DELIVERY_ATTEMPT__TIME_WINDOW;

	/**
	 * The feature id for the '<em><b>From Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__FROM_SPEC = FAILED_DELIVERY_ATTEMPT__FROM_SPEC;

	/**
	 * The feature id for the '<em><b>To Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__TO_SPEC = FAILED_DELIVERY_ATTEMPT__TO_SPEC;

	/**
	 * The feature id for the '<em><b>Tour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__TOUR = FAILED_DELIVERY_ATTEMPT__TOUR;

	/**
	 * The feature id for the '<em><b>Record</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__RECORD = FAILED_DELIVERY_ATTEMPT__RECORD;

	/**
	 * The feature id for the '<em><b>Failed Delivery Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION = FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION;

	/**
	 * The feature id for the '<em><b>Failed Delivery Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_FACILITY = FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_FACILITY;

	/**
	 * The number of structural features of the '<em>Initial Failed Delivery Attempt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT_FEATURE_COUNT = FAILED_DELIVERY_ATTEMPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Failed Delivery Attempt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FAILED_DELIVERY_ATTEMPT_OPERATION_COUNT = FAILED_DELIVERY_ATTEMPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.results.impl.ResultDeliveryExitImpl <em>Result Delivery Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.results.impl.ResultDeliveryExitImpl
	 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getResultDeliveryExit()
	 * @generated
	 */
	int RESULT_DELIVERY_EXIT = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_DELIVERY_EXIT__TIME = LogisticSolutionPackage.DELIVERY_EXIT__TIME;

	/**
	 * The feature id for the '<em><b>Delivery Leg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_DELIVERY_EXIT__DELIVERY_LEG = LogisticSolutionPackage.DELIVERY_EXIT__DELIVERY_LEG;

	/**
	 * The feature id for the '<em><b>Failed Pick Up Attempts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_DELIVERY_EXIT__FAILED_PICK_UP_ATTEMPTS = LogisticSolutionPackage.DELIVERY_EXIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Delivery Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_DELIVERY_EXIT_FEATURE_COUNT = LogisticSolutionPackage.DELIVERY_EXIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Result Delivery Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_DELIVERY_EXIT_OPERATION_COUNT = LogisticSolutionPackage.DELIVERY_EXIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.results.impl.ResultPickUpEntryImpl <em>Result Pick Up Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.results.impl.ResultPickUpEntryImpl
	 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getResultPickUpEntry()
	 * @generated
	 */
	int RESULT_PICK_UP_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PICK_UP_ENTRY__TIME = LogisticSolutionPackage.PICK_UP_ENTRY__TIME;

	/**
	 * The feature id for the '<em><b>Pick Up Leg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PICK_UP_ENTRY__PICK_UP_LEG = LogisticSolutionPackage.PICK_UP_ENTRY__PICK_UP_LEG;

	/**
	 * The feature id for the '<em><b>Failed Pick Up Attempts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PICK_UP_ENTRY__FAILED_PICK_UP_ATTEMPTS = LogisticSolutionPackage.PICK_UP_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Pick Up Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PICK_UP_ENTRY_FEATURE_COUNT = LogisticSolutionPackage.PICK_UP_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Result Pick Up Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PICK_UP_ENTRY_OPERATION_COUNT = LogisticSolutionPackage.PICK_UP_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.results.impl.ExecutedTourImpl <em>Executed Tour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.results.impl.ExecutedTourImpl
	 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getExecutedTour()
	 * @generated
	 */
	int EXECUTED_TOUR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_TOUR__ID = LogisticSolutionPackage.TOUR__ID;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_TOUR__STOPS = LogisticSolutionPackage.TOUR__STOPS;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_TOUR__VEHICLE = LogisticSolutionPackage.TOUR__VEHICLE;

	/**
	 * The feature id for the '<em><b>Planned Tour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_TOUR__PLANNED_TOUR = LogisticSolutionPackage.TOUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_TOUR__MAPPINGS = LogisticSolutionPackage.TOUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executed Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_TOUR_FEATURE_COUNT = LogisticSolutionPackage.TOUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Executed Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_TOUR_OPERATION_COUNT = LogisticSolutionPackage.TOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.results.impl.TourStopMappingImpl <em>Tour Stop Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.results.impl.TourStopMappingImpl
	 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getTourStopMapping()
	 * @generated
	 */
	int TOUR_STOP_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Planned Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_STOP_MAPPING__PLANNED_STOP = 0;

	/**
	 * The feature id for the '<em><b>Executed Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_STOP_MAPPING__EXECUTED_STOP = 1;

	/**
	 * The number of structural features of the '<em>Tour Stop Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_STOP_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tour Stop Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_STOP_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.results.impl.ResultsImpl <em>Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.results.impl.ResultsImpl
	 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getResults()
	 * @generated
	 */
	int RESULTS = 7;

	/**
	 * The feature id for the '<em><b>Shipment Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__SHIPMENT_RECORDS = 0;

	/**
	 * The feature id for the '<em><b>Executed Tours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__EXECUTED_TOURS = 1;

	/**
	 * The number of structural features of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.results.FailedPickupAttempt <em>Failed Pickup Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failed Pickup Attempt</em>'.
	 * @see CommonFreightTransportMetamodel.results.FailedPickupAttempt
	 * @generated
	 */
	EClass getFailedPickupAttempt();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.results.FailedDeliveryAttempt <em>Failed Delivery Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failed Delivery Attempt</em>'.
	 * @see CommonFreightTransportMetamodel.results.FailedDeliveryAttempt
	 * @generated
	 */
	EClass getFailedDeliveryAttempt();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.results.FailedDeliveryAttempt#getFailedDeliveryLocation <em>Failed Delivery Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failed Delivery Location</em>'.
	 * @see CommonFreightTransportMetamodel.results.FailedDeliveryAttempt#getFailedDeliveryLocation()
	 * @see #getFailedDeliveryAttempt()
	 * @generated
	 */
	EReference getFailedDeliveryAttempt_FailedDeliveryLocation();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.results.FailedDeliveryAttempt#getFailedDeliveryFacility <em>Failed Delivery Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failed Delivery Facility</em>'.
	 * @see CommonFreightTransportMetamodel.results.FailedDeliveryAttempt#getFailedDeliveryFacility()
	 * @see #getFailedDeliveryAttempt()
	 * @generated
	 */
	EReference getFailedDeliveryAttempt_FailedDeliveryFacility();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.results.InitialFailedDeliveryAttempt <em>Initial Failed Delivery Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Failed Delivery Attempt</em>'.
	 * @see CommonFreightTransportMetamodel.results.InitialFailedDeliveryAttempt
	 * @generated
	 */
	EClass getInitialFailedDeliveryAttempt();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.results.ResultDeliveryExit <em>Result Delivery Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Delivery Exit</em>'.
	 * @see CommonFreightTransportMetamodel.results.ResultDeliveryExit
	 * @generated
	 */
	EClass getResultDeliveryExit();

	/**
	 * Returns the meta object for the reference list '{@link CommonFreightTransportMetamodel.results.ResultDeliveryExit#getFailedPickUpAttempts <em>Failed Pick Up Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failed Pick Up Attempts</em>'.
	 * @see CommonFreightTransportMetamodel.results.ResultDeliveryExit#getFailedPickUpAttempts()
	 * @see #getResultDeliveryExit()
	 * @generated
	 */
	EReference getResultDeliveryExit_FailedPickUpAttempts();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.results.ResultPickUpEntry <em>Result Pick Up Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Pick Up Entry</em>'.
	 * @see CommonFreightTransportMetamodel.results.ResultPickUpEntry
	 * @generated
	 */
	EClass getResultPickUpEntry();

	/**
	 * Returns the meta object for the reference list '{@link CommonFreightTransportMetamodel.results.ResultPickUpEntry#getFailedPickUpAttempts <em>Failed Pick Up Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failed Pick Up Attempts</em>'.
	 * @see CommonFreightTransportMetamodel.results.ResultPickUpEntry#getFailedPickUpAttempts()
	 * @see #getResultPickUpEntry()
	 * @generated
	 */
	EReference getResultPickUpEntry_FailedPickUpAttempts();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.results.ExecutedTour <em>Executed Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executed Tour</em>'.
	 * @see CommonFreightTransportMetamodel.results.ExecutedTour
	 * @generated
	 */
	EClass getExecutedTour();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.results.ExecutedTour#getPlannedTour <em>Planned Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Planned Tour</em>'.
	 * @see CommonFreightTransportMetamodel.results.ExecutedTour#getPlannedTour()
	 * @see #getExecutedTour()
	 * @generated
	 */
	EReference getExecutedTour_PlannedTour();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.results.ExecutedTour#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see CommonFreightTransportMetamodel.results.ExecutedTour#getMappings()
	 * @see #getExecutedTour()
	 * @generated
	 */
	EReference getExecutedTour_Mappings();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.results.TourStopMapping <em>Tour Stop Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tour Stop Mapping</em>'.
	 * @see CommonFreightTransportMetamodel.results.TourStopMapping
	 * @generated
	 */
	EClass getTourStopMapping();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.results.TourStopMapping#getPlannedStop <em>Planned Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Planned Stop</em>'.
	 * @see CommonFreightTransportMetamodel.results.TourStopMapping#getPlannedStop()
	 * @see #getTourStopMapping()
	 * @generated
	 */
	EReference getTourStopMapping_PlannedStop();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.results.TourStopMapping#getExecutedStop <em>Executed Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executed Stop</em>'.
	 * @see CommonFreightTransportMetamodel.results.TourStopMapping#getExecutedStop()
	 * @see #getTourStopMapping()
	 * @generated
	 */
	EReference getTourStopMapping_ExecutedStop();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.results.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results</em>'.
	 * @see CommonFreightTransportMetamodel.results.Results
	 * @generated
	 */
	EClass getResults();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.results.Results#getShipmentRecords <em>Shipment Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shipment Records</em>'.
	 * @see CommonFreightTransportMetamodel.results.Results#getShipmentRecords()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_ShipmentRecords();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.results.Results#getExecutedTours <em>Executed Tours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executed Tours</em>'.
	 * @see CommonFreightTransportMetamodel.results.Results#getExecutedTours()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_ExecutedTours();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultsFactory getResultsFactory();

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
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.results.impl.FailedPickupAttemptImpl <em>Failed Pickup Attempt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.results.impl.FailedPickupAttemptImpl
		 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getFailedPickupAttempt()
		 * @generated
		 */
		EClass FAILED_PICKUP_ATTEMPT = eINSTANCE.getFailedPickupAttempt();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.results.impl.FailedDeliveryAttemptImpl <em>Failed Delivery Attempt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.results.impl.FailedDeliveryAttemptImpl
		 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getFailedDeliveryAttempt()
		 * @generated
		 */
		EClass FAILED_DELIVERY_ATTEMPT = eINSTANCE.getFailedDeliveryAttempt();

		/**
		 * The meta object literal for the '<em><b>Failed Delivery Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION = eINSTANCE.getFailedDeliveryAttempt_FailedDeliveryLocation();

		/**
		 * The meta object literal for the '<em><b>Failed Delivery Facility</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_FACILITY = eINSTANCE.getFailedDeliveryAttempt_FailedDeliveryFacility();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.results.impl.InitialFailedDeliveryAttemptImpl <em>Initial Failed Delivery Attempt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.results.impl.InitialFailedDeliveryAttemptImpl
		 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getInitialFailedDeliveryAttempt()
		 * @generated
		 */
		EClass INITIAL_FAILED_DELIVERY_ATTEMPT = eINSTANCE.getInitialFailedDeliveryAttempt();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.results.impl.ResultDeliveryExitImpl <em>Result Delivery Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.results.impl.ResultDeliveryExitImpl
		 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getResultDeliveryExit()
		 * @generated
		 */
		EClass RESULT_DELIVERY_EXIT = eINSTANCE.getResultDeliveryExit();

		/**
		 * The meta object literal for the '<em><b>Failed Pick Up Attempts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_DELIVERY_EXIT__FAILED_PICK_UP_ATTEMPTS = eINSTANCE.getResultDeliveryExit_FailedPickUpAttempts();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.results.impl.ResultPickUpEntryImpl <em>Result Pick Up Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.results.impl.ResultPickUpEntryImpl
		 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getResultPickUpEntry()
		 * @generated
		 */
		EClass RESULT_PICK_UP_ENTRY = eINSTANCE.getResultPickUpEntry();

		/**
		 * The meta object literal for the '<em><b>Failed Pick Up Attempts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_PICK_UP_ENTRY__FAILED_PICK_UP_ATTEMPTS = eINSTANCE.getResultPickUpEntry_FailedPickUpAttempts();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.results.impl.ExecutedTourImpl <em>Executed Tour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.results.impl.ExecutedTourImpl
		 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getExecutedTour()
		 * @generated
		 */
		EClass EXECUTED_TOUR = eINSTANCE.getExecutedTour();

		/**
		 * The meta object literal for the '<em><b>Planned Tour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTED_TOUR__PLANNED_TOUR = eINSTANCE.getExecutedTour_PlannedTour();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTED_TOUR__MAPPINGS = eINSTANCE.getExecutedTour_Mappings();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.results.impl.TourStopMappingImpl <em>Tour Stop Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.results.impl.TourStopMappingImpl
		 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getTourStopMapping()
		 * @generated
		 */
		EClass TOUR_STOP_MAPPING = eINSTANCE.getTourStopMapping();

		/**
		 * The meta object literal for the '<em><b>Planned Stop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR_STOP_MAPPING__PLANNED_STOP = eINSTANCE.getTourStopMapping_PlannedStop();

		/**
		 * The meta object literal for the '<em><b>Executed Stop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR_STOP_MAPPING__EXECUTED_STOP = eINSTANCE.getTourStopMapping_ExecutedStop();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.results.impl.ResultsImpl <em>Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.results.impl.ResultsImpl
		 * @see CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl#getResults()
		 * @generated
		 */
		EClass RESULTS = eINSTANCE.getResults();

		/**
		 * The meta object literal for the '<em><b>Shipment Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__SHIPMENT_RECORDS = eINSTANCE.getResults_ShipmentRecords();

		/**
		 * The meta object literal for the '<em><b>Executed Tours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__EXECUTED_TOURS = eINSTANCE.getResults_ExecutedTours();

	}

} //ResultsPackage
