/**
 */
package logiToppMetamodel.logiTopp.distribution.chains;

import logiToppMetamodel.logiTopp.distribution.DistributionCenter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.TransportChain#getHubs <em>Hubs</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.TransportChain#isDeliveryDirection <em>Delivery Direction</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getTransportChain()
 * @model
 * @generated
 */
public interface TransportChain extends EObject {
	/**
	 * Returns the value of the '<em><b>Hubs</b></em>' reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.DistributionCenter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hubs</em>' reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getTransportChain_Hubs()
	 * @model
	 * @generated
	 */
	EList<DistributionCenter> getHubs();

	/**
	 * Returns the value of the '<em><b>Delivery Direction</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Direction</em>' attribute.
	 * @see #setDeliveryDirection(boolean)
	 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getTransportChain_DeliveryDirection()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isDeliveryDirection();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.chains.TransportChain#isDeliveryDirection <em>Delivery Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Direction</em>' attribute.
	 * @see #isDeliveryDirection()
	 * @generated
	 */
	void setDeliveryDirection(boolean value);

} // TransportChain
