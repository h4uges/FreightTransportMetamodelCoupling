/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.impl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;
import CommonFreightTransportMetamodel.logisticNetwork.Vehicle;
import CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot;

import CommonFreightTransportMetamodel.network.Location_;

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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Depot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleDepotImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleDepotImpl#getOperationHours <em>Operation Hours</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.VehicleDepotImpl#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleDepotImpl extends HasId_Impl implements VehicleDepot {
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
	 * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' containment reference list.
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
	protected VehicleDepotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticNetworkPackage.Literals.VEHICLE_DEPOT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.VEHICLE_DEPOT__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.VEHICLE_DEPOT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticNetworkPackage.VEHICLE_DEPOT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.VEHICLE_DEPOT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vehicle> getVehicles() {
		if (vehicles == null) {
			vehicles = new EObjectContainmentWithInverseEList<Vehicle>(Vehicle.class, this, LogisticNetworkPackage.VEHICLE_DEPOT__VEHICLES, LogisticNetworkPackage.VEHICLE__DEPOT);
		}
		return vehicles;
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
			case LogisticNetworkPackage.VEHICLE_DEPOT__VEHICLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVehicles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeWindow_> getOperationHours() {
		if (operationHours == null) {
			operationHours = new EObjectContainmentEList<TimeWindow_>(TimeWindow_.class, this, LogisticNetworkPackage.VEHICLE_DEPOT__OPERATION_HOURS);
		}
		return operationHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticNetworkPackage.VEHICLE_DEPOT__LOCATION:
				return basicSetLocation(null, msgs);
			case LogisticNetworkPackage.VEHICLE_DEPOT__OPERATION_HOURS:
				return ((InternalEList<?>)getOperationHours()).basicRemove(otherEnd, msgs);
			case LogisticNetworkPackage.VEHICLE_DEPOT__VEHICLES:
				return ((InternalEList<?>)getVehicles()).basicRemove(otherEnd, msgs);
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
			case LogisticNetworkPackage.VEHICLE_DEPOT__LOCATION:
				return getLocation();
			case LogisticNetworkPackage.VEHICLE_DEPOT__OPERATION_HOURS:
				return getOperationHours();
			case LogisticNetworkPackage.VEHICLE_DEPOT__VEHICLES:
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
			case LogisticNetworkPackage.VEHICLE_DEPOT__LOCATION:
				setLocation((Location_)newValue);
				return;
			case LogisticNetworkPackage.VEHICLE_DEPOT__OPERATION_HOURS:
				getOperationHours().clear();
				getOperationHours().addAll((Collection<? extends TimeWindow_>)newValue);
				return;
			case LogisticNetworkPackage.VEHICLE_DEPOT__VEHICLES:
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
			case LogisticNetworkPackage.VEHICLE_DEPOT__LOCATION:
				setLocation((Location_)null);
				return;
			case LogisticNetworkPackage.VEHICLE_DEPOT__OPERATION_HOURS:
				getOperationHours().clear();
				return;
			case LogisticNetworkPackage.VEHICLE_DEPOT__VEHICLES:
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
			case LogisticNetworkPackage.VEHICLE_DEPOT__LOCATION:
				return location != null;
			case LogisticNetworkPackage.VEHICLE_DEPOT__OPERATION_HOURS:
				return operationHours != null && !operationHours.isEmpty();
			case LogisticNetworkPackage.VEHICLE_DEPOT__VEHICLES:
				return vehicles != null && !vehicles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VehicleDepotImpl
