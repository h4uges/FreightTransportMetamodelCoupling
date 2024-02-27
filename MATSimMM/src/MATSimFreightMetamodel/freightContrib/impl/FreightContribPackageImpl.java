/**
 */
package MATSimFreightMetamodel.freightContrib.impl;

import MATSimFreightMetamodel.MATSimFreightMetamodelPackage;

import MATSimFreightMetamodel.base.BasePackage;

import MATSimFreightMetamodel.base.impl.BasePackageImpl;

import MATSimFreightMetamodel.freightContrib.Carrier;
import MATSimFreightMetamodel.freightContrib.CarrierCapabilities;
import MATSimFreightMetamodel.freightContrib.CarrierContainer;
import MATSimFreightMetamodel.freightContrib.CarrierPlan;
import MATSimFreightMetamodel.freightContrib.CarrierService;
import MATSimFreightMetamodel.freightContrib.CarrierShipment;
import MATSimFreightMetamodel.freightContrib.CarrierVehicle;
import MATSimFreightMetamodel.freightContrib.FleetSize;
import MATSimFreightMetamodel.freightContrib.FreightContribFactory;
import MATSimFreightMetamodel.freightContrib.FreightContribPackage;
import MATSimFreightMetamodel.freightContrib.ScheduledTour;
import MATSimFreightMetamodel.freightContrib.TimeWindow;

import MATSimFreightMetamodel.freightContrib.events.EventsPackage;

import MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl;

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
import org.eclipse.emf.ecore.EEnum;
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
public class FreightContribPackageImpl extends EPackageImpl implements FreightContribPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierCapabilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduledTourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierVehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fleetSizeEEnum = null;

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
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FreightContribPackageImpl() {
		super(eNS_URI, FreightContribFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FreightContribPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FreightContribPackage init() {
		if (isInited) return (FreightContribPackage)EPackage.Registry.INSTANCE.getEPackage(FreightContribPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFreightContribPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FreightContribPackageImpl theFreightContribPackage = registeredFreightContribPackage instanceof FreightContribPackageImpl ? (FreightContribPackageImpl)registeredFreightContribPackage : new FreightContribPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MATSimFreightMetamodelPackage.eNS_URI);
		MATSimFreightMetamodelPackageImpl theMATSimFreightMetamodelPackage = (MATSimFreightMetamodelPackageImpl)(registeredPackage instanceof MATSimFreightMetamodelPackageImpl ? registeredPackage : MATSimFreightMetamodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TourPackage.eNS_URI);
		TourPackageImpl theTourPackage = (TourPackageImpl)(registeredPackage instanceof TourPackageImpl ? registeredPackage : TourPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl)(registeredPackage instanceof EventsPackageImpl ? registeredPackage : EventsPackage.eINSTANCE);
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
		theFreightContribPackage.createPackageContents();
		theMATSimFreightMetamodelPackage.createPackageContents();
		theTourPackage.createPackageContents();
		theEventsPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theMatsimPackage.createPackageContents();
		theVehiclesPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		thePopulationPackage.createPackageContents();
		theHouseholdsPackage.createPackageContents();
		theFreightReceiverPackage.createPackageContents();

		// Initialize created meta-data
		theFreightContribPackage.initializePackageContents();
		theMATSimFreightMetamodelPackage.initializePackageContents();
		theTourPackage.initializePackageContents();
		theEventsPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theMatsimPackage.initializePackageContents();
		theVehiclesPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		thePopulationPackage.initializePackageContents();
		theHouseholdsPackage.initializePackageContents();
		theFreightReceiverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFreightContribPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FreightContribPackage.eNS_URI, theFreightContribPackage);
		return theFreightContribPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrier() {
		return carrierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrier_Plan() {
		return (EReference)carrierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrier_Services() {
		return (EReference)carrierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrier_Shipments() {
		return (EReference)carrierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrier_CarrierCapabilities() {
		return (EReference)carrierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierCapabilities() {
		return carrierCapabilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierCapabilities_CarrierVehicles() {
		return (EReference)carrierCapabilitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierCapabilities_VehicleTypes() {
		return (EReference)carrierCapabilitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierCapabilities_FleetSize() {
		return (EAttribute)carrierCapabilitiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierPlan() {
		return carrierPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierPlan_ScheduledTours() {
		return (EReference)carrierPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierPlan_Score() {
		return (EAttribute)carrierPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierContainer() {
		return carrierContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierContainer_Carriers() {
		return (EReference)carrierContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierService() {
		return carrierServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierService_Name() {
		return (EAttribute)carrierServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierService_ServiceDuration() {
		return (EAttribute)carrierServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierService_TimeWindow() {
		return (EReference)carrierServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierService_CapacityDemand() {
		return (EAttribute)carrierServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierService_Location() {
		return (EReference)carrierServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierShipment() {
		return carrierShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipment_Size() {
		return (EAttribute)carrierShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierShipment_PickupTimeWindow() {
		return (EReference)carrierShipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierShipment_DeliveryTimeWindow() {
		return (EReference)carrierShipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipment_PickupServiceTime() {
		return (EAttribute)carrierShipmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipment_DeliveryServiceTime() {
		return (EAttribute)carrierShipmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierShipment_From() {
		return (EReference)carrierShipmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierShipment_To() {
		return (EReference)carrierShipmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScheduledTour() {
		return scheduledTourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduledTour_DepartureTime() {
		return (EAttribute)scheduledTourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheduledTour_Vehicle() {
		return (EReference)scheduledTourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScheduledTour_Tour() {
		return (EReference)scheduledTourEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeWindow() {
		return timeWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeWindow_Start() {
		return (EAttribute)timeWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeWindow_End() {
		return (EAttribute)timeWindowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierVehicle() {
		return carrierVehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierVehicle_EarliestStartTime() {
		return (EAttribute)carrierVehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierVehicle_LatestEndTime() {
		return (EAttribute)carrierVehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCarrierVehicle_Location() {
		return (EReference)carrierVehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFleetSize() {
		return fleetSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreightContribFactory getFreightContribFactory() {
		return (FreightContribFactory)getEFactoryInstance();
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
		carrierEClass = createEClass(CARRIER);
		createEReference(carrierEClass, CARRIER__PLAN);
		createEReference(carrierEClass, CARRIER__SERVICES);
		createEReference(carrierEClass, CARRIER__SHIPMENTS);
		createEReference(carrierEClass, CARRIER__CARRIER_CAPABILITIES);

		carrierCapabilitiesEClass = createEClass(CARRIER_CAPABILITIES);
		createEReference(carrierCapabilitiesEClass, CARRIER_CAPABILITIES__CARRIER_VEHICLES);
		createEReference(carrierCapabilitiesEClass, CARRIER_CAPABILITIES__VEHICLE_TYPES);
		createEAttribute(carrierCapabilitiesEClass, CARRIER_CAPABILITIES__FLEET_SIZE);

		carrierPlanEClass = createEClass(CARRIER_PLAN);
		createEReference(carrierPlanEClass, CARRIER_PLAN__SCHEDULED_TOURS);
		createEAttribute(carrierPlanEClass, CARRIER_PLAN__SCORE);

		carrierContainerEClass = createEClass(CARRIER_CONTAINER);
		createEReference(carrierContainerEClass, CARRIER_CONTAINER__CARRIERS);

		carrierServiceEClass = createEClass(CARRIER_SERVICE);
		createEAttribute(carrierServiceEClass, CARRIER_SERVICE__NAME);
		createEAttribute(carrierServiceEClass, CARRIER_SERVICE__SERVICE_DURATION);
		createEReference(carrierServiceEClass, CARRIER_SERVICE__TIME_WINDOW);
		createEAttribute(carrierServiceEClass, CARRIER_SERVICE__CAPACITY_DEMAND);
		createEReference(carrierServiceEClass, CARRIER_SERVICE__LOCATION);

		carrierShipmentEClass = createEClass(CARRIER_SHIPMENT);
		createEAttribute(carrierShipmentEClass, CARRIER_SHIPMENT__SIZE);
		createEReference(carrierShipmentEClass, CARRIER_SHIPMENT__PICKUP_TIME_WINDOW);
		createEReference(carrierShipmentEClass, CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW);
		createEAttribute(carrierShipmentEClass, CARRIER_SHIPMENT__PICKUP_SERVICE_TIME);
		createEAttribute(carrierShipmentEClass, CARRIER_SHIPMENT__DELIVERY_SERVICE_TIME);
		createEReference(carrierShipmentEClass, CARRIER_SHIPMENT__FROM);
		createEReference(carrierShipmentEClass, CARRIER_SHIPMENT__TO);

		scheduledTourEClass = createEClass(SCHEDULED_TOUR);
		createEAttribute(scheduledTourEClass, SCHEDULED_TOUR__DEPARTURE_TIME);
		createEReference(scheduledTourEClass, SCHEDULED_TOUR__VEHICLE);
		createEReference(scheduledTourEClass, SCHEDULED_TOUR__TOUR);

		timeWindowEClass = createEClass(TIME_WINDOW);
		createEAttribute(timeWindowEClass, TIME_WINDOW__START);
		createEAttribute(timeWindowEClass, TIME_WINDOW__END);

		carrierVehicleEClass = createEClass(CARRIER_VEHICLE);
		createEAttribute(carrierVehicleEClass, CARRIER_VEHICLE__EARLIEST_START_TIME);
		createEAttribute(carrierVehicleEClass, CARRIER_VEHICLE__LATEST_END_TIME);
		createEReference(carrierVehicleEClass, CARRIER_VEHICLE__LOCATION);

		// Create enums
		fleetSizeEEnum = createEEnum(FLEET_SIZE);
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
		TourPackage theTourPackage = (TourPackage)EPackage.Registry.INSTANCE.getEPackage(TourPackage.eNS_URI);
		EventsPackage theEventsPackage = (EventsPackage)EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		VehiclesPackage theVehiclesPackage = (VehiclesPackage)EPackage.Registry.INSTANCE.getEPackage(VehiclesPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTourPackage);
		getESubpackages().add(theEventsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		carrierEClass.getESuperTypes().add(theBasePackage.getEntity());
		carrierServiceEClass.getESuperTypes().add(theBasePackage.getEntity());
		carrierShipmentEClass.getESuperTypes().add(theBasePackage.getEntity());
		carrierVehicleEClass.getESuperTypes().add(theVehiclesPackage.getVehicle());

		// Initialize classes, features, and operations; add parameters
		initEClass(carrierEClass, Carrier.class, "Carrier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrier_Plan(), this.getCarrierPlan(), null, "plan", null, 0, 1, Carrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrier_Services(), this.getCarrierService(), null, "services", null, 0, -1, Carrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrier_Shipments(), this.getCarrierShipment(), null, "shipments", null, 0, -1, Carrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrier_CarrierCapabilities(), this.getCarrierCapabilities(), null, "carrierCapabilities", null, 1, 1, Carrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierCapabilitiesEClass, CarrierCapabilities.class, "CarrierCapabilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierCapabilities_CarrierVehicles(), this.getCarrierVehicle(), null, "carrierVehicles", null, 0, -1, CarrierCapabilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierCapabilities_VehicleTypes(), theVehiclesPackage.getVehicleType(), null, "vehicleTypes", null, 0, -1, CarrierCapabilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierCapabilities_FleetSize(), this.getFleetSize(), "fleetSize", null, 1, 1, CarrierCapabilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierPlanEClass, CarrierPlan.class, "CarrierPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierPlan_ScheduledTours(), this.getScheduledTour(), null, "scheduledTours", null, 0, -1, CarrierPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierPlan_Score(), theXMLTypePackage.getDouble(), "score", null, 0, 1, CarrierPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierContainerEClass, CarrierContainer.class, "CarrierContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarrierContainer_Carriers(), this.getCarrier(), null, "carriers", null, 0, -1, CarrierContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierServiceEClass, CarrierService.class, "CarrierService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrierService_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, CarrierService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierService_ServiceDuration(), theXMLTypePackage.getDouble(), "serviceDuration", null, 1, 1, CarrierService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierService_TimeWindow(), this.getTimeWindow(), null, "timeWindow", null, 1, 1, CarrierService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierService_CapacityDemand(), theXMLTypePackage.getInt(), "capacityDemand", null, 1, 1, CarrierService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierService_Location(), theNetworkPackage.getLink(), null, "location", null, 1, 1, CarrierService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierShipmentEClass, CarrierShipment.class, "CarrierShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrierShipment_Size(), theXMLTypePackage.getInt(), "size", null, 1, 1, CarrierShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierShipment_PickupTimeWindow(), this.getTimeWindow(), null, "pickupTimeWindow", null, 1, 1, CarrierShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierShipment_DeliveryTimeWindow(), this.getTimeWindow(), null, "deliveryTimeWindow", null, 1, 1, CarrierShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipment_PickupServiceTime(), theXMLTypePackage.getDouble(), "pickupServiceTime", null, 1, 1, CarrierShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipment_DeliveryServiceTime(), theXMLTypePackage.getDouble(), "deliveryServiceTime", null, 1, 1, CarrierShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierShipment_From(), theNetworkPackage.getLink(), null, "from", null, 1, 1, CarrierShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierShipment_To(), theNetworkPackage.getLink(), null, "to", null, 1, 1, CarrierShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduledTourEClass, ScheduledTour.class, "ScheduledTour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduledTour_DepartureTime(), theXMLTypePackage.getDouble(), "departureTime", null, 1, 1, ScheduledTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduledTour_Vehicle(), this.getCarrierVehicle(), null, "vehicle", null, 1, 1, ScheduledTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduledTour_Tour(), theTourPackage.getTour(), null, "tour", null, 1, 1, ScheduledTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeWindowEClass, TimeWindow.class, "TimeWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeWindow_Start(), theXMLTypePackage.getDouble(), "start", null, 1, 1, TimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeWindow_End(), theXMLTypePackage.getDouble(), "end", null, 1, 1, TimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierVehicleEClass, CarrierVehicle.class, "CarrierVehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrierVehicle_EarliestStartTime(), theXMLTypePackage.getDouble(), "earliestStartTime", null, 1, 1, CarrierVehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierVehicle_LatestEndTime(), theXMLTypePackage.getDouble(), "latestEndTime", null, 1, 1, CarrierVehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarrierVehicle_Location(), theNetworkPackage.getLink(), null, "location", null, 1, 1, CarrierVehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fleetSizeEEnum, FleetSize.class, "FleetSize");
		addEEnumLiteral(fleetSizeEEnum, FleetSize.INFINITE);
		addEEnumLiteral(fleetSizeEEnum, FleetSize.FINITE);
	}

} //FreightContribPackageImpl
