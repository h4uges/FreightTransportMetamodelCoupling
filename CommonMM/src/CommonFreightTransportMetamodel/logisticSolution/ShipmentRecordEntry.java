/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;

import CommonFreightTransportMetamodel.network.Location_;

import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint;
import CommonFreightTransportMetamodel.utils.TimeWindow_;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Record Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getExecutingCEPSP <em>Executing CEPSP</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getNo <em>No</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getFrom <em>From</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTo <em>To</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTimeWindow <em>Time Window</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getFromSpec <em>From Spec</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getToSpec <em>To Spec</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTour <em>Tour</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecordEntry()
 * @model
 * @generated
 */
public interface ShipmentRecordEntry extends HasId_ {
	/**
	 * Returns the value of the '<em><b>Executing CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executing CEPSP</em>' reference.
	 * @see #setExecutingCEPSP(CEPSP)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecordEntry_ExecutingCEPSP()
	 * @model required="true"
	 * @generated
	 */
	CEPSP getExecutingCEPSP();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getExecutingCEPSP <em>Executing CEPSP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executing CEPSP</em>' reference.
	 * @see #getExecutingCEPSP()
	 * @generated
	 */
	void setExecutingCEPSP(CEPSP value);

	/**
	 * Returns the value of the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No</em>' attribute.
	 * @see #setNo(int)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecordEntry_No()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getNo();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getNo <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No</em>' attribute.
	 * @see #getNo()
	 * @generated
	 */
	void setNo(int value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Location_)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecordEntry_From()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location_ getFrom();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Location_ value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Location_)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecordEntry_To()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location_ getTo();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Location_ value);

	/**
	 * Returns the value of the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Window</em>' containment reference.
	 * @see #setTimeWindow(TimeWindow_)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecordEntry_TimeWindow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeWindow_ getTimeWindow();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTimeWindow <em>Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Window</em>' containment reference.
	 * @see #getTimeWindow()
	 * @generated
	 */
	void setTimeWindow(TimeWindow_ value);

	/**
	 * Returns the value of the '<em><b>From Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Spec</em>' reference.
	 * @see #setFromSpec(ShipmentlLegStartEndPoint)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecordEntry_FromSpec()
	 * @model required="true"
	 * @generated
	 */
	ShipmentlLegStartEndPoint getFromSpec();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getFromSpec <em>From Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Spec</em>' reference.
	 * @see #getFromSpec()
	 * @generated
	 */
	void setFromSpec(ShipmentlLegStartEndPoint value);

	/**
	 * Returns the value of the '<em><b>To Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Spec</em>' reference.
	 * @see #setToSpec(ShipmentlLegStartEndPoint)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecordEntry_ToSpec()
	 * @model required="true"
	 * @generated
	 */
	ShipmentlLegStartEndPoint getToSpec();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getToSpec <em>To Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Spec</em>' reference.
	 * @see #getToSpec()
	 * @generated
	 */
	void setToSpec(ShipmentlLegStartEndPoint value);

	/**
	 * Returns the value of the '<em><b>Tour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tour</em>' reference.
	 * @see #setTour(Tour)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecordEntry_Tour()
	 * @model required="true"
	 * @generated
	 */
	Tour getTour();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getTour <em>Tour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tour</em>' reference.
	 * @see #getTour()
	 * @generated
	 */
	void setTour(Tour value);

	/**
	 * Returns the value of the '<em><b>Record</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' container reference.
	 * @see #setRecord(ShipmentRecord)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getShipmentRecordEntry_Record()
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord#getEntries
	 * @model opposite="entries" required="true" transient="false"
	 * @generated
	 */
	ShipmentRecord getRecord();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry#getRecord <em>Record</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record</em>' container reference.
	 * @see #getRecord()
	 * @generated
	 */
	void setRecord(ShipmentRecord value);

} // ShipmentRecordEntry
