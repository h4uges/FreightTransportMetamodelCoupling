/**
 */
package MATSimFreightMetamodel;

import MATSimFreightMetamodel.freightContrib.Carrier;

import MATSimFreightMetamodel.matsim.core.network.Network;

import MATSimFreightMetamodel.matsim.households.Population;

import MATSimFreightMetamodel.matsim.vehicles.VehicleTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Exchange Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.DataExchangeRoot#getCarriers <em>Carriers</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.DataExchangeRoot#getNetwork <em>Network</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.DataExchangeRoot#getVehicelTypes <em>Vehicel Types</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.DataExchangeRoot#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.MATSimFreightMetamodelPackage#getDataExchangeRoot()
 * @model
 * @generated
 */
public interface DataExchangeRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Carriers</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightContrib.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carriers</em>' containment reference list.
	 * @see MATSimFreightMetamodel.MATSimFreightMetamodelPackage#getDataExchangeRoot_Carriers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Carrier> getCarriers();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(Network)
	 * @see MATSimFreightMetamodel.MATSimFreightMetamodelPackage#getDataExchangeRoot_Network()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.DataExchangeRoot#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Vehicel Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicel Types</em>' containment reference.
	 * @see #setVehicelTypes(VehicleTypes)
	 * @see MATSimFreightMetamodel.MATSimFreightMetamodelPackage#getDataExchangeRoot_VehicelTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VehicleTypes getVehicelTypes();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.DataExchangeRoot#getVehicelTypes <em>Vehicel Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicel Types</em>' containment reference.
	 * @see #getVehicelTypes()
	 * @generated
	 */
	void setVehicelTypes(VehicleTypes value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference.
	 * @see #setPopulation(Population)
	 * @see MATSimFreightMetamodel.MATSimFreightMetamodelPackage#getDataExchangeRoot_Population()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Population getPopulation();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.DataExchangeRoot#getPopulation <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' containment reference.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(Population value);

} // DataExchangeRoot
