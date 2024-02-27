/**
 */
package CommonFreightTransportMetamodel.logisticDemand;

import CommonFreightTransportMetamodel.utils.Timestamp_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Outside Study Area Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.FromOutsideStudyAreaShipment#getArrivalAtOriginDepot <em>Arrival At Origin Depot</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getFromOutsideStudyAreaShipment()
 * @model abstract="true"
 * @generated
 */
public interface FromOutsideStudyAreaShipment extends EObject {
	/**
	 * Returns the value of the '<em><b>Arrival At Origin Depot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival At Origin Depot</em>' containment reference.
	 * @see #setArrivalAtOriginDepot(Timestamp_)
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getFromOutsideStudyAreaShipment_ArrivalAtOriginDepot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Timestamp_ getArrivalAtOriginDepot();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticDemand.FromOutsideStudyAreaShipment#getArrivalAtOriginDepot <em>Arrival At Origin Depot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival At Origin Depot</em>' containment reference.
	 * @see #getArrivalAtOriginDepot()
	 * @generated
	 */
	void setArrivalAtOriginDepot(Timestamp_ value);

} // FromOutsideStudyAreaShipment
