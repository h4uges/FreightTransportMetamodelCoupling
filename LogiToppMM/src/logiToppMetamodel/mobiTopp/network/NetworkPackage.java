/**
 */
package logiToppMetamodel.mobiTopp.network;

import logiToppMetamodel.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see logiToppMetamodel.mobiTopp.network.NetworkFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "network";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/mobiTopp/network";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "network";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkPackage eINSTANCE = logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.network.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.network.impl.NodeImpl
	 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Coord</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COORD = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.network.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.network.impl.EdgeImpl
	 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Twin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TWIN = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__FROM = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TO = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LENGTH = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.network.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.network.impl.GraphImpl
	 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__EDGES = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODES = 1;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.network.impl.RoadNetworkImpl <em>Road Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.network.impl.RoadNetworkImpl
	 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getRoadNetwork()
	 * @generated
	 */
	int ROAD_NETWORK = 3;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_NETWORK__EDGES = GRAPH__EDGES;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_NETWORK__NODES = GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Zones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_NETWORK__ZONES = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Road Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_NETWORK_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Road Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_NETWORK_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.network.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.network.impl.ZoneImpl
	 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ID = BasePackage.NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NAME = BasePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CENTROID = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Total Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__TOTAL_AREA = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Households</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__HOUSEHOLDS = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = BasePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.network.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.network.impl.LocationImpl
	 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COORDINATE = 0;

	/**
	 * The feature id for the '<em><b>Road Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ROAD_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Road Access Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ROAD_ACCESS_EDGE = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.network.impl.ZoneAndLocationImpl <em>Zone And Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.network.impl.ZoneAndLocationImpl
	 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getZoneAndLocation()
	 * @generated
	 */
	int ZONE_AND_LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_AND_LOCATION__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_AND_LOCATION__ZONE = 1;

	/**
	 * The number of structural features of the '<em>Zone And Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_AND_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Zone And Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_AND_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.network.impl.ZoneAreaImpl <em>Zone Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.network.impl.ZoneAreaImpl
	 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getZoneArea()
	 * @generated
	 */
	int ZONE_AREA = 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_AREA__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Borders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_AREA__BORDERS = 1;

	/**
	 * The number of structural features of the '<em>Zone Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_AREA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Zone Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.network.impl.Point2DImpl <em>Point2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.network.impl.Point2DImpl
	 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getPoint2D()
	 * @generated
	 */
	int POINT2_D = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT2_D__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT2_D__Y = 1;

	/**
	 * The number of structural features of the '<em>Point2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT2_D_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT2_D_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.network.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.network.impl.PolygonImpl
	 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 9;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINES = 0;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.mobiTopp.network.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.mobiTopp.network.impl.LineImpl
	 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 10;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__END = 1;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.network.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.mobiTopp.network.Node#getCoord <em>Coord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coord</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Node#getCoord()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Coord();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.network.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.mobiTopp.network.Edge#getTwin <em>Twin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Twin</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Edge#getTwin()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Twin();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.mobiTopp.network.Edge#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Edge#getFrom()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_From();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.mobiTopp.network.Edge#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Edge#getTo()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_To();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.mobiTopp.network.Edge#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Edge#getLength()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Length();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.network.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.mobiTopp.network.Graph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Graph#getEdges()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.mobiTopp.network.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Graph#getNodes()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Nodes();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.network.RoadNetwork <em>Road Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road Network</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.RoadNetwork
	 * @generated
	 */
	EClass getRoadNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.mobiTopp.network.RoadNetwork#getZones <em>Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zones</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.RoadNetwork#getZones()
	 * @see #getRoadNetwork()
	 * @generated
	 */
	EReference getRoadNetwork_Zones();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.network.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.mobiTopp.network.Zone#getCentroid <em>Centroid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Centroid</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Zone#getCentroid()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Centroid();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.mobiTopp.network.Zone#getTotalArea <em>Total Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total Area</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Zone#getTotalArea()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_TotalArea();

	/**
	 * Returns the meta object for the reference list '{@link logiToppMetamodel.mobiTopp.network.Zone#getHouseholds <em>Households</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Households</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Zone#getHouseholds()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Households();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.network.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.mobiTopp.network.Location#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinate</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Location#getCoordinate()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Coordinate();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.mobiTopp.network.Location#getRoadPosition <em>Road Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Road Position</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Location#getRoadPosition()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_RoadPosition();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.mobiTopp.network.Location#getRoadAccessEdge <em>Road Access Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Road Access Edge</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Location#getRoadAccessEdge()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_RoadAccessEdge();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.network.ZoneAndLocation <em>Zone And Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone And Location</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.ZoneAndLocation
	 * @generated
	 */
	EClass getZoneAndLocation();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.mobiTopp.network.ZoneAndLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.ZoneAndLocation#getLocation()
	 * @see #getZoneAndLocation()
	 * @generated
	 */
	EReference getZoneAndLocation_Location();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.mobiTopp.network.ZoneAndLocation#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zone</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.ZoneAndLocation#getZone()
	 * @see #getZoneAndLocation()
	 * @generated
	 */
	EReference getZoneAndLocation_Zone();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.network.ZoneArea <em>Zone Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Area</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.ZoneArea
	 * @generated
	 */
	EClass getZoneArea();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.mobiTopp.network.ZoneArea#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.ZoneArea#getSize()
	 * @see #getZoneArea()
	 * @generated
	 */
	EAttribute getZoneArea_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.mobiTopp.network.ZoneArea#getBorders <em>Borders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Borders</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.ZoneArea#getBorders()
	 * @see #getZoneArea()
	 * @generated
	 */
	EReference getZoneArea_Borders();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.network.Point2D <em>Point2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point2 D</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Point2D
	 * @generated
	 */
	EClass getPoint2D();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.mobiTopp.network.Point2D#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Point2D#getX()
	 * @see #getPoint2D()
	 * @generated
	 */
	EAttribute getPoint2D_X();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.mobiTopp.network.Point2D#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Point2D#getY()
	 * @see #getPoint2D()
	 * @generated
	 */
	EAttribute getPoint2D_Y();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.network.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.mobiTopp.network.Polygon#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Polygon#getLines()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_Lines();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.mobiTopp.network.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.mobiTopp.network.Line#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Line#getStart()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Start();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.mobiTopp.network.Line#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see logiToppMetamodel.mobiTopp.network.Line#getEnd()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_End();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkFactory getNetworkFactory();

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
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.network.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.network.impl.NodeImpl
		 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Coord</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__COORD = eINSTANCE.getNode_Coord();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.network.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.network.impl.EdgeImpl
		 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Twin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TWIN = eINSTANCE.getEdge_Twin();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__FROM = eINSTANCE.getEdge_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TO = eINSTANCE.getEdge_To();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LENGTH = eINSTANCE.getEdge_Length();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.network.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.network.impl.GraphImpl
		 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__EDGES = eINSTANCE.getGraph_Edges();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NODES = eINSTANCE.getGraph_Nodes();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.network.impl.RoadNetworkImpl <em>Road Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.network.impl.RoadNetworkImpl
		 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getRoadNetwork()
		 * @generated
		 */
		EClass ROAD_NETWORK = eINSTANCE.getRoadNetwork();

		/**
		 * The meta object literal for the '<em><b>Zones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD_NETWORK__ZONES = eINSTANCE.getRoadNetwork_Zones();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.network.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.network.impl.ZoneImpl
		 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Centroid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__CENTROID = eINSTANCE.getZone_Centroid();

		/**
		 * The meta object literal for the '<em><b>Total Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__TOTAL_AREA = eINSTANCE.getZone_TotalArea();

		/**
		 * The meta object literal for the '<em><b>Households</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__HOUSEHOLDS = eINSTANCE.getZone_Households();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.network.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.network.impl.LocationImpl
		 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__COORDINATE = eINSTANCE.getLocation_Coordinate();

		/**
		 * The meta object literal for the '<em><b>Road Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ROAD_POSITION = eINSTANCE.getLocation_RoadPosition();

		/**
		 * The meta object literal for the '<em><b>Road Access Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__ROAD_ACCESS_EDGE = eINSTANCE.getLocation_RoadAccessEdge();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.network.impl.ZoneAndLocationImpl <em>Zone And Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.network.impl.ZoneAndLocationImpl
		 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getZoneAndLocation()
		 * @generated
		 */
		EClass ZONE_AND_LOCATION = eINSTANCE.getZoneAndLocation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_AND_LOCATION__LOCATION = eINSTANCE.getZoneAndLocation_Location();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_AND_LOCATION__ZONE = eINSTANCE.getZoneAndLocation_Zone();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.network.impl.ZoneAreaImpl <em>Zone Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.network.impl.ZoneAreaImpl
		 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getZoneArea()
		 * @generated
		 */
		EClass ZONE_AREA = eINSTANCE.getZoneArea();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_AREA__SIZE = eINSTANCE.getZoneArea_Size();

		/**
		 * The meta object literal for the '<em><b>Borders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_AREA__BORDERS = eINSTANCE.getZoneArea_Borders();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.network.impl.Point2DImpl <em>Point2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.network.impl.Point2DImpl
		 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getPoint2D()
		 * @generated
		 */
		EClass POINT2_D = eINSTANCE.getPoint2D();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT2_D__X = eINSTANCE.getPoint2D_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT2_D__Y = eINSTANCE.getPoint2D_Y();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.network.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.network.impl.PolygonImpl
		 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON__LINES = eINSTANCE.getPolygon_Lines();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.mobiTopp.network.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.mobiTopp.network.impl.LineImpl
		 * @see logiToppMetamodel.mobiTopp.network.impl.NetworkPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__START = eINSTANCE.getLine_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__END = eINSTANCE.getLine_End();

	}

} //NetworkPackage
