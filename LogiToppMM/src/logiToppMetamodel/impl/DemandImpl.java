/**
 */
package logiToppMetamodel.impl;

import java.util.Collection;

import logiToppMetamodel.Demand;
import logiToppMetamodel.LogiToppMetamodelPackage;

import logiToppMetamodel.logiTopp.parcels.Parcel;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Demand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.impl.DemandImpl#getParcels <em>Parcels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemandImpl extends MinimalEObjectImpl.Container implements Demand {
	/**
	 * The cached value of the '{@link #getParcels() <em>Parcels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParcels()
	 * @generated
	 * @ordered
	 */
	protected EList<Parcel> parcels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogiToppMetamodelPackage.Literals.DEMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parcel> getParcels() {
		if (parcels == null) {
			parcels = new EObjectContainmentEList<Parcel>(Parcel.class, this, LogiToppMetamodelPackage.DEMAND__PARCELS);
		}
		return parcels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogiToppMetamodelPackage.DEMAND__PARCELS:
				return ((InternalEList<?>)getParcels()).basicRemove(otherEnd, msgs);
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
			case LogiToppMetamodelPackage.DEMAND__PARCELS:
				return getParcels();
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
			case LogiToppMetamodelPackage.DEMAND__PARCELS:
				getParcels().clear();
				getParcels().addAll((Collection<? extends Parcel>)newValue);
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
			case LogiToppMetamodelPackage.DEMAND__PARCELS:
				getParcels().clear();
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
			case LogiToppMetamodelPackage.DEMAND__PARCELS:
				return parcels != null && !parcels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DemandImpl
