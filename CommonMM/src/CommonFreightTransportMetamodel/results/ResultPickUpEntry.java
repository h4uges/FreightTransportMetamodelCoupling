/**
 */
package CommonFreightTransportMetamodel.results;

import CommonFreightTransportMetamodel.logisticSolution.PickUpEntry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Pick Up Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.ResultPickUpEntry#getFailedPickUpAttempts <em>Failed Pick Up Attempts</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getResultPickUpEntry()
 * @model
 * @generated
 */
public interface ResultPickUpEntry extends PickUpEntry {
	/**
	 * Returns the value of the '<em><b>Failed Pick Up Attempts</b></em>' reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.results.FailedPickupAttempt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Pick Up Attempts</em>' reference list.
	 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getResultPickUpEntry_FailedPickUpAttempts()
	 * @model
	 * @generated
	 */
	EList<FailedPickupAttempt> getFailedPickUpAttempts();

} // ResultPickUpEntry
