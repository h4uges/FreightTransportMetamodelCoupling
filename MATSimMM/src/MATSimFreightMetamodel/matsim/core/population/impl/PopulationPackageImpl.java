/**
 */
package MATSimFreightMetamodel.matsim.core.population.impl;

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

import MATSimFreightMetamodel.matsim.core.population.Person;
import MATSimFreightMetamodel.matsim.core.population.PopulationFactory;
import MATSimFreightMetamodel.matsim.core.population.PopulationPackage;

import MATSimFreightMetamodel.matsim.households.HouseholdsPackage;

import MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl;

import MATSimFreightMetamodel.matsim.impl.MatsimPackageImpl;

import MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage;

import MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PopulationPackageImpl extends EPackageImpl implements PopulationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

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
	 * @see MATSimFreightMetamodel.matsim.core.population.PopulationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PopulationPackageImpl() {
		super(eNS_URI, PopulationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PopulationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PopulationPackage init() {
		if (isInited) return (PopulationPackage)EPackage.Registry.INSTANCE.getEPackage(PopulationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPopulationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PopulationPackageImpl thePopulationPackage = registeredPopulationPackage instanceof PopulationPackageImpl ? (PopulationPackageImpl)registeredPopulationPackage : new PopulationPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MatsimPackage.eNS_URI);
		MatsimPackageImpl theMatsimPackage = (MatsimPackageImpl)(registeredPackage instanceof MatsimPackageImpl ? registeredPackage : MatsimPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VehiclesPackage.eNS_URI);
		VehiclesPackageImpl theVehiclesPackage = (VehiclesPackageImpl)(registeredPackage instanceof VehiclesPackageImpl ? registeredPackage : VehiclesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HouseholdsPackage.eNS_URI);
		HouseholdsPackageImpl theHouseholdsPackage = (HouseholdsPackageImpl)(registeredPackage instanceof HouseholdsPackageImpl ? registeredPackage : HouseholdsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FreightReceiverPackage.eNS_URI);
		FreightReceiverPackageImpl theFreightReceiverPackage = (FreightReceiverPackageImpl)(registeredPackage instanceof FreightReceiverPackageImpl ? registeredPackage : FreightReceiverPackage.eINSTANCE);

		// Create package meta-data objects
		thePopulationPackage.createPackageContents();
		theMATSimFreightMetamodelPackage.createPackageContents();
		theFreightContribPackage.createPackageContents();
		theTourPackage.createPackageContents();
		theEventsPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theMatsimPackage.createPackageContents();
		theVehiclesPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theHouseholdsPackage.createPackageContents();
		theFreightReceiverPackage.createPackageContents();

		// Initialize created meta-data
		thePopulationPackage.initializePackageContents();
		theMATSimFreightMetamodelPackage.initializePackageContents();
		theFreightContribPackage.initializePackageContents();
		theTourPackage.initializePackageContents();
		theEventsPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theMatsimPackage.initializePackageContents();
		theVehiclesPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theHouseholdsPackage.initializePackageContents();
		theFreightReceiverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePopulationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PopulationPackage.eNS_URI, thePopulationPackage);
		return thePopulationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PopulationFactory getPopulationFactory() {
		return (PopulationFactory)getEFactoryInstance();
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
		personEClass = createEClass(PERSON);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		personEClass.getESuperTypes().add(theBasePackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //PopulationPackageImpl
