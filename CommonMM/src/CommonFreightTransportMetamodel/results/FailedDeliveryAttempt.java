/**
 */
package CommonFreightTransportMetamodel.results;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticFacility;

import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;

import CommonFreightTransportMetamodel.network.Location_;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failed Delivery Attempt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.FailedDeliveryAttempt#getFailedDeliveryLocation <em>Failed Delivery Location</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.results.FailedDeliveryAttempt#getFailedDeliveryFacility <em>Failed Delivery Facility</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getFailedDeliveryAttempt()
 * @model
 * @generated
 */
public interface FailedDeliveryAttempt extends ShipmentRecordEntry {
	/**
	 * Returns the value of the '<em><b>Failed Delivery Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Delivery Location</em>' containment reference.
	 * @see #setFailedDeliveryLocation(Location_)
	 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getFailedDeliveryAttempt_FailedDeliveryLocation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location_ getFailedDeliveryLocation();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.results.FailedDeliveryAttempt#getFailedDeliveryLocation <em>Failed Delivery Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed Delivery Location</em>' containment reference.
	 * @see #getFailedDeliveryLocation()
	 * @generated
	 */
	void setFailedDeliveryLocation(Location_ value);

	/**
	 * Returns the value of the '<em><b>Failed Delivery Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Delivery Facility</em>' reference.
	 * @see #setFailedDeliveryFacility(LogisticFacility)
	 * @see CommonFreightTransportMetamodel.results.ResultsPackage#getFailedDeliveryAttempt_FailedDeliveryFacility()
	 * @model
	 * @generated
	 */
	LogisticFacility getFailedDeliveryFacility();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.results.FailedDeliveryAttempt#getFailedDeliveryFacility <em>Failed Delivery Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed Delivery Facility</em>' reference.
	 * @see #getFailedDeliveryFacility()
	 * @generated
	 */
	void setFailedDeliveryFacility(LogisticFacility value);

} // FailedDeliveryAttempt
