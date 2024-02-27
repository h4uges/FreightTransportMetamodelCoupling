/**
 */
package MATSimFreightMetamodel.impl;

import MATSimFreightMetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MATSimFreightMetamodelFactoryImpl extends EFactoryImpl implements MATSimFreightMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MATSimFreightMetamodelFactory init() {
		try {
			MATSimFreightMetamodelFactory theMATSimFreightMetamodelFactory = (MATSimFreightMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(MATSimFreightMetamodelPackage.eNS_URI);
			if (theMATSimFreightMetamodelFactory != null) {
				return theMATSimFreightMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MATSimFreightMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MATSimFreightMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MATSimFreightMetamodelPackage.DATA_EXCHANGE_ROOT: return createDataExchangeRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataExchangeRoot createDataExchangeRoot() {
		DataExchangeRootImpl dataExchangeRoot = new DataExchangeRootImpl();
		return dataExchangeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MATSimFreightMetamodelPackage getMATSimFreightMetamodelPackage() {
		return (MATSimFreightMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MATSimFreightMetamodelPackage getPackage() {
		return MATSimFreightMetamodelPackage.eINSTANCE;
	}

} //MATSimFreightMetamodelFactoryImpl
