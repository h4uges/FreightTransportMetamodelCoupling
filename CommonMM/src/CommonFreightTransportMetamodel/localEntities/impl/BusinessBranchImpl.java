/**
 */
package CommonFreightTransportMetamodel.localEntities.impl;

import CommonFreightTransportMetamodel.localEntities.BusinessBranch;
import CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint;
import CommonFreightTransportMetamodel.utils.TimeWindow_;
import CommonFreightTransportMetamodel.utils.UtilsPackage;

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
 * An implementation of the model object '<em><b>Business Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.localEntities.impl.BusinessBranchImpl#getId <em>Id</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.localEntities.impl.BusinessBranchImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.localEntities.impl.BusinessBranchImpl#getOpeningHours <em>Opening Hours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessBranchImpl extends ShipmentConsumerProducerImpl implements BusinessBranch {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location_ location;

	/**
	 * The cached value of the '{@link #getOpeningHours() <em>Opening Hours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningHours()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeWindow_> openingHours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessBranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LocalEntitiesPackage.Literals.BUSINESS_BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalEntitiesPackage.BUSINESS_BRANCH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location_ getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location_ newLocation, NotificationChain msgs) {
		Location_ oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LocalEntitiesPackage.BUSINESS_BRANCH__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Location_ newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LocalEntitiesPackage.BUSINESS_BRANCH__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LocalEntitiesPackage.BUSINESS_BRANCH__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LocalEntitiesPackage.BUSINESS_BRANCH__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeWindow_> getOpeningHours() {
		if (openingHours == null) {
			openingHours = new EObjectContainmentEList<TimeWindow_>(TimeWindow_.class, this, LocalEntitiesPackage.BUSINESS_BRANCH__OPENING_HOURS);
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
			case LocalEntitiesPackage.BUSINESS_BRANCH__LOCATION:
				return basicSetLocation(null, msgs);
			case LocalEntitiesPackage.BUSINESS_BRANCH__OPENING_HOURS:
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
			case LocalEntitiesPackage.BUSINESS_BRANCH__ID:
				return getId();
			case LocalEntitiesPackage.BUSINESS_BRANCH__LOCATION:
				return getLocation();
			case LocalEntitiesPackage.BUSINESS_BRANCH__OPENING_HOURS:
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
			case LocalEntitiesPackage.BUSINESS_BRANCH__ID:
				setId((String)newValue);
				return;
			case LocalEntitiesPackage.BUSINESS_BRANCH__LOCATION:
				setLocation((Location_)newValue);
				return;
			case LocalEntitiesPackage.BUSINESS_BRANCH__OPENING_HOURS:
				getOpeningHours().clear();
				getOpeningHours().addAll((Collection<? extends TimeWindow_>)newValue);
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
			case LocalEntitiesPackage.BUSINESS_BRANCH__ID:
				setId(ID_EDEFAULT);
				return;
			case LocalEntitiesPackage.BUSINESS_BRANCH__LOCATION:
				setLocation((Location_)null);
				return;
			case LocalEntitiesPackage.BUSINESS_BRANCH__OPENING_HOURS:
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
			case LocalEntitiesPackage.BUSINESS_BRANCH__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LocalEntitiesPackage.BUSINESS_BRANCH__LOCATION:
				return location != null;
			case LocalEntitiesPackage.BUSINESS_BRANCH__OPENING_HOURS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HasId_.class) {
			switch (derivedFeatureID) {
				case LocalEntitiesPackage.BUSINESS_BRANCH__ID: return UtilsPackage.HAS_ID___ID;
				default: return -1;
			}
		}
		if (baseClass == ShipmentlLegStartEndPoint.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HasId_.class) {
			switch (baseFeatureID) {
				case UtilsPackage.HAS_ID___ID: return LocalEntitiesPackage.BUSINESS_BRANCH__ID;
				default: return -1;
			}
		}
		if (baseClass == ShipmentlLegStartEndPoint.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //BusinessBranchImpl
