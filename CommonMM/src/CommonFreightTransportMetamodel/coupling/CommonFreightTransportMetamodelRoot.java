/**
 */
package CommonFreightTransportMetamodel.coupling;

import CommonFreightTransportMetamodel.logisticDemand.Demand;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolution;

import CommonFreightTransportMetamodel.network.Network;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Freight Transport Metamodel Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot#getNetwork <em>Network</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot#getPopulation <em>Population</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot#getLogisticNetwork <em>Logistic Network</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot#getDemand <em>Demand</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot#getLogisticSolution <em>Logistic Solution</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.coupling.CouplingPackage#getCommonFreightTransportMetamodelRoot()
 * @model
 * @generated
 */
public interface CommonFreightTransportMetamodelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(Network)
	 * @see CommonFreightTransportMetamodel.coupling.CouplingPackage#getCommonFreightTransportMetamodelRoot_Network()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference.
	 * @see #setPopulation(CommonFreightTransportMetamodel.localEntities.Population)
	 * @see CommonFreightTransportMetamodel.coupling.CouplingPackage#getCommonFreightTransportMetamodelRoot_Population()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CommonFreightTransportMetamodel.localEntities.Population getPopulation();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot#getPopulation <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' containment reference.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(CommonFreightTransportMetamodel.localEntities.Population value);

	/**
	 * Returns the value of the '<em><b>Logistic Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logistic Network</em>' containment reference.
	 * @see #setLogisticNetwork(LogisticNetwork)
	 * @see CommonFreightTransportMetamodel.coupling.CouplingPackage#getCommonFreightTransportMetamodelRoot_LogisticNetwork()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogisticNetwork getLogisticNetwork();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot#getLogisticNetwork <em>Logistic Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logistic Network</em>' containment reference.
	 * @see #getLogisticNetwork()
	 * @generated
	 */
	void setLogisticNetwork(LogisticNetwork value);

	/**
	 * Returns the value of the '<em><b>Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand</em>' containment reference.
	 * @see #setDemand(Demand)
	 * @see CommonFreightTransportMetamodel.coupling.CouplingPackage#getCommonFreightTransportMetamodelRoot_Demand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Demand getDemand();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot#getDemand <em>Demand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand</em>' containment reference.
	 * @see #getDemand()
	 * @generated
	 */
	void setDemand(Demand value);

	/**
	 * Returns the value of the '<em><b>Logistic Solution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logistic Solution</em>' containment reference.
	 * @see #setLogisticSolution(LogisticSolution)
	 * @see CommonFreightTransportMetamodel.coupling.CouplingPackage#getCommonFreightTransportMetamodelRoot_LogisticSolution()
	 * @model containment="true"
	 * @generated
	 */
	LogisticSolution getLogisticSolution();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot#getLogisticSolution <em>Logistic Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logistic Solution</em>' containment reference.
	 * @see #getLogisticSolution()
	 * @generated
	 */
	void setLogisticSolution(LogisticSolution value);

} // CommonFreightTransportMetamodelRoot
