/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;
import CommonFreightTransportMetamodel.logisticSolution.Tour;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint;
import CommonFreightTransportMetamodel.utils.TimeWindow_;

import CommonFreightTransportMetamodel.utils.impl.HasId_Impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Record Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl#getExecutingCEPSP <em>Executing CEPSP</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl#getNo <em>No</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl#getFrom <em>From</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl#getTo <em>To</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl#getTimeWindow <em>Time Window</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl#getFromSpec <em>From Spec</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl#getToSpec <em>To Spec</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl#getTour <em>Tour</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordEntryImpl#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentRecordEntryImpl extends HasId_Impl implements ShipmentRecordEntry {
	/**
	 * The cached value of the '{@link #getExecutingCEPSP() <em>Executing CEPSP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutingCEPSP()
	 * @generated
	 * @ordered
	 */
	protected CEPSP executingCEPSP;

	/**
	 * The default value of the '{@link #getNo() <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNo() <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo()
	 * @generated
	 * @ordered
	 */
	protected int no = NO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Location_ from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Location_ to;

	/**
	 * The cached value of the '{@link #getTimeWindow() <em>Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeWindow()
	 * @generated
	 * @ordered
	 */
	protected TimeWindow_ timeWindow;

	/**
	 * The cached value of the '{@link #getFromSpec() <em>From Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSpec()
	 * @generated
	 * @ordered
	 */
	protected ShipmentlLegStartEndPoint fromSpec;

	/**
	 * The cached value of the '{@link #getToSpec() <em>To Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSpec()
	 * @generated
	 * @ordered
	 */
	protected ShipmentlLegStartEndPoint toSpec;

	/**
	 * The cached value of the '{@link #getTour() <em>Tour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTour()
	 * @generated
	 * @ordered
	 */
	protected Tour tour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentRecordEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticSolutionPackage.Literals.SHIPMENT_RECORD_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CEPSP getExecutingCEPSP() {
		if (executingCEPSP != null && executingCEPSP.eIsProxy()) {
			InternalEObject oldExecutingCEPSP = (InternalEObject)executingCEPSP;
			executingCEPSP = (CEPSP)eResolveProxy(oldExecutingCEPSP);
			if (executingCEPSP != oldExecutingCEPSP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__EXECUTING_CEPSP, oldExecutingCEPSP, executingCEPSP));
			}
		}
		return executingCEPSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEPSP basicGetExecutingCEPSP() {
		return executingCEPSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutingCEPSP(CEPSP newExecutingCEPSP) {
		CEPSP oldExecutingCEPSP = executingCEPSP;
		executingCEPSP = newExecutingCEPSP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__EXECUTING_CEPSP, oldExecutingCEPSP, executingCEPSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNo() {
		return no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNo(int newNo) {
		int oldNo = no;
		no = newNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__NO, oldNo, no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location_ getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Location_ newFrom, NotificationChain msgs) {
		Location_ oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM, oldFrom, newFrom);
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
	public void setFrom(Location_ newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location_ getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Location_ newTo, NotificationChain msgs) {
		Location_ oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO, oldTo, newTo);
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
	public void setTo(Location_ newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWindow_ getTimeWindow() {
		return timeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeWindow(TimeWindow_ newTimeWindow, NotificationChain msgs) {
		TimeWindow_ oldTimeWindow = timeWindow;
		timeWindow = newTimeWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TIME_WINDOW, oldTimeWindow, newTimeWindow);
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
	public void setTimeWindow(TimeWindow_ newTimeWindow) {
		if (newTimeWindow != timeWindow) {
			NotificationChain msgs = null;
			if (timeWindow != null)
				msgs = ((InternalEObject)timeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TIME_WINDOW, null, msgs);
			if (newTimeWindow != null)
				msgs = ((InternalEObject)newTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TIME_WINDOW, null, msgs);
			msgs = basicSetTimeWindow(newTimeWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TIME_WINDOW, newTimeWindow, newTimeWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentlLegStartEndPoint getFromSpec() {
		if (fromSpec != null && fromSpec.eIsProxy()) {
			InternalEObject oldFromSpec = (InternalEObject)fromSpec;
			fromSpec = (ShipmentlLegStartEndPoint)eResolveProxy(oldFromSpec);
			if (fromSpec != oldFromSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM_SPEC, oldFromSpec, fromSpec));
			}
		}
		return fromSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentlLegStartEndPoint basicGetFromSpec() {
		return fromSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromSpec(ShipmentlLegStartEndPoint newFromSpec) {
		ShipmentlLegStartEndPoint oldFromSpec = fromSpec;
		fromSpec = newFromSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM_SPEC, oldFromSpec, fromSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentlLegStartEndPoint getToSpec() {
		if (toSpec != null && toSpec.eIsProxy()) {
			InternalEObject oldToSpec = (InternalEObject)toSpec;
			toSpec = (ShipmentlLegStartEndPoint)eResolveProxy(oldToSpec);
			if (toSpec != oldToSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO_SPEC, oldToSpec, toSpec));
			}
		}
		return toSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentlLegStartEndPoint basicGetToSpec() {
		return toSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToSpec(ShipmentlLegStartEndPoint newToSpec) {
		ShipmentlLegStartEndPoint oldToSpec = toSpec;
		toSpec = newToSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO_SPEC, oldToSpec, toSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tour getTour() {
		if (tour != null && tour.eIsProxy()) {
			InternalEObject oldTour = (InternalEObject)tour;
			tour = (Tour)eResolveProxy(oldTour);
			if (tour != oldTour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TOUR, oldTour, tour));
			}
		}
		return tour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tour basicGetTour() {
		return tour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTour(Tour newTour) {
		Tour oldTour = tour;
		tour = newTour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TOUR, oldTour, tour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentRecord getRecord() {
		if (eContainerFeatureID() != LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD) return null;
		return (ShipmentRecord)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecord(ShipmentRecord newRecord, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRecord, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecord(ShipmentRecord newRecord) {
		if (newRecord != eInternalContainer() || (eContainerFeatureID() != LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD && newRecord != null)) {
			if (EcoreUtil.isAncestor(this, newRecord))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRecord != null)
				msgs = ((InternalEObject)newRecord).eInverseAdd(this, LogisticSolutionPackage.SHIPMENT_RECORD__ENTRIES, ShipmentRecord.class, msgs);
			msgs = basicSetRecord(newRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD, newRecord, newRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRecord((ShipmentRecord)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM:
				return basicSetFrom(null, msgs);
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO:
				return basicSetTo(null, msgs);
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TIME_WINDOW:
				return basicSetTimeWindow(null, msgs);
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD:
				return basicSetRecord(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD:
				return eInternalContainer().eInverseRemove(this, LogisticSolutionPackage.SHIPMENT_RECORD__ENTRIES, ShipmentRecord.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__EXECUTING_CEPSP:
				if (resolve) return getExecutingCEPSP();
				return basicGetExecutingCEPSP();
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__NO:
				return getNo();
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM:
				return getFrom();
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO:
				return getTo();
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TIME_WINDOW:
				return getTimeWindow();
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM_SPEC:
				if (resolve) return getFromSpec();
				return basicGetFromSpec();
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO_SPEC:
				if (resolve) return getToSpec();
				return basicGetToSpec();
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TOUR:
				if (resolve) return getTour();
				return basicGetTour();
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD:
				return getRecord();
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
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__EXECUTING_CEPSP:
				setExecutingCEPSP((CEPSP)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__NO:
				setNo((Integer)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM:
				setFrom((Location_)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO:
				setTo((Location_)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TIME_WINDOW:
				setTimeWindow((TimeWindow_)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM_SPEC:
				setFromSpec((ShipmentlLegStartEndPoint)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO_SPEC:
				setToSpec((ShipmentlLegStartEndPoint)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TOUR:
				setTour((Tour)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD:
				setRecord((ShipmentRecord)newValue);
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
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__EXECUTING_CEPSP:
				setExecutingCEPSP((CEPSP)null);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__NO:
				setNo(NO_EDEFAULT);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM:
				setFrom((Location_)null);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO:
				setTo((Location_)null);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TIME_WINDOW:
				setTimeWindow((TimeWindow_)null);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM_SPEC:
				setFromSpec((ShipmentlLegStartEndPoint)null);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO_SPEC:
				setToSpec((ShipmentlLegStartEndPoint)null);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TOUR:
				setTour((Tour)null);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD:
				setRecord((ShipmentRecord)null);
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
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__EXECUTING_CEPSP:
				return executingCEPSP != null;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__NO:
				return no != NO_EDEFAULT;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM:
				return from != null;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO:
				return to != null;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TIME_WINDOW:
				return timeWindow != null;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__FROM_SPEC:
				return fromSpec != null;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TO_SPEC:
				return toSpec != null;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__TOUR:
				return tour != null;
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD:
				return getRecord() != null;
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
		result.append(" (no: ");
		result.append(no);
		result.append(')');
		return result.toString();
	}

} //ShipmentRecordEntryImpl
