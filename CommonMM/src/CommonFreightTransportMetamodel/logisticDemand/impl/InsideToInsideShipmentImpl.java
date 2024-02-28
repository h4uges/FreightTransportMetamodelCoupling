/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer;

import CommonFreightTransportMetamodel.logisticDemand.InsideToInsideShipment;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;
import CommonFreightTransportMetamodel.logisticDemand.Shipment;
import CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment;
import CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.Dimension;
import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.TimeWindow_;
import CommonFreightTransportMetamodel.utils.UtilsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inside To Inside Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToInsideShipmentImpl#getArrivalAtDestinationTimeWindow <em>Arrival At Destination Time Window</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToInsideShipmentImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToInsideShipmentImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToInsideShipmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToInsideShipmentImpl#getResponsibleCEPSP <em>Responsible CEPSP</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToInsideShipmentImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsideToInsideShipmentImpl extends FromInsideStudyAreaShipmentImpl implements InsideToInsideShipment {
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
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected ShipmentConsumerProducer receiver;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsibleCEPSP() <em>Responsible CEPSP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleCEPSP()
	 * @generated
	 * @ordered
	 */
	protected CEPSP responsibleCEPSP;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension size;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsideToInsideShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticDemandPackage.Literals.INSIDE_TO_INSIDE_SHIPMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW, oldArrivalAtDestinationTimeWindow, newArrivalAtDestinationTimeWindow);
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
				msgs = ((InternalEObject)arrivalAtDestinationTimeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW, null, msgs);
			if (newArrivalAtDestinationTimeWindow != null)
				msgs = ((InternalEObject)newArrivalAtDestinationTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW, null, msgs);
			msgs = basicSetArrivalAtDestinationTimeWindow(newArrivalAtDestinationTimeWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW, newArrivalAtDestinationTimeWindow, newArrivalAtDestinationTimeWindow));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__DESTINATION, oldDestination, destination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentConsumerProducer getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (ShipmentConsumerProducer)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentConsumerProducer basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiver(ShipmentConsumerProducer newReceiver) {
		ShipmentConsumerProducer oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CEPSP getResponsibleCEPSP() {
		return responsibleCEPSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleCEPSP(CEPSP newResponsibleCEPSP, NotificationChain msgs) {
		CEPSP oldResponsibleCEPSP = responsibleCEPSP;
		responsibleCEPSP = newResponsibleCEPSP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP, oldResponsibleCEPSP, newResponsibleCEPSP);
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
	public void setResponsibleCEPSP(CEPSP newResponsibleCEPSP) {
		if (newResponsibleCEPSP != responsibleCEPSP) {
			NotificationChain msgs = null;
			if (responsibleCEPSP != null)
				msgs = ((InternalEObject)responsibleCEPSP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP, null, msgs);
			if (newResponsibleCEPSP != null)
				msgs = ((InternalEObject)newResponsibleCEPSP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP, null, msgs);
			msgs = basicSetResponsibleCEPSP(newResponsibleCEPSP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP, newResponsibleCEPSP, newResponsibleCEPSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Dimension newSize, NotificationChain msgs) {
		Dimension oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__SIZE, oldSize, newSize);
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
	public void setSize(Dimension newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				return basicSetArrivalAtDestinationTimeWindow(null, msgs);
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP:
				return basicSetResponsibleCEPSP(null, msgs);
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__SIZE:
				return basicSetSize(null, msgs);
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
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				return getArrivalAtDestinationTimeWindow();
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ID:
				return getId();
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP:
				return getResponsibleCEPSP();
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__SIZE:
				return getSize();
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
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				setArrivalAtDestinationTimeWindow((TimeWindow_)newValue);
				return;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__DESTINATION:
				setDestination((Location_)newValue);
				return;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RECEIVER:
				setReceiver((ShipmentConsumerProducer)newValue);
				return;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ID:
				setId((String)newValue);
				return;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP:
				setResponsibleCEPSP((CEPSP)newValue);
				return;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__SIZE:
				setSize((Dimension)newValue);
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
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				setArrivalAtDestinationTimeWindow((TimeWindow_)null);
				return;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__DESTINATION:
				setDestination((Location_)null);
				return;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RECEIVER:
				setReceiver((ShipmentConsumerProducer)null);
				return;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP:
				setResponsibleCEPSP((CEPSP)null);
				return;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__SIZE:
				setSize((Dimension)null);
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
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW:
				return arrivalAtDestinationTimeWindow != null;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__DESTINATION:
				return destination != null;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RECEIVER:
				return receiver != null;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP:
				return responsibleCEPSP != null;
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__SIZE:
				return size != null;
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
				case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW: return LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW;
				case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__DESTINATION: return LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION;
				default: return -1;
			}
		}
		if (baseClass == ToInsideStudyAreaShipment.class) {
			switch (derivedFeatureID) {
				case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RECEIVER: return LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT__RECEIVER;
				default: return -1;
			}
		}
		if (baseClass == HasId_.class) {
			switch (derivedFeatureID) {
				case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ID: return UtilsPackage.HAS_ID___ID;
				default: return -1;
			}
		}
		if (baseClass == Shipment.class) {
			switch (derivedFeatureID) {
				case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP: return LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP;
				case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__SIZE: return LogisticDemandPackage.SHIPMENT__SIZE;
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
				case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__ARRIVAL_AT_DESTINATION_TIME_WINDOW: return LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ARRIVAL_AT_DESTINATION_TIME_WINDOW;
				case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE__DESTINATION: return LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__DESTINATION;
				default: return -1;
			}
		}
		if (baseClass == ToInsideStudyAreaShipment.class) {
			switch (baseFeatureID) {
				case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT__RECEIVER: return LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RECEIVER;
				default: return -1;
			}
		}
		if (baseClass == HasId_.class) {
			switch (baseFeatureID) {
				case UtilsPackage.HAS_ID___ID: return LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__ID;
				default: return -1;
			}
		}
		if (baseClass == Shipment.class) {
			switch (baseFeatureID) {
				case LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP: return LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__RESPONSIBLE_CEPSP;
				case LogisticDemandPackage.SHIPMENT__SIZE: return LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT__SIZE;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //InsideToInsideShipmentImpl
