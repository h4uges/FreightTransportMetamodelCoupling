/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planned Tour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.PlannedTour#getExecutingCEPSP <em>Executing CEPSP</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getPlannedTour()
 * @model
 * @generated
 */
public interface PlannedTour extends Tour {
	/**
	 * Returns the value of the '<em><b>Executing CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executing CEPSP</em>' reference.
	 * @see #setExecutingCEPSP(CEPSP)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getPlannedTour_ExecutingCEPSP()
	 * @model required="true"
	 * @generated
	 */
	CEPSP getExecutingCEPSP();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.PlannedTour#getExecutingCEPSP <em>Executing CEPSP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executing CEPSP</em>' reference.
	 * @see #getExecutingCEPSP()
	 * @generated
	 */
	void setExecutingCEPSP(CEPSP value);

} // PlannedTour
