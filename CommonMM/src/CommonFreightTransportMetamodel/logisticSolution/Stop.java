/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.TimeWindow_;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.Stop#getStopTimeWindow <em>Stop Time Window</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.Stop#getNo <em>No</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.Stop#getStopLocation <em>Stop Location</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getStop()
 * @model abstract="true"
 * @generated
 */
public interface Stop extends HasId_ {
	/**
	 * Returns the value of the '<em><b>Stop Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Time Window</em>' containment reference.
	 * @see #setStopTimeWindow(TimeWindow_)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getStop_StopTimeWindow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeWindow_ getStopTimeWindow();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.Stop#getStopTimeWindow <em>Stop Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Time Window</em>' containment reference.
	 * @see #getStopTimeWindow()
	 * @generated
	 */
	void setStopTimeWindow(TimeWindow_ value);

	/**
	 * Returns the value of the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No</em>' attribute.
	 * @see #setNo(int)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getStop_No()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getNo();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.Stop#getNo <em>No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No</em>' attribute.
	 * @see #getNo()
	 * @generated
	 */
	void setNo(int value);

	/**
	 * Returns the value of the '<em><b>Stop Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Location</em>' containment reference.
	 * @see #setStopLocation(StopLocation)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getStop_StopLocation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StopLocation getStopLocation();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.Stop#getStopLocation <em>Stop Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Location</em>' containment reference.
	 * @see #getStopLocation()
	 * @generated
	 */
	void setStopLocation(StopLocation value);

} // Stop
