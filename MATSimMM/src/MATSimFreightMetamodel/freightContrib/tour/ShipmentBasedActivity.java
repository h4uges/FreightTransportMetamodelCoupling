/**
 */
package MATSimFreightMetamodel.freightContrib.tour;

import MATSimFreightMetamodel.freightContrib.CarrierShipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Based Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity#getShipment <em>Shipment</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity#getExpectedArrivalTime <em>Expected Arrival Time</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getShipmentBasedActivity()
 * @model abstract="true"
 * @generated
 */
public interface ShipmentBasedActivity extends TourActivity {
	/**
	 * Returns the value of the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment</em>' reference.
	 * @see #setShipment(CarrierShipment)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getShipmentBasedActivity_Shipment()
	 * @model required="true"
	 * @generated
	 */
	CarrierShipment getShipment();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity#getShipment <em>Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>' reference.
	 * @see #getShipment()
	 * @generated
	 */
	void setShipment(CarrierShipment value);

	/**
	 * Returns the value of the '<em><b>Expected Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Arrival Time</em>' attribute.
	 * @see #setExpectedArrivalTime(double)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getShipmentBasedActivity_ExpectedArrivalTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getExpectedArrivalTime();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity#getExpectedArrivalTime <em>Expected Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Arrival Time</em>' attribute.
	 * @see #getExpectedArrivalTime()
	 * @generated
	 */
	void setExpectedArrivalTime(double value);

} // ShipmentBasedActivity
