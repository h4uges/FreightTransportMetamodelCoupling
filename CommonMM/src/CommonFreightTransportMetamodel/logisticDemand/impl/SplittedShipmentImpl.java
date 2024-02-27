/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;
import CommonFreightTransportMetamodel.logisticDemand.SplittedShipment;
import CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.TimeWindow_;
import CommonFreightTransportMetamodel.utils.Timestamp_;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Splitted Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.SplittedShipmentImpl#getArrivalAtDestinationTimeWindow <em>Arrival At Destination Time Window</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.SplittedShipmentImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.SplittedShipmentImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.SplittedShipmentImpl#getArrivalAtOrigin <em>Arrival At Origin</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.SplittedShipmentImpl#getOriginalId <em>Original Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplittedShipmentImpl extends ShipmentImpl implements SplittedShipment {
	/**
	 * The cached value of the '{@link #getArrivalAtDestinationTimeWindow() <em>Arrival At Destination Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalAtDestinationTimeWindow()
	 * @generated
	 * @ordered
	 */
	protected TimeWindow_ arrivalAtDestinationTimeWindow;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Location_ destination;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Location_ origin;

	/**
	 * The cached value of the '{@link #getArrivalAtOrigin() <em>Arrival At Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalAtOrigin()
	 * @generated
	 * @ordered
	 */
	protected Timestamp_ arrivalAtOrigin;

	/**
	 * The default value of the '{@link #getOriginalId() <em>Original Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalId() <em>Original Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalId()
	 * @generated
	 * @ordered
	 */
	protected String originalId = ORIGINAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplittedShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticDemandPackage.Literals.SPLITTED_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWindow_ getArrivalAtDestinationTimeWindow() {
		return arrivalAtDestinationTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalAtDestinationTimeWindow(TimeWindow_ newArrivalAtDestinationTimeWindow, NotificationChain msgs) {
		TimeWindow_ oldArrivalAtDestinationTimeWindow = arrivalAtDestinationTimeWindow;
		arrivalAtDestinationTimeWindow = newArrivalAtDestinationTimeWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW, oldArrivalAtDestinationTimeWindow, newArrivalAtDestinationTimeWindow);
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
	public void setArrivalAtDestinationTimeWindow(TimeWindow_ newArrivalAtDestinationTimeWindow) {
		if (newArrivalAtDestinationTimeWindow != arrivalAtDestinationTimeWindow) {
			NotificationChain msgs = null;
			if (arrivalAtDestinationTimeWindow != null)
				msgs = ((InternalEObject)arrivalAtDestinationTimeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW, null, msgs);
			if (newArrivalAtDestinationTimeWindow != null)
				msgs = ((InternalEObject)newArrivalAtDestinationTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW, null, msgs);
			msgs = basicSetArrivalAtDestinationTimeWindow(newArrivalAtDestinationTimeWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW, newArrivalAtDestinationTimeWindow, newArrivalAtDestinationTimeWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location_ getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (Location_)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticDemandPackage.SPLITTED_SHIPMENT__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location_ basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(Location_ newDestination) {
		Location_ oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.SPLITTED_SHIPMENT__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location_ getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (Location_)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location_ basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(Location_ newOrigin) {
		Location_ oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timestamp_ getArrivalAtOrigin() {
		return arrivalAtOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalAtOrigin(Timestamp_ newArrivalAtOrigin, NotificationChain msgs) {
		Timestamp_ oldArrivalAtOrigin = arrivalAtOrigin;
		arrivalAtOrigin = newArrivalAtOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN, oldArrivalAtOrigin, newArrivalAtOrigin);
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
	public void setArrivalAtOrigin(Timestamp_ newArrivalAtOrigin) {
		if (newArrivalAtOrigin != arrivalAtOrigin) {
			NotificationChain msgs = null;
			if (arrivalAtOrigin != null)
				msgs = ((InternalEObject)arrivalAtOrigin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN, null, msgs);
			if (newArrivalAtOrigin != null)
				msgs = ((InternalEObject)newArrivalAtOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN, null, msgs);
			msgs = basicSetArrivalAtOrigin(newArrivalAtOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN, newArrivalAtOrigin, newArrivalAtOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginalId() {
		return originalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalId(String newOriginalId) {
		String oldOriginalId = originalId;
		originalId = newOriginalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGINAL_ID, oldOriginalId, originalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				return basicSetArrivalAtDestinationTimeWindow(null, msgs);
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN:
				return basicSetArrivalAtOrigin(null, msgs);
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
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				return getArrivalAtDestinationTimeWindow();
			case LogisticDemandPackage.SPLITTED_SHIPMENT__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN:
				return getArrivalAtOrigin();
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGINAL_ID:
				return getOriginalId();
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
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				setArrivalAtDestinationTimeWindow((TimeWindow_)newValue);
				return;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__DESTINATION:
				setDestination((Location_)newValue);
				return;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGIN:
				setOrigin((Location_)newValue);
				return;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN:
				setArrivalAtOrigin((Timestamp_)newValue);
				return;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGINAL_ID:
				setOriginalId((String)newValue);
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
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				setArrivalAtDestinationTimeWindow((TimeWindow_)null);
				return;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__DESTINATION:
				setDestination((Location_)null);
				return;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGIN:
				setOrigin((Location_)null);
				return;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN:
				setArrivalAtOrigin((Timestamp_)null);
				return;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGINAL_ID:
				setOriginalId(ORIGINAL_ID_EDEFAULT);
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
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				return arrivalAtDestinationTimeWindow != null;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__DESTINATION:
				return destination != null;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGIN:
				return origin != null;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN:
				return arrivalAtOrigin != null;
			case LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGINAL_ID:
				return ORIGINAL_ID_EDEFAULT == null ? originalId != null : !ORIGINAL_ID_EDEFAULT.equals(originalId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ToInsideStudyAreaShipmentBase.class) {
			switch (derivedFeatureID) {
				case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW: return LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW;
				case LogisticDemandPackage.SPLITTED_SHIPMENT__DESTINATION: return LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION;
				default: return -1;
			}
		}
		if (baseClass == FromInsideStudyAreaShipmentBase.class) {
			switch (derivedFeatureID) {
				case LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGIN: return LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN;
				case LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN: return LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ToInsideStudyAreaShipmentBase.class) {
			switch (baseFeatureID) {
				case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW: return LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW;
				case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION: return LogisticDemandPackage.SPLITTED_SHIPMENT__DESTINATION;
				default: return -1;
			}
		}
		if (baseClass == FromInsideStudyAreaShipmentBase.class) {
			switch (baseFeatureID) {
				case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ORIGIN: return LogisticDemandPackage.SPLITTED_SHIPMENT__ORIGIN;
				case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_ORIGIN: return LogisticDemandPackage.SPLITTED_SHIPMENT__ARRIVAL_AT_ORIGIN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (originalId: ");
		result.append(originalId);
		result.append(')');
		return result.toString();
	}

} //SplittedShipmentImpl
