/**
 */
package CommonFreightTransportMetamodel.logisticDemand;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Splitted Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.SplittedShipment#getOriginalId <em>Original Id</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getSplittedShipment()
 * @model
 * @generated
 */
public interface SplittedShipment extends Shipment, ToInsideStudyAreaShipmentBase, FromInsideStudyAreaShipmentBase {
	/**
	 * Returns the value of the '<em><b>Original Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Id</em>' attribute.
	 * @see #setOriginalId(String)
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getSplittedShipment_OriginalId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 * @generated
	 */
	String getOriginalId();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticDemand.SplittedShipment#getOriginalId <em>Original Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Id</em>' attribute.
	 * @see #getOriginalId()
	 * @generated
	 */
	void setOriginalId(String value);

} // SplittedShipment
