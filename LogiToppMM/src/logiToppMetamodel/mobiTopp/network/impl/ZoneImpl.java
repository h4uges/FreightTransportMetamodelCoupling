/**
 */
package logiToppMetamodel.mobiTopp.network.impl;

import java.util.Collection;

import logiToppMetamodel.base.impl.NamedEntityImpl;

import logiToppMetamodel.mobiTopp.citizens.CitizensPackage;
import logiToppMetamodel.mobiTopp.citizens.Household;

import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.NetworkPackage;
import logiToppMetamodel.mobiTopp.network.Zone;
import logiToppMetamodel.mobiTopp.network.ZoneArea;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.impl.ZoneImpl#getCentroid <em>Centroid</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.impl.ZoneImpl#getTotalArea <em>Total Area</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.impl.ZoneImpl#getHouseholds <em>Households</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneImpl extends NamedEntityImpl implements Zone {
	/**
	 * The cached value of the '{@link #getCentroid() <em>Centroid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentroid()
	 * @generated
	 * @ordered
	 */
	protected Location centroid;

	/**
	 * The cached value of the '{@link #getTotalArea() <em>Total Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalArea()
	 * @generated
	 * @ordered
	 */
	protected ZoneArea totalArea;

	/**
	 * The cached value of the '{@link #getHouseholds() <em>Households</em>}' reference list.
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
	protected ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getCentroid() {
		return centroid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCentroid(Location newCentroid, NotificationChain msgs) {
		Location oldCentroid = centroid;
		centroid = newCentroid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkPackage.ZONE__CENTROID, oldCentroid, newCentroid);
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
	public void setCentroid(Location newCentroid) {
		if (newCentroid != centroid) {
			NotificationChain msgs = null;
			if (centroid != null)
				msgs = ((InternalEObject)centroid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.ZONE__CENTROID, null, msgs);
			if (newCentroid != null)
				msgs = ((InternalEObject)newCentroid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.ZONE__CENTROID, null, msgs);
			msgs = basicSetCentroid(newCentroid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ZONE__CENTROID, newCentroid, newCentroid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZoneArea getTotalArea() {
		return totalArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalArea(ZoneArea newTotalArea, NotificationChain msgs) {
		ZoneArea oldTotalArea = totalArea;
		totalArea = newTotalArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkPackage.ZONE__TOTAL_AREA, oldTotalArea, newTotalArea);
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
	public void setTotalArea(ZoneArea newTotalArea) {
		if (newTotalArea != totalArea) {
			NotificationChain msgs = null;
			if (totalArea != null)
				msgs = ((InternalEObject)totalArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.ZONE__TOTAL_AREA, null, msgs);
			if (newTotalArea != null)
				msgs = ((InternalEObject)newTotalArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.ZONE__TOTAL_AREA, null, msgs);
			msgs = basicSetTotalArea(newTotalArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ZONE__TOTAL_AREA, newTotalArea, newTotalArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Household> getHouseholds() {
		if (households == null) {
			households = new EObjectWithInverseResolvingEList<Household>(Household.class, this, NetworkPackage.ZONE__HOUSEHOLDS, CitizensPackage.HOUSEHOLD__ZONE);
		}
		return households;
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
			case NetworkPackage.ZONE__HOUSEHOLDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHouseholds()).basicAdd(otherEnd, msgs);
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
			case NetworkPackage.ZONE__CENTROID:
				return basicSetCentroid(null, msgs);
			case NetworkPackage.ZONE__TOTAL_AREA:
				return basicSetTotalArea(null, msgs);
			case NetworkPackage.ZONE__HOUSEHOLDS:
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
			case NetworkPackage.ZONE__CENTROID:
				return getCentroid();
			case NetworkPackage.ZONE__TOTAL_AREA:
				return getTotalArea();
			case NetworkPackage.ZONE__HOUSEHOLDS:
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
			case NetworkPackage.ZONE__CENTROID:
				setCentroid((Location)newValue);
				return;
			case NetworkPackage.ZONE__TOTAL_AREA:
				setTotalArea((ZoneArea)newValue);
				return;
			case NetworkPackage.ZONE__HOUSEHOLDS:
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
			case NetworkPackage.ZONE__CENTROID:
				setCentroid((Location)null);
				return;
			case NetworkPackage.ZONE__TOTAL_AREA:
				setTotalArea((ZoneArea)null);
				return;
			case NetworkPackage.ZONE__HOUSEHOLDS:
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
			case NetworkPackage.ZONE__CENTROID:
				return centroid != null;
			case NetworkPackage.ZONE__TOTAL_AREA:
				return totalArea != null;
			case NetworkPackage.ZONE__HOUSEHOLDS:
				return households != null && !households.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZoneImpl
