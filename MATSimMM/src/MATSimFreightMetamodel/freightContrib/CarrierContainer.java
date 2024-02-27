/**
 */
package MATSimFreightMetamodel.freightContrib;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.CarrierContainer#getCarriers <em>Carriers</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierContainer()
 * @model
 * @generated
 */
public interface CarrierContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Carriers</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightContrib.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carriers</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage#getCarrierContainer_Carriers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Carrier> getCarriers();

} // CarrierContainer
