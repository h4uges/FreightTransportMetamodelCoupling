/**
 */
package MATSimFreightMetamodel.freightReceiver;

import MATSimFreightMetamodel.freightContrib.TimeWindow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ReceiverPlan#getScore <em>Score</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ReceiverPlan#getTimeWindows <em>Time Windows</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.ReceiverPlan#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverPlan()
 * @model
 * @generated
 */
public interface ReceiverPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(double)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverPlan_Score()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getScore();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.ReceiverPlan#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(double value);

	/**
	 * Returns the value of the '<em><b>Time Windows</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightContrib.TimeWindow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Windows</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverPlan_TimeWindows()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeWindow> getTimeWindows();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightReceiver.ReceiverOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiverPlan_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReceiverOrder> getOrders();

} // ReceiverPlan
