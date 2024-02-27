/**
 */
package CommonFreightTransportMetamodel.population.impl;

import CommonFreightTransportMetamodel.population.Business;
import CommonFreightTransportMetamodel.population.Household;
import CommonFreightTransportMetamodel.population.Population;
import CommonFreightTransportMetamodel.population.PopulationPackage;

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
 *   <li>{@link CommonFreightTransportMetamodel.population.impl.PopulationImpl#getHouseholds <em>Households</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.population.impl.PopulationImpl#getBusinesses <em>Businesses</em>}</li>
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
	 * The cached value of the '{@link #getBusinesses() <em>Businesses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinesses()
	 * @generated
	 * @ordered
	 */
	protected EList<Business> businesses;

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
		return PopulationPackage.Literals.POPULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Household> getHouseholds() {
		if (households == null) {
			households = new EObjectContainmentEList<Household>(Household.class, this, PopulationPackage.POPULATION__HOUSEHOLDS);
		}
		return households;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Business> getBusinesses() {
		if (businesses == null) {
			businesses = new EObjectContainmentEList<Business>(Business.class, this, PopulationPackage.POPULATION__BUSINESSES);
		}
		return businesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PopulationPackage.POPULATION__HOUSEHOLDS:
				return ((InternalEList<?>)getHouseholds()).basicRemove(otherEnd, msgs);
			case PopulationPackage.POPULATION__BUSINESSES:
				return ((InternalEList<?>)getBusinesses()).basicRemove(otherEnd, msgs);
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
			case PopulationPackage.POPULATION__HOUSEHOLDS:
				return getHouseholds();
			case PopulationPackage.POPULATION__BUSINESSES:
				return getBusinesses();
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
			case PopulationPackage.POPULATION__HOUSEHOLDS:
				getHouseholds().clear();
				getHouseholds().addAll((Collection<? extends Household>)newValue);
				return;
			case PopulationPackage.POPULATION__BUSINESSES:
				getBusinesses().clear();
				getBusinesses().addAll((Collection<? extends Business>)newValue);
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
			case PopulationPackage.POPULATION__HOUSEHOLDS:
				getHouseholds().clear();
				return;
			case PopulationPackage.POPULATION__BUSINESSES:
				getBusinesses().clear();
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
			case PopulationPackage.POPULATION__HOUSEHOLDS:
				return households != null && !households.isEmpty();
			case PopulationPackage.POPULATION__BUSINESSES:
				return businesses != null && !businesses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PopulationImpl
