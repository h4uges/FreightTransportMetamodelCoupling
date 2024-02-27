/**
 */
package CommonFreightTransportMetamodel.logisticDemand;

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
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandFactory
 * @model kind="package"
 * @generated
 */
public interface LogisticDemandPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logisticDemand";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/commonFreightTransportMetamodel/logisticDemand";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logisticDemand";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogisticDemandPackage eINSTANCE = CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl.init();

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.DemandImpl <em>Demand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.DemandImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getDemand()
	 * @generated
	 */
	int DEMAND = 0;

	/**
	 * The feature id for the '<em><b>Shipments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND__SHIPMENTS = 0;

	/**
	 * The number of structural features of the '<em>Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.FromOutsideStudyAreaShipmentImpl <em>From Outside Study Area Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.FromOutsideStudyAreaShipmentImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getFromOutsideStudyAreaShipment()
	 * @generated
	 */
	int FROM_OUTSIDE_STUDY_AREA_SHIPMENT = 1;

	/**
	 * The feature id for the '<em><b>Arrival At Origin Depot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT = 0;

	/**
	 * The number of structural features of the '<em>From Outside Study Area Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_OUTSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>From Outside Study Area Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_OUTSIDE_STUDY_AREA_SHIPMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.FromInsideStudyAreaShipmentBaseImpl <em>From Inside Study Area Shipment Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.FromInsideStudyAreaShipmentBaseImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getFromInsideStudyAreaShipmentBase()
	 * @generated
	 */
	int FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE = 10;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Arrival At Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN = 1;

	/**
	 * The number of structural features of the '<em>From Inside Study Area Shipment Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>From Inside Study Area Shipment Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.FromInsideStudyAreaShipmentImpl <em>From Inside Study Area Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.FromInsideStudyAreaShipmentImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getFromInsideStudyAreaShipment()
	 * @generated
	 */
	int FROM_INSIDE_STUDY_AREA_SHIPMENT = 2;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_INSIDE_STUDY_AREA_SHIPMENT__ORIGIN = FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Arrival At Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_INSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN = FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN;

	/**
	 * The feature id for the '<em><b>Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_INSIDE_STUDY_AREA_SHIPMENT__PRODUCER = FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>From Inside Study Area Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT = FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>From Inside Study Area Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_INSIDE_STUDY_AREA_SHIPMENT_OPERATION_COUNT = FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.ToOutsideStudyAreaShipmentImpl <em>To Outside Study Area Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.ToOutsideStudyAreaShipmentImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getToOutsideStudyAreaShipment()
	 * @generated
	 */
	int TO_OUTSIDE_STUDY_AREA_SHIPMENT = 3;

	/**
	 * The feature id for the '<em><b>Arrival At Depot Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW = 0;

	/**
	 * The number of structural features of the '<em>To Outside Study Area Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_OUTSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>To Outside Study Area Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_OUTSIDE_STUDY_AREA_SHIPMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.ToInsideStudyAreaShipmentBaseImpl <em>To Inside Study Area Shipment Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.ToInsideStudyAreaShipmentBaseImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getToInsideStudyAreaShipmentBase()
	 * @generated
	 */
	int TO_INSIDE_STUDY_AREA_SHIPMENT_BASE = 11;

	/**
	 * The feature id for the '<em><b>Arrival At Destination Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>To Inside Study Area Shipment Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INSIDE_STUDY_AREA_SHIPMENT_BASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>To Inside Study Area Shipment Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INSIDE_STUDY_AREA_SHIPMENT_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.ToInsideStudyAreaShipmentImpl <em>To Inside Study Area Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.ToInsideStudyAreaShipmentImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getToInsideStudyAreaShipment()
	 * @generated
	 */
	int TO_INSIDE_STUDY_AREA_SHIPMENT = 4;

	/**
	 * The feature id for the '<em><b>Arrival At Destination Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW = TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INSIDE_STUDY_AREA_SHIPMENT__DESTINATION = TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INSIDE_STUDY_AREA_SHIPMENT__RECEIVER = TO_INSIDE_STUDY_AREA_SHIPMENT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To Inside Study Area Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT = TO_INSIDE_STUDY_AREA_SHIPMENT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>To Inside Study Area Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_INSIDE_STUDY_AREA_SHIPMENT_OPERATION_COUNT = TO_INSIDE_STUDY_AREA_SHIPMENT_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.OutsideToInsideShipmentImpl <em>Outside To Inside Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.OutsideToInsideShipmentImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getOutsideToInsideShipment()
	 * @generated
	 */
	int OUTSIDE_TO_INSIDE_SHIPMENT = 5;

	/**
	 * The feature id for the '<em><b>Arrival At Origin Depot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT = FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT;

	/**
	 * The feature id for the '<em><b>Arrival At Destination Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW = FROM_OUTSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_TO_INSIDE_SHIPMENT__DESTINATION = FROM_OUTSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_TO_INSIDE_SHIPMENT__RECEIVER = FROM_OUTSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_TO_INSIDE_SHIPMENT__ID = FROM_OUTSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Responsible CEPSP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP = FROM_OUTSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_TO_INSIDE_SHIPMENT__SIZE = FROM_OUTSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Outside To Inside Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_TO_INSIDE_SHIPMENT_FEATURE_COUNT = FROM_OUTSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Outside To Inside Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTSIDE_TO_INSIDE_SHIPMENT_OPERATION_COUNT = FROM_OUTSIDE_STUDY_AREA_SHIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToInsideShipmentImpl <em>Inside To Inside Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.InsideToInsideShipmentImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getInsideToInsideShipment()
	 * @generated
	 */
	int INSIDE_TO_INSIDE_SHIPMENT = 6;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_INSIDE_SHIPMENT__ORIGIN = FROM_INSIDE_STUDY_AREA_SHIPMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Arrival At Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_ORIGIN = FROM_INSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN;

	/**
	 * The feature id for the '<em><b>Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_INSIDE_SHIPMENT__PRODUCER = FROM_INSIDE_STUDY_AREA_SHIPMENT__PRODUCER;

	/**
	 * The feature id for the '<em><b>Arrival At Destination Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_INSIDE_SHIPMENT__DESTINATION = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_INSIDE_SHIPMENT__RECEIVER = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_INSIDE_SHIPMENT__ID = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Responsible CEPSP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_INSIDE_SHIPMENT__SIZE = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Inside To Inside Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_INSIDE_SHIPMENT_FEATURE_COUNT = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Inside To Inside Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_INSIDE_SHIPMENT_OPERATION_COUNT = FROM_INSIDE_STUDY_AREA_SHIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToOutsideShipmentImpl <em>Inside To Outside Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.InsideToOutsideShipmentImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getInsideToOutsideShipment()
	 * @generated
	 */
	int INSIDE_TO_OUTSIDE_SHIPMENT = 7;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_OUTSIDE_SHIPMENT__ORIGIN = FROM_INSIDE_STUDY_AREA_SHIPMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Arrival At Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_ORIGIN = FROM_INSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN;

	/**
	 * The feature id for the '<em><b>Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_OUTSIDE_SHIPMENT__PRODUCER = FROM_INSIDE_STUDY_AREA_SHIPMENT__PRODUCER;

	/**
	 * The feature id for the '<em><b>Arrival At Depot Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_OUTSIDE_SHIPMENT__ID = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Responsible CEPSP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_OUTSIDE_SHIPMENT__SIZE = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Inside To Outside Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_OUTSIDE_SHIPMENT_FEATURE_COUNT = FROM_INSIDE_STUDY_AREA_SHIPMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Inside To Outside Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSIDE_TO_OUTSIDE_SHIPMENT_OPERATION_COUNT = FROM_INSIDE_STUDY_AREA_SHIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.ShipmentImpl <em>Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.ShipmentImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getShipment()
	 * @generated
	 */
	int SHIPMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Responsible CEPSP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__RESPONSIBLE_CEPSP = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__SIZE = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.SplittedShipmentImpl <em>Splitted Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.SplittedShipmentImpl
	 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getSplittedShipment()
	 * @generated
	 */
	int SPLITTED_SHIPMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_SHIPMENT__ID = SHIPMENT__ID;

	/**
	 * The feature id for the '<em><b>Responsible CEPSP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_SHIPMENT__RESPONSIBLE_CEPSP = SHIPMENT__RESPONSIBLE_CEPSP;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_SHIPMENT__SIZE = SHIPMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Arrival At Destination Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW = SHIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_SHIPMENT__DESTINATION = SHIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_SHIPMENT__ORIGIN = SHIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arrival At Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN = SHIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Original Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_SHIPMENT__ORIGINAL_ID = SHIPMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Splitted Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_SHIPMENT_FEATURE_COUNT = SHIPMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Splitted Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLITTED_SHIPMENT_OPERATION_COUNT = SHIPMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.Demand <em>Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demand</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.Demand
	 * @generated
	 */
	EClass getDemand();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.logisticDemand.Demand#getShipments <em>Shipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shipments</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.Demand#getShipments()
	 * @see #getDemand()
	 * @generated
	 */
	EReference getDemand_Shipments();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.FromOutsideStudyAreaShipment <em>From Outside Study Area Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Outside Study Area Shipment</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.FromOutsideStudyAreaShipment
	 * @generated
	 */
	EClass getFromOutsideStudyAreaShipment();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticDemand.FromOutsideStudyAreaShipment#getArrivalAtOriginDepot <em>Arrival At Origin Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival At Origin Depot</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.FromOutsideStudyAreaShipment#getArrivalAtOriginDepot()
	 * @see #getFromOutsideStudyAreaShipment()
	 * @generated
	 */
	EReference getFromOutsideStudyAreaShipment_ArrivalAtOriginDepot();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipment <em>From Inside Study Area Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Inside Study Area Shipment</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipment
	 * @generated
	 */
	EClass getFromInsideStudyAreaShipment();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipment#getProducer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Producer</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipment#getProducer()
	 * @see #getFromInsideStudyAreaShipment()
	 * @generated
	 */
	EReference getFromInsideStudyAreaShipment_Producer();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment <em>To Outside Study Area Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Outside Study Area Shipment</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment
	 * @generated
	 */
	EClass getToOutsideStudyAreaShipment();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment#getArrivalAtDepotTimeWindow <em>Arrival At Depot Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival At Depot Time Window</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment#getArrivalAtDepotTimeWindow()
	 * @see #getToOutsideStudyAreaShipment()
	 * @generated
	 */
	EReference getToOutsideStudyAreaShipment_ArrivalAtDepotTimeWindow();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment <em>To Inside Study Area Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Inside Study Area Shipment</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment
	 * @generated
	 */
	EClass getToInsideStudyAreaShipment();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment#getReceiver()
	 * @see #getToInsideStudyAreaShipment()
	 * @generated
	 */
	EReference getToInsideStudyAreaShipment_Receiver();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.OutsideToInsideShipment <em>Outside To Inside Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outside To Inside Shipment</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.OutsideToInsideShipment
	 * @generated
	 */
	EClass getOutsideToInsideShipment();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.InsideToInsideShipment <em>Inside To Inside Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inside To Inside Shipment</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.InsideToInsideShipment
	 * @generated
	 */
	EClass getInsideToInsideShipment();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.InsideToOutsideShipment <em>Inside To Outside Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inside To Outside Shipment</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.InsideToOutsideShipment
	 * @generated
	 */
	EClass getInsideToOutsideShipment();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.Shipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.Shipment
	 * @generated
	 */
	EClass getShipment();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticDemand.Shipment#getResponsibleCEPSP <em>Responsible CEPSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsible CEPSP</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.Shipment#getResponsibleCEPSP()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_ResponsibleCEPSP();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticDemand.Shipment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.Shipment#getSize()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_Size();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.SplittedShipment <em>Splitted Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Splitted Shipment</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.SplittedShipment
	 * @generated
	 */
	EClass getSplittedShipment();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.logisticDemand.SplittedShipment#getOriginalId <em>Original Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Id</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.SplittedShipment#getOriginalId()
	 * @see #getSplittedShipment()
	 * @generated
	 */
	EAttribute getSplittedShipment_OriginalId();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase <em>From Inside Study Area Shipment Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Inside Study Area Shipment Base</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase
	 * @generated
	 */
	EClass getFromInsideStudyAreaShipmentBase();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase#getOrigin()
	 * @see #getFromInsideStudyAreaShipmentBase()
	 * @generated
	 */
	EReference getFromInsideStudyAreaShipmentBase_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase#getArrivalAtOrigin <em>Arrival At Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival At Origin</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase#getArrivalAtOrigin()
	 * @see #getFromInsideStudyAreaShipmentBase()
	 * @generated
	 */
	EReference getFromInsideStudyAreaShipmentBase_ArrivalAtOrigin();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase <em>To Inside Study Area Shipment Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Inside Study Area Shipment Base</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase
	 * @generated
	 */
	EClass getToInsideStudyAreaShipmentBase();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase#getArrivalAtDestinationTimeWindow <em>Arrival At Destination Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival At Destination Time Window</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase#getArrivalAtDestinationTimeWindow()
	 * @see #getToInsideStudyAreaShipmentBase()
	 * @generated
	 */
	EReference getToInsideStudyAreaShipmentBase_ArrivalAtDestinationTimeWindow();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase#getDestination()
	 * @see #getToInsideStudyAreaShipmentBase()
	 * @generated
	 */
	EReference getToInsideStudyAreaShipmentBase_Destination();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogisticDemandFactory getLogisticDemandFactory();

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
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.DemandImpl <em>Demand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.DemandImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getDemand()
		 * @generated
		 */
		EClass DEMAND = eINSTANCE.getDemand();

		/**
		 * The meta object literal for the '<em><b>Shipments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMAND__SHIPMENTS = eINSTANCE.getDemand_Shipments();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.FromOutsideStudyAreaShipmentImpl <em>From Outside Study Area Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.FromOutsideStudyAreaShipmentImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getFromOutsideStudyAreaShipment()
		 * @generated
		 */
		EClass FROM_OUTSIDE_STUDY_AREA_SHIPMENT = eINSTANCE.getFromOutsideStudyAreaShipment();

		/**
		 * The meta object literal for the '<em><b>Arrival At Origin Depot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT = eINSTANCE.getFromOutsideStudyAreaShipment_ArrivalAtOriginDepot();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.FromInsideStudyAreaShipmentImpl <em>From Inside Study Area Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.FromInsideStudyAreaShipmentImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getFromInsideStudyAreaShipment()
		 * @generated
		 */
		EClass FROM_INSIDE_STUDY_AREA_SHIPMENT = eINSTANCE.getFromInsideStudyAreaShipment();

		/**
		 * The meta object literal for the '<em><b>Producer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_INSIDE_STUDY_AREA_SHIPMENT__PRODUCER = eINSTANCE.getFromInsideStudyAreaShipment_Producer();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.ToOutsideStudyAreaShipmentImpl <em>To Outside Study Area Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.ToOutsideStudyAreaShipmentImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getToOutsideStudyAreaShipment()
		 * @generated
		 */
		EClass TO_OUTSIDE_STUDY_AREA_SHIPMENT = eINSTANCE.getToOutsideStudyAreaShipment();

		/**
		 * The meta object literal for the '<em><b>Arrival At Depot Time Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW = eINSTANCE.getToOutsideStudyAreaShipment_ArrivalAtDepotTimeWindow();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.ToInsideStudyAreaShipmentImpl <em>To Inside Study Area Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.ToInsideStudyAreaShipmentImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getToInsideStudyAreaShipment()
		 * @generated
		 */
		EClass TO_INSIDE_STUDY_AREA_SHIPMENT = eINSTANCE.getToInsideStudyAreaShipment();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_INSIDE_STUDY_AREA_SHIPMENT__RECEIVER = eINSTANCE.getToInsideStudyAreaShipment_Receiver();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.OutsideToInsideShipmentImpl <em>Outside To Inside Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.OutsideToInsideShipmentImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getOutsideToInsideShipment()
		 * @generated
		 */
		EClass OUTSIDE_TO_INSIDE_SHIPMENT = eINSTANCE.getOutsideToInsideShipment();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToInsideShipmentImpl <em>Inside To Inside Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.InsideToInsideShipmentImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getInsideToInsideShipment()
		 * @generated
		 */
		EClass INSIDE_TO_INSIDE_SHIPMENT = eINSTANCE.getInsideToInsideShipment();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToOutsideShipmentImpl <em>Inside To Outside Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.InsideToOutsideShipmentImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getInsideToOutsideShipment()
		 * @generated
		 */
		EClass INSIDE_TO_OUTSIDE_SHIPMENT = eINSTANCE.getInsideToOutsideShipment();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.ShipmentImpl <em>Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.ShipmentImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getShipment()
		 * @generated
		 */
		EClass SHIPMENT = eINSTANCE.getShipment();

		/**
		 * The meta object literal for the '<em><b>Responsible CEPSP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__RESPONSIBLE_CEPSP = eINSTANCE.getShipment_ResponsibleCEPSP();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__SIZE = eINSTANCE.getShipment_Size();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.SplittedShipmentImpl <em>Splitted Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.SplittedShipmentImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getSplittedShipment()
		 * @generated
		 */
		EClass SPLITTED_SHIPMENT = eINSTANCE.getSplittedShipment();

		/**
		 * The meta object literal for the '<em><b>Original Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLITTED_SHIPMENT__ORIGINAL_ID = eINSTANCE.getSplittedShipment_OriginalId();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.FromInsideStudyAreaShipmentBaseImpl <em>From Inside Study Area Shipment Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.FromInsideStudyAreaShipmentBaseImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getFromInsideStudyAreaShipmentBase()
		 * @generated
		 */
		EClass FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE = eINSTANCE.getFromInsideStudyAreaShipmentBase();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN = eINSTANCE.getFromInsideStudyAreaShipmentBase_Origin();

		/**
		 * The meta object literal for the '<em><b>Arrival At Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN = eINSTANCE.getFromInsideStudyAreaShipmentBase_ArrivalAtOrigin();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.logisticDemand.impl.ToInsideStudyAreaShipmentBaseImpl <em>To Inside Study Area Shipment Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.ToInsideStudyAreaShipmentBaseImpl
		 * @see CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl#getToInsideStudyAreaShipmentBase()
		 * @generated
		 */
		EClass TO_INSIDE_STUDY_AREA_SHIPMENT_BASE = eINSTANCE.getToInsideStudyAreaShipmentBase();

		/**
		 * The meta object literal for the '<em><b>Arrival At Destination Time Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW = eINSTANCE.getToInsideStudyAreaShipmentBase_ArrivalAtDestinationTimeWindow();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION = eINSTANCE.getToInsideStudyAreaShipmentBase_Destination();

	}

} //LogisticDemandPackage
