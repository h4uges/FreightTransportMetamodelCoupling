/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticHub;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logistic Hub Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.LogisticHubExit#getLogisticHub <em>Logistic Hub</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getLogisticHubExit()
 * @model
 * @generated
 */
public interface LogisticHubExit extends ShipmentExit {
	/**
	 * Returns the value of the '<em><b>Logistic Hub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logistic Hub</em>' containment reference.
	 * @see #setLogisticHub(LogisticHub)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getLogisticHubExit_LogisticHub()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogisticHub getLogisticHub();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticHubExit#getLogisticHub <em>Logistic Hub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logistic Hub</em>' containment reference.
	 * @see #getLogisticHub()
	 * @generated
	 */
	void setLogisticHub(LogisticHub value);

} // LogisticHubExit
