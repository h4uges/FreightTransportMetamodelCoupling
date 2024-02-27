/**
 */
package logiToppMetamodel.logiTopp.business;

import logiToppMetamodel.base.Time;
import logiToppMetamodel.base.Weekday;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opening Hour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.business.OpeningHour#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.OpeningHour#getStart <em>Start</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.OpeningHour#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getOpeningHour()
 * @model
 * @generated
 */
public interface OpeningHour extends EObject {
	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' attribute.
	 * The literals are from the enumeration {@link logiToppMetamodel.base.Weekday}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Week</em>' attribute.
	 * @see logiToppMetamodel.base.Weekday
	 * @see #setDayOfWeek(Weekday)
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getOpeningHour_DayOfWeek()
	 * @model required="true"
	 * @generated
	 */
	Weekday getDayOfWeek();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.business.OpeningHour#getDayOfWeek <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Week</em>' attribute.
	 * @see logiToppMetamodel.base.Weekday
	 * @see #getDayOfWeek()
	 * @generated
	 */
	void setDayOfWeek(Weekday value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Time)
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getOpeningHour_Start()
	 * @model required="true"
	 * @generated
	 */
	Time getStart();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.business.OpeningHour#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Time value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Time)
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getOpeningHour_End()
	 * @model required="true"
	 * @generated
	 */
	Time getEnd();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.business.OpeningHour#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Time value);

} // OpeningHour
