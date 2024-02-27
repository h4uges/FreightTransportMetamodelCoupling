/**
 */
package CommonFreightTransportMetamodel.utils.impl;

import CommonFreightTransportMetamodel.utils.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilsFactoryImpl extends EFactoryImpl implements UtilsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UtilsFactory init() {
		try {
			UtilsFactory theUtilsFactory = (UtilsFactory)EPackage.Registry.INSTANCE.getEFactory(UtilsPackage.eNS_URI);
			if (theUtilsFactory != null) {
				return theUtilsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UtilsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UtilsPackage.SINGLE_DAY_TIMESTAMP: return createSingleDayTimestamp();
			case UtilsPackage.MULTI_DAY_TIMESTAMP: return createMultiDayTimestamp();
			case UtilsPackage.SINGLE_DAY_TIME_WINDOW: return createSingleDayTimeWindow();
			case UtilsPackage.MULTI_DAY_TIME_WINDOW: return createMultiDayTimeWindow();
			case UtilsPackage.DURRATION_: return createDurration_();
			case UtilsPackage.COORDINATE: return createCoordinate();
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION: return createVolumeAndWeightBasedDimension();
			case UtilsPackage.INFINITE_VOLUME_DIMENSION: return createInfiniteVolumeDimension();
			case UtilsPackage.FINITE_VOLUME_DIMENSION: return createFiniteVolumeDimension();
			case UtilsPackage.FINITE_WEIGHT_DIMENSION: return createFiniteWeightDimension();
			case UtilsPackage.INFINITE_WEIGHT_DIMENSION: return createInfiniteWeightDimension();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UtilsPackage.DAY_OF_WEEK:
				return createDayOfWeekFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UtilsPackage.DAY_OF_WEEK:
				return convertDayOfWeekToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleDayTimestamp createSingleDayTimestamp() {
		SingleDayTimestampImpl singleDayTimestamp = new SingleDayTimestampImpl();
		return singleDayTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiDayTimestamp createMultiDayTimestamp() {
		MultiDayTimestampImpl multiDayTimestamp = new MultiDayTimestampImpl();
		return multiDayTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleDayTimeWindow createSingleDayTimeWindow() {
		SingleDayTimeWindowImpl singleDayTimeWindow = new SingleDayTimeWindowImpl();
		return singleDayTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiDayTimeWindow createMultiDayTimeWindow() {
		MultiDayTimeWindowImpl multiDayTimeWindow = new MultiDayTimeWindowImpl();
		return multiDayTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Durration_ createDurration_() {
		Durration_Impl durration_ = new Durration_Impl();
		return durration_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coordinate createCoordinate() {
		CoordinateImpl coordinate = new CoordinateImpl();
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeAndWeightBasedDimension createVolumeAndWeightBasedDimension() {
		VolumeAndWeightBasedDimensionImpl volumeAndWeightBasedDimension = new VolumeAndWeightBasedDimensionImpl();
		return volumeAndWeightBasedDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfiniteVolumeDimension createInfiniteVolumeDimension() {
		InfiniteVolumeDimensionImpl infiniteVolumeDimension = new InfiniteVolumeDimensionImpl();
		return infiniteVolumeDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FiniteVolumeDimension createFiniteVolumeDimension() {
		FiniteVolumeDimensionImpl finiteVolumeDimension = new FiniteVolumeDimensionImpl();
		return finiteVolumeDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FiniteWeightDimension createFiniteWeightDimension() {
		FiniteWeightDimensionImpl finiteWeightDimension = new FiniteWeightDimensionImpl();
		return finiteWeightDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfiniteWeightDimension createInfiniteWeightDimension() {
		InfiniteWeightDimensionImpl infiniteWeightDimension = new InfiniteWeightDimensionImpl();
		return infiniteWeightDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek createDayOfWeekFromString(EDataType eDataType, String initialValue) {
		DayOfWeek result = DayOfWeek.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayOfWeekToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UtilsPackage getUtilsPackage() {
		return (UtilsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UtilsPackage getPackage() {
		return UtilsPackage.eINSTANCE;
	}

} //UtilsFactoryImpl
