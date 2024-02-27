/**
 */
package CommonFreightTransportMetamodel.results;

import CommonFreightTransportMetamodel.logisticSolution.Stop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tour Stop Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.TourStopMapping#getPlannedStop <em>Planned Stop</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.results.TourStopMapping#getExecutedStop <em>Executed Stop</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getTourStopMapping()
 * @model
 * @generated
 */
public interface TourStopMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Planned Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Stop</em>' reference.
	 * @see #setPlannedStop(Stop)
	 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getTourStopMapping_PlannedStop()
	 * @model required="true"
	 * @generated
	 */
	Stop getPlannedStop();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.results.TourStopMapping#getPlannedStop <em>Planned Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Stop</em>' reference.
	 * @see #getPlannedStop()
	 * @generated
	 */
	void setPlannedStop(Stop value);

	/**
	 * Returns the value of the '<em><b>Executed Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Stop</em>' reference.
	 * @see #setExecutedStop(Stop)
	 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getTourStopMapping_ExecutedStop()
	 * @model
	 * @generated
	 */
	Stop getExecutedStop();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.results.TourStopMapping#getExecutedStop <em>Executed Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed Stop</em>' reference.
	 * @see #getExecutedStop()
	 * @generated
	 */
	void setExecutedStop(Stop value);

} // TourStopMapping
