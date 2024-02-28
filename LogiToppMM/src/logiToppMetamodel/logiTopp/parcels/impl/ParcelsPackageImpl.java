/**
 */
package logiToppMetamodel.logiTopp.parcels.impl;

import logiToppMetamodel.LogiToppMetamodelPackage;

import logiToppMetamodel.base.BasePackage;

import logiToppMetamodel.base.impl.BasePackageImpl;

import logiToppMetamodel.impl.LogiToppMetamodelPackageImpl;

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

import logiToppMetamodel.logiTopp.parcels.BusinessParcel;
import logiToppMetamodel.logiTopp.parcels.Parcel;
import logiToppMetamodel.logiTopp.parcels.ParcelDestinationType;
import logiToppMetamodel.logiTopp.parcels.ParcelState;
import logiToppMetamodel.logiTopp.parcels.ParcelsFactory;
import logiToppMetamodel.logiTopp.parcels.ParcelsPackage;
import logiToppMetamodel.logiTopp.parcels.PrivateParcel;
import logiToppMetamodel.logiTopp.parcels.ShipmentSize;

import logiToppMetamodel.mobiTopp.citizens.CitizensPackage;

import logiToppMetamodel.mobiTopp.citizens.impl.CitizensPackageImpl;

import logiToppMetamodel.mobiTopp.network.NetworkPackage;

import logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class ParcelsPackageImpl extends EPackageImpl implements ParcelsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parcelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateParcelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessParcelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shipmentSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parcelStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parcelDestinationTypeEEnum = null;

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
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParcelsPackageImpl() {
		super(eNS_URI, ParcelsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ParcelsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParcelsPackage init() {
		if (isInited) return (ParcelsPackage)EPackage.Registry.INSTANCE.getEPackage(ParcelsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredParcelsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ParcelsPackageImpl theParcelsPackage = registeredParcelsPackage instanceof ParcelsPackageImpl ? (ParcelsPackageImpl)registeredParcelsPackage : new ParcelsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogiToppMetamodelPackage.eNS_URI);
		LogiToppMetamodelPackageImpl theLogiToppMetamodelPackage = (LogiToppMetamodelPackageImpl)(registeredPackage instanceof LogiToppMetamodelPackageImpl ? registeredPackage : LogiToppMetamodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
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

		// Create package meta-data objects
		theParcelsPackage.createPackageContents();
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

		// Initialize created meta-data
		theParcelsPackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theParcelsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParcelsPackage.eNS_URI, theParcelsPackage);
		return theParcelsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParcel() {
		return parcelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParcel_PlannedArrivalDate() {
		return (EReference)parcelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParcel_Producer() {
		return (EReference)parcelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParcel_ZoneAndLocation() {
		return (EReference)parcelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParcel_ShipmentSize() {
		return (EAttribute)parcelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParcel_IsPickup() {
		return (EAttribute)parcelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParcel_Consumer() {
		return (EReference)parcelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParcel_ResponsibleCEPSP() {
		return (EReference)parcelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivateParcel() {
		return privateParcelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivateParcel_DestinationType() {
		return (EAttribute)privateParcelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessParcel() {
		return businessParcelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getShipmentSize() {
		return shipmentSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParcelState() {
		return parcelStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParcelDestinationType() {
		return parcelDestinationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParcelsFactory getParcelsFactory() {
		return (ParcelsFactory)getEFactoryInstance();
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
		parcelEClass = createEClass(PARCEL);
		createEReference(parcelEClass, PARCEL__PLANNED_ARRIVAL_DATE);
		createEReference(parcelEClass, PARCEL__PRODUCER);
		createEReference(parcelEClass, PARCEL__ZONE_AND_LOCATION);
		createEAttribute(parcelEClass, PARCEL__SHIPMENT_SIZE);
		createEAttribute(parcelEClass, PARCEL__IS_PICKUP);
		createEReference(parcelEClass, PARCEL__CONSUMER);
		createEReference(parcelEClass, PARCEL__RESPONSIBLE_CEPSP);

		privateParcelEClass = createEClass(PRIVATE_PARCEL);
		createEAttribute(privateParcelEClass, PRIVATE_PARCEL__DESTINATION_TYPE);

		businessParcelEClass = createEClass(BUSINESS_PARCEL);

		// Create enums
		shipmentSizeEEnum = createEEnum(SHIPMENT_SIZE);
		parcelStateEEnum = createEEnum(PARCEL_STATE);
		parcelDestinationTypeEEnum = createEEnum(PARCEL_DESTINATION_TYPE);
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
		LogiToppPackage theLogiToppPackage = (LogiToppPackage)EPackage.Registry.INSTANCE.getEPackage(LogiToppPackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		DistributionPackage theDistributionPackage = (DistributionPackage)EPackage.Registry.INSTANCE.getEPackage(DistributionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parcelEClass.getESuperTypes().add(theBasePackage.getEntity());
		privateParcelEClass.getESuperTypes().add(this.getParcel());
		businessParcelEClass.getESuperTypes().add(this.getParcel());

		// Initialize classes, features, and operations; add parameters
		initEClass(parcelEClass, Parcel.class, "Parcel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParcel_PlannedArrivalDate(), theBasePackage.getTime(), null, "plannedArrivalDate", null, 0, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParcel_Producer(), theLogiToppPackage.getParcelProducer(), null, "producer", null, 1, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParcel_ZoneAndLocation(), theNetworkPackage.getZoneAndLocation(), null, "zoneAndLocation", null, 1, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParcel_ShipmentSize(), this.getShipmentSize(), "shipmentSize", "SMALL", 1, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParcel_IsPickup(), theXMLTypePackage.getBoolean(), "isPickup", null, 1, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParcel_Consumer(), theLogiToppPackage.getParcelConsumer(), null, "consumer", null, 1, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParcel_ResponsibleCEPSP(), theDistributionPackage.getCEPServiceProvider(), null, "responsibleCEPSP", null, 1, 1, Parcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privateParcelEClass, PrivateParcel.class, "PrivateParcel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivateParcel_DestinationType(), this.getParcelDestinationType(), "destinationType", "HOME", 1, 1, PrivateParcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessParcelEClass, BusinessParcel.class, "BusinessParcel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(shipmentSizeEEnum, ShipmentSize.class, "ShipmentSize");
		addEEnumLiteral(shipmentSizeEEnum, ShipmentSize.SMALL);
		addEEnumLiteral(shipmentSizeEEnum, ShipmentSize.MEDIUM);
		addEEnumLiteral(shipmentSizeEEnum, ShipmentSize.LARGE);
		addEEnumLiteral(shipmentSizeEEnum, ShipmentSize.EXTRA_LARGE);
		addEEnumLiteral(shipmentSizeEEnum, ShipmentSize.PALLET);
		addEEnumLiteral(shipmentSizeEEnum, ShipmentSize.CONTAINER);

		initEEnum(parcelStateEEnum, ParcelState.class, "ParcelState");
		addEEnumLiteral(parcelStateEEnum, ParcelState.DELIVERED);
		addEEnumLiteral(parcelStateEEnum, ParcelState.RETURNING);
		addEEnumLiteral(parcelStateEEnum, ParcelState.ONDELIVERY);
		addEEnumLiteral(parcelStateEEnum, ParcelState.UNDEFINED);

		initEEnum(parcelDestinationTypeEEnum, ParcelDestinationType.class, "ParcelDestinationType");
		addEEnumLiteral(parcelDestinationTypeEEnum, ParcelDestinationType.HOME);
		addEEnumLiteral(parcelDestinationTypeEEnum, ParcelDestinationType.WORK);
		addEEnumLiteral(parcelDestinationTypeEEnum, ParcelDestinationType.PACK_STATION);
	}

} //ParcelsPackageImpl
