/**
 */
package CommonFreightTransportMetamodel.logisticDemand;

import CommonFreightTransportMetamodel.utils.TimeWindow_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Outside Study Area Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment#getArrivalAtDepotTimeWindow <em>Arrival At Depot Time Window</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getToOutsideStudyAreaShipment()
 * @model abstract="true"
 * @generated
 */
public interface ToOutsideStudyAreaShipment extends EObject {
	/**
	 * Returns the value of the '<em><b>Arrival At Depot Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival At Depot Time Window</em>' containment reference.
	 * @see #setArrivalAtDepotTimeWindow(TimeWindow_)
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getToOutsideStudyAreaShipment_ArrivalAtDepotTimeWindow()
	 * @model containment="true"
	 * @generated
	 */
	TimeWindow_ getArrivalAtDepotTimeWindow();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment#getArrivalAtDepotTimeWindow <em>Arrival At Depot Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival At Depot Time Window</em>' containment reference.
	 * @see #getArrivalAtDepotTimeWindow()
	 * @generated
	 */
	void setArrivalAtDepotTimeWindow(TimeWindow_ value);

} // ToOutsideStudyAreaShipment
