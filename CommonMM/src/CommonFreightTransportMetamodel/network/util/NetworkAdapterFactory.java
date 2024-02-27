/**
 */
package CommonFreightTransportMetamodel.network.util;

import CommonFreightTransportMetamodel.network.*;

import CommonFreightTransportMetamodel.utils.HasId_;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.network.NetworkPackage
 * @generated
 */
public class NetworkAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NetworkPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NetworkPackage.eINSTANCE;
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
	protected NetworkSwitch<Adapter> modelSwitch =
		new NetworkSwitch<Adapter>() {
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseLocation_(Location_ object) {
				return createLocation_Adapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseNetworkAccess(NetworkAccess object) {
				return createNetworkAccessAdapter();
			}
			@Override
			public Adapter caseNodeBasedNetworkAccess(NodeBasedNetworkAccess object) {
				return createNodeBasedNetworkAccessAdapter();
			}
			@Override
			public Adapter caseEdgeBasedNetworkAccess(EdgeBasedNetworkAccess object) {
				return createEdgeBasedNetworkAccessAdapter();
			}
			@Override
			public Adapter caseHasId_(HasId_ object) {
				return createHasId_Adapter();
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
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.network.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.network.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.network.Location_ <em>Location </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.network.Location_
	 * @generated
	 */
	public Adapter createLocation_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.network.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.network.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.network.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.network.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.network.NetworkAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.network.NetworkAccess
	 * @generated
	 */
	public Adapter createNetworkAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.network.NodeBasedNetworkAccess <em>Node Based Network Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.network.NodeBasedNetworkAccess
	 * @generated
	 */
	public Adapter createNodeBasedNetworkAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess <em>Edge Based Network Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess
	 * @generated
	 */
	public Adapter createEdgeBasedNetworkAccessAdapter() {
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

} //NetworkAdapterFactory
