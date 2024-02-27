/**
 */
package logiToppMetamodel.logiTopp.business;

import logiToppMetamodel.base.NamedEntity;

import logiToppMetamodel.logiTopp.ParcelConsumer;
import logiToppMetamodel.logiTopp.ParcelProducer;

import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;

import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.business.Business#getBranch <em>Branch</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.Business#getBuildingType <em>Building Type</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.Business#getEmplyees <em>Emplyees</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.Business#getArea <em>Area</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.Business#getZone <em>Zone</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.Business#getLocation <em>Location</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.Business#getDeliveryPartners <em>Delivery Partners</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.Business#getPickUpPartners <em>Pick Up Partners</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.business.Business#getOpeningHours <em>Opening Hours</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getBusiness()
 * @model
 * @generated
 */
public interface Business extends NamedEntity, ParcelProducer, ParcelConsumer {
	/**
	 * Returns the value of the '<em><b>Branch</b></em>' attribute.
	 * The default value is <code>"A"</code>.
	 * The literals are from the enumeration {@link logiToppMetamodel.logiTopp.business.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.business.Branch
	 * @see #setBranch(Branch)
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getBusiness_Branch()
	 * @model default="A" required="true"
	 * @generated
	 */
	Branch getBranch();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.business.Business#getBranch <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.business.Branch
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(Branch value);

	/**
	 * Returns the value of the '<em><b>Building Type</b></em>' attribute.
	 * The default value is <code>"OTHER"</code>.
	 * The literals are from the enumeration {@link logiToppMetamodel.logiTopp.business.BuildingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Type</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.business.BuildingType
	 * @see #setBuildingType(BuildingType)
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getBusiness_BuildingType()
	 * @model default="OTHER" required="true"
	 * @generated
	 */
	BuildingType getBuildingType();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.business.Business#getBuildingType <em>Building Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Type</em>' attribute.
	 * @see logiToppMetamodel.logiTopp.business.BuildingType
	 * @see #getBuildingType()
	 * @generated
	 */
	void setBuildingType(BuildingType value);

	/**
	 * Returns the value of the '<em><b>Emplyees</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emplyees</em>' attribute.
	 * @see #setEmplyees(int)
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getBusiness_Emplyees()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getEmplyees();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.business.Business#getEmplyees <em>Emplyees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emplyees</em>' attribute.
	 * @see #getEmplyees()
	 * @generated
	 */
	void setEmplyees(int value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(double)
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getBusiness_Area()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getArea();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.business.Business#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(double value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference.
	 * @see #setZone(Zone)
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getBusiness_Zone()
	 * @model required="true"
	 * @generated
	 */
	Zone getZone();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.business.Business#getZone <em>Zone</em>}' reference.
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
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getBusiness_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.business.Business#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Delivery Partners</b></em>' reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.CEPServiceProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Partners</em>' reference list.
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getBusiness_DeliveryPartners()
	 * @model
	 * @generated
	 */
	EList<CEPServiceProvider> getDeliveryPartners();

	/**
	 * Returns the value of the '<em><b>Pick Up Partners</b></em>' reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.CEPServiceProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick Up Partners</em>' reference list.
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getBusiness_PickUpPartners()
	 * @model
	 * @generated
	 */
	EList<CEPServiceProvider> getPickUpPartners();

	/**
	 * Returns the value of the '<em><b>Opening Hours</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.business.OpeningHour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Hours</em>' containment reference list.
	 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getBusiness_OpeningHours()
	 * @model containment="true"
	 * @generated
	 */
	EList<OpeningHour> getOpeningHours();

} // Business
