/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.logisticDemand.Shipment;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;

import CommonFreightTransportMetamodel.utils.HasId_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getShipment <em>Shipment</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getRepsonsibleCEPSP <em>Repsonsible CEPSP</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getEntry <em>Entry</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getExit <em>Exit</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecord()
 * @model
 * @generated
 */
public interface ShipmentRecord extends HasId_ {
	/**
	 * Returns the value of the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment</em>' reference.
	 * @see #setShipment(Shipment)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecord_Shipment()
	 * @model required="true"
	 * @generated
	 */
	Shipment getShipment();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getShipment <em>Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>' reference.
	 * @see #getShipment()
	 * @generated
	 */
	void setShipment(Shipment value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry}.
	 * It is bidirectional and its opposite is '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecord_Entries()
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getRecord
	 * @model opposite="record" containment="true"
	 * @generated
	 */
	EList<ShipmentRecordEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Repsonsible CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repsonsible CEPSP</em>' reference.
	 * @see #setRepsonsibleCEPSP(CEPSP)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecord_RepsonsibleCEPSP()
	 * @model required="true"
	 * @generated
	 */
	CEPSP getRepsonsibleCEPSP();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getRepsonsibleCEPSP <em>Repsonsible CEPSP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repsonsible CEPSP</em>' reference.
	 * @see #getRepsonsibleCEPSP()
	 * @generated
	 */
	void setRepsonsibleCEPSP(CEPSP value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(ShipmentEntry)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecord_Entry()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ShipmentEntry getEntry();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(ShipmentEntry value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(ShipmentExit)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecord_Exit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ShipmentExit getExit();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(ShipmentExit value);

} // ShipmentRecord
