/**
 */
package MATSimFreightMetamodel.freightContrib;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.TimeWindow#getStart <em>Start</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.TimeWindow#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getTimeWindow()
 * @model
 * @generated
 */
public interface TimeWindow extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(double)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getTimeWindow_Start()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getStart();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.TimeWindow#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(double value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(double)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getTimeWindow_End()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getEnd();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.TimeWindow#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(double value);

} // TimeWindow
