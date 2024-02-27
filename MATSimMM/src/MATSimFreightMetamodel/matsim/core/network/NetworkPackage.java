/**
 */
package MATSimFreightMetamodel.matsim.core.network;

import MATSimFreightMetamodel.base.BasePackage;

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
 * @see MATSimFreightMetamodel.matsim.core.network.NetworkFactory
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
	String eNS_URI = "http://www.cep-model-coupling.com/MATSimFreightMetamodel/matsim/core/network";

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
	NetworkPackage eINSTANCE = MATSimFreightMetamodel.matsim.core.network.impl.NetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.core.network.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.core.network.impl.NetworkImpl
	 * @see MATSimFreightMetamodel.matsim.core.network.impl.NetworkPackageImpl#getNetwork()
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
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LINKS = 1;

	/**
	 * The feature id for the '<em><b>Capacity Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__CAPACITY_PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Effective Cell Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__EFFECTIVE_CELL_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Effective Lane Widht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__EFFECTIVE_LANE_WIDHT = 4;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.core.network.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.core.network.impl.NodeImpl
	 * @see MATSimFreightMetamodel.matsim.core.network.impl.NetworkPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

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
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.core.network.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.core.network.impl.LinkImpl
	 * @see MATSimFreightMetamodel.matsim.core.network.impl.NetworkPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__FROM = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TO = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LENGTH = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Freespeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__FREESPEED = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CAPACITY = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nof Lanes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NOF_LANES = BasePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allowed Modes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ALLOWED_MODES = BasePackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.matsim.core.network.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.matsim.core.network.Network#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Network#getNodes()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.matsim.core.network.Network#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Network#getLinks()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Links();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.core.network.Network#getCapacityPeriod <em>Capacity Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Period</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Network#getCapacityPeriod()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_CapacityPeriod();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.core.network.Network#getEffectiveCellSize <em>Effective Cell Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Cell Size</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Network#getEffectiveCellSize()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_EffectiveCellSize();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.core.network.Network#getEffectiveLaneWidht <em>Effective Lane Widht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Lane Widht</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Network#getEffectiveLaneWidht()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_EffectiveLaneWidht();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.matsim.core.network.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.matsim.core.network.Node#getCoord <em>Coord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coord</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Node#getCoord()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Coord();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.matsim.core.network.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.matsim.core.network.Link#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Link#getFrom()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_From();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.matsim.core.network.Link#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Link#getTo()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_To();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.core.network.Link#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Link#getLength()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Length();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.core.network.Link#getFreespeed <em>Freespeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freespeed</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Link#getFreespeed()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Freespeed();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.core.network.Link#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Link#getCapacity()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.core.network.Link#getNofLanes <em>Nof Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nof Lanes</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Link#getNofLanes()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_NofLanes();

	/**
	 * Returns the meta object for the attribute list '{@link MATSimFreightMetamodel.matsim.core.network.Link#getAllowedModes <em>Allowed Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed Modes</em>'.
	 * @see MATSimFreightMetamodel.matsim.core.network.Link#getAllowedModes()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_AllowedModes();

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
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.core.network.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.core.network.impl.NetworkImpl
		 * @see MATSimFreightMetamodel.matsim.core.network.impl.NetworkPackageImpl#getNetwork()
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
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__LINKS = eINSTANCE.getNetwork_Links();

		/**
		 * The meta object literal for the '<em><b>Capacity Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__CAPACITY_PERIOD = eINSTANCE.getNetwork_CapacityPeriod();

		/**
		 * The meta object literal for the '<em><b>Effective Cell Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__EFFECTIVE_CELL_SIZE = eINSTANCE.getNetwork_EffectiveCellSize();

		/**
		 * The meta object literal for the '<em><b>Effective Lane Widht</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__EFFECTIVE_LANE_WIDHT = eINSTANCE.getNetwork_EffectiveLaneWidht();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.core.network.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.core.network.impl.NodeImpl
		 * @see MATSimFreightMetamodel.matsim.core.network.impl.NetworkPackageImpl#getNode()
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
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.core.network.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.core.network.impl.LinkImpl
		 * @see MATSimFreightMetamodel.matsim.core.network.impl.NetworkPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__FROM = eINSTANCE.getLink_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TO = eINSTANCE.getLink_To();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LENGTH = eINSTANCE.getLink_Length();

		/**
		 * The meta object literal for the '<em><b>Freespeed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__FREESPEED = eINSTANCE.getLink_Freespeed();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__CAPACITY = eINSTANCE.getLink_Capacity();

		/**
		 * The meta object literal for the '<em><b>Nof Lanes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NOF_LANES = eINSTANCE.getLink_NofLanes();

		/**
		 * The meta object literal for the '<em><b>Allowed Modes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ALLOWED_MODES = eINSTANCE.getLink_AllowedModes();

	}

} //NetworkPackage
