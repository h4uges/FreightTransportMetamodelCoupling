/**
 */
package MATSimFreightMetamodel.matsim;

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
 * @see MATSimFreightMetamodel.matsim.MatsimFactory
 * @model kind="package"
 * @generated
 */
public interface MatsimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "matsim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/MATSimFreightMetamodel/matsim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "matsim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatsimPackage eINSTANCE = MATSimFreightMetamodel.matsim.impl.MatsimPackageImpl.init();

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.TransportMode <em>Transport Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.TransportMode
	 * @see MATSimFreightMetamodel.matsim.impl.MatsimPackageImpl#getTransportMode()
	 * @generated
	 */
	int TRANSPORT_MODE = 0;


	/**
	 * Returns the meta object for enum '{@link MATSimFreightMetamodel.matsim.TransportMode <em>Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transport Mode</em>'.
	 * @see MATSimFreightMetamodel.matsim.TransportMode
	 * @generated
	 */
	EEnum getTransportMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MatsimFactory getMatsimFactory();

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
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.TransportMode <em>Transport Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.TransportMode
		 * @see MATSimFreightMetamodel.matsim.impl.MatsimPackageImpl#getTransportMode()
		 * @generated
		 */
		EEnum TRANSPORT_MODE = eINSTANCE.getTransportMode();

	}

} //MatsimPackage
