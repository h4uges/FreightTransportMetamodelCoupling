/**
 */
package logiToppMetamodel.mobiTopp.population;

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
 * @see logiToppMetamodel.mobiTopp.population.PopulationFactory
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
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/mobiTopp/population";

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
	PopulationPackage eINSTANCE = logiToppMetamodel.mobiTopp.population.impl.PopulationPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.population.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.population.impl.PersonImpl
	 * @see logiToppMetamodel.mobiTopp.population.impl.PopulationPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Household</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HOUSEHOLD = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Employment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMPLOYMENT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.population.impl.HouseholdImpl <em>Household</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.population.impl.HouseholdImpl
	 * @see logiToppMetamodel.mobiTopp.population.impl.PopulationPackageImpl#getHousehold()
	 * @generated
	 */
	int HOUSEHOLD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__LOCATION = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__MEMBERS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__ZONE = BasePackage.ENTITY_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.population.Employment <em>Employment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.population.Employment
	 * @see logiToppMetamodel.mobiTopp.population.impl.PopulationPackageImpl#getEmployment()
	 * @generated
	 */
	int EMPLOYMENT = 2;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.population.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.population.Gender
	 * @see logiToppMetamodel.mobiTopp.population.impl.PopulationPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 3;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.population.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see logiToppMetamodel.mobiTopp.population.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the container reference '{@link logiToppMetamodel.mobiTopp.population.Person#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Household</em>'.
	 * @see logiToppMetamodel.mobiTopp.population.Person#getHousehold()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Household();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.mobiTopp.population.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see logiToppMetamodel.mobiTopp.population.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.mobiTopp.population.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see logiToppMetamodel.mobiTopp.population.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.mobiTopp.population.Person#getEmployment <em>Employment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employment</em>'.
	 * @see logiToppMetamodel.mobiTopp.population.Person#getEmployment()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Employment();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.population.Household <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Household</em>'.
	 * @see logiToppMetamodel.mobiTopp.population.Household
	 * @generated
	 */
	EClass getHousehold();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.mobiTopp.population.Household#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see logiToppMetamodel.mobiTopp.population.Household#getLocation()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.mobiTopp.population.Household#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see logiToppMetamodel.mobiTopp.population.Household#getMembers()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Members();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.mobiTopp.population.Household#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zone</em>'.
	 * @see logiToppMetamodel.mobiTopp.population.Household#getZone()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Zone();

	/**
	 * Returns the meta object for enum '{@link logiToppMetamodel.mobiTopp.population.Employment <em>Employment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Employment</em>'.
	 * @see logiToppMetamodel.mobiTopp.population.Employment
	 * @generated
	 */
	EEnum getEmployment();

	/**
	 * Returns the meta object for enum '{@link logiToppMetamodel.mobiTopp.population.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see logiToppMetamodel.mobiTopp.population.Gender
	 * @generated
	 */
	EEnum getGender();

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
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.population.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.population.impl.PersonImpl
		 * @see logiToppMetamodel.mobiTopp.population.impl.PopulationPackageImpl#getPerson()
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
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Employment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMPLOYMENT = eINSTANCE.getPerson_Employment();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.population.impl.HouseholdImpl <em>Household</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.population.impl.HouseholdImpl
		 * @see logiToppMetamodel.mobiTopp.population.impl.PopulationPackageImpl#getHousehold()
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
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSEHOLD__MEMBERS = eINSTANCE.getHousehold_Members();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSEHOLD__ZONE = eINSTANCE.getHousehold_Zone();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.population.Employment <em>Employment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.population.Employment
		 * @see logiToppMetamodel.mobiTopp.population.impl.PopulationPackageImpl#getEmployment()
		 * @generated
		 */
		EEnum EMPLOYMENT = eINSTANCE.getEmployment();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.population.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.population.Gender
		 * @see logiToppMetamodel.mobiTopp.population.impl.PopulationPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

	}

} //PopulationPackage
