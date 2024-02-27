/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticFacility;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logistic Facility Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.LogisticFacilityStop#getLogisticFacility <em>Logistic Facility</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getLogisticFacilityStop()
 * @model
 * @generated
 */
public interface LogisticFacilityStop extends PickUpDeliveryStop {
	/**
	 * Returns the value of the '<em><b>Logistic Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logistic Facility</em>' reference.
	 * @see #setLogisticFacility(LogisticFacility)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getLogisticFacilityStop_LogisticFacility()
	 * @model required="true"
	 * @generated
	 */
	LogisticFacility getLogisticFacility();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticFacilityStop#getLogisticFacility <em>Logistic Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logistic Facility</em>' reference.
	 * @see #getLogisticFacility()
	 * @generated
	 */
	void setLogisticFacility(LogisticFacility value);

} // LogisticFacilityStop
