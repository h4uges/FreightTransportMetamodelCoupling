/**
 */
package MATSimFreightMetamodel.freightContrib.events;

import MATSimFreightMetamodel.freightContrib.CarrierShipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Shipment Pickup Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getPickupDuration <em>Pickup Duration</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getCapacityDemand <em>Capacity Demand</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getCarrierShipment <em>Carrier Shipment</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierShipmentPickupStartEvent()
 * @model
 * @generated
 */
public interface CarrierShipmentPickupStartEvent extends CarrierEvent {
	/**
	 * Returns the value of the '<em><b>Pickup Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pickup Duration</em>' attribute.
	 * @see #setPickupDuration(double)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierShipmentPickupStartEvent_PickupDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getPickupDuration();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getPickupDuration <em>Pickup Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pickup Duration</em>' attribute.
	 * @see #getPickupDuration()
	 * @generated
	 */
	void setPickupDuration(double value);

	/**
	 * Returns the value of the '<em><b>Capacity Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Demand</em>' attribute.
	 * @see #setCapacityDemand(int)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierShipmentPickupStartEvent_CapacityDemand()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getCapacityDemand();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getCapacityDemand <em>Capacity Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Demand</em>' attribute.
	 * @see #getCapacityDemand()
	 * @generated
	 */
	void setCapacityDemand(int value);

	/**
	 * Returns the value of the '<em><b>Carrier Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Shipment</em>' reference.
	 * @see #setCarrierShipment(CarrierShipment)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierShipmentPickupStartEvent_CarrierShipment()
	 * @model required="true"
	 * @generated
	 */
	CarrierShipment getCarrierShipment();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentPickupStartEvent#getCarrierShipment <em>Carrier Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Shipment</em>' reference.
	 * @see #getCarrierShipment()
	 * @generated
	 */
	void setCarrierShipment(CarrierShipment value);

} // CarrierShipmentPickupStartEvent
