/**
 */
package logiToppMetamodel.mobiTopp.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Graph#getEdges <em>Edges</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Graph#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getGraph()
 * @model abstract="true"
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.mobiTopp.network.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getGraph_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.mobiTopp.network.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // Graph
