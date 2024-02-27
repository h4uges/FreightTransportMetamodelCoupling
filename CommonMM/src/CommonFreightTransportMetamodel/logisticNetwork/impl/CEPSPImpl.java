/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.impl;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticHub;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;
import CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint;
import CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot;

import CommonFreightTransportMetamodel.utils.impl.HasId_Impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CEPSP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.CEPSPImpl#getVehicleDepots <em>Vehicle Depots</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.CEPSPImpl#getLogisticHubs <em>Logistic Hubs</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.CEPSPImpl#getName <em>Name</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.CEPSPImpl#getUsedPublicServicePoints <em>Used Public Service Points</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.CEPSPImpl#getDeliveryPartners <em>Delivery Partners</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.CEPSPImpl#getPickUpPartners <em>Pick Up Partners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CEPSPImpl extends HasId_Impl implements CEPSP {
	/**
	 * The cached value of the '{@link #getVehicleDepots() <em>Vehicle Depots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleDepots()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleDepot> vehicleDepots;

	/**
	 * The cached value of the '{@link #getLogisticHubs() <em>Logistic Hubs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogisticHubs()
	 * @generated
	 * @ordered
	 */
	protected EList<LogisticHub> logisticHubs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsedPublicServicePoints() <em>Used Public Service Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPublicServicePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<UsedPublicServicePoint> usedPublicServicePoints;

	/**
	 * The cached value of the '{@link #getDeliveryPartners() <em>Delivery Partners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryPartners()
	 * @generated
	 * @ordered
	 */
	protected EList<CEPSP> deliveryPartners;

	/**
	 * The cached value of the '{@link #getPickUpPartners() <em>Pick Up Partners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickUpPartners()
	 * @generated
	 * @ordered
	 */
	protected EList<CEPSP> pickUpPartners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEPSPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticNetworkPackage.Literals.CEPSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VehicleDepot> getVehicleDepots() {
		if (vehicleDepots == null) {
			vehicleDepots = new EObjectContainmentEList<VehicleDepot>(VehicleDepot.class, this, LogisticNetworkPackage.CEPSP__VEHICLE_DEPOTS);
		}
		return vehicleDepots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogisticHub> getLogisticHubs() {
		if (logisticHubs == null) {
			logisticHubs = new EObjectContainmentEList<LogisticHub>(LogisticHub.class, this, LogisticNetworkPackage.CEPSP__LOGISTIC_HUBS);
		}
		return logisticHubs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticNetworkPackage.CEPSP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UsedPublicServicePoint> getUsedPublicServicePoints() {
		if (usedPublicServicePoints == null) {
			usedPublicServicePoints = new EObjectContainmentEList<UsedPublicServicePoint>(UsedPublicServicePoint.class, this, LogisticNetworkPackage.CEPSP__USED_PUBLIC_SERVICE_POINTS);
		}
		return usedPublicServicePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CEPSP> getDeliveryPartners() {
		if (deliveryPartners == null) {
			deliveryPartners = new EObjectResolvingEList<CEPSP>(CEPSP.class, this, LogisticNetworkPackage.CEPSP__DELIVERY_PARTNERS);
		}
		return deliveryPartners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CEPSP> getPickUpPartners() {
		if (pickUpPartners == null) {
			pickUpPartners = new EObjectResolvingEList<CEPSP>(CEPSP.class, this, LogisticNetworkPackage.CEPSP__PICK_UP_PARTNERS);
		}
		return pickUpPartners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticNetworkPackage.CEPSP__VEHICLE_DEPOTS:
				return ((InternalEList<?>)getVehicleDepots()).basicRemove(otherEnd, msgs);
			case LogisticNetworkPackage.CEPSP__LOGISTIC_HUBS:
				return ((InternalEList<?>)getLogisticHubs()).basicRemove(otherEnd, msgs);
			case LogisticNetworkPackage.CEPSP__USED_PUBLIC_SERVICE_POINTS:
				return ((InternalEList<?>)getUsedPublicServicePoints()).basicRemove(otherEnd, msgs);
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
			case LogisticNetworkPackage.CEPSP__VEHICLE_DEPOTS:
				return getVehicleDepots();
			case LogisticNetworkPackage.CEPSP__LOGISTIC_HUBS:
				return getLogisticHubs();
			case LogisticNetworkPackage.CEPSP__NAME:
				return getName();
			case LogisticNetworkPackage.CEPSP__USED_PUBLIC_SERVICE_POINTS:
				return getUsedPublicServicePoints();
			case LogisticNetworkPackage.CEPSP__DELIVERY_PARTNERS:
				return getDeliveryPartners();
			case LogisticNetworkPackage.CEPSP__PICK_UP_PARTNERS:
				return getPickUpPartners();
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
			case LogisticNetworkPackage.CEPSP__VEHICLE_DEPOTS:
				getVehicleDepots().clear();
				getVehicleDepots().addAll((Collection<? extends VehicleDepot>)newValue);
				return;
			case LogisticNetworkPackage.CEPSP__LOGISTIC_HUBS:
				getLogisticHubs().clear();
				getLogisticHubs().addAll((Collection<? extends LogisticHub>)newValue);
				return;
			case LogisticNetworkPackage.CEPSP__NAME:
				setName((String)newValue);
				return;
			case LogisticNetworkPackage.CEPSP__USED_PUBLIC_SERVICE_POINTS:
				getUsedPublicServicePoints().clear();
				getUsedPublicServicePoints().addAll((Collection<? extends UsedPublicServicePoint>)newValue);
				return;
			case LogisticNetworkPackage.CEPSP__DELIVERY_PARTNERS:
				getDeliveryPartners().clear();
				getDeliveryPartners().addAll((Collection<? extends CEPSP>)newValue);
				return;
			case LogisticNetworkPackage.CEPSP__PICK_UP_PARTNERS:
				getPickUpPartners().clear();
				getPickUpPartners().addAll((Collection<? extends CEPSP>)newValue);
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
			case LogisticNetworkPackage.CEPSP__VEHICLE_DEPOTS:
				getVehicleDepots().clear();
				return;
			case LogisticNetworkPackage.CEPSP__LOGISTIC_HUBS:
				getLogisticHubs().clear();
				return;
			case LogisticNetworkPackage.CEPSP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LogisticNetworkPackage.CEPSP__USED_PUBLIC_SERVICE_POINTS:
				getUsedPublicServicePoints().clear();
				return;
			case LogisticNetworkPackage.CEPSP__DELIVERY_PARTNERS:
				getDeliveryPartners().clear();
				return;
			case LogisticNetworkPackage.CEPSP__PICK_UP_PARTNERS:
				getPickUpPartners().clear();
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
			case LogisticNetworkPackage.CEPSP__VEHICLE_DEPOTS:
				return vehicleDepots != null && !vehicleDepots.isEmpty();
			case LogisticNetworkPackage.CEPSP__LOGISTIC_HUBS:
				return logisticHubs != null && !logisticHubs.isEmpty();
			case LogisticNetworkPackage.CEPSP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LogisticNetworkPackage.CEPSP__USED_PUBLIC_SERVICE_POINTS:
				return usedPublicServicePoints != null && !usedPublicServicePoints.isEmpty();
			case LogisticNetworkPackage.CEPSP__DELIVERY_PARTNERS:
				return deliveryPartners != null && !deliveryPartners.isEmpty();
			case LogisticNetworkPackage.CEPSP__PICK_UP_PARTNERS:
				return pickUpPartners != null && !pickUpPartners.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CEPSPImpl
