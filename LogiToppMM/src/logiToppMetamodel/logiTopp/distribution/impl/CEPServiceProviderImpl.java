/**
 */
package logiToppMetamodel.logiTopp.distribution.impl;

import java.util.Collection;

import logiToppMetamodel.base.impl.NamedEntityImpl;

import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.distribution.DistributionPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CEP Service Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.impl.CEPServiceProviderImpl#getDistributionCenters <em>Distribution Centers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CEPServiceProviderImpl extends NamedEntityImpl implements CEPServiceProvider {
	/**
	 * The cached value of the '{@link #getDistributionCenters() <em>Distribution Centers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionCenters()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionCenter> distributionCenters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEPServiceProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DistributionPackage.Literals.CEP_SERVICE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DistributionCenter> getDistributionCenters() {
		if (distributionCenters == null) {
			distributionCenters = new EObjectContainmentWithInverseEList<DistributionCenter>(DistributionCenter.class, this, DistributionPackage.CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS, DistributionPackage.DISTRIBUTION_CENTER__CEPSP);
		}
		return distributionCenters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DistributionPackage.CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDistributionCenters()).basicAdd(otherEnd, msgs);
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
			case DistributionPackage.CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS:
				return ((InternalEList<?>)getDistributionCenters()).basicRemove(otherEnd, msgs);
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
			case DistributionPackage.CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS:
				return getDistributionCenters();
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
			case DistributionPackage.CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS:
				getDistributionCenters().clear();
				getDistributionCenters().addAll((Collection<? extends DistributionCenter>)newValue);
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
			case DistributionPackage.CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS:
				getDistributionCenters().clear();
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
			case DistributionPackage.CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS:
				return distributionCenters != null && !distributionCenters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CEPServiceProviderImpl
