/**
 */
package MATSimFreightMetamodel.matsim.vehicles.impl;

import MATSimFreightMetamodel.MATSimFreightMetamodelPackage;

import MATSimFreightMetamodel.base.BasePackage;

import MATSimFreightMetamodel.base.impl.BasePackageImpl;

import MATSimFreightMetamodel.freightContrib.FreightContribPackage;

import MATSimFreightMetamodel.freightContrib.events.EventsPackage;

import MATSimFreightMetamodel.freightContrib.events.impl.EventsPackageImpl;

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

import MATSimFreightMetamodel.matsim.vehicles.PersonVehicle;
import MATSimFreightMetamodel.matsim.vehicles.Vehicle;
import MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity;
import MATSimFreightMetamodel.matsim.vehicles.VehicleType;
import MATSimFreightMetamodel.matsim.vehicles.VehicleTypes;
import MATSimFreightMetamodel.matsim.vehicles.VehiclesFactory;
import MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage;

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
public class VehiclesPackageImpl extends EPackageImpl implements VehiclesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleCapacityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personVehicleEClass = null;

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
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VehiclesPackageImpl() {
		super(eNS_URI, VehiclesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VehiclesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VehiclesPackage init() {
		if (isInited) return (VehiclesPackage)EPackage.Registry.INSTANCE.getEPackage(VehiclesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVehiclesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VehiclesPackageImpl theVehiclesPackage = registeredVehiclesPackage instanceof VehiclesPackageImpl ? (VehiclesPackageImpl)registeredVehiclesPackage : new VehiclesPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl)(registeredPackage instanceof EventsPackageImpl ? registeredPackage : EventsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		BasePackageImpl theBasePackage = (BasePackageImpl)(registeredPackage instanceof BasePackageImpl ? registeredPackage : BasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MatsimPackage.eNS_URI);
		MatsimPackageImpl theMatsimPackage = (MatsimPackageImpl)(registeredPackage instanceof MatsimPackageImpl ? registeredPackage : MatsimPackage.eINSTANCE);
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
		theVehiclesPackage.createPackageContents();
		theMATSimFreightMetamodelPackage.createPackageContents();
		theFreightContribPackage.createPackageContents();
		theTourPackage.createPackageContents();
		theEventsPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theMatsimPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		thePopulationPackage.createPackageContents();
		theHouseholdsPackage.createPackageContents();
		theFreightReceiverPackage.createPackageContents();

		// Initialize created meta-data
		theVehiclesPackage.initializePackageContents();
		theMATSimFreightMetamodelPackage.initializePackageContents();
		theFreightContribPackage.initializePackageContents();
		theTourPackage.initializePackageContents();
		theEventsPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theMatsimPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		thePopulationPackage.initializePackageContents();
		theHouseholdsPackage.initializePackageContents();
		theFreightReceiverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVehiclesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VehiclesPackage.eNS_URI, theVehiclesPackage);
		return theVehiclesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicleType() {
		return vehicleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleType_Width() {
		return (EAttribute)vehicleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleType_MaxVelocity() {
		return (EAttribute)vehicleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleType_Length() {
		return (EAttribute)vehicleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleType_PcuEquivalents() {
		return (EAttribute)vehicleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleType_FlowEfficiencyFactor() {
		return (EAttribute)vehicleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleType_Description() {
		return (EAttribute)vehicleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleType_NetworkMode() {
		return (EAttribute)vehicleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleType_Capacity() {
		return (EReference)vehicleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicleCapacity() {
		return vehicleCapacityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleCapacity_Seats() {
		return (EAttribute)vehicleCapacityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleCapacity_StandingRoom() {
		return (EAttribute)vehicleCapacityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleCapacity_VolumeInCubicMeters() {
		return (EAttribute)vehicleCapacityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleCapacity_WeightInTons() {
		return (EAttribute)vehicleCapacityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicleCapacity_Other() {
		return (EAttribute)vehicleCapacityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicle_Type() {
		return (EReference)vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicleTypes() {
		return vehicleTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleTypes_VehicleTypes() {
		return (EReference)vehicleTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleTypes_Vehicles() {
		return (EReference)vehicleTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonVehicle() {
		return personVehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehiclesFactory getVehiclesFactory() {
		return (VehiclesFactory)getEFactoryInstance();
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
		vehicleTypeEClass = createEClass(VEHICLE_TYPE);
		createEAttribute(vehicleTypeEClass, VEHICLE_TYPE__WIDTH);
		createEAttribute(vehicleTypeEClass, VEHICLE_TYPE__MAX_VELOCITY);
		createEAttribute(vehicleTypeEClass, VEHICLE_TYPE__LENGTH);
		createEAttribute(vehicleTypeEClass, VEHICLE_TYPE__PCU_EQUIVALENTS);
		createEAttribute(vehicleTypeEClass, VEHICLE_TYPE__FLOW_EFFICIENCY_FACTOR);
		createEAttribute(vehicleTypeEClass, VEHICLE_TYPE__DESCRIPTION);
		createEAttribute(vehicleTypeEClass, VEHICLE_TYPE__NETWORK_MODE);
		createEReference(vehicleTypeEClass, VEHICLE_TYPE__CAPACITY);

		vehicleCapacityEClass = createEClass(VEHICLE_CAPACITY);
		createEAttribute(vehicleCapacityEClass, VEHICLE_CAPACITY__SEATS);
		createEAttribute(vehicleCapacityEClass, VEHICLE_CAPACITY__STANDING_ROOM);
		createEAttribute(vehicleCapacityEClass, VEHICLE_CAPACITY__VOLUME_IN_CUBIC_METERS);
		createEAttribute(vehicleCapacityEClass, VEHICLE_CAPACITY__WEIGHT_IN_TONS);
		createEAttribute(vehicleCapacityEClass, VEHICLE_CAPACITY__OTHER);

		vehicleEClass = createEClass(VEHICLE);
		createEReference(vehicleEClass, VEHICLE__TYPE);

		vehicleTypesEClass = createEClass(VEHICLE_TYPES);
		createEReference(vehicleTypesEClass, VEHICLE_TYPES__VEHICLE_TYPES);
		createEReference(vehicleTypesEClass, VEHICLE_TYPES__VEHICLES);

		personVehicleEClass = createEClass(PERSON_VEHICLE);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		MatsimPackage theMatsimPackage = (MatsimPackage)EPackage.Registry.INSTANCE.getEPackage(MatsimPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vehicleTypeEClass.getESuperTypes().add(theBasePackage.getEntity());
		vehicleEClass.getESuperTypes().add(theBasePackage.getEntity());
		personVehicleEClass.getESuperTypes().add(this.getVehicle());

		// Initialize classes, features, and operations; add parameters
		initEClass(vehicleTypeEClass, VehicleType.class, "VehicleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicleType_Width(), theXMLTypePackage.getDouble(), "width", "1", 1, 1, VehicleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleType_MaxVelocity(), theXMLTypePackage.getDouble(), "maxVelocity", "9999", 1, 1, VehicleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleType_Length(), theXMLTypePackage.getDouble(), "length", "7.5", 1, 1, VehicleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleType_PcuEquivalents(), theXMLTypePackage.getDouble(), "pcuEquivalents", "1.0", 1, 1, VehicleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleType_FlowEfficiencyFactor(), theXMLTypePackage.getDouble(), "flowEfficiencyFactor", "1.0", 1, 1, VehicleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleType_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, VehicleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleType_NetworkMode(), theMatsimPackage.getTransportMode(), "networkMode", null, 1, 1, VehicleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleType_Capacity(), this.getVehicleCapacity(), null, "capacity", null, 1, 1, VehicleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleCapacityEClass, VehicleCapacity.class, "VehicleCapacity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicleCapacity_Seats(), theXMLTypePackage.getInt(), "seats", "0", 1, 1, VehicleCapacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleCapacity_StandingRoom(), theXMLTypePackage.getInt(), "standingRoom", "0", 1, 1, VehicleCapacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleCapacity_VolumeInCubicMeters(), theXMLTypePackage.getDouble(), "volumeInCubicMeters", null, 1, 1, VehicleCapacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleCapacity_WeightInTons(), theXMLTypePackage.getDouble(), "weightInTons", null, 1, 1, VehicleCapacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleCapacity_Other(), theXMLTypePackage.getDouble(), "other", null, 1, 1, VehicleCapacity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicle_Type(), this.getVehicleType(), null, "type", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleTypesEClass, VehicleTypes.class, "VehicleTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicleTypes_VehicleTypes(), this.getVehicleType(), null, "vehicleTypes", null, 0, -1, VehicleTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleTypes_Vehicles(), this.getVehicle(), null, "vehicles", null, 0, -1, VehicleTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personVehicleEClass, PersonVehicle.class, "PersonVehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //VehiclesPackageImpl
