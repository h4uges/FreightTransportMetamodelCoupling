/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.impl;

import CommonFreightTransportMetamodel.coupling.CouplingPackage;
import CommonFreightTransportMetamodel.coupling.impl.CouplingPackageImpl;
import CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage;
import CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;

import CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticFacility;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticHub;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkFactory;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;
import CommonFreightTransportMetamodel.logisticNetwork.Packstation;
import CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint;
import CommonFreightTransportMetamodel.logisticNetwork.Shop;
import CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint;
import CommonFreightTransportMetamodel.logisticNetwork.Vehicle;
import CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot;

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
public class LogisticNetworkPackageImpl extends EPackageImpl implements LogisticNetworkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cepspEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicServicePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packstationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleDepotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logisticHubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usedPublicServicePointEClass = null;

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
	private EClass logisticFacilityEClass = null;

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
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogisticNetworkPackageImpl() {
		super(eNS_URI, LogisticNetworkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogisticNetworkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogisticNetworkPackage init() {
		if (isInited) return (LogisticNetworkPackage)EPackage.Registry.INSTANCE.getEPackage(LogisticNetworkPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogisticNetworkPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogisticNetworkPackageImpl theLogisticNetworkPackage = registeredLogisticNetworkPackage instanceof LogisticNetworkPackageImpl ? (LogisticNetworkPackageImpl)registeredLogisticNetworkPackage : new LogisticNetworkPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticSolutionPackage.eNS_URI);
		LogisticSolutionPackageImpl theLogisticSolutionPackage = (LogisticSolutionPackageImpl)(registeredPackage instanceof LogisticSolutionPackageImpl ? registeredPackage : LogisticSolutionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(registeredPackage instanceof ResultsPackageImpl ? registeredPackage : ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CouplingPackage.eNS_URI);
		CouplingPackageImpl theCouplingPackage = (CouplingPackageImpl)(registeredPackage instanceof CouplingPackageImpl ? registeredPackage : CouplingPackage.eINSTANCE);

		// Create package meta-data objects
		theLogisticNetworkPackage.createPackageContents();
		theLogisticDemandPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theLocalEntitiesPackage.createPackageContents();
		theLogisticSolutionPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theCouplingPackage.createPackageContents();

		// Initialize created meta-data
		theLogisticNetworkPackage.initializePackageContents();
		theLogisticDemandPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theLocalEntitiesPackage.initializePackageContents();
		theLogisticSolutionPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theCouplingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogisticNetworkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogisticNetworkPackage.eNS_URI, theLogisticNetworkPackage);
		return theLogisticNetworkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCEPSP() {
		return cepspEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCEPSP_VehicleDepots() {
		return (EReference)cepspEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCEPSP_LogisticHubs() {
		return (EReference)cepspEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCEPSP_Name() {
		return (EAttribute)cepspEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCEPSP_UsedPublicServicePoints() {
		return (EReference)cepspEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCEPSP_DeliveryPartners() {
		return (EReference)cepspEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCEPSP_PickUpPartners() {
		return (EReference)cepspEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogisticNetwork() {
		return logisticNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogisticNetwork_CEPSPs() {
		return (EReference)logisticNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogisticNetwork_PublicServicePoints() {
		return (EReference)logisticNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicServicePoint() {
		return publicServicePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicServicePoint_Location() {
		return (EReference)publicServicePointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublicServicePoint_StorageCapacity() {
		return (EReference)publicServicePointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackstation() {
		return packstationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShop() {
		return shopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShop_OpeningHours() {
		return (EReference)shopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicleDepot() {
		return vehicleDepotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleDepot_Location() {
		return (EReference)vehicleDepotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleDepot_Vehicles() {
		return (EReference)vehicleDepotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicleDepot_OperationHours() {
		return (EReference)vehicleDepotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogisticHub() {
		return logisticHubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogisticHub_StorageCapacity() {
		return (EReference)logisticHubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogisticHub_Location() {
		return (EReference)logisticHubEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogisticHub_OperationHours() {
		return (EReference)logisticHubEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogisticHub_AcceptedVehicleTypes() {
		return (EAttribute)logisticHubEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogisticHub_MinimumTranshipmentTime() {
		return (EReference)logisticHubEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogisticHub_IsExit() {
		return (EAttribute)logisticHubEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogisticHub_IsEntry() {
		return (EAttribute)logisticHubEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsedPublicServicePoint() {
		return usedPublicServicePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsedPublicServicePoint_PublicServicePoint() {
		return (EReference)usedPublicServicePointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsedPublicServicePoint_GrantedStorageCapacity() {
		return (EReference)usedPublicServicePointEClass.getEStructuralFeatures().get(1);
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
	public EReference getVehicle_StorageCapacity() {
		return (EReference)vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicle_OperationHours() {
		return (EReference)vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVehicle_Type() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVehicle_Depot() {
		return (EReference)vehicleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogisticFacility() {
		return logisticFacilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticNetworkFactory getLogisticNetworkFactory() {
		return (LogisticNetworkFactory)getEFactoryInstance();
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
		cepspEClass = createEClass(CEPSP);
		createEReference(cepspEClass, CEPSP__VEHICLE_DEPOTS);
		createEReference(cepspEClass, CEPSP__LOGISTIC_HUBS);
		createEAttribute(cepspEClass, CEPSP__NAME);
		createEReference(cepspEClass, CEPSP__USED_PUBLIC_SERVICE_POINTS);
		createEReference(cepspEClass, CEPSP__DELIVERY_PARTNERS);
		createEReference(cepspEClass, CEPSP__PICK_UP_PARTNERS);

		logisticNetworkEClass = createEClass(LOGISTIC_NETWORK);
		createEReference(logisticNetworkEClass, LOGISTIC_NETWORK__CEPS_PS);
		createEReference(logisticNetworkEClass, LOGISTIC_NETWORK__PUBLIC_SERVICE_POINTS);

		publicServicePointEClass = createEClass(PUBLIC_SERVICE_POINT);
		createEReference(publicServicePointEClass, PUBLIC_SERVICE_POINT__LOCATION);
		createEReference(publicServicePointEClass, PUBLIC_SERVICE_POINT__STORAGE_CAPACITY);

		packstationEClass = createEClass(PACKSTATION);

		shopEClass = createEClass(SHOP);
		createEReference(shopEClass, SHOP__OPENING_HOURS);

		vehicleDepotEClass = createEClass(VEHICLE_DEPOT);
		createEReference(vehicleDepotEClass, VEHICLE_DEPOT__LOCATION);
		createEReference(vehicleDepotEClass, VEHICLE_DEPOT__OPERATION_HOURS);
		createEReference(vehicleDepotEClass, VEHICLE_DEPOT__VEHICLES);

		logisticHubEClass = createEClass(LOGISTIC_HUB);
		createEReference(logisticHubEClass, LOGISTIC_HUB__STORAGE_CAPACITY);
		createEReference(logisticHubEClass, LOGISTIC_HUB__LOCATION);
		createEReference(logisticHubEClass, LOGISTIC_HUB__OPERATION_HOURS);
		createEAttribute(logisticHubEClass, LOGISTIC_HUB__ACCEPTED_VEHICLE_TYPES);
		createEReference(logisticHubEClass, LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME);
		createEAttribute(logisticHubEClass, LOGISTIC_HUB__IS_EXIT);
		createEAttribute(logisticHubEClass, LOGISTIC_HUB__IS_ENTRY);

		usedPublicServicePointEClass = createEClass(USED_PUBLIC_SERVICE_POINT);
		createEReference(usedPublicServicePointEClass, USED_PUBLIC_SERVICE_POINT__PUBLIC_SERVICE_POINT);
		createEReference(usedPublicServicePointEClass, USED_PUBLIC_SERVICE_POINT__GRANTED_STORAGE_CAPACITY);

		vehicleEClass = createEClass(VEHICLE);
		createEReference(vehicleEClass, VEHICLE__STORAGE_CAPACITY);
		createEReference(vehicleEClass, VEHICLE__OPERATION_HOURS);
		createEAttribute(vehicleEClass, VEHICLE__TYPE);
		createEReference(vehicleEClass, VEHICLE__DEPOT);

		logisticFacilityEClass = createEClass(LOGISTIC_FACILITY);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cepspEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		publicServicePointEClass.getESuperTypes().add(this.getLogisticFacility());
		packstationEClass.getESuperTypes().add(this.getPublicServicePoint());
		shopEClass.getESuperTypes().add(this.getPublicServicePoint());
		vehicleDepotEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		logisticHubEClass.getESuperTypes().add(this.getLogisticFacility());
		logisticHubEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		vehicleEClass.getESuperTypes().add(theUtilsPackage.getHasId_());
		logisticFacilityEClass.getESuperTypes().add(theUtilsPackage.getShipmentlLegStartEndPoint());

		// Initialize classes, features, and operations; add parameters
		initEClass(cepspEClass, CommonFreightTransportMetamodel.logisticNetwork.CEPSP.class, "CEPSP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCEPSP_VehicleDepots(), this.getVehicleDepot(), null, "vehicleDepots", null, 0, -1, CommonFreightTransportMetamodel.logisticNetwork.CEPSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEPSP_LogisticHubs(), this.getLogisticHub(), null, "logisticHubs", null, 0, -1, CommonFreightTransportMetamodel.logisticNetwork.CEPSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCEPSP_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, CommonFreightTransportMetamodel.logisticNetwork.CEPSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEPSP_UsedPublicServicePoints(), this.getUsedPublicServicePoint(), null, "usedPublicServicePoints", null, 0, -1, CommonFreightTransportMetamodel.logisticNetwork.CEPSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEPSP_DeliveryPartners(), this.getCEPSP(), null, "deliveryPartners", null, 0, -1, CommonFreightTransportMetamodel.logisticNetwork.CEPSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCEPSP_PickUpPartners(), this.getCEPSP(), null, "pickUpPartners", null, 0, -1, CommonFreightTransportMetamodel.logisticNetwork.CEPSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logisticNetworkEClass, LogisticNetwork.class, "LogisticNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogisticNetwork_CEPSPs(), this.getCEPSP(), null, "CEPSPs", null, 0, -1, LogisticNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogisticNetwork_PublicServicePoints(), this.getPublicServicePoint(), null, "publicServicePoints", null, 0, -1, LogisticNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicServicePointEClass, PublicServicePoint.class, "PublicServicePoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicServicePoint_Location(), theNetworkPackage.getLocation_(), null, "location", null, 1, 1, PublicServicePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicServicePoint_StorageCapacity(), theUtilsPackage.getDimension(), null, "storageCapacity", null, 1, 1, PublicServicePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packstationEClass, Packstation.class, "Packstation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shopEClass, Shop.class, "Shop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShop_OpeningHours(), theUtilsPackage.getTimeWindow_(), null, "openingHours", null, 1, -1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleDepotEClass, VehicleDepot.class, "VehicleDepot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicleDepot_Location(), theNetworkPackage.getLocation_(), null, "location", null, 1, 1, VehicleDepot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleDepot_OperationHours(), theUtilsPackage.getTimeWindow_(), null, "operationHours", null, 1, -1, VehicleDepot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleDepot_Vehicles(), this.getVehicle(), this.getVehicle_Depot(), "vehicles", null, 0, -1, VehicleDepot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logisticHubEClass, LogisticHub.class, "LogisticHub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogisticHub_StorageCapacity(), theUtilsPackage.getDimension(), null, "storageCapacity", null, 1, 1, LogisticHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogisticHub_Location(), theNetworkPackage.getLocation_(), null, "location", null, 1, 1, LogisticHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogisticHub_OperationHours(), theUtilsPackage.getTimeWindow_(), null, "operationHours", null, 1, -1, LogisticHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogisticHub_AcceptedVehicleTypes(), theNetworkPackage.getVehicleType_(), "acceptedVehicleTypes", null, 0, -1, LogisticHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogisticHub_MinimumTranshipmentTime(), theUtilsPackage.getDurration_(), null, "minimumTranshipmentTime", null, 1, 1, LogisticHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogisticHub_IsExit(), theXMLTypePackage.getBoolean(), "isExit", null, 1, 1, LogisticHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogisticHub_IsEntry(), theXMLTypePackage.getBoolean(), "isEntry", "false", 1, 1, LogisticHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usedPublicServicePointEClass, UsedPublicServicePoint.class, "UsedPublicServicePoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsedPublicServicePoint_PublicServicePoint(), this.getPublicServicePoint(), null, "publicServicePoint", null, 1, 1, UsedPublicServicePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsedPublicServicePoint_GrantedStorageCapacity(), theUtilsPackage.getDimension(), null, "grantedStorageCapacity", null, 1, 1, UsedPublicServicePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehicle_StorageCapacity(), theUtilsPackage.getDimension(), null, "storageCapacity", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_OperationHours(), theUtilsPackage.getTimeWindow_(), null, "operationHours", null, 1, -1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Type(), theNetworkPackage.getVehicleType_(), "type", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_Depot(), this.getVehicleDepot(), this.getVehicleDepot_Vehicles(), "depot", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logisticFacilityEClass, LogisticFacility.class, "LogisticFacility", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LogisticNetworkPackageImpl
