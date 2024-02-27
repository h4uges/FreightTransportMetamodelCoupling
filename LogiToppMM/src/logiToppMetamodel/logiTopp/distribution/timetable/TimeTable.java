/**
 */
package logiToppMetamodel.logiTopp.distribution.timetable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.timetable.TimeTable#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.timetable.TimetablePackage#getTimeTable()
 * @model
 * @generated
 */
public interface TimeTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.timetable.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.TimetablePackage#getTimeTable_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // TimeTable
