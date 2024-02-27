/**
 */
package MATSimFreightMetamodel.freightContrib.tour;

import MATSimFreightMetamodel.base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.Tour#getTourElements <em>Tour Elements</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.Tour#getStart <em>Start</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.Tour#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getTour()
 * @model
 * @generated
 */
public interface Tour extends Entity {
	/**
	 * Returns the value of the '<em><b>Tour Elements</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightContrib.tour.TourElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tour Elements</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getTour_TourElements()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<TourElement> getTourElements();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Start)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getTour_Start()
	 * @model required="true"
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.Tour#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(End)
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage#getTour_End()
	 * @model required="true"
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.tour.Tour#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

} // Tour
