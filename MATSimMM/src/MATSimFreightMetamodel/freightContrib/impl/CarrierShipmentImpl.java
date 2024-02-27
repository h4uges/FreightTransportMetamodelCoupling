/**
 */
package MATSimFreightMetamodel.freightContrib.impl;

import MATSimFreightMetamodel.base.impl.EntityImpl;

import MATSimFreightMetamodel.freightContrib.CarrierShipment;
import MATSimFreightMetamodel.freightContrib.FreightContribPackage;
import MATSimFreightMetamodel.freightContrib.TimeWindow;

import MATSimFreightMetamodel.matsim.core.network.Link;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierShipmentImpl#getSize <em>Size</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierShipmentImpl#getPickupTimeWindow <em>Pickup Time Window</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierShipmentImpl#getDeliveryTimeWindow <em>Delivery Time Window</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierShipmentImpl#getPickupServiceTime <em>Pickup Service Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierShipmentImpl#getDeliveryServiceTime <em>Delivery Service Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierShipmentImpl#getFrom <em>From</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierShipmentImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierShipmentImpl extends EntityImpl implements CarrierShipment {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPickupTimeWindow() <em>Pickup Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickupTimeWindow()
	 * @generated
	 * @ordered
	 */
	protected TimeWindow pickupTimeWindow;

	/**
	 * The cached value of the '{@link #getDeliveryTimeWindow() <em>Delivery Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryTimeWindow()
	 * @generated
	 * @ordered
	 */
	protected TimeWindow deliveryTimeWindow;

	/**
	 * The default value of the '{@link #getPickupServiceTime() <em>Pickup Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickupServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final double PICKUP_SERVICE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPickupServiceTime() <em>Pickup Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickupServiceTime()
	 * @generated
	 * @ordered
	 */
	protected double pickupServiceTime = PICKUP_SERVICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryServiceTime() <em>Delivery Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final double DELIVERY_SERVICE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeliveryServiceTime() <em>Delivery Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryServiceTime()
	 * @generated
	 * @ordered
	 */
	protected double deliveryServiceTime = DELIVERY_SERVICE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Link from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Link to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightContribPackage.Literals.CARRIER_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SHIPMENT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWindow getPickupTimeWindow() {
		return pickupTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPickupTimeWindow(TimeWindow newPickupTimeWindow, NotificationChain msgs) {
		TimeWindow oldPickupTimeWindow = pickupTimeWindow;
		pickupTimeWindow = newPickupTimeWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SHIPMENT__PICKUP_TIME_WINDOW, oldPickupTimeWindow, newPickupTimeWindow);
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
	public void setPickupTimeWindow(TimeWindow newPickupTimeWindow) {
		if (newPickupTimeWindow != pickupTimeWindow) {
			NotificationChain msgs = null;
			if (pickupTimeWindow != null)
				msgs = ((InternalEObject)pickupTimeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.CARRIER_SHIPMENT__PICKUP_TIME_WINDOW, null, msgs);
			if (newPickupTimeWindow != null)
				msgs = ((InternalEObject)newPickupTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.CARRIER_SHIPMENT__PICKUP_TIME_WINDOW, null, msgs);
			msgs = basicSetPickupTimeWindow(newPickupTimeWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SHIPMENT__PICKUP_TIME_WINDOW, newPickupTimeWindow, newPickupTimeWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWindow getDeliveryTimeWindow() {
		return deliveryTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeliveryTimeWindow(TimeWindow newDeliveryTimeWindow, NotificationChain msgs) {
		TimeWindow oldDeliveryTimeWindow = deliveryTimeWindow;
		deliveryTimeWindow = newDeliveryTimeWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW, oldDeliveryTimeWindow, newDeliveryTimeWindow);
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
	public void setDeliveryTimeWindow(TimeWindow newDeliveryTimeWindow) {
		if (newDeliveryTimeWindow != deliveryTimeWindow) {
			NotificationChain msgs = null;
			if (deliveryTimeWindow != null)
				msgs = ((InternalEObject)deliveryTimeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW, null, msgs);
			if (newDeliveryTimeWindow != null)
				msgs = ((InternalEObject)newDeliveryTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW, null, msgs);
			msgs = basicSetDeliveryTimeWindow(newDeliveryTimeWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW, newDeliveryTimeWindow, newDeliveryTimeWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPickupServiceTime() {
		return pickupServiceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPickupServiceTime(double newPickupServiceTime) {
		double oldPickupServiceTime = pickupServiceTime;
		pickupServiceTime = newPickupServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SHIPMENT__PICKUP_SERVICE_TIME, oldPickupServiceTime, pickupServiceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeliveryServiceTime() {
		return deliveryServiceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryServiceTime(double newDeliveryServiceTime) {
		double oldDeliveryServiceTime = deliveryServiceTime;
		deliveryServiceTime = newDeliveryServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_SERVICE_TIME, oldDeliveryServiceTime, deliveryServiceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Link)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreightContribPackage.CARRIER_SHIPMENT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(Link newFrom) {
		Link oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SHIPMENT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Link)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreightContribPackage.CARRIER_SHIPMENT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(Link newTo) {
		Link oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_SHIPMENT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreightContribPackage.CARRIER_SHIPMENT__PICKUP_TIME_WINDOW:
				return basicSetPickupTimeWindow(null, msgs);
			case FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW:
				return basicSetDeliveryTimeWindow(null, msgs);
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
			case FreightContribPackage.CARRIER_SHIPMENT__SIZE:
				return getSize();
			case FreightContribPackage.CARRIER_SHIPMENT__PICKUP_TIME_WINDOW:
				return getPickupTimeWindow();
			case FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW:
				return getDeliveryTimeWindow();
			case FreightContribPackage.CARRIER_SHIPMENT__PICKUP_SERVICE_TIME:
				return getPickupServiceTime();
			case FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_SERVICE_TIME:
				return getDeliveryServiceTime();
			case FreightContribPackage.CARRIER_SHIPMENT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case FreightContribPackage.CARRIER_SHIPMENT__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case FreightContribPackage.CARRIER_SHIPMENT__SIZE:
				setSize((Integer)newValue);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__PICKUP_TIME_WINDOW:
				setPickupTimeWindow((TimeWindow)newValue);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW:
				setDeliveryTimeWindow((TimeWindow)newValue);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__PICKUP_SERVICE_TIME:
				setPickupServiceTime((Double)newValue);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_SERVICE_TIME:
				setDeliveryServiceTime((Double)newValue);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__FROM:
				setFrom((Link)newValue);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__TO:
				setTo((Link)newValue);
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
			case FreightContribPackage.CARRIER_SHIPMENT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__PICKUP_TIME_WINDOW:
				setPickupTimeWindow((TimeWindow)null);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW:
				setDeliveryTimeWindow((TimeWindow)null);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__PICKUP_SERVICE_TIME:
				setPickupServiceTime(PICKUP_SERVICE_TIME_EDEFAULT);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_SERVICE_TIME:
				setDeliveryServiceTime(DELIVERY_SERVICE_TIME_EDEFAULT);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__FROM:
				setFrom((Link)null);
				return;
			case FreightContribPackage.CARRIER_SHIPMENT__TO:
				setTo((Link)null);
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
			case FreightContribPackage.CARRIER_SHIPMENT__SIZE:
				return size != SIZE_EDEFAULT;
			case FreightContribPackage.CARRIER_SHIPMENT__PICKUP_TIME_WINDOW:
				return pickupTimeWindow != null;
			case FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_TIME_WINDOW:
				return deliveryTimeWindow != null;
			case FreightContribPackage.CARRIER_SHIPMENT__PICKUP_SERVICE_TIME:
				return pickupServiceTime != PICKUP_SERVICE_TIME_EDEFAULT;
			case FreightContribPackage.CARRIER_SHIPMENT__DELIVERY_SERVICE_TIME:
				return deliveryServiceTime != DELIVERY_SERVICE_TIME_EDEFAULT;
			case FreightContribPackage.CARRIER_SHIPMENT__FROM:
				return from != null;
			case FreightContribPackage.CARRIER_SHIPMENT__TO:
				return to != null;
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
		result.append(" (size: ");
		result.append(size);
		result.append(", pickupServiceTime: ");
		result.append(pickupServiceTime);
		result.append(", deliveryServiceTime: ");
		result.append(deliveryServiceTime);
		result.append(')');
		return result.toString();
	}

} //CarrierShipmentImpl
