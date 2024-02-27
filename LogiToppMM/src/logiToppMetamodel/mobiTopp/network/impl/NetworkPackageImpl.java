/**
 */
package logiToppMetamodel.mobiTopp.network.impl;

import logiToppMetamodel.LogiToppMetamodelPackage;

import logiToppMetamodel.base.BasePackage;

import logiToppMetamodel.base.impl.BasePackageImpl;

import logiToppMetamodel.impl.LogiToppMetamodelPackageImpl;

import logiToppMetamodel.logiTopp.LogiToppPackage;

import logiToppMetamodel.logiTopp.business.BusinessPackage;

import logiToppMetamodel.logiTopp.business.impl.BusinessPackageImpl;

import logiToppMetamodel.logiTopp.distribution.DistributionPackage;

import logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage;

import logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl;

import logiToppMetamodel.logiTopp.distribution.delivery.DeliveryPackage;

import logiToppMetamodel.logiTopp.distribution.delivery.impl.DeliveryPackageImpl;

import logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage;

import logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetPackageImpl;

import logiToppMetamodel.logiTopp.distribution.impl.DistributionPackageImpl;

import logiToppMetamodel.logiTopp.distribution.policies.PoliciesPackage;

import logiToppMetamodel.logiTopp.distribution.policies.impl.PoliciesPackageImpl;

import logiToppMetamodel.logiTopp.distribution.region.RegionPackage;

import logiToppMetamodel.logiTopp.distribution.region.impl.RegionPackageImpl;

import logiToppMetamodel.logiTopp.distribution.timetable.TimetablePackage;

import logiToppMetamodel.logiTopp.distribution.timetable.impl.TimetablePackageImpl;

import logiToppMetamodel.logiTopp.distribution.tours.ToursPackage;

import logiToppMetamodel.logiTopp.distribution.tours.impl.ToursPackageImpl;

import logiToppMetamodel.logiTopp.impl.LogiToppPackageImpl;

import logiToppMetamodel.logiTopp.parcels.ParcelsPackage;

import logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl;

import logiToppMetamodel.mobiTopp.citizens.CitizensPackage;
import logiToppMetamodel.mobiTopp.citizens.impl.CitizensPackageImpl;
import logiToppMetamodel.mobiTopp.network.Edge;
import logiToppMetamodel.mobiTopp.network.Graph;
import logiToppMetamodel.mobiTopp.network.Line;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.NetworkFactory;
import logiToppMetamodel.mobiTopp.network.NetworkPackage;
import logiToppMetamodel.mobiTopp.network.Node;
import logiToppMetamodel.mobiTopp.network.Point2D;
import logiToppMetamodel.mobiTopp.network.Polygon;
import logiToppMetamodel.mobiTopp.network.RoadNetwork;
import logiToppMetamodel.mobiTopp.network.Zone;
import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;
import logiToppMetamodel.mobiTopp.network.ZoneArea;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class NetworkPackageImpl extends EPackageImpl implements NetworkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roadNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneAndLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass point2DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

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
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NetworkPackageImpl() {
		super(eNS_URI, NetworkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NetworkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NetworkPackage init() {
		if (isInited) return (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNetworkPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NetworkPackageImpl theNetworkPackage = registeredNetworkPackage instanceof NetworkPackageImpl ? (NetworkPackageImpl)registeredNetworkPackage : new NetworkPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogiToppMetamodelPackage.eNS_URI);
		LogiToppMetamodelPackageImpl theLogiToppMetamodelPackage = (LogiToppMetamodelPackageImpl)(registeredPackage instanceof LogiToppMetamodelPackageImpl ? registeredPackage : LogiToppMetamodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CitizensPackage.eNS_URI);
		CitizensPackageImpl theCitizensPackage = (CitizensPackageImpl)(registeredPackage instanceof CitizensPackageImpl ? registeredPackage : CitizensPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		BasePackageImpl theBasePackage = (BasePackageImpl)(registeredPackage instanceof BasePackageImpl ? registeredPackage : BasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogiToppPackage.eNS_URI);
		LogiToppPackageImpl theLogiToppPackage = (LogiToppPackageImpl)(registeredPackage instanceof LogiToppPackageImpl ? registeredPackage : LogiToppPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI);
		BusinessPackageImpl theBusinessPackage = (BusinessPackageImpl)(registeredPackage instanceof BusinessPackageImpl ? registeredPackage : BusinessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DistributionPackage.eNS_URI);
		DistributionPackageImpl theDistributionPackage = (DistributionPackageImpl)(registeredPackage instanceof DistributionPackageImpl ? registeredPackage : DistributionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ChainsPackage.eNS_URI);
		ChainsPackageImpl theChainsPackage = (ChainsPackageImpl)(registeredPackage instanceof ChainsPackageImpl ? registeredPackage : ChainsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeliveryPackage.eNS_URI);
		DeliveryPackageImpl theDeliveryPackage = (DeliveryPackageImpl)(registeredPackage instanceof DeliveryPackageImpl ? registeredPackage : DeliveryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FleetPackage.eNS_URI);
		FleetPackageImpl theFleetPackage = (FleetPackageImpl)(registeredPackage instanceof FleetPackageImpl ? registeredPackage : FleetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PoliciesPackage.eNS_URI);
		PoliciesPackageImpl thePoliciesPackage = (PoliciesPackageImpl)(registeredPackage instanceof PoliciesPackageImpl ? registeredPackage : PoliciesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RegionPackage.eNS_URI);
		RegionPackageImpl theRegionPackage = (RegionPackageImpl)(registeredPackage instanceof RegionPackageImpl ? registeredPackage : RegionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TimetablePackage.eNS_URI);
		TimetablePackageImpl theTimetablePackage = (TimetablePackageImpl)(registeredPackage instanceof TimetablePackageImpl ? registeredPackage : TimetablePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ToursPackage.eNS_URI);
		ToursPackageImpl theToursPackage = (ToursPackageImpl)(registeredPackage instanceof ToursPackageImpl ? registeredPackage : ToursPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParcelsPackage.eNS_URI);
		ParcelsPackageImpl theParcelsPackage = (ParcelsPackageImpl)(registeredPackage instanceof ParcelsPackageImpl ? registeredPackage : ParcelsPackage.eINSTANCE);

		// Create package meta-data objects
		theNetworkPackage.createPackageContents();
		theLogiToppMetamodelPackage.createPackageContents();
		theCitizensPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theLogiToppPackage.createPackageContents();
		theBusinessPackage.createPackageContents();
		theDistributionPackage.createPackageContents();
		theChainsPackage.createPackageContents();
		theDeliveryPackage.createPackageContents();
		theFleetPackage.createPackageContents();
		thePoliciesPackage.createPackageContents();
		theRegionPackage.createPackageContents();
		theTimetablePackage.createPackageContents();
		theToursPackage.createPackageContents();
		theParcelsPackage.createPackageContents();

		// Initialize created meta-data
		theNetworkPackage.initializePackageContents();
		theLogiToppMetamodelPackage.initializePackageContents();
		theCitizensPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theLogiToppPackage.initializePackageContents();
		theBusinessPackage.initializePackageContents();
		theDistributionPackage.initializePackageContents();
		theChainsPackage.initializePackageContents();
		theDeliveryPackage.initializePackageContents();
		theFleetPackage.initializePackageContents();
		thePoliciesPackage.initializePackageContents();
		theRegionPackage.initializePackageContents();
		theTimetablePackage.initializePackageContents();
		theToursPackage.initializePackageContents();
		theParcelsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNetworkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NetworkPackage.eNS_URI, theNetworkPackage);
		return theNetworkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Coord() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Twin() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_From() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_To() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdge_Length() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Edges() {
		return (EReference)graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Nodes() {
		return (EReference)graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoadNetwork() {
		return roadNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoadNetwork_Zones() {
		return (EReference)roadNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZone() {
		return zoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZone_Centroid() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZone_TotalArea() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZone_Households() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_Coordinate() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_RoadPosition() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_RoadAccessEdge() {
		return (EReference)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZoneAndLocation() {
		return zoneAndLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZoneAndLocation_Location() {
		return (EReference)zoneAndLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZoneAndLocation_Zone() {
		return (EReference)zoneAndLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZoneArea() {
		return zoneAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZoneArea_Size() {
		return (EAttribute)zoneAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZoneArea_Borders() {
		return (EReference)zoneAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoint2D() {
		return point2DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint2D_X() {
		return (EAttribute)point2DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint2D_Y() {
		return (EAttribute)point2DEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolygon() {
		return polygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolygon_Lines() {
		return (EReference)polygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLine_Start() {
		return (EReference)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLine_End() {
		return (EReference)lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkFactory getNetworkFactory() {
		return (NetworkFactory)getEFactoryInstance();
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
		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__COORD);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__TWIN);
		createEReference(edgeEClass, EDGE__FROM);
		createEReference(edgeEClass, EDGE__TO);
		createEAttribute(edgeEClass, EDGE__LENGTH);

		graphEClass = createEClass(GRAPH);
		createEReference(graphEClass, GRAPH__EDGES);
		createEReference(graphEClass, GRAPH__NODES);

		roadNetworkEClass = createEClass(ROAD_NETWORK);
		createEReference(roadNetworkEClass, ROAD_NETWORK__ZONES);

		zoneEClass = createEClass(ZONE);
		createEReference(zoneEClass, ZONE__CENTROID);
		createEReference(zoneEClass, ZONE__TOTAL_AREA);
		createEReference(zoneEClass, ZONE__HOUSEHOLDS);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__COORDINATE);
		createEAttribute(locationEClass, LOCATION__ROAD_POSITION);
		createEReference(locationEClass, LOCATION__ROAD_ACCESS_EDGE);

		zoneAndLocationEClass = createEClass(ZONE_AND_LOCATION);
		createEReference(zoneAndLocationEClass, ZONE_AND_LOCATION__LOCATION);
		createEReference(zoneAndLocationEClass, ZONE_AND_LOCATION__ZONE);

		zoneAreaEClass = createEClass(ZONE_AREA);
		createEAttribute(zoneAreaEClass, ZONE_AREA__SIZE);
		createEReference(zoneAreaEClass, ZONE_AREA__BORDERS);

		point2DEClass = createEClass(POINT2_D);
		createEAttribute(point2DEClass, POINT2_D__X);
		createEAttribute(point2DEClass, POINT2_D__Y);

		polygonEClass = createEClass(POLYGON);
		createEReference(polygonEClass, POLYGON__LINES);

		lineEClass = createEClass(LINE);
		createEReference(lineEClass, LINE__START);
		createEReference(lineEClass, LINE__END);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		CitizensPackage theCitizensPackage = (CitizensPackage)EPackage.Registry.INSTANCE.getEPackage(CitizensPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(theBasePackage.getEntity());
		edgeEClass.getESuperTypes().add(theBasePackage.getEntity());
		roadNetworkEClass.getESuperTypes().add(this.getGraph());
		zoneEClass.getESuperTypes().add(theBasePackage.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Coord(), this.getPoint2D(), null, "coord", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Twin(), this.getEdge(), null, "twin", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_From(), this.getNode(), null, "from", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_To(), this.getNode(), null, "to", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Length(), theXMLTypePackage.getDouble(), "length", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_Edges(), this.getEdge(), null, "edges", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roadNetworkEClass, RoadNetwork.class, "RoadNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoadNetwork_Zones(), this.getZone(), null, "zones", null, 0, -1, RoadNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneEClass, Zone.class, "Zone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZone_Centroid(), this.getLocation(), null, "centroid", null, 1, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_TotalArea(), this.getZoneArea(), null, "totalArea", null, 0, 1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZone_Households(), theCitizensPackage.getHousehold(), theCitizensPackage.getHousehold_Zone(), "households", null, 0, -1, Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Coordinate(), this.getPoint2D(), null, "coordinate", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_RoadPosition(), theXMLTypePackage.getDouble(), "roadPosition", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_RoadAccessEdge(), this.getEdge(), null, "roadAccessEdge", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneAndLocationEClass, ZoneAndLocation.class, "ZoneAndLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZoneAndLocation_Location(), this.getLocation(), null, "location", null, 1, 1, ZoneAndLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoneAndLocation_Zone(), this.getZone(), null, "zone", null, 1, 1, ZoneAndLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneAreaEClass, ZoneArea.class, "ZoneArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZoneArea_Size(), theXMLTypePackage.getDouble(), "size", null, 1, 1, ZoneArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoneArea_Borders(), this.getPolygon(), null, "borders", null, 1, -1, ZoneArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(point2DEClass, Point2D.class, "Point2D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint2D_X(), theXMLTypePackage.getDouble(), "x", null, 1, 1, Point2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint2D_Y(), theXMLTypePackage.getDouble(), "y", null, 1, 1, Point2D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolygon_Lines(), this.getLine(), null, "lines", null, 3, -1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_Start(), this.getPoint2D(), null, "start", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_End(), this.getPoint2D(), null, "end", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //NetworkPackageImpl
