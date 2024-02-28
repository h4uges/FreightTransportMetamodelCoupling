/**
 */
package CommonFreightTransportMetamodel.results.impl;

import CommonFreightTransportMetamodel.coupling.CouplingPackage;

import CommonFreightTransportMetamodel.coupling.impl.CouplingPackageImpl;

import CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage;

import CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl;

import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;

import CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;

import CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;

import CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl;

import CommonFreightTransportMetamodel.network.NetworkPackage;

import CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl;

import CommonFreightTransportMetamodel.results.ExecutedTour;
import CommonFreightTransportMetamodel.results.FailedDeliveryAttempt;
import CommonFreightTransportMetamodel.results.FailedPickupAttempt;
import CommonFreightTransportMetamodel.results.InitialFailedDeliveryAttempt;
import CommonFreightTransportMetamodel.results.ResultDeliveryExit;
import CommonFreightTransportMetamodel.results.ResultPickUpEntry;
import CommonFreightTransportMetamodel.results.Results;
import CommonFreightTransportMetamodel.results.ResultsFactory;
import CommonFreightTransportMetamodel.results.ResultsPackage;
import CommonFreightTransportMetamodel.results.TourStopMapping;

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
public class ResultsPackageImpl extends EPackageImpl implements ResultsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failedPickupAttemptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failedDeliveryAttemptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialFailedDeliveryAttemptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultDeliveryExitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultPickUpEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executedTourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tourStopMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsEClass = null;

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
	 * @see CommonFreightTransportMetamodel.results.ResultsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResultsPackageImpl() {
		super(eNS_URI, ResultsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResultsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResultsPackage init() {
		if (isInited) return (ResultsPackage)EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResultsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ResultsPackageImpl theResultsPackage = registeredResultsPackage instanceof ResultsPackageImpl ? (ResultsPackageImpl)registeredResultsPackage : new ResultsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticDemandPackage.eNS_URI);
		LogisticDemandPackageImpl theLogisticDemandPackage = (LogisticDemandPackageImpl)(registeredPackage instanceof LogisticDemandPackageImpl ? registeredPackage : LogisticDemandPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(registeredPackage instanceof UtilsPackageImpl ? registeredPackage : UtilsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LocalEntitiesPackage.eNS_URI);
		LocalEntitiesPackageImpl theLocalEntitiesPackage = (LocalEntitiesPackageImpl)(registeredPackage instanceof LocalEntitiesPackageImpl ? registeredPackage : LocalEntitiesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticNetworkPackage.eNS_URI);
		LogisticNetworkPackageImpl theLogisticNetworkPackage = (LogisticNetworkPackageImpl)(registeredPackage instanceof LogisticNetworkPackageImpl ? registeredPackage : LogisticNetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticSolutionPackage.eNS_URI);
		LogisticSolutionPackageImpl theLogisticSolutionPackage = (LogisticSolutionPackageImpl)(registeredPackage instanceof LogisticSolutionPackageImpl ? registeredPackage : LogisticSolutionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CouplingPackage.eNS_URI);
		CouplingPackageImpl theCouplingPackage = (CouplingPackageImpl)(registeredPackage instanceof CouplingPackageImpl ? registeredPackage : CouplingPackage.eINSTANCE);

		// Create package meta-data objects
		theResultsPackage.createPackageContents();
		theLogisticDemandPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theLocalEntitiesPackage.createPackageContents();
		theLogisticNetworkPackage.createPackageContents();
		theLogisticSolutionPackage.createPackageContents();
		theCouplingPackage.createPackageContents();

		// Initialize created meta-data
		theResultsPackage.initializePackageContents();
		theLogisticDemandPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theLocalEntitiesPackage.initializePackageContents();
		theLogisticNetworkPackage.initializePackageContents();
		theLogisticSolutionPackage.initializePackageContents();
		theCouplingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResultsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResultsPackage.eNS_URI, theResultsPackage);
		return theResultsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFailedPickupAttempt() {
		return failedPickupAttemptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFailedDeliveryAttempt() {
		return failedDeliveryAttemptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFailedDeliveryAttempt_FailedDeliveryLocation() {
		return (EReference)failedDeliveryAttemptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFailedDeliveryAttempt_FailedDeliveryFacility() {
		return (EReference)failedDeliveryAttemptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialFailedDeliveryAttempt() {
		return initialFailedDeliveryAttemptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultDeliveryExit() {
		return resultDeliveryExitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultDeliveryExit_FailedPickUpAttempts() {
		return (EReference)resultDeliveryExitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultPickUpEntry() {
		return resultPickUpEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultPickUpEntry_FailedPickUpAttempts() {
		return (EReference)resultPickUpEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutedTour() {
		return executedTourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutedTour_PlannedTour() {
		return (EReference)executedTourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutedTour_Mappings() {
		return (EReference)executedTourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTourStopMapping() {
		return tourStopMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTourStopMapping_PlannedStop() {
		return (EReference)tourStopMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTourStopMapping_ExecutedStop() {
		return (EReference)tourStopMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResults() {
		return resultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResults_ShipmentRecords() {
		return (EReference)resultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResults_ExecutedTours() {
		return (EReference)resultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsFactory getResultsFactory() {
		return (ResultsFactory)getEFactoryInstance();
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
		failedPickupAttemptEClass = createEClass(FAILED_PICKUP_ATTEMPT);

		failedDeliveryAttemptEClass = createEClass(FAILED_DELIVERY_ATTEMPT);
		createEReference(failedDeliveryAttemptEClass, FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_LOCATION);
		createEReference(failedDeliveryAttemptEClass, FAILED_DELIVERY_ATTEMPT__FAILED_DELIVERY_FACILITY);

		initialFailedDeliveryAttemptEClass = createEClass(INITIAL_FAILED_DELIVERY_ATTEMPT);

		resultDeliveryExitEClass = createEClass(RESULT_DELIVERY_EXIT);
		createEReference(resultDeliveryExitEClass, RESULT_DELIVERY_EXIT__FAILED_PICK_UP_ATTEMPTS);

		resultPickUpEntryEClass = createEClass(RESULT_PICK_UP_ENTRY);
		createEReference(resultPickUpEntryEClass, RESULT_PICK_UP_ENTRY__FAILED_PICK_UP_ATTEMPTS);

		executedTourEClass = createEClass(EXECUTED_TOUR);
		createEReference(executedTourEClass, EXECUTED_TOUR__PLANNED_TOUR);
		createEReference(executedTourEClass, EXECUTED_TOUR__MAPPINGS);

		tourStopMappingEClass = createEClass(TOUR_STOP_MAPPING);
		createEReference(tourStopMappingEClass, TOUR_STOP_MAPPING__PLANNED_STOP);
		createEReference(tourStopMappingEClass, TOUR_STOP_MAPPING__EXECUTED_STOP);

		resultsEClass = createEClass(RESULTS);
		createEReference(resultsEClass, RESULTS__SHIPMENT_RECORDS);
		createEReference(resultsEClass, RESULTS__EXECUTED_TOURS);
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
		LogisticSolutionPackage theLogisticSolutionPackage = (LogisticSolutionPackage)EPackage.Registry.INSTANCE.getEPackage(LogisticSolutionPackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		LogisticNetworkPackage theLogisticNetworkPackage = (LogisticNetworkPackage)EPackage.Registry.INSTANCE.getEPackage(LogisticNetworkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		failedPickupAttemptEClass.getESuperTypes().add(theLogisticSolutionPackage.getShipmentRecordEntry());
		failedDeliveryAttemptEClass.getESuperTypes().add(theLogisticSolutionPackage.getShipmentRecordEntry());
		initialFailedDeliveryAttemptEClass.getESuperTypes().add(this.getFailedDeliveryAttempt());
		resultDeliveryExitEClass.getESuperTypes().add(theLogisticSolutionPackage.getDeliveryExit());
		resultPickUpEntryEClass.getESuperTypes().add(theLogisticSolutionPackage.getPickUpEntry());
		executedTourEClass.getESuperTypes().add(theLogisticSolutionPackage.getTour());

		// Initialize classes, features, and operations; add parameters
		initEClass(failedPickupAttemptEClass, FailedPickupAttempt.class, "FailedPickupAttempt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(failedDeliveryAttemptEClass, FailedDeliveryAttempt.class, "FailedDeliveryAttempt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailedDeliveryAttempt_FailedDeliveryLocation(), theNetworkPackage.getLocation_(), null, "failedDeliveryLocation", null, 1, 1, FailedDeliveryAttempt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailedDeliveryAttempt_FailedDeliveryFacility(), theLogisticNetworkPackage.getLogisticFacility(), null, "failedDeliveryFacility", null, 0, 1, FailedDeliveryAttempt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialFailedDeliveryAttemptEClass, InitialFailedDeliveryAttempt.class, "InitialFailedDeliveryAttempt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultDeliveryExitEClass, ResultDeliveryExit.class, "ResultDeliveryExit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultDeliveryExit_FailedPickUpAttempts(), this.getFailedDeliveryAttempt(), null, "failedPickUpAttempts", null, 0, -1, ResultDeliveryExit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultPickUpEntryEClass, ResultPickUpEntry.class, "ResultPickUpEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultPickUpEntry_FailedPickUpAttempts(), this.getFailedPickupAttempt(), null, "failedPickUpAttempts", null, 0, -1, ResultPickUpEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executedTourEClass, ExecutedTour.class, "ExecutedTour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutedTour_PlannedTour(), theLogisticSolutionPackage.getPlannedTour(), null, "plannedTour", null, 1, 1, ExecutedTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedTour_Mappings(), this.getTourStopMapping(), null, "mappings", null, 0, -1, ExecutedTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tourStopMappingEClass, TourStopMapping.class, "TourStopMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTourStopMapping_PlannedStop(), theLogisticSolutionPackage.getStop(), null, "plannedStop", null, 1, 1, TourStopMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTourStopMapping_ExecutedStop(), theLogisticSolutionPackage.getStop(), null, "executedStop", null, 0, 1, TourStopMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultsEClass, Results.class, "Results", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResults_ShipmentRecords(), theLogisticSolutionPackage.getShipmentRecord(), null, "shipmentRecords", null, 0, -1, Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResults_ExecutedTours(), this.getExecutedTour(), null, "executedTours", null, 0, -1, Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ResultsPackageImpl
