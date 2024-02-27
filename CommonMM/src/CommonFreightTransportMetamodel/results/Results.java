/**
 */
package CommonFreightTransportMetamodel.results;

import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.Results#getShipmentRecords <em>Shipment Records</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.results.Results#getExecutedTours <em>Executed Tours</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getResults()
 * @model
 * @generated
 */
public interface Results extends EObject {
	/**
	 * Returns the value of the '<em><b>Shipment Records</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Records</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getResults_ShipmentRecords()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShipmentRecord> getShipmentRecords();

	/**
	 * Returns the value of the '<em><b>Executed Tours</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.results.ExecutedTour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Tours</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getResults_ExecutedTours()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutedTour> getExecutedTours();

} // Results
