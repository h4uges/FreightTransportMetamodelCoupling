/**
 */
package logiToppMetamodel;

import logiToppMetamodel.mobiTopp.network.RoadNetwork;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Demand Exchange Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.DemandExchangeRoot#getDemand <em>Demand</em>}</li>
 *   <li>{@link logiToppMetamodel.DemandExchangeRoot#getPopulation <em>Population</em>}</li>
 *   <li>{@link logiToppMetamodel.DemandExchangeRoot#getTransportNetwork <em>Transport Network</em>}</li>
 *   <li>{@link logiToppMetamodel.DemandExchangeRoot#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.LogiToppMetamodelPackage#getDemandExchangeRoot()
 * @model
 * @generated
 */
public interface DemandExchangeRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand</em>' containment reference.
	 * @see #setDemand(Demand)
	 * @see logiToppMetamodel.LogiToppMetamodelPackage#getDemandExchangeRoot_Demand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Demand getDemand();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.DemandExchangeRoot#getDemand <em>Demand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand</em>' containment reference.
	 * @see #getDemand()
	 * @generated
	 */
	void setDemand(Demand value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference.
	 * @see #setPopulation(Population)
	 * @see logiToppMetamodel.LogiToppMetamodelPackage#getDemandExchangeRoot_Population()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Population getPopulation();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.DemandExchangeRoot#getPopulation <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' containment reference.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(Population value);

	/**
	 * Returns the value of the '<em><b>Transport Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Network</em>' containment reference.
	 * @see #setTransportNetwork(TransportInfrastructure)
	 * @see logiToppMetamodel.LogiToppMetamodelPackage#getDemandExchangeRoot_TransportNetwork()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TransportInfrastructure getTransportNetwork();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.DemandExchangeRoot#getTransportNetwork <em>Transport Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Network</em>' containment reference.
	 * @see #getTransportNetwork()
	 * @generated
	 */
	void setTransportNetwork(TransportInfrastructure value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(RoadNetwork)
	 * @see logiToppMetamodel.LogiToppMetamodelPackage#getDemandExchangeRoot_Network()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RoadNetwork getNetwork();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.DemandExchangeRoot#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(RoadNetwork value);

} // DemandExchangeRoot
