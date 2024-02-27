/**
 */
package MATSimFreightMetamodel.freightContrib.events;

import MATSimFreightMetamodel.freightContrib.CarrierService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Service End Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getCarrierService <em>Carrier Service</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getCapacityDemand <em>Capacity Demand</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getServiceDuration <em>Service Duration</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierServiceEndEvent()
 * @model
 * @generated
 */
public interface CarrierServiceEndEvent extends CarrierEvent {
	/**
	 * Returns the value of the '<em><b>Carrier Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Service</em>' reference.
	 * @see #setCarrierService(CarrierService)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierServiceEndEvent_CarrierService()
	 * @model required="true"
	 * @generated
	 */
	CarrierService getCarrierService();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getCarrierService <em>Carrier Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Service</em>' reference.
	 * @see #getCarrierService()
	 * @generated
	 */
	void setCarrierService(CarrierService value);

	/**
	 * Returns the value of the '<em><b>Capacity Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Demand</em>' attribute.
	 * @see #setCapacityDemand(int)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierServiceEndEvent_CapacityDemand()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getCapacityDemand();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getCapacityDemand <em>Capacity Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Demand</em>' attribute.
	 * @see #getCapacityDemand()
	 * @generated
	 */
	void setCapacityDemand(int value);

	/**
	 * Returns the value of the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Duration</em>' attribute.
	 * @see #setServiceDuration(double)
	 * @see MATSimFreightMetamodel.freightContrib.events.EventsPackage#getCarrierServiceEndEvent_ServiceDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getServiceDuration();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.events.CarrierServiceEndEvent#getServiceDuration <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Duration</em>' attribute.
	 * @see #getServiceDuration()
	 * @generated
	 */
	void setServiceDuration(double value);

} // CarrierServiceEndEvent
