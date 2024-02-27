/**
 */
package MATSimFreightMetamodel.freightContrib.events;

import MATSimFreightMetamodel.freightContrib.tour.Tour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Tour Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierTourStartEvent#getTour <em>Tour</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierTourStartEvent()
 * @model
 * @generated
 */
public interface CarrierTourStartEvent extends CarrierEvent {
	/**
	 * Returns the value of the '<em><b>Tour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tour</em>' reference.
	 * @see #setTour(Tour)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierTourStartEvent_Tour()
	 * @model required="true"
	 * @generated
	 */
	Tour getTour();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierTourStartEvent#getTour <em>Tour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tour</em>' reference.
	 * @see #getTour()
	 * @generated
	 */
	void setTour(Tour value);

} // CarrierTourStartEvent
