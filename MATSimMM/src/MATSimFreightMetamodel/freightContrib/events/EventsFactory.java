/**
 */
package MATSimFreightMetamodel.freightContrib.events;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage
 * @generated
 */
public interface EventsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsFactory eINSTANCE = MATSimFreightMetamodel.freightContrib.events.impl.EventsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Carrier Shipment Delivery Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Shipment Delivery Start Event</em>'.
	 * @generated
	 */
	CarrierShipmentDeliveryStartEvent createCarrierShipmentDeliveryStartEvent();

	/**
	 * Returns a new object of class '<em>Carrier Shipment Delivery End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Shipment Delivery End Event</em>'.
	 * @generated
	 */
	CarrierShipmentDeliveryEndEvent createCarrierShipmentDeliveryEndEvent();

	/**
	 * Returns a new object of class '<em>Carrier Servie Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Servie Start Event</em>'.
	 * @generated
	 */
	CarrierServieStartEvent createCarrierServieStartEvent();

	/**
	 * Returns a new object of class '<em>Carrier Service End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Service End Event</em>'.
	 * @generated
	 */
	CarrierServiceEndEvent createCarrierServiceEndEvent();

	/**
	 * Returns a new object of class '<em>Carrier Tour Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Tour Start Event</em>'.
	 * @generated
	 */
	CarrierTourStartEvent createCarrierTourStartEvent();

	/**
	 * Returns a new object of class '<em>Carrier Tour End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Tour End Event</em>'.
	 * @generated
	 */
	CarrierTourEndEvent createCarrierTourEndEvent();

	/**
	 * Returns a new object of class '<em>Carrier Shipment Pickup Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Shipment Pickup Start Event</em>'.
	 * @generated
	 */
	CarrierShipmentPickupStartEvent createCarrierShipmentPickupStartEvent();

	/**
	 * Returns a new object of class '<em>Carrier Shipment Pickup End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Shipment Pickup End Event</em>'.
	 * @generated
	 */
	CarrierShipmentPickupEndEvent createCarrierShipmentPickupEndEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EventsPackage getEventsPackage();

} //EventsFactory
