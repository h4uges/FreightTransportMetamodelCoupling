/**
 */
package MATSimFreightMetamodel.freightContrib.tour;

import MATSimFreightMetamodel.freightContrib.CarrierService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.ServiceActivity#getService <em>Service</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.ServiceActivity#getArrivalTime <em>Arrival Time</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getServiceActivity()
 * @model
 * @generated
 */
public interface ServiceActivity extends TourActivity {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(CarrierService)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getServiceActivity_Service()
	 * @model required="true"
	 * @generated
	 */
	CarrierService getService();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.ServiceActivity#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(CarrierService value);

	/**
	 * Returns the value of the '<em><b>Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Time</em>' attribute.
	 * @see #setArrivalTime(double)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getServiceActivity_ArrivalTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getArrivalTime();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.ServiceActivity#getArrivalTime <em>Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Time</em>' attribute.
	 * @see #getArrivalTime()
	 * @generated
	 */
	void setArrivalTime(double value);

} // ServiceActivity
