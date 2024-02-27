/**
 */
package logiToppMetamodel.logiTopp.distribution.fleet.impl;

import java.util.Collection;

import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;
import logiToppMetamodel.logiTopp.distribution.fleet.Fleet;
import logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage;
import logiToppMetamodel.logiTopp.distribution.fleet.VehicleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fleet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetImpl#getVehicleType <em>Vehicle Type</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetImpl#getDeliveryVehicles <em>Delivery Vehicles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FleetImpl extends MinimalEObjectImpl.Container implements Fleet {
	/**
	 * The default value of the '{@link #getVehicleType() <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleType()
	 * @generated
	 * @ordered
	 */
	protected static final VehicleType VEHICLE_TYPE_EDEFAULT = VehicleType.TRUCK;

	/**
	 * The cached value of the '{@link #getVehicleType() <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleType()
	 * @generated
	 * @ordered
	 */
	protected VehicleType vehicleType = VEHICLE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeliveryVehicles() <em>Delivery Vehicles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<DeliveryVehicle> deliveryVehicles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FleetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.FLEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleType getVehicleType() {
		return vehicleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVehicleType(VehicleType newVehicleType) {
		VehicleType oldVehicleType = vehicleType;
		vehicleType = newVehicleType == null ? VEHICLE_TYPE_EDEFAULT : newVehicleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FleetPackage.FLEET__VEHICLE_TYPE, oldVehicleType, vehicleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeliveryVehicle> getDeliveryVehicles() {
		if (deliveryVehicles == null) {
			deliveryVehicles = new EObjectContainmentEList<DeliveryVehicle>(DeliveryVehicle.class, this, FleetPackage.FLEET__DELIVERY_VEHICLES);
		}
		return deliveryVehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FleetPackage.FLEET__DELIVERY_VEHICLES:
				return ((InternalEList<?>)getDeliveryVehicles()).basicRemove(otherEnd, msgs);
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
			case FleetPackage.FLEET__VEHICLE_TYPE:
				return getVehicleType();
			case FleetPackage.FLEET__DELIVERY_VEHICLES:
				return getDeliveryVehicles();
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
			case FleetPackage.FLEET__VEHICLE_TYPE:
				setVehicleType((VehicleType)newValue);
				return;
			case FleetPackage.FLEET__DELIVERY_VEHICLES:
				getDeliveryVehicles().clear();
				getDeliveryVehicles().addAll((Collection<? extends DeliveryVehicle>)newValue);
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
			case FleetPackage.FLEET__VEHICLE_TYPE:
				setVehicleType(VEHICLE_TYPE_EDEFAULT);
				return;
			case FleetPackage.FLEET__DELIVERY_VEHICLES:
				getDeliveryVehicles().clear();
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
			case FleetPackage.FLEET__VEHICLE_TYPE:
				return vehicleType != VEHICLE_TYPE_EDEFAULT;
			case FleetPackage.FLEET__DELIVERY_VEHICLES:
				return deliveryVehicles != null && !deliveryVehicles.isEmpty();
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
		result.append(" (vehicleType: ");
		result.append(vehicleType);
		result.append(')');
		return result.toString();
	}

} //FleetImpl
