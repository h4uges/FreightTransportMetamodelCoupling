/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.impl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;
import CommonFreightTransportMetamodel.logisticNetwork.Vehicle;
import CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot;

import CommonFreightTransportMetamodel.network.VehicleType_;

import CommonFreightTransportMetamodel.utils.Dimension;
import CommonFreightTransportMetamodel.utils.TimeWindow_;

import CommonFreightTransportMetamodel.utils.impl.HasId_Impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleImpl#getStorageCapacity <em>Storage Capacity</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleImpl#getOperationHours <em>Operation Hours</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleImpl#getType <em>Type</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleImpl#getDepot <em>Depot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleImpl extends HasId_Impl implements Vehicle {
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
	 * The cached value of the '{@link #getOperationHours() <em>Operation Hours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationHours()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeWindow_> operationHours;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VehicleType_ TYPE_EDEFAULT = VehicleType_.TRUCK;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VehicleType_ type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticNetworkPackage.Literals.VEHICLE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.VEHICLE__STORAGE_CAPACITY, oldStorageCapacity, newStorageCapacity);
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
				msgs = ((InternalEObject)storageCapacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.VEHICLE__STORAGE_CAPACITY, null, msgs);
			if (newStorageCapacity != null)
				msgs = ((InternalEObject)newStorageCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.VEHICLE__STORAGE_CAPACITY, null, msgs);
			msgs = basicSetStorageCapacity(newStorageCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.VEHICLE__STORAGE_CAPACITY, newStorageCapacity, newStorageCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeWindow_> getOperationHours() {
		if (operationHours == null) {
			operationHours = new EObjectContainmentEList<TimeWindow_>(TimeWindow_.class, this, LogisticNetworkPackage.VEHICLE__OPERATION_HOURS);
		}
		return operationHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleType_ getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(VehicleType_ newType) {
		VehicleType_ oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.VEHICLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleDepot getDepot() {
		if (eContainerFeatureID() != LogisticNetworkPackage.VEHICLE__DEPOT) return null;
		return (VehicleDepot)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepot(VehicleDepot newDepot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDepot, LogisticNetworkPackage.VEHICLE__DEPOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepot(VehicleDepot newDepot) {
		if (newDepot != eInternalContainer() || (eContainerFeatureID() != LogisticNetworkPackage.VEHICLE__DEPOT && newDepot != null)) {
			if (EcoreUtil.isAncestor(this, newDepot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDepot != null)
				msgs = ((InternalEObject)newDepot).eInverseAdd(this, LogisticNetworkPackage.VEHICLE_DEPOT__VEHICLES, VehicleDepot.class, msgs);
			msgs = basicSetDepot(newDepot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.VEHICLE__DEPOT, newDepot, newDepot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticNetworkPackage.VEHICLE__DEPOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDepot((VehicleDepot)otherEnd, msgs);
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
			case LogisticNetworkPackage.VEHICLE__STORAGE_CAPACITY:
				return basicSetStorageCapacity(null, msgs);
			case LogisticNetworkPackage.VEHICLE__OPERATION_HOURS:
				return ((InternalEList<?>)getOperationHours()).basicRemove(otherEnd, msgs);
			case LogisticNetworkPackage.VEHICLE__DEPOT:
				return basicSetDepot(null, msgs);
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
			case LogisticNetworkPackage.VEHICLE__DEPOT:
				return eInternalContainer().eInverseRemove(this, LogisticNetworkPackage.VEHICLE_DEPOT__VEHICLES, VehicleDepot.class, msgs);
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
			case LogisticNetworkPackage.VEHICLE__STORAGE_CAPACITY:
				return getStorageCapacity();
			case LogisticNetworkPackage.VEHICLE__OPERATION_HOURS:
				return getOperationHours();
			case LogisticNetworkPackage.VEHICLE__TYPE:
				return getType();
			case LogisticNetworkPackage.VEHICLE__DEPOT:
				return getDepot();
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
			case LogisticNetworkPackage.VEHICLE__STORAGE_CAPACITY:
				setStorageCapacity((Dimension)newValue);
				return;
			case LogisticNetworkPackage.VEHICLE__OPERATION_HOURS:
				getOperationHours().clear();
				getOperationHours().addAll((Collection<? extends TimeWindow_>)newValue);
				return;
			case LogisticNetworkPackage.VEHICLE__TYPE:
				setType((VehicleType_)newValue);
				return;
			case LogisticNetworkPackage.VEHICLE__DEPOT:
				setDepot((VehicleDepot)newValue);
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
			case LogisticNetworkPackage.VEHICLE__STORAGE_CAPACITY:
				setStorageCapacity((Dimension)null);
				return;
			case LogisticNetworkPackage.VEHICLE__OPERATION_HOURS:
				getOperationHours().clear();
				return;
			case LogisticNetworkPackage.VEHICLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LogisticNetworkPackage.VEHICLE__DEPOT:
				setDepot((VehicleDepot)null);
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
			case LogisticNetworkPackage.VEHICLE__STORAGE_CAPACITY:
				return storageCapacity != null;
			case LogisticNetworkPackage.VEHICLE__OPERATION_HOURS:
				return operationHours != null && !operationHours.isEmpty();
			case LogisticNetworkPackage.VEHICLE__TYPE:
				return type != TYPE_EDEFAULT;
			case LogisticNetworkPackage.VEHICLE__DEPOT:
				return getDepot() != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
