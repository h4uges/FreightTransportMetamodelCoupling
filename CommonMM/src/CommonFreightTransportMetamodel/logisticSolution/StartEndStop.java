/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start End Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.StartEndStop#getDepot <em>Depot</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getStartEndStop()
 * @model
 * @generated
 */
public interface StartEndStop extends Stop {
	/**
	 * Returns the value of the '<em><b>Depot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depot</em>' reference.
	 * @see #setDepot(VehicleDepot)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getStartEndStop_Depot()
	 * @model required="true"
	 * @generated
	 */
	VehicleDepot getDepot();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.StartEndStop#getDepot <em>Depot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depot</em>' reference.
	 * @see #getDepot()
	 * @generated
	 */
	void setDepot(VehicleDepot value);

} // StartEndStop
