/**
 */
package MATSimFreightMetamodel.freightContrib.tour;

import MATSimFreightMetamodel.freightContrib.TimeWindow;

import MATSimFreightMetamodel.matsim.core.network.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.Start#getTimeWindow <em>Time Window</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.Start#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends TourActivity {
	/**
	 * Returns the value of the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Window</em>' containment reference.
	 * @see #setTimeWindow(TimeWindow)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getStart_TimeWindow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeWindow getTimeWindow();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.Start#getTimeWindow <em>Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Window</em>' containment reference.
	 * @see #getTimeWindow()
	 * @generated
	 */
	void setTimeWindow(TimeWindow value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Link)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getStart_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Link getLocation();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.Start#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Link value);

} // Start
