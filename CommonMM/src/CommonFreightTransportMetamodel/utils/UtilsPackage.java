/**
 */
package CommonFreightTransportMetamodel.utils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see CommonFreightTransportMetamodel.utils.UtilsFactory
 * @model kind="package"
 * @generated
 */
public interface UtilsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "utils";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/commonFreightTransportMetamodel/utils";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "utils";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilsPackage eINSTANCE = CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.Timestamp_Impl <em>Timestamp </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.Timestamp_Impl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getTimestamp_()
	 * @generated
	 */
	int TIMESTAMP_ = 1;

	/**
	 * The number of structural features of the '<em>Timestamp </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP__FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Timestamp </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP__OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.SingleDayTimestampImpl <em>Single Day Timestamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.SingleDayTimestampImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getSingleDayTimestamp()
	 * @generated
	 */
	int SINGLE_DAY_TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DAY_TIMESTAMP__HOUR = TIMESTAMP__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DAY_TIMESTAMP__MINUTE = TIMESTAMP__FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DAY_TIMESTAMP__SECOND = TIMESTAMP__FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Single Day Timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DAY_TIMESTAMP_FEATURE_COUNT = TIMESTAMP__FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Single Day Timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DAY_TIMESTAMP_OPERATION_COUNT = TIMESTAMP__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.TimeWindow_Impl <em>Time Window </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.TimeWindow_Impl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getTimeWindow_()
	 * @generated
	 */
	int TIME_WINDOW_ = 2;

	/**
	 * The number of structural features of the '<em>Time Window </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Time Window </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.MultiDayTimestampImpl <em>Multi Day Timestamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.MultiDayTimestampImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getMultiDayTimestamp()
	 * @generated
	 */
	int MULTI_DAY_TIMESTAMP = 3;

	/**
	 * The feature id for the '<em><b>Simulation Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TIMESTAMP__SIMULATION_DAY = TIMESTAMP__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TIMESTAMP__HOUR = TIMESTAMP__FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TIMESTAMP__SECOND = TIMESTAMP__FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TIMESTAMP__MINUTE = TIMESTAMP__FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multi Day Timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TIMESTAMP_FEATURE_COUNT = TIMESTAMP__FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Multi Day Timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TIMESTAMP_OPERATION_COUNT = TIMESTAMP__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.SingleDayTimeWindowImpl <em>Single Day Time Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.SingleDayTimeWindowImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getSingleDayTimeWindow()
	 * @generated
	 */
	int SINGLE_DAY_TIME_WINDOW = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DAY_TIME_WINDOW__FROM = TIME_WINDOW__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DAY_TIME_WINDOW__TO = TIME_WINDOW__FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Day Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DAY_TIME_WINDOW_FEATURE_COUNT = TIME_WINDOW__FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Single Day Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DAY_TIME_WINDOW_OPERATION_COUNT = TIME_WINDOW__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.MultiDayTimeWindowImpl <em>Multi Day Time Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.MultiDayTimeWindowImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getMultiDayTimeWindow()
	 * @generated
	 */
	int MULTI_DAY_TIME_WINDOW = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TIME_WINDOW__FROM = TIME_WINDOW__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TIME_WINDOW__TO = TIME_WINDOW__FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Day Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TIME_WINDOW_FEATURE_COUNT = TIME_WINDOW__FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multi Day Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TIME_WINDOW_OPERATION_COUNT = TIME_WINDOW__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.HasId_Impl <em>Has Id </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.HasId_Impl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getHasId_()
	 * @generated
	 */
	int HAS_ID_ = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ID___ID = 0;

	/**
	 * The number of structural features of the '<em>Has Id </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ID__FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Id </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ID__OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.Durration_Impl <em>Durration </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.Durration_Impl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getDurration_()
	 * @generated
	 */
	int DURRATION_ = 7;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURRATION___HOURS = 0;

	/**
	 * The feature id for the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURRATION___DAYS = 1;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURRATION___SECONDS = 2;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURRATION___MINUTES = 3;

	/**
	 * The number of structural features of the '<em>Durration </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURRATION__FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Durration </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURRATION__OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.CoordinateImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__Y = 1;

	/**
	 * The number of structural features of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.DimensionImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 12;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.VolumeBasedDimensionImpl <em>Volume Based Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.VolumeBasedDimensionImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getVolumeBasedDimension()
	 * @generated
	 */
	int VOLUME_BASED_DIMENSION = 9;

	/**
	 * The number of structural features of the '<em>Volume Based Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_BASED_DIMENSION_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Volume Based Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_BASED_DIMENSION_OPERATION_COUNT = DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.WeightBasedDimensionImpl <em>Weight Based Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.WeightBasedDimensionImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getWeightBasedDimension()
	 * @generated
	 */
	int WEIGHT_BASED_DIMENSION = 10;

	/**
	 * The number of structural features of the '<em>Weight Based Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_BASED_DIMENSION_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Weight Based Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHT_BASED_DIMENSION_OPERATION_COUNT = DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.VolumeAndWeightBasedDimensionImpl <em>Volume And Weight Based Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.VolumeAndWeightBasedDimensionImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getVolumeAndWeightBasedDimension()
	 * @generated
	 */
	int VOLUME_AND_WEIGHT_BASED_DIMENSION = 11;

	/**
	 * The feature id for the '<em><b>Volume Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION = DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION = DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Volume And Weight Based Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_AND_WEIGHT_BASED_DIMENSION_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Volume And Weight Based Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_AND_WEIGHT_BASED_DIMENSION_OPERATION_COUNT = DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.ShipmentlLegStartEndPointImpl <em>Shipmentl Leg Start End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.ShipmentlLegStartEndPointImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getShipmentlLegStartEndPoint()
	 * @generated
	 */
	int SHIPMENTL_LEG_START_END_POINT = 13;

	/**
	 * The number of structural features of the '<em>Shipmentl Leg Start End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENTL_LEG_START_END_POINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Shipmentl Leg Start End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENTL_LEG_START_END_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.InfiniteVolumeDimensionImpl <em>Infinite Volume Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.InfiniteVolumeDimensionImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getInfiniteVolumeDimension()
	 * @generated
	 */
	int INFINITE_VOLUME_DIMENSION = 14;

	/**
	 * The number of structural features of the '<em>Infinite Volume Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITE_VOLUME_DIMENSION_FEATURE_COUNT = VOLUME_BASED_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infinite Volume Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITE_VOLUME_DIMENSION_OPERATION_COUNT = VOLUME_BASED_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.FiniteVolumeDimensionImpl <em>Finite Volume Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.FiniteVolumeDimensionImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getFiniteVolumeDimension()
	 * @generated
	 */
	int FINITE_VOLUME_DIMENSION = 15;

	/**
	 * The feature id for the '<em><b>Volume Cubic Metre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_VOLUME_DIMENSION__VOLUME_CUBIC_METRE = VOLUME_BASED_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Finite Volume Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_VOLUME_DIMENSION_FEATURE_COUNT = VOLUME_BASED_DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Finite Volume Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_VOLUME_DIMENSION_OPERATION_COUNT = VOLUME_BASED_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.FiniteWeightDimensionImpl <em>Finite Weight Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.FiniteWeightDimensionImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getFiniteWeightDimension()
	 * @generated
	 */
	int FINITE_WEIGHT_DIMENSION = 16;

	/**
	 * The feature id for the '<em><b>Weight Kg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_WEIGHT_DIMENSION__WEIGHT_KG = WEIGHT_BASED_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Finite Weight Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_WEIGHT_DIMENSION_FEATURE_COUNT = WEIGHT_BASED_DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Finite Weight Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_WEIGHT_DIMENSION_OPERATION_COUNT = WEIGHT_BASED_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.impl.InfiniteWeightDimensionImpl <em>Infinite Weight Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.impl.InfiniteWeightDimensionImpl
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getInfiniteWeightDimension()
	 * @generated
	 */
	int INFINITE_WEIGHT_DIMENSION = 17;

	/**
	 * The number of structural features of the '<em>Infinite Weight Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITE_WEIGHT_DIMENSION_FEATURE_COUNT = WEIGHT_BASED_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infinite Weight Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITE_WEIGHT_DIMENSION_OPERATION_COUNT = WEIGHT_BASED_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.utils.DayOfWeek <em>Day Of Week</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.utils.DayOfWeek
	 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getDayOfWeek()
	 * @generated
	 */
	int DAY_OF_WEEK = 18;


	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.SingleDayTimestamp <em>Single Day Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Day Timestamp</em>'.
	 * @see CommonFreightTransportMetamodel.utils.SingleDayTimestamp
	 * @generated
	 */
	EClass getSingleDayTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getHour()
	 * @see #getSingleDayTimestamp()
	 * @generated
	 */
	EAttribute getSingleDayTimestamp_Hour();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getMinute()
	 * @see #getSingleDayTimestamp()
	 * @generated
	 */
	EAttribute getSingleDayTimestamp_Minute();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see CommonFreightTransportMetamodel.utils.SingleDayTimestamp#getSecond()
	 * @see #getSingleDayTimestamp()
	 * @generated
	 */
	EAttribute getSingleDayTimestamp_Second();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.Timestamp_ <em>Timestamp </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp </em>'.
	 * @see CommonFreightTransportMetamodel.utils.Timestamp_
	 * @generated
	 */
	EClass getTimestamp_();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.TimeWindow_ <em>Time Window </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Window </em>'.
	 * @see CommonFreightTransportMetamodel.utils.TimeWindow_
	 * @generated
	 */
	EClass getTimeWindow_();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp <em>Multi Day Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Day Timestamp</em>'.
	 * @see CommonFreightTransportMetamodel.utils.MultiDayTimestamp
	 * @generated
	 */
	EClass getMultiDayTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getSimulationDay <em>Simulation Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Day</em>'.
	 * @see CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getSimulationDay()
	 * @see #getMultiDayTimestamp()
	 * @generated
	 */
	EAttribute getMultiDayTimestamp_SimulationDay();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getHour()
	 * @see #getMultiDayTimestamp()
	 * @generated
	 */
	EAttribute getMultiDayTimestamp_Hour();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getSecond()
	 * @see #getMultiDayTimestamp()
	 * @generated
	 */
	EAttribute getMultiDayTimestamp_Second();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see CommonFreightTransportMetamodel.utils.MultiDayTimestamp#getMinute()
	 * @see #getMultiDayTimestamp()
	 * @generated
	 */
	EAttribute getMultiDayTimestamp_Minute();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.SingleDayTimeWindow <em>Single Day Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Day Time Window</em>'.
	 * @see CommonFreightTransportMetamodel.utils.SingleDayTimeWindow
	 * @generated
	 */
	EClass getSingleDayTimeWindow();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.utils.SingleDayTimeWindow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see CommonFreightTransportMetamodel.utils.SingleDayTimeWindow#getFrom()
	 * @see #getSingleDayTimeWindow()
	 * @generated
	 */
	EReference getSingleDayTimeWindow_From();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.utils.SingleDayTimeWindow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see CommonFreightTransportMetamodel.utils.SingleDayTimeWindow#getTo()
	 * @see #getSingleDayTimeWindow()
	 * @generated
	 */
	EReference getSingleDayTimeWindow_To();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.MultiDayTimeWindow <em>Multi Day Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Day Time Window</em>'.
	 * @see CommonFreightTransportMetamodel.utils.MultiDayTimeWindow
	 * @generated
	 */
	EClass getMultiDayTimeWindow();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.utils.MultiDayTimeWindow#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see CommonFreightTransportMetamodel.utils.MultiDayTimeWindow#getFrom()
	 * @see #getMultiDayTimeWindow()
	 * @generated
	 */
	EReference getMultiDayTimeWindow_From();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.utils.MultiDayTimeWindow#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see CommonFreightTransportMetamodel.utils.MultiDayTimeWindow#getTo()
	 * @see #getMultiDayTimeWindow()
	 * @generated
	 */
	EReference getMultiDayTimeWindow_To();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.HasId_ <em>Has Id </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Id </em>'.
	 * @see CommonFreightTransportMetamodel.utils.HasId_
	 * @generated
	 */
	EClass getHasId_();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.HasId_#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CommonFreightTransportMetamodel.utils.HasId_#getId()
	 * @see #getHasId_()
	 * @generated
	 */
	EAttribute getHasId__Id();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.Durration_ <em>Durration </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Durration </em>'.
	 * @see CommonFreightTransportMetamodel.utils.Durration_
	 * @generated
	 */
	EClass getDurration_();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.Durration_#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see CommonFreightTransportMetamodel.utils.Durration_#getHours()
	 * @see #getDurration_()
	 * @generated
	 */
	EAttribute getDurration__Hours();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.Durration_#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days</em>'.
	 * @see CommonFreightTransportMetamodel.utils.Durration_#getDays()
	 * @see #getDurration_()
	 * @generated
	 */
	EAttribute getDurration__Days();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.Durration_#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see CommonFreightTransportMetamodel.utils.Durration_#getSeconds()
	 * @see #getDurration_()
	 * @generated
	 */
	EAttribute getDurration__Seconds();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.Durration_#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see CommonFreightTransportMetamodel.utils.Durration_#getMinutes()
	 * @see #getDurration_()
	 * @generated
	 */
	EAttribute getDurration__Minutes();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see CommonFreightTransportMetamodel.utils.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.Coordinate#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CommonFreightTransportMetamodel.utils.Coordinate#getX()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_X();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.Coordinate#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see CommonFreightTransportMetamodel.utils.Coordinate#getY()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Y();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.VolumeBasedDimension <em>Volume Based Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume Based Dimension</em>'.
	 * @see CommonFreightTransportMetamodel.utils.VolumeBasedDimension
	 * @generated
	 */
	EClass getVolumeBasedDimension();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.WeightBasedDimension <em>Weight Based Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weight Based Dimension</em>'.
	 * @see CommonFreightTransportMetamodel.utils.WeightBasedDimension
	 * @generated
	 */
	EClass getWeightBasedDimension();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension <em>Volume And Weight Based Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume And Weight Based Dimension</em>'.
	 * @see CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension
	 * @generated
	 */
	EClass getVolumeAndWeightBasedDimension();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension#getVolumeDimension <em>Volume Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Volume Dimension</em>'.
	 * @see CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension#getVolumeDimension()
	 * @see #getVolumeAndWeightBasedDimension()
	 * @generated
	 */
	EReference getVolumeAndWeightBasedDimension_VolumeDimension();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension#getWeightDimension <em>Weight Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weight Dimension</em>'.
	 * @see CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension#getWeightDimension()
	 * @see #getVolumeAndWeightBasedDimension()
	 * @generated
	 */
	EReference getVolumeAndWeightBasedDimension_WeightDimension();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see CommonFreightTransportMetamodel.utils.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint <em>Shipmentl Leg Start End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipmentl Leg Start End Point</em>'.
	 * @see CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint
	 * @generated
	 */
	EClass getShipmentlLegStartEndPoint();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.InfiniteVolumeDimension <em>Infinite Volume Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infinite Volume Dimension</em>'.
	 * @see CommonFreightTransportMetamodel.utils.InfiniteVolumeDimension
	 * @generated
	 */
	EClass getInfiniteVolumeDimension();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.FiniteVolumeDimension <em>Finite Volume Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Volume Dimension</em>'.
	 * @see CommonFreightTransportMetamodel.utils.FiniteVolumeDimension
	 * @generated
	 */
	EClass getFiniteVolumeDimension();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.FiniteVolumeDimension#getVolumeCubicMetre <em>Volume Cubic Metre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Cubic Metre</em>'.
	 * @see CommonFreightTransportMetamodel.utils.FiniteVolumeDimension#getVolumeCubicMetre()
	 * @see #getFiniteVolumeDimension()
	 * @generated
	 */
	EAttribute getFiniteVolumeDimension_VolumeCubicMetre();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.FiniteWeightDimension <em>Finite Weight Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Weight Dimension</em>'.
	 * @see CommonFreightTransportMetamodel.utils.FiniteWeightDimension
	 * @generated
	 */
	EClass getFiniteWeightDimension();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.utils.FiniteWeightDimension#getWeightKg <em>Weight Kg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight Kg</em>'.
	 * @see CommonFreightTransportMetamodel.utils.FiniteWeightDimension#getWeightKg()
	 * @see #getFiniteWeightDimension()
	 * @generated
	 */
	EAttribute getFiniteWeightDimension_WeightKg();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.utils.InfiniteWeightDimension <em>Infinite Weight Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infinite Weight Dimension</em>'.
	 * @see CommonFreightTransportMetamodel.utils.InfiniteWeightDimension
	 * @generated
	 */
	EClass getInfiniteWeightDimension();

	/**
	 * Returns the meta object for enum '{@link CommonFreightTransportMetamodel.utils.DayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Of Week</em>'.
	 * @see CommonFreightTransportMetamodel.utils.DayOfWeek
	 * @generated
	 */
	EEnum getDayOfWeek();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilsFactory getUtilsFactory();

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
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.SingleDayTimestampImpl <em>Single Day Timestamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.SingleDayTimestampImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getSingleDayTimestamp()
		 * @generated
		 */
		EClass SINGLE_DAY_TIMESTAMP = eINSTANCE.getSingleDayTimestamp();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_DAY_TIMESTAMP__HOUR = eINSTANCE.getSingleDayTimestamp_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_DAY_TIMESTAMP__MINUTE = eINSTANCE.getSingleDayTimestamp_Minute();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_DAY_TIMESTAMP__SECOND = eINSTANCE.getSingleDayTimestamp_Second();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.Timestamp_Impl <em>Timestamp </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.Timestamp_Impl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getTimestamp_()
		 * @generated
		 */
		EClass TIMESTAMP_ = eINSTANCE.getTimestamp_();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.TimeWindow_Impl <em>Time Window </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.TimeWindow_Impl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getTimeWindow_()
		 * @generated
		 */
		EClass TIME_WINDOW_ = eINSTANCE.getTimeWindow_();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.MultiDayTimestampImpl <em>Multi Day Timestamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.MultiDayTimestampImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getMultiDayTimestamp()
		 * @generated
		 */
		EClass MULTI_DAY_TIMESTAMP = eINSTANCE.getMultiDayTimestamp();

		/**
		 * The meta object literal for the '<em><b>Simulation Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_DAY_TIMESTAMP__SIMULATION_DAY = eINSTANCE.getMultiDayTimestamp_SimulationDay();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_DAY_TIMESTAMP__HOUR = eINSTANCE.getMultiDayTimestamp_Hour();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_DAY_TIMESTAMP__SECOND = eINSTANCE.getMultiDayTimestamp_Second();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_DAY_TIMESTAMP__MINUTE = eINSTANCE.getMultiDayTimestamp_Minute();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.SingleDayTimeWindowImpl <em>Single Day Time Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.SingleDayTimeWindowImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getSingleDayTimeWindow()
		 * @generated
		 */
		EClass SINGLE_DAY_TIME_WINDOW = eINSTANCE.getSingleDayTimeWindow();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_DAY_TIME_WINDOW__FROM = eINSTANCE.getSingleDayTimeWindow_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_DAY_TIME_WINDOW__TO = eINSTANCE.getSingleDayTimeWindow_To();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.MultiDayTimeWindowImpl <em>Multi Day Time Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.MultiDayTimeWindowImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getMultiDayTimeWindow()
		 * @generated
		 */
		EClass MULTI_DAY_TIME_WINDOW = eINSTANCE.getMultiDayTimeWindow();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_DAY_TIME_WINDOW__FROM = eINSTANCE.getMultiDayTimeWindow_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_DAY_TIME_WINDOW__TO = eINSTANCE.getMultiDayTimeWindow_To();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.HasId_Impl <em>Has Id </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.HasId_Impl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getHasId_()
		 * @generated
		 */
		EClass HAS_ID_ = eINSTANCE.getHasId_();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_ID___ID = eINSTANCE.getHasId__Id();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.Durration_Impl <em>Durration </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.Durration_Impl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getDurration_()
		 * @generated
		 */
		EClass DURRATION_ = eINSTANCE.getDurration_();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURRATION___HOURS = eINSTANCE.getDurration__Hours();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURRATION___DAYS = eINSTANCE.getDurration__Days();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURRATION___SECONDS = eINSTANCE.getDurration__Seconds();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURRATION___MINUTES = eINSTANCE.getDurration__Minutes();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.CoordinateImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getCoordinate()
		 * @generated
		 */
		EClass COORDINATE = eINSTANCE.getCoordinate();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__X = eINSTANCE.getCoordinate_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__Y = eINSTANCE.getCoordinate_Y();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.VolumeBasedDimensionImpl <em>Volume Based Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.VolumeBasedDimensionImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getVolumeBasedDimension()
		 * @generated
		 */
		EClass VOLUME_BASED_DIMENSION = eINSTANCE.getVolumeBasedDimension();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.WeightBasedDimensionImpl <em>Weight Based Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.WeightBasedDimensionImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getWeightBasedDimension()
		 * @generated
		 */
		EClass WEIGHT_BASED_DIMENSION = eINSTANCE.getWeightBasedDimension();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.VolumeAndWeightBasedDimensionImpl <em>Volume And Weight Based Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.VolumeAndWeightBasedDimensionImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getVolumeAndWeightBasedDimension()
		 * @generated
		 */
		EClass VOLUME_AND_WEIGHT_BASED_DIMENSION = eINSTANCE.getVolumeAndWeightBasedDimension();

		/**
		 * The meta object literal for the '<em><b>Volume Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION = eINSTANCE.getVolumeAndWeightBasedDimension_VolumeDimension();

		/**
		 * The meta object literal for the '<em><b>Weight Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION = eINSTANCE.getVolumeAndWeightBasedDimension_WeightDimension();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.DimensionImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.ShipmentlLegStartEndPointImpl <em>Shipmentl Leg Start End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.ShipmentlLegStartEndPointImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getShipmentlLegStartEndPoint()
		 * @generated
		 */
		EClass SHIPMENTL_LEG_START_END_POINT = eINSTANCE.getShipmentlLegStartEndPoint();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.InfiniteVolumeDimensionImpl <em>Infinite Volume Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.InfiniteVolumeDimensionImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getInfiniteVolumeDimension()
		 * @generated
		 */
		EClass INFINITE_VOLUME_DIMENSION = eINSTANCE.getInfiniteVolumeDimension();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.FiniteVolumeDimensionImpl <em>Finite Volume Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.FiniteVolumeDimensionImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getFiniteVolumeDimension()
		 * @generated
		 */
		EClass FINITE_VOLUME_DIMENSION = eINSTANCE.getFiniteVolumeDimension();

		/**
		 * The meta object literal for the '<em><b>Volume Cubic Metre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINITE_VOLUME_DIMENSION__VOLUME_CUBIC_METRE = eINSTANCE.getFiniteVolumeDimension_VolumeCubicMetre();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.FiniteWeightDimensionImpl <em>Finite Weight Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.FiniteWeightDimensionImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getFiniteWeightDimension()
		 * @generated
		 */
		EClass FINITE_WEIGHT_DIMENSION = eINSTANCE.getFiniteWeightDimension();

		/**
		 * The meta object literal for the '<em><b>Weight Kg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINITE_WEIGHT_DIMENSION__WEIGHT_KG = eINSTANCE.getFiniteWeightDimension_WeightKg();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.impl.InfiniteWeightDimensionImpl <em>Infinite Weight Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.impl.InfiniteWeightDimensionImpl
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getInfiniteWeightDimension()
		 * @generated
		 */
		EClass INFINITE_WEIGHT_DIMENSION = eINSTANCE.getInfiniteWeightDimension();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.utils.DayOfWeek <em>Day Of Week</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.utils.DayOfWeek
		 * @see CommonFreightTransportMetamodel.utils.impl.UtilsPackageImpl#getDayOfWeek()
		 * @generated
		 */
		EEnum DAY_OF_WEEK = eINSTANCE.getDayOfWeek();

	}

} //UtilsPackage
