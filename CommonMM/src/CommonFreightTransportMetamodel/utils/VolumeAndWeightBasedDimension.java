/**
 */
package CommonFreightTransportMetamodel.utils;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume And Weight Based Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension#getVolumeDimension <em>Volume Dimension</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension#getWeightDimension <em>Weight Dimension</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getVolumeAndWeightBasedDimension()
 * @model
 * @generated
 */
public interface VolumeAndWeightBasedDimension extends Dimension {
	/**
	 * Returns the value of the '<em><b>Volume Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Dimension</em>' containment reference.
	 * @see #setVolumeDimension(VolumeBasedDimension)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getVolumeAndWeightBasedDimension_VolumeDimension()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VolumeBasedDimension getVolumeDimension();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension#getVolumeDimension <em>Volume Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Dimension</em>' containment reference.
	 * @see #getVolumeDimension()
	 * @generated
	 */
	void setVolumeDimension(VolumeBasedDimension value);

	/**
	 * Returns the value of the '<em><b>Weight Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Dimension</em>' containment reference.
	 * @see #setWeightDimension(WeightBasedDimension)
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#getVolumeAndWeightBasedDimension_WeightDimension()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WeightBasedDimension getWeightDimension();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension#getWeightDimension <em>Weight Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Dimension</em>' containment reference.
	 * @see #getWeightDimension()
	 * @generated
	 */
	void setWeightDimension(WeightBasedDimension value);

} // VolumeAndWeightBasedDimension
