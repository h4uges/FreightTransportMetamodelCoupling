/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.coupling.CouplingPackage;

import CommonFreightTransportMetamodel.coupling.impl.CouplingPackageImpl;

import CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage;

import CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl;

import CommonFreightTransportMetamodel.logisticDemand.Demand;
import CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipment;
import CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase;
import CommonFreightTransportMetamodel.logisticDemand.FromOutsideStudyAreaShipment;
import CommonFreightTransportMetamodel.logisticDemand.InsideToInsideShipment;
import CommonFreightTransportMetamodel.logisticDemand.InsideToOutsideShipment;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandFactory;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;
import CommonFreightTransportMetamodel.logisticDemand.OutsideToInsideShipment;
import CommonFreightTransportMetamodel.logisticDemand.Shipment;
import CommonFreightTransportMetamodel.logisticDemand.SplittedShipment;
import CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment;
import CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase;
import CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment;

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
public class LogisticDemandPackageImpl extends EPackageImpl implements LogisticDemandPackage {
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
	private EClass fromOutsideStudyAreaShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromInsideStudyAreaShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toOutsideStudyAreaShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toInsideStudyAreaShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outsideToInsideShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insideToInsideShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insideToOutsideShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splittedShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromInsideStudyAreaShipmentBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toInsideStudyAreaShipmentBaseEClass = null;

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
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogisticDemandPackageImpl() {
		super(eNS_URI, LogisticDemandFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogisticDemandPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogisticDemandPackage init() {
		if (isInited) return (LogisticDemandPackage)EPackage.Registry.INSTANCE.getEPackage(LogisticDemandPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogisticDemandPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogisticDemandPackageImpl theLogisticDemandPackage = registeredLogisticDemandPackage instanceof LogisticDemandPackageImpl ? (LogisticDemandPackageImpl)registeredLogisticDemandPackage : new LogisticDemandPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(registeredPackage instanceof UtilsPackageImpl ? registeredPackage : UtilsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LocalEntitiesPackage.eNS_URI);
		LocalEntitiesPackageImpl theLocalEntitiesPackage = (LocalEntitiesPackageImpl)(registeredPackage instanceof LocalEntitiesPackageImpl ? registeredPackage : LocalEntitiesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticNetworkPackage.eNS_URI);
		LogisticNetworkPackageImpl theLogisticNetworkPackage = (LogisticNetworkPackageImpl)(registeredPackage instanceof LogisticNetworkPackageImpl ? registeredPackage : LogisticNetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticSolutionPackage.eNS_URI);
		LogisticSolutionPackageImpl theLogisticSolutionPackage = (LogisticSolutionPackageImpl)(registeredPackage instanceof LogisticSolutionPackageImpl ? registeredPackage : LogisticSolutionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(registeredPackage instanceof ResultsPackageImpl ? registeredPackage : ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CouplingPackage.eNS_URI);
		CouplingPackageImpl theCouplingPackage = (CouplingPackageImpl)(registeredPackage instanceof CouplingPackageImpl ? registeredPackage : CouplingPackage.eINSTANCE);

		// Create package meta-data objects
		theLogisticDemandPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theLocalEntitiesPackage.createPackageContents();
		theLogisticNetworkPackage.createPackageContents();
		theLogisticSolutionPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theCouplingPackage.createPackageContents();

		// Initialize created meta-data
		theLogisticDemandPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theLocalEntitiesPackage.initializePackageContents();
		theLogisticNetworkPackage.initializePackageContents();
		theLogisticSolutionPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theCouplingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogisticDemandPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogisticDemandPackage.eNS_URI, theLogisticDemandPackage);
		return theLogisticDemandPackage;
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
	public EReference getDemand_Shipments() {
		return (EReference)demandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFromOutsideStudyAreaShipment() {
		return fromOutsideStudyAreaShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFromOutsideStudyAreaShipment_ArrivalAtOriginDepot() {
		return (EReference)fromOutsideStudyAreaShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFromInsideStudyAreaShipment() {
		return fromInsideStudyAreaShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFromInsideStudyAreaShipment_Producer() {
		return (EReference)fromInsideStudyAreaShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToOutsideStudyAreaShipment() {
		return toOutsideStudyAreaShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToOutsideStudyAreaShipment_ArrivalAtDepotTimeWindow() {
		return (EReference)toOutsideStudyAreaShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToInsideStudyAreaShipment() {
		return toInsideStudyAreaShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToInsideStudyAreaShipment_Receiver() {
		return (EReference)toInsideStudyAreaShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutsideToInsideShipment() {
		return outsideToInsideShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInsideToInsideShipment() {
		return insideToInsideShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInsideToOutsideShipment() {
		return insideToOutsideShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipment() {
		return shipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipment_ResponsibleCEPSP() {
		return (EReference)shipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipment_Size() {
		return (EReference)shipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSplittedShipment() {
		return splittedShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSplittedShipment_OriginalId() {
		return (EAttribute)splittedShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFromInsideStudyAreaShipmentBase() {
		return fromInsideStudyAreaShipmentBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFromInsideStudyAreaShipmentBase_Origin() {
		return (EReference)fromInsideStudyAreaShipmentBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFromInsideStudyAreaShipmentBase_ArrivalAtOrigin() {
		return (EReference)fromInsideStudyAreaShipmentBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToInsideStudyAreaShipmentBase() {
		return toInsideStudyAreaShipmentBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToInsideStudyAreaShipmentBase_ArrivalAtDestinationTimeWindow() {
		return (EReference)toInsideStudyAreaShipmentBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToInsideStudyAreaShipmentBase_Destination() {
		return (EReference)toInsideStudyAreaShipmentBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticDemandFactory getLogisticDemandFactory() {
		return (LogisticDemandFactory)getEFactoryInstance();
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
		createEReference(demandEClass, DEMAND__SHIPMENTS);

		fromOutsideStudyAreaShipmentEClass = createEClass(FROM_OUTSIDE_STUDY_AREA_SHIPMENT);
		createEReference(fromOutsideStudyAreaShipmentEClass, FROM_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_ORIGIN_DEPOT);

		fromInsideStudyAreaShipmentEClass = createEClass(FROM_INSIDE_STUDY_AREA_SHIPMENT);
		createEReference(fromInsideStudyAreaShipmentEClass, FROM_INSIDE_STUDY_AREA_SHIPMENT__PRODUCER);

		toOutsideStudyAreaShipmentEClass = createEClass(TO_OUTSIDE_STUDY_AREA_SHIPMENT);
		createEReference(toOutsideStudyAreaShipmentEClass, TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW);

		toInsideStudyAreaShipmentEClass = createEClass(TO_INSIDE_STUDY_AREA_SHIPMENT);
		createEReference(toInsideStudyAreaShipmentEClass, TO_INSIDE_STUDY_AREA_SHIPMENT__RECEIVER);

		outsideToInsideShipmentEClass = createEClass(OUTSIDE_TO_INSIDE_SHIPMENT);

		insideToInsideShipmentEClass = createEClass(INSIDE_TO_INSIDE_SHIPMENT);

		insideToOutsideShipmentEClass = createEClass(INSIDE_TO_OUTSIDE_SHIPMENT);

		shipmentEClass = createEClass(SHIPMENT);
		createEReference(shipmentEClass, SHIPMENT__RESPONSIBLE_CEPSP);
		createEReference(shipmentEClass, SHIPMENT__SIZE);

		splittedShipmentEClass = createEClass(SPLITTED_SHIPMENT);
		createEAttribute(splittedShipmentEClass, SPLITTED_SHIPMENT__ORIGINAL_ID);

		fromInsideStudyAreaShipmentBaseEClass = createEClass(FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE);
		createEReference(fromInsideStudyAreaShipmentBaseEClass, FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN);
		createEReference(fromInsideStudyAreaShipmentBaseEClass, FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN);

		toInsideStudyAreaShipmentBaseEClass = createEClass(TO_INSIDE_STUDY_AREA_SHIPMENT_BASE);
		createEReference(toInsideStudyAreaShipmentBaseEClass, TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW);
		createEReference(toInsideStudyAreaShipmentBaseEClass, TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION);
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
		LocalEntitiesPackage theLocalEntitiesPackage = (LocalEntitiesPackage)EPackage.Registry.INSTANCE.getEPackage(LocalEntitiesPackage.eNS_URI);
		LogisticNetworkPackage theLogisticNetworkPackage = (LogisticNetworkPackage)EPackage.Registry.INSTANCE.getEPackage(LogisticNetworkPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fromInsideStudyAreaShipmentEClass.getESuperTypes().add(this.getFromInsideStudyAreaShipmentBase());
		toInsideStudyAreaShipmentEClass.getESuperTypes().add(this.getToInsideStudyAreaShipmentBase());
		outsideToInsideShipmentEClass.getESuperTypes().add(this.getFromOutsideStudyAreaShipment());
		outsideToInsideShipmentEClass.getESuperTypes().add(this.getToInsideStudyAreaShipment());
		outsideToInsideShipmentEClass.getESuperTypes().add(this.getShipment());
		insideToInsideShipmentEClass.getESuperTypes().add(this.getFromInsideStudyAreaShipment());
		insideToInsideShipmentEClass.getESuperTypes().add(this.getToInsideStudyAreaShipment());
		insideToInsideShipmentEClass.getESuperTypes().add(this.getShipment());
		insideToOutsideShipmentEClass.getESuperTypes().add(this.getFromInsideStudyAreaShipment());
		insideToOutsideShipmentEClass.getESuperTypes().add(this.getToOutsideStudyAreaShipment());
		insideToOutsideShipmentEClass.getESuperTypes().add(this.getShipment());
		shipmentEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		splittedShipmentEClass.getESuperTypes().add(this.getShipment());
		splittedShipmentEClass.getESuperTypes().add(this.getToInsideStudyAreaShipmentBase());
		splittedShipmentEClass.getESuperTypes().add(this.getFromInsideStudyAreaShipmentBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(demandEClass, Demand.class, "Demand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDemand_Shipments(), this.getShipment(), null, "shipments", null, 0, -1, Demand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromOutsideStudyAreaShipmentEClass, FromOutsideStudyAreaShipment.class, "FromOutsideStudyAreaShipment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromOutsideStudyAreaShipment_ArrivalAtOriginDepot(), theUtilsPackage.getTimestamp_(), null, "arrivalAtOriginDepot", null, 1, 1, FromOutsideStudyAreaShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromInsideStudyAreaShipmentEClass, FromInsideStudyAreaShipment.class, "FromInsideStudyAreaShipment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromInsideStudyAreaShipment_Producer(), theLocalEntitiesPackage.getShipmentConsumerProducer(), null, "producer", null, 1, 1, FromInsideStudyAreaShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toOutsideStudyAreaShipmentEClass, ToOutsideStudyAreaShipment.class, "ToOutsideStudyAreaShipment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToOutsideStudyAreaShipment_ArrivalAtDepotTimeWindow(), theUtilsPackage.getTimeWindow_(), null, "arrivalAtDepotTimeWindow", null, 0, 1, ToOutsideStudyAreaShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toInsideStudyAreaShipmentEClass, ToInsideStudyAreaShipment.class, "ToInsideStudyAreaShipment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToInsideStudyAreaShipment_Receiver(), theLocalEntitiesPackage.getShipmentConsumerProducer(), null, "receiver", null, 1, 1, ToInsideStudyAreaShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outsideToInsideShipmentEClass, OutsideToInsideShipment.class, "OutsideToInsideShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(insideToInsideShipmentEClass, InsideToInsideShipment.class, "InsideToInsideShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(insideToOutsideShipmentEClass, InsideToOutsideShipment.class, "InsideToOutsideShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shipmentEClass, Shipment.class, "Shipment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipment_ResponsibleCEPSP(), theLogisticNetworkPackage.getCEPSP(), null, "responsibleCEPSP", null, 1, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipment_Size(), theUtilsPackage.getDimension(), null, "size", null, 1, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splittedShipmentEClass, SplittedShipment.class, "SplittedShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSplittedShipment_OriginalId(), theXMLTypePackage.getID(), "originalId", null, 1, 1, SplittedShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromInsideStudyAreaShipmentBaseEClass, FromInsideStudyAreaShipmentBase.class, "FromInsideStudyAreaShipmentBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromInsideStudyAreaShipmentBase_Origin(), theNetworkPackage.getLocation_(), null, "origin", null, 1, 1, FromInsideStudyAreaShipmentBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFromInsideStudyAreaShipmentBase_ArrivalAtOrigin(), theUtilsPackage.getTimestamp_(), null, "arrivalAtOrigin", null, 1, 1, FromInsideStudyAreaShipmentBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toInsideStudyAreaShipmentBaseEClass, ToInsideStudyAreaShipmentBase.class, "ToInsideStudyAreaShipmentBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToInsideStudyAreaShipmentBase_ArrivalAtDestinationTimeWindow(), theUtilsPackage.getTimeWindow_(), null, "arrivalAtDestinationTimeWindow", null, 0, 1, ToInsideStudyAreaShipmentBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToInsideStudyAreaShipmentBase_Destination(), theNetworkPackage.getLocation_(), null, "destination", null, 1, 1, ToInsideStudyAreaShipmentBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LogisticDemandPackageImpl
