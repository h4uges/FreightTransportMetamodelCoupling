/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.impl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticHub;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;

import CommonFreightTransportMetamodel.network.Location_;
import CommonFreightTransportMetamodel.network.VehicleType_;

import CommonFreightTransportMetamodel.utils.Dimension;
import CommonFreightTransportMetamodel.utils.Durration_;
import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.TimeWindow_;
import CommonFreightTransportMetamodel.utils.UtilsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logistic Hub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl#getId <em>Id</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl#getStorageCapacity <em>Storage Capacity</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl#getOperationHours <em>Operation Hours</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl#getAcceptedVehicleTypes <em>Accepted Vehicle Types</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl#getMinimumTranshipmentTime <em>Minimum Transhipment Time</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl#isIsExit <em>Is Exit</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticHubImpl#isIsEntry <em>Is Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogisticHubImpl extends LogisticFacilityImpl implements LogisticHub {
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
	 * The cached value of the '{@link #getStorageCapacity() <em>Storage Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected Dimension storageCapacity;

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
	 * The cached value of the '{@link #getOperationHours() <em>Operation Hours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationHours()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeWindow_> operationHours;

	/**
	 * The cached value of the '{@link #getAcceptedVehicleTypes() <em>Accepted Vehicle Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedVehicleTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleType_> acceptedVehicleTypes;

	/**
	 * The cached value of the '{@link #getMinimumTranshipmentTime() <em>Minimum Transhipment Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumTranshipmentTime()
	 * @generated
	 * @ordered
	 */
	protected Durration_ minimumTranshipmentTime;

	/**
	 * The default value of the '{@link #isIsExit() <em>Is Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExit() <em>Is Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExit()
	 * @generated
	 * @ordered
	 */
	protected boolean isExit = IS_EXIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEntry() <em>Is Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntry()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENTRY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEntry() <em>Is Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntry()
	 * @generated
	 * @ordered
	 */
	protected boolean isEntry = IS_ENTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticHubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticNetworkPackage.Literals.LOGISTIC_HUB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.LOGISTIC_HUB__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension getStorageCapacity() {
		return storageCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorageCapacity(Dimension newStorageCapacity, NotificationChain msgs) {
		Dimension oldStorageCapacity = storageCapacity;
		storageCapacity = newStorageCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.LOGISTIC_HUB__STORAGE_CAPACITY, oldStorageCapacity, newStorageCapacity);
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
	public void setStorageCapacity(Dimension newStorageCapacity) {
		if (newStorageCapacity != storageCapacity) {
			NotificationChain msgs = null;
			if (storageCapacity != null)
				msgs = ((InternalEObject)storageCapacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.LOGISTIC_HUB__STORAGE_CAPACITY, null, msgs);
			if (newStorageCapacity != null)
				msgs = ((InternalEObject)newStorageCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.LOGISTIC_HUB__STORAGE_CAPACITY, null, msgs);
			msgs = basicSetStorageCapacity(newStorageCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.LOGISTIC_HUB__STORAGE_CAPACITY, newStorageCapacity, newStorageCapacity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.LOGISTIC_HUB__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.LOGISTIC_HUB__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.LOGISTIC_HUB__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.LOGISTIC_HUB__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeWindow_> getOperationHours() {
		if (operationHours == null) {
			operationHours = new EObjectContainmentEList<TimeWindow_>(TimeWindow_.class, this, LogisticNetworkPackage.LOGISTIC_HUB__OPERATION_HOURS);
		}
		return operationHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VehicleType_> getAcceptedVehicleTypes() {
		if (acceptedVehicleTypes == null) {
			acceptedVehicleTypes = new EDataTypeUniqueEList<VehicleType_>(VehicleType_.class, this, LogisticNetworkPackage.LOGISTIC_HUB__ACCEPTED_VEHICLE_TYPES);
		}
		return acceptedVehicleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Durration_ getMinimumTranshipmentTime() {
		return minimumTranshipmentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumTranshipmentTime(Durration_ newMinimumTranshipmentTime, NotificationChain msgs) {
		Durration_ oldMinimumTranshipmentTime = minimumTranshipmentTime;
		minimumTranshipmentTime = newMinimumTranshipmentTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME, oldMinimumTranshipmentTime, newMinimumTranshipmentTime);
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
	public void setMinimumTranshipmentTime(Durration_ newMinimumTranshipmentTime) {
		if (newMinimumTranshipmentTime != minimumTranshipmentTime) {
			NotificationChain msgs = null;
			if (minimumTranshipmentTime != null)
				msgs = ((InternalEObject)minimumTranshipmentTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME, null, msgs);
			if (newMinimumTranshipmentTime != null)
				msgs = ((InternalEObject)newMinimumTranshipmentTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME, null, msgs);
			msgs = basicSetMinimumTranshipmentTime(newMinimumTranshipmentTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME, newMinimumTranshipmentTime, newMinimumTranshipmentTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsExit() {
		return isExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsExit(boolean newIsExit) {
		boolean oldIsExit = isExit;
		isExit = newIsExit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.LOGISTIC_HUB__IS_EXIT, oldIsExit, isExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsEntry() {
		return isEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsEntry(boolean newIsEntry) {
		boolean oldIsEntry = isEntry;
		isEntry = newIsEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.LOGISTIC_HUB__IS_ENTRY, oldIsEntry, isEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticNetworkPackage.LOGISTIC_HUB__STORAGE_CAPACITY:
				return basicSetStorageCapacity(null, msgs);
			case LogisticNetworkPackage.LOGISTIC_HUB__LOCATION:
				return basicSetLocation(null, msgs);
			case LogisticNetworkPackage.LOGISTIC_HUB__OPERATION_HOURS:
				return ((InternalEList<?>)getOperationHours()).basicRemove(otherEnd, msgs);
			case LogisticNetworkPackage.LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME:
				return basicSetMinimumTranshipmentTime(null, msgs);
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
			case LogisticNetworkPackage.LOGISTIC_HUB__ID:
				return getId();
			case LogisticNetworkPackage.LOGISTIC_HUB__STORAGE_CAPACITY:
				return getStorageCapacity();
			case LogisticNetworkPackage.LOGISTIC_HUB__LOCATION:
				return getLocation();
			case LogisticNetworkPackage.LOGISTIC_HUB__OPERATION_HOURS:
				return getOperationHours();
			case LogisticNetworkPackage.LOGISTIC_HUB__ACCEPTED_VEHICLE_TYPES:
				return getAcceptedVehicleTypes();
			case LogisticNetworkPackage.LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME:
				return getMinimumTranshipmentTime();
			case LogisticNetworkPackage.LOGISTIC_HUB__IS_EXIT:
				return isIsExit();
			case LogisticNetworkPackage.LOGISTIC_HUB__IS_ENTRY:
				return isIsEntry();
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
			case LogisticNetworkPackage.LOGISTIC_HUB__ID:
				setId((String)newValue);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__STORAGE_CAPACITY:
				setStorageCapacity((Dimension)newValue);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__LOCATION:
				setLocation((Location_)newValue);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__OPERATION_HOURS:
				getOperationHours().clear();
				getOperationHours().addAll((Collection<? extends TimeWindow_>)newValue);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__ACCEPTED_VEHICLE_TYPES:
				getAcceptedVehicleTypes().clear();
				getAcceptedVehicleTypes().addAll((Collection<? extends VehicleType_>)newValue);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME:
				setMinimumTranshipmentTime((Durration_)newValue);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__IS_EXIT:
				setIsExit((Boolean)newValue);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__IS_ENTRY:
				setIsEntry((Boolean)newValue);
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
			case LogisticNetworkPackage.LOGISTIC_HUB__ID:
				setId(ID_EDEFAULT);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__STORAGE_CAPACITY:
				setStorageCapacity((Dimension)null);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__LOCATION:
				setLocation((Location_)null);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__OPERATION_HOURS:
				getOperationHours().clear();
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__ACCEPTED_VEHICLE_TYPES:
				getAcceptedVehicleTypes().clear();
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME:
				setMinimumTranshipmentTime((Durration_)null);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__IS_EXIT:
				setIsExit(IS_EXIT_EDEFAULT);
				return;
			case LogisticNetworkPackage.LOGISTIC_HUB__IS_ENTRY:
				setIsEntry(IS_ENTRY_EDEFAULT);
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
			case LogisticNetworkPackage.LOGISTIC_HUB__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LogisticNetworkPackage.LOGISTIC_HUB__STORAGE_CAPACITY:
				return storageCapacity != null;
			case LogisticNetworkPackage.LOGISTIC_HUB__LOCATION:
				return location != null;
			case LogisticNetworkPackage.LOGISTIC_HUB__OPERATION_HOURS:
				return operationHours != null && !operationHours.isEmpty();
			case LogisticNetworkPackage.LOGISTIC_HUB__ACCEPTED_VEHICLE_TYPES:
				return acceptedVehicleTypes != null && !acceptedVehicleTypes.isEmpty();
			case LogisticNetworkPackage.LOGISTIC_HUB__MINIMUM_TRANSHIPMENT_TIME:
				return minimumTranshipmentTime != null;
			case LogisticNetworkPackage.LOGISTIC_HUB__IS_EXIT:
				return isExit != IS_EXIT_EDEFAULT;
			case LogisticNetworkPackage.LOGISTIC_HUB__IS_ENTRY:
				return isEntry != IS_ENTRY_EDEFAULT;
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
				case LogisticNetworkPackage.LOGISTIC_HUB__ID: return UtilsPackage.HAS_ID___ID;
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
				case UtilsPackage.HAS_ID___ID: return LogisticNetworkPackage.LOGISTIC_HUB__ID;
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
		result.append(", acceptedVehicleTypes: ");
		result.append(acceptedVehicleTypes);
		result.append(", isExit: ");
		result.append(isExit);
		result.append(", isEntry: ");
		result.append(isEntry);
		result.append(')');
		return result.toString();
	}

} //LogisticHubImpl
