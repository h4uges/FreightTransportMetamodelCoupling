/**
 */
package MATSimFreightMetamodel.matsim.households.impl;

import MATSimFreightMetamodel.matsim.households.Household;
import MATSimFreightMetamodel.matsim.households.HouseholdsPackage;
import MATSimFreightMetamodel.matsim.households.Population;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.impl.PopulationImpl#getHouseholds <em>Households</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopulationImpl extends MinimalEObjectImpl.Container implements Population {
	/**
	 * The cached value of the '{@link #getHouseholds() <em>Households</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseholds()
	 * @generated
	 * @ordered
	 */
	protected EList<Household> households;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HouseholdsPackage.Literals.POPULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Household> getHouseholds() {
		if (households == null) {
			households = new EObjectContainmentEList<Household>(Household.class, this, HouseholdsPackage.POPULATION__HOUSEHOLDS);
		}
		return households;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HouseholdsPackage.POPULATION__HOUSEHOLDS:
				return ((InternalEList<?>)getHouseholds()).basicRemove(otherEnd, msgs);
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
			case HouseholdsPackage.POPULATION__HOUSEHOLDS:
				return getHouseholds();
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
			case HouseholdsPackage.POPULATION__HOUSEHOLDS:
				getHouseholds().clear();
				getHouseholds().addAll((Collection<? extends Household>)newValue);
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
			case HouseholdsPackage.POPULATION__HOUSEHOLDS:
				getHouseholds().clear();
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
			case HouseholdsPackage.POPULATION__HOUSEHOLDS:
				return households != null && !households.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PopulationImpl
