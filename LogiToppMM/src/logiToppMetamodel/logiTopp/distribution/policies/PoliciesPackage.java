/**
 */
package logiToppMetamodel.logiTopp.distribution.policies;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.policies.PoliciesFactory
 * @model kind="package"
 * @generated
 */
public interface PoliciesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "policies";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/logiTopp/distribution/policies";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "policies";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PoliciesPackage eINSTANCE = logiToppMetamodel.logiTopp.distribution.policies.impl.PoliciesPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.policies.RecipientType <em>Recipient Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.policies.RecipientType
	 * @see logiToppMetamodel.logiTopp.distribution.policies.impl.PoliciesPackageImpl#getRecipientType()
	 * @generated
	 */
	int RECIPIENT_TYPE = 0;


	/**
	 * Returns the meta object for enum '{@link logiToppMetamodel.logiTopp.distribution.policies.RecipientType <em>Recipient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recipient Type</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.policies.RecipientType
	 * @generated
	 */
	EEnum getRecipientType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PoliciesFactory getPoliciesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.policies.RecipientType <em>Recipient Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.policies.RecipientType
		 * @see logiToppMetamodel.logiTopp.distribution.policies.impl.PoliciesPackageImpl#getRecipientType()
		 * @generated
		 */
		EEnum RECIPIENT_TYPE = eINSTANCE.getRecipientType();

	}

} //PoliciesPackage
