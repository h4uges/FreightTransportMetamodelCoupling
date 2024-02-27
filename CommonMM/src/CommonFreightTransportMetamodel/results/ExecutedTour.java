/**
 */
package CommonFreightTransportMetamodel.results;

import CommonFreightTransportMetamodel.logisticSolution.PlannedTour;
import CommonFreightTransportMetamodel.logisticSolution.Tour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executed Tour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.ExecutedTour#getPlannedTour <em>Planned Tour</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.results.ExecutedTour#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getExecutedTour()
 * @model
 * @generated
 */
public interface ExecutedTour extends Tour {
	/**
	 * Returns the value of the '<em><b>Planned Tour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Tour</em>' reference.
	 * @see #setPlannedTour(PlannedTour)
	 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getExecutedTour_PlannedTour()
	 * @model required="true"
	 * @generated
	 */
	PlannedTour getPlannedTour();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.results.ExecutedTour#getPlannedTour <em>Planned Tour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Tour</em>' reference.
	 * @see #getPlannedTour()
	 * @generated
	 */
	void setPlannedTour(PlannedTour value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.results.TourStopMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getExecutedTour_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<TourStopMapping> getMappings();

} // ExecutedTour
