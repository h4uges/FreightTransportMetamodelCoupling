/**
 */
package CommonFreightTransportMetamodel.utils;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite Weight Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.FiniteWeightDimension#getWeightKg <em>Weight Kg</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getFiniteWeightDimension()
 * @model
 * @generated
 */
public interface FiniteWeightDimension extends WeightBasedDimension {
	/**
	 * Returns the value of the '<em><b>Weight Kg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Kg</em>' attribute.
	 * @see #setWeightKg(double)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getFiniteWeightDimension_WeightKg()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getWeightKg();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.FiniteWeightDimension#getWeightKg <em>Weight Kg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Kg</em>' attribute.
	 * @see #getWeightKg()
	 * @generated
	 */
	void setWeightKg(double value);

} // FiniteWeightDimension
