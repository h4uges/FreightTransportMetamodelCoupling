/**
 */
package CommonFreightTransportMetamodel.logisticDemand;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.Demand#getShipments <em>Shipments</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getDemand()
 * @model
 * @generated
 */
public interface Demand extends EObject {
	/**
	 * Returns the value of the '<em><b>Shipments</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticDemand.Shipment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipments</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getDemand_Shipments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Shipment> getShipments();

} // Demand
