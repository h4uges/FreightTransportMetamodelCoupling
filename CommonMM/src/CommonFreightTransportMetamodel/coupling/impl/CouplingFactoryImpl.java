/**
 */
package CommonFreightTransportMetamodel.coupling.impl;

import CommonFreightTransportMetamodel.coupling.*;

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
public class CouplingFactoryImpl extends EFactoryImpl implements CouplingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CouplingFactory init() {
		try {
			CouplingFactory theCouplingFactory = (CouplingFactory)EPackage.Registry.INSTANCE.getEFactory(CouplingPackage.eNS_URI);
			if (theCouplingFactory != null) {
				return theCouplingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CouplingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CouplingFactoryImpl() {
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
			case CouplingPackage.COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT: return createCommonFreightTransportMetamodelRoot();
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
	public CouplingPackage getCouplingPackage() {
		return (CouplingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CouplingPackage getPackage() {
		return CouplingPackage.eINSTANCE;
	}

} //CouplingFactoryImpl
