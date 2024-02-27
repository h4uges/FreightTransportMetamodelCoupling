/**
 */
package logiToppMetamodel.mobiTopp.population.impl;

import logiToppMetamodel.base.impl.EntityImpl;

import logiToppMetamodel.mobiTopp.population.Employment;
import logiToppMetamodel.mobiTopp.population.Gender;
import logiToppMetamodel.mobiTopp.population.Household;
import logiToppMetamodel.mobiTopp.population.Person;
import logiToppMetamodel.mobiTopp.population.PopulationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.population.impl.PersonImpl#getHousehold <em>Household</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.population.impl.PersonImpl#getAge <em>Age</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.population.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.population.impl.PersonImpl#getEmployment <em>Employment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends EntityImpl implements Person {
	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 99;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmployment() <em>Employment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployment()
	 * @generated
	 * @ordered
	 */
	protected static final Employment EMPLOYMENT_EDEFAULT = Employment.UNKNOWN;

	/**
	 * The cached value of the '{@link #getEmployment() <em>Employment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployment()
	 * @generated
	 * @ordered
	 */
	protected Employment employment = EMPLOYMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PopulationPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Household getHousehold() {
		if (eContainerFeatureID() != PopulationPackage.PERSON__HOUSEHOLD) return null;
		return (Household)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHousehold(Household newHousehold, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHousehold, PopulationPackage.PERSON__HOUSEHOLD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHousehold(Household newHousehold) {
		if (newHousehold != eInternalContainer() || (eContainerFeatureID() != PopulationPackage.PERSON__HOUSEHOLD && newHousehold != null)) {
			if (EcoreUtil.isAncestor(this, newHousehold))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHousehold != null)
				msgs = ((InternalEObject)newHousehold).eInverseAdd(this, PopulationPackage.HOUSEHOLD__MEMBERS, Household.class, msgs);
			msgs = basicSetHousehold(newHousehold, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PopulationPackage.PERSON__HOUSEHOLD, newHousehold, newHousehold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PopulationPackage.PERSON__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PopulationPackage.PERSON__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employment getEmployment() {
		return employment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployment(Employment newEmployment) {
		Employment oldEmployment = employment;
		employment = newEmployment == null ? EMPLOYMENT_EDEFAULT : newEmployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PopulationPackage.PERSON__EMPLOYMENT, oldEmployment, employment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PopulationPackage.PERSON__HOUSEHOLD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHousehold((Household)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PopulationPackage.PERSON__HOUSEHOLD:
				return basicSetHousehold(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PopulationPackage.PERSON__HOUSEHOLD:
				return eInternalContainer().eInverseRemove(this, PopulationPackage.HOUSEHOLD__MEMBERS, Household.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PopulationPackage.PERSON__HOUSEHOLD:
				return getHousehold();
			case PopulationPackage.PERSON__AGE:
				return getAge();
			case PopulationPackage.PERSON__GENDER:
				return getGender();
			case PopulationPackage.PERSON__EMPLOYMENT:
				return getEmployment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PopulationPackage.PERSON__HOUSEHOLD:
				setHousehold((Household)newValue);
				return;
			case PopulationPackage.PERSON__AGE:
				setAge((Integer)newValue);
				return;
			case PopulationPackage.PERSON__GENDER:
				setGender((Gender)newValue);
				return;
			case PopulationPackage.PERSON__EMPLOYMENT:
				setEmployment((Employment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PopulationPackage.PERSON__HOUSEHOLD:
				setHousehold((Household)null);
				return;
			case PopulationPackage.PERSON__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case PopulationPackage.PERSON__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case PopulationPackage.PERSON__EMPLOYMENT:
				setEmployment(EMPLOYMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PopulationPackage.PERSON__HOUSEHOLD:
				return getHousehold() != null;
			case PopulationPackage.PERSON__AGE:
				return age != AGE_EDEFAULT;
			case PopulationPackage.PERSON__GENDER:
				return gender != GENDER_EDEFAULT;
			case PopulationPackage.PERSON__EMPLOYMENT:
				return employment != EMPLOYMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (age: ");
		result.append(age);
		result.append(", gender: ");
		result.append(gender);
		result.append(", employment: ");
		result.append(employment);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
