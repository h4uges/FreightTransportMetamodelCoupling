/**
 */
package MATSimFreightMetamodel.matsim.impl;

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

import MATSimFreightMetamodel.matsim.MatsimFactory;
import MATSimFreightMetamodel.matsim.MatsimPackage;
import MATSimFreightMetamodel.matsim.TransportMode;

import MATSimFreightMetamodel.matsim.core.CorePackage;

import MATSimFreightMetamodel.matsim.core.impl.CorePackageImpl;

import MATSimFreightMetamodel.matsim.core.network.NetworkPackage;

import MATSimFreightMetamodel.matsim.core.network.impl.NetworkPackageImpl;

import MATSimFreightMetamodel.matsim.core.population.PopulationPackage;

import MATSimFreightMetamodel.matsim.core.population.impl.PopulationPackageImpl;

import MATSimFreightMetamodel.matsim.households.HouseholdsPackage;

import MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl;

import MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage;

import MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatsimPackageImpl extends EPackageImpl implements MatsimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transportModeEEnum = null;

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
	 * @see MATSimFreightMetamodel.matsim.MatsimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MatsimPackageImpl() {
		super(eNS_URI, MatsimFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MatsimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MatsimPackage init() {
		if (isInited) return (MatsimPackage)EPackage.Registry.INSTANCE.getEPackage(MatsimPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMatsimPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MatsimPackageImpl theMatsimPackage = registeredMatsimPackage instanceof MatsimPackageImpl ? (MatsimPackageImpl)registeredMatsimPackage : new MatsimPackageImpl();

		isInited = true;

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
		theMatsimPackage.createPackageContents();
		theMATSimFreightMetamodelPackage.createPackageContents();
		theFreightContribPackage.createPackageContents();
		theTourPackage.createPackageContents();
		theEventsPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theVehiclesPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		thePopulationPackage.createPackageContents();
		theHouseholdsPackage.createPackageContents();
		theFreightReceiverPackage.createPackageContents();

		// Initialize created meta-data
		theMatsimPackage.initializePackageContents();
		theMATSimFreightMetamodelPackage.initializePackageContents();
		theFreightContribPackage.initializePackageContents();
		theTourPackage.initializePackageContents();
		theEventsPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theVehiclesPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		thePopulationPackage.initializePackageContents();
		theHouseholdsPackage.initializePackageContents();
		theFreightReceiverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMatsimPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MatsimPackage.eNS_URI, theMatsimPackage);
		return theMatsimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTransportMode() {
		return transportModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatsimFactory getMatsimFactory() {
		return (MatsimFactory)getEFactoryInstance();
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

		// Create enums
		transportModeEEnum = createEEnum(TRANSPORT_MODE);
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
		VehiclesPackage theVehiclesPackage = (VehiclesPackage)EPackage.Registry.INSTANCE.getEPackage(VehiclesPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		HouseholdsPackage theHouseholdsPackage = (HouseholdsPackage)EPackage.Registry.INSTANCE.getEPackage(HouseholdsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theVehiclesPackage);
		getESubpackages().add(theCorePackage);
		getESubpackages().add(theHouseholdsPackage);

		// Initialize enums and add enum literals
		initEEnum(transportModeEEnum, TransportMode.class, "TransportMode");
		addEEnumLiteral(transportModeEEnum, TransportMode.CAR);
		addEEnumLiteral(transportModeEEnum, TransportMode.RIDE);
		addEEnumLiteral(transportModeEEnum, TransportMode.BIKE);
		addEEnumLiteral(transportModeEEnum, TransportMode.MOTORCYCLE);
		addEEnumLiteral(transportModeEEnum, TransportMode.TRUCK);
		addEEnumLiteral(transportModeEEnum, TransportMode.PT);
		addEEnumLiteral(transportModeEEnum, TransportMode.DRT);
		addEEnumLiteral(transportModeEEnum, TransportMode.TAXI);
		addEEnumLiteral(transportModeEEnum, TransportMode.WALK);
		addEEnumLiteral(transportModeEEnum, TransportMode.TRANSIT_WALK);
		addEEnumLiteral(transportModeEEnum, TransportMode.TRAIN);
		addEEnumLiteral(transportModeEEnum, TransportMode.SHIP);
		addEEnumLiteral(transportModeEEnum, TransportMode.AIRPLANE);
		addEEnumLiteral(transportModeEEnum, TransportMode.NON_NETWORK_WALK);
		addEEnumLiteral(transportModeEEnum, TransportMode.OTHER);
	}

} //MatsimPackageImpl
