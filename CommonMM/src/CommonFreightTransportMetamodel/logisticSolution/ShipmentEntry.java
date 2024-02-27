/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.utils.Timestamp_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentEntry()
 * @model abstract="true"
 * @generated
 */
public interface ShipmentEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Timestamp_)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentEntry_Time()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Timestamp_ getTime();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Timestamp_ value);

} // ShipmentEntry
