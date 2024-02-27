/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logistic Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.LogisticSolution#getShipmentRecords <em>Shipment Records</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.LogisticSolution#getTours <em>Tours</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getLogisticSolution()
 * @model
 * @generated
 */
public interface LogisticSolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Shipment Records</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Records</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getLogisticSolution_ShipmentRecords()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShipmentRecord> getShipmentRecords();

	/**
	 * Returns the value of the '<em><b>Tours</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticSolution.PlannedTour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tours</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getLogisticSolution_Tours()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlannedTour> getTours();

} // LogisticSolution
