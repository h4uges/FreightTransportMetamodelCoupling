/**
 */
package logiToppMetamodel.mobiTopp.citizens;

import logiToppMetamodel.base.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * - age
 * - employment
 * - gender
 * - graduation
 * - income
 * - hasBike
 * - hasAccessToCar
 * - hasPersonalCar
 * - hasCommuterTicket
 * - hasLicense
 * ? mobilityProviderCustomership
 * ? modeChoicePreferences (...)
 * 
 * * Planned activity program
 * * Realised activity program
 * 
 * - currentTrip
 * - car
 * - carUsage
 * - bike
 * - bikeUsage
 * 
 * missing: SimulationPersonPassenger, EmobilityPerson
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.citizens.Person#getHousehold <em>Household</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.citizens.Person#getAge <em>Age</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.citizens.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.citizens.Person#getEmployment <em>Employment</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.citizens.CitizensPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends Entity {
	/**
	 * Returns the value of the '<em><b>Household</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logiToppMetamodel.mobiTopp.citizens.Household#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Household</em>' container reference.
	 * @see #setHousehold(Household)
	 * @see logiToppMetamodel.mobiTopp.citizens.CitizensPackage#getPerson_Household()
	 * @see logiToppMetamodel.mobiTopp.citizens.Household#getMembers
	 * @model opposite="members" required="true" transient="false"
	 * @generated
	 */
	Household getHousehold();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.citizens.Person#getHousehold <em>Household</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Household</em>' container reference.
	 * @see #getHousehold()
	 * @generated
	 */
	void setHousehold(Household value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * The default value is <code>"99"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see logiToppMetamodel.mobiTopp.citizens.CitizensPackage#getPerson_Age()
	 * @model default="99" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.citizens.Person#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link logiToppMetamodel.mobiTopp.citizens.Gender}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see logiToppMetamodel.mobiTopp.citizens.Gender
	 * @see #setGender(Gender)
	 * @see logiToppMetamodel.mobiTopp.citizens.CitizensPackage#getPerson_Gender()
	 * @model required="true"
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.citizens.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see logiToppMetamodel.mobiTopp.citizens.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Employment</b></em>' attribute.
	 * The literals are from the enumeration {@link logiToppMetamodel.mobiTopp.citizens.Employment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employment</em>' attribute.
	 * @see logiToppMetamodel.mobiTopp.citizens.Employment
	 * @see #setEmployment(Employment)
	 * @see logiToppMetamodel.mobiTopp.citizens.CitizensPackage#getPerson_Employment()
	 * @model required="true"
	 * @generated
	 */
	Employment getEmployment();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.citizens.Person#getEmployment <em>Employment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employment</em>' attribute.
	 * @see logiToppMetamodel.mobiTopp.citizens.Employment
	 * @see #getEmployment()
	 * @generated
	 */
	void setEmployment(Employment value);

} // Person
