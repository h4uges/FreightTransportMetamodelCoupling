/**
 */
package CommonFreightTransportMetamodel.utils;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.utils.UtilsPackage
 * @generated
 */
public interface UtilsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilsFactory eINSTANCE = CommonFreightTransportMetamodel.utils.impl.UtilsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Single Day Timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Day Timestamp</em>'.
	 * @generated
	 */
	SingleDayTimestamp createSingleDayTimestamp();

	/**
	 * Returns a new object of class '<em>Multi Day Timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Day Timestamp</em>'.
	 * @generated
	 */
	MultiDayTimestamp createMultiDayTimestamp();

	/**
	 * Returns a new object of class '<em>Single Day Time Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Day Time Window</em>'.
	 * @generated
	 */
	SingleDayTimeWindow createSingleDayTimeWindow();

	/**
	 * Returns a new object of class '<em>Multi Day Time Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Day Time Window</em>'.
	 * @generated
	 */
	MultiDayTimeWindow createMultiDayTimeWindow();

	/**
	 * Returns a new object of class '<em>Durration </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Durration </em>'.
	 * @generated
	 */
	Durration_ createDurration_();

	/**
	 * Returns a new object of class '<em>Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinate</em>'.
	 * @generated
	 */
	Coordinate createCoordinate();

	/**
	 * Returns a new object of class '<em>Volume And Weight Based Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume And Weight Based Dimension</em>'.
	 * @generated
	 */
	VolumeAndWeightBasedDimension createVolumeAndWeightBasedDimension();

	/**
	 * Returns a new object of class '<em>Infinite Volume Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infinite Volume Dimension</em>'.
	 * @generated
	 */
	InfiniteVolumeDimension createInfiniteVolumeDimension();

	/**
	 * Returns a new object of class '<em>Finite Volume Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finite Volume Dimension</em>'.
	 * @generated
	 */
	FiniteVolumeDimension createFiniteVolumeDimension();

	/**
	 * Returns a new object of class '<em>Finite Weight Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finite Weight Dimension</em>'.
	 * @generated
	 */
	FiniteWeightDimension createFiniteWeightDimension();

	/**
	 * Returns a new object of class '<em>Infinite Weight Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infinite Weight Dimension</em>'.
	 * @generated
	 */
	InfiniteWeightDimension createInfiniteWeightDimension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UtilsPackage getUtilsPackage();

} //UtilsFactory
