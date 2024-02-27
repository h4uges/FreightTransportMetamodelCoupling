/**
 */
package logiToppMetamodel.impl;

import logiToppMetamodel.Demand;
import logiToppMetamodel.DemandExchangeRoot;
import logiToppMetamodel.LogiToppMetamodelFactory;
import logiToppMetamodel.LogiToppMetamodelPackage;
import logiToppMetamodel.Population;
import logiToppMetamodel.Solution;
import logiToppMetamodel.SolutionExchangeRoot;
import logiToppMetamodel.TransportInfrastructure;

import logiToppMetamodel.base.BasePackage;

import logiToppMetamodel.base.impl.BasePackageImpl;

import logiToppMetamodel.logiTopp.LogiToppPackage;

import logiToppMetamodel.logiTopp.business.BusinessPackage;

import logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl;

import logiToppMetamodel.logiTopp.distribution.DistributionPackage;

import logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage;

import logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl;

import logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage;

import logiToppMetamodel.logiTopp.distribution.delivery.impl.DeliveryPackageImpl;

import logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage;

import logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetPackageImpl;

import logiToppMetamodel.logiTopp.distribution.impl.DistributionPackageImpl;

import logiToppMetamodel.logiTopp.distribution.policies.PoliciesPackage;

import logiToppMetamodel.logiTopp.distribution.policies.impl.PoliciesPackageImpl;

import logiToppMetamodel.logiTopp.distribution.region.RegionPackage;

import logiToppMetamodel.logiTopp.distribution.region.impl.RegionPackageImpl;

import logiToppMetamodel.logiTopp.distribution.timetable.TimetablePackage;

import logiToppMetamodel.logiTopp.distribution.timetable.impl.TimetablePackageImpl;

import logiToppMetamodel.logiTopp.distribution.tours.ToursPackage;

import logiToppMetamodel.logiTopp.distribution.tours.impl.ToursPackageImpl;

import logiToppMetamodel.logiTopp.impl.LogiToppPackageImpl;

import logiToppMetamodel.logiTopp.parcels.ParcelsPackage;

import logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl;

import logiToppMetamodel.mobiTopp.citizens.CitizensPackage;
import logiToppMetamodel.mobiTopp.citizens.impl.CitizensPackageImpl;
import logiToppMetamodel.mobiTopp.network.NetworkPackage;

import logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogiToppMetamodelPackageImpl extends EPackageImpl implements LogiToppMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportInfrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demandExchangeRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionExchangeRootEClass = null;

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
	 * @see logiToppMetamodel.LogiToppMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogiToppMetamodelPackageImpl() {
		super(eNS_URI, LogiToppMetamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogiToppMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogiToppMetamodelPackage init() {
		if (isInited) return (LogiToppMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(LogiToppMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogiToppMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogiToppMetamodelPackageImpl theLogiToppMetamodelPackage = registeredLogiToppMetamodelPackage instanceof LogiToppMetamodelPackageImpl ? (LogiToppMetamodelPackageImpl)registeredLogiToppMetamodelPackage : new LogiToppMetamodelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CitizensPackage.eNS_URI);
		CitizensPackageImpl theCitizensPackage = (CitizensPackageImpl)(registeredPackage instanceof CitizensPackageImpl ? registeredPackage : CitizensPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		BasePackageImpl theBasePackage = (BasePackageImpl)(registeredPackage instanceof BasePackageImpl ? registeredPackage : BasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogiToppPackage.eNS_URI);
		LogiToppPackageImpl theLogiToppPackage = (LogiToppPackageImpl)(registeredPackage instanceof LogiToppPackageImpl ? registeredPackage : LogiToppPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI);
		BusinessPackageImpl theBusinessPackage = (BusinessPackageImpl)(registeredPackage instanceof BusinessPackageImpl ? registeredPackage : BusinessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DistributionPackage.eNS_URI);
		DistributionPackageImpl theDistributionPackage = (DistributionPackageImpl)(registeredPackage instanceof DistributionPackageImpl ? registeredPackage : DistributionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ChainsPackage.eNS_URI);
		ChainsPackageImpl theChainsPackage = (ChainsPackageImpl)(registeredPackage instanceof ChainsPackageImpl ? registeredPackage : ChainsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeliveryPackage.eNS_URI);
		DeliveryPackageImpl theDeliveryPackage = (DeliveryPackageImpl)(registeredPackage instanceof DeliveryPackageImpl ? registeredPackage : DeliveryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FleetPackage.eNS_URI);
		FleetPackageImpl theFleetPackage = (FleetPackageImpl)(registeredPackage instanceof FleetPackageImpl ? registeredPackage : FleetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PoliciesPackage.eNS_URI);
		PoliciesPackageImpl thePoliciesPackage = (PoliciesPackageImpl)(registeredPackage instanceof PoliciesPackageImpl ? registeredPackage : PoliciesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RegionPackage.eNS_URI);
		RegionPackageImpl theRegionPackage = (RegionPackageImpl)(registeredPackage instanceof RegionPackageImpl ? registeredPackage : RegionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TimetablePackage.eNS_URI);
		TimetablePackageImpl theTimetablePackage = (TimetablePackageImpl)(registeredPackage instanceof TimetablePackageImpl ? registeredPackage : TimetablePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ToursPackage.eNS_URI);
		ToursPackageImpl theToursPackage = (ToursPackageImpl)(registeredPackage instanceof ToursPackageImpl ? registeredPackage : ToursPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParcelsPackage.eNS_URI);
		ParcelsPackageImpl theParcelsPackage = (ParcelsPackageImpl)(registeredPackage instanceof ParcelsPackageImpl ? registeredPackage : ParcelsPackage.eINSTANCE);

		// Create package meta-data objects
		theLogiToppMetamodelPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theCitizensPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theLogiToppPackage.createPackageContents();
		theBusinessPackage.createPackageContents();
		theDistributionPackage.createPackageContents();
		theChainsPackage.createPackageContents();
		theDeliveryPackage.createPackageContents();
		theFleetPackage.createPackageContents();
		thePoliciesPackage.createPackageContents();
		theRegionPackage.createPackageContents();
		theTimetablePackage.createPackageContents();
		theToursPackage.createPackageContents();
		theParcelsPackage.createPackageContents();

		// Initialize created meta-data
		theLogiToppMetamodelPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theCitizensPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theLogiToppPackage.initializePackageContents();
		theBusinessPackage.initializePackageContents();
		theDistributionPackage.initializePackageContents();
		theChainsPackage.initializePackageContents();
		theDeliveryPackage.initializePackageContents();
		theFleetPackage.initializePackageContents();
		thePoliciesPackage.initializePackageContents();
		theRegionPackage.initializePackageContents();
		theTimetablePackage.initializePackageContents();
		theToursPackage.initializePackageContents();
		theParcelsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogiToppMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogiToppMetamodelPackage.eNS_URI, theLogiToppMetamodelPackage);
		return theLogiToppMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDemand() {
		return demandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDemand_Parcels() {
		return (EReference)demandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPopulation() {
		return populationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPopulation_Households() {
		return (EReference)populationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPopulation_Businesses() {
		return (EReference)populationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportInfrastructure() {
		return transportInfrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransportInfrastructure_Timetable() {
		return (EReference)transportInfrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransportInfrastructure_CepServiceProviders() {
		return (EReference)transportInfrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolution_PlannedTours() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDemandExchangeRoot() {
		return demandExchangeRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDemandExchangeRoot_Demand() {
		return (EReference)demandExchangeRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDemandExchangeRoot_Population() {
		return (EReference)demandExchangeRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDemandExchangeRoot_TransportNetwork() {
		return (EReference)demandExchangeRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDemandExchangeRoot_Network() {
		return (EReference)demandExchangeRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolutionExchangeRoot() {
		return solutionExchangeRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolutionExchangeRoot_Solution() {
		return (EReference)solutionExchangeRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogiToppMetamodelFactory getLogiToppMetamodelFactory() {
		return (LogiToppMetamodelFactory)getEFactoryInstance();
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
		demandEClass = createEClass(DEMAND);
		createEReference(demandEClass, DEMAND__PARCELS);

		populationEClass = createEClass(POPULATION);
		createEReference(populationEClass, POPULATION__HOUSEHOLDS);
		createEReference(populationEClass, POPULATION__BUSINESSES);

		transportInfrastructureEClass = createEClass(TRANSPORT_INFRASTRUCTURE);
		createEReference(transportInfrastructureEClass, TRANSPORT_INFRASTRUCTURE__TIMETABLE);
		createEReference(transportInfrastructureEClass, TRANSPORT_INFRASTRUCTURE__CEP_SERVICE_PROVIDERS);

		solutionEClass = createEClass(SOLUTION);
		createEReference(solutionEClass, SOLUTION__PLANNED_TOURS);

		demandExchangeRootEClass = createEClass(DEMAND_EXCHANGE_ROOT);
		createEReference(demandExchangeRootEClass, DEMAND_EXCHANGE_ROOT__DEMAND);
		createEReference(demandExchangeRootEClass, DEMAND_EXCHANGE_ROOT__POPULATION);
		createEReference(demandExchangeRootEClass, DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK);
		createEReference(demandExchangeRootEClass, DEMAND_EXCHANGE_ROOT__NETWORK);

		solutionExchangeRootEClass = createEClass(SOLUTION_EXCHANGE_ROOT);
		createEReference(solutionExchangeRootEClass, SOLUTION_EXCHANGE_ROOT__SOLUTION);
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
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		CitizensPackage theCitizensPackage = (CitizensPackage)EPackage.Registry.INSTANCE.getEPackage(CitizensPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		LogiToppPackage theLogiToppPackage = (LogiToppPackage)EPackage.Registry.INSTANCE.getEPackage(LogiToppPackage.eNS_URI);
		ParcelsPackage theParcelsPackage = (ParcelsPackage)EPackage.Registry.INSTANCE.getEPackage(ParcelsPackage.eNS_URI);
		BusinessPackage theBusinessPackage = (BusinessPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI);
		TimetablePackage theTimetablePackage = (TimetablePackage)EPackage.Registry.INSTANCE.getEPackage(TimetablePackage.eNS_URI);
		DistributionPackage theDistributionPackage = (DistributionPackage)EPackage.Registry.INSTANCE.getEPackage(DistributionPackage.eNS_URI);
		ToursPackage theToursPackage = (ToursPackage)EPackage.Registry.INSTANCE.getEPackage(ToursPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theNetworkPackage);
		getESubpackages().add(theCitizensPackage);
		getESubpackages().add(theBasePackage);
		getESubpackages().add(theLogiToppPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		solutionExchangeRootEClass.getESuperTypes().add(this.getDemandExchangeRoot());

		// Initialize classes, features, and operations; add parameters
		initEClass(demandEClass, Demand.class, "Demand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDemand_Parcels(), theParcelsPackage.getParcel(), null, "parcels", null, 0, -1, Demand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(populationEClass, Population.class, "Population", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPopulation_Households(), theCitizensPackage.getHousehold(), null, "households", null, 0, -1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPopulation_Businesses(), theBusinessPackage.getBusiness(), null, "businesses", null, 0, -1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportInfrastructureEClass, TransportInfrastructure.class, "TransportInfrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransportInfrastructure_Timetable(), theTimetablePackage.getTimeTable(), null, "timetable", null, 1, 1, TransportInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportInfrastructure_CepServiceProviders(), theDistributionPackage.getCEPServiceProvider(), null, "cepServiceProviders", null, 0, -1, TransportInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolution_PlannedTours(), theToursPackage.getPlannedDeliveryTour(), null, "plannedTours", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(demandExchangeRootEClass, DemandExchangeRoot.class, "DemandExchangeRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDemandExchangeRoot_Demand(), this.getDemand(), null, "demand", null, 1, 1, DemandExchangeRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemandExchangeRoot_Population(), this.getPopulation(), null, "population", null, 1, 1, DemandExchangeRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemandExchangeRoot_TransportNetwork(), this.getTransportInfrastructure(), null, "transportNetwork", null, 1, 1, DemandExchangeRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemandExchangeRoot_Network(), theNetworkPackage.getRoadNetwork(), null, "network", null, 1, 1, DemandExchangeRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionExchangeRootEClass, SolutionExchangeRoot.class, "SolutionExchangeRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionExchangeRoot_Solution(), this.getSolution(), null, "solution", null, 1, 1, SolutionExchangeRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LogiToppMetamodelPackageImpl
