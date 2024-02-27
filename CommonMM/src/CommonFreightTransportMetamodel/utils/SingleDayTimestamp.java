/**
 */
package CommonFreightTransportMetamodel.utils;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Day Timestamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getHour <em>Hour</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getMinute <em>Minute</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getSingleDayTimestamp()
 * @model
 * @generated
 */
public interface SingleDayTimestamp extends Timestamp_ {
	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(int)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getSingleDayTimestamp_Hour()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getHour();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(int value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getSingleDayTimestamp_Minute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(int)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getSingleDayTimestamp_Second()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getSecond();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(int value);

} // SingleDayTimestamp
