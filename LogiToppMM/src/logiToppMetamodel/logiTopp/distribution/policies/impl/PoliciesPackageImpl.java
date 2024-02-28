/**
 */
package logiToppMetamodel.logiTopp.distribution.policies.impl;

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

import logiToppMetamodel.logiTopp.distribution.policies.PoliciesFactory;
import logiToppMetamodel.logiTopp.distribution.policies.PoliciesPackage;
import logiToppMetamodel.logiTopp.distribution.policies.RecipientType;

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

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PoliciesPackageImpl extends EPackageImpl implements PoliciesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recipientTypeEEnum = null;

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
	 * @see logiToppMetamodel.logiTopp.distribution.policies.PoliciesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PoliciesPackageImpl() {
		super(eNS_URI, PoliciesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PoliciesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PoliciesPackage init() {
		if (isInited) return (PoliciesPackage)EPackage.Registry.INSTANCE.getEPackage(PoliciesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPoliciesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PoliciesPackageImpl thePoliciesPackage = registeredPoliciesPackage instanceof PoliciesPackageImpl ? (PoliciesPackageImpl)registeredPoliciesPackage : new PoliciesPackageImpl();

		isInited = true;

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RegionPackage.eNS_URI);
		RegionPackageImpl theRegionPackage = (RegionPackageImpl)(registeredPackage instanceof RegionPackageImpl ? registeredPackage : RegionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TimetablePackage.eNS_URI);
		TimetablePackageImpl theTimetablePackage = (TimetablePackageImpl)(registeredPackage instanceof TimetablePackageImpl ? registeredPackage : TimetablePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ToursPackage.eNS_URI);
		ToursPackageImpl theToursPackage = (ToursPackageImpl)(registeredPackage instanceof ToursPackageImpl ? registeredPackage : ToursPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParcelsPackage.eNS_URI);
		ParcelsPackageImpl theParcelsPackage = (ParcelsPackageImpl)(registeredPackage instanceof ParcelsPackageImpl ? registeredPackage : ParcelsPackage.eINSTANCE);

		// Create package meta-data objects
		thePoliciesPackage.createPackageContents();
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
		theRegionPackage.createPackageContents();
		theTimetablePackage.createPackageContents();
		theToursPackage.createPackageContents();
		theParcelsPackage.createPackageContents();

		// Initialize created meta-data
		thePoliciesPackage.initializePackageContents();
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
		theRegionPackage.initializePackageContents();
		theTimetablePackage.initializePackageContents();
		theToursPackage.initializePackageContents();
		theParcelsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePoliciesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PoliciesPackage.eNS_URI, thePoliciesPackage);
		return thePoliciesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRecipientType() {
		return recipientTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PoliciesFactory getPoliciesFactory() {
		return (PoliciesFactory)getEFactoryInstance();
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

		// Create enums
		recipientTypeEEnum = createEEnum(RECIPIENT_TYPE);
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

		// Initialize enums and add enum literals
		initEEnum(recipientTypeEEnum, RecipientType.class, "RecipientType");
		addEEnumLiteral(recipientTypeEEnum, RecipientType.PERSONAL);
		addEEnumLiteral(recipientTypeEEnum, RecipientType.HOUSEHOLDMEMBER);
		addEEnumLiteral(recipientTypeEEnum, RecipientType.NEIGHBOR);
		addEEnumLiteral(recipientTypeEEnum, RecipientType.PACKSTATION);
		addEEnumLiteral(recipientTypeEEnum, RecipientType.BUSINESS);
		addEEnumLiteral(recipientTypeEEnum, RecipientType.DISTRIBUTION_CENTER);
	}

} //PoliciesPackageImpl
