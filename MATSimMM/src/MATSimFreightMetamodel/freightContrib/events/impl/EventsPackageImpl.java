/**
 */
package MATSimFreightMetamodel.freightContrib.events.impl;

import MATSimFreightMetamodel.MATSimFreightMetamodelPackage;

import MATSimFreightMetamodel.base.BasePackage;

import MATSimFreightMetamodel.base.impl.BasePackageImpl;

import MATSimFreightMetamodel.freightContrib.FreightContribPackage;

import MATSimFreightMetamodel.freightContrib.events.CarrierEvent;
import MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent;
import MATSimFreightMetamodel.freightContrib.events.CarrierServieStartEvent;
import MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent;
import MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryStartEvent;
import MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupEndEvent;
import MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent;
import MATSimFreightMetamodel.freightContrib.events.CarrierTourEndEvent;
import MATSimFreightMetamodel.freightContrib.events.CarrierTourStartEvent;
import MATSimFreightMetamodel.freightContrib.events.EventsFactory;
import MATSimFreightMetamodel.freightContrib.events.EventsPackage;

import MATSimFreightMetamodel.freightContrib.impl.FreightContribPackageImpl;

import MATSimFreightMetamodel.freightContrib.tour.TourPackage;

import MATSimFreightMetamodel.freightContrib.tour.impl.TourPackageImpl;

import MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage;

import MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl;

import MATSimFreightMetamodel.impl.MATSimFreightMetamodelPackageImpl;

import MATSimFreightMetamodel.matsim.MatsimPackage;

import MATSimFreightMetamodel.matsim.core.CorePackage;

import MATSimFreightMetamodel.matsim.core.impl.CorePackageImpl;

import MATSimFreightMetamodel.matsim.core.network.NetworkPackage;

import MATSimFreightMetamodel.matsim.core.network.impl.NetworkPackageImpl;

import MATSimFreightMetamodel.matsim.core.population.PopulationPackage;

import MATSimFreightMetamodel.matsim.core.population.impl.PopulationPackageImpl;

import MATSimFreightMetamodel.matsim.households.HouseholdsPackage;

import MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl;

import MATSimFreightMetamodel.matsim.impl.MatsimPackageImpl;

import MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage;

import MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventsPackageImpl extends EPackageImpl implements EventsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierShipmentDeliveryStartEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierShipmentDeliveryEndEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierServieStartEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierServiceEndEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierTourStartEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierTourEndEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierShipmentPickupStartEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierShipmentPickupEndEventEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EventsPackageImpl() {
		super(eNS_URI, EventsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EventsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EventsPackage init() {
		if (isInited) return (EventsPackage)EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEventsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EventsPackageImpl theEventsPackage = registeredEventsPackage instanceof EventsPackageImpl ? (EventsPackageImpl)registeredEventsPackage : new EventsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MATSimFreightMetamodelPackage.eNS_URI);
		MATSimFreightMetamodelPackageImpl theMATSimFreightMetamodelPackage = (MATSimFreightMetamodelPackageImpl)(registeredPackage instanceof MATSimFreightMetamodelPackageImpl ? registeredPackage : MATSimFreightMetamodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FreightContribPackage.eNS_URI);
		FreightContribPackageImpl theFreightContribPackage = (FreightContribPackageImpl)(registeredPackage instanceof FreightContribPackageImpl ? registeredPackage : FreightContribPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TourPackage.eNS_URI);
		TourPackageImpl theTourPackage = (TourPackageImpl)(registeredPackage instanceof TourPackageImpl ? registeredPackage : TourPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		BasePackageImpl theBasePackage = (BasePackageImpl)(registeredPackage instanceof BasePackageImpl ? registeredPackage : BasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MatsimPackage.eNS_URI);
		MatsimPackageImpl theMatsimPackage = (MatsimPackageImpl)(registeredPackage instanceof MatsimPackageImpl ? registeredPackage : MatsimPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VehiclesPackage.eNS_URI);
		VehiclesPackageImpl theVehiclesPackage = (VehiclesPackageImpl)(registeredPackage instanceof VehiclesPackageImpl ? registeredPackage : VehiclesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PopulationPackage.eNS_URI);
		PopulationPackageImpl thePopulationPackage = (PopulationPackageImpl)(registeredPackage instanceof PopulationPackageImpl ? registeredPackage : PopulationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HouseholdsPackage.eNS_URI);
		HouseholdsPackageImpl theHouseholdsPackage = (HouseholdsPackageImpl)(registeredPackage instanceof HouseholdsPackageImpl ? registeredPackage : HouseholdsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FreightReceiverPackage.eNS_URI);
		FreightReceiverPackageImpl theFreightReceiverPackage = (FreightReceiverPackageImpl)(registeredPackage instanceof FreightReceiverPackageImpl ? registeredPackage : FreightReceiverPackage.eINSTANCE);

		// Create package meta-data objects
		theEventsPackage.createPackageContents();
		theMATSimFreightMetamodelPackage.createPackageContents();
		theFreightContribPackage.createPackageContents();
		theTourPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theMatsimPackage.createPackageContents();
		theVehiclesPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		thePopulationPackage.createPackageContents();
		theHouseholdsPackage.createPackageContents();
		theFreightReceiverPackage.createPackageContents();

		// Initialize created meta-data
		theEventsPackage.initializePackageContents();
		theMATSimFreightMetamodelPackage.initializePackageContents();
		theFreightContribPackage.initializePackageContents();
		theTourPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theMatsimPackage.initializePackageContents();
		theVehiclesPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		thePopulationPackage.initializePackageContents();
		theHouseholdsPackage.initializePackageContents();
		theFreightReceiverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEventsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EventsPackage.eNS_URI, theEventsPackage);
		return theEventsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierEvent() {
		return carrierEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierEvent_Carrier() {
		return (EReference)carrierEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierEvent_Link() {
		return (EReference)carrierEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierEvent_Carriervehicle() {
		return (EReference)carrierEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierShipmentDeliveryStartEvent() {
		return carrierShipmentDeliveryStartEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierShipmentDeliveryStartEvent_CarrierShipment() {
		return (EReference)carrierShipmentDeliveryStartEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentDeliveryStartEvent_DeliveryDuration() {
		return (EAttribute)carrierShipmentDeliveryStartEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentDeliveryStartEvent_CapacityDemand() {
		return (EAttribute)carrierShipmentDeliveryStartEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierShipmentDeliveryEndEvent() {
		return carrierShipmentDeliveryEndEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierShipmentDeliveryEndEvent_CarrierShipment() {
		return (EReference)carrierShipmentDeliveryEndEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentDeliveryEndEvent_DeliveryDuration() {
		return (EAttribute)carrierShipmentDeliveryEndEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentDeliveryEndEvent_CapacityDemand() {
		return (EAttribute)carrierShipmentDeliveryEndEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierServieStartEvent() {
		return carrierServieStartEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierServieStartEvent_CarrierService() {
		return (EReference)carrierServieStartEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierServieStartEvent_ServiceDuration() {
		return (EAttribute)carrierServieStartEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierServieStartEvent_CapacityDemand() {
		return (EAttribute)carrierServieStartEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierServiceEndEvent() {
		return carrierServiceEndEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierServiceEndEvent_CarrierService() {
		return (EReference)carrierServiceEndEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierServiceEndEvent_CapacityDemand() {
		return (EAttribute)carrierServiceEndEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierServiceEndEvent_ServiceDuration() {
		return (EAttribute)carrierServiceEndEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierTourStartEvent() {
		return carrierTourStartEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierTourStartEvent_Tour() {
		return (EReference)carrierTourStartEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierTourEndEvent() {
		return carrierTourEndEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierTourEndEvent_Tour() {
		return (EReference)carrierTourEndEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierShipmentPickupStartEvent() {
		return carrierShipmentPickupStartEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentPickupStartEvent_PickupDuration() {
		return (EAttribute)carrierShipmentPickupStartEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentPickupStartEvent_CapacityDemand() {
		return (EAttribute)carrierShipmentPickupStartEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierShipmentPickupStartEvent_CarrierShipment() {
		return (EReference)carrierShipmentPickupStartEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierShipmentPickupEndEvent() {
		return carrierShipmentPickupEndEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentPickupEndEvent_CapacityDemand() {
		return (EAttribute)carrierShipmentPickupEndEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentPickupEndEvent_PickupDuration() {
		return (EAttribute)carrierShipmentPickupEndEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierShipmentPickupEndEvent_CarrierShipment() {
		return (EReference)carrierShipmentPickupEndEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventsFactory getEventsFactory() {
		return (EventsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		carrierEventEClass = createEClass(CARRIER_EVENT);
		createEReference(carrierEventEClass, CARRIER_EVENT__CARRIER);
		createEReference(carrierEventEClass, CARRIER_EVENT__LINK);
		createEReference(carrierEventEClass, CARRIER_EVENT__CARRIERVEHICLE);

		carrierShipmentDeliveryStartEventEClass = createEClass(CARRIER_SHIPMENT_DELIVERY_START_EVENT);
		createEReference(carrierShipmentDeliveryStartEventEClass, CARRIER_SHIPMENT_DELIVERY_START_EVENT__CARRIER_SHIPMENT);
		createEAttribute(carrierShipmentDeliveryStartEventEClass, CARRIER_SHIPMENT_DELIVERY_START_EVENT__DELIVERY_DURATION);
		createEAttribute(carrierShipmentDeliveryStartEventEClass, CARRIER_SHIPMENT_DELIVERY_START_EVENT__CAPACITY_DEMAND);

		carrierShipmentDeliveryEndEventEClass = createEClass(CARRIER_SHIPMENT_DELIVERY_END_EVENT);
		createEReference(carrierShipmentDeliveryEndEventEClass, CARRIER_SHIPMENT_DELIVERY_END_EVENT__CARRIER_SHIPMENT);
		createEAttribute(carrierShipmentDeliveryEndEventEClass, CARRIER_SHIPMENT_DELIVERY_END_EVENT__DELIVERY_DURATION);
		createEAttribute(carrierShipmentDeliveryEndEventEClass, CARRIER_SHIPMENT_DELIVERY_END_EVENT__CAPACITY_DEMAND);

		carrierServieStartEventEClass = createEClass(CARRIER_SERVIE_START_EVENT);
		createEReference(carrierServieStartEventEClass, CARRIER_SERVIE_START_EVENT__CARRIER_SERVICE);
		createEAttribute(carrierServieStartEventEClass, CARRIER_SERVIE_START_EVENT__SERVICE_DURATION);
		createEAttribute(carrierServieStartEventEClass, CARRIER_SERVIE_START_EVENT__CAPACITY_DEMAND);

		carrierServiceEndEventEClass = createEClass(CARRIER_SERVICE_END_EVENT);
		createEReference(carrierServiceEndEventEClass, CARRIER_SERVICE_END_EVENT__CARRIER_SERVICE);
		createEAttribute(carrierServiceEndEventEClass, CARRIER_SERVICE_END_EVENT__CAPACITY_DEMAND);
		createEAttribute(carrierServiceEndEventEClass, CARRIER_SERVICE_END_EVENT__SERVICE_DURATION);

		carrierTourStartEventEClass = createEClass(CARRIER_TOUR_START_EVENT);
		createEReference(carrierTourStartEventEClass, CARRIER_TOUR_START_EVENT__TOUR);

		carrierTourEndEventEClass = createEClass(CARRIER_TOUR_END_EVENT);
		createEReference(carrierTourEndEventEClass, CARRIER_TOUR_END_EVENT__TOUR);

		carrierShipmentPickupStartEventEClass = createEClass(CARRIER_SHIPMENT_PICKUP_START_EVENT);
		createEAttribute(carrierShipmentPickupStartEventEClass, CARRIER_SHIPMENT_PICKUP_START_EVENT__PICKUP_DURATION);
		createEAttribute(carrierShipmentPickupStartEventEClass, CARRIER_SHIPMENT_PICKUP_START_EVENT__CAPACITY_DEMAND);
		createEReference(carrierShipmentPickupStartEventEClass, CARRIER_SHIPMENT_PICKUP_START_EVENT__CARRIER_SHIPMENT);

		carrierShipmentPickupEndEventEClass = createEClass(CARRIER_SHIPMENT_PICKUP_END_EVENT);
		createEAttribute(carrierShipmentPickupEndEventEClass, CARRIER_SHIPMENT_PICKUP_END_EVENT__CAPACITY_DEMAND);
		createEAttribute(carrierShipmentPickupEndEventEClass, CARRIER_SHIPMENT_PICKUP_END_EVENT__PICKUP_DURATION);
		createEReference(carrierShipmentPickupEndEventEClass, CARRIER_SHIPMENT_PICKUP_END_EVENT__CARRIER_SHIPMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		FreightContribPackage theFreightContribPackage = (FreightContribPackage)EPackage.Registry.INSTANCE.getEPackage(FreightContribPackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		TourPackage theTourPackage = (TourPackage)EPackage.Registry.INSTANCE.getEPackage(TourPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		carrierEventEClass.getESuperTypes().add(theCorePackage.getEvent());
		carrierShipmentDeliveryStartEventEClass.getESuperTypes().add(this.getCarrierEvent());
		carrierShipmentDeliveryEndEventEClass.getESuperTypes().add(this.getCarrierEvent());
		carrierServieStartEventEClass.getESuperTypes().add(this.getCarrierEvent());
		carrierServiceEndEventEClass.getESuperTypes().add(this.getCarrierEvent());
		carrierTourStartEventEClass.getESuperTypes().add(this.getCarrierEvent());
		carrierTourEndEventEClass.getESuperTypes().add(this.getCarrierEvent());
		carrierShipmentPickupStartEventEClass.getESuperTypes().add(this.getCarrierEvent());
		carrierShipmentPickupEndEventEClass.getESuperTypes().add(this.getCarrierEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(carrierEventEClass, CarrierEvent.class, "CarrierEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierEvent_Carrier(), theFreightContribPackage.getCarrier(), null, "carrier", null, 1, 1, CarrierEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierEvent_Link(), theNetworkPackage.getLink(), null, "link", null, 1, 1, CarrierEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierEvent_Carriervehicle(), theFreightContribPackage.getCarrierVehicle(), null, "carriervehicle", null, 1, 1, CarrierEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierShipmentDeliveryStartEventEClass, CarrierShipmentDeliveryStartEvent.class, "CarrierShipmentDeliveryStartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierShipmentDeliveryStartEvent_CarrierShipment(), theFreightContribPackage.getCarrierShipment(), null, "carrierShipment", null, 1, 1, CarrierShipmentDeliveryStartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentDeliveryStartEvent_DeliveryDuration(), theXMLTypePackage.getDouble(), "deliveryDuration", null, 1, 1, CarrierShipmentDeliveryStartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentDeliveryStartEvent_CapacityDemand(), theXMLTypePackage.getInt(), "capacityDemand", null, 1, 1, CarrierShipmentDeliveryStartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierShipmentDeliveryEndEventEClass, CarrierShipmentDeliveryEndEvent.class, "CarrierShipmentDeliveryEndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierShipmentDeliveryEndEvent_CarrierShipment(), theFreightContribPackage.getCarrierShipment(), null, "carrierShipment", null, 1, 1, CarrierShipmentDeliveryEndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentDeliveryEndEvent_DeliveryDuration(), theXMLTypePackage.getDouble(), "deliveryDuration", null, 1, 1, CarrierShipmentDeliveryEndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentDeliveryEndEvent_CapacityDemand(), theXMLTypePackage.getInt(), "capacityDemand", null, 1, 1, CarrierShipmentDeliveryEndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierServieStartEventEClass, CarrierServieStartEvent.class, "CarrierServieStartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierServieStartEvent_CarrierService(), theFreightContribPackage.getCarrierService(), null, "carrierService", null, 1, 1, CarrierServieStartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierServieStartEvent_ServiceDuration(), theXMLTypePackage.getDouble(), "serviceDuration", null, 1, 1, CarrierServieStartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierServieStartEvent_CapacityDemand(), theXMLTypePackage.getInt(), "capacityDemand", null, 1, 1, CarrierServieStartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierServiceEndEventEClass, CarrierServiceEndEvent.class, "CarrierServiceEndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierServiceEndEvent_CarrierService(), theFreightContribPackage.getCarrierService(), null, "carrierService", null, 1, 1, CarrierServiceEndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierServiceEndEvent_CapacityDemand(), theXMLTypePackage.getInt(), "capacityDemand", null, 1, 1, CarrierServiceEndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierServiceEndEvent_ServiceDuration(), theXMLTypePackage.getDouble(), "serviceDuration", null, 1, 1, CarrierServiceEndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierTourStartEventEClass, CarrierTourStartEvent.class, "CarrierTourStartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierTourStartEvent_Tour(), theTourPackage.getTour(), null, "tour", null, 1, 1, CarrierTourStartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierTourEndEventEClass, CarrierTourEndEvent.class, "CarrierTourEndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierTourEndEvent_Tour(), theTourPackage.getTour(), null, "tour", null, 1, 1, CarrierTourEndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierShipmentPickupStartEventEClass, CarrierShipmentPickupStartEvent.class, "CarrierShipmentPickupStartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrierShipmentPickupStartEvent_PickupDuration(), theXMLTypePackage.getDouble(), "pickupDuration", null, 1, 1, CarrierShipmentPickupStartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentPickupStartEvent_CapacityDemand(), theXMLTypePackage.getInt(), "capacityDemand", null, 1, 1, CarrierShipmentPickupStartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierShipmentPickupStartEvent_CarrierShipment(), theFreightContribPackage.getCarrierShipment(), null, "carrierShipment", null, 1, 1, CarrierShipmentPickupStartEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierShipmentPickupEndEventEClass, CarrierShipmentPickupEndEvent.class, "CarrierShipmentPickupEndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrierShipmentPickupEndEvent_CapacityDemand(), theXMLTypePackage.getInt(), "capacityDemand", null, 1, 1, CarrierShipmentPickupEndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentPickupEndEvent_PickupDuration(), theXMLTypePackage.getDouble(), "pickupDuration", null, 1, 1, CarrierShipmentPickupEndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierShipmentPickupEndEvent_CarrierShipment(), theFreightContribPackage.getCarrierShipment(), null, "carrierShipment", null, 1, 1, CarrierShipmentPickupEndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //EventsPackageImpl
