/**
 */
package MATSimFreightMetamodel.freightContrib.tour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.Leg#getExpectedTransportTime <em>Expected Transport Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.Leg#getExpectedDepartureTime <em>Expected Departure Time</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getLeg()
 * @model
 * @generated
 */
public interface Leg extends TourElement {
	/**
	 * Returns the value of the '<em><b>Expected Transport Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Transport Time</em>' attribute.
	 * @see #setExpectedTransportTime(double)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getLeg_ExpectedTransportTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getExpectedTransportTime();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.Leg#getExpectedTransportTime <em>Expected Transport Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Transport Time</em>' attribute.
	 * @see #getExpectedTransportTime()
	 * @generated
	 */
	void setExpectedTransportTime(double value);

	/**
	 * Returns the value of the '<em><b>Expected Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * expected?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Departure Time</em>' attribute.
	 * @see #setExpectedDepartureTime(double)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getLeg_ExpectedDepartureTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getExpectedDepartureTime();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.Leg#getExpectedDepartureTime <em>Expected Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Departure Time</em>' attribute.
	 * @see #getExpectedDepartureTime()
	 * @generated
	 */
	void setExpectedDepartureTime(double value);

} // Leg
