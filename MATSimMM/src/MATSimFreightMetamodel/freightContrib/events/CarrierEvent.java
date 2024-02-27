/**
 */
package MATSimFreightMetamodel.freightContrib.events;

import MATSimFreightMetamodel.freightContrib.Carrier;
import MATSimFreightMetamodel.freightContrib.CarrierVehicle;

import MATSimFreightMetamodel.matsim.core.Event;

import MATSimFreightMetamodel.matsim.core.network.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getCarrier <em>Carrier</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getLink <em>Link</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getCarriervehicle <em>Carriervehicle</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierEvent()
 * @model abstract="true"
 * @generated
 */
public interface CarrierEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier</em>' reference.
	 * @see #setCarrier(Carrier)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierEvent_Carrier()
	 * @model required="true"
	 * @generated
	 */
	Carrier getCarrier();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getCarrier <em>Carrier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier</em>' reference.
	 * @see #getCarrier()
	 * @generated
	 */
	void setCarrier(Carrier value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierEvent_Link()
	 * @model required="true"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

	/**
	 * Returns the value of the '<em><b>Carriervehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carriervehicle</em>' reference.
	 * @see #setCarriervehicle(CarrierVehicle)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierEvent_Carriervehicle()
	 * @model required="true"
	 * @generated
	 */
	CarrierVehicle getCarriervehicle();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierEvent#getCarriervehicle <em>Carriervehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carriervehicle</em>' reference.
	 * @see #getCarriervehicle()
	 * @generated
	 */
	void setCarriervehicle(CarrierVehicle value);

} // CarrierEvent
