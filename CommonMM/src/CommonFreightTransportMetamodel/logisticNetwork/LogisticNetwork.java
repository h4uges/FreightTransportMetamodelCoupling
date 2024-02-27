/**
 */
package CommonFreightTransportMetamodel.logisticNetwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logistic Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork#getCEPSPs <em>CEPS Ps</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork#getPublicServicePoints <em>Public Service Points</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getLogisticNetwork()
 * @model
 * @generated
 */
public interface LogisticNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>CEPS Ps</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CEPS Ps</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getLogisticNetwork_CEPSPs()
	 * @model containment="true"
	 * @generated
	 */
	EList<CEPSP> getCEPSPs();

	/**
	 * Returns the value of the '<em><b>Public Service Points</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Service Points</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getLogisticNetwork_PublicServicePoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublicServicePoint> getPublicServicePoints();

} // LogisticNetwork
