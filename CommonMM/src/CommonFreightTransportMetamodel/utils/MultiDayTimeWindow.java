/**
 */
package CommonFreightTransportMetamodel.utils;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Day Time Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.MultiDayTimeWindow#getFrom <em>From</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.MultiDayTimeWindow#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getMultiDayTimeWindow()
 * @model
 * @generated
 */
public interface MultiDayTimeWindow extends TimeWindow_ {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(MultiDayTimestamp)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getMultiDayTimeWindow_From()
	 * @model containment="true"
	 * @generated
	 */
	MultiDayTimestamp getFrom();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.MultiDayTimeWindow#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(MultiDayTimestamp value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(MultiDayTimestamp)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getMultiDayTimeWindow_To()
	 * @model containment="true"
	 * @generated
	 */
	MultiDayTimestamp getTo();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.MultiDayTimeWindow#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(MultiDayTimestamp value);

} // MultiDayTimeWindow
