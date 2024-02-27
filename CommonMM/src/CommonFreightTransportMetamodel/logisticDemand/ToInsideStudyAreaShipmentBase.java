/**
 */
package CommonFreightTransportMetamodel.logisticDemand;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.TimeWindow_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Inside Study Area Shipment Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase#getArrivalAtDestinationTimeWindow <em>Arrival At Destination Time Window</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getToInsideStudyAreaShipmentBase()
 * @model abstract="true"
 * @generated
 */
public interface ToInsideStudyAreaShipmentBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Arrival At Destination Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival At Destination Time Window</em>' containment reference.
	 * @see #setArrivalAtDestinationTimeWindow(TimeWindow_)
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getToInsideStudyAreaShipmentBase_ArrivalAtDestinationTimeWindow()
	 * @model containment="true"
	 * @generated
	 */
	TimeWindow_ getArrivalAtDestinationTimeWindow();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase#getArrivalAtDestinationTimeWindow <em>Arrival At Destination Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival At Destination Time Window</em>' containment reference.
	 * @see #getArrivalAtDestinationTimeWindow()
	 * @generated
	 */
	void setArrivalAtDestinationTimeWindow(TimeWindow_ value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Location_)
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getToInsideStudyAreaShipmentBase_Destination()
	 * @model required="true"
	 * @generated
	 */
	Location_ getDestination();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Location_ value);

} // ToInsideStudyAreaShipmentBase
