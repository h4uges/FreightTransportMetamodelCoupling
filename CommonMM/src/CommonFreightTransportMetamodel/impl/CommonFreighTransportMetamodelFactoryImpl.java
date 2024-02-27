/**
 */
package CommonFreightTransportMetamodel.impl;

import CommonFreightTransportMetamodel.*;

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
public class CommonFreighTransportMetamodelFactoryImpl extends EFactoryImpl implements CommonFreighTransportMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonFreighTransportMetamodelFactory init() {
		try {
			CommonFreighTransportMetamodelFactory theCommonFreighTransportMetamodelFactory = (CommonFreighTransportMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(CommonFreighTransportMetamodelPackage.eNS_URI);
			if (theCommonFreighTransportMetamodelFactory != null) {
				return theCommonFreighTransportMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonFreighTransportMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFreighTransportMetamodelFactoryImpl() {
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
			case CommonFreighTransportMetamodelPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT: return createCommonFreightTransportMetamodelRoot();
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
	public CommonFreightTransportMetamodelRoot createCommonFreightTransportMetamodelRoot() {
		CommonFreightTransportMetamodelRootImpl commonFreightTransportMetamodelRoot = new CommonFreightTransportMetamodelRootImpl();
		return commonFreightTransportMetamodelRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonFreighTransportMetamodelPackage getCommonFreighTransportMetamodelPackage() {
		return (CommonFreighTransportMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonFreighTransportMetamodelPackage getPackage() {
		return CommonFreighTransportMetamodelPackage.eINSTANCE;
	}

} //CommonFreighTransportMetamodelFactoryImpl
