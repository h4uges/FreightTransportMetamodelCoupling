/**
 */
package MATSimFreightMetamodel.matsim.vehicles;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.matsim.TransportMode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getWidth <em>Width</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getMaxVelocity <em>Max Velocity</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getLength <em>Length</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getPcuEquivalents <em>Pcu Equivalents</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getFlowEfficiencyFactor <em>Flow Efficiency Factor</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getDescription <em>Description</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getNetworkMode <em>Network Mode</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleType()
 * @model
 * @generated
 */
public interface VehicleType extends Entity {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleType_Width()
	 * @model default="1" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Max Velocity</b></em>' attribute.
	 * The default value is <code>"9999"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Velocity</em>' attribute.
	 * @see #setMaxVelocity(double)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleType_MaxVelocity()
	 * @model default="9999" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getMaxVelocity();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getMaxVelocity <em>Max Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Velocity</em>' attribute.
	 * @see #getMaxVelocity()
	 * @generated
	 */
	void setMaxVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"7.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleType_Length()
	 * @model default="7.5" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Pcu Equivalents</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcu Equivalents</em>' attribute.
	 * @see #setPcuEquivalents(double)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleType_PcuEquivalents()
	 * @model default="1.0" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getPcuEquivalents();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getPcuEquivalents <em>Pcu Equivalents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcu Equivalents</em>' attribute.
	 * @see #getPcuEquivalents()
	 * @generated
	 */
	void setPcuEquivalents(double value);

	/**
	 * Returns the value of the '<em><b>Flow Efficiency Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Efficiency Factor</em>' attribute.
	 * @see #setFlowEfficiencyFactor(double)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleType_FlowEfficiencyFactor()
	 * @model default="1.0" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getFlowEfficiencyFactor();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getFlowEfficiencyFactor <em>Flow Efficiency Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Efficiency Factor</em>' attribute.
	 * @see #getFlowEfficiencyFactor()
	 * @generated
	 */
	void setFlowEfficiencyFactor(double value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Network Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link MATSimFreightMetamodel.matsim.TransportMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Mode</em>' attribute.
	 * @see MATSimFreightMetamodel.matsim.TransportMode
	 * @see #setNetworkMode(TransportMode)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleType_NetworkMode()
	 * @model required="true"
	 * @generated
	 */
	TransportMode getNetworkMode();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getNetworkMode <em>Network Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Mode</em>' attribute.
	 * @see MATSimFreightMetamodel.matsim.TransportMode
	 * @see #getNetworkMode()
	 * @generated
	 */
	void setNetworkMode(TransportMode value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference.
	 * @see #setCapacity(VehicleCapacity)
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage#getVehicleType_Capacity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VehicleCapacity getCapacity();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getCapacity <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' containment reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(VehicleCapacity value);

} // VehicleType
