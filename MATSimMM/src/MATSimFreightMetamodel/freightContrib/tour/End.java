/**
 */
package MATSimFreightMetamodel.freightContrib.tour;

import MATSimFreightMetamodel.freightContrib.TimeWindow;

import MATSimFreightMetamodel.matsim.core.network.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.End#getTimeWindow <em>Time Window</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.End#getExpectedArrivalTime <em>Expected Arrival Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.End#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getEnd()
 * @model
 * @generated
 */
public interface End extends TourActivity {
	/**
	 * Returns the value of the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Window</em>' containment reference.
	 * @see #setTimeWindow(TimeWindow)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getEnd_TimeWindow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeWindow getTimeWindow();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.End#getTimeWindow <em>Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Window</em>' containment reference.
	 * @see #getTimeWindow()
	 * @generated
	 */
	void setTimeWindow(TimeWindow value);

	/**
	 * Returns the value of the '<em><b>Expected Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * expected?
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Arrival Time</em>' attribute.
	 * @see #setExpectedArrivalTime(double)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getEnd_ExpectedArrivalTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getExpectedArrivalTime();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.End#getExpectedArrivalTime <em>Expected Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Arrival Time</em>' attribute.
	 * @see #getExpectedArrivalTime()
	 * @generated
	 */
	void setExpectedArrivalTime(double value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Link)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getEnd_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Link getLocation();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.End#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Link value);

} // End
