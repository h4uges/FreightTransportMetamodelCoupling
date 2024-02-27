/**
 */
package CommonFreightTransportMetamodel.coupling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.coupling.CouplingPackage
 * @generated
 */
public interface CouplingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CouplingFactory eINSTANCE = CommonFreightTransportMetamodel.coupling.impl.CouplingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Common Freight Transport Metamodel Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Freight Transport Metamodel Root</em>'.
	 * @generated
	 */
	CommonFreightTransportMetamodelRoot createCommonFreightTransportMetamodelRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CouplingPackage getCouplingPackage();

} //CouplingFactory
