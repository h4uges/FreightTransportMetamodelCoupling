/**
 */
package logiToppMetamodel.logiTopp.distribution.impl;

import logiToppMetamodel.LogiToppMetamodelPackage;

import logiToppMetamodel.base.BasePackage;

import logiToppMetamodel.base.impl.BasePackageImpl;

import logiToppMetamodel.impl.LogiToppMetamodelPackageImpl;

import logiToppMetamodel.logiTopp.LogiToppPackage;

import logiToppMetamodel.logiTopp.business.BusinessPackage;

import logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl;

import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.distribution.DistributionFactory;
import logiToppMetamodel.logiTopp.distribution.DistributionPackage;

import logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage;

import logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl;

import logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage;

import logiToppMetamodel.logiTopp.distribution.delivery.impl.DeliveryPackageImpl;

import logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage;

import logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetPackageImpl;

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
public class DistributionPackageImpl extends EPackageImpl implements DistributionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cepServiceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionCenterEClass = null;

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
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DistributionPackageImpl() {
		super(eNS_URI, DistributionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DistributionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DistributionPackage init() {
		if (isInited) return (DistributionPackage)EPackage.Registry.INSTANCE.getEPackage(DistributionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDistributionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DistributionPackageImpl theDistributionPackage = registeredDistributionPackage instanceof DistributionPackageImpl ? (DistributionPackageImpl)registeredDistributionPackage : new DistributionPackageImpl();

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
		theDistributionPackage.createPackageContents();
		theLogiToppMetamodelPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theCitizensPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theLogiToppPackage.createPackageContents();
		theBusinessPackage.createPackageContents();
		theChainsPackage.createPackageContents();
		theDeliveryPackage.createPackageContents();
		theFleetPackage.createPackageContents();
		thePoliciesPackage.createPackageContents();
		theRegionPackage.createPackageContents();
		theTimetablePackage.createPackageContents();
		theToursPackage.createPackageContents();
		theParcelsPackage.createPackageContents();

		// Initialize created meta-data
		theDistributionPackage.initializePackageContents();
		theLogiToppMetamodelPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theCitizensPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theLogiToppPackage.initializePackageContents();
		theBusinessPackage.initializePackageContents();
		theChainsPackage.initializePackageContents();
		theDeliveryPackage.initializePackageContents();
		theFleetPackage.initializePackageContents();
		thePoliciesPackage.initializePackageContents();
		theRegionPackage.initializePackageContents();
		theTimetablePackage.initializePackageContents();
		theToursPackage.initializePackageContents();
		theParcelsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDistributionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DistributionPackage.eNS_URI, theDistributionPackage);
		return theDistributionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCEPServiceProvider() {
		return cepServiceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCEPServiceProvider_DistributionCenters() {
		return (EReference)cepServiceProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistributionCenter() {
		return distributionCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionCenter_Zone() {
		return (EReference)distributionCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionCenter_Location() {
		return (EReference)distributionCenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDistributionCenter_Attempts() {
		return (EAttribute)distributionCenterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionCenter_Fleet() {
		return (EReference)distributionCenterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionCenter_RegionalStructure() {
		return (EReference)distributionCenterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDistributionCenter_CEPSP() {
		return (EReference)distributionCenterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistributionFactory getDistributionFactory() {
		return (DistributionFactory)getEFactoryInstance();
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
		cepServiceProviderEClass = createEClass(CEP_SERVICE_PROVIDER);
		createEReference(cepServiceProviderEClass, CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS);

		distributionCenterEClass = createEClass(DISTRIBUTION_CENTER);
		createEReference(distributionCenterEClass, DISTRIBUTION_CENTER__ZONE);
		createEReference(distributionCenterEClass, DISTRIBUTION_CENTER__LOCATION);
		createEAttribute(distributionCenterEClass, DISTRIBUTION_CENTER__ATTEMPTS);
		createEReference(distributionCenterEClass, DISTRIBUTION_CENTER__FLEET);
		createEReference(distributionCenterEClass, DISTRIBUTION_CENTER__REGIONAL_STRUCTURE);
		createEReference(distributionCenterEClass, DISTRIBUTION_CENTER__CEPSP);
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
		ChainsPackage theChainsPackage = (ChainsPackage)EPackage.Registry.INSTANCE.getEPackage(ChainsPackage.eNS_URI);
		DeliveryPackage theDeliveryPackage = (DeliveryPackage)EPackage.Registry.INSTANCE.getEPackage(DeliveryPackage.eNS_URI);
		FleetPackage theFleetPackage = (FleetPackage)EPackage.Registry.INSTANCE.getEPackage(FleetPackage.eNS_URI);
		PoliciesPackage thePoliciesPackage = (PoliciesPackage)EPackage.Registry.INSTANCE.getEPackage(PoliciesPackage.eNS_URI);
		RegionPackage theRegionPackage = (RegionPackage)EPackage.Registry.INSTANCE.getEPackage(RegionPackage.eNS_URI);
		TimetablePackage theTimetablePackage = (TimetablePackage)EPackage.Registry.INSTANCE.getEPackage(TimetablePackage.eNS_URI);
		ToursPackage theToursPackage = (ToursPackage)EPackage.Registry.INSTANCE.getEPackage(ToursPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		LogiToppPackage theLogiToppPackage = (LogiToppPackage)EPackage.Registry.INSTANCE.getEPackage(LogiToppPackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theChainsPackage);
		getESubpackages().add(theDeliveryPackage);
		getESubpackages().add(theFleetPackage);
		getESubpackages().add(thePoliciesPackage);
		getESubpackages().add(theRegionPackage);
		getESubpackages().add(theTimetablePackage);
		getESubpackages().add(theToursPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cepServiceProviderEClass.getESuperTypes().add(theBasePackage.getNamedEntity());
		distributionCenterEClass.getESuperTypes().add(theBasePackage.getNamedEntity());
		distributionCenterEClass.getESuperTypes().add(theLogiToppPackage.getParcelProducer());
		distributionCenterEClass.getESuperTypes().add(theLogiToppPackage.getParcelConsumer());

		// Initialize classes, features, and operations; add parameters
		initEClass(cepServiceProviderEClass, CEPServiceProvider.class, "CEPServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCEPServiceProvider_DistributionCenters(), this.getDistributionCenter(), this.getDistributionCenter_CEPSP(), "distributionCenters", null, 0, -1, CEPServiceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distributionCenterEClass, DistributionCenter.class, "DistributionCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistributionCenter_Zone(), theNetworkPackage.getZone(), null, "zone", null, 1, 1, DistributionCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionCenter_Location(), theNetworkPackage.getLocation(), null, "location", null, 1, 1, DistributionCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistributionCenter_Attempts(), theXMLTypePackage.getInt(), "attempts", "1", 1, 1, DistributionCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionCenter_Fleet(), theFleetPackage.getFleet(), null, "fleet", null, 1, 1, DistributionCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionCenter_RegionalStructure(), theRegionPackage.getRegionalReach(), null, "regionalStructure", null, 1, 1, DistributionCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistributionCenter_CEPSP(), this.getCEPServiceProvider(), this.getCEPServiceProvider_DistributionCenters(), "CEPSP", null, 1, 1, DistributionCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DistributionPackageImpl
