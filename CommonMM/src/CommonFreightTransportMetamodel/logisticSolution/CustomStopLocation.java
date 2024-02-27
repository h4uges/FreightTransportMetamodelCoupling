/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.network.Location_;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Stop Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.CustomStopLocation#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getCustomStopLocation()
 * @model
 * @generated
 */
public interface CustomStopLocation extends StopLocation {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location_)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getCustomStopLocation_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location_ getLocation();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.CustomStopLocation#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location_ value);

} // CustomStopLocation
