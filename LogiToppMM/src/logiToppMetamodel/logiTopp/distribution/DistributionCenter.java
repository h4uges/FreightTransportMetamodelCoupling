/**
 */
package logiToppMetamodel.logiTopp.distribution;

import logiToppMetamodel.base.NamedEntity;

import logiToppMetamodel.logiTopp.ParcelConsumer;
import logiToppMetamodel.logiTopp.ParcelProducer;

import logiToppMetamodel.logiTopp.distribution.fleet.Fleet;

import logiToppMetamodel.logiTopp.distribution.region.RegionalReach;

import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getZone <em>Zone</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getLocation <em>Location</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getFleet <em>Fleet</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getRegionalStructure <em>Regional Structure</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getCEPSP <em>CEPSP</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.DistributionPackage#getDistributionCenter()
 * @model
 * @generated
 */
public interface DistributionCenter extends NamedEntity, ParcelProducer, ParcelConsumer {
	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference.
	 * @see #setZone(Zone)
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionPackage#getDistributionCenter_Zone()
	 * @model required="true"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getZone <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(Zone value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionPackage#getDistributionCenter_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Attempts</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempts</em>' attribute.
	 * @see #setAttempts(int)
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionPackage#getDistributionCenter_Attempts()
	 * @model default="1" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getAttempts();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getAttempts <em>Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attempts</em>' attribute.
	 * @see #getAttempts()
	 * @generated
	 */
	void setAttempts(int value);

	/**
	 * Returns the value of the '<em><b>Fleet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fleet</em>' containment reference.
	 * @see #setFleet(Fleet)
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionPackage#getDistributionCenter_Fleet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Fleet getFleet();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getFleet <em>Fleet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fleet</em>' containment reference.
	 * @see #getFleet()
	 * @generated
	 */
	void setFleet(Fleet value);

	/**
	 * Returns the value of the '<em><b>Regional Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regional Structure</em>' containment reference.
	 * @see #setRegionalStructure(RegionalReach)
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionPackage#getDistributionCenter_RegionalStructure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RegionalReach getRegionalStructure();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getRegionalStructure <em>Regional Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regional Structure</em>' containment reference.
	 * @see #getRegionalStructure()
	 * @generated
	 */
	void setRegionalStructure(RegionalReach value);

	/**
	 * Returns the value of the '<em><b>CEPSP</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logiToppMetamodel.logiTopp.distribution.CEPServiceProvider#getDistributionCenters <em>Distribution Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CEPSP</em>' container reference.
	 * @see #setCEPSP(CEPServiceProvider)
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionPackage#getDistributionCenter_CEPSP()
	 * @see logiToppMetamodel.logiTopp.distribution.CEPServiceProvider#getDistributionCenters
	 * @model opposite="distributionCenters" required="true" transient="false"
	 * @generated
	 */
	CEPServiceProvider getCEPSP();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getCEPSP <em>CEPSP</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CEPSP</em>' container reference.
	 * @see #getCEPSP()
	 * @generated
	 */
	void setCEPSP(CEPServiceProvider value);

} // DistributionCenter
