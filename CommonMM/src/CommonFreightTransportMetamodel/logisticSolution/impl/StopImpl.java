/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;
import CommonFreightTransportMetamodel.logisticSolution.Stop;
import CommonFreightTransportMetamodel.logisticSolution.StopLocation;

import CommonFreightTransportMetamodel.utils.TimeWindow_;

import CommonFreightTransportMetamodel.utils.impl.HasId_Impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.StopImpl#getStopTimeWindow <em>Stop Time Window</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.StopImpl#getNo <em>No</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.StopImpl#getStopLocation <em>Stop Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StopImpl extends HasId_Impl implements Stop {
	/**
	 * The cached value of the '{@link #getStopTimeWindow() <em>Stop Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTimeWindow()
	 * @generated
	 * @ordered
	 */
	protected TimeWindow_ stopTimeWindow;

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
	 * The cached value of the '{@link #getStopLocation() <em>Stop Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopLocation()
	 * @generated
	 * @ordered
	 */
	protected StopLocation stopLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticSolutionPackage.Literals.STOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWindow_ getStopTimeWindow() {
		return stopTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopTimeWindow(TimeWindow_ newStopTimeWindow, NotificationChain msgs) {
		TimeWindow_ oldStopTimeWindow = stopTimeWindow;
		stopTimeWindow = newStopTimeWindow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.STOP__STOP_TIME_WINDOW, oldStopTimeWindow, newStopTimeWindow);
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
	public void setStopTimeWindow(TimeWindow_ newStopTimeWindow) {
		if (newStopTimeWindow != stopTimeWindow) {
			NotificationChain msgs = null;
			if (stopTimeWindow != null)
				msgs = ((InternalEObject)stopTimeWindow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.STOP__STOP_TIME_WINDOW, null, msgs);
			if (newStopTimeWindow != null)
				msgs = ((InternalEObject)newStopTimeWindow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.STOP__STOP_TIME_WINDOW, null, msgs);
			msgs = basicSetStopTimeWindow(newStopTimeWindow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.STOP__STOP_TIME_WINDOW, newStopTimeWindow, newStopTimeWindow));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.STOP__NO, oldNo, no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopLocation getStopLocation() {
		return stopLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopLocation(StopLocation newStopLocation, NotificationChain msgs) {
		StopLocation oldStopLocation = stopLocation;
		stopLocation = newStopLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.STOP__STOP_LOCATION, oldStopLocation, newStopLocation);
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
	public void setStopLocation(StopLocation newStopLocation) {
		if (newStopLocation != stopLocation) {
			NotificationChain msgs = null;
			if (stopLocation != null)
				msgs = ((InternalEObject)stopLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.STOP__STOP_LOCATION, null, msgs);
			if (newStopLocation != null)
				msgs = ((InternalEObject)newStopLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.STOP__STOP_LOCATION, null, msgs);
			msgs = basicSetStopLocation(newStopLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.STOP__STOP_LOCATION, newStopLocation, newStopLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticSolutionPackage.STOP__STOP_TIME_WINDOW:
				return basicSetStopTimeWindow(null, msgs);
			case LogisticSolutionPackage.STOP__STOP_LOCATION:
				return basicSetStopLocation(null, msgs);
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
			case LogisticSolutionPackage.STOP__STOP_TIME_WINDOW:
				return getStopTimeWindow();
			case LogisticSolutionPackage.STOP__NO:
				return getNo();
			case LogisticSolutionPackage.STOP__STOP_LOCATION:
				return getStopLocation();
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
			case LogisticSolutionPackage.STOP__STOP_TIME_WINDOW:
				setStopTimeWindow((TimeWindow_)newValue);
				return;
			case LogisticSolutionPackage.STOP__NO:
				setNo((Integer)newValue);
				return;
			case LogisticSolutionPackage.STOP__STOP_LOCATION:
				setStopLocation((StopLocation)newValue);
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
			case LogisticSolutionPackage.STOP__STOP_TIME_WINDOW:
				setStopTimeWindow((TimeWindow_)null);
				return;
			case LogisticSolutionPackage.STOP__NO:
				setNo(NO_EDEFAULT);
				return;
			case LogisticSolutionPackage.STOP__STOP_LOCATION:
				setStopLocation((StopLocation)null);
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
			case LogisticSolutionPackage.STOP__STOP_TIME_WINDOW:
				return stopTimeWindow != null;
			case LogisticSolutionPackage.STOP__NO:
				return no != NO_EDEFAULT;
			case LogisticSolutionPackage.STOP__STOP_LOCATION:
				return stopLocation != null;
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

} //StopImpl
