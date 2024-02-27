/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;
import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;
import CommonFreightTransportMetamodel.logisticSolution.PlannedTour;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Tour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.PlannedTourImpl#getExecutingCEPSP <em>Executing CEPSP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlannedTourImpl extends TourImpl implements PlannedTour {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedTourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticSolutionPackage.Literals.PLANNED_TOUR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticSolutionPackage.PLANNED_TOUR__EXECUTING_CEPSP, oldExecutingCEPSP, executingCEPSP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.PLANNED_TOUR__EXECUTING_CEPSP, oldExecutingCEPSP, executingCEPSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogisticSolutionPackage.PLANNED_TOUR__EXECUTING_CEPSP:
				if (resolve) return getExecutingCEPSP();
				return basicGetExecutingCEPSP();
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
			case LogisticSolutionPackage.PLANNED_TOUR__EXECUTING_CEPSP:
				setExecutingCEPSP((CEPSP)newValue);
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
			case LogisticSolutionPackage.PLANNED_TOUR__EXECUTING_CEPSP:
				setExecutingCEPSP((CEPSP)null);
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
			case LogisticSolutionPackage.PLANNED_TOUR__EXECUTING_CEPSP:
				return executingCEPSP != null;
		}
		return super.eIsSet(featureID);
	}

} //PlannedTourImpl
