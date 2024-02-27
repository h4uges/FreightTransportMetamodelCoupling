/**
 */
package CommonFreightTransportMetamodel.localEntities.impl;

import CommonFreightTransportMetamodel.coupling.CouplingPackage;

import CommonFreightTransportMetamodel.coupling.impl.CouplingPackageImpl;

import CommonFreightTransportMetamodel.localEntities.Business;
import CommonFreightTransportMetamodel.localEntities.BusinessBranch;
import CommonFreightTransportMetamodel.localEntities.Household;
import CommonFreightTransportMetamodel.localEntities.LocalEntitiesFactory;
import CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage;
import CommonFreightTransportMetamodel.localEntities.Person;
import CommonFreightTransportMetamodel.localEntities.Population;
import CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer;

import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;

import CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;

import CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;

import CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl;

import CommonFreightTransportMetamodel.network.NetworkPackage;

import CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl;

import CommonFreightTransportMetamodel.results.ResultsPackage;

import CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl;

import CommonFreightTransportMetamodel.utils.UtilsPackage;

import CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl;

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
public class LocalEntitiesPackageImpl extends EPackageImpl implements LocalEntitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

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
	private EClass businessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentConsumerProducerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass householdEClass = null;

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
	 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LocalEntitiesPackageImpl() {
		super(eNS_URI, LocalEntitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LocalEntitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LocalEntitiesPackage init() {
		if (isInited) return (LocalEntitiesPackage)EPackage.Registry.INSTANCE.getEPackage(LocalEntitiesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLocalEntitiesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LocalEntitiesPackageImpl theLocalEntitiesPackage = registeredLocalEntitiesPackage instanceof LocalEntitiesPackageImpl ? (LocalEntitiesPackageImpl)registeredLocalEntitiesPackage : new LocalEntitiesPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticDemandPackage.eNS_URI);
		LogisticDemandPackageImpl theLogisticDemandPackage = (LogisticDemandPackageImpl)(registeredPackage instanceof LogisticDemandPackageImpl ? registeredPackage : LogisticDemandPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(registeredPackage instanceof UtilsPackageImpl ? registeredPackage : UtilsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticNetworkPackage.eNS_URI);
		LogisticNetworkPackageImpl theLogisticNetworkPackage = (LogisticNetworkPackageImpl)(registeredPackage instanceof LogisticNetworkPackageImpl ? registeredPackage : LogisticNetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticSolutionPackage.eNS_URI);
		LogisticSolutionPackageImpl theLogisticSolutionPackage = (LogisticSolutionPackageImpl)(registeredPackage instanceof LogisticSolutionPackageImpl ? registeredPackage : LogisticSolutionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(registeredPackage instanceof ResultsPackageImpl ? registeredPackage : ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CouplingPackage.eNS_URI);
		CouplingPackageImpl theCouplingPackage = (CouplingPackageImpl)(registeredPackage instanceof CouplingPackageImpl ? registeredPackage : CouplingPackage.eINSTANCE);

		// Create package meta-data objects
		theLocalEntitiesPackage.createPackageContents();
		theLogisticDemandPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theLogisticNetworkPackage.createPackageContents();
		theLogisticSolutionPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theCouplingPackage.createPackageContents();

		// Initialize created meta-data
		theLocalEntitiesPackage.initializePackageContents();
		theLogisticDemandPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theLogisticNetworkPackage.initializePackageContents();
		theLogisticSolutionPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theCouplingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLocalEntitiesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LocalEntitiesPackage.eNS_URI, theLocalEntitiesPackage);
		return theLocalEntitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessBranch() {
		return businessBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessBranch_Location() {
		return (EReference)businessBranchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessBranch_OpeningHours() {
		return (EReference)businessBranchEClass.getEStructuralFeatures().get(1);
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
	public EReference getPerson_Household() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
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
	public EClass getBusiness() {
		return businessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusiness_Branches() {
		return (EReference)businessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentConsumerProducer() {
		return shipmentConsumerProducerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHousehold() {
		return householdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHousehold_Location() {
		return (EReference)householdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHousehold_Member() {
		return (EReference)householdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalEntitiesFactory getLocalEntitiesFactory() {
		return (LocalEntitiesFactory)getEFactoryInstance();
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
		businessBranchEClass = createEClass(BUSINESS_BRANCH);
		createEReference(businessBranchEClass, BUSINESS_BRANCH__LOCATION);
		createEReference(businessBranchEClass, BUSINESS_BRANCH__OPENING_HOURS);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__HOUSEHOLD);

		populationEClass = createEClass(POPULATION);
		createEReference(populationEClass, POPULATION__HOUSEHOLDS);
		createEReference(populationEClass, POPULATION__BUSINESSES);

		businessEClass = createEClass(BUSINESS);
		createEReference(businessEClass, BUSINESS__BRANCHES);

		shipmentConsumerProducerEClass = createEClass(SHIPMENT_CONSUMER_PRODUCER);

		householdEClass = createEClass(HOUSEHOLD);
		createEReference(householdEClass, HOUSEHOLD__LOCATION);
		createEReference(householdEClass, HOUSEHOLD__MEMBER);
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
		UtilsPackage theUtilsPackage = (UtilsPackage)EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		businessBranchEClass.getESuperTypes().add(this.getShipmentConsumerProducer());
		businessBranchEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		businessBranchEClass.getESuperTypes().add(theUtilsPackage.getShipmentlLegStartEndPoint());
		personEClass.getESuperTypes().add(this.getShipmentConsumerProducer());
		personEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		businessEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		householdEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		householdEClass.getESuperTypes().add(theUtilsPackage.getShipmentlLegStartEndPoint());

		// Initialize classes, features, and operations; add parameters
		initEClass(businessBranchEClass, BusinessBranch.class, "BusinessBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessBranch_Location(), theNetworkPackage.getLocation_(), null, "location", null, 1, 1, BusinessBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessBranch_OpeningHours(), theUtilsPackage.getTimeWindow_(), null, "openingHours", null, 1, -1, BusinessBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Household(), this.getHousehold(), this.getHousehold_Member(), "household", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(populationEClass, Population.class, "Population", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPopulation_Households(), this.getHousehold(), null, "households", null, 0, -1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPopulation_Businesses(), this.getBusiness(), null, "businesses", null, 0, -1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessEClass, Business.class, "Business", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusiness_Branches(), this.getBusinessBranch(), null, "branches", null, 1, -1, Business.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentConsumerProducerEClass, ShipmentConsumerProducer.class, "ShipmentConsumerProducer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(householdEClass, Household.class, "Household", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHousehold_Location(), theNetworkPackage.getLocation_(), null, "location", null, 1, 1, Household.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHousehold_Member(), this.getPerson(), this.getPerson_Household(), "member", null, 0, -1, Household.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LocalEntitiesPackageImpl
