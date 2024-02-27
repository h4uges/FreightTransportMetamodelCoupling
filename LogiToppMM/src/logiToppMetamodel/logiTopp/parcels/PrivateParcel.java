/**
 */
package logiToppMetamodel.logiTopp.parcels;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Parcel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.PrivateParcel#getDestinationType <em>Destination Type</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#getPrivateParcel()
 * @model
 * @generated
 */
public interface PrivateParcel extends Parcel {
	/**
	 * Returns the value of the '<em><b>Destination Type</b></em>' attribute.
	 * The default value is <code>"HOME"</code>.
	 * The literals are from the enumeration {@link logiToppMetamodel.logiTopp.parcels.ParcelDestinationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Type</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelDestinationType
	 * @see #setDestinationType(ParcelDestinationType)
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#getPrivateParcel_DestinationType()
	 * @model default="HOME" required="true"
	 * @generated
	 */
	ParcelDestinationType getDestinationType();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.parcels.PrivateParcel#getDestinationType <em>Destination Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Type</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelDestinationType
	 * @see #getDestinationType()
	 * @generated
	 */
	void setDestinationType(ParcelDestinationType value);

} // PrivateParcel
