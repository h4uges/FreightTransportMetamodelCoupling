/**
 */
package CommonFreightTransportMetamodel.network;

import CommonFreightTransportMetamodel.utils.UtilsPackage;

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
 * @see CommonFreightTransportMetamodel.network.NetworkFactory
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
	String eNS_URI = "http://www.cep-model-coupling.com/commonFreightTransportMetamodel/network";

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
	NetworkPackage eINSTANCE = CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.network.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.network.impl.NetworkImpl
	 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NODES = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__EDGES = 1;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.network.impl.Location_Impl <em>Location </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.network.impl.Location_Impl
	 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getLocation_()
	 * @generated
	 */
	int LOCATION_ = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___COORDINATE = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___NETWORK_ACCESS = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Location </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.network.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.network.impl.NodeImpl
	 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = UtilsPackage.HAS_ID___ID;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COORDINATE = UtilsPackage.HAS_ID__FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = UtilsPackage.HAS_ID__FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = UtilsPackage.HAS_ID__OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.network.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.network.impl.EdgeImpl
	 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TO = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Allowed Vehicle Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ALLOWED_VEHICLE_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.network.impl.NetworkAccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.network.impl.NetworkAccessImpl
	 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getNetworkAccess()
	 * @generated
	 */
	int NETWORK_ACCESS = 4;

	/**
	 * The number of structural features of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACCESS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.network.impl.NodeBasedNetworkAccessImpl <em>Node Based Network Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.network.impl.NodeBasedNetworkAccessImpl
	 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getNodeBasedNetworkAccess()
	 * @generated
	 */
	int NODE_BASED_NETWORK_ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BASED_NETWORK_ACCESS__NODE = NETWORK_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Based Network Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BASED_NETWORK_ACCESS_FEATURE_COUNT = NETWORK_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node Based Network Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BASED_NETWORK_ACCESS_OPERATION_COUNT = NETWORK_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.network.impl.EdgeBasedNetworkAccessImpl <em>Edge Based Network Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.network.impl.EdgeBasedNetworkAccessImpl
	 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getEdgeBasedNetworkAccess()
	 * @generated
	 */
	int EDGE_BASED_NETWORK_ACCESS = 6;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_BASED_NETWORK_ACCESS__EDGE = NETWORK_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edge Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_BASED_NETWORK_ACCESS__EDGE_POSITION = NETWORK_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge Based Network Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_BASED_NETWORK_ACCESS_FEATURE_COUNT = NETWORK_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edge Based Network Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_BASED_NETWORK_ACCESS_OPERATION_COUNT = NETWORK_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.network.VehicleType_ <em>Vehicle Type </em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.network.VehicleType_
	 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getVehicleType_()
	 * @generated
	 */
	int VEHICLE_TYPE_ = 7;


	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.network.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see CommonFreightTransportMetamodel.network.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.network.Network#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see CommonFreightTransportMetamodel.network.Network#getNodes()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link CommonFreightTransportMetamodel.network.Network#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see CommonFreightTransportMetamodel.network.Network#getEdges()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Edges();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.network.Location_ <em>Location </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location </em>'.
	 * @see CommonFreightTransportMetamodel.network.Location_
	 * @generated
	 */
	EClass getLocation_();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.network.Location_#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinate</em>'.
	 * @see CommonFreightTransportMetamodel.network.Location_#getCoordinate()
	 * @see #getLocation_()
	 * @generated
	 */
	EReference getLocation__Coordinate();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.network.Location_#getNetworkAccess <em>Network Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Access</em>'.
	 * @see CommonFreightTransportMetamodel.network.Location_#getNetworkAccess()
	 * @see #getLocation_()
	 * @generated
	 */
	EReference getLocation__NetworkAccess();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.network.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see CommonFreightTransportMetamodel.network.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.network.Node#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinate</em>'.
	 * @see CommonFreightTransportMetamodel.network.Node#getCoordinate()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Coordinate();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.network.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see CommonFreightTransportMetamodel.network.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.network.Edge#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see CommonFreightTransportMetamodel.network.Edge#getFrom()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_From();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.network.Edge#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see CommonFreightTransportMetamodel.network.Edge#getTo()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_To();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.network.Edge#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see CommonFreightTransportMetamodel.network.Edge#getLength()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Length();

	/**
	 * Returns the meta object for the attribute list '{@link CommonFreightTransportMetamodel.network.Edge#getAllowedVehicleTypes <em>Allowed Vehicle Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed Vehicle Types</em>'.
	 * @see CommonFreightTransportMetamodel.network.Edge#getAllowedVehicleTypes()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_AllowedVehicleTypes();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.network.NetworkAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see CommonFreightTransportMetamodel.network.NetworkAccess
	 * @generated
	 */
	EClass getNetworkAccess();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.network.NodeBasedNetworkAccess <em>Node Based Network Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Based Network Access</em>'.
	 * @see CommonFreightTransportMetamodel.network.NodeBasedNetworkAccess
	 * @generated
	 */
	EClass getNodeBasedNetworkAccess();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.network.NodeBasedNetworkAccess#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see CommonFreightTransportMetamodel.network.NodeBasedNetworkAccess#getNode()
	 * @see #getNodeBasedNetworkAccess()
	 * @generated
	 */
	EReference getNodeBasedNetworkAccess_Node();

	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess <em>Edge Based Network Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Based Network Access</em>'.
	 * @see CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess
	 * @generated
	 */
	EClass getEdgeBasedNetworkAccess();

	/**
	 * Returns the meta object for the reference '{@link CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edge</em>'.
	 * @see CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess#getEdge()
	 * @see #getEdgeBasedNetworkAccess()
	 * @generated
	 */
	EReference getEdgeBasedNetworkAccess_Edge();

	/**
	 * Returns the meta object for the attribute '{@link CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess#getEdgePosition <em>Edge Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Position</em>'.
	 * @see CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess#getEdgePosition()
	 * @see #getEdgeBasedNetworkAccess()
	 * @generated
	 */
	EAttribute getEdgeBasedNetworkAccess_EdgePosition();

	/**
	 * Returns the meta object for enum '{@link CommonFreightTransportMetamodel.network.VehicleType_ <em>Vehicle Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vehicle Type </em>'.
	 * @see CommonFreightTransportMetamodel.network.VehicleType_
	 * @generated
	 */
	EEnum getVehicleType_();

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
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.network.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.network.impl.NetworkImpl
		 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__NODES = eINSTANCE.getNetwork_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__EDGES = eINSTANCE.getNetwork_Edges();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.network.impl.Location_Impl <em>Location </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.network.impl.Location_Impl
		 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getLocation_()
		 * @generated
		 */
		EClass LOCATION_ = eINSTANCE.getLocation_();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION___COORDINATE = eINSTANCE.getLocation__Coordinate();

		/**
		 * The meta object literal for the '<em><b>Network Access</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION___NETWORK_ACCESS = eINSTANCE.getLocation__NetworkAccess();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.network.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.network.impl.NodeImpl
		 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__COORDINATE = eINSTANCE.getNode_Coordinate();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.network.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.network.impl.EdgeImpl
		 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

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
		 * The meta object literal for the '<em><b>Allowed Vehicle Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__ALLOWED_VEHICLE_TYPES = eINSTANCE.getEdge_AllowedVehicleTypes();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.network.impl.NetworkAccessImpl <em>Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.network.impl.NetworkAccessImpl
		 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getNetworkAccess()
		 * @generated
		 */
		EClass NETWORK_ACCESS = eINSTANCE.getNetworkAccess();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.network.impl.NodeBasedNetworkAccessImpl <em>Node Based Network Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.network.impl.NodeBasedNetworkAccessImpl
		 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getNodeBasedNetworkAccess()
		 * @generated
		 */
		EClass NODE_BASED_NETWORK_ACCESS = eINSTANCE.getNodeBasedNetworkAccess();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_BASED_NETWORK_ACCESS__NODE = eINSTANCE.getNodeBasedNetworkAccess_Node();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.network.impl.EdgeBasedNetworkAccessImpl <em>Edge Based Network Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.network.impl.EdgeBasedNetworkAccessImpl
		 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getEdgeBasedNetworkAccess()
		 * @generated
		 */
		EClass EDGE_BASED_NETWORK_ACCESS = eINSTANCE.getEdgeBasedNetworkAccess();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_BASED_NETWORK_ACCESS__EDGE = eINSTANCE.getEdgeBasedNetworkAccess_Edge();

		/**
		 * The meta object literal for the '<em><b>Edge Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_BASED_NETWORK_ACCESS__EDGE_POSITION = eINSTANCE.getEdgeBasedNetworkAccess_EdgePosition();

		/**
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.network.VehicleType_ <em>Vehicle Type </em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.network.VehicleType_
		 * @see CommonFreightTransportMetamodel.network.impl.NetworkPackageImpl#getVehicleType_()
		 * @generated
		 */
		EEnum VEHICLE_TYPE_ = eINSTANCE.getVehicleType_();

	}

} //NetworkPackage
