/**
 */
package MATSimFreightMetamodel.freightContrib.events;

import MATSimFreightMetamodel.matsim.core.CorePackage;

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
 * @see MATSimFreightMetamodel.freightContrib.events.EventsFactory
 * @model kind="package"
 * @generated
 */
public interface EventsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "events";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/MATSimFreightMetamodel/freightContrib/events";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsPackage eINSTANCE = MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierEventImpl <em>Carrier Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierEventImpl
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierEvent()
	 * @generated
	 */
	int CARRIER_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_EVENT__TIME = CorePackage.EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_EVENT__CARRIER = CorePackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_EVENT__LINK = CorePackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Carriervehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_EVENT__CARRIERVEHICLE = CorePackage.EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Carrier Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_EVENT_FEATURE_COUNT = CorePackage.EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Carrier Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_EVENT_OPERATION_COUNT = CorePackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentDeliveryStartEventImpl <em>Carrier Shipment Delivery Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentDeliveryStartEventImpl
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierShipmentDeliveryStartEvent()
	 * @generated
	 */
	int CARRIER_SHIPMENT_DELIVERY_START_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_START_EVENT__TIME = CARRIER_EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_START_EVENT__CARRIER = CARRIER_EVENT__CARRIER;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_START_EVENT__LINK = CARRIER_EVENT__LINK;

	/**
	 * The feature id for the '<em><b>Carriervehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_START_EVENT__CARRIERVEHICLE = CARRIER_EVENT__CARRIERVEHICLE;

	/**
	 * The feature id for the '<em><b>Carrier Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_START_EVENT__CARRIER_SHIPMENT = CARRIER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delivery Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_START_EVENT__DELIVERY_DURATION = CARRIER_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capacity Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_START_EVENT__CAPACITY_DEMAND = CARRIER_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Carrier Shipment Delivery Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_START_EVENT_FEATURE_COUNT = CARRIER_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Carrier Shipment Delivery Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_START_EVENT_OPERATION_COUNT = CARRIER_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentDeliveryEndEventImpl <em>Carrier Shipment Delivery End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentDeliveryEndEventImpl
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierShipmentDeliveryEndEvent()
	 * @generated
	 */
	int CARRIER_SHIPMENT_DELIVERY_END_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_END_EVENT__TIME = CARRIER_EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_END_EVENT__CARRIER = CARRIER_EVENT__CARRIER;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_END_EVENT__LINK = CARRIER_EVENT__LINK;

	/**
	 * The feature id for the '<em><b>Carriervehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_END_EVENT__CARRIERVEHICLE = CARRIER_EVENT__CARRIERVEHICLE;

	/**
	 * The feature id for the '<em><b>Carrier Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_END_EVENT__CARRIER_SHIPMENT = CARRIER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delivery Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_END_EVENT__DELIVERY_DURATION = CARRIER_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capacity Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_END_EVENT__CAPACITY_DEMAND = CARRIER_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Carrier Shipment Delivery End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_END_EVENT_FEATURE_COUNT = CARRIER_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Carrier Shipment Delivery End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_DELIVERY_END_EVENT_OPERATION_COUNT = CARRIER_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierServieStartEventImpl <em>Carrier Servie Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierServieStartEventImpl
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierServieStartEvent()
	 * @generated
	 */
	int CARRIER_SERVIE_START_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVIE_START_EVENT__TIME = CARRIER_EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVIE_START_EVENT__CARRIER = CARRIER_EVENT__CARRIER;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVIE_START_EVENT__LINK = CARRIER_EVENT__LINK;

	/**
	 * The feature id for the '<em><b>Carriervehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVIE_START_EVENT__CARRIERVEHICLE = CARRIER_EVENT__CARRIERVEHICLE;

	/**
	 * The feature id for the '<em><b>Carrier Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVIE_START_EVENT__CARRIER_SERVICE = CARRIER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVIE_START_EVENT__SERVICE_DURATION = CARRIER_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capacity Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVIE_START_EVENT__CAPACITY_DEMAND = CARRIER_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Carrier Servie Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVIE_START_EVENT_FEATURE_COUNT = CARRIER_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Carrier Servie Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVIE_START_EVENT_OPERATION_COUNT = CARRIER_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierServiceEndEventImpl <em>Carrier Service End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierServiceEndEventImpl
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierServiceEndEvent()
	 * @generated
	 */
	int CARRIER_SERVICE_END_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE_END_EVENT__TIME = CARRIER_EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE_END_EVENT__CARRIER = CARRIER_EVENT__CARRIER;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE_END_EVENT__LINK = CARRIER_EVENT__LINK;

	/**
	 * The feature id for the '<em><b>Carriervehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE_END_EVENT__CARRIERVEHICLE = CARRIER_EVENT__CARRIERVEHICLE;

	/**
	 * The feature id for the '<em><b>Carrier Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE_END_EVENT__CARRIER_SERVICE = CARRIER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE_END_EVENT__CAPACITY_DEMAND = CARRIER_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE_END_EVENT__SERVICE_DURATION = CARRIER_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Carrier Service End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE_END_EVENT_FEATURE_COUNT = CARRIER_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Carrier Service End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SERVICE_END_EVENT_OPERATION_COUNT = CARRIER_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierTourStartEventImpl <em>Carrier Tour Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierTourStartEventImpl
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierTourStartEvent()
	 * @generated
	 */
	int CARRIER_TOUR_START_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_START_EVENT__TIME = CARRIER_EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_START_EVENT__CARRIER = CARRIER_EVENT__CARRIER;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_START_EVENT__LINK = CARRIER_EVENT__LINK;

	/**
	 * The feature id for the '<em><b>Carriervehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_START_EVENT__CARRIERVEHICLE = CARRIER_EVENT__CARRIERVEHICLE;

	/**
	 * The feature id for the '<em><b>Tour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_START_EVENT__TOUR = CARRIER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Carrier Tour Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_START_EVENT_FEATURE_COUNT = CARRIER_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Carrier Tour Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_START_EVENT_OPERATION_COUNT = CARRIER_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierTourEndEventImpl <em>Carrier Tour End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierTourEndEventImpl
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierTourEndEvent()
	 * @generated
	 */
	int CARRIER_TOUR_END_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_END_EVENT__TIME = CARRIER_EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_END_EVENT__CARRIER = CARRIER_EVENT__CARRIER;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_END_EVENT__LINK = CARRIER_EVENT__LINK;

	/**
	 * The feature id for the '<em><b>Carriervehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_END_EVENT__CARRIERVEHICLE = CARRIER_EVENT__CARRIERVEHICLE;

	/**
	 * The feature id for the '<em><b>Tour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_END_EVENT__TOUR = CARRIER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Carrier Tour End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_END_EVENT_FEATURE_COUNT = CARRIER_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Carrier Tour End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_TOUR_END_EVENT_OPERATION_COUNT = CARRIER_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentPickupStartEventImpl <em>Carrier Shipment Pickup Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentPickupStartEventImpl
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierShipmentPickupStartEvent()
	 * @generated
	 */
	int CARRIER_SHIPMENT_PICKUP_START_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_START_EVENT__TIME = CARRIER_EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_START_EVENT__CARRIER = CARRIER_EVENT__CARRIER;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_START_EVENT__LINK = CARRIER_EVENT__LINK;

	/**
	 * The feature id for the '<em><b>Carriervehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_START_EVENT__CARRIERVEHICLE = CARRIER_EVENT__CARRIERVEHICLE;

	/**
	 * The feature id for the '<em><b>Pickup Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_START_EVENT__PICKUP_DURATION = CARRIER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_START_EVENT__CAPACITY_DEMAND = CARRIER_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Carrier Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_START_EVENT__CARRIER_SHIPMENT = CARRIER_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Carrier Shipment Pickup Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_START_EVENT_FEATURE_COUNT = CARRIER_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Carrier Shipment Pickup Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_START_EVENT_OPERATION_COUNT = CARRIER_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentPickupEndEventImpl <em>Carrier Shipment Pickup End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentPickupEndEventImpl
	 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierShipmentPickupEndEvent()
	 * @generated
	 */
	int CARRIER_SHIPMENT_PICKUP_END_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_END_EVENT__TIME = CARRIER_EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_END_EVENT__CARRIER = CARRIER_EVENT__CARRIER;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_END_EVENT__LINK = CARRIER_EVENT__LINK;

	/**
	 * The feature id for the '<em><b>Carriervehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_END_EVENT__CARRIERVEHICLE = CARRIER_EVENT__CARRIERVEHICLE;

	/**
	 * The feature id for the '<em><b>Capacity Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_END_EVENT__CAPACITY_DEMAND = CARRIER_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pickup Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_END_EVENT__PICKUP_DURATION = CARRIER_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Carrier Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_END_EVENT__CARRIER_SHIPMENT = CARRIER_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Carrier Shipment Pickup End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_END_EVENT_FEATURE_COUNT = CARRIER_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Carrier Shipment Pickup End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_PICKUP_END_EVENT_OPERATION_COUNT = CARRIER_EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierEvent <em>Carrier Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Event</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierEvent
	 * @generated
	 */
	EClass getCarrierEvent();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getCarrier()
	 * @see #getCarrierEvent()
	 * @generated
	 */
	EReference getCarrierEvent_Carrier();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getLink()
	 * @see #getCarrierEvent()
	 * @generated
	 */
	EReference getCarrierEvent_Link();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getCarriervehicle <em>Carriervehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carriervehicle</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getCarriervehicle()
	 * @see #getCarrierEvent()
	 * @generated
	 */
	EReference getCarrierEvent_Carriervehicle();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryStartEvent <em>Carrier Shipment Delivery Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Shipment Delivery Start Event</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryStartEvent
	 * @generated
	 */
	EClass getCarrierShipmentDeliveryStartEvent();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryStartEvent#getCarrierShipment <em>Carrier Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Shipment</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryStartEvent#getCarrierShipment()
	 * @see #getCarrierShipmentDeliveryStartEvent()
	 * @generated
	 */
	EReference getCarrierShipmentDeliveryStartEvent_CarrierShipment();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryStartEvent#getDeliveryDuration <em>Delivery Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Duration</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryStartEvent#getDeliveryDuration()
	 * @see #getCarrierShipmentDeliveryStartEvent()
	 * @generated
	 */
	EAttribute getCarrierShipmentDeliveryStartEvent_DeliveryDuration();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryStartEvent#getCapacityDemand <em>Capacity Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Demand</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryStartEvent#getCapacityDemand()
	 * @see #getCarrierShipmentDeliveryStartEvent()
	 * @generated
	 */
	EAttribute getCarrierShipmentDeliveryStartEvent_CapacityDemand();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent <em>Carrier Shipment Delivery End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Shipment Delivery End Event</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent
	 * @generated
	 */
	EClass getCarrierShipmentDeliveryEndEvent();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getCarrierShipment <em>Carrier Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Shipment</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getCarrierShipment()
	 * @see #getCarrierShipmentDeliveryEndEvent()
	 * @generated
	 */
	EReference getCarrierShipmentDeliveryEndEvent_CarrierShipment();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getDeliveryDuration <em>Delivery Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Duration</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getDeliveryDuration()
	 * @see #getCarrierShipmentDeliveryEndEvent()
	 * @generated
	 */
	EAttribute getCarrierShipmentDeliveryEndEvent_DeliveryDuration();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getCapacityDemand <em>Capacity Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Demand</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getCapacityDemand()
	 * @see #getCarrierShipmentDeliveryEndEvent()
	 * @generated
	 */
	EAttribute getCarrierShipmentDeliveryEndEvent_CapacityDemand();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent <em>Carrier Servie Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Servie Start Event</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent
	 * @generated
	 */
	EClass getCarrierServieStartEvent();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent#getCarrierService <em>Carrier Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Service</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent#getCarrierService()
	 * @see #getCarrierServieStartEvent()
	 * @generated
	 */
	EReference getCarrierServieStartEvent_CarrierService();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent#getServiceDuration <em>Service Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Duration</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent#getServiceDuration()
	 * @see #getCarrierServieStartEvent()
	 * @generated
	 */
	EAttribute getCarrierServieStartEvent_ServiceDuration();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent#getCapacityDemand <em>Capacity Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Demand</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent#getCapacityDemand()
	 * @see #getCarrierServieStartEvent()
	 * @generated
	 */
	EAttribute getCarrierServieStartEvent_CapacityDemand();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent <em>Carrier Service End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Service End Event</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent
	 * @generated
	 */
	EClass getCarrierServiceEndEvent();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getCarrierService <em>Carrier Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Service</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getCarrierService()
	 * @see #getCarrierServiceEndEvent()
	 * @generated
	 */
	EReference getCarrierServiceEndEvent_CarrierService();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getCapacityDemand <em>Capacity Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Demand</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getCapacityDemand()
	 * @see #getCarrierServiceEndEvent()
	 * @generated
	 */
	EAttribute getCarrierServiceEndEvent_CapacityDemand();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getServiceDuration <em>Service Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Duration</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getServiceDuration()
	 * @see #getCarrierServiceEndEvent()
	 * @generated
	 */
	EAttribute getCarrierServiceEndEvent_ServiceDuration();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierTourStartEvent <em>Carrier Tour Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Tour Start Event</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierTourStartEvent
	 * @generated
	 */
	EClass getCarrierTourStartEvent();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.events.CarrierTourStartEvent#getTour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tour</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierTourStartEvent#getTour()
	 * @see #getCarrierTourStartEvent()
	 * @generated
	 */
	EReference getCarrierTourStartEvent_Tour();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierTourEndEvent <em>Carrier Tour End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Tour End Event</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierTourEndEvent
	 * @generated
	 */
	EClass getCarrierTourEndEvent();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.events.CarrierTourEndEvent#getTour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tour</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierTourEndEvent#getTour()
	 * @see #getCarrierTourEndEvent()
	 * @generated
	 */
	EReference getCarrierTourEndEvent_Tour();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent <em>Carrier Shipment Pickup Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Shipment Pickup Start Event</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent
	 * @generated
	 */
	EClass getCarrierShipmentPickupStartEvent();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getPickupDuration <em>Pickup Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pickup Duration</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getPickupDuration()
	 * @see #getCarrierShipmentPickupStartEvent()
	 * @generated
	 */
	EAttribute getCarrierShipmentPickupStartEvent_PickupDuration();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getCapacityDemand <em>Capacity Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Demand</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getCapacityDemand()
	 * @see #getCarrierShipmentPickupStartEvent()
	 * @generated
	 */
	EAttribute getCarrierShipmentPickupStartEvent_CapacityDemand();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getCarrierShipment <em>Carrier Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Shipment</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getCarrierShipment()
	 * @see #getCarrierShipmentPickupStartEvent()
	 * @generated
	 */
	EReference getCarrierShipmentPickupStartEvent_CarrierShipment();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupEndEvent <em>Carrier Shipment Pickup End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Shipment Pickup End Event</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupEndEvent
	 * @generated
	 */
	EClass getCarrierShipmentPickupEndEvent();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupEndEvent#getCapacityDemand <em>Capacity Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Demand</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupEndEvent#getCapacityDemand()
	 * @see #getCarrierShipmentPickupEndEvent()
	 * @generated
	 */
	EAttribute getCarrierShipmentPickupEndEvent_CapacityDemand();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupEndEvent#getPickupDuration <em>Pickup Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pickup Duration</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupEndEvent#getPickupDuration()
	 * @see #getCarrierShipmentPickupEndEvent()
	 * @generated
	 */
	EAttribute getCarrierShipmentPickupEndEvent_PickupDuration();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupEndEvent#getCarrierShipment <em>Carrier Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Shipment</em>'.
	 * @see MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupEndEvent#getCarrierShipment()
	 * @see #getCarrierShipmentPickupEndEvent()
	 * @generated
	 */
	EReference getCarrierShipmentPickupEndEvent_CarrierShipment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EventsFactory getEventsFactory();

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
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierEventImpl <em>Carrier Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierEventImpl
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierEvent()
		 * @generated
		 */
		EClass CARRIER_EVENT = eINSTANCE.getCarrierEvent();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_EVENT__CARRIER = eINSTANCE.getCarrierEvent_Carrier();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_EVENT__LINK = eINSTANCE.getCarrierEvent_Link();

		/**
		 * The meta object literal for the '<em><b>Carriervehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_EVENT__CARRIERVEHICLE = eINSTANCE.getCarrierEvent_Carriervehicle();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentDeliveryStartEventImpl <em>Carrier Shipment Delivery Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentDeliveryStartEventImpl
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierShipmentDeliveryStartEvent()
		 * @generated
		 */
		EClass CARRIER_SHIPMENT_DELIVERY_START_EVENT = eINSTANCE.getCarrierShipmentDeliveryStartEvent();

		/**
		 * The meta object literal for the '<em><b>Carrier Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT_DELIVERY_START_EVENT__CARRIER_SHIPMENT = eINSTANCE.getCarrierShipmentDeliveryStartEvent_CarrierShipment();

		/**
		 * The meta object literal for the '<em><b>Delivery Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_DELIVERY_START_EVENT__DELIVERY_DURATION = eINSTANCE.getCarrierShipmentDeliveryStartEvent_DeliveryDuration();

		/**
		 * The meta object literal for the '<em><b>Capacity Demand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_DELIVERY_START_EVENT__CAPACITY_DEMAND = eINSTANCE.getCarrierShipmentDeliveryStartEvent_CapacityDemand();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentDeliveryEndEventImpl <em>Carrier Shipment Delivery End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentDeliveryEndEventImpl
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierShipmentDeliveryEndEvent()
		 * @generated
		 */
		EClass CARRIER_SHIPMENT_DELIVERY_END_EVENT = eINSTANCE.getCarrierShipmentDeliveryEndEvent();

		/**
		 * The meta object literal for the '<em><b>Carrier Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT_DELIVERY_END_EVENT__CARRIER_SHIPMENT = eINSTANCE.getCarrierShipmentDeliveryEndEvent_CarrierShipment();

		/**
		 * The meta object literal for the '<em><b>Delivery Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_DELIVERY_END_EVENT__DELIVERY_DURATION = eINSTANCE.getCarrierShipmentDeliveryEndEvent_DeliveryDuration();

		/**
		 * The meta object literal for the '<em><b>Capacity Demand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_DELIVERY_END_EVENT__CAPACITY_DEMAND = eINSTANCE.getCarrierShipmentDeliveryEndEvent_CapacityDemand();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierServieStartEventImpl <em>Carrier Servie Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierServieStartEventImpl
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierServieStartEvent()
		 * @generated
		 */
		EClass CARRIER_SERVIE_START_EVENT = eINSTANCE.getCarrierServieStartEvent();

		/**
		 * The meta object literal for the '<em><b>Carrier Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SERVIE_START_EVENT__CARRIER_SERVICE = eINSTANCE.getCarrierServieStartEvent_CarrierService();

		/**
		 * The meta object literal for the '<em><b>Service Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SERVIE_START_EVENT__SERVICE_DURATION = eINSTANCE.getCarrierServieStartEvent_ServiceDuration();

		/**
		 * The meta object literal for the '<em><b>Capacity Demand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SERVIE_START_EVENT__CAPACITY_DEMAND = eINSTANCE.getCarrierServieStartEvent_CapacityDemand();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierServiceEndEventImpl <em>Carrier Service End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierServiceEndEventImpl
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierServiceEndEvent()
		 * @generated
		 */
		EClass CARRIER_SERVICE_END_EVENT = eINSTANCE.getCarrierServiceEndEvent();

		/**
		 * The meta object literal for the '<em><b>Carrier Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SERVICE_END_EVENT__CARRIER_SERVICE = eINSTANCE.getCarrierServiceEndEvent_CarrierService();

		/**
		 * The meta object literal for the '<em><b>Capacity Demand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SERVICE_END_EVENT__CAPACITY_DEMAND = eINSTANCE.getCarrierServiceEndEvent_CapacityDemand();

		/**
		 * The meta object literal for the '<em><b>Service Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SERVICE_END_EVENT__SERVICE_DURATION = eINSTANCE.getCarrierServiceEndEvent_ServiceDuration();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierTourStartEventImpl <em>Carrier Tour Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierTourStartEventImpl
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierTourStartEvent()
		 * @generated
		 */
		EClass CARRIER_TOUR_START_EVENT = eINSTANCE.getCarrierTourStartEvent();

		/**
		 * The meta object literal for the '<em><b>Tour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_TOUR_START_EVENT__TOUR = eINSTANCE.getCarrierTourStartEvent_Tour();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierTourEndEventImpl <em>Carrier Tour End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierTourEndEventImpl
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierTourEndEvent()
		 * @generated
		 */
		EClass CARRIER_TOUR_END_EVENT = eINSTANCE.getCarrierTourEndEvent();

		/**
		 * The meta object literal for the '<em><b>Tour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_TOUR_END_EVENT__TOUR = eINSTANCE.getCarrierTourEndEvent_Tour();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentPickupStartEventImpl <em>Carrier Shipment Pickup Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentPickupStartEventImpl
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierShipmentPickupStartEvent()
		 * @generated
		 */
		EClass CARRIER_SHIPMENT_PICKUP_START_EVENT = eINSTANCE.getCarrierShipmentPickupStartEvent();

		/**
		 * The meta object literal for the '<em><b>Pickup Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_PICKUP_START_EVENT__PICKUP_DURATION = eINSTANCE.getCarrierShipmentPickupStartEvent_PickupDuration();

		/**
		 * The meta object literal for the '<em><b>Capacity Demand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_PICKUP_START_EVENT__CAPACITY_DEMAND = eINSTANCE.getCarrierShipmentPickupStartEvent_CapacityDemand();

		/**
		 * The meta object literal for the '<em><b>Carrier Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT_PICKUP_START_EVENT__CARRIER_SHIPMENT = eINSTANCE.getCarrierShipmentPickupStartEvent_CarrierShipment();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentPickupEndEventImpl <em>Carrier Shipment Pickup End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.CarrierShipmentPickupEndEventImpl
		 * @see MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl#getCarrierShipmentPickupEndEvent()
		 * @generated
		 */
		EClass CARRIER_SHIPMENT_PICKUP_END_EVENT = eINSTANCE.getCarrierShipmentPickupEndEvent();

		/**
		 * The meta object literal for the '<em><b>Capacity Demand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_PICKUP_END_EVENT__CAPACITY_DEMAND = eINSTANCE.getCarrierShipmentPickupEndEvent_CapacityDemand();

		/**
		 * The meta object literal for the '<em><b>Pickup Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_PICKUP_END_EVENT__PICKUP_DURATION = eINSTANCE.getCarrierShipmentPickupEndEvent_PickupDuration();

		/**
		 * The meta object literal for the '<em><b>Carrier Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT_PICKUP_END_EVENT__CARRIER_SHIPMENT = eINSTANCE.getCarrierShipmentPickupEndEvent_CarrierShipment();

	}

} //EventsPackage
