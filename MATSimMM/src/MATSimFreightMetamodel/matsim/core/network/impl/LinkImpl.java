/**
 */
package MATSimFreightMetamodel.matsim.core.network.impl;

import MATSimFreightMetamodel.base.impl.EntityImpl;

import MATSimFreightMetamodel.matsim.TransportMode;

import MATSimFreightMetamodel.matsim.core.network.Link;
import MATSimFreightMetamodel.matsim.core.network.NetworkPackage;
import MATSimFreightMetamodel.matsim.core.network.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.LinkImpl#getFrom <em>From</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.LinkImpl#getTo <em>To</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.LinkImpl#getLength <em>Length</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.LinkImpl#getFreespeed <em>Freespeed</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.LinkImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.LinkImpl#getNofLanes <em>Nof Lanes</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.impl.LinkImpl#getAllowedModes <em>Allowed Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends EntityImpl implements Link {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Node from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Node to;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreespeed() <em>Freespeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreespeed()
	 * @generated
	 * @ordered
	 */
	protected static final double FREESPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFreespeed() <em>Freespeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreespeed()
	 * @generated
	 * @ordered
	 */
	protected double freespeed = FREESPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected double capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNofLanes() <em>Nof Lanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNofLanes()
	 * @generated
	 * @ordered
	 */
	protected static final double NOF_LANES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNofLanes() <em>Nof Lanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNofLanes()
	 * @generated
	 * @ordered
	 */
	protected double nofLanes = NOF_LANES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedModes() <em>Allowed Modes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedModes()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportMode> allowedModes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Node)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.LINK__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(Node newFrom) {
		Node oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LINK__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Node)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.LINK__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(Node newTo) {
		Node oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LINK__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(double newLength) {
		double oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LINK__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFreespeed() {
		return freespeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreespeed(double newFreespeed) {
		double oldFreespeed = freespeed;
		freespeed = newFreespeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LINK__FREESPEED, oldFreespeed, freespeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(double newCapacity) {
		double oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LINK__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNofLanes() {
		return nofLanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNofLanes(double newNofLanes) {
		double oldNofLanes = nofLanes;
		nofLanes = newNofLanes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LINK__NOF_LANES, oldNofLanes, nofLanes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransportMode> getAllowedModes() {
		if (allowedModes == null) {
			allowedModes = new EDataTypeUniqueEList<TransportMode>(TransportMode.class, this, NetworkPackage.LINK__ALLOWED_MODES);
		}
		return allowedModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkPackage.LINK__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case NetworkPackage.LINK__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case NetworkPackage.LINK__LENGTH:
				return getLength();
			case NetworkPackage.LINK__FREESPEED:
				return getFreespeed();
			case NetworkPackage.LINK__CAPACITY:
				return getCapacity();
			case NetworkPackage.LINK__NOF_LANES:
				return getNofLanes();
			case NetworkPackage.LINK__ALLOWED_MODES:
				return getAllowedModes();
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
			case NetworkPackage.LINK__FROM:
				setFrom((Node)newValue);
				return;
			case NetworkPackage.LINK__TO:
				setTo((Node)newValue);
				return;
			case NetworkPackage.LINK__LENGTH:
				setLength((Double)newValue);
				return;
			case NetworkPackage.LINK__FREESPEED:
				setFreespeed((Double)newValue);
				return;
			case NetworkPackage.LINK__CAPACITY:
				setCapacity((Double)newValue);
				return;
			case NetworkPackage.LINK__NOF_LANES:
				setNofLanes((Double)newValue);
				return;
			case NetworkPackage.LINK__ALLOWED_MODES:
				getAllowedModes().clear();
				getAllowedModes().addAll((Collection<? extends TransportMode>)newValue);
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
			case NetworkPackage.LINK__FROM:
				setFrom((Node)null);
				return;
			case NetworkPackage.LINK__TO:
				setTo((Node)null);
				return;
			case NetworkPackage.LINK__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case NetworkPackage.LINK__FREESPEED:
				setFreespeed(FREESPEED_EDEFAULT);
				return;
			case NetworkPackage.LINK__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case NetworkPackage.LINK__NOF_LANES:
				setNofLanes(NOF_LANES_EDEFAULT);
				return;
			case NetworkPackage.LINK__ALLOWED_MODES:
				getAllowedModes().clear();
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
			case NetworkPackage.LINK__FROM:
				return from != null;
			case NetworkPackage.LINK__TO:
				return to != null;
			case NetworkPackage.LINK__LENGTH:
				return length != LENGTH_EDEFAULT;
			case NetworkPackage.LINK__FREESPEED:
				return freespeed != FREESPEED_EDEFAULT;
			case NetworkPackage.LINK__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case NetworkPackage.LINK__NOF_LANES:
				return nofLanes != NOF_LANES_EDEFAULT;
			case NetworkPackage.LINK__ALLOWED_MODES:
				return allowedModes != null && !allowedModes.isEmpty();
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
		result.append(" (length: ");
		result.append(length);
		result.append(", freespeed: ");
		result.append(freespeed);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", nofLanes: ");
		result.append(nofLanes);
		result.append(", allowedModes: ");
		result.append(allowedModes);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
