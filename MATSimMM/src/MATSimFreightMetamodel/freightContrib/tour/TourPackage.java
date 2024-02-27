/**
 */
package MATSimFreightMetamodel.freightContrib.tour;

import MATSimFreightMetamodel.base.BasePackage;

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
 * @see MATSimFreightMetamodel.freightContrib.tour.TourFactory
 * @model kind="package"
 * @generated
 */
public interface TourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/MATSimFreightMetamodel/freightContrib/tour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TourPackage eINSTANCE = MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl.init();

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.TourImpl <em>Tour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourImpl
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getTour()
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
	int TOUR__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Tour Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__TOUR_ELEMENTS = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__START = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__END = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.TourElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourElementImpl
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getTourElement()
	 * @generated
	 */
	int TOUR_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.LegImpl <em>Leg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.LegImpl
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getLeg()
	 * @generated
	 */
	int LEG = 2;

	/**
	 * The feature id for the '<em><b>Expected Transport Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEG__EXPECTED_TRANSPORT_TIME = TOUR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expected Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEG__EXPECTED_DEPARTURE_TIME = TOUR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Leg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEG_FEATURE_COUNT = TOUR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Leg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEG_OPERATION_COUNT = TOUR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.TourActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourActivityImpl
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getTourActivity()
	 * @generated
	 */
	int TOUR_ACTIVITY = 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_ACTIVITY_FEATURE_COUNT = TOUR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_ACTIVITY_OPERATION_COUNT = TOUR_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.ServiceActivityImpl <em>Service Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.ServiceActivityImpl
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getServiceActivity()
	 * @generated
	 */
	int SERVICE_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIVITY__SERVICE = TOUR_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIVITY__ARRIVAL_TIME = TOUR_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIVITY_FEATURE_COUNT = TOUR_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACTIVITY_OPERATION_COUNT = TOUR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.StartImpl
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getStart()
	 * @generated
	 */
	int START = 5;

	/**
	 * The feature id for the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__TIME_WINDOW = TOUR_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__LOCATION = TOUR_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = TOUR_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = TOUR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.EndImpl
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getEnd()
	 * @generated
	 */
	int END = 6;

	/**
	 * The feature id for the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__TIME_WINDOW = TOUR_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expected Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__EXPECTED_ARRIVAL_TIME = TOUR_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LOCATION = TOUR_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = TOUR_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = TOUR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.ShipmentBasedActivityImpl <em>Shipment Based Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.ShipmentBasedActivityImpl
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getShipmentBasedActivity()
	 * @generated
	 */
	int SHIPMENT_BASED_ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BASED_ACTIVITY__SHIPMENT = TOUR_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expected Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BASED_ACTIVITY__EXPECTED_ARRIVAL_TIME = TOUR_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shipment Based Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BASED_ACTIVITY_FEATURE_COUNT = TOUR_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Shipment Based Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BASED_ACTIVITY_OPERATION_COUNT = TOUR_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.PickupImpl <em>Pickup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.PickupImpl
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getPickup()
	 * @generated
	 */
	int PICKUP = 8;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKUP__SHIPMENT = SHIPMENT_BASED_ACTIVITY__SHIPMENT;

	/**
	 * The feature id for the '<em><b>Expected Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKUP__EXPECTED_ARRIVAL_TIME = SHIPMENT_BASED_ACTIVITY__EXPECTED_ARRIVAL_TIME;

	/**
	 * The number of structural features of the '<em>Pickup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKUP_FEATURE_COUNT = SHIPMENT_BASED_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pickup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKUP_OPERATION_COUNT = SHIPMENT_BASED_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.DeliveryImpl <em>Delivery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.DeliveryImpl
	 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getDelivery()
	 * @generated
	 */
	int DELIVERY = 9;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__SHIPMENT = SHIPMENT_BASED_ACTIVITY__SHIPMENT;

	/**
	 * The feature id for the '<em><b>Expected Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__EXPECTED_ARRIVAL_TIME = SHIPMENT_BASED_ACTIVITY__EXPECTED_ARRIVAL_TIME;

	/**
	 * The number of structural features of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_FEATURE_COUNT = SHIPMENT_BASED_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_OPERATION_COUNT = SHIPMENT_BASED_ACTIVITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.tour.Tour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tour</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Tour
	 * @generated
	 */
	EClass getTour();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightContrib.tour.Tour#getTourElements <em>Tour Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tour Elements</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Tour#getTourElements()
	 * @see #getTour()
	 * @generated
	 */
	EReference getTour_TourElements();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.tour.Tour#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Tour#getStart()
	 * @see #getTour()
	 * @generated
	 */
	EReference getTour_Start();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.tour.Tour#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Tour#getEnd()
	 * @see #getTour()
	 * @generated
	 */
	EReference getTour_End();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.tour.TourElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourElement
	 * @generated
	 */
	EClass getTourElement();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.tour.Leg <em>Leg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leg</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Leg
	 * @generated
	 */
	EClass getLeg();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.tour.Leg#getExpectedTransportTime <em>Expected Transport Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Transport Time</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Leg#getExpectedTransportTime()
	 * @see #getLeg()
	 * @generated
	 */
	EAttribute getLeg_ExpectedTransportTime();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.tour.Leg#getExpectedDepartureTime <em>Expected Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Departure Time</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Leg#getExpectedDepartureTime()
	 * @see #getLeg()
	 * @generated
	 */
	EAttribute getLeg_ExpectedDepartureTime();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.tour.TourActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourActivity
	 * @generated
	 */
	EClass getTourActivity();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.tour.ServiceActivity <em>Service Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Activity</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.ServiceActivity
	 * @generated
	 */
	EClass getServiceActivity();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.tour.ServiceActivity#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.ServiceActivity#getService()
	 * @see #getServiceActivity()
	 * @generated
	 */
	EReference getServiceActivity_Service();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.tour.ServiceActivity#getArrivalTime <em>Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Time</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.ServiceActivity#getArrivalTime()
	 * @see #getServiceActivity()
	 * @generated
	 */
	EAttribute getServiceActivity_ArrivalTime();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.tour.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.freightContrib.tour.Start#getTimeWindow <em>Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Window</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Start#getTimeWindow()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_TimeWindow();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.freightContrib.tour.Start#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Start#getLocation()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_Location();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.tour.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.freightContrib.tour.End#getTimeWindow <em>Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Window</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.End#getTimeWindow()
	 * @see #getEnd()
	 * @generated
	 */
	EReference getEnd_TimeWindow();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.tour.End#getExpectedArrivalTime <em>Expected Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Arrival Time</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.End#getExpectedArrivalTime()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_ExpectedArrivalTime();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.freightContrib.tour.End#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.End#getLocation()
	 * @see #getEnd()
	 * @generated
	 */
	EReference getEnd_Location();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity <em>Shipment Based Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Based Activity</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity
	 * @generated
	 */
	EClass getShipmentBasedActivity();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity#getShipment()
	 * @see #getShipmentBasedActivity()
	 * @generated
	 */
	EReference getShipmentBasedActivity_Shipment();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity#getExpectedArrivalTime <em>Expected Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Arrival Time</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity#getExpectedArrivalTime()
	 * @see #getShipmentBasedActivity()
	 * @generated
	 */
	EAttribute getShipmentBasedActivity_ExpectedArrivalTime();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.tour.Pickup <em>Pickup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pickup</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Pickup
	 * @generated
	 */
	EClass getPickup();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.tour.Delivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Delivery
	 * @generated
	 */
	EClass getDelivery();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TourFactory getTourFactory();

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
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.TourImpl <em>Tour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourImpl
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getTour()
		 * @generated
		 */
		EClass TOUR = eINSTANCE.getTour();

		/**
		 * The meta object literal for the '<em><b>Tour Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR__TOUR_ELEMENTS = eINSTANCE.getTour_TourElements();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR__START = eINSTANCE.getTour_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR__END = eINSTANCE.getTour_End();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.TourElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourElementImpl
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getTourElement()
		 * @generated
		 */
		EClass TOUR_ELEMENT = eINSTANCE.getTourElement();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.LegImpl <em>Leg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.LegImpl
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getLeg()
		 * @generated
		 */
		EClass LEG = eINSTANCE.getLeg();

		/**
		 * The meta object literal for the '<em><b>Expected Transport Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEG__EXPECTED_TRANSPORT_TIME = eINSTANCE.getLeg_ExpectedTransportTime();

		/**
		 * The meta object literal for the '<em><b>Expected Departure Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEG__EXPECTED_DEPARTURE_TIME = eINSTANCE.getLeg_ExpectedDepartureTime();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.TourActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourActivityImpl
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getTourActivity()
		 * @generated
		 */
		EClass TOUR_ACTIVITY = eINSTANCE.getTourActivity();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.ServiceActivityImpl <em>Service Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.ServiceActivityImpl
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getServiceActivity()
		 * @generated
		 */
		EClass SERVICE_ACTIVITY = eINSTANCE.getServiceActivity();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ACTIVITY__SERVICE = eINSTANCE.getServiceActivity_Service();

		/**
		 * The meta object literal for the '<em><b>Arrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ACTIVITY__ARRIVAL_TIME = eINSTANCE.getServiceActivity_ArrivalTime();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.StartImpl
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '<em><b>Time Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__TIME_WINDOW = eINSTANCE.getStart_TimeWindow();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__LOCATION = eINSTANCE.getStart_Location();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.EndImpl
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '<em><b>Time Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END__TIME_WINDOW = eINSTANCE.getEnd_TimeWindow();

		/**
		 * The meta object literal for the '<em><b>Expected Arrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__EXPECTED_ARRIVAL_TIME = eINSTANCE.getEnd_ExpectedArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END__LOCATION = eINSTANCE.getEnd_Location();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.ShipmentBasedActivityImpl <em>Shipment Based Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.ShipmentBasedActivityImpl
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getShipmentBasedActivity()
		 * @generated
		 */
		EClass SHIPMENT_BASED_ACTIVITY = eINSTANCE.getShipmentBasedActivity();

		/**
		 * The meta object literal for the '<em><b>Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_BASED_ACTIVITY__SHIPMENT = eINSTANCE.getShipmentBasedActivity_Shipment();

		/**
		 * The meta object literal for the '<em><b>Expected Arrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_BASED_ACTIVITY__EXPECTED_ARRIVAL_TIME = eINSTANCE.getShipmentBasedActivity_ExpectedArrivalTime();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.PickupImpl <em>Pickup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.PickupImpl
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getPickup()
		 * @generated
		 */
		EClass PICKUP = eINSTANCE.getPickup();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.tour.impl.DeliveryImpl <em>Delivery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.DeliveryImpl
		 * @see MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl#getDelivery()
		 * @generated
		 */
		EClass DELIVERY = eINSTANCE.getDelivery();

	}

} //TourPackage
