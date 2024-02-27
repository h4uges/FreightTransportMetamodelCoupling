/**
 */
package CommonFreightTransportMetamodel.results.impl;

import CommonFreightTransportMetamodel.logisticSolution.impl.DeliveryExitImpl;

import CommonFreightTransportMetamodel.results.FailedDeliveryAttempt;
import CommonFreightTransportMetamodel.results.ResultDeliveryExit;
import CommonFreightTransportMetamodel.results.ResultsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Delivery Exit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.impl.ResultDeliveryExitImpl#getFailedPickUpAttempts <em>Failed Pick Up Attempts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultDeliveryExitImpl extends DeliveryExitImpl implements ResultDeliveryExit {
	/**
	 * The cached value of the '{@link #getFailedPickUpAttempts() <em>Failed Pick Up Attempts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedPickUpAttempts()
	 * @generated
	 * @ordered
	 */
	protected EList<FailedDeliveryAttempt> failedPickUpAttempts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultDeliveryExitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.RESULT_DELIVERY_EXIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FailedDeliveryAttempt> getFailedPickUpAttempts() {
		if (failedPickUpAttempts == null) {
			failedPickUpAttempts = new EObjectResolvingEList<FailedDeliveryAttempt>(FailedDeliveryAttempt.class, this, ResultsPackage.RESULT_DELIVERY_EXIT__FAILED_PICK_UP_ATTEMPTS);
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
			case ResultsPackage.RESULT_DELIVERY_EXIT__FAILED_PICK_UP_ATTEMPTS:
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
			case ResultsPackage.RESULT_DELIVERY_EXIT__FAILED_PICK_UP_ATTEMPTS:
				getFailedPickUpAttempts().clear();
				getFailedPickUpAttempts().addAll((Collection<? extends FailedDeliveryAttempt>)newValue);
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
			case ResultsPackage.RESULT_DELIVERY_EXIT__FAILED_PICK_UP_ATTEMPTS:
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
			case ResultsPackage.RESULT_DELIVERY_EXIT__FAILED_PICK_UP_ATTEMPTS:
				return failedPickUpAttempts != null && !failedPickUpAttempts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResultDeliveryExitImpl
