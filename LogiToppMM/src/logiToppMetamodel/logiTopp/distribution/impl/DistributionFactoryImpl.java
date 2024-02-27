/**
 */
package logiToppMetamodel.logiTopp.distribution.impl;

import logiToppMetamodel.logiTopp.distribution.*;

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
public class DistributionFactoryImpl extends EFactoryImpl implements DistributionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DistributionFactory init() {
		try {
			DistributionFactory theDistributionFactory = (DistributionFactory)EPackage.Registry.INSTANCE.getEFactory(DistributionPackage.eNS_URI);
			if (theDistributionFactory != null) {
				return theDistributionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DistributionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionFactoryImpl() {
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
			case DistributionPackage.CEP_SERVICE_PROVIDER: return createCEPServiceProvider();
			case DistributionPackage.DISTRIBUTION_CENTER: return createDistributionCenter();
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
	public CEPServiceProvider createCEPServiceProvider() {
		CEPServiceProviderImpl cepServiceProvider = new CEPServiceProviderImpl();
		return cepServiceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistributionCenter createDistributionCenter() {
		DistributionCenterImpl distributionCenter = new DistributionCenterImpl();
		return distributionCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistributionPackage getDistributionPackage() {
		return (DistributionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DistributionPackage getPackage() {
		return DistributionPackage.eINSTANCE;
	}

} //DistributionFactoryImpl
