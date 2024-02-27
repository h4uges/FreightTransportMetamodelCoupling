/**
 */
package CommonFreightTransportMetamodel.logisticSolution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pick Up Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.PickUpEntry#getPickUpLeg <em>Pick Up Leg</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getPickUpEntry()
 * @model
 * @generated
 */
public interface PickUpEntry extends ShipmentEntry {
	/**
	 * Returns the value of the '<em><b>Pick Up Leg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick Up Leg</em>' reference.
	 * @see #setPickUpLeg(ShipmentRecordEntry)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getPickUpEntry_PickUpLeg()
	 * @model required="true"
	 * @generated
	 */
	ShipmentRecordEntry getPickUpLeg();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.PickUpEntry#getPickUpLeg <em>Pick Up Leg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick Up Leg</em>' reference.
	 * @see #getPickUpLeg()
	 * @generated
	 */
	void setPickUpLeg(ShipmentRecordEntry value);

} // PickUpEntry
