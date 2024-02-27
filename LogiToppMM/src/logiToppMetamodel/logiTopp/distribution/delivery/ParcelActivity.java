/**
 */
package logiToppMetamodel.logiTopp.distribution.delivery;

import logiToppMetamodel.base.Time;

import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;

import logiToppMetamodel.logiTopp.parcels.Parcel;

import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parcel Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getNo <em>No</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getParcels <em>Parcels</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getPickUps <em>Pick Ups</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getStopLocation <em>Stop Location</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getPlannedTime <em>Planned Time</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getDistance <em>Distance</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getTripDuration <em>Trip Duration</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getDeliveryDuration <em>Delivery Duration</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage#getParcelActivity()
 * @model
 * @generated
 */
public interface ParcelActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No</em>' attribute.
	 * @see #setNo(int)
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage#getParcelActivity_No()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getNo();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getNo <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No</em>' attribute.
	 * @see #getNo()
	 * @generated
	 */
	void setNo(int value);

	/**
	 * Returns the value of the '<em><b>Parcels</b></em>' reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.parcels.Parcel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parcels</em>' reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage#getParcelActivity_Parcels()
	 * @model
	 * @generated
	 */
	EList<Parcel> getParcels();

	/**
	 * Returns the value of the '<em><b>Pick Ups</b></em>' reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.parcels.Parcel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick Ups</em>' reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage#getParcelActivity_PickUps()
	 * @model
	 * @generated
	 */
	EList<Parcel> getPickUps();

	/**
	 * Returns the value of the '<em><b>Stop Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Location</em>' containment reference.
	 * @see #setStopLocation(ZoneAndLocation)
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage#getParcelActivity_StopLocation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ZoneAndLocation getStopLocation();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getStopLocation <em>Stop Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Location</em>' containment reference.
	 * @see #getStopLocation()
	 * @generated
	 */
	void setStopLocation(ZoneAndLocation value);

	/**
	 * Returns the value of the '<em><b>Planned Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Time</em>' reference.
	 * @see #setPlannedTime(Time)
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage#getParcelActivity_PlannedTime()
	 * @model required="true"
	 * @generated
	 */
	Time getPlannedTime();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getPlannedTime <em>Planned Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Time</em>' reference.
	 * @see #getPlannedTime()
	 * @generated
	 */
	void setPlannedTime(Time value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage#getParcelActivity_Distance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Trip Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip Duration</em>' attribute.
	 * @see #setTripDuration(int)
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage#getParcelActivity_TripDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getTripDuration();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getTripDuration <em>Trip Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip Duration</em>' attribute.
	 * @see #getTripDuration()
	 * @generated
	 */
	void setTripDuration(int value);

	/**
	 * Returns the value of the '<em><b>Delivery Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Duration</em>' attribute.
	 * @see #setDeliveryDuration(int)
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage#getParcelActivity_DeliveryDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getDeliveryDuration();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getDeliveryDuration <em>Delivery Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Duration</em>' attribute.
	 * @see #getDeliveryDuration()
	 * @generated
	 */
	void setDeliveryDuration(int value);

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(DeliveryVehicle)
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage#getParcelActivity_Vehicle()
	 * @model required="true"
	 * @generated
	 */
	DeliveryVehicle getVehicle();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(DeliveryVehicle value);

} // ParcelActivity
