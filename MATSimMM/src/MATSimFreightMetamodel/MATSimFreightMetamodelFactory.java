/**
 */
package MATSimFreightMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.MATSimFreightMetamodelPackage
 * @generated
 */
public interface MATSimFreightMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MATSimFreightMetamodelFactory eINSTANCE = MATSimFreightMetamodel.impl.MATSimFreightMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Exchange Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Exchange Root</em>'.
	 * @generated
	 */
	DataExchangeRoot createDataExchangeRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MATSimFreightMetamodelPackage getMATSimFreightMetamodelPackage();

} //MATSimFreightMetamodelFactory
