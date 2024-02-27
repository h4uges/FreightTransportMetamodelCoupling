/**
 */
package MATSimFreightMetamodel.freightContrib;

import MATSimFreightMetamodel.freightContrib.tour.Tour;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Tour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.ScheduledTour#getDepartureTime <em>Departure Time</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.ScheduledTour#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.ScheduledTour#getTour <em>Tour</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getScheduledTour()
 * @model
 * @generated
 */
public interface ScheduledTour extends EObject {
	/**
	 * Returns the value of the '<em><b>Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Time</em>' attribute.
	 * @see #setDepartureTime(double)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getScheduledTour_DepartureTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getDepartureTime();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.ScheduledTour#getDepartureTime <em>Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Time</em>' attribute.
	 * @see #getDepartureTime()
	 * @generated
	 */
	void setDepartureTime(double value);

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(CarrierVehicle)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getScheduledTour_Vehicle()
	 * @model required="true"
	 * @generated
	 */
	CarrierVehicle getVehicle();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.ScheduledTour#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(CarrierVehicle value);

	/**
	 * Returns the value of the '<em><b>Tour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tour</em>' containment reference.
	 * @see #setTour(Tour)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getScheduledTour_Tour()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tour getTour();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.ScheduledTour#getTour <em>Tour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tour</em>' containment reference.
	 * @see #getTour()
	 * @generated
	 */
	void setTour(Tour value);

} // ScheduledTour
