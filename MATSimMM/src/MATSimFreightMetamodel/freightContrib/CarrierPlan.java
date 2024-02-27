/**
 */
package MATSimFreightMetamodel.freightContrib;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierPlan#getScheduledTours <em>Scheduled Tours</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierPlan#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierPlan()
 * @model
 * @generated
 */
public interface CarrierPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheduled Tours</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightContrib.ScheduledTour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Tours</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierPlan_ScheduledTours()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScheduledTour> getScheduledTours();

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(double)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierPlan_Score()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getScore();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierPlan#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(double value);

} // CarrierPlan
