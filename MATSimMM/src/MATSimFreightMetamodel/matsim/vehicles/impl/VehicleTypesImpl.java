/**
 */
package MATSimFreightMetamodel.matsim.vehicles.impl;

import MATSimFreightMetamodel.matsim.vehicles.Vehicle;
import MATSimFreightMetamodel.matsim.vehicles.VehicleType;
import MATSimFreightMetamodel.matsim.vehicles.VehicleTypes;
import MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypesImpl#getVehicleTypes <em>Vehicle Types</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypesImpl#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleTypesImpl extends MinimalEObjectImpl.Container implements VehicleTypes {
	/**
	 * The cached value of the '{@link #getVehicleTypes() <em>Vehicle Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleType> vehicleTypes;

	/**
	 * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> vehicles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VehiclesPackage.Literals.VEHICLE_TYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VehicleType> getVehicleTypes() {
		if (vehicleTypes == null) {
			vehicleTypes = new EObjectContainmentEList<VehicleType>(VehicleType.class, this, VehiclesPackage.VEHICLE_TYPES__VEHICLE_TYPES);
		}
		return vehicleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vehicle> getVehicles() {
		if (vehicles == null) {
			vehicles = new EObjectResolvingEList<Vehicle>(Vehicle.class, this, VehiclesPackage.VEHICLE_TYPES__VEHICLES);
		}
		return vehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VehiclesPackage.VEHICLE_TYPES__VEHICLE_TYPES:
				return ((InternalEList<?>)getVehicleTypes()).basicRemove(otherEnd, msgs);
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
			case VehiclesPackage.VEHICLE_TYPES__VEHICLE_TYPES:
				return getVehicleTypes();
			case VehiclesPackage.VEHICLE_TYPES__VEHICLES:
				return getVehicles();
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
			case VehiclesPackage.VEHICLE_TYPES__VEHICLE_TYPES:
				getVehicleTypes().clear();
				getVehicleTypes().addAll((Collection<? extends VehicleType>)newValue);
				return;
			case VehiclesPackage.VEHICLE_TYPES__VEHICLES:
				getVehicles().clear();
				getVehicles().addAll((Collection<? extends Vehicle>)newValue);
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
			case VehiclesPackage.VEHICLE_TYPES__VEHICLE_TYPES:
				getVehicleTypes().clear();
				return;
			case VehiclesPackage.VEHICLE_TYPES__VEHICLES:
				getVehicles().clear();
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
			case VehiclesPackage.VEHICLE_TYPES__VEHICLE_TYPES:
				return vehicleTypes != null && !vehicleTypes.isEmpty();
			case VehiclesPackage.VEHICLE_TYPES__VEHICLES:
				return vehicles != null && !vehicles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VehicleTypesImpl
