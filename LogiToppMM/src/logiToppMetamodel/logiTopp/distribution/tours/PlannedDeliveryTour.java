/**
 */
package logiToppMetamodel.logiTopp.distribution.tours;

import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;

import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity;

import logiToppMetamodel.logiTopp.distribution.fleet.VehicleType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planned Delivery Tour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getStops <em>Stops</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getVehicleType <em>Vehicle Type</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getPlannedDuration <em>Planned Duration</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getPlannedAt <em>Planned At</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getExecutingCEPSP <em>Executing CEPSP</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.tours.ToursPackage#getPlannedDeliveryTour()
 * @model
 * @generated
 */
public interface PlannedDeliveryTour extends EObject {
	/**
	 * Returns the value of the '<em><b>Stops</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stops</em>' containment reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.tours.ToursPackage#getPlannedDeliveryTour_Stops()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParcelActivity> getStops();

	/**
	 * Returns the value of the '<em><b>Vehicle Type</b></em>' attribute.
	 * The default value is <code>"TRUCK"</code>.
	 * The literals are from the enumeration {@link logiToppMetamodel.logiTopp.distribution.fleet.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Type</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.VehicleType
	 * @see #setVehicleType(VehicleType)
	 * @see logiToppMetamodel.logiTopp.distribution.tours.ToursPackage#getPlannedDeliveryTour_VehicleType()
	 * @model default="TRUCK" required="true"
	 * @generated
	 */
	VehicleType getVehicleType();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getVehicleType <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Type</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.VehicleType
	 * @see #getVehicleType()
	 * @generated
	 */
	void setVehicleType(VehicleType value);

	/**
	 * Returns the value of the '<em><b>Planned Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Duration</em>' containment reference.
	 * @see #setPlannedDuration(RelativeTime)
	 * @see logiToppMetamodel.logiTopp.distribution.tours.ToursPackage#getPlannedDeliveryTour_PlannedDuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RelativeTime getPlannedDuration();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getPlannedDuration <em>Planned Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Duration</em>' containment reference.
	 * @see #getPlannedDuration()
	 * @generated
	 */
	void setPlannedDuration(RelativeTime value);

	/**
	 * Returns the value of the '<em><b>Planned At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned At</em>' containment reference.
	 * @see #setPlannedAt(Time)
	 * @see logiToppMetamodel.logiTopp.distribution.tours.ToursPackage#getPlannedDeliveryTour_PlannedAt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getPlannedAt();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getPlannedAt <em>Planned At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned At</em>' containment reference.
	 * @see #getPlannedAt()
	 * @generated
	 */
	void setPlannedAt(Time value);

	/**
	 * Returns the value of the '<em><b>Executing CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executing CEPSP</em>' reference.
	 * @see #setExecutingCEPSP(CEPServiceProvider)
	 * @see logiToppMetamodel.logiTopp.distribution.tours.ToursPackage#getPlannedDeliveryTour_ExecutingCEPSP()
	 * @model required="true"
	 * @generated
	 */
	CEPServiceProvider getExecutingCEPSP();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getExecutingCEPSP <em>Executing CEPSP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executing CEPSP</em>' reference.
	 * @see #getExecutingCEPSP()
	 * @generated
	 */
	void setExecutingCEPSP(CEPServiceProvider value);

} // PlannedDeliveryTour
