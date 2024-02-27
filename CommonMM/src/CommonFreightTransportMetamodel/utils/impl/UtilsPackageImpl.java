/**
 */
package CommonFreightTransportMetamodel.utils.impl;

import CommonFreightTransportMetamodel.coupling.CouplingPackage;
import CommonFreightTransportMetamodel.coupling.impl.CouplingPackageImpl;
import CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage;
import CommonFreightTransportMetamodel.localEntities.impl.LocalEntitiesPackageImpl;
import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;

import CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandPackageImpl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;

import CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkPackageImpl;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;

import CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionPackageImpl;

import CommonFreightTransportMetamodel.network.NetworkPackage;

import CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl;
import CommonFreightTransportMetamodel.results.ResultsPackage;

import CommonFreightTransportMetamodel.results.impl.ResultsPackageImpl;

import CommonFreightTransportMetamodel.utils.Coordinate;
import CommonFreightTransportMetamodel.utils.DayOfWeek;
import CommonFreightTransportMetamodel.utils.Dimension;
import CommonFreightTransportMetamodel.utils.Durration_;
import CommonFreightTransportMetamodel.utils.FiniteVolumeDimension;
import CommonFreightTransportMetamodel.utils.FiniteWeightDimension;
import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.InfiniteVolumeDimension;
import CommonFreightTransportMetamodel.utils.InfiniteWeightDimension;
import CommonFreightTransportMetamodel.utils.MultiDayTimeWindow;
import CommonFreightTransportMetamodel.utils.MultiDayTimestamp;
import CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint;
import CommonFreightTransportMetamodel.utils.SingleDayTimeWindow;
import CommonFreightTransportMetamodel.utils.SingleDayTimestamp;
import CommonFreightTransportMetamodel.utils.TimeWindow_;
import CommonFreightTransportMetamodel.utils.Timestamp_;
import CommonFreightTransportMetamodel.utils.UtilsFactory;
import CommonFreightTransportMetamodel.utils.UtilsPackage;
import CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension;
import CommonFreightTransportMetamodel.utils.VolumeBasedDimension;
import CommonFreightTransportMetamodel.utils.WeightBasedDimension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilsPackageImpl extends EPackageImpl implements UtilsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleDayTimestampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timestamp_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeWindow_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiDayTimestampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleDayTimeWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiDayTimeWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasId_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durration_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeBasedDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weightBasedDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeAndWeightBasedDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentlLegStartEndPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infiniteVolumeDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteVolumeDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteWeightDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infiniteWeightDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dayOfWeekEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CommonFreightTransportMetamodel.utils.UtilsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilsPackageImpl() {
		super(eNS_URI, UtilsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UtilsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilsPackage init() {
		if (isInited) return (UtilsPackage)EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUtilsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UtilsPackageImpl theUtilsPackage = registeredUtilsPackage instanceof UtilsPackageImpl ? (UtilsPackageImpl)registeredUtilsPackage : new UtilsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticDemandPackage.eNS_URI);
		LogisticDemandPackageImpl theLogisticDemandPackage = (LogisticDemandPackageImpl)(registeredPackage instanceof LogisticDemandPackageImpl ? registeredPackage : LogisticDemandPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LocalEntitiesPackage.eNS_URI);
		LocalEntitiesPackageImpl theLocalEntitiesPackage = (LocalEntitiesPackageImpl)(registeredPackage instanceof LocalEntitiesPackageImpl ? registeredPackage : LocalEntitiesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticNetworkPackage.eNS_URI);
		LogisticNetworkPackageImpl theLogisticNetworkPackage = (LogisticNetworkPackageImpl)(registeredPackage instanceof LogisticNetworkPackageImpl ? registeredPackage : LogisticNetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogisticSolutionPackage.eNS_URI);
		LogisticSolutionPackageImpl theLogisticSolutionPackage = (LogisticSolutionPackageImpl)(registeredPackage instanceof LogisticSolutionPackageImpl ? registeredPackage : LogisticSolutionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(registeredPackage instanceof ResultsPackageImpl ? registeredPackage : ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CouplingPackage.eNS_URI);
		CouplingPackageImpl theCouplingPackage = (CouplingPackageImpl)(registeredPackage instanceof CouplingPackageImpl ? registeredPackage : CouplingPackage.eINSTANCE);

		// Create package meta-data objects
		theUtilsPackage.createPackageContents();
		theLogisticDemandPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theLocalEntitiesPackage.createPackageContents();
		theLogisticNetworkPackage.createPackageContents();
		theLogisticSolutionPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theCouplingPackage.createPackageContents();

		// Initialize created meta-data
		theUtilsPackage.initializePackageContents();
		theLogisticDemandPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theLocalEntitiesPackage.initializePackageContents();
		theLogisticNetworkPackage.initializePackageContents();
		theLogisticSolutionPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theCouplingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilsPackage.eNS_URI, theUtilsPackage);
		return theUtilsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleDayTimestamp() {
		return singleDayTimestampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleDayTimestamp_Hour() {
		return (EAttribute)singleDayTimestampEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleDayTimestamp_Minute() {
		return (EAttribute)singleDayTimestampEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleDayTimestamp_Second() {
		return (EAttribute)singleDayTimestampEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimestamp_() {
		return timestamp_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeWindow_() {
		return timeWindow_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiDayTimestamp() {
		return multiDayTimestampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiDayTimestamp_SimulationDay() {
		return (EAttribute)multiDayTimestampEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiDayTimestamp_Hour() {
		return (EAttribute)multiDayTimestampEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiDayTimestamp_Second() {
		return (EAttribute)multiDayTimestampEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiDayTimestamp_Minute() {
		return (EAttribute)multiDayTimestampEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleDayTimeWindow() {
		return singleDayTimeWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleDayTimeWindow_From() {
		return (EReference)singleDayTimeWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleDayTimeWindow_To() {
		return (EReference)singleDayTimeWindowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiDayTimeWindow() {
		return multiDayTimeWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiDayTimeWindow_From() {
		return (EReference)multiDayTimeWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiDayTimeWindow_To() {
		return (EReference)multiDayTimeWindowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHasId_() {
		return hasId_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHasId__Id() {
		return (EAttribute)hasId_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDurration_() {
		return durration_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDurration__Hours() {
		return (EAttribute)durration_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDurration__Days() {
		return (EAttribute)durration_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDurration__Seconds() {
		return (EAttribute)durration_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDurration__Minutes() {
		return (EAttribute)durration_EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinate() {
		return coordinateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinate_X() {
		return (EAttribute)coordinateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinate_Y() {
		return (EAttribute)coordinateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolumeBasedDimension() {
		return volumeBasedDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWeightBasedDimension() {
		return weightBasedDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolumeAndWeightBasedDimension() {
		return volumeAndWeightBasedDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVolumeAndWeightBasedDimension_VolumeDimension() {
		return (EReference)volumeAndWeightBasedDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVolumeAndWeightBasedDimension_WeightDimension() {
		return (EReference)volumeAndWeightBasedDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentlLegStartEndPoint() {
		return shipmentlLegStartEndPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfiniteVolumeDimension() {
		return infiniteVolumeDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFiniteVolumeDimension() {
		return finiteVolumeDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFiniteVolumeDimension_VolumeCubicMetre() {
		return (EAttribute)finiteVolumeDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFiniteWeightDimension() {
		return finiteWeightDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFiniteWeightDimension_WeightKg() {
		return (EAttribute)finiteWeightDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfiniteWeightDimension() {
		return infiniteWeightDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDayOfWeek() {
		return dayOfWeekEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UtilsFactory getUtilsFactory() {
		return (UtilsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		singleDayTimestampEClass = createEClass(SINGLE_DAY_TIMESTAMP);
		createEAttribute(singleDayTimestampEClass, SINGLE_DAY_TIMESTAMP__HOUR);
		createEAttribute(singleDayTimestampEClass, SINGLE_DAY_TIMESTAMP__MINUTE);
		createEAttribute(singleDayTimestampEClass, SINGLE_DAY_TIMESTAMP__SECOND);

		timestamp_EClass = createEClass(TIMESTAMP_);

		timeWindow_EClass = createEClass(TIME_WINDOW_);

		multiDayTimestampEClass = createEClass(MULTI_DAY_TIMESTAMP);
		createEAttribute(multiDayTimestampEClass, MULTI_DAY_TIMESTAMP__SIMULATION_DAY);
		createEAttribute(multiDayTimestampEClass, MULTI_DAY_TIMESTAMP__HOUR);
		createEAttribute(multiDayTimestampEClass, MULTI_DAY_TIMESTAMP__SECOND);
		createEAttribute(multiDayTimestampEClass, MULTI_DAY_TIMESTAMP__MINUTE);

		singleDayTimeWindowEClass = createEClass(SINGLE_DAY_TIME_WINDOW);
		createEReference(singleDayTimeWindowEClass, SINGLE_DAY_TIME_WINDOW__FROM);
		createEReference(singleDayTimeWindowEClass, SINGLE_DAY_TIME_WINDOW__TO);

		multiDayTimeWindowEClass = createEClass(MULTI_DAY_TIME_WINDOW);
		createEReference(multiDayTimeWindowEClass, MULTI_DAY_TIME_WINDOW__FROM);
		createEReference(multiDayTimeWindowEClass, MULTI_DAY_TIME_WINDOW__TO);

		hasId_EClass = createEClass(HAS_ID_);
		createEAttribute(hasId_EClass, HAS_ID___ID);

		durration_EClass = createEClass(DURRATION_);
		createEAttribute(durration_EClass, DURRATION___HOURS);
		createEAttribute(durration_EClass, DURRATION___DAYS);
		createEAttribute(durration_EClass, DURRATION___SECONDS);
		createEAttribute(durration_EClass, DURRATION___MINUTES);

		coordinateEClass = createEClass(COORDINATE);
		createEAttribute(coordinateEClass, COORDINATE__X);
		createEAttribute(coordinateEClass, COORDINATE__Y);

		volumeBasedDimensionEClass = createEClass(VOLUME_BASED_DIMENSION);

		weightBasedDimensionEClass = createEClass(WEIGHT_BASED_DIMENSION);

		volumeAndWeightBasedDimensionEClass = createEClass(VOLUME_AND_WEIGHT_BASED_DIMENSION);
		createEReference(volumeAndWeightBasedDimensionEClass, VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION);
		createEReference(volumeAndWeightBasedDimensionEClass, VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION);

		dimensionEClass = createEClass(DIMENSION);

		shipmentlLegStartEndPointEClass = createEClass(SHIPMENTL_LEG_START_END_POINT);

		infiniteVolumeDimensionEClass = createEClass(INFINITE_VOLUME_DIMENSION);

		finiteVolumeDimensionEClass = createEClass(FINITE_VOLUME_DIMENSION);
		createEAttribute(finiteVolumeDimensionEClass, FINITE_VOLUME_DIMENSION__VOLUME_CUBIC_METRE);

		finiteWeightDimensionEClass = createEClass(FINITE_WEIGHT_DIMENSION);
		createEAttribute(finiteWeightDimensionEClass, FINITE_WEIGHT_DIMENSION__WEIGHT_KG);

		infiniteWeightDimensionEClass = createEClass(INFINITE_WEIGHT_DIMENSION);

		// Create enums
		dayOfWeekEEnum = createEEnum(DAY_OF_WEEK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		singleDayTimestampEClass.getESuperTypes().add(this.getTimestamp_());
		multiDayTimestampEClass.getESuperTypes().add(this.getTimestamp_());
		singleDayTimeWindowEClass.getESuperTypes().add(this.getTimeWindow_());
		multiDayTimeWindowEClass.getESuperTypes().add(this.getTimeWindow_());
		volumeBasedDimensionEClass.getESuperTypes().add(this.getDimension());
		weightBasedDimensionEClass.getESuperTypes().add(this.getDimension());
		volumeAndWeightBasedDimensionEClass.getESuperTypes().add(this.getDimension());
		infiniteVolumeDimensionEClass.getESuperTypes().add(this.getVolumeBasedDimension());
		finiteVolumeDimensionEClass.getESuperTypes().add(this.getVolumeBasedDimension());
		finiteWeightDimensionEClass.getESuperTypes().add(this.getWeightBasedDimension());
		infiniteWeightDimensionEClass.getESuperTypes().add(this.getWeightBasedDimension());

		// Initialize classes, features, and operations; add parameters
		initEClass(singleDayTimestampEClass, SingleDayTimestamp.class, "SingleDayTimestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleDayTimestamp_Hour(), theXMLTypePackage.getInt(), "hour", null, 1, 1, SingleDayTimestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleDayTimestamp_Minute(), theXMLTypePackage.getInt(), "minute", null, 1, 1, SingleDayTimestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleDayTimestamp_Second(), theXMLTypePackage.getInt(), "second", null, 1, 1, SingleDayTimestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timestamp_EClass, Timestamp_.class, "Timestamp_", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeWindow_EClass, TimeWindow_.class, "TimeWindow_", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiDayTimestampEClass, MultiDayTimestamp.class, "MultiDayTimestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiDayTimestamp_SimulationDay(), theXMLTypePackage.getInt(), "simulationDay", null, 1, 1, MultiDayTimestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiDayTimestamp_Hour(), theXMLTypePackage.getInt(), "hour", null, 1, 1, MultiDayTimestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiDayTimestamp_Second(), theXMLTypePackage.getInt(), "second", null, 1, 1, MultiDayTimestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiDayTimestamp_Minute(), theXMLTypePackage.getInt(), "minute", null, 1, 1, MultiDayTimestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleDayTimeWindowEClass, SingleDayTimeWindow.class, "SingleDayTimeWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleDayTimeWindow_From(), this.getSingleDayTimestamp(), null, "from", null, 0, 1, SingleDayTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleDayTimeWindow_To(), this.getSingleDayTimestamp(), null, "to", null, 0, 1, SingleDayTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiDayTimeWindowEClass, MultiDayTimeWindow.class, "MultiDayTimeWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiDayTimeWindow_From(), this.getMultiDayTimestamp(), null, "from", null, 0, 1, MultiDayTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiDayTimeWindow_To(), this.getMultiDayTimestamp(), null, "to", null, 0, 1, MultiDayTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasId_EClass, HasId_.class, "HasId_", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasId__Id(), theXMLTypePackage.getID(), "id", null, 1, 1, HasId_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durration_EClass, Durration_.class, "Durration_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurration__Hours(), theXMLTypePackage.getInt(), "hours", null, 1, 1, Durration_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDurration__Days(), theXMLTypePackage.getInt(), "days", null, 1, 1, Durration_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDurration__Seconds(), theXMLTypePackage.getInt(), "seconds", null, 1, 1, Durration_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDurration__Minutes(), theXMLTypePackage.getInt(), "minutes", null, 1, 1, Durration_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinateEClass, Coordinate.class, "Coordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinate_X(), theXMLTypePackage.getDouble(), "x", null, 0, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinate_Y(), theXMLTypePackage.getDouble(), "y", null, 0, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeBasedDimensionEClass, VolumeBasedDimension.class, "VolumeBasedDimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(weightBasedDimensionEClass, WeightBasedDimension.class, "WeightBasedDimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(volumeAndWeightBasedDimensionEClass, VolumeAndWeightBasedDimension.class, "VolumeAndWeightBasedDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVolumeAndWeightBasedDimension_VolumeDimension(), this.getVolumeBasedDimension(), null, "volumeDimension", null, 1, 1, VolumeAndWeightBasedDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVolumeAndWeightBasedDimension_WeightDimension(), this.getWeightBasedDimension(), null, "weightDimension", null, 1, 1, VolumeAndWeightBasedDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionEClass, Dimension.class, "Dimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shipmentlLegStartEndPointEClass, ShipmentlLegStartEndPoint.class, "ShipmentlLegStartEndPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infiniteVolumeDimensionEClass, InfiniteVolumeDimension.class, "InfiniteVolumeDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finiteVolumeDimensionEClass, FiniteVolumeDimension.class, "FiniteVolumeDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiniteVolumeDimension_VolumeCubicMetre(), theXMLTypePackage.getDouble(), "volumeCubicMetre", null, 0, 1, FiniteVolumeDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finiteWeightDimensionEClass, FiniteWeightDimension.class, "FiniteWeightDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiniteWeightDimension_WeightKg(), theXMLTypePackage.getDouble(), "weightKg", null, 0, 1, FiniteWeightDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infiniteWeightDimensionEClass, InfiniteWeightDimension.class, "InfiniteWeightDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dayOfWeekEEnum, DayOfWeek.class, "DayOfWeek");

		// Create resource
		createResource(eNS_URI);
	}

} //UtilsPackageImpl
