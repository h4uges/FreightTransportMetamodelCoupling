/**
 */
package MATSimFreightMetamodel.matsim.households.impl;

import MATSimFreightMetamodel.base.impl.EntityImpl;

import MATSimFreightMetamodel.matsim.core.population.Person;

import MATSimFreightMetamodel.matsim.households.Household;
import MATSimFreightMetamodel.matsim.households.HouseholdsPackage;
import MATSimFreightMetamodel.matsim.households.Income;

import MATSimFreightMetamodel.matsim.vehicles.Vehicle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Household</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.impl.HouseholdImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.impl.HouseholdImpl#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.impl.HouseholdImpl#getIncome <em>Income</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HouseholdImpl extends EntityImpl implements Household {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> members;

	/**
	 * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> vehicles;

	/**
	 * The cached value of the '{@link #getIncome() <em>Income</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncome()
	 * @generated
	 * @ordered
	 */
	protected Income income;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HouseholdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HouseholdsPackage.Literals.HOUSEHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Person>(Person.class, this, HouseholdsPackage.HOUSEHOLD__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vehicle> getVehicles() {
		if (vehicles == null) {
			vehicles = new EObjectContainmentEList<Vehicle>(Vehicle.class, this, HouseholdsPackage.HOUSEHOLD__VEHICLES);
		}
		return vehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Income getIncome() {
		return income;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncome(Income newIncome, NotificationChain msgs) {
		Income oldIncome = income;
		income = newIncome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HouseholdsPackage.HOUSEHOLD__INCOME, oldIncome, newIncome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncome(Income newIncome) {
		if (newIncome != income) {
			NotificationChain msgs = null;
			if (income != null)
				msgs = ((InternalEObject)income).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HouseholdsPackage.HOUSEHOLD__INCOME, null, msgs);
			if (newIncome != null)
				msgs = ((InternalEObject)newIncome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HouseholdsPackage.HOUSEHOLD__INCOME, null, msgs);
			msgs = basicSetIncome(newIncome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HouseholdsPackage.HOUSEHOLD__INCOME, newIncome, newIncome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HouseholdsPackage.HOUSEHOLD__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case HouseholdsPackage.HOUSEHOLD__VEHICLES:
				return ((InternalEList<?>)getVehicles()).basicRemove(otherEnd, msgs);
			case HouseholdsPackage.HOUSEHOLD__INCOME:
				return basicSetIncome(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HouseholdsPackage.HOUSEHOLD__MEMBERS:
				return getMembers();
			case HouseholdsPackage.HOUSEHOLD__VEHICLES:
				return getVehicles();
			case HouseholdsPackage.HOUSEHOLD__INCOME:
				return getIncome();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HouseholdsPackage.HOUSEHOLD__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Person>)newValue);
				return;
			case HouseholdsPackage.HOUSEHOLD__VEHICLES:
				getVehicles().clear();
				getVehicles().addAll((Collection<? extends Vehicle>)newValue);
				return;
			case HouseholdsPackage.HOUSEHOLD__INCOME:
				setIncome((Income)newValue);
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
			case HouseholdsPackage.HOUSEHOLD__MEMBERS:
				getMembers().clear();
				return;
			case HouseholdsPackage.HOUSEHOLD__VEHICLES:
				getVehicles().clear();
				return;
			case HouseholdsPackage.HOUSEHOLD__INCOME:
				setIncome((Income)null);
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
			case HouseholdsPackage.HOUSEHOLD__MEMBERS:
				return members != null && !members.isEmpty();
			case HouseholdsPackage.HOUSEHOLD__VEHICLES:
				return vehicles != null && !vehicles.isEmpty();
			case HouseholdsPackage.HOUSEHOLD__INCOME:
				return income != null;
		}
		return super.eIsSet(featureID);
	}

} //HouseholdImpl
