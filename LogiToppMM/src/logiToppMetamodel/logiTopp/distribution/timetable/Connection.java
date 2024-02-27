/**
 */
package logiToppMetamodel.logiTopp.distribution.timetable;

import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;

import logiToppMetamodel.logiTopp.distribution.DistributionCenter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getFrom <em>From</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getTo <em>To</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getDeparture <em>Departure</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.timetable.TimetablePackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(DistributionCenter)
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.TimetablePackage#getConnection_From()
	 * @model required="true"
	 * @generated
	 */
	DistributionCenter getFrom();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(DistributionCenter value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(DistributionCenter)
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.TimetablePackage#getConnection_To()
	 * @model required="true"
	 * @generated
	 */
	DistributionCenter getTo();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(DistributionCenter value);

	/**
	 * Returns the value of the '<em><b>Departure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure</em>' reference.
	 * @see #setDeparture(Time)
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.TimetablePackage#getConnection_Departure()
	 * @model required="true"
	 * @generated
	 */
	Time getDeparture();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getDeparture <em>Departure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure</em>' reference.
	 * @see #getDeparture()
	 * @generated
	 */
	void setDeparture(Time value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' reference.
	 * @see #setDuration(RelativeTime)
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.TimetablePackage#getConnection_Duration()
	 * @model required="true"
	 * @generated
	 */
	RelativeTime getDuration();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getDuration <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(RelativeTime value);

} // Connection
