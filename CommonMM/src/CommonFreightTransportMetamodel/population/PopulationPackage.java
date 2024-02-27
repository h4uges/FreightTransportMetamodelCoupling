/**
 */
package CommonFreightTransportMetamodel.population;

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
 * @see CommonFreightTransportMetamodel.population.PopulationFactory
 * @model kind="package"
 * @generated
 */
public interface PopulationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "population";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/commonFreightTransportMetamodel/population";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "population";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PopulationPackage eINSTANCE = CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl.init();

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.population.impl.ShipmentConsumerProducerImpl <em>Shipment Consumer Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.population.impl.ShipmentConsumerProducerImpl
	 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getShipmentConsumerProducer()
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
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.population.impl.BusinessBranchImpl <em>Business Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.population.impl.BusinessBranchImpl
	 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getBusinessBranch()
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
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.population.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.population.impl.PersonImpl
	 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getPerson()
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
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = SHIPMENT_CONSUMER_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = SHIPMENT_CONSUMER_PRODUCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.population.impl.PopulationImpl <em>Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.population.impl.PopulationImpl
	 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getPopulation()
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
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.population.impl.BusinessImpl <em>Business</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.population.impl.BusinessImpl
	 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getBusiness()
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
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.population.impl.HouseholdImpl <em>Household</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.population.impl.HouseholdImpl
	 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getHousehold()
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
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__MEMBER = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__LOCATION = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

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
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.population.BusinessBranch <em>Business Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Branch</em>'.
	 * @see CommonFreightTransportMetamodel.population.BusinessBranch
	 * @generated
	 */
	EClass getBusinessBranch();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.population.BusinessBranch#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see CommonFreightTransportMetamodel.population.BusinessBranch#getLocation()
	 * @see #getBusinessBranch()
	 * @generated
	 */
	EReference getBusinessBranch_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.population.BusinessBranch#getOpeningHours <em>Opening Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opening Hours</em>'.
	 * @see CommonFreightTransportMetamodel.population.BusinessBranch#getOpeningHours()
	 * @see #getBusinessBranch()
	 * @generated
	 */
	EReference getBusinessBranch_OpeningHours();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.population.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see CommonFreightTransportMetamodel.population.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.population.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population</em>'.
	 * @see CommonFreightTransportMetamodel.population.Population
	 * @generated
	 */
	EClass getPopulation();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.population.Population#getHouseholds <em>Households</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Households</em>'.
	 * @see CommonFreightTransportMetamodel.population.Population#getHouseholds()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_Households();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.population.Population#getBusinesses <em>Businesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Businesses</em>'.
	 * @see CommonFreightTransportMetamodel.population.Population#getBusinesses()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_Businesses();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.population.Business <em>Business</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business</em>'.
	 * @see CommonFreightTransportMetamodel.population.Business
	 * @generated
	 */
	EClass getBusiness();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.population.Business#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see CommonFreightTransportMetamodel.population.Business#getBranches()
	 * @see #getBusiness()
	 * @generated
	 */
	EReference getBusiness_Branches();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.population.ShipmentConsumerProducer <em>Shipment Consumer Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Consumer Producer</em>'.
	 * @see CommonFreightTransportMetamodel.population.ShipmentConsumerProducer
	 * @generated
	 */
	EClass getShipmentConsumerProducer();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.population.Household <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Household</em>'.
	 * @see CommonFreightTransportMetamodel.population.Household
	 * @generated
	 */
	EClass getHousehold();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.population.Household#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see CommonFreightTransportMetamodel.population.Household#getMember()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Member();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.population.Household#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see CommonFreightTransportMetamodel.population.Household#getLocation()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Location();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PopulationFactory getPopulationFactory();

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
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.population.impl.BusinessBranchImpl <em>Business Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.population.impl.BusinessBranchImpl
		 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getBusinessBranch()
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
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.population.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.population.impl.PersonImpl
		 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.population.impl.PopulationImpl <em>Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.population.impl.PopulationImpl
		 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getPopulation()
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
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.population.impl.BusinessImpl <em>Business</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.population.impl.BusinessImpl
		 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getBusiness()
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
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.population.impl.ShipmentConsumerProducerImpl <em>Shipment Consumer Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.population.impl.ShipmentConsumerProducerImpl
		 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getShipmentConsumerProducer()
		 * @generated
		 */
		EClass SHIPMENT_CONSUMER_PRODUCER = eINSTANCE.getShipmentConsumerProducer();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.population.impl.HouseholdImpl <em>Household</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.population.impl.HouseholdImpl
		 * @see CommonFreightTransportMetamodel.population.impl.PopulationPackageImpl#getHousehold()
		 * @generated
		 */
		EClass HOUSEHOLD = eINSTANCE.getHousehold();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSEHOLD__MEMBER = eINSTANCE.getHousehold_Member();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSEHOLD__LOCATION = eINSTANCE.getHousehold_Location();

	}

} //PopulationPackage
