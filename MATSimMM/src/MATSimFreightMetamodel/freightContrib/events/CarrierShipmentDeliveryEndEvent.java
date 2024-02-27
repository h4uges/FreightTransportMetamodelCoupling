/**
 */
package MATSimFreightMetamodel.freightContrib.events;

import MATSimFreightMetamodel.freightContrib.CarrierShipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Shipment Delivery End Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getCarrierShipment <em>Carrier Shipment</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getDeliveryDuration <em>Delivery Duration</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getCapacityDemand <em>Capacity Demand</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierShipmentDeliveryEndEvent()
 * @model
 * @generated
 */
public interface CarrierShipmentDeliveryEndEvent extends CarrierEvent {
	/**
	 * Returns the value of the '<em><b>Carrier Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Shipment</em>' reference.
	 * @see #setCarrierShipment(CarrierShipment)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierShipmentDeliveryEndEvent_CarrierShipment()
	 * @model required="true"
	 * @generated
	 */
	CarrierShipment getCarrierShipment();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getCarrierShipment <em>Carrier Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Shipment</em>' reference.
	 * @see #getCarrierShipment()
	 * @generated
	 */
	void setCarrierShipment(CarrierShipment value);

	/**
	 * Returns the value of the '<em><b>Delivery Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Duration</em>' attribute.
	 * @see #setDeliveryDuration(double)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierShipmentDeliveryEndEvent_DeliveryDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getDeliveryDuration();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getDeliveryDuration <em>Delivery Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Duration</em>' attribute.
	 * @see #getDeliveryDuration()
	 * @generated
	 */
	void setDeliveryDuration(double value);

	/**
	 * Returns the value of the '<em><b>Capacity Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Demand</em>' attribute.
	 * @see #setCapacityDemand(int)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierShipmentDeliveryEndEvent_CapacityDemand()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getCapacityDemand();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierShipmentDeliveryEndEvent#getCapacityDemand <em>Capacity Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Demand</em>' attribute.
	 * @see #getCapacityDemand()
	 * @generated
	 */
	void setCapacityDemand(int value);

} // CarrierShipmentDeliveryEndEvent
