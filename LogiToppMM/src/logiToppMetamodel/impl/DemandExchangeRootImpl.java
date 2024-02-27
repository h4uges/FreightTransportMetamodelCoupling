/**
 */
package logiToppMetamodel.impl;

import logiToppMetamodel.Demand;
import logiToppMetamodel.DemandExchangeRoot;
import logiToppMetamodel.LogiToppMetamodelPackage;
import logiToppMetamodel.Population;
import logiToppMetamodel.TransportInfrastructure;

import logiToppMetamodel.mobiTopp.network.RoadNetwork;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Demand Exchange Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.impl.DemandExchangeRootImpl#getDemand <em>Demand</em>}</li>
 *   <li>{@link logiToppMetamodel.impl.DemandExchangeRootImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link logiToppMetamodel.impl.DemandExchangeRootImpl#getTransportNetwork <em>Transport Network</em>}</li>
 *   <li>{@link logiToppMetamodel.impl.DemandExchangeRootImpl#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemandExchangeRootImpl extends MinimalEObjectImpl.Container implements DemandExchangeRoot {
	/**
	 * The cached value of the '{@link #getDemand() <em>Demand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand()
	 * @generated
	 * @ordered
	 */
	protected Demand demand;

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
	 * The cached value of the '{@link #getTransportNetwork() <em>Transport Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportNetwork()
	 * @generated
	 * @ordered
	 */
	protected TransportInfrastructure transportNetwork;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected RoadNetwork network;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemandExchangeRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogiToppMetamodelPackage.Literals.DEMAND_EXCHANGE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Demand getDemand() {
		return demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemand(Demand newDemand, NotificationChain msgs) {
		Demand oldDemand = demand;
		demand = newDemand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__DEMAND, oldDemand, newDemand);
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
	public void setDemand(Demand newDemand) {
		if (newDemand != demand) {
			NotificationChain msgs = null;
			if (demand != null)
				msgs = ((InternalEObject)demand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__DEMAND, null, msgs);
			if (newDemand != null)
				msgs = ((InternalEObject)newDemand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__DEMAND, null, msgs);
			msgs = basicSetDemand(newDemand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__DEMAND, newDemand, newDemand));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__POPULATION, oldPopulation, newPopulation);
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
				msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__POPULATION, null, msgs);
			if (newPopulation != null)
				msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__POPULATION, null, msgs);
			msgs = basicSetPopulation(newPopulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__POPULATION, newPopulation, newPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportInfrastructure getTransportNetwork() {
		return transportNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportNetwork(TransportInfrastructure newTransportNetwork, NotificationChain msgs) {
		TransportInfrastructure oldTransportNetwork = transportNetwork;
		transportNetwork = newTransportNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK, oldTransportNetwork, newTransportNetwork);
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
	public void setTransportNetwork(TransportInfrastructure newTransportNetwork) {
		if (newTransportNetwork != transportNetwork) {
			NotificationChain msgs = null;
			if (transportNetwork != null)
				msgs = ((InternalEObject)transportNetwork).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK, null, msgs);
			if (newTransportNetwork != null)
				msgs = ((InternalEObject)newTransportNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK, null, msgs);
			msgs = basicSetTransportNetwork(newTransportNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK, newTransportNetwork, newTransportNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoadNetwork getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(RoadNetwork newNetwork, NotificationChain msgs) {
		RoadNetwork oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__NETWORK, oldNetwork, newNetwork);
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
	public void setNetwork(RoadNetwork newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__DEMAND:
				return basicSetDemand(null, msgs);
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__POPULATION:
				return basicSetPopulation(null, msgs);
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK:
				return basicSetTransportNetwork(null, msgs);
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__NETWORK:
				return basicSetNetwork(null, msgs);
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
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__DEMAND:
				return getDemand();
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__POPULATION:
				return getPopulation();
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK:
				return getTransportNetwork();
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__NETWORK:
				return getNetwork();
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
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__DEMAND:
				setDemand((Demand)newValue);
				return;
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__POPULATION:
				setPopulation((Population)newValue);
				return;
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK:
				setTransportNetwork((TransportInfrastructure)newValue);
				return;
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__NETWORK:
				setNetwork((RoadNetwork)newValue);
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
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__DEMAND:
				setDemand((Demand)null);
				return;
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__POPULATION:
				setPopulation((Population)null);
				return;
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK:
				setTransportNetwork((TransportInfrastructure)null);
				return;
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__NETWORK:
				setNetwork((RoadNetwork)null);
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
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__DEMAND:
				return demand != null;
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__POPULATION:
				return population != null;
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__TRANSPORT_NETWORK:
				return transportNetwork != null;
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT__NETWORK:
				return network != null;
		}
		return super.eIsSet(featureID);
	}

} //DemandExchangeRootImpl
