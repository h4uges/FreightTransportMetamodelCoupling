/**
 */
package CommonFreightTransportMetamodel.coupling.impl;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;
import CommonFreightTransportMetamodel.coupling.CouplingPackage;

import CommonFreightTransportMetamodel.logisticDemand.Demand;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolution;

import CommonFreightTransportMetamodel.network.Network;
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
 *   <li>{@link CommonFreightTransportMetamodel.coupling.impl.CommonFreightTransportMetamodelRootImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.coupling.impl.CommonFreightTransportMetamodelRootImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.coupling.impl.CommonFreightTransportMetamodelRootImpl#getLogisticNetwork <em>Logistic Network</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.coupling.impl.CommonFreightTransportMetamodelRootImpl#getDemand <em>Demand</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.coupling.impl.CommonFreightTransportMetamodelRootImpl#getLogisticSolution <em>Logistic Solution</em>}</li>
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
	protected CommonFreightTransportMetamodel.localEntities.Population population;

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
		return CouplingPackage.Literals.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK, oldNetwork, newNetwork);
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
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonFreightTransportMetamodel.localEntities.Population getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPopulation(CommonFreightTransportMetamodel.localEntities.Population newPopulation, NotificationChain msgs) {
		CommonFreightTransportMetamodel.localEntities.Population oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION, oldPopulation, newPopulation);
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
	public void setPopulation(CommonFreightTransportMetamodel.localEntities.Population newPopulation) {
		if (newPopulation != population) {
			NotificationChain msgs = null;
			if (population != null)
				msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION, null, msgs);
			if (newPopulation != null)
				msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION, null, msgs);
			msgs = basicSetPopulation(newPopulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION, newPopulation, newPopulation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK, oldLogisticNetwork, newLogisticNetwork);
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
				msgs = ((InternalEObject)logisticNetwork).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK, null, msgs);
			if (newLogisticNetwork != null)
				msgs = ((InternalEObject)newLogisticNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK, null, msgs);
			msgs = basicSetLogisticNetwork(newLogisticNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK, newLogisticNetwork, newLogisticNetwork));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND, oldDemand, newDemand);
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
				msgs = ((InternalEObject)demand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND, null, msgs);
			if (newDemand != null)
				msgs = ((InternalEObject)newDemand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND, null, msgs);
			msgs = basicSetDemand(newDemand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND, newDemand, newDemand));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION, oldLogisticSolution, newLogisticSolution);
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
				msgs = ((InternalEObject)logisticSolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION, null, msgs);
			if (newLogisticSolution != null)
				msgs = ((InternalEObject)newLogisticSolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION, null, msgs);
			msgs = basicSetLogisticSolution(newLogisticSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION, newLogisticSolution, newLogisticSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK:
				return basicSetNetwork(null, msgs);
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION:
				return basicSetPopulation(null, msgs);
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK:
				return basicSetLogisticNetwork(null, msgs);
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND:
				return basicSetDemand(null, msgs);
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION:
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
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK:
				return getNetwork();
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION:
				return getPopulation();
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK:
				return getLogisticNetwork();
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND:
				return getDemand();
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION:
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
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK:
				setNetwork((Network)newValue);
				return;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION:
				setPopulation((CommonFreightTransportMetamodel.localEntities.Population)newValue);
				return;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK:
				setLogisticNetwork((LogisticNetwork)newValue);
				return;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND:
				setDemand((Demand)newValue);
				return;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION:
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
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK:
				setNetwork((Network)null);
				return;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION:
				setPopulation((CommonFreightTransportMetamodel.localEntities.Population)null);
				return;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK:
				setLogisticNetwork((LogisticNetwork)null);
				return;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND:
				setDemand((Demand)null);
				return;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION:
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
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK:
				return network != null;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION:
				return population != null;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK:
				return logisticNetwork != null;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND:
				return demand != null;
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION:
				return logisticSolution != null;
		}
		return super.eIsSet(featureID);
	}

} //CommonFreightTransportMetamodelRootImpl
