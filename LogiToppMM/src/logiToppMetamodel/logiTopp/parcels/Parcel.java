/**
 */
package logiToppMetamodel.logiTopp.parcels;

import logiToppMetamodel.base.Entity;
import logiToppMetamodel.base.Time;

import logiToppMetamodel.logiTopp.ParcelConsumer;
import logiToppMetamodel.logiTopp.ParcelProducer;

import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;

import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parcel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.Parcel#getPlannedArrivalDate <em>Planned Arrival Date</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.Parcel#getProducer <em>Producer</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.Parcel#getZoneAndLocation <em>Zone And Location</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.Parcel#getShipmentSize <em>Shipment Size</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.Parcel#isIsPickup <em>Is Pickup</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.Parcel#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.Parcel#getResponsibleCEPSP <em>Responsible CEPSP</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#getParcel()
 * @model abstract="true"
 * @generated
 */
public interface Parcel extends Entity {
	/**
	 * Returns the value of the '<em><b>Planned Arrival Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Arrival Date</em>' reference.
	 * @see #setPlannedArrivalDate(Time)
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#getParcel_PlannedArrivalDate()
	 * @model
	 * @generated
	 */
	Time getPlannedArrivalDate();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getPlannedArrivalDate <em>Planned Arrival Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Arrival Date</em>' reference.
	 * @see #getPlannedArrivalDate()
	 * @generated
	 */
	void setPlannedArrivalDate(Time value);

	/**
	 * Returns the value of the '<em><b>Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producer</em>' reference.
	 * @see #setProducer(ParcelProducer)
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#getParcel_Producer()
	 * @model required="true"
	 * @generated
	 */
	ParcelProducer getProducer();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getProducer <em>Producer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producer</em>' reference.
	 * @see #getProducer()
	 * @generated
	 */
	void setProducer(ParcelProducer value);

	/**
	 * Returns the value of the '<em><b>Zone And Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone And Location</em>' containment reference.
	 * @see #setZoneAndLocation(ZoneAndLocation)
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#getParcel_ZoneAndLocation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ZoneAndLocation getZoneAndLocation();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getZoneAndLocation <em>Zone And Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone And Location</em>' containment reference.
	 * @see #getZoneAndLocation()
	 * @generated
	 */
	void setZoneAndLocation(ZoneAndLocation value);

	/**
	 * Returns the value of the '<em><b>Shipment Size</b></em>' attribute.
	 * The default value is <code>"SMALL"</code>.
	 * The literals are from the enumeration {@link logiToppMetamodel.logiTopp.parcels.ShipmentSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Size</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.parcels.ShipmentSize
	 * @see #setShipmentSize(ShipmentSize)
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#getParcel_ShipmentSize()
	 * @model default="SMALL" required="true"
	 * @generated
	 */
	ShipmentSize getShipmentSize();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getShipmentSize <em>Shipment Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Size</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.parcels.ShipmentSize
	 * @see #getShipmentSize()
	 * @generated
	 */
	void setShipmentSize(ShipmentSize value);

	/**
	 * Returns the value of the '<em><b>Is Pickup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pickup</em>' attribute.
	 * @see #setIsPickup(boolean)
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#getParcel_IsPickup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isIsPickup();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.parcels.Parcel#isIsPickup <em>Is Pickup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pickup</em>' attribute.
	 * @see #isIsPickup()
	 * @generated
	 */
	void setIsPickup(boolean value);

	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer</em>' reference.
	 * @see #setConsumer(ParcelConsumer)
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#getParcel_Consumer()
	 * @model required="true"
	 * @generated
	 */
	ParcelConsumer getConsumer();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getConsumer <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer</em>' reference.
	 * @see #getConsumer()
	 * @generated
	 */
	void setConsumer(ParcelConsumer value);

	/**
	 * Returns the value of the '<em><b>Responsible CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible CEPSP</em>' reference.
	 * @see #setResponsibleCEPSP(CEPServiceProvider)
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#getParcel_ResponsibleCEPSP()
	 * @model required="true"
	 * @generated
	 */
	CEPServiceProvider getResponsibleCEPSP();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getResponsibleCEPSP <em>Responsible CEPSP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible CEPSP</em>' reference.
	 * @see #getResponsibleCEPSP()
	 * @generated
	 */
	void setResponsibleCEPSP(CEPServiceProvider value);

} // Parcel
