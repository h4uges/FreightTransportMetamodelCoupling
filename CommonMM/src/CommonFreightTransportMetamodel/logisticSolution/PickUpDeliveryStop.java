/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.logisticDemand.Shipment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pick Up Delivery Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop#getUnloadedShipments <em>Unloaded Shipments</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop#getLoadedShipments <em>Loaded Shipments</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getPickUpDeliveryStop()
 * @model abstract="true"
 * @generated
 */
public interface PickUpDeliveryStop extends Stop {
	/**
	 * Returns the value of the '<em><b>Unloaded Shipments</b></em>' reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticDemand.Shipment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unloaded Shipments</em>' reference list.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getPickUpDeliveryStop_UnloadedShipments()
	 * @model
	 * @generated
	 */
	EList<Shipment> getUnloadedShipments();

	/**
	 * Returns the value of the '<em><b>Loaded Shipments</b></em>' reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticDemand.Shipment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loaded Shipments</em>' reference list.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getPickUpDeliveryStop_LoadedShipments()
	 * @model
	 * @generated
	 */
	EList<Shipment> getLoadedShipments();

} // PickUpDeliveryStop
