/**
 */
package CommonFreightTransportMetamodel.results;

import CommonFreightTransportMetamodel.logisticSolution.DeliveryExit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Delivery Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.ResultDeliveryExit#getFailedPickUpAttempts <em>Failed Pick Up Attempts</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getResultDeliveryExit()
 * @model
 * @generated
 */
public interface ResultDeliveryExit extends DeliveryExit {
	/**
	 * Returns the value of the '<em><b>Failed Pick Up Attempts</b></em>' reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.results.FailedDeliveryAttempt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Pick Up Attempts</em>' reference list.
	 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getResultDeliveryExit_FailedPickUpAttempts()
	 * @model
	 * @generated
	 */
	EList<FailedDeliveryAttempt> getFailedPickUpAttempts();

} // ResultDeliveryExit
