/**
 */
package logiToppMetamodel.logiTopp.parcels.impl;

import logiToppMetamodel.base.Time;

import logiToppMetamodel.base.impl.EntityImpl;

import logiToppMetamodel.logiTopp.ParcelConsumer;
import logiToppMetamodel.logiTopp.ParcelProducer;

import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.parcels.Parcel;
import logiToppMetamodel.logiTopp.parcels.ParcelsPackage;
import logiToppMetamodel.logiTopp.parcels.ShipmentSize;

import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parcel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.impl.ParcelImpl#getPlannedArrivalDate <em>Planned Arrival Date</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.impl.ParcelImpl#getProducer <em>Producer</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.impl.ParcelImpl#getZoneAndLocation <em>Zone And Location</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.impl.ParcelImpl#getShipmentSize <em>Shipment Size</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.impl.ParcelImpl#isIsPickup <em>Is Pickup</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.impl.ParcelImpl#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.impl.ParcelImpl#getResponsibleCEPSP <em>Responsible CEPSP</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParcelImpl extends EntityImpl implements Parcel {
	/**
	 * The cached value of the '{@link #getPlannedArrivalDate() <em>Planned Arrival Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected Time plannedArrivalDate;

	/**
	 * The cached value of the '{@link #getProducer() <em>Producer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducer()
	 * @generated
	 * @ordered
	 */
	protected ParcelProducer producer;

	/**
	 * The cached value of the '{@link #getZoneAndLocation() <em>Zone And Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneAndLocation()
	 * @generated
	 * @ordered
	 */
	protected ZoneAndLocation zoneAndLocation;

	/**
	 * The default value of the '{@link #getShipmentSize() <em>Shipment Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentSize()
	 * @generated
	 * @ordered
	 */
	protected static final ShipmentSize SHIPMENT_SIZE_EDEFAULT = ShipmentSize.SMALL;

	/**
	 * The cached value of the '{@link #getShipmentSize() <em>Shipment Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentSize()
	 * @generated
	 * @ordered
	 */
	protected ShipmentSize shipmentSize = SHIPMENT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPickup() <em>Is Pickup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPickup()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PICKUP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPickup() <em>Is Pickup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPickup()
	 * @generated
	 * @ordered
	 */
	protected boolean isPickup = IS_PICKUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer()
	 * @generated
	 * @ordered
	 */
	protected ParcelConsumer consumer;

	/**
	 * The cached value of the '{@link #getResponsibleCEPSP() <em>Responsible CEPSP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleCEPSP()
	 * @generated
	 * @ordered
	 */
	protected CEPServiceProvider responsibleCEPSP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParcelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParcelsPackage.Literals.PARCEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getPlannedArrivalDate() {
		if (plannedArrivalDate != null && plannedArrivalDate.eIsProxy()) {
			InternalEObject oldPlannedArrivalDate = (InternalEObject)plannedArrivalDate;
			plannedArrivalDate = (Time)eResolveProxy(oldPlannedArrivalDate);
			if (plannedArrivalDate != oldPlannedArrivalDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParcelsPackage.PARCEL__PLANNED_ARRIVAL_DATE, oldPlannedArrivalDate, plannedArrivalDate));
			}
		}
		return plannedArrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetPlannedArrivalDate() {
		return plannedArrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannedArrivalDate(Time newPlannedArrivalDate) {
		Time oldPlannedArrivalDate = plannedArrivalDate;
		plannedArrivalDate = newPlannedArrivalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParcelsPackage.PARCEL__PLANNED_ARRIVAL_DATE, oldPlannedArrivalDate, plannedArrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParcelProducer getProducer() {
		if (producer != null && producer.eIsProxy()) {
			InternalEObject oldProducer = (InternalEObject)producer;
			producer = (ParcelProducer)eResolveProxy(oldProducer);
			if (producer != oldProducer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParcelsPackage.PARCEL__PRODUCER, oldProducer, producer));
			}
		}
		return producer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParcelProducer basicGetProducer() {
		return producer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProducer(ParcelProducer newProducer) {
		ParcelProducer oldProducer = producer;
		producer = newProducer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParcelsPackage.PARCEL__PRODUCER, oldProducer, producer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZoneAndLocation getZoneAndLocation() {
		return zoneAndLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZoneAndLocation(ZoneAndLocation newZoneAndLocation, NotificationChain msgs) {
		ZoneAndLocation oldZoneAndLocation = zoneAndLocation;
		zoneAndLocation = newZoneAndLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParcelsPackage.PARCEL__ZONE_AND_LOCATION, oldZoneAndLocation, newZoneAndLocation);
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
	public void setZoneAndLocation(ZoneAndLocation newZoneAndLocation) {
		if (newZoneAndLocation != zoneAndLocation) {
			NotificationChain msgs = null;
			if (zoneAndLocation != null)
				msgs = ((InternalEObject)zoneAndLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParcelsPackage.PARCEL__ZONE_AND_LOCATION, null, msgs);
			if (newZoneAndLocation != null)
				msgs = ((InternalEObject)newZoneAndLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParcelsPackage.PARCEL__ZONE_AND_LOCATION, null, msgs);
			msgs = basicSetZoneAndLocation(newZoneAndLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParcelsPackage.PARCEL__ZONE_AND_LOCATION, newZoneAndLocation, newZoneAndLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentSize getShipmentSize() {
		return shipmentSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentSize(ShipmentSize newShipmentSize) {
		ShipmentSize oldShipmentSize = shipmentSize;
		shipmentSize = newShipmentSize == null ? SHIPMENT_SIZE_EDEFAULT : newShipmentSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParcelsPackage.PARCEL__SHIPMENT_SIZE, oldShipmentSize, shipmentSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPickup() {
		return isPickup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPickup(boolean newIsPickup) {
		boolean oldIsPickup = isPickup;
		isPickup = newIsPickup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParcelsPackage.PARCEL__IS_PICKUP, oldIsPickup, isPickup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParcelConsumer getConsumer() {
		if (consumer != null && consumer.eIsProxy()) {
			InternalEObject oldConsumer = (InternalEObject)consumer;
			consumer = (ParcelConsumer)eResolveProxy(oldConsumer);
			if (consumer != oldConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParcelsPackage.PARCEL__CONSUMER, oldConsumer, consumer));
			}
		}
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParcelConsumer basicGetConsumer() {
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumer(ParcelConsumer newConsumer) {
		ParcelConsumer oldConsumer = consumer;
		consumer = newConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParcelsPackage.PARCEL__CONSUMER, oldConsumer, consumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CEPServiceProvider getResponsibleCEPSP() {
		if (responsibleCEPSP != null && responsibleCEPSP.eIsProxy()) {
			InternalEObject oldResponsibleCEPSP = (InternalEObject)responsibleCEPSP;
			responsibleCEPSP = (CEPServiceProvider)eResolveProxy(oldResponsibleCEPSP);
			if (responsibleCEPSP != oldResponsibleCEPSP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParcelsPackage.PARCEL__RESPONSIBLE_CEPSP, oldResponsibleCEPSP, responsibleCEPSP));
			}
		}
		return responsibleCEPSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEPServiceProvider basicGetResponsibleCEPSP() {
		return responsibleCEPSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsibleCEPSP(CEPServiceProvider newResponsibleCEPSP) {
		CEPServiceProvider oldResponsibleCEPSP = responsibleCEPSP;
		responsibleCEPSP = newResponsibleCEPSP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParcelsPackage.PARCEL__RESPONSIBLE_CEPSP, oldResponsibleCEPSP, responsibleCEPSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParcelsPackage.PARCEL__ZONE_AND_LOCATION:
				return basicSetZoneAndLocation(null, msgs);
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
			case ParcelsPackage.PARCEL__PLANNED_ARRIVAL_DATE:
				if (resolve) return getPlannedArrivalDate();
				return basicGetPlannedArrivalDate();
			case ParcelsPackage.PARCEL__PRODUCER:
				if (resolve) return getProducer();
				return basicGetProducer();
			case ParcelsPackage.PARCEL__ZONE_AND_LOCATION:
				return getZoneAndLocation();
			case ParcelsPackage.PARCEL__SHIPMENT_SIZE:
				return getShipmentSize();
			case ParcelsPackage.PARCEL__IS_PICKUP:
				return isIsPickup();
			case ParcelsPackage.PARCEL__CONSUMER:
				if (resolve) return getConsumer();
				return basicGetConsumer();
			case ParcelsPackage.PARCEL__RESPONSIBLE_CEPSP:
				if (resolve) return getResponsibleCEPSP();
				return basicGetResponsibleCEPSP();
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
			case ParcelsPackage.PARCEL__PLANNED_ARRIVAL_DATE:
				setPlannedArrivalDate((Time)newValue);
				return;
			case ParcelsPackage.PARCEL__PRODUCER:
				setProducer((ParcelProducer)newValue);
				return;
			case ParcelsPackage.PARCEL__ZONE_AND_LOCATION:
				setZoneAndLocation((ZoneAndLocation)newValue);
				return;
			case ParcelsPackage.PARCEL__SHIPMENT_SIZE:
				setShipmentSize((ShipmentSize)newValue);
				return;
			case ParcelsPackage.PARCEL__IS_PICKUP:
				setIsPickup((Boolean)newValue);
				return;
			case ParcelsPackage.PARCEL__CONSUMER:
				setConsumer((ParcelConsumer)newValue);
				return;
			case ParcelsPackage.PARCEL__RESPONSIBLE_CEPSP:
				setResponsibleCEPSP((CEPServiceProvider)newValue);
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
			case ParcelsPackage.PARCEL__PLANNED_ARRIVAL_DATE:
				setPlannedArrivalDate((Time)null);
				return;
			case ParcelsPackage.PARCEL__PRODUCER:
				setProducer((ParcelProducer)null);
				return;
			case ParcelsPackage.PARCEL__ZONE_AND_LOCATION:
				setZoneAndLocation((ZoneAndLocation)null);
				return;
			case ParcelsPackage.PARCEL__SHIPMENT_SIZE:
				setShipmentSize(SHIPMENT_SIZE_EDEFAULT);
				return;
			case ParcelsPackage.PARCEL__IS_PICKUP:
				setIsPickup(IS_PICKUP_EDEFAULT);
				return;
			case ParcelsPackage.PARCEL__CONSUMER:
				setConsumer((ParcelConsumer)null);
				return;
			case ParcelsPackage.PARCEL__RESPONSIBLE_CEPSP:
				setResponsibleCEPSP((CEPServiceProvider)null);
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
			case ParcelsPackage.PARCEL__PLANNED_ARRIVAL_DATE:
				return plannedArrivalDate != null;
			case ParcelsPackage.PARCEL__PRODUCER:
				return producer != null;
			case ParcelsPackage.PARCEL__ZONE_AND_LOCATION:
				return zoneAndLocation != null;
			case ParcelsPackage.PARCEL__SHIPMENT_SIZE:
				return shipmentSize != SHIPMENT_SIZE_EDEFAULT;
			case ParcelsPackage.PARCEL__IS_PICKUP:
				return isPickup != IS_PICKUP_EDEFAULT;
			case ParcelsPackage.PARCEL__CONSUMER:
				return consumer != null;
			case ParcelsPackage.PARCEL__RESPONSIBLE_CEPSP:
				return responsibleCEPSP != null;
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
		result.append(" (shipmentSize: ");
		result.append(shipmentSize);
		result.append(", isPickup: ");
		result.append(isPickup);
		result.append(')');
		return result.toString();
	}

} //ParcelImpl
