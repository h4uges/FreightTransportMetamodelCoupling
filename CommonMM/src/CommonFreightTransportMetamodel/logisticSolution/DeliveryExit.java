/**
 */
package CommonFreightTransportMetamodel.logisticSolution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.DeliveryExit#getDeliveryLeg <em>Delivery Leg</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getDeliveryExit()
 * @model
 * @generated
 */
public interface DeliveryExit extends ShipmentExit {
	/**
	 * Returns the value of the '<em><b>Delivery Leg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Leg</em>' reference.
	 * @see #setDeliveryLeg(ShipmentRecordEntry)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getDeliveryExit_DeliveryLeg()
	 * @model required="true"
	 * @generated
	 */
	ShipmentRecordEntry getDeliveryLeg();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.DeliveryExit#getDeliveryLeg <em>Delivery Leg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Leg</em>' reference.
	 * @see #getDeliveryLeg()
	 * @generated
	 */
	void setDeliveryLeg(ShipmentRecordEntry value);

} // DeliveryExit
