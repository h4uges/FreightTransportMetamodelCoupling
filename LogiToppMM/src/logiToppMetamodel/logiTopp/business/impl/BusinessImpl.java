/**
 */
package logiToppMetamodel.logiTopp.business.impl;

import java.util.Collection;

import logiToppMetamodel.base.impl.NamedEntityImpl;

import logiToppMetamodel.logiTopp.business.Branch;
import logiToppMetamodel.logiTopp.business.BuildingType;
import logiToppMetamodel.logiTopp.business.Business;
import logiToppMetamodel.logiTopp.business.BusinessPackage;
import logiToppMetamodel.logiTopp.business.OpeningHour;

import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;

import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.business.impl.BusinessImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.impl.BusinessImpl#getBuildingType <em>Building Type</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.impl.BusinessImpl#getEmplyees <em>Emplyees</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.impl.BusinessImpl#getArea <em>Area</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.impl.BusinessImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.impl.BusinessImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.impl.BusinessImpl#getDeliveryPartners <em>Delivery Partners</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.impl.BusinessImpl#getPickUpPartners <em>Pick Up Partners</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.impl.BusinessImpl#getOpeningHours <em>Opening Hours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessImpl extends NamedEntityImpl implements Business {
	/**
	 * The default value of the '{@link #getBranch() <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected static final Branch BRANCH_EDEFAULT = Branch.A;

	/**
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected Branch branch = BRANCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildingType() <em>Building Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingType()
	 * @generated
	 * @ordered
	 */
	protected static final BuildingType BUILDING_TYPE_EDEFAULT = BuildingType.OTHER;

	/**
	 * The cached value of the '{@link #getBuildingType() <em>Building Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingType()
	 * @generated
	 * @ordered
	 */
	protected BuildingType buildingType = BUILDING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmplyees() <em>Emplyees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplyees()
	 * @generated
	 * @ordered
	 */
	protected static final int EMPLYEES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEmplyees() <em>Emplyees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplyees()
	 * @generated
	 * @ordered
	 */
	protected int emplyees = EMPLYEES_EDEFAULT;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final double AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected double area = AREA_EDEFAULT;

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
	 * The cached value of the '{@link #getDeliveryPartners() <em>Delivery Partners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryPartners()
	 * @generated
	 * @ordered
	 */
	protected EList<CEPServiceProvider> deliveryPartners;

	/**
	 * The cached value of the '{@link #getPickUpPartners() <em>Pick Up Partners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickUpPartners()
	 * @generated
	 * @ordered
	 */
	protected EList<CEPServiceProvider> pickUpPartners;

	/**
	 * The cached value of the '{@link #getOpeningHours() <em>Opening Hours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningHours()
	 * @generated
	 * @ordered
	 */
	protected EList<OpeningHour> openingHours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessPackage.Literals.BUSINESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch getBranch() {
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranch(Branch newBranch) {
		Branch oldBranch = branch;
		branch = newBranch == null ? BRANCH_EDEFAULT : newBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS__BRANCH, oldBranch, branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildingType getBuildingType() {
		return buildingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildingType(BuildingType newBuildingType) {
		BuildingType oldBuildingType = buildingType;
		buildingType = newBuildingType == null ? BUILDING_TYPE_EDEFAULT : newBuildingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS__BUILDING_TYPE, oldBuildingType, buildingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEmplyees() {
		return emplyees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplyees(int newEmplyees) {
		int oldEmplyees = emplyees;
		emplyees = newEmplyees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS__EMPLYEES, oldEmplyees, emplyees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArea(double newArea) {
		double oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS__AREA, oldArea, area));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessPackage.BUSINESS__ZONE, oldZone, zone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS__ZONE, oldZone, zone));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BusinessPackage.BUSINESS__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BusinessPackage.BUSINESS__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.BUSINESS__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CEPServiceProvider> getDeliveryPartners() {
		if (deliveryPartners == null) {
			deliveryPartners = new EObjectResolvingEList<CEPServiceProvider>(CEPServiceProvider.class, this, BusinessPackage.BUSINESS__DELIVERY_PARTNERS);
		}
		return deliveryPartners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CEPServiceProvider> getPickUpPartners() {
		if (pickUpPartners == null) {
			pickUpPartners = new EObjectResolvingEList<CEPServiceProvider>(CEPServiceProvider.class, this, BusinessPackage.BUSINESS__PICK_UP_PARTNERS);
		}
		return pickUpPartners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OpeningHour> getOpeningHours() {
		if (openingHours == null) {
			openingHours = new EObjectContainmentEList<OpeningHour>(OpeningHour.class, this, BusinessPackage.BUSINESS__OPENING_HOURS);
		}
		return openingHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessPackage.BUSINESS__LOCATION:
				return basicSetLocation(null, msgs);
			case BusinessPackage.BUSINESS__OPENING_HOURS:
				return ((InternalEList<?>)getOpeningHours()).basicRemove(otherEnd, msgs);
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
			case BusinessPackage.BUSINESS__BRANCH:
				return getBranch();
			case BusinessPackage.BUSINESS__BUILDING_TYPE:
				return getBuildingType();
			case BusinessPackage.BUSINESS__EMPLYEES:
				return getEmplyees();
			case BusinessPackage.BUSINESS__AREA:
				return getArea();
			case BusinessPackage.BUSINESS__ZONE:
				if (resolve) return getZone();
				return basicGetZone();
			case BusinessPackage.BUSINESS__LOCATION:
				return getLocation();
			case BusinessPackage.BUSINESS__DELIVERY_PARTNERS:
				return getDeliveryPartners();
			case BusinessPackage.BUSINESS__PICK_UP_PARTNERS:
				return getPickUpPartners();
			case BusinessPackage.BUSINESS__OPENING_HOURS:
				return getOpeningHours();
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
			case BusinessPackage.BUSINESS__BRANCH:
				setBranch((Branch)newValue);
				return;
			case BusinessPackage.BUSINESS__BUILDING_TYPE:
				setBuildingType((BuildingType)newValue);
				return;
			case BusinessPackage.BUSINESS__EMPLYEES:
				setEmplyees((Integer)newValue);
				return;
			case BusinessPackage.BUSINESS__AREA:
				setArea((Double)newValue);
				return;
			case BusinessPackage.BUSINESS__ZONE:
				setZone((Zone)newValue);
				return;
			case BusinessPackage.BUSINESS__LOCATION:
				setLocation((Location)newValue);
				return;
			case BusinessPackage.BUSINESS__DELIVERY_PARTNERS:
				getDeliveryPartners().clear();
				getDeliveryPartners().addAll((Collection<? extends CEPServiceProvider>)newValue);
				return;
			case BusinessPackage.BUSINESS__PICK_UP_PARTNERS:
				getPickUpPartners().clear();
				getPickUpPartners().addAll((Collection<? extends CEPServiceProvider>)newValue);
				return;
			case BusinessPackage.BUSINESS__OPENING_HOURS:
				getOpeningHours().clear();
				getOpeningHours().addAll((Collection<? extends OpeningHour>)newValue);
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
			case BusinessPackage.BUSINESS__BRANCH:
				setBranch(BRANCH_EDEFAULT);
				return;
			case BusinessPackage.BUSINESS__BUILDING_TYPE:
				setBuildingType(BUILDING_TYPE_EDEFAULT);
				return;
			case BusinessPackage.BUSINESS__EMPLYEES:
				setEmplyees(EMPLYEES_EDEFAULT);
				return;
			case BusinessPackage.BUSINESS__AREA:
				setArea(AREA_EDEFAULT);
				return;
			case BusinessPackage.BUSINESS__ZONE:
				setZone((Zone)null);
				return;
			case BusinessPackage.BUSINESS__LOCATION:
				setLocation((Location)null);
				return;
			case BusinessPackage.BUSINESS__DELIVERY_PARTNERS:
				getDeliveryPartners().clear();
				return;
			case BusinessPackage.BUSINESS__PICK_UP_PARTNERS:
				getPickUpPartners().clear();
				return;
			case BusinessPackage.BUSINESS__OPENING_HOURS:
				getOpeningHours().clear();
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
			case BusinessPackage.BUSINESS__BRANCH:
				return branch != BRANCH_EDEFAULT;
			case BusinessPackage.BUSINESS__BUILDING_TYPE:
				return buildingType != BUILDING_TYPE_EDEFAULT;
			case BusinessPackage.BUSINESS__EMPLYEES:
				return emplyees != EMPLYEES_EDEFAULT;
			case BusinessPackage.BUSINESS__AREA:
				return area != AREA_EDEFAULT;
			case BusinessPackage.BUSINESS__ZONE:
				return zone != null;
			case BusinessPackage.BUSINESS__LOCATION:
				return location != null;
			case BusinessPackage.BUSINESS__DELIVERY_PARTNERS:
				return deliveryPartners != null && !deliveryPartners.isEmpty();
			case BusinessPackage.BUSINESS__PICK_UP_PARTNERS:
				return pickUpPartners != null && !pickUpPartners.isEmpty();
			case BusinessPackage.BUSINESS__OPENING_HOURS:
				return openingHours != null && !openingHours.isEmpty();
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
		result.append(" (branch: ");
		result.append(branch);
		result.append(", buildingType: ");
		result.append(buildingType);
		result.append(", emplyees: ");
		result.append(emplyees);
		result.append(", area: ");
		result.append(area);
		result.append(')');
		return result.toString();
	}

} //BusinessImpl
