/**
 */
package MATSimFreightMetamodel.matsim.core.network.impl;

import MATSimFreightMetamodel.matsim.core.network.Link;
import MATSimFreightMetamodel.matsim.core.network.Network;
import MATSimFreightMetamodel.matsim.core.network.NetworkPackage;
import MATSimFreightMetamodel.matsim.core.network.Node;

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
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.NetworkImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.NetworkImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.NetworkImpl#getCapacityPeriod <em>Capacity Period</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.NetworkImpl#getEffectiveCellSize <em>Effective Cell Size</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.NetworkImpl#getEffectiveLaneWidht <em>Effective Lane Widht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The default value of the '{@link #getCapacityPeriod() <em>Capacity Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITY_PERIOD_EDEFAULT = 3600.0;

	/**
	 * The cached value of the '{@link #getCapacityPeriod() <em>Capacity Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityPeriod()
	 * @generated
	 * @ordered
	 */
	protected double capacityPeriod = CAPACITY_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveCellSize() <em>Effective Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveCellSize()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFECTIVE_CELL_SIZE_EDEFAULT = 7.5;

	/**
	 * The cached value of the '{@link #getEffectiveCellSize() <em>Effective Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveCellSize()
	 * @generated
	 * @ordered
	 */
	protected double effectiveCellSize = EFFECTIVE_CELL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveLaneWidht() <em>Effective Lane Widht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveLaneWidht()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFECTIVE_LANE_WIDHT_EDEFAULT = 3.75;

	/**
	 * The cached value of the '{@link #getEffectiveLaneWidht() <em>Effective Lane Widht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveLaneWidht()
	 * @generated
	 * @ordered
	 */
	protected double effectiveLaneWidht = EFFECTIVE_LANE_WIDHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, NetworkPackage.NETWORK__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, NetworkPackage.NETWORK__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCapacityPeriod() {
		return capacityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacityPeriod(double newCapacityPeriod) {
		double oldCapacityPeriod = capacityPeriod;
		capacityPeriod = newCapacityPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.NETWORK__CAPACITY_PERIOD, oldCapacityPeriod, capacityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEffectiveCellSize() {
		return effectiveCellSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveCellSize(double newEffectiveCellSize) {
		double oldEffectiveCellSize = effectiveCellSize;
		effectiveCellSize = newEffectiveCellSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.NETWORK__EFFECTIVE_CELL_SIZE, oldEffectiveCellSize, effectiveCellSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEffectiveLaneWidht() {
		return effectiveLaneWidht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveLaneWidht(double newEffectiveLaneWidht) {
		double oldEffectiveLaneWidht = effectiveLaneWidht;
		effectiveLaneWidht = newEffectiveLaneWidht;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.NETWORK__EFFECTIVE_LANE_WIDHT, oldEffectiveLaneWidht, effectiveLaneWidht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkPackage.NETWORK__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case NetworkPackage.NETWORK__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case NetworkPackage.NETWORK__NODES:
				return getNodes();
			case NetworkPackage.NETWORK__LINKS:
				return getLinks();
			case NetworkPackage.NETWORK__CAPACITY_PERIOD:
				return getCapacityPeriod();
			case NetworkPackage.NETWORK__EFFECTIVE_CELL_SIZE:
				return getEffectiveCellSize();
			case NetworkPackage.NETWORK__EFFECTIVE_LANE_WIDHT:
				return getEffectiveLaneWidht();
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
			case NetworkPackage.NETWORK__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case NetworkPackage.NETWORK__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case NetworkPackage.NETWORK__CAPACITY_PERIOD:
				setCapacityPeriod((Double)newValue);
				return;
			case NetworkPackage.NETWORK__EFFECTIVE_CELL_SIZE:
				setEffectiveCellSize((Double)newValue);
				return;
			case NetworkPackage.NETWORK__EFFECTIVE_LANE_WIDHT:
				setEffectiveLaneWidht((Double)newValue);
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
			case NetworkPackage.NETWORK__NODES:
				getNodes().clear();
				return;
			case NetworkPackage.NETWORK__LINKS:
				getLinks().clear();
				return;
			case NetworkPackage.NETWORK__CAPACITY_PERIOD:
				setCapacityPeriod(CAPACITY_PERIOD_EDEFAULT);
				return;
			case NetworkPackage.NETWORK__EFFECTIVE_CELL_SIZE:
				setEffectiveCellSize(EFFECTIVE_CELL_SIZE_EDEFAULT);
				return;
			case NetworkPackage.NETWORK__EFFECTIVE_LANE_WIDHT:
				setEffectiveLaneWidht(EFFECTIVE_LANE_WIDHT_EDEFAULT);
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
			case NetworkPackage.NETWORK__NODES:
				return nodes != null && !nodes.isEmpty();
			case NetworkPackage.NETWORK__LINKS:
				return links != null && !links.isEmpty();
			case NetworkPackage.NETWORK__CAPACITY_PERIOD:
				return capacityPeriod != CAPACITY_PERIOD_EDEFAULT;
			case NetworkPackage.NETWORK__EFFECTIVE_CELL_SIZE:
				return effectiveCellSize != EFFECTIVE_CELL_SIZE_EDEFAULT;
			case NetworkPackage.NETWORK__EFFECTIVE_LANE_WIDHT:
				return effectiveLaneWidht != EFFECTIVE_LANE_WIDHT_EDEFAULT;
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
		result.append(" (capacityPeriod: ");
		result.append(capacityPeriod);
		result.append(", effectiveCellSize: ");
		result.append(effectiveCellSize);
		result.append(", effectiveLaneWidht: ");
		result.append(effectiveLaneWidht);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
