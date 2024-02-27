/**
 */
package CommonFreightTransportMetamodel.utils;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite Volume Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.FiniteVolumeDimension#getVolumeCubicMetre <em>Volume Cubic Metre</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getFiniteVolumeDimension()
 * @model
 * @generated
 */
public interface FiniteVolumeDimension extends VolumeBasedDimension {
	/**
	 * Returns the value of the '<em><b>Volume Cubic Metre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Cubic Metre</em>' attribute.
	 * @see #setVolumeCubicMetre(double)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getFiniteVolumeDimension_VolumeCubicMetre()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getVolumeCubicMetre();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.FiniteVolumeDimension#getVolumeCubicMetre <em>Volume Cubic Metre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Cubic Metre</em>' attribute.
	 * @see #getVolumeCubicMetre()
	 * @generated
	 */
	void setVolumeCubicMetre(double value);

} // FiniteVolumeDimension
