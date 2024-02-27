/**
 */
package CommonFreightTransportMetamodel.logisticDemand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Inside Study Area Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getToInsideStudyAreaShipment()
 * @model abstract="true"
 * @generated
 */
public interface ToInsideStudyAreaShipment extends ToInsideStudyAreaShipmentBase {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer)
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getToInsideStudyAreaShipment_Receiver()
	 * @model required="true"
	 * @generated
	 */
	CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer getReceiver();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer value);

} // ToInsideStudyAreaShipment
