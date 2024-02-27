/**
 */
package logiToppMetamodel.logiTopp.distribution.impl;

import logiToppMetamodel.base.impl.NamedEntityImpl;

import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.distribution.DistributionPackage;

import logiToppMetamodel.logiTopp.distribution.fleet.Fleet;

import logiToppMetamodel.logiTopp.distribution.region.RegionalReach;

import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Center</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.impl.DistributionCenterImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.impl.DistributionCenterImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.impl.DistributionCenterImpl#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.impl.DistributionCenterImpl#getFleet <em>Fleet</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.impl.DistributionCenterImpl#getRegionalStructure <em>Regional Structure</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.impl.DistributionCenterImpl#getCEPSP <em>CEPSP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributionCenterImpl extends NamedEntityImpl implements DistributionCenter {
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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #getAttempts() <em>Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTEMPTS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getAttempts() <em>Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempts()
	 * @generated
	 * @ordered
	 */
	protected int attempts = ATTEMPTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFleet() <em>Fleet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFleet()
	 * @generated
	 * @ordered
	 */
	protected Fleet fleet;

	/**
	 * The cached value of the '{@link #getRegionalStructure() <em>Regional Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionalStructure()
	 * @generated
	 * @ordered
	 */
	protected RegionalReach regionalStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionCenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DistributionPackage.Literals.DISTRIBUTION_CENTER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DistributionPackage.DISTRIBUTION_CENTER__ZONE, oldZone, zone));
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
	@Override
	public void setZone(Zone newZone) {
		Zone oldZone = zone;
		zone = newZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DistributionPackage.DISTRIBUTION_CENTER__ZONE, oldZone, zone));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DistributionPackage.DISTRIBUTION_CENTER__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DistributionPackage.DISTRIBUTION_CENTER__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DistributionPackage.DISTRIBUTION_CENTER__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DistributionPackage.DISTRIBUTION_CENTER__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAttempts() {
		return attempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttempts(int newAttempts) {
		int oldAttempts = attempts;
		attempts = newAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DistributionPackage.DISTRIBUTION_CENTER__ATTEMPTS, oldAttempts, attempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fleet getFleet() {
		return fleet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFleet(Fleet newFleet, NotificationChain msgs) {
		Fleet oldFleet = fleet;
		fleet = newFleet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DistributionPackage.DISTRIBUTION_CENTER__FLEET, oldFleet, newFleet);
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
	public void setFleet(Fleet newFleet) {
		if (newFleet != fleet) {
			NotificationChain msgs = null;
			if (fleet != null)
				msgs = ((InternalEObject)fleet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DistributionPackage.DISTRIBUTION_CENTER__FLEET, null, msgs);
			if (newFleet != null)
				msgs = ((InternalEObject)newFleet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DistributionPackage.DISTRIBUTION_CENTER__FLEET, null, msgs);
			msgs = basicSetFleet(newFleet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DistributionPackage.DISTRIBUTION_CENTER__FLEET, newFleet, newFleet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionalReach getRegionalStructure() {
		return regionalStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionalStructure(RegionalReach newRegionalStructure, NotificationChain msgs) {
		RegionalReach oldRegionalStructure = regionalStructure;
		regionalStructure = newRegionalStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DistributionPackage.DISTRIBUTION_CENTER__REGIONAL_STRUCTURE, oldRegionalStructure, newRegionalStructure);
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
	public void setRegionalStructure(RegionalReach newRegionalStructure) {
		if (newRegionalStructure != regionalStructure) {
			NotificationChain msgs = null;
			if (regionalStructure != null)
				msgs = ((InternalEObject)regionalStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DistributionPackage.DISTRIBUTION_CENTER__REGIONAL_STRUCTURE, null, msgs);
			if (newRegionalStructure != null)
				msgs = ((InternalEObject)newRegionalStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DistributionPackage.DISTRIBUTION_CENTER__REGIONAL_STRUCTURE, null, msgs);
			msgs = basicSetRegionalStructure(newRegionalStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DistributionPackage.DISTRIBUTION_CENTER__REGIONAL_STRUCTURE, newRegionalStructure, newRegionalStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CEPServiceProvider getCEPSP() {
		if (eContainerFeatureID() != DistributionPackage.DISTRIBUTION_CENTER__CEPSP) return null;
		return (CEPServiceProvider)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCEPSP(CEPServiceProvider newCEPSP, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCEPSP, DistributionPackage.DISTRIBUTION_CENTER__CEPSP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCEPSP(CEPServiceProvider newCEPSP) {
		if (newCEPSP != eInternalContainer() || (eContainerFeatureID() != DistributionPackage.DISTRIBUTION_CENTER__CEPSP && newCEPSP != null)) {
			if (EcoreUtil.isAncestor(this, newCEPSP))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCEPSP != null)
				msgs = ((InternalEObject)newCEPSP).eInverseAdd(this, DistributionPackage.CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS, CEPServiceProvider.class, msgs);
			msgs = basicSetCEPSP(newCEPSP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DistributionPackage.DISTRIBUTION_CENTER__CEPSP, newCEPSP, newCEPSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DistributionPackage.DISTRIBUTION_CENTER__CEPSP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCEPSP((CEPServiceProvider)otherEnd, msgs);
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
			case DistributionPackage.DISTRIBUTION_CENTER__LOCATION:
				return basicSetLocation(null, msgs);
			case DistributionPackage.DISTRIBUTION_CENTER__FLEET:
				return basicSetFleet(null, msgs);
			case DistributionPackage.DISTRIBUTION_CENTER__REGIONAL_STRUCTURE:
				return basicSetRegionalStructure(null, msgs);
			case DistributionPackage.DISTRIBUTION_CENTER__CEPSP:
				return basicSetCEPSP(null, msgs);
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
			case DistributionPackage.DISTRIBUTION_CENTER__CEPSP:
				return eInternalContainer().eInverseRemove(this, DistributionPackage.CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS, CEPServiceProvider.class, msgs);
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
			case DistributionPackage.DISTRIBUTION_CENTER__ZONE:
				if (resolve) return getZone();
				return basicGetZone();
			case DistributionPackage.DISTRIBUTION_CENTER__LOCATION:
				return getLocation();
			case DistributionPackage.DISTRIBUTION_CENTER__ATTEMPTS:
				return getAttempts();
			case DistributionPackage.DISTRIBUTION_CENTER__FLEET:
				return getFleet();
			case DistributionPackage.DISTRIBUTION_CENTER__REGIONAL_STRUCTURE:
				return getRegionalStructure();
			case DistributionPackage.DISTRIBUTION_CENTER__CEPSP:
				return getCEPSP();
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
			case DistributionPackage.DISTRIBUTION_CENTER__ZONE:
				setZone((Zone)newValue);
				return;
			case DistributionPackage.DISTRIBUTION_CENTER__LOCATION:
				setLocation((Location)newValue);
				return;
			case DistributionPackage.DISTRIBUTION_CENTER__ATTEMPTS:
				setAttempts((Integer)newValue);
				return;
			case DistributionPackage.DISTRIBUTION_CENTER__FLEET:
				setFleet((Fleet)newValue);
				return;
			case DistributionPackage.DISTRIBUTION_CENTER__REGIONAL_STRUCTURE:
				setRegionalStructure((RegionalReach)newValue);
				return;
			case DistributionPackage.DISTRIBUTION_CENTER__CEPSP:
				setCEPSP((CEPServiceProvider)newValue);
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
			case DistributionPackage.DISTRIBUTION_CENTER__ZONE:
				setZone((Zone)null);
				return;
			case DistributionPackage.DISTRIBUTION_CENTER__LOCATION:
				setLocation((Location)null);
				return;
			case DistributionPackage.DISTRIBUTION_CENTER__ATTEMPTS:
				setAttempts(ATTEMPTS_EDEFAULT);
				return;
			case DistributionPackage.DISTRIBUTION_CENTER__FLEET:
				setFleet((Fleet)null);
				return;
			case DistributionPackage.DISTRIBUTION_CENTER__REGIONAL_STRUCTURE:
				setRegionalStructure((RegionalReach)null);
				return;
			case DistributionPackage.DISTRIBUTION_CENTER__CEPSP:
				setCEPSP((CEPServiceProvider)null);
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
			case DistributionPackage.DISTRIBUTION_CENTER__ZONE:
				return zone != null;
			case DistributionPackage.DISTRIBUTION_CENTER__LOCATION:
				return location != null;
			case DistributionPackage.DISTRIBUTION_CENTER__ATTEMPTS:
				return attempts != ATTEMPTS_EDEFAULT;
			case DistributionPackage.DISTRIBUTION_CENTER__FLEET:
				return fleet != null;
			case DistributionPackage.DISTRIBUTION_CENTER__REGIONAL_STRUCTURE:
				return regionalStructure != null;
			case DistributionPackage.DISTRIBUTION_CENTER__CEPSP:
				return getCEPSP() != null;
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
		result.append(" (attempts: ");
		result.append(attempts);
		result.append(')');
		return result.toString();
	}

} //DistributionCenterImpl
