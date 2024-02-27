/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticHub;

import CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logistic Hub Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.LogisticHubEntryImpl#getLogisticHub <em>Logistic Hub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogisticHubEntryImpl extends ShipmentEntryImpl implements LogisticHubEntry {
	/**
	 * The cached value of the '{@link #getLogisticHub() <em>Logistic Hub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogisticHub()
	 * @generated
	 * @ordered
	 */
	protected LogisticHub logisticHub;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticHubEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticSolutionPackage.Literals.LOGISTIC_HUB_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticHub getLogisticHub() {
		return logisticHub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogisticHub(LogisticHub newLogisticHub, NotificationChain msgs) {
		LogisticHub oldLogisticHub = logisticHub;
		logisticHub = newLogisticHub;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.LOGISTIC_HUB_ENTRY__LOGISTIC_HUB, oldLogisticHub, newLogisticHub);
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
	public void setLogisticHub(LogisticHub newLogisticHub) {
		if (newLogisticHub != logisticHub) {
			NotificationChain msgs = null;
			if (logisticHub != null)
				msgs = ((InternalEObject)logisticHub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.LOGISTIC_HUB_ENTRY__LOGISTIC_HUB, null, msgs);
			if (newLogisticHub != null)
				msgs = ((InternalEObject)newLogisticHub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.LOGISTIC_HUB_ENTRY__LOGISTIC_HUB, null, msgs);
			msgs = basicSetLogisticHub(newLogisticHub, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.LOGISTIC_HUB_ENTRY__LOGISTIC_HUB, newLogisticHub, newLogisticHub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticSolutionPackage.LOGISTIC_HUB_ENTRY__LOGISTIC_HUB:
				return basicSetLogisticHub(null, msgs);
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
			case LogisticSolutionPackage.LOGISTIC_HUB_ENTRY__LOGISTIC_HUB:
				return getLogisticHub();
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
			case LogisticSolutionPackage.LOGISTIC_HUB_ENTRY__LOGISTIC_HUB:
				setLogisticHub((LogisticHub)newValue);
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
			case LogisticSolutionPackage.LOGISTIC_HUB_ENTRY__LOGISTIC_HUB:
				setLogisticHub((LogisticHub)null);
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
			case LogisticSolutionPackage.LOGISTIC_HUB_ENTRY__LOGISTIC_HUB:
				return logisticHub != null;
		}
		return super.eIsSet(featureID);
	}

} //LogisticHubEntryImpl
