/**
 */
package MATSimFreightMetamodel.freightContrib.impl;

import MATSimFreightMetamodel.base.impl.EntityImpl;

import MATSimFreightMetamodel.freightContrib.Carrier;
import MATSimFreightMetamodel.freightContrib.CarrierCapabilities;
import MATSimFreightMetamodel.freightContrib.CarrierPlan;
import MATSimFreightMetamodel.freightContrib.CarrierService;
import MATSimFreightMetamodel.freightContrib.CarrierShipment;
import MATSimFreightMetamodel.freightContrib.FreightContribPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierImpl#getServices <em>Services</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierImpl#getShipments <em>Shipments</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierImpl#getCarrierCapabilities <em>Carrier Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierImpl extends EntityImpl implements Carrier {
	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected CarrierPlan plan;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<CarrierService> services;

	/**
	 * The cached value of the '{@link #getShipments() <em>Shipments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipments()
	 * @generated
	 * @ordered
	 */
	protected EList<CarrierShipment> shipments;

	/**
	 * The cached value of the '{@link #getCarrierCapabilities() <em>Carrier Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierCapabilities()
	 * @generated
	 * @ordered
	 */
	protected CarrierCapabilities carrierCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightContribPackage.Literals.CARRIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierPlan getPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(CarrierPlan newPlan, NotificationChain msgs) {
		CarrierPlan oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER__PLAN, oldPlan, newPlan);
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
	public void setPlan(CarrierPlan newPlan) {
		if (newPlan != plan) {
			NotificationChain msgs = null;
			if (plan != null)
				msgs = ((InternalEObject)plan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.CARRIER__PLAN, null, msgs);
			if (newPlan != null)
				msgs = ((InternalEObject)newPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.CARRIER__PLAN, null, msgs);
			msgs = basicSetPlan(newPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER__PLAN, newPlan, newPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CarrierService> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<CarrierService>(CarrierService.class, this, FreightContribPackage.CARRIER__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CarrierShipment> getShipments() {
		if (shipments == null) {
			shipments = new EObjectContainmentEList<CarrierShipment>(CarrierShipment.class, this, FreightContribPackage.CARRIER__SHIPMENTS);
		}
		return shipments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierCapabilities getCarrierCapabilities() {
		return carrierCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarrierCapabilities(CarrierCapabilities newCarrierCapabilities, NotificationChain msgs) {
		CarrierCapabilities oldCarrierCapabilities = carrierCapabilities;
		carrierCapabilities = newCarrierCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER__CARRIER_CAPABILITIES, oldCarrierCapabilities, newCarrierCapabilities);
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
	public void setCarrierCapabilities(CarrierCapabilities newCarrierCapabilities) {
		if (newCarrierCapabilities != carrierCapabilities) {
			NotificationChain msgs = null;
			if (carrierCapabilities != null)
				msgs = ((InternalEObject)carrierCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.CARRIER__CARRIER_CAPABILITIES, null, msgs);
			if (newCarrierCapabilities != null)
				msgs = ((InternalEObject)newCarrierCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FreightContribPackage.CARRIER__CARRIER_CAPABILITIES, null, msgs);
			msgs = basicSetCarrierCapabilities(newCarrierCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER__CARRIER_CAPABILITIES, newCarrierCapabilities, newCarrierCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreightContribPackage.CARRIER__PLAN:
				return basicSetPlan(null, msgs);
			case FreightContribPackage.CARRIER__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case FreightContribPackage.CARRIER__SHIPMENTS:
				return ((InternalEList<?>)getShipments()).basicRemove(otherEnd, msgs);
			case FreightContribPackage.CARRIER__CARRIER_CAPABILITIES:
				return basicSetCarrierCapabilities(null, msgs);
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
			case FreightContribPackage.CARRIER__PLAN:
				return getPlan();
			case FreightContribPackage.CARRIER__SERVICES:
				return getServices();
			case FreightContribPackage.CARRIER__SHIPMENTS:
				return getShipments();
			case FreightContribPackage.CARRIER__CARRIER_CAPABILITIES:
				return getCarrierCapabilities();
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
			case FreightContribPackage.CARRIER__PLAN:
				setPlan((CarrierPlan)newValue);
				return;
			case FreightContribPackage.CARRIER__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends CarrierService>)newValue);
				return;
			case FreightContribPackage.CARRIER__SHIPMENTS:
				getShipments().clear();
				getShipments().addAll((Collection<? extends CarrierShipment>)newValue);
				return;
			case FreightContribPackage.CARRIER__CARRIER_CAPABILITIES:
				setCarrierCapabilities((CarrierCapabilities)newValue);
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
			case FreightContribPackage.CARRIER__PLAN:
				setPlan((CarrierPlan)null);
				return;
			case FreightContribPackage.CARRIER__SERVICES:
				getServices().clear();
				return;
			case FreightContribPackage.CARRIER__SHIPMENTS:
				getShipments().clear();
				return;
			case FreightContribPackage.CARRIER__CARRIER_CAPABILITIES:
				setCarrierCapabilities((CarrierCapabilities)null);
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
			case FreightContribPackage.CARRIER__PLAN:
				return plan != null;
			case FreightContribPackage.CARRIER__SERVICES:
				return services != null && !services.isEmpty();
			case FreightContribPackage.CARRIER__SHIPMENTS:
				return shipments != null && !shipments.isEmpty();
			case FreightContribPackage.CARRIER__CARRIER_CAPABILITIES:
				return carrierCapabilities != null;
		}
		return super.eIsSet(featureID);
	}

} //CarrierImpl
