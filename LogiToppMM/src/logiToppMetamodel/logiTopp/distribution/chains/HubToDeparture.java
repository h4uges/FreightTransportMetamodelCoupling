/**
 */
package logiToppMetamodel.logiTopp.distribution.chains;

import logiToppMetamodel.base.Time;

import logiToppMetamodel.logiTopp.distribution.DistributionCenter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hub To Departure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture#getHub <em>Hub</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture#getDepature <em>Depature</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getHubToDeparture()
 * @model
 * @generated
 */
public interface HubToDeparture extends EObject {
	/**
	 * Returns the value of the '<em><b>Hub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hub</em>' reference.
	 * @see #setHub(DistributionCenter)
	 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getHubToDeparture_Hub()
	 * @model required="true"
	 * @generated
	 */
	DistributionCenter getHub();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture#getHub <em>Hub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hub</em>' reference.
	 * @see #getHub()
	 * @generated
	 */
	void setHub(DistributionCenter value);

	/**
	 * Returns the value of the '<em><b>Depature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depature</em>' reference.
	 * @see #setDepature(Time)
	 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getHubToDeparture_Depature()
	 * @model required="true"
	 * @generated
	 */
	Time getDepature();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture#getDepature <em>Depature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depature</em>' reference.
	 * @see #getDepature()
	 * @generated
	 */
	void setDepature(Time value);

} // HubToDeparture
