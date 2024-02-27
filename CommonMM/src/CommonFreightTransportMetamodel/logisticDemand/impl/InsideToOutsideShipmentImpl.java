/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.logisticDemand.InsideToOutsideShipment;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;
import CommonFreightTransportMetamodel.logisticDemand.Shipment;
import CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;

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
 * An implementation of the model object '<em><b>Inside To Outside Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToOutsideShipmentImpl#getArrivalAtDepotTimeWindow <em>Arrival At Depot Time Window</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToOutsideShipmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToOutsideShipmentImpl#getResponsibleCEPSP <em>Responsible CEPSP</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.InsideToOutsideShipmentImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsideToOutsideShipmentImpl extends FromInsideStudyAreaShipmentImpl implements InsideToOutsideShipment {
	/**
	 * The cached value of the '{@link #getArrivalAtDepotTimeWindow() <em>Arrival At Depot Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalAtDepotTimeWindow()
	 * @generated
	 * @ordered
	 */
	protected TimeWindow_ arrivalAtDepotTimeWindow;

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
	protected InsideToOutsideShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticDemandPackage.Literals.INSIDE_TO_OUTSIDE_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWindow_ getArrivalAtDepotTimeWindow() {
		return arrivalAtDepotTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalAtDepotTimeWindow(TimeWindow_ newArrivalAtDepotTimeWindow, NotificationChain msgs) {
		TimeWindow_ oldArrivalAtDepotTimeWindow = arrivalAtDepotTimeWindow;
		arrivalAtDepotTimeWindow = newArrivalAtDepotTimeWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW, oldArrivalAtDepotTimeWindow, newArrivalAtDepotTimeWindow);
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
	public void setArrivalAtDepotTimeWindow(TimeWindow_ newArrivalAtDepotTimeWindow) {
		if (newArrivalAtDepotTimeWindow != arrivalAtDepotTimeWindow) {
			NotificationChain msgs = null;
			if (arrivalAtDepotTimeWindow != null)
				msgs = ((InternalEObject)arrivalAtDepotTimeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW, null, msgs);
			if (newArrivalAtDepotTimeWindow != null)
				msgs = ((InternalEObject)newArrivalAtDepotTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW, null, msgs);
			msgs = basicSetArrivalAtDepotTimeWindow(newArrivalAtDepotTimeWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW, newArrivalAtDepotTimeWindow, newArrivalAtDepotTimeWindow));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ID, oldId, id));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP, oldResponsibleCEPSP, newResponsibleCEPSP);
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
				msgs = ((InternalEObject)responsibleCEPSP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP, null, msgs);
			if (newResponsibleCEPSP != null)
				msgs = ((InternalEObject)newResponsibleCEPSP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP, null, msgs);
			msgs = basicSetResponsibleCEPSP(newResponsibleCEPSP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP, newResponsibleCEPSP, newResponsibleCEPSP));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__SIZE, oldSize, newSize);
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
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW:
				return basicSetArrivalAtDepotTimeWindow(null, msgs);
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP:
				return basicSetResponsibleCEPSP(null, msgs);
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__SIZE:
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
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW:
				return getArrivalAtDepotTimeWindow();
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ID:
				return getId();
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP:
				return getResponsibleCEPSP();
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__SIZE:
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
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW:
				setArrivalAtDepotTimeWindow((TimeWindow_)newValue);
				return;
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ID:
				setId((String)newValue);
				return;
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP:
				setResponsibleCEPSP((CEPSP)newValue);
				return;
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__SIZE:
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
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW:
				setArrivalAtDepotTimeWindow((TimeWindow_)null);
				return;
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP:
				setResponsibleCEPSP((CEPSP)null);
				return;
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__SIZE:
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
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW:
				return arrivalAtDepotTimeWindow != null;
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP:
				return responsibleCEPSP != null;
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__SIZE:
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
		if (baseClass == ToOutsideStudyAreaShipment.class) {
			switch (derivedFeatureID) {
				case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW: return LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW;
				default: return -1;
			}
		}
		if (baseClass == HasId_.class) {
			switch (derivedFeatureID) {
				case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ID: return UtilsPackage.HAS_ID___ID;
				default: return -1;
			}
		}
		if (baseClass == Shipment.class) {
			switch (derivedFeatureID) {
				case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP: return LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP;
				case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__SIZE: return LogisticDemandPackage.SHIPMENT__SIZE;
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
		if (baseClass == ToOutsideStudyAreaShipment.class) {
			switch (baseFeatureID) {
				case LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW: return LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ARRIVAL_AT_DEPOT_TIME_WINDOW;
				default: return -1;
			}
		}
		if (baseClass == HasId_.class) {
			switch (baseFeatureID) {
				case UtilsPackage.HAS_ID___ID: return LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__ID;
				default: return -1;
			}
		}
		if (baseClass == Shipment.class) {
			switch (baseFeatureID) {
				case LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP: return LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__RESPONSIBLE_CEPSP;
				case LogisticDemandPackage.SHIPMENT__SIZE: return LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT__SIZE;
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

} //InsideToOutsideShipmentImpl
