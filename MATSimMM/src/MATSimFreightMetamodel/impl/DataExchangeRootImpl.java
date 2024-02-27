/**
 */
package MATSimFreightMetamodel.impl;

import MATSimFreightMetamodel.DataExchangeRoot;
import MATSimFreightMetamodel.MATSimFreightMetamodelPackage;

import MATSimFreightMetamodel.freightContrib.Carrier;

import MATSimFreightMetamodel.matsim.core.network.Network;

import MATSimFreightMetamodel.matsim.households.Population;

import MATSimFreightMetamodel.matsim.vehicles.VehicleTypes;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Data Exchange Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.impl.DataExchangeRootImpl#getCarriers <em>Carriers</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.impl.DataExchangeRootImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.impl.DataExchangeRootImpl#getVehicelTypes <em>Vehicel Types</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.impl.DataExchangeRootImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataExchangeRootImpl extends MinimalEObjectImpl.Container implements DataExchangeRoot {
	/**
	 * The cached value of the '{@link #getCarriers() <em>Carriers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarriers()
	 * @generated
	 * @ordered
	 */
	protected EList<Carrier> carriers;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network network;

	/**
	 * The cached value of the '{@link #getVehicelTypes() <em>Vehicel Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicelTypes()
	 * @generated
	 * @ordered
	 */
	protected VehicleTypes vehicelTypes;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected Population population;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataExchangeRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MATSimFreightMetamodelPackage.Literals.DATA_EXCHANGE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Carrier> getCarriers() {
		if (carriers == null) {
			carriers = new EObjectContainmentEList<Carrier>(Carrier.class, this, MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__CARRIERS);
		}
		return carriers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(Network newNetwork, NotificationChain msgs) {
		Network oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__NETWORK, oldNetwork, newNetwork);
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
	public void setNetwork(Network newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleTypes getVehicelTypes() {
		return vehicelTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicelTypes(VehicleTypes newVehicelTypes, NotificationChain msgs) {
		VehicleTypes oldVehicelTypes = vehicelTypes;
		vehicelTypes = newVehicelTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__VEHICEL_TYPES, oldVehicelTypes, newVehicelTypes);
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
	public void setVehicelTypes(VehicleTypes newVehicelTypes) {
		if (newVehicelTypes != vehicelTypes) {
			NotificationChain msgs = null;
			if (vehicelTypes != null)
				msgs = ((InternalEObject)vehicelTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__VEHICEL_TYPES, null, msgs);
			if (newVehicelTypes != null)
				msgs = ((InternalEObject)newVehicelTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__VEHICEL_TYPES, null, msgs);
			msgs = basicSetVehicelTypes(newVehicelTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__VEHICEL_TYPES, newVehicelTypes, newVehicelTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Population getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPopulation(Population newPopulation, NotificationChain msgs) {
		Population oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__POPULATION, oldPopulation, newPopulation);
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
	public void setPopulation(Population newPopulation) {
		if (newPopulation != population) {
			NotificationChain msgs = null;
			if (population != null)
				msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__POPULATION, null, msgs);
			if (newPopulation != null)
				msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__POPULATION, null, msgs);
			msgs = basicSetPopulation(newPopulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__POPULATION, newPopulation, newPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__CARRIERS:
				return ((InternalEList<?>)getCarriers()).basicRemove(otherEnd, msgs);
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__NETWORK:
				return basicSetNetwork(null, msgs);
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__VEHICEL_TYPES:
				return basicSetVehicelTypes(null, msgs);
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__POPULATION:
				return basicSetPopulation(null, msgs);
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
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__CARRIERS:
				return getCarriers();
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__NETWORK:
				return getNetwork();
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__VEHICEL_TYPES:
				return getVehicelTypes();
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__POPULATION:
				return getPopulation();
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
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__CARRIERS:
				getCarriers().clear();
				getCarriers().addAll((Collection<? extends Carrier>)newValue);
				return;
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__NETWORK:
				setNetwork((Network)newValue);
				return;
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__VEHICEL_TYPES:
				setVehicelTypes((VehicleTypes)newValue);
				return;
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__POPULATION:
				setPopulation((Population)newValue);
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
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__CARRIERS:
				getCarriers().clear();
				return;
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__NETWORK:
				setNetwork((Network)null);
				return;
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__VEHICEL_TYPES:
				setVehicelTypes((VehicleTypes)null);
				return;
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__POPULATION:
				setPopulation((Population)null);
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
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__CARRIERS:
				return carriers != null && !carriers.isEmpty();
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__NETWORK:
				return network != null;
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__VEHICEL_TYPES:
				return vehicelTypes != null;
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT__POPULATION:
				return population != null;
		}
		return super.eIsSet(featureID);
	}

} //DataExchangeRootImpl
