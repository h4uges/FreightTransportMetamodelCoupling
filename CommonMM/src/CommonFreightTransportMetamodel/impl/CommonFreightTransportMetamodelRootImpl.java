/**
 */
package CommonFreightTransportMetamodel.impl;

import CommonFreightTransportMetamodel.CommonFreighTransportMetamodelPackage;
import CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot;

import CommonFreightTransportMetamodel.logisticDemand.Demand;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolution;
import CommonFreightTransportMetamodel.network.Network;

import CommonFreightTransportMetamodel.population.Population;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Freight Transport Metamodel Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.impl.CommonFreightTransportMetamodelRootImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.impl.CommonFreightTransportMetamodelRootImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.impl.CommonFreightTransportMetamodelRootImpl#getLogisticNetwork <em>Logistic Network</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.impl.CommonFreightTransportMetamodelRootImpl#getDemand <em>Demand</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.impl.CommonFreightTransportMetamodelRootImpl#getLogisticSolution <em>Logistic Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommonFreightTransportMetamodelRootImpl extends MinimalEObjectImpl.Container implements CommonFreightTransportMetamodelRoot {
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
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected Population population;

	/**
	 * The cached value of the '{@link #getLogisticNetwork() <em>Logistic Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogisticNetwork()
	 * @generated
	 * @ordered
	 */
	protected LogisticNetwork logisticNetwork;

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
	 * The cached value of the '{@link #getLogisticSolution() <em>Logistic Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogisticSolution()
	 * @generated
	 * @ordered
	 */
	protected LogisticSolution logisticSolution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonFreightTransportMetamodelRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonFreighTransportMetamodelPackage.Literals.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK, oldNetwork, newNetwork);
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
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK, newNetwork, newNetwork));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION, oldPopulation, newPopulation);
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
				msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION, null, msgs);
			if (newPopulation != null)
				msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION, null, msgs);
			msgs = basicSetPopulation(newPopulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION, newPopulation, newPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticNetwork getLogisticNetwork() {
		return logisticNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogisticNetwork(LogisticNetwork newLogisticNetwork, NotificationChain msgs) {
		LogisticNetwork oldLogisticNetwork = logisticNetwork;
		logisticNetwork = newLogisticNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK, oldLogisticNetwork, newLogisticNetwork);
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
	public void setLogisticNetwork(LogisticNetwork newLogisticNetwork) {
		if (newLogisticNetwork != logisticNetwork) {
			NotificationChain msgs = null;
			if (logisticNetwork != null)
				msgs = ((InternalEObject)logisticNetwork).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK, null, msgs);
			if (newLogisticNetwork != null)
				msgs = ((InternalEObject)newLogisticNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK, null, msgs);
			msgs = basicSetLogisticNetwork(newLogisticNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK, newLogisticNetwork, newLogisticNetwork));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND, oldDemand, newDemand);
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
				msgs = ((InternalEObject)demand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND, null, msgs);
			if (newDemand != null)
				msgs = ((InternalEObject)newDemand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND, null, msgs);
			msgs = basicSetDemand(newDemand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND, newDemand, newDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticSolution getLogisticSolution() {
		return logisticSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogisticSolution(LogisticSolution newLogisticSolution, NotificationChain msgs) {
		LogisticSolution oldLogisticSolution = logisticSolution;
		logisticSolution = newLogisticSolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION, oldLogisticSolution, newLogisticSolution);
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
	public void setLogisticSolution(LogisticSolution newLogisticSolution) {
		if (newLogisticSolution != logisticSolution) {
			NotificationChain msgs = null;
			if (logisticSolution != null)
				msgs = ((InternalEObject)logisticSolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION, null, msgs);
			if (newLogisticSolution != null)
				msgs = ((InternalEObject)newLogisticSolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION, null, msgs);
			msgs = basicSetLogisticSolution(newLogisticSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION, newLogisticSolution, newLogisticSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK:
				return basicSetNetwork(null, msgs);
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION:
				return basicSetPopulation(null, msgs);
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK:
				return basicSetLogisticNetwork(null, msgs);
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND:
				return basicSetDemand(null, msgs);
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION:
				return basicSetLogisticSolution(null, msgs);
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
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK:
				return getNetwork();
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION:
				return getPopulation();
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK:
				return getLogisticNetwork();
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND:
				return getDemand();
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION:
				return getLogisticSolution();
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
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK:
				setNetwork((Network)newValue);
				return;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION:
				setPopulation((Population)newValue);
				return;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK:
				setLogisticNetwork((LogisticNetwork)newValue);
				return;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND:
				setDemand((Demand)newValue);
				return;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION:
				setLogisticSolution((LogisticSolution)newValue);
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
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK:
				setNetwork((Network)null);
				return;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION:
				setPopulation((Population)null);
				return;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK:
				setLogisticNetwork((LogisticNetwork)null);
				return;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND:
				setDemand((Demand)null);
				return;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION:
				setLogisticSolution((LogisticSolution)null);
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
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK:
				return network != null;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION:
				return population != null;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK:
				return logisticNetwork != null;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND:
				return demand != null;
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION:
				return logisticSolution != null;
		}
		return super.eIsSet(featureID);
	}

} //CommonFreightTransportMetamodelRootImpl
