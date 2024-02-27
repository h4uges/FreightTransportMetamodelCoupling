/**
 */
package MATSimFreightMetamodel.freightContrib;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.matsim.core.network.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getSize <em>Size</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getPickupTimeWindow <em>Pickup Time Window</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getDeliveryTimeWindow <em>Delivery Time Window</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getPickupServiceTime <em>Pickup Service Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getDeliveryServiceTime <em>Delivery Service Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getFrom <em>From</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierShipment()
 * @model
 * @generated
 */
public interface CarrierShipment extends Entity {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierShipment_Size()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Pickup Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pickup Time Window</em>' containment reference.
	 * @see #setPickupTimeWindow(TimeWindow)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierShipment_PickupTimeWindow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeWindow getPickupTimeWindow();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getPickupTimeWindow <em>Pickup Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pickup Time Window</em>' containment reference.
	 * @see #getPickupTimeWindow()
	 * @generated
	 */
	void setPickupTimeWindow(TimeWindow value);

	/**
	 * Returns the value of the '<em><b>Delivery Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Time Window</em>' containment reference.
	 * @see #setDeliveryTimeWindow(TimeWindow)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierShipment_DeliveryTimeWindow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeWindow getDeliveryTimeWindow();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getDeliveryTimeWindow <em>Delivery Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Time Window</em>' containment reference.
	 * @see #getDeliveryTimeWindow()
	 * @generated
	 */
	void setDeliveryTimeWindow(TimeWindow value);

	/**
	 * Returns the value of the '<em><b>Pickup Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pickup Service Time</em>' attribute.
	 * @see #setPickupServiceTime(double)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierShipment_PickupServiceTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getPickupServiceTime();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getPickupServiceTime <em>Pickup Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pickup Service Time</em>' attribute.
	 * @see #getPickupServiceTime()
	 * @generated
	 */
	void setPickupServiceTime(double value);

	/**
	 * Returns the value of the '<em><b>Delivery Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Service Time</em>' attribute.
	 * @see #setDeliveryServiceTime(double)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierShipment_DeliveryServiceTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getDeliveryServiceTime();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getDeliveryServiceTime <em>Delivery Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Service Time</em>' attribute.
	 * @see #getDeliveryServiceTime()
	 * @generated
	 */
	void setDeliveryServiceTime(double value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Link)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierShipment_From()
	 * @model required="true"
	 * @generated
	 */
	Link getFrom();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Link value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Link)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierShipment_To()
	 * @model required="true"
	 * @generated
	 */
	Link getTo();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Link value);

} // CarrierShipment
