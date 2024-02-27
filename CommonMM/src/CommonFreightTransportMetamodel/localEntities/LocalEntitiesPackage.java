/**
 */
package CommonFreightTransportMetamodel.localEntities;

import CommonFreightTransportMetamodel.utils.UtilsPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesFactory
 * @model kind="package"
 * @generated
 */
public interface LocalEntitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "localEntities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/commonFreightTransportMetamodel/localEntites";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "localEntities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LocalEntitiesPackage eINSTANCE = CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.localEntities.impl.ShipmentConsumerProducerImpl <em>Shipment Consumer Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.localEntities.impl.ShipmentConsumerProducerImpl
	 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getShipmentConsumerProducer()
	 * @generated
	 */
	int SHIPMENT_CONSUMER_PRODUCER = 4;

	/**
	 * The number of structural features of the '<em>Shipment Consumer Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONSUMER_PRODUCER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Shipment Consumer Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONSUMER_PRODUCER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.localEntities.impl.BusinessBranchImpl <em>Business Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.localEntities.impl.BusinessBranchImpl
	 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getBusinessBranch()
	 * @generated
	 */
	int BUSINESS_BRANCH = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_BRANCH__ID = SHIPMENT_CONSUMER_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_BRANCH__LOCATION = SHIPMENT_CONSUMER_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opening Hours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_BRANCH__OPENING_HOURS = SHIPMENT_CONSUMER_PRODUCER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Business Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_BRANCH_FEATURE_COUNT = SHIPMENT_CONSUMER_PRODUCER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Business Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_BRANCH_OPERATION_COUNT = SHIPMENT_CONSUMER_PRODUCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.localEntities.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.localEntities.impl.PersonImpl
	 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = SHIPMENT_CONSUMER_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Household</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HOUSEHOLD = SHIPMENT_CONSUMER_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = SHIPMENT_CONSUMER_PRODUCER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = SHIPMENT_CONSUMER_PRODUCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.localEntities.impl.PopulationImpl <em>Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.localEntities.impl.PopulationImpl
	 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getPopulation()
	 * @generated
	 */
	int POPULATION = 2;

	/**
	 * The feature id for the '<em><b>Households</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__HOUSEHOLDS = 0;

	/**
	 * The feature id for the '<em><b>Businesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__BUSINESSES = 1;

	/**
	 * The number of structural features of the '<em>Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.localEntities.impl.BusinessImpl <em>Business</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.localEntities.impl.BusinessImpl
	 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getBusiness()
	 * @generated
	 */
	int BUSINESS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS__BRANCHES = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Business</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.localEntities.impl.HouseholdImpl <em>Household</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.localEntities.impl.HouseholdImpl
	 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getHousehold()
	 * @generated
	 */
	int HOUSEHOLD = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__LOCATION = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__MEMBER = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Household</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Household</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.localEntities.BusinessBranch <em>Business Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Branch</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.BusinessBranch
	 * @generated
	 */
	EClass getBusinessBranch();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.localEntities.BusinessBranch#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.BusinessBranch#getLocation()
	 * @see #getBusinessBranch()
	 * @generated
	 */
	EReference getBusinessBranch_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.localEntities.BusinessBranch#getOpeningHours <em>Opening Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opening Hours</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.BusinessBranch#getOpeningHours()
	 * @see #getBusinessBranch()
	 * @generated
	 */
	EReference getBusinessBranch_OpeningHours();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.localEntities.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the container reference '{@link CommonFreightTransportMetamodel.localEntities.Person#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Household</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.Person#getHousehold()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Household();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.localEntities.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.Population
	 * @generated
	 */
	EClass getPopulation();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.localEntities.Population#getHouseholds <em>Households</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Households</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.Population#getHouseholds()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_Households();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.localEntities.Population#getBusinesses <em>Businesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Businesses</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.Population#getBusinesses()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_Businesses();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.localEntities.Business <em>Business</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.Business
	 * @generated
	 */
	EClass getBusiness();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.localEntities.Business#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.Business#getBranches()
	 * @see #getBusiness()
	 * @generated
	 */
	EReference getBusiness_Branches();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer <em>Shipment Consumer Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Consumer Producer</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer
	 * @generated
	 */
	EClass getShipmentConsumerProducer();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.localEntities.Household <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Household</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.Household
	 * @generated
	 */
	EClass getHousehold();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.localEntities.Household#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.Household#getLocation()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.localEntities.Household#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see CommonFreightTransportMetamodel.localEntities.Household#getMember()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Member();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LocalEntitiesFactory getLocalEntitiesFactory();

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
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.localEntities.impl.BusinessBranchImpl <em>Business Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.localEntities.impl.BusinessBranchImpl
		 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getBusinessBranch()
		 * @generated
		 */
		EClass BUSINESS_BRANCH = eINSTANCE.getBusinessBranch();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_BRANCH__LOCATION = eINSTANCE.getBusinessBranch_Location();

		/**
		 * The meta object literal for the '<em><b>Opening Hours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_BRANCH__OPENING_HOURS = eINSTANCE.getBusinessBranch_OpeningHours();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.localEntities.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.localEntities.impl.PersonImpl
		 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Household</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__HOUSEHOLD = eINSTANCE.getPerson_Household();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.localEntities.impl.PopulationImpl <em>Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.localEntities.impl.PopulationImpl
		 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getPopulation()
		 * @generated
		 */
		EClass POPULATION = eINSTANCE.getPopulation();

		/**
		 * The meta object literal for the '<em><b>Households</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION__HOUSEHOLDS = eINSTANCE.getPopulation_Households();

		/**
		 * The meta object literal for the '<em><b>Businesses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION__BUSINESSES = eINSTANCE.getPopulation_Businesses();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.localEntities.impl.BusinessImpl <em>Business</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.localEntities.impl.BusinessImpl
		 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getBusiness()
		 * @generated
		 */
		EClass BUSINESS = eINSTANCE.getBusiness();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS__BRANCHES = eINSTANCE.getBusiness_Branches();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.localEntities.impl.ShipmentConsumerProducerImpl <em>Shipment Consumer Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.localEntities.impl.ShipmentConsumerProducerImpl
		 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getShipmentConsumerProducer()
		 * @generated
		 */
		EClass SHIPMENT_CONSUMER_PRODUCER = eINSTANCE.getShipmentConsumerProducer();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.localEntities.impl.HouseholdImpl <em>Household</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.localEntities.impl.HouseholdImpl
		 * @see CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl#getHousehold()
		 * @generated
		 */
		EClass HOUSEHOLD = eINSTANCE.getHousehold();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSEHOLD__LOCATION = eINSTANCE.getHousehold_Location();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSEHOLD__MEMBER = eINSTANCE.getHousehold_Member();

	}

} //LocalEntitiesPackage
