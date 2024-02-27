/**
 */
package MATSimFreightMetamodel.freightContrib;

import MATSimFreightMetamodel.base.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.Carrier#getPlan <em>Plan</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.Carrier#getServices <em>Services</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.Carrier#getShipments <em>Shipments</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.Carrier#getCarrierCapabilities <em>Carrier Capabilities</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrier()
 * @model
 * @generated
 */
public interface Carrier extends Entity {
	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(CarrierPlan)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrier_Plan()
	 * @model containment="true"
	 * @generated
	 */
	CarrierPlan getPlan();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.Carrier#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(CarrierPlan value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightContrib.CarrierService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrier_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarrierService> getServices();

	/**
	 * Returns the value of the '<em><b>Shipments</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightContrib.CarrierShipment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipments</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrier_Shipments()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarrierShipment> getShipments();

	/**
	 * Returns the value of the '<em><b>Carrier Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Capabilities</em>' containment reference.
	 * @see #setCarrierCapabilities(CarrierCapabilities)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrier_CarrierCapabilities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CarrierCapabilities getCarrierCapabilities();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.Carrier#getCarrierCapabilities <em>Carrier Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Capabilities</em>' containment reference.
	 * @see #getCarrierCapabilities()
	 * @generated
	 */
	void setCarrierCapabilities(CarrierCapabilities value);

} // Carrier
