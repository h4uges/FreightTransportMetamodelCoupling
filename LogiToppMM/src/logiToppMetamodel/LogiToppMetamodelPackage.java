/**
 */
package logiToppMetamodel;

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
 * @see logiToppMetamodel.LogiToppMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface LogiToppMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logiToppMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logiToppMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogiToppMetamodelPackage eINSTANCE = logiToppMetamodel.impl.LogiToppMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.impl.DemandImpl <em>Demand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.impl.DemandImpl
	 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getDemand()
	 * @generated
	 */
	int DEMAND = 0;

	/**
	 * The feature id for the '<em><b>Parcels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND__PARCELS = 0;

	/**
	 * The number of structural features of the '<em>Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.impl.PopulationImpl <em>Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.impl.PopulationImpl
	 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getPopulation()
	 * @generated
	 */
	int POPULATION = 1;

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
	 * The meta object id for the '{@link logiToppMetamodel.impl.TransportInfrastructureImpl <em>Transport Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.impl.TransportInfrastructureImpl
	 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getTransportInfrastructure()
	 * @generated
	 */
	int TRANSPORT_INFRASTRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Timetable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INFRASTRUCTURE__TIMETABLE = 0;

	/**
	 * The feature id for the '<em><b>Cep Service Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INFRASTRUCTURE__CEP_SERVICE_PROVIDERS = 1;

	/**
	 * The number of structural features of the '<em>Transport Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INFRASTRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transport Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_INFRASTRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.impl.SolutionImpl
	 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 3;

	/**
	 * The feature id for the '<em><b>Planned Tours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__PLANNED_TOURS = 0;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.impl.DemandExchangeRootImpl <em>Demand Exchange Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.impl.DemandExchangeRootImpl
	 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getDemandExchangeRoot()
	 * @generated
	 */
	int DEMAND_EXCHANGE_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_EXCHANGE_ROOT__DEMAND = 0;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_EXCHANGE_ROOT__POPULATION = 1;

	/**
	 * The feature id for the '<em><b>Transport Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_EXCHANGE_ROOT__NETWORK = 3;

	/**
	 * The number of structural features of the '<em>Demand Exchange Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_EXCHANGE_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Demand Exchange Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_EXCHANGE_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.impl.SolutionExchangeRootImpl <em>Solution Exchange Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.impl.SolutionExchangeRootImpl
	 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getSolutionExchangeRoot()
	 * @generated
	 */
	int SOLUTION_EXCHANGE_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXCHANGE_ROOT__DEMAND = DEMAND_EXCHANGE_ROOT__DEMAND;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXCHANGE_ROOT__POPULATION = DEMAND_EXCHANGE_ROOT__POPULATION;

	/**
	 * The feature id for the '<em><b>Transport Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXCHANGE_ROOT__TRANSPORT_NETWORK = DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXCHANGE_ROOT__NETWORK = DEMAND_EXCHANGE_ROOT__NETWORK;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXCHANGE_ROOT__SOLUTION = DEMAND_EXCHANGE_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution Exchange Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXCHANGE_ROOT_FEATURE_COUNT = DEMAND_EXCHANGE_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solution Exchange Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_EXCHANGE_ROOT_OPERATION_COUNT = DEMAND_EXCHANGE_ROOT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.Demand <em>Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demand</em>'.
	 * @see logiToppMetamodel.Demand
	 * @generated
	 */
	EClass getDemand();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.Demand#getParcels <em>Parcels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parcels</em>'.
	 * @see logiToppMetamodel.Demand#getParcels()
	 * @see #getDemand()
	 * @generated
	 */
	EReference getDemand_Parcels();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population</em>'.
	 * @see logiToppMetamodel.Population
	 * @generated
	 */
	EClass getPopulation();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.Population#getHouseholds <em>Households</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Households</em>'.
	 * @see logiToppMetamodel.Population#getHouseholds()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_Households();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.Population#getBusinesses <em>Businesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Businesses</em>'.
	 * @see logiToppMetamodel.Population#getBusinesses()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_Businesses();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.TransportInfrastructure <em>Transport Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Infrastructure</em>'.
	 * @see logiToppMetamodel.TransportInfrastructure
	 * @generated
	 */
	EClass getTransportInfrastructure();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.TransportInfrastructure#getTimetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timetable</em>'.
	 * @see logiToppMetamodel.TransportInfrastructure#getTimetable()
	 * @see #getTransportInfrastructure()
	 * @generated
	 */
	EReference getTransportInfrastructure_Timetable();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.TransportInfrastructure#getCepServiceProviders <em>Cep Service Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cep Service Providers</em>'.
	 * @see logiToppMetamodel.TransportInfrastructure#getCepServiceProviders()
	 * @see #getTransportInfrastructure()
	 * @generated
	 */
	EReference getTransportInfrastructure_CepServiceProviders();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see logiToppMetamodel.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.Solution#getPlannedTours <em>Planned Tours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Planned Tours</em>'.
	 * @see logiToppMetamodel.Solution#getPlannedTours()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_PlannedTours();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.DemandExchangeRoot <em>Demand Exchange Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demand Exchange Root</em>'.
	 * @see logiToppMetamodel.DemandExchangeRoot
	 * @generated
	 */
	EClass getDemandExchangeRoot();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.DemandExchangeRoot#getDemand <em>Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Demand</em>'.
	 * @see logiToppMetamodel.DemandExchangeRoot#getDemand()
	 * @see #getDemandExchangeRoot()
	 * @generated
	 */
	EReference getDemandExchangeRoot_Demand();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.DemandExchangeRoot#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Population</em>'.
	 * @see logiToppMetamodel.DemandExchangeRoot#getPopulation()
	 * @see #getDemandExchangeRoot()
	 * @generated
	 */
	EReference getDemandExchangeRoot_Population();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.DemandExchangeRoot#getTransportNetwork <em>Transport Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Network</em>'.
	 * @see logiToppMetamodel.DemandExchangeRoot#getTransportNetwork()
	 * @see #getDemandExchangeRoot()
	 * @generated
	 */
	EReference getDemandExchangeRoot_TransportNetwork();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.DemandExchangeRoot#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see logiToppMetamodel.DemandExchangeRoot#getNetwork()
	 * @see #getDemandExchangeRoot()
	 * @generated
	 */
	EReference getDemandExchangeRoot_Network();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.SolutionExchangeRoot <em>Solution Exchange Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Exchange Root</em>'.
	 * @see logiToppMetamodel.SolutionExchangeRoot
	 * @generated
	 */
	EClass getSolutionExchangeRoot();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.SolutionExchangeRoot#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Solution</em>'.
	 * @see logiToppMetamodel.SolutionExchangeRoot#getSolution()
	 * @see #getSolutionExchangeRoot()
	 * @generated
	 */
	EReference getSolutionExchangeRoot_Solution();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogiToppMetamodelFactory getLogiToppMetamodelFactory();

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
		 * The meta object literal for the '{@link logiToppMetamodel.impl.DemandImpl <em>Demand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.impl.DemandImpl
		 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getDemand()
		 * @generated
		 */
		EClass DEMAND = eINSTANCE.getDemand();

		/**
		 * The meta object literal for the '<em><b>Parcels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMAND__PARCELS = eINSTANCE.getDemand_Parcels();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.impl.PopulationImpl <em>Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.impl.PopulationImpl
		 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getPopulation()
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
		 * The meta object literal for the '{@link logiToppMetamodel.impl.TransportInfrastructureImpl <em>Transport Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.impl.TransportInfrastructureImpl
		 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getTransportInfrastructure()
		 * @generated
		 */
		EClass TRANSPORT_INFRASTRUCTURE = eINSTANCE.getTransportInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Timetable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_INFRASTRUCTURE__TIMETABLE = eINSTANCE.getTransportInfrastructure_Timetable();

		/**
		 * The meta object literal for the '<em><b>Cep Service Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_INFRASTRUCTURE__CEP_SERVICE_PROVIDERS = eINSTANCE.getTransportInfrastructure_CepServiceProviders();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.impl.SolutionImpl
		 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Planned Tours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__PLANNED_TOURS = eINSTANCE.getSolution_PlannedTours();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.impl.DemandExchangeRootImpl <em>Demand Exchange Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.impl.DemandExchangeRootImpl
		 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getDemandExchangeRoot()
		 * @generated
		 */
		EClass DEMAND_EXCHANGE_ROOT = eINSTANCE.getDemandExchangeRoot();

		/**
		 * The meta object literal for the '<em><b>Demand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMAND_EXCHANGE_ROOT__DEMAND = eINSTANCE.getDemandExchangeRoot_Demand();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMAND_EXCHANGE_ROOT__POPULATION = eINSTANCE.getDemandExchangeRoot_Population();

		/**
		 * The meta object literal for the '<em><b>Transport Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK = eINSTANCE.getDemandExchangeRoot_TransportNetwork();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMAND_EXCHANGE_ROOT__NETWORK = eINSTANCE.getDemandExchangeRoot_Network();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.impl.SolutionExchangeRootImpl <em>Solution Exchange Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.impl.SolutionExchangeRootImpl
		 * @see logiToppMetamodel.impl.LogiToppMetamodelPackageImpl#getSolutionExchangeRoot()
		 * @generated
		 */
		EClass SOLUTION_EXCHANGE_ROOT = eINSTANCE.getSolutionExchangeRoot();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_EXCHANGE_ROOT__SOLUTION = eINSTANCE.getSolutionExchangeRoot_Solution();

	}

} //LogiToppMetamodelPackage
