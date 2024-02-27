/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.network.Location_;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Stop Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ReferenceStopLocation#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getReferenceStopLocation()
 * @model
 * @generated
 */
public interface ReferenceStopLocation extends StopLocation {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location_)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getReferenceStopLocation_Location()
	 * @model required="true"
	 * @generated
	 */
	Location_ getLocation();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ReferenceStopLocation#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location_ value);

} // ReferenceStopLocation
