/**
 */
package logiToppMetamodel.logiTopp.distribution.chains;

import logiToppMetamodel.logiTopp.distribution.DistributionCenter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hub To Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDuration#getHub <em>Hub</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDuration#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getHubToDuration()
 * @model
 * @generated
 */
public interface HubToDuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Hub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hub</em>' reference.
	 * @see #setHub(DistributionCenter)
	 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getHubToDuration_Hub()
	 * @model required="true"
	 * @generated
	 */
	DistributionCenter getHub();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDuration#getHub <em>Hub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hub</em>' reference.
	 * @see #getHub()
	 * @generated
	 */
	void setHub(DistributionCenter value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getHubToDuration_Duration()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDuration#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // HubToDuration
