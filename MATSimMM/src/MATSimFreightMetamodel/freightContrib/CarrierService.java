/**
 */
package MATSimFreightMetamodel.freightContrib;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.matsim.core.network.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierService#getName <em>Name</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierService#getServiceDuration <em>Service Duration</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierService#getTimeWindow <em>Time Window</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierService#getCapacityDemand <em>Capacity Demand</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierService#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierService()
 * @model
 * @generated
 */
public interface CarrierService extends Entity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierService_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Duration</em>' attribute.
	 * @see #setServiceDuration(double)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierService_ServiceDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getServiceDuration();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierService#getServiceDuration <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Duration</em>' attribute.
	 * @see #getServiceDuration()
	 * @generated
	 */
	void setServiceDuration(double value);

	/**
	 * Returns the value of the '<em><b>Time Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Window</em>' containment reference.
	 * @see #setTimeWindow(TimeWindow)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierService_TimeWindow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeWindow getTimeWindow();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierService#getTimeWindow <em>Time Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Window</em>' containment reference.
	 * @see #getTimeWindow()
	 * @generated
	 */
	void setTimeWindow(TimeWindow value);

	/**
	 * Returns the value of the '<em><b>Capacity Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Demand</em>' attribute.
	 * @see #setCapacityDemand(int)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierService_CapacityDemand()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getCapacityDemand();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierService#getCapacityDemand <em>Capacity Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Demand</em>' attribute.
	 * @see #getCapacityDemand()
	 * @generated
	 */
	void setCapacityDemand(int value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Link)
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierService_Location()
	 * @model required="true"
	 * @generated
	 */
	Link getLocation();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightContrib.CarrierService#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Link value);

} // CarrierService
