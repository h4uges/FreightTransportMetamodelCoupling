/**
 */
package CommonFreightTransportMetamodel.results.impl;

import CommonFreightTransportMetamodel.logisticSolution.impl.PickUpEntryImpl;

import CommonFreightTransportMetamodel.results.FailedPickupAttempt;
import CommonFreightTransportMetamodel.results.ResultPickUpEntry;
import CommonFreightTransportMetamodel.results.ResultsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Pick Up Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.impl.ResultPickUpEntryImpl#getFailedPickUpAttempts <em>Failed Pick Up Attempts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultPickUpEntryImpl extends PickUpEntryImpl implements ResultPickUpEntry {
	/**
	 * The cached value of the '{@link #getFailedPickUpAttempts() <em>Failed Pick Up Attempts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedPickUpAttempts()
	 * @generated
	 * @ordered
	 */
	protected EList<FailedPickupAttempt> failedPickUpAttempts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultPickUpEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.RESULT_PICK_UP_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FailedPickupAttempt> getFailedPickUpAttempts() {
		if (failedPickUpAttempts == null) {
			failedPickUpAttempts = new EObjectResolvingEList<FailedPickupAttempt>(FailedPickupAttempt.class, this, ResultsPackage.RESULT_PICK_UP_ENTRY__FAILED_PICK_UP_ATTEMPTS);
		}
		return failedPickUpAttempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultsPackage.RESULT_PICK_UP_ENTRY__FAILED_PICK_UP_ATTEMPTS:
				return getFailedPickUpAttempts();
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
			case ResultsPackage.RESULT_PICK_UP_ENTRY__FAILED_PICK_UP_ATTEMPTS:
				getFailedPickUpAttempts().clear();
				getFailedPickUpAttempts().addAll((Collection<? extends FailedPickupAttempt>)newValue);
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
			case ResultsPackage.RESULT_PICK_UP_ENTRY__FAILED_PICK_UP_ATTEMPTS:
				getFailedPickUpAttempts().clear();
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
			case ResultsPackage.RESULT_PICK_UP_ENTRY__FAILED_PICK_UP_ATTEMPTS:
				return failedPickUpAttempts != null && !failedPickUpAttempts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResultPickUpEntryImpl
