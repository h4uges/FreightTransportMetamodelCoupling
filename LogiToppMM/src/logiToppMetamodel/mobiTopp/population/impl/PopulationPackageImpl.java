/**
 */
package logiToppMetamodel.mobiTopp.population.impl;

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

import logiToppMetamodel.logiTopp.parcels.ParcelsPackage;

import logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl;

import logiToppMetamodel.mobiTopp.network.NetworkPackage;

import logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl;

import logiToppMetamodel.mobiTopp.population.Employment;
import logiToppMetamodel.mobiTopp.population.Gender;
import logiToppMetamodel.mobiTopp.population.Household;
import logiToppMetamodel.mobiTopp.population.Person;
import logiToppMetamodel.mobiTopp.population.PopulationFactory;
import logiToppMetamodel.mobiTopp.population.PopulationPackage;

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
public class PopulationPackageImpl extends EPackageImpl implements PopulationPackage {
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
	private EClass householdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum employmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

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
	 * @see logiToppMetamodel.mobiTopp.population.PopulationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PopulationPackageImpl() {
		super(eNS_URI, PopulationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PopulationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PopulationPackage init() {
		if (isInited) return (PopulationPackage)EPackage.Registry.INSTANCE.getEPackage(PopulationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPopulationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PopulationPackageImpl thePopulationPackage = registeredPopulationPackage instanceof PopulationPackageImpl ? (PopulationPackageImpl)registeredPopulationPackage : new PopulationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogiToppMetamodelPackage.eNS_URI);
		LogiToppMetamodelPackageImpl theLogiToppMetamodelPackage = (LogiToppMetamodelPackageImpl)(registeredPackage instanceof LogiToppMetamodelPackageImpl ? registeredPackage : LogiToppMetamodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
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
		thePopulationPackage.createPackageContents();
		theLogiToppMetamodelPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
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
		thePopulationPackage.initializePackageContents();
		theLogiToppMetamodelPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
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
		thePopulationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PopulationPackage.eNS_URI, thePopulationPackage);
		return thePopulationPackage;
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
	public EAttribute getPerson_Age() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Gender() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Employment() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
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
	public EReference getHousehold_Members() {
		return (EReference)householdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHousehold_Zone() {
		return (EReference)householdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEmployment() {
		return employmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PopulationFactory getPopulationFactory() {
		return (PopulationFactory)getEFactoryInstance();
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
		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__HOUSEHOLD);
		createEAttribute(personEClass, PERSON__AGE);
		createEAttribute(personEClass, PERSON__GENDER);
		createEAttribute(personEClass, PERSON__EMPLOYMENT);

		householdEClass = createEClass(HOUSEHOLD);
		createEReference(householdEClass, HOUSEHOLD__LOCATION);
		createEReference(householdEClass, HOUSEHOLD__MEMBERS);
		createEReference(householdEClass, HOUSEHOLD__ZONE);

		// Create enums
		employmentEEnum = createEEnum(EMPLOYMENT);
		genderEEnum = createEEnum(GENDER);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		personEClass.getESuperTypes().add(theBasePackage.getEntity());
		householdEClass.getESuperTypes().add(theBasePackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Household(), this.getHousehold(), this.getHousehold_Members(), "household", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Age(), theXMLTypePackage.getInt(), "age", "99", 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Gender(), this.getGender(), "gender", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Employment(), this.getEmployment(), "employment", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(householdEClass, Household.class, "Household", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHousehold_Location(), theNetworkPackage.getLocation(), null, "location", null, 1, 1, Household.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHousehold_Members(), this.getPerson(), this.getPerson_Household(), "members", null, 1, -1, Household.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHousehold_Zone(), theNetworkPackage.getZone(), theNetworkPackage.getZone_Households(), "zone", null, 1, 1, Household.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(employmentEEnum, Employment.class, "Employment");
		addEEnumLiteral(employmentEEnum, Employment.UNKNOWN);
		addEEnumLiteral(employmentEEnum, Employment.FULLTIME);
		addEEnumLiteral(employmentEEnum, Employment.PARTTIME);
		addEEnumLiteral(employmentEEnum, Employment.MARGINAL);
		addEEnumLiteral(employmentEEnum, Employment.UNEMPLOYED);
		addEEnumLiteral(employmentEEnum, Employment.STUDENT);
		addEEnumLiteral(employmentEEnum, Employment.STUDENT_PRIMARY);
		addEEnumLiteral(employmentEEnum, Employment.STUDENT_SECONDARY);
		addEEnumLiteral(employmentEEnum, Employment.STUDENT_TERTIARY);
		addEEnumLiteral(employmentEEnum, Employment.EDUCATION);
		addEEnumLiteral(employmentEEnum, Employment.HOMEKEEPER);
		addEEnumLiteral(employmentEEnum, Employment.RETIRED);
		addEEnumLiteral(employmentEEnum, Employment.INFANT);
		addEEnumLiteral(employmentEEnum, Employment.NONE);

		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.MALE);
		addEEnumLiteral(genderEEnum, Gender.FEMALE);
	}

} //PopulationPackageImpl
