/**
 */
package CommonFreightTransportMetamodel.utils.util;

import CommonFreightTransportMetamodel.utils.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.utils.UtilsPackage
 * @generated
 */
public class UtilsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UtilsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UtilsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilsSwitch<Adapter> modelSwitch =
		new UtilsSwitch<Adapter>() {
			@Override
			public Adapter caseSingleDayTimestamp(SingleDayTimestamp object) {
				return createSingleDayTimestampAdapter();
			}
			@Override
			public Adapter caseTimestamp_(Timestamp_ object) {
				return createTimestamp_Adapter();
			}
			@Override
			public Adapter caseTimeWindow_(TimeWindow_ object) {
				return createTimeWindow_Adapter();
			}
			@Override
			public Adapter caseMultiDayTimestamp(MultiDayTimestamp object) {
				return createMultiDayTimestampAdapter();
			}
			@Override
			public Adapter caseSingleDayTimeWindow(SingleDayTimeWindow object) {
				return createSingleDayTimeWindowAdapter();
			}
			@Override
			public Adapter caseMultiDayTimeWindow(MultiDayTimeWindow object) {
				return createMultiDayTimeWindowAdapter();
			}
			@Override
			public Adapter caseHasId_(HasId_ object) {
				return createHasId_Adapter();
			}
			@Override
			public Adapter caseDurration_(Durration_ object) {
				return createDurration_Adapter();
			}
			@Override
			public Adapter caseCoordinate(Coordinate object) {
				return createCoordinateAdapter();
			}
			@Override
			public Adapter caseVolumeBasedDimension(VolumeBasedDimension object) {
				return createVolumeBasedDimensionAdapter();
			}
			@Override
			public Adapter caseWeightBasedDimension(WeightBasedDimension object) {
				return createWeightBasedDimensionAdapter();
			}
			@Override
			public Adapter caseVolumeAndWeightBasedDimension(VolumeAndWeightBasedDimension object) {
				return createVolumeAndWeightBasedDimensionAdapter();
			}
			@Override
			public Adapter caseDimension(Dimension object) {
				return createDimensionAdapter();
			}
			@Override
			public Adapter caseShipmentlLegStartEndPoint(ShipmentlLegStartEndPoint object) {
				return createShipmentlLegStartEndPointAdapter();
			}
			@Override
			public Adapter caseInfiniteVolumeDimension(InfiniteVolumeDimension object) {
				return createInfiniteVolumeDimensionAdapter();
			}
			@Override
			public Adapter caseFiniteVolumeDimension(FiniteVolumeDimension object) {
				return createFiniteVolumeDimensionAdapter();
			}
			@Override
			public Adapter caseFiniteWeightDimension(FiniteWeightDimension object) {
				return createFiniteWeightDimensionAdapter();
			}
			@Override
			public Adapter caseInfiniteWeightDimension(InfiniteWeightDimension object) {
				return createInfiniteWeightDimensionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.SingleDayTimestamp <em>Single Day Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.SingleDayTimestamp
	 * @generated
	 */
	public Adapter createSingleDayTimestampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.Timestamp_ <em>Timestamp </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.Timestamp_
	 * @generated
	 */
	public Adapter createTimestamp_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.TimeWindow_ <em>Time Window </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.TimeWindow_
	 * @generated
	 */
	public Adapter createTimeWindow_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.MultiDayTimestamp <em>Multi Day Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.MultiDayTimestamp
	 * @generated
	 */
	public Adapter createMultiDayTimestampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.SingleDayTimeWindow <em>Single Day Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.SingleDayTimeWindow
	 * @generated
	 */
	public Adapter createSingleDayTimeWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.MultiDayTimeWindow <em>Multi Day Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.MultiDayTimeWindow
	 * @generated
	 */
	public Adapter createMultiDayTimeWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.HasId_ <em>Has Id </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.HasId_
	 * @generated
	 */
	public Adapter createHasId_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.Durration_ <em>Durration </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.Durration_
	 * @generated
	 */
	public Adapter createDurration_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.Coordinate
	 * @generated
	 */
	public Adapter createCoordinateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.VolumeBasedDimension <em>Volume Based Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.VolumeBasedDimension
	 * @generated
	 */
	public Adapter createVolumeBasedDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.WeightBasedDimension <em>Weight Based Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.WeightBasedDimension
	 * @generated
	 */
	public Adapter createWeightBasedDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension <em>Volume And Weight Based Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension
	 * @generated
	 */
	public Adapter createVolumeAndWeightBasedDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint <em>Shipmentl Leg Start End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint
	 * @generated
	 */
	public Adapter createShipmentlLegStartEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.InfiniteVolumeDimension <em>Infinite Volume Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.InfiniteVolumeDimension
	 * @generated
	 */
	public Adapter createInfiniteVolumeDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.FiniteVolumeDimension <em>Finite Volume Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.FiniteVolumeDimension
	 * @generated
	 */
	public Adapter createFiniteVolumeDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.FiniteWeightDimension <em>Finite Weight Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.FiniteWeightDimension
	 * @generated
	 */
	public Adapter createFiniteWeightDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.InfiniteWeightDimension <em>Infinite Weight Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.InfiniteWeightDimension
	 * @generated
	 */
	public Adapter createInfiniteWeightDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UtilsAdapterFactory
