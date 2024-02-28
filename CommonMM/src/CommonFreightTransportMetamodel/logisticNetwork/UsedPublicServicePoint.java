/**
 */
package CommonFreightTransportMetamodel.logisticNetwork;

import CommonFreightTransportMetamodel.utils.Dimension;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Used Public Service Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint#getPublicServicePoint <em>Public Service Point</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint#getGrantedStorageCapacity <em>Granted Storage Capacity</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getUsedPublicServicePoint()
 * @model
 * @generated
 */
public interface UsedPublicServicePoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Public Service Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Service Point</em>' reference.
	 * @see #setPublicServicePoint(PublicServicePoint)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getUsedPublicServicePoint_PublicServicePoint()
	 * @model required="true"
	 * @generated
	 */
	PublicServicePoint getPublicServicePoint();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint#getPublicServicePoint <em>Public Service Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Service Point</em>' reference.
	 * @see #getPublicServicePoint()
	 * @generated
	 */
	void setPublicServicePoint(PublicServicePoint value);

	/**
	 * Returns the value of the '<em><b>Granted Storage Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Granted Storage Capacity</em>' containment reference.
	 * @see #setGrantedStorageCapacity(Dimension)
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getUsedPublicServicePoint_GrantedStorageCapacity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dimension getGrantedStorageCapacity();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint#getGrantedStorageCapacity <em>Granted Storage Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Granted Storage Capacity</em>' containment reference.
	 * @see #getGrantedStorageCapacity()
	 * @generated
	 */
	void setGrantedStorageCapacity(Dimension value);

} // UsedPublicServicePoint
