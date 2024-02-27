/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticHub;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logistic Hub Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry#getLogisticHub <em>Logistic Hub</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getLogisticHubEntry()
 * @model
 * @generated
 */
public interface LogisticHubEntry extends ShipmentEntry {
	/**
	 * Returns the value of the '<em><b>Logistic Hub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logistic Hub</em>' containment reference.
	 * @see #setLogisticHub(LogisticHub)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getLogisticHubEntry_LogisticHub()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogisticHub getLogisticHub();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry#getLogisticHub <em>Logistic Hub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logistic Hub</em>' containment reference.
	 * @see #getLogisticHub()
	 * @generated
	 */
	void setLogisticHub(LogisticHub value);

} // LogisticHubEntry
