/**
 */
package CommonFreightTransportMetamodel.logisticDemand;

import CommonFreightTransportMetamodel.localEntities.ShipmentConsumerProducer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Inside Study Area Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipment#getProducer <em>Producer</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getFromInsideStudyAreaShipment()
 * @model abstract="true"
 * @generated
 */
public interface FromInsideStudyAreaShipment extends FromInsideStudyAreaShipmentBase {
	/**
	 * Returns the value of the '<em><b>Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producer</em>' reference.
	 * @see #setProducer(ShipmentConsumerProducer)
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getFromInsideStudyAreaShipment_Producer()
	 * @model required="true"
	 * @generated
	 */
	ShipmentConsumerProducer getProducer();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipment#getProducer <em>Producer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producer</em>' reference.
	 * @see #getProducer()
	 * @generated
	 */
	void setProducer(ShipmentConsumerProducer value);

} // FromInsideStudyAreaShipment
