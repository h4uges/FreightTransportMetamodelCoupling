/**
 */
package CommonFreightTransportMetamodel.logisticDemand;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.Timestamp_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Inside Study Area Shipment Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase#getOrigin <em>Origin</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase#getArrivalAtOrigin <em>Arrival At Origin</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getFromInsideStudyAreaShipmentBase()
 * @model abstract="true"
 * @generated
 */
public interface FromInsideStudyAreaShipmentBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Location_)
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getFromInsideStudyAreaShipmentBase_Origin()
	 * @model required="true"
	 * @generated
	 */
	Location_ getOrigin();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Location_ value);

	/**
	 * Returns the value of the '<em><b>Arrival At Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival At Origin</em>' containment reference.
	 * @see #setArrivalAtOrigin(Timestamp_)
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getFromInsideStudyAreaShipmentBase_ArrivalAtOrigin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Timestamp_ getArrivalAtOrigin();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase#getArrivalAtOrigin <em>Arrival At Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival At Origin</em>' containment reference.
	 * @see #getArrivalAtOrigin()
	 * @generated
	 */
	void setArrivalAtOrigin(Timestamp_ value);

} // FromInsideStudyAreaShipmentBase
