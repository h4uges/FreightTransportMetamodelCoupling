/**
 */
package CommonFreightTransportMetamodel.logisticDemand;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;

import CommonFreightTransportMetamodel.utils.Dimension;
import CommonFreightTransportMetamodel.utils.HasId_;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.Shipment#getResponsibleCEPSP <em>Responsible CEPSP</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.Shipment#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getShipment()
 * @model abstract="true"
 * @generated
 */
public interface Shipment extends HasId_ {
	/**
	 * Returns the value of the '<em><b>Responsible CEPSP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible CEPSP</em>' containment reference.
	 * @see #setResponsibleCEPSP(CEPSP)
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getShipment_ResponsibleCEPSP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CEPSP getResponsibleCEPSP();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticDemand.Shipment#getResponsibleCEPSP <em>Responsible CEPSP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible CEPSP</em>' containment reference.
	 * @see #getResponsibleCEPSP()
	 * @generated
	 */
	void setResponsibleCEPSP(CEPSP value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Dimension)
	 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage#getShipment_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dimension getSize();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticDemand.Shipment#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Dimension value);

} // Shipment
