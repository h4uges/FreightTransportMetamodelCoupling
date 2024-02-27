/**
 */
package logiToppMetamodel.logiTopp.distribution.timetable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.timetable.TimetableFactory
 * @model kind="package"
 * @generated
 */
public interface TimetablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timetable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/logiTopp/distribution/timetable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "timetable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimetablePackage eINSTANCE = logiToppMetamodel.logiTopp.distribution.timetable.impl.TimetablePackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.timetable.impl.TimeTableImpl <em>Time Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.impl.TimeTableImpl
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.impl.TimetablePackageImpl#getTimeTable()
	 * @generated
	 */
	int TIME_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE__CONNECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Time Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.timetable.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.impl.ConnectionImpl
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.impl.TimetablePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TO = 1;

	/**
	 * The feature id for the '<em><b>Departure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DEPARTURE = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DURATION = 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.timetable.TimeTable <em>Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Table</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.TimeTable
	 * @generated
	 */
	EClass getTimeTable();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.logiTopp.distribution.timetable.TimeTable#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.TimeTable#getConnections()
	 * @see #getTimeTable()
	 * @generated
	 */
	EReference getTimeTable_Connections();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.Connection#getFrom()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_From();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.Connection#getTo()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_To();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getDeparture <em>Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Departure</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.Connection#getDeparture()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Departure();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.timetable.Connection#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duration</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.timetable.Connection#getDuration()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Duration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimetableFactory getTimetableFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.timetable.impl.TimeTableImpl <em>Time Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.timetable.impl.TimeTableImpl
		 * @see logiToppMetamodel.logiTopp.distribution.timetable.impl.TimetablePackageImpl#getTimeTable()
		 * @generated
		 */
		EClass TIME_TABLE = eINSTANCE.getTimeTable();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_TABLE__CONNECTIONS = eINSTANCE.getTimeTable_Connections();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.timetable.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.timetable.impl.ConnectionImpl
		 * @see logiToppMetamodel.logiTopp.distribution.timetable.impl.TimetablePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FROM = eINSTANCE.getConnection_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TO = eINSTANCE.getConnection_To();

		/**
		 * The meta object literal for the '<em><b>Departure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__DEPARTURE = eINSTANCE.getConnection_Departure();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__DURATION = eINSTANCE.getConnection_Duration();

	}

} //TimetablePackage
