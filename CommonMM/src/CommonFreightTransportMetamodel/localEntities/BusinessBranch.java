/**
 */
package CommonFreightTransportMetamodel.localEntities;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint;
import CommonFreightTransportMetamodel.utils.TimeWindow_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.localEntities.BusinessBranch#getLocation <em>Location</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.localEntities.BusinessBranch#getOpeningHours <em>Opening Hours</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#getBusinessBranch()
 * @model
 * @generated
 */
public interface BusinessBranch extends ShipmentConsumerProducer, HasId_, ShipmentlLegStartEndPoint {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location_)
	 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#getBusinessBranch_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location_ getLocation();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.localEntities.BusinessBranch#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location_ value);

	/**
	 * Returns the value of the '<em><b>Opening Hours</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.utils.TimeWindow_}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Hours</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#getBusinessBranch_OpeningHours()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeWindow_> getOpeningHours();

} // BusinessBranch
