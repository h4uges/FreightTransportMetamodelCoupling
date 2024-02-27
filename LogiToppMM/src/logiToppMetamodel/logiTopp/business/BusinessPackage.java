/**
 */
package logiToppMetamodel.logiTopp.business;

import logiToppMetamodel.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.business.BusinessFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "business";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/logiTopp/business";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "business";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessPackage eINSTANCE = logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.business.impl.BusinessImpl <em>Business</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.business.impl.BusinessImpl
	 * @see logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl#getBusiness()
	 * @generated
	 */
	int BUSINESS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__ID = BasePackage.NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__NAME = BasePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__BRANCH = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Building Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__BUILDING_TYPE = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emplyees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__EMPLYEES = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__AREA = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__ZONE = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__LOCATION = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Delivery Partners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__DELIVERY_PARTNERS = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pick Up Partners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__PICK_UP_PARTNERS = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Opening Hours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__OPENING_HOURS = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Business</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FEATURE_COUNT = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Business</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OPERATION_COUNT = BasePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.business.impl.OpeningHourImpl <em>Opening Hour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.business.impl.OpeningHourImpl
	 * @see logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl#getOpeningHour()
	 * @generated
	 */
	int OPENING_HOUR = 1;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_HOUR__DAY_OF_WEEK = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_HOUR__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_HOUR__END = 2;

	/**
	 * The number of structural features of the '<em>Opening Hour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_HOUR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Opening Hour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_HOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.business.Branch <em>Branch</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.business.Branch
	 * @see logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 2;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.business.BuildingType <em>Building Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.business.BuildingType
	 * @see logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl#getBuildingType()
	 * @generated
	 */
	int BUILDING_TYPE = 3;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.business.Sector <em>Sector</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.business.Sector
	 * @see logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl#getSector()
	 * @generated
	 */
	int SECTOR = 4;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.business.Business <em>Business</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Business
	 * @generated
	 */
	EClass getBusiness();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.business.Business#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Business#getBranch()
	 * @see #getBusiness()
	 * @generated
	 */
	EAttribute getBusiness_Branch();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.business.Business#getBuildingType <em>Building Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Type</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Business#getBuildingType()
	 * @see #getBusiness()
	 * @generated
	 */
	EAttribute getBusiness_BuildingType();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.business.Business#getEmplyees <em>Emplyees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emplyees</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Business#getEmplyees()
	 * @see #getBusiness()
	 * @generated
	 */
	EAttribute getBusiness_Emplyees();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.business.Business#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Business#getArea()
	 * @see #getBusiness()
	 * @generated
	 */
	EAttribute getBusiness_Area();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.business.Business#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zone</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Business#getZone()
	 * @see #getBusiness()
	 * @generated
	 */
	EReference getBusiness_Zone();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.logiTopp.business.Business#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Business#getLocation()
	 * @see #getBusiness()
	 * @generated
	 */
	EReference getBusiness_Location();

	/**
	 * Returns the meta object for the reference list '{@link logiToppMetamodel.logiTopp.business.Business#getDeliveryPartners <em>Delivery Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delivery Partners</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Business#getDeliveryPartners()
	 * @see #getBusiness()
	 * @generated
	 */
	EReference getBusiness_DeliveryPartners();

	/**
	 * Returns the meta object for the reference list '{@link logiToppMetamodel.logiTopp.business.Business#getPickUpPartners <em>Pick Up Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pick Up Partners</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Business#getPickUpPartners()
	 * @see #getBusiness()
	 * @generated
	 */
	EReference getBusiness_PickUpPartners();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.logiTopp.business.Business#getOpeningHours <em>Opening Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opening Hours</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Business#getOpeningHours()
	 * @see #getBusiness()
	 * @generated
	 */
	EReference getBusiness_OpeningHours();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.business.OpeningHour <em>Opening Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opening Hour</em>'.
	 * @see logiToppMetamodel.logiTopp.business.OpeningHour
	 * @generated
	 */
	EClass getOpeningHour();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.business.OpeningHour#getDayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Week</em>'.
	 * @see logiToppMetamodel.logiTopp.business.OpeningHour#getDayOfWeek()
	 * @see #getOpeningHour()
	 * @generated
	 */
	EAttribute getOpeningHour_DayOfWeek();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.business.OpeningHour#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see logiToppMetamodel.logiTopp.business.OpeningHour#getStart()
	 * @see #getOpeningHour()
	 * @generated
	 */
	EReference getOpeningHour_Start();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.business.OpeningHour#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see logiToppMetamodel.logiTopp.business.OpeningHour#getEnd()
	 * @see #getOpeningHour()
	 * @generated
	 */
	EReference getOpeningHour_End();

	/**
	 * Returns the meta object for enum '{@link logiToppMetamodel.logiTopp.business.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Branch</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Branch
	 * @generated
	 */
	EEnum getBranch();

	/**
	 * Returns the meta object for enum '{@link logiToppMetamodel.logiTopp.business.BuildingType <em>Building Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Building Type</em>'.
	 * @see logiToppMetamodel.logiTopp.business.BuildingType
	 * @generated
	 */
	EEnum getBuildingType();

	/**
	 * Returns the meta object for enum '{@link logiToppMetamodel.logiTopp.business.Sector <em>Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sector</em>'.
	 * @see logiToppMetamodel.logiTopp.business.Sector
	 * @generated
	 */
	EEnum getSector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BusinessFactory getBusinessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.business.impl.BusinessImpl <em>Business</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.business.impl.BusinessImpl
		 * @see logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl#getBusiness()
		 * @generated
		 */
		EClass BUSINESS = eINSTANCE.getBusiness();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS__BRANCH = eINSTANCE.getBusiness_Branch();

		/**
		 * The meta object literal for the '<em><b>Building Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS__BUILDING_TYPE = eINSTANCE.getBusiness_BuildingType();

		/**
		 * The meta object literal for the '<em><b>Emplyees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS__EMPLYEES = eINSTANCE.getBusiness_Emplyees();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS__AREA = eINSTANCE.getBusiness_Area();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS__ZONE = eINSTANCE.getBusiness_Zone();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS__LOCATION = eINSTANCE.getBusiness_Location();

		/**
		 * The meta object literal for the '<em><b>Delivery Partners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS__DELIVERY_PARTNERS = eINSTANCE.getBusiness_DeliveryPartners();

		/**
		 * The meta object literal for the '<em><b>Pick Up Partners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS__PICK_UP_PARTNERS = eINSTANCE.getBusiness_PickUpPartners();

		/**
		 * The meta object literal for the '<em><b>Opening Hours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS__OPENING_HOURS = eINSTANCE.getBusiness_OpeningHours();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.business.impl.OpeningHourImpl <em>Opening Hour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.business.impl.OpeningHourImpl
		 * @see logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl#getOpeningHour()
		 * @generated
		 */
		EClass OPENING_HOUR = eINSTANCE.getOpeningHour();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENING_HOUR__DAY_OF_WEEK = eINSTANCE.getOpeningHour_DayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPENING_HOUR__START = eINSTANCE.getOpeningHour_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPENING_HOUR__END = eINSTANCE.getOpeningHour_End();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.business.Branch <em>Branch</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.business.Branch
		 * @see logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl#getBranch()
		 * @generated
		 */
		EEnum BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.business.BuildingType <em>Building Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.business.BuildingType
		 * @see logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl#getBuildingType()
		 * @generated
		 */
		EEnum BUILDING_TYPE = eINSTANCE.getBuildingType();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.business.Sector <em>Sector</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.business.Sector
		 * @see logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl#getSector()
		 * @generated
		 */
		EEnum SECTOR = eINSTANCE.getSector();

	}

} //BusinessPackage
