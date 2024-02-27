/**
 */
package MATSimFreightMetamodel.freightContrib.events.impl;

import MATSimFreightMetamodel.freightContrib.Carrier;
import MATSimFreightMetamodel.freightContrib.CarrierVehicle;

import MATSimFreightMetamodel.freightContrib.events.CarrierEvent;
import MATSimFreightMetamodel.freightContrib.events.EventsPackage;

import MATSimFreightMetamodel.matsim.core.impl.EventImpl;

import MATSimFreightMetamodel.matsim.core.network.Link;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierEventImpl#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierEventImpl#getLink <em>Link</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierEventImpl#getCarriervehicle <em>Carriervehicle</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CarrierEventImpl extends EventImpl implements CarrierEvent {
	/**
	 * The cached value of the '{@link #getCarrier() <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrier()
	 * @generated
	 * @ordered
	 */
	protected Carrier carrier;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Link link;

	/**
	 * The cached value of the '{@link #getCarriervehicle() <em>Carriervehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarriervehicle()
	 * @generated
	 * @ordered
	 */
	protected CarrierVehicle carriervehicle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.CARRIER_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Carrier getCarrier() {
		if (carrier != null && carrier.eIsProxy()) {
			InternalEObject oldCarrier = (InternalEObject)carrier;
			carrier = (Carrier)eResolveProxy(oldCarrier);
			if (carrier != oldCarrier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventsPackage.CARRIER_EVENT__CARRIER, oldCarrier, carrier));
			}
		}
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carrier basicGetCarrier() {
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrier(Carrier newCarrier) {
		Carrier oldCarrier = carrier;
		carrier = newCarrier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.CARRIER_EVENT__CARRIER, oldCarrier, carrier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getLink() {
		if (link != null && link.eIsProxy()) {
			InternalEObject oldLink = (InternalEObject)link;
			link = (Link)eResolveProxy(oldLink);
			if (link != oldLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventsPackage.CARRIER_EVENT__LINK, oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLink(Link newLink) {
		Link oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.CARRIER_EVENT__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierVehicle getCarriervehicle() {
		if (carriervehicle != null && carriervehicle.eIsProxy()) {
			InternalEObject oldCarriervehicle = (InternalEObject)carriervehicle;
			carriervehicle = (CarrierVehicle)eResolveProxy(oldCarriervehicle);
			if (carriervehicle != oldCarriervehicle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventsPackage.CARRIER_EVENT__CARRIERVEHICLE, oldCarriervehicle, carriervehicle));
			}
		}
		return carriervehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierVehicle basicGetCarriervehicle() {
		return carriervehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarriervehicle(CarrierVehicle newCarriervehicle) {
		CarrierVehicle oldCarriervehicle = carriervehicle;
		carriervehicle = newCarriervehicle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.CARRIER_EVENT__CARRIERVEHICLE, oldCarriervehicle, carriervehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.CARRIER_EVENT__CARRIER:
				if (resolve) return getCarrier();
				return basicGetCarrier();
			case EventsPackage.CARRIER_EVENT__LINK:
				if (resolve) return getLink();
				return basicGetLink();
			case EventsPackage.CARRIER_EVENT__CARRIERVEHICLE:
				if (resolve) return getCarriervehicle();
				return basicGetCarriervehicle();
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
			case EventsPackage.CARRIER_EVENT__CARRIER:
				setCarrier((Carrier)newValue);
				return;
			case EventsPackage.CARRIER_EVENT__LINK:
				setLink((Link)newValue);
				return;
			case EventsPackage.CARRIER_EVENT__CARRIERVEHICLE:
				setCarriervehicle((CarrierVehicle)newValue);
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
			case EventsPackage.CARRIER_EVENT__CARRIER:
				setCarrier((Carrier)null);
				return;
			case EventsPackage.CARRIER_EVENT__LINK:
				setLink((Link)null);
				return;
			case EventsPackage.CARRIER_EVENT__CARRIERVEHICLE:
				setCarriervehicle((CarrierVehicle)null);
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
			case EventsPackage.CARRIER_EVENT__CARRIER:
				return carrier != null;
			case EventsPackage.CARRIER_EVENT__LINK:
				return link != null;
			case EventsPackage.CARRIER_EVENT__CARRIERVEHICLE:
				return carriervehicle != null;
		}
		return super.eIsSet(featureID);
	}

} //CarrierEventImpl
