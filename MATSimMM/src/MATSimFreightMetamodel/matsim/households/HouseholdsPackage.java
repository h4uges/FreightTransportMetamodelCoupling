/**
 */
package MATSimFreightMetamodel.matsim.households;

import MATSimFreightMetamodel.base.BasePackage;

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
 * @see MATSimFreightMetamodel.matsim.households.HouseholdsFactory
 * @model kind="package"
 * @generated
 */
public interface HouseholdsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "households";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/MATSimFreightMetamodel/matsim/households";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "households";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HouseholdsPackage eINSTANCE = MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl.init();

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.households.impl.HouseholdImpl <em>Household</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdImpl
	 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl#getHousehold()
	 * @generated
	 */
	int HOUSEHOLD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__MEMBERS = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__VEHICLES = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Income</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__INCOME = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Household</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Household</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.households.impl.PopulationImpl <em>Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.households.impl.PopulationImpl
	 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl#getPopulation()
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
	 * The number of structural features of the '<em>Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.households.impl.IncomeImpl <em>Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.households.impl.IncomeImpl
	 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl#getIncome()
	 * @generated
	 */
	int INCOME = 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Income</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__INCOME = 1;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__CURRENCY = 2;

	/**
	 * The number of structural features of the '<em>Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.households.IncomePeriod <em>Income Period</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.households.IncomePeriod
	 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl#getIncomePeriod()
	 * @generated
	 */
	int INCOME_PERIOD = 3;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.households.Currency <em>Currency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.households.Currency
	 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 4;


	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.matsim.households.Household <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Household</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.Household
	 * @generated
	 */
	EClass getHousehold();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.matsim.households.Household#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.Household#getMembers()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.matsim.households.Household#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicles</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.Household#getVehicles()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Vehicles();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.matsim.households.Household#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Income</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.Household#getIncome()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Income();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.matsim.households.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.Population
	 * @generated
	 */
	EClass getPopulation();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.matsim.households.Population#getHouseholds <em>Households</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Households</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.Population#getHouseholds()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_Households();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.matsim.households.Income <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.Income
	 * @generated
	 */
	EClass getIncome();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.households.Income#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.Income#getPeriod()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_Period();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.households.Income#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Income</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.Income#getIncome()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_Income();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.households.Income#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.Income#getCurrency()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_Currency();

	/**
	 * Returns the meta object for enum '{@link MATSimFreightMetamodel.matsim.households.IncomePeriod <em>Income Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Income Period</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.IncomePeriod
	 * @generated
	 */
	EEnum getIncomePeriod();

	/**
	 * Returns the meta object for enum '{@link MATSimFreightMetamodel.matsim.households.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Currency</em>'.
	 * @see MATSimFreightMetamodel.matsim.households.Currency
	 * @generated
	 */
	EEnum getCurrency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HouseholdsFactory getHouseholdsFactory();

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
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.households.impl.HouseholdImpl <em>Household</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdImpl
		 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl#getHousehold()
		 * @generated
		 */
		EClass HOUSEHOLD = eINSTANCE.getHousehold();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSEHOLD__MEMBERS = eINSTANCE.getHousehold_Members();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSEHOLD__VEHICLES = eINSTANCE.getHousehold_Vehicles();

		/**
		 * The meta object literal for the '<em><b>Income</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSEHOLD__INCOME = eINSTANCE.getHousehold_Income();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.households.impl.PopulationImpl <em>Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.households.impl.PopulationImpl
		 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl#getPopulation()
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
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.households.impl.IncomeImpl <em>Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.households.impl.IncomeImpl
		 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl#getIncome()
		 * @generated
		 */
		EClass INCOME = eINSTANCE.getIncome();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME__PERIOD = eINSTANCE.getIncome_Period();

		/**
		 * The meta object literal for the '<em><b>Income</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME__INCOME = eINSTANCE.getIncome_Income();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME__CURRENCY = eINSTANCE.getIncome_Currency();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.households.IncomePeriod <em>Income Period</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.households.IncomePeriod
		 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl#getIncomePeriod()
		 * @generated
		 */
		EEnum INCOME_PERIOD = eINSTANCE.getIncomePeriod();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.households.Currency <em>Currency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.households.Currency
		 * @see MATSimFreightMetamodel.matsim.households.impl.HouseholdsPackageImpl#getCurrency()
		 * @generated
		 */
		EEnum CURRENCY = eINSTANCE.getCurrency();

	}

} //HouseholdsPackage
