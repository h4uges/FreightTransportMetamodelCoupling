/**
 */
package MATSimFreightMetamodel.freightReceiver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reorder Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReorderPolicy()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ReorderPolicy extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPolicyName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double calculateOrderQuantity();

} // ReorderPolicy
