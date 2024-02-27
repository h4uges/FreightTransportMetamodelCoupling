/**
 */
package MATSimFreightMetamodel.freightContrib.impl;

import MATSimFreightMetamodel.freightContrib.CarrierCapabilities;
import MATSimFreightMetamodel.freightContrib.CarrierVehicle;
import MATSimFreightMetamodel.freightContrib.FleetSize;
import MATSimFreightMetamodel.freightContrib.FreightContribPackage;

import MATSimFreightMetamodel.matsim.vehicles.VehicleType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierCapabilitiesImpl#getCarrierVehicles <em>Carrier Vehicles</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierCapabilitiesImpl#getVehicleTypes <em>Vehicle Types</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierCapabilitiesImpl#getFleetSize <em>Fleet Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierCapabilitiesImpl extends MinimalEObjectImpl.Container implements CarrierCapabilities {
	/**
	 * The cached value of the '{@link #getCarrierVehicles() <em>Carrier Vehicles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<CarrierVehicle> carrierVehicles;

	/**
	 * The cached value of the '{@link #getVehicleTypes() <em>Vehicle Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleType> vehicleTypes;

	/**
	 * The default value of the '{@link #getFleetSize() <em>Fleet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFleetSize()
	 * @generated
	 * @ordered
	 */
	protected static final FleetSize FLEET_SIZE_EDEFAULT = FleetSize.INFINITE;

	/**
	 * The cached value of the '{@link #getFleetSize() <em>Fleet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFleetSize()
	 * @generated
	 * @ordered
	 */
	protected FleetSize fleetSize = FLEET_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightContribPackage.Literals.CARRIER_CAPABILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CarrierVehicle> getCarrierVehicles() {
		if (carrierVehicles == null) {
			carrierVehicles = new EObjectContainmentEList<CarrierVehicle>(CarrierVehicle.class, this, FreightContribPackage.CARRIER_CAPABILITIES__CARRIER_VEHICLES);
		}
		return carrierVehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VehicleType> getVehicleTypes() {
		if (vehicleTypes == null) {
			vehicleTypes = new EObjectResolvingEList<VehicleType>(VehicleType.class, this, FreightContribPackage.CARRIER_CAPABILITIES__VEHICLE_TYPES);
		}
		return vehicleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FleetSize getFleetSize() {
		return fleetSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFleetSize(FleetSize newFleetSize) {
		FleetSize oldFleetSize = fleetSize;
		fleetSize = newFleetSize == null ? FLEET_SIZE_EDEFAULT : newFleetSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_CAPABILITIES__FLEET_SIZE, oldFleetSize, fleetSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreightContribPackage.CARRIER_CAPABILITIES__CARRIER_VEHICLES:
				return ((InternalEList<?>)getCarrierVehicles()).basicRemove(otherEnd, msgs);
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
			case FreightContribPackage.CARRIER_CAPABILITIES__CARRIER_VEHICLES:
				return getCarrierVehicles();
			case FreightContribPackage.CARRIER_CAPABILITIES__VEHICLE_TYPES:
				return getVehicleTypes();
			case FreightContribPackage.CARRIER_CAPABILITIES__FLEET_SIZE:
				return getFleetSize();
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
			case FreightContribPackage.CARRIER_CAPABILITIES__CARRIER_VEHICLES:
				getCarrierVehicles().clear();
				getCarrierVehicles().addAll((Collection<? extends CarrierVehicle>)newValue);
				return;
			case FreightContribPackage.CARRIER_CAPABILITIES__VEHICLE_TYPES:
				getVehicleTypes().clear();
				getVehicleTypes().addAll((Collection<? extends VehicleType>)newValue);
				return;
			case FreightContribPackage.CARRIER_CAPABILITIES__FLEET_SIZE:
				setFleetSize((FleetSize)newValue);
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
			case FreightContribPackage.CARRIER_CAPABILITIES__CARRIER_VEHICLES:
				getCarrierVehicles().clear();
				return;
			case FreightContribPackage.CARRIER_CAPABILITIES__VEHICLE_TYPES:
				getVehicleTypes().clear();
				return;
			case FreightContribPackage.CARRIER_CAPABILITIES__FLEET_SIZE:
				setFleetSize(FLEET_SIZE_EDEFAULT);
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
			case FreightContribPackage.CARRIER_CAPABILITIES__CARRIER_VEHICLES:
				return carrierVehicles != null && !carrierVehicles.isEmpty();
			case FreightContribPackage.CARRIER_CAPABILITIES__VEHICLE_TYPES:
				return vehicleTypes != null && !vehicleTypes.isEmpty();
			case FreightContribPackage.CARRIER_CAPABILITIES__FLEET_SIZE:
				return fleetSize != FLEET_SIZE_EDEFAULT;
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
		result.append(" (fleetSize: ");
		result.append(fleetSize);
		result.append(')');
		return result.toString();
	}

} //CarrierCapabilitiesImpl
