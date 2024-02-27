/**
 */
package CommonFreightTransportMetamodel.utils;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Day Timestamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getSimulationDay <em>Simulation Day</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getHour <em>Hour</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getSecond <em>Second</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getMultiDayTimestamp()
 * @model
 * @generated
 */
public interface MultiDayTimestamp extends Timestamp_ {
	/**
	 * Returns the value of the '<em><b>Simulation Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Day</em>' attribute.
	 * @see #setSimulationDay(int)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getMultiDayTimestamp_SimulationDay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getSimulationDay();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getSimulationDay <em>Simulation Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Day</em>' attribute.
	 * @see #getSimulationDay()
	 * @generated
	 */
	void setSimulationDay(int value);

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(int)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getMultiDayTimestamp_Hour()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getHour();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(int value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(int)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getMultiDayTimestamp_Second()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getSecond();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(int value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getMultiDayTimestamp_Minute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

} // MultiDayTimestamp
