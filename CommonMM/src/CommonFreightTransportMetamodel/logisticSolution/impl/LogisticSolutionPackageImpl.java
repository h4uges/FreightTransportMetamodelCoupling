/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.coupling.CouplingPackage;
import CommonFreightTransportMetamodel.coupling.impl.CouplingPackageImpl;
import CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage;
import CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;

import CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;

import CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl;

import CommonFreightTransportMetamodel.logisticSolution.CustomStopLocation;
import CommonFreightTransportMetamodel.logisticSolution.DeliveryExit;
import CommonFreightTransportMetamodel.logisticSolution.LogisticFacilityStop;
import CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry;
import CommonFreightTransportMetamodel.logisticSolution.LogisticHubExit;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolution;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionFactory;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;
import CommonFreightTransportMetamodel.logisticSolution.NormalStop;
import CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop;
import CommonFreightTransportMetamodel.logisticSolution.PickUpEntry;
import CommonFreightTransportMetamodel.logisticSolution.PlannedTour;
import CommonFreightTransportMetamodel.logisticSolution.ReferenceStopLocation;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentExit;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;
import CommonFreightTransportMetamodel.logisticSolution.StartEndStop;
import CommonFreightTransportMetamodel.logisticSolution.Stop;
import CommonFreightTransportMetamodel.logisticSolution.StopLocation;
import CommonFreightTransportMetamodel.logisticSolution.Tour;

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
public class LogisticSolutionPackageImpl extends EPackageImpl implements LogisticSolutionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEndStopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pickUpDeliveryStopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticFacilityStopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentRecordEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentExitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticHubEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pickUpEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticHubExitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryExitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedTourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceStopLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customStopLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticSolutionEClass = null;

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
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogisticSolutionPackageImpl() {
		super(eNS_URI, LogisticSolutionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogisticSolutionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogisticSolutionPackage init() {
		if (isInited) return (LogisticSolutionPackage)EPackage.Registry.INSTANCE.getEPackage(LogisticSolutionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogisticSolutionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogisticSolutionPackageImpl theLogisticSolutionPackage = registeredLogisticSolutionPackage instanceof LogisticSolutionPackageImpl ? (LogisticSolutionPackageImpl)registeredLogisticSolutionPackage : new LogisticSolutionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(registeredPackage instanceof ResultsPackageImpl ? registeredPackage : ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CouplingPackage.eNS_URI);
		CouplingPackageImpl theCouplingPackage = (CouplingPackageImpl)(registeredPackage instanceof CouplingPackageImpl ? registeredPackage : CouplingPackage.eINSTANCE);

		// Create package meta-data objects
		theLogisticSolutionPackage.createPackageContents();
		theLogisticDemandPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theLocalEntitiesPackage.createPackageContents();
		theLogisticNetworkPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theCouplingPackage.createPackageContents();

		// Initialize created meta-data
		theLogisticSolutionPackage.initializePackageContents();
		theLogisticDemandPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theLocalEntitiesPackage.initializePackageContents();
		theLogisticNetworkPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theCouplingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogisticSolutionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogisticSolutionPackage.eNS_URI, theLogisticSolutionPackage);
		return theLogisticSolutionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTour() {
		return tourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTour_Stops() {
		return (EReference)tourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTour_Vehicle() {
		return (EReference)tourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStop() {
		return stopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStop_StopTimeWindow() {
		return (EReference)stopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStop_No() {
		return (EAttribute)stopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStop_StopLocation() {
		return (EReference)stopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentRecord() {
		return shipmentRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecord_Shipment() {
		return (EReference)shipmentRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecord_Entries() {
		return (EReference)shipmentRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecord_RepsonsibleCEPSP() {
		return (EReference)shipmentRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecord_Entry() {
		return (EReference)shipmentRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecord_Exit() {
		return (EReference)shipmentRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartEndStop() {
		return startEndStopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStartEndStop_Depot() {
		return (EReference)startEndStopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPickUpDeliveryStop() {
		return pickUpDeliveryStopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPickUpDeliveryStop_UnloadedShipments() {
		return (EReference)pickUpDeliveryStopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPickUpDeliveryStop_LoadedShipments() {
		return (EReference)pickUpDeliveryStopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogisticFacilityStop() {
		return logisticFacilityStopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogisticFacilityStop_LogisticFacility() {
		return (EReference)logisticFacilityStopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalStop() {
		return normalStopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentRecordEntry() {
		return shipmentRecordEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecordEntry_ExecutingCEPSP() {
		return (EReference)shipmentRecordEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRecordEntry_No() {
		return (EAttribute)shipmentRecordEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecordEntry_From() {
		return (EReference)shipmentRecordEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecordEntry_To() {
		return (EReference)shipmentRecordEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecordEntry_TimeWindow() {
		return (EReference)shipmentRecordEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecordEntry_FromSpec() {
		return (EReference)shipmentRecordEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecordEntry_ToSpec() {
		return (EReference)shipmentRecordEntryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentRecordEntry_Tour() {
		return (EReference)shipmentRecordEntryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentEntry() {
		return shipmentEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentEntry_Time() {
		return (EReference)shipmentEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentExit() {
		return shipmentExitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentExit_Time() {
		return (EReference)shipmentExitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogisticHubEntry() {
		return logisticHubEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogisticHubEntry_LogisticHub() {
		return (EReference)logisticHubEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPickUpEntry() {
		return pickUpEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPickUpEntry_PickUpLeg() {
		return (EReference)pickUpEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogisticHubExit() {
		return logisticHubExitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogisticHubExit_LogisticHub() {
		return (EReference)logisticHubExitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeliveryExit() {
		return deliveryExitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeliveryExit_DeliveryLeg() {
		return (EReference)deliveryExitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedTour() {
		return plannedTourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlannedTour_ExecutingCEPSP() {
		return (EReference)plannedTourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStopLocation() {
		return stopLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceStopLocation() {
		return referenceStopLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceStopLocation_Location() {
		return (EReference)referenceStopLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomStopLocation() {
		return customStopLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomStopLocation_Location() {
		return (EReference)customStopLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogisticSolution() {
		return logisticSolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogisticSolution_ShipmentRecords() {
		return (EReference)logisticSolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogisticSolution_Tours() {
		return (EReference)logisticSolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticSolutionFactory getLogisticSolutionFactory() {
		return (LogisticSolutionFactory)getEFactoryInstance();
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
		tourEClass = createEClass(TOUR);
		createEReference(tourEClass, TOUR__STOPS);
		createEReference(tourEClass, TOUR__VEHICLE);

		stopEClass = createEClass(STOP);
		createEReference(stopEClass, STOP__STOP_TIME_WINDOW);
		createEAttribute(stopEClass, STOP__NO);
		createEReference(stopEClass, STOP__STOP_LOCATION);

		shipmentRecordEClass = createEClass(SHIPMENT_RECORD);
		createEReference(shipmentRecordEClass, SHIPMENT_RECORD__SHIPMENT);
		createEReference(shipmentRecordEClass, SHIPMENT_RECORD__ENTRIES);
		createEReference(shipmentRecordEClass, SHIPMENT_RECORD__REPSONSIBLE_CEPSP);
		createEReference(shipmentRecordEClass, SHIPMENT_RECORD__ENTRY);
		createEReference(shipmentRecordEClass, SHIPMENT_RECORD__EXIT);

		startEndStopEClass = createEClass(START_END_STOP);
		createEReference(startEndStopEClass, START_END_STOP__DEPOT);

		pickUpDeliveryStopEClass = createEClass(PICK_UP_DELIVERY_STOP);
		createEReference(pickUpDeliveryStopEClass, PICK_UP_DELIVERY_STOP__UNLOADED_SHIPMENTS);
		createEReference(pickUpDeliveryStopEClass, PICK_UP_DELIVERY_STOP__LOADED_SHIPMENTS);

		logisticFacilityStopEClass = createEClass(LOGISTIC_FACILITY_STOP);
		createEReference(logisticFacilityStopEClass, LOGISTIC_FACILITY_STOP__LOGISTIC_FACILITY);

		normalStopEClass = createEClass(NORMAL_STOP);

		shipmentRecordEntryEClass = createEClass(SHIPMENT_RECORD_ENTRY);
		createEReference(shipmentRecordEntryEClass, SHIPMENT_RECORD_ENTRY__EXECUTING_CEPSP);
		createEAttribute(shipmentRecordEntryEClass, SHIPMENT_RECORD_ENTRY__NO);
		createEReference(shipmentRecordEntryEClass, SHIPMENT_RECORD_ENTRY__FROM);
		createEReference(shipmentRecordEntryEClass, SHIPMENT_RECORD_ENTRY__TO);
		createEReference(shipmentRecordEntryEClass, SHIPMENT_RECORD_ENTRY__TIME_WINDOW);
		createEReference(shipmentRecordEntryEClass, SHIPMENT_RECORD_ENTRY__FROM_SPEC);
		createEReference(shipmentRecordEntryEClass, SHIPMENT_RECORD_ENTRY__TO_SPEC);
		createEReference(shipmentRecordEntryEClass, SHIPMENT_RECORD_ENTRY__TOUR);

		shipmentEntryEClass = createEClass(SHIPMENT_ENTRY);
		createEReference(shipmentEntryEClass, SHIPMENT_ENTRY__TIME);

		shipmentExitEClass = createEClass(SHIPMENT_EXIT);
		createEReference(shipmentExitEClass, SHIPMENT_EXIT__TIME);

		logisticHubEntryEClass = createEClass(LOGISTIC_HUB_ENTRY);
		createEReference(logisticHubEntryEClass, LOGISTIC_HUB_ENTRY__LOGISTIC_HUB);

		pickUpEntryEClass = createEClass(PICK_UP_ENTRY);
		createEReference(pickUpEntryEClass, PICK_UP_ENTRY__PICK_UP_LEG);

		logisticHubExitEClass = createEClass(LOGISTIC_HUB_EXIT);
		createEReference(logisticHubExitEClass, LOGISTIC_HUB_EXIT__LOGISTIC_HUB);

		deliveryExitEClass = createEClass(DELIVERY_EXIT);
		createEReference(deliveryExitEClass, DELIVERY_EXIT__DELIVERY_LEG);

		plannedTourEClass = createEClass(PLANNED_TOUR);
		createEReference(plannedTourEClass, PLANNED_TOUR__EXECUTING_CEPSP);

		stopLocationEClass = createEClass(STOP_LOCATION);

		referenceStopLocationEClass = createEClass(REFERENCE_STOP_LOCATION);
		createEReference(referenceStopLocationEClass, REFERENCE_STOP_LOCATION__LOCATION);

		customStopLocationEClass = createEClass(CUSTOM_STOP_LOCATION);
		createEReference(customStopLocationEClass, CUSTOM_STOP_LOCATION__LOCATION);

		logisticSolutionEClass = createEClass(LOGISTIC_SOLUTION);
		createEReference(logisticSolutionEClass, LOGISTIC_SOLUTION__SHIPMENT_RECORDS);
		createEReference(logisticSolutionEClass, LOGISTIC_SOLUTION__TOURS);
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
		LogisticNetworkPackage theLogisticNetworkPackage = (LogisticNetworkPackage)EPackage.Registry.INSTANCE.getEPackage(LogisticNetworkPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		LogisticDemandPackage theLogisticDemandPackage = (LogisticDemandPackage)EPackage.Registry.INSTANCE.getEPackage(LogisticDemandPackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tourEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		stopEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		shipmentRecordEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		startEndStopEClass.getESuperTypes().add(this.getStop());
		pickUpDeliveryStopEClass.getESuperTypes().add(this.getStop());
		logisticFacilityStopEClass.getESuperTypes().add(this.getPickUpDeliveryStop());
		normalStopEClass.getESuperTypes().add(this.getPickUpDeliveryStop());
		shipmentRecordEntryEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		logisticHubEntryEClass.getESuperTypes().add(this.getShipmentEntry());
		pickUpEntryEClass.getESuperTypes().add(this.getShipmentEntry());
		logisticHubExitEClass.getESuperTypes().add(this.getShipmentExit());
		deliveryExitEClass.getESuperTypes().add(this.getShipmentExit());
		plannedTourEClass.getESuperTypes().add(this.getTour());
		referenceStopLocationEClass.getESuperTypes().add(this.getStopLocation());
		customStopLocationEClass.getESuperTypes().add(this.getStopLocation());

		// Initialize classes, features, and operations; add parameters
		initEClass(tourEClass, Tour.class, "Tour", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTour_Stops(), this.getStop(), null, "stops", null, 0, -1, Tour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTour_Vehicle(), theLogisticNetworkPackage.getVehicle(), null, "vehicle", null, 1, 1, Tour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopEClass, Stop.class, "Stop", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStop_StopTimeWindow(), theUtilsPackage.getTimeWindow_(), null, "stopTimeWindow", null, 1, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStop_No(), theXMLTypePackage.getInt(), "no", null, 1, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStop_StopLocation(), this.getStopLocation(), null, "stopLocation", null, 1, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentRecordEClass, ShipmentRecord.class, "ShipmentRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipmentRecord_Shipment(), theLogisticDemandPackage.getShipment(), null, "shipment", null, 1, 1, ShipmentRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentRecord_Entries(), this.getShipmentRecordEntry(), null, "entries", null, 0, -1, ShipmentRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentRecord_RepsonsibleCEPSP(), theLogisticNetworkPackage.getCEPSP(), null, "repsonsibleCEPSP", null, 1, 1, ShipmentRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentRecord_Entry(), this.getShipmentEntry(), null, "entry", null, 1, 1, ShipmentRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentRecord_Exit(), this.getShipmentExit(), null, "exit", null, 1, 1, ShipmentRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEndStopEClass, StartEndStop.class, "StartEndStop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartEndStop_Depot(), theLogisticNetworkPackage.getVehicleDepot(), null, "depot", null, 1, 1, StartEndStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pickUpDeliveryStopEClass, PickUpDeliveryStop.class, "PickUpDeliveryStop", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPickUpDeliveryStop_UnloadedShipments(), theLogisticDemandPackage.getShipment(), null, "unloadedShipments", null, 0, -1, PickUpDeliveryStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPickUpDeliveryStop_LoadedShipments(), theLogisticDemandPackage.getShipment(), null, "loadedShipments", null, 0, -1, PickUpDeliveryStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logisticFacilityStopEClass, LogisticFacilityStop.class, "LogisticFacilityStop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogisticFacilityStop_LogisticFacility(), theLogisticNetworkPackage.getLogisticFacility(), null, "logisticFacility", null, 1, 1, LogisticFacilityStop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalStopEClass, NormalStop.class, "NormalStop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shipmentRecordEntryEClass, ShipmentRecordEntry.class, "ShipmentRecordEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipmentRecordEntry_ExecutingCEPSP(), theLogisticNetworkPackage.getCEPSP(), null, "executingCEPSP", null, 1, 1, ShipmentRecordEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRecordEntry_No(), theXMLTypePackage.getInt(), "no", null, 1, 1, ShipmentRecordEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentRecordEntry_From(), theNetworkPackage.getLocation_(), null, "from", null, 1, 1, ShipmentRecordEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentRecordEntry_To(), theNetworkPackage.getLocation_(), null, "to", null, 1, 1, ShipmentRecordEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentRecordEntry_TimeWindow(), theUtilsPackage.getTimeWindow_(), null, "timeWindow", null, 1, 1, ShipmentRecordEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentRecordEntry_FromSpec(), theUtilsPackage.getShipmentlLegStartEndPoint(), null, "fromSpec", null, 1, 1, ShipmentRecordEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentRecordEntry_ToSpec(), theUtilsPackage.getShipmentlLegStartEndPoint(), null, "toSpec", null, 1, 1, ShipmentRecordEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentRecordEntry_Tour(), this.getTour(), null, "tour", null, 1, 1, ShipmentRecordEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentEntryEClass, ShipmentEntry.class, "ShipmentEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipmentEntry_Time(), theUtilsPackage.getTimestamp_(), null, "time", null, 1, 1, ShipmentEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentExitEClass, ShipmentExit.class, "ShipmentExit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipmentExit_Time(), theUtilsPackage.getTimestamp_(), null, "time", null, 1, 1, ShipmentExit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logisticHubEntryEClass, LogisticHubEntry.class, "LogisticHubEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogisticHubEntry_LogisticHub(), theLogisticNetworkPackage.getLogisticHub(), null, "logisticHub", null, 1, 1, LogisticHubEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pickUpEntryEClass, PickUpEntry.class, "PickUpEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPickUpEntry_PickUpLeg(), this.getShipmentRecordEntry(), null, "pickUpLeg", null, 1, 1, PickUpEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logisticHubExitEClass, LogisticHubExit.class, "LogisticHubExit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogisticHubExit_LogisticHub(), theLogisticNetworkPackage.getLogisticHub(), null, "logisticHub", null, 1, 1, LogisticHubExit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliveryExitEClass, DeliveryExit.class, "DeliveryExit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeliveryExit_DeliveryLeg(), this.getShipmentRecordEntry(), null, "deliveryLeg", null, 1, 1, DeliveryExit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plannedTourEClass, PlannedTour.class, "PlannedTour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlannedTour_ExecutingCEPSP(), theLogisticNetworkPackage.getCEPSP(), null, "executingCEPSP", null, 1, 1, PlannedTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopLocationEClass, StopLocation.class, "StopLocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceStopLocationEClass, ReferenceStopLocation.class, "ReferenceStopLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceStopLocation_Location(), theNetworkPackage.getLocation_(), null, "location", null, 1, 1, ReferenceStopLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customStopLocationEClass, CustomStopLocation.class, "CustomStopLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomStopLocation_Location(), theNetworkPackage.getLocation_(), null, "location", null, 1, 1, CustomStopLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logisticSolutionEClass, LogisticSolution.class, "LogisticSolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogisticSolution_ShipmentRecords(), this.getShipmentRecord(), null, "shipmentRecords", null, 0, -1, LogisticSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogisticSolution_Tours(), this.getPlannedTour(), null, "tours", null, 0, -1, LogisticSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LogisticSolutionPackageImpl
