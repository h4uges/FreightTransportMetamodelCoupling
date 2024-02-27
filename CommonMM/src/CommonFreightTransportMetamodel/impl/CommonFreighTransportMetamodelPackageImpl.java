/**
 */
package CommonFreightTransportMetamodel.impl;

import CommonFreightTransportMetamodel.CommonFreighTransportMetamodelFactory;
import CommonFreightTransportMetamodel.CommonFreighTransportMetamodelPackage;
import CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot;

import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;

import CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;

import CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;

import CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl;

import CommonFreightTransportMetamodel.network.NetworkPackage;

import CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl;

import CommonFreightTransportMetamodel.population.PopulationPackage;

import CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl;

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
public class CommonFreighTransportMetamodelPackageImpl extends EPackageImpl implements CommonFreighTransportMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonFreightTransportMetamodelRootEClass = null;

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
	 * @see CommonFreightTransportMetamodel.CommonFreighTransportMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonFreighTransportMetamodelPackageImpl() {
		super(eNS_URI, CommonFreighTransportMetamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonFreighTransportMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonFreighTransportMetamodelPackage init() {
		if (isInited) return (CommonFreighTransportMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(CommonFreighTransportMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommonFreighTransportMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommonFreighTransportMetamodelPackageImpl theCommonFreighTransportMetamodelPackage = registeredCommonFreighTransportMetamodelPackage instanceof CommonFreighTransportMetamodelPackageImpl ? (CommonFreighTransportMetamodelPackageImpl)registeredCommonFreighTransportMetamodelPackage : new CommonFreighTransportMetamodelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticDemandPackage.eNS_URI);
		LogisticDemandPackageImpl theLogisticDemandPackage = (LogisticDemandPackageImpl)(registeredPackage instanceof LogisticDemandPackageImpl ? registeredPackage : LogisticDemandPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(registeredPackage instanceof UtilsPackageImpl ? registeredPackage : UtilsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PopulationPackage.eNS_URI);
		PopulationPackageImpl thePopulationPackage = (PopulationPackageImpl)(registeredPackage instanceof PopulationPackageImpl ? registeredPackage : PopulationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticNetworkPackage.eNS_URI);
		LogisticNetworkPackageImpl theLogisticNetworkPackage = (LogisticNetworkPackageImpl)(registeredPackage instanceof LogisticNetworkPackageImpl ? registeredPackage : LogisticNetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticSolutionPackage.eNS_URI);
		LogisticSolutionPackageImpl theLogisticSolutionPackage = (LogisticSolutionPackageImpl)(registeredPackage instanceof LogisticSolutionPackageImpl ? registeredPackage : LogisticSolutionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(registeredPackage instanceof ResultsPackageImpl ? registeredPackage : ResultsPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonFreighTransportMetamodelPackage.createPackageContents();
		theLogisticDemandPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		thePopulationPackage.createPackageContents();
		theLogisticNetworkPackage.createPackageContents();
		theLogisticSolutionPackage.createPackageContents();
		theResultsPackage.createPackageContents();

		// Initialize created meta-data
		theCommonFreighTransportMetamodelPackage.initializePackageContents();
		theLogisticDemandPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		thePopulationPackage.initializePackageContents();
		theLogisticNetworkPackage.initializePackageContents();
		theLogisticSolutionPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonFreighTransportMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonFreighTransportMetamodelPackage.eNS_URI, theCommonFreighTransportMetamodelPackage);
		return theCommonFreighTransportMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommonFreightTransportMetamodelRoot() {
		return commonFreightTransportMetamodelRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommonFreightTransportMetamodelRoot_Network() {
		return (EReference)commonFreightTransportMetamodelRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommonFreightTransportMetamodelRoot_Population() {
		return (EReference)commonFreightTransportMetamodelRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommonFreightTransportMetamodelRoot_LogisticNetwork() {
		return (EReference)commonFreightTransportMetamodelRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommonFreightTransportMetamodelRoot_Demand() {
		return (EReference)commonFreightTransportMetamodelRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommonFreightTransportMetamodelRoot_LogisticSolution() {
		return (EReference)commonFreightTransportMetamodelRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonFreighTransportMetamodelFactory getCommonFreighTransportMetamodelFactory() {
		return (CommonFreighTransportMetamodelFactory)getEFactoryInstance();
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
		commonFreightTransportMetamodelRootEClass = createEClass(COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT);
		createEReference(commonFreightTransportMetamodelRootEClass, COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK);
		createEReference(commonFreightTransportMetamodelRootEClass, COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION);
		createEReference(commonFreightTransportMetamodelRootEClass, COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK);
		createEReference(commonFreightTransportMetamodelRootEClass, COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND);
		createEReference(commonFreightTransportMetamodelRootEClass, COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION);
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
		LogisticDemandPackage theLogisticDemandPackage = (LogisticDemandPackage)EPackage.Registry.INSTANCE.getEPackage(LogisticDemandPackage.eNS_URI);
		UtilsPackage theUtilsPackage = (UtilsPackage)EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		PopulationPackage thePopulationPackage = (PopulationPackage)EPackage.Registry.INSTANCE.getEPackage(PopulationPackage.eNS_URI);
		LogisticNetworkPackage theLogisticNetworkPackage = (LogisticNetworkPackage)EPackage.Registry.INSTANCE.getEPackage(LogisticNetworkPackage.eNS_URI);
		LogisticSolutionPackage theLogisticSolutionPackage = (LogisticSolutionPackage)EPackage.Registry.INSTANCE.getEPackage(LogisticSolutionPackage.eNS_URI);
		ResultsPackage theResultsPackage = (ResultsPackage)EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theLogisticDemandPackage);
		getESubpackages().add(theUtilsPackage);
		getESubpackages().add(theNetworkPackage);
		getESubpackages().add(thePopulationPackage);
		getESubpackages().add(theLogisticNetworkPackage);
		getESubpackages().add(theLogisticSolutionPackage);
		getESubpackages().add(theResultsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(commonFreightTransportMetamodelRootEClass, CommonFreightTransportMetamodelRoot.class, "CommonFreightTransportMetamodelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommonFreightTransportMetamodelRoot_Network(), theNetworkPackage.getNetwork(), null, "network", null, 1, 1, CommonFreightTransportMetamodelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonFreightTransportMetamodelRoot_Population(), thePopulationPackage.getPopulation(), null, "population", null, 1, 1, CommonFreightTransportMetamodelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonFreightTransportMetamodelRoot_LogisticNetwork(), theLogisticNetworkPackage.getLogisticNetwork(), null, "logisticNetwork", null, 1, 1, CommonFreightTransportMetamodelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonFreightTransportMetamodelRoot_Demand(), theLogisticDemandPackage.getDemand(), null, "demand", null, 1, 1, CommonFreightTransportMetamodelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonFreightTransportMetamodelRoot_LogisticSolution(), theLogisticSolutionPackage.getLogisticSolution(), null, "logisticSolution", null, 0, 1, CommonFreightTransportMetamodelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CommonFreighTransportMetamodelPackageImpl
