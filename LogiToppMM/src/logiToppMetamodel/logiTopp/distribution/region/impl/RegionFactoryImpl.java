/**
 */
package logiToppMetamodel.logiTopp.distribution.region.impl;

import logiToppMetamodel.logiTopp.distribution.region.*;

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
public class RegionFactoryImpl extends EFactoryImpl implements RegionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RegionFactory init() {
		try {
			RegionFactory theRegionFactory = (RegionFactory)EPackage.Registry.INSTANCE.getEFactory(RegionPackage.eNS_URI);
			if (theRegionFactory != null) {
				return theRegionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RegionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionFactoryImpl() {
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
			case RegionPackage.REGIONAL_REACH: return createRegionalReach();
			case RegionPackage.SERVICE_AREA: return createServiceArea();
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
	public RegionalReach createRegionalReach() {
		RegionalReachImpl regionalReach = new RegionalReachImpl();
		return regionalReach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceArea createServiceArea() {
		ServiceAreaImpl serviceArea = new ServiceAreaImpl();
		return serviceArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionPackage getRegionPackage() {
		return (RegionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RegionPackage getPackage() {
		return RegionPackage.eINSTANCE;
	}

} //RegionFactoryImpl
