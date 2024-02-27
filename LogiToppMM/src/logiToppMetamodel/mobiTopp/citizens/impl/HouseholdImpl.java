/**
 */
package logiToppMetamodel.mobiTopp.citizens.impl;

import java.util.Collection;

import logiToppMetamodel.base.impl.EntityImpl;

import logiToppMetamodel.mobiTopp.citizens.CitizensPackage;
import logiToppMetamodel.mobiTopp.citizens.Household;
import logiToppMetamodel.mobiTopp.citizens.Person;

import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.NetworkPackage;
import logiToppMetamodel.mobiTopp.network.Zone;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Household</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.citizens.impl.HouseholdImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.citizens.impl.HouseholdImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.citizens.impl.HouseholdImpl#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HouseholdImpl extends EntityImpl implements Household {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

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
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected Zone zone;

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
		return CitizensPackage.Literals.HOUSEHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CitizensPackage.HOUSEHOLD__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CitizensPackage.HOUSEHOLD__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CitizensPackage.HOUSEHOLD__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitizensPackage.HOUSEHOLD__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getMembers() {
		if (members == null) {
			members = new EObjectContainmentWithInverseEList<Person>(Person.class, this, CitizensPackage.HOUSEHOLD__MEMBERS, CitizensPackage.PERSON__HOUSEHOLD);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zone getZone() {
		if (zone != null && zone.eIsProxy()) {
			InternalEObject oldZone = (InternalEObject)zone;
			zone = (Zone)eResolveProxy(oldZone);
			if (zone != oldZone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CitizensPackage.HOUSEHOLD__ZONE, oldZone, zone));
			}
		}
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone basicGetZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZone(Zone newZone, NotificationChain msgs) {
		Zone oldZone = zone;
		zone = newZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CitizensPackage.HOUSEHOLD__ZONE, oldZone, newZone);
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
	public void setZone(Zone newZone) {
		if (newZone != zone) {
			NotificationChain msgs = null;
			if (zone != null)
				msgs = ((InternalEObject)zone).eInverseRemove(this, NetworkPackage.ZONE__HOUSEHOLDS, Zone.class, msgs);
			if (newZone != null)
				msgs = ((InternalEObject)newZone).eInverseAdd(this, NetworkPackage.ZONE__HOUSEHOLDS, Zone.class, msgs);
			msgs = basicSetZone(newZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitizensPackage.HOUSEHOLD__ZONE, newZone, newZone));
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
			case CitizensPackage.HOUSEHOLD__MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
			case CitizensPackage.HOUSEHOLD__ZONE:
				if (zone != null)
					msgs = ((InternalEObject)zone).eInverseRemove(this, NetworkPackage.ZONE__HOUSEHOLDS, Zone.class, msgs);
				return basicSetZone((Zone)otherEnd, msgs);
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
			case CitizensPackage.HOUSEHOLD__LOCATION:
				return basicSetLocation(null, msgs);
			case CitizensPackage.HOUSEHOLD__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case CitizensPackage.HOUSEHOLD__ZONE:
				return basicSetZone(null, msgs);
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
			case CitizensPackage.HOUSEHOLD__LOCATION:
				return getLocation();
			case CitizensPackage.HOUSEHOLD__MEMBERS:
				return getMembers();
			case CitizensPackage.HOUSEHOLD__ZONE:
				if (resolve) return getZone();
				return basicGetZone();
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
			case CitizensPackage.HOUSEHOLD__LOCATION:
				setLocation((Location)newValue);
				return;
			case CitizensPackage.HOUSEHOLD__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Person>)newValue);
				return;
			case CitizensPackage.HOUSEHOLD__ZONE:
				setZone((Zone)newValue);
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
			case CitizensPackage.HOUSEHOLD__LOCATION:
				setLocation((Location)null);
				return;
			case CitizensPackage.HOUSEHOLD__MEMBERS:
				getMembers().clear();
				return;
			case CitizensPackage.HOUSEHOLD__ZONE:
				setZone((Zone)null);
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
			case CitizensPackage.HOUSEHOLD__LOCATION:
				return location != null;
			case CitizensPackage.HOUSEHOLD__MEMBERS:
				return members != null && !members.isEmpty();
			case CitizensPackage.HOUSEHOLD__ZONE:
				return zone != null;
		}
		return super.eIsSet(featureID);
	}

} //HouseholdImpl
