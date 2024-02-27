/**
 */
package CommonFreightTransportMetamodel.utils;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Day Time Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.SingleDayTimeWindow#getFrom <em>From</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.SingleDayTimeWindow#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getSingleDayTimeWindow()
 * @model
 * @generated
 */
public interface SingleDayTimeWindow extends TimeWindow_ {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(SingleDayTimestamp)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getSingleDayTimeWindow_From()
	 * @model containment="true"
	 * @generated
	 */
	SingleDayTimestamp getFrom();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.SingleDayTimeWindow#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SingleDayTimestamp value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(SingleDayTimestamp)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getSingleDayTimeWindow_To()
	 * @model containment="true"
	 * @generated
	 */
	SingleDayTimestamp getTo();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.SingleDayTimeWindow#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(SingleDayTimestamp value);

} // SingleDayTimeWindow
