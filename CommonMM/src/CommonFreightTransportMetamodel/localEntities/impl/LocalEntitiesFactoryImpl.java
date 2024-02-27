/**
 */
package CommonFreightTransportMetamodel.localEntities.impl;

import CommonFreightTransportMetamodel.localEntities.*;

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
public class LocalEntitiesFactoryImpl extends EFactoryImpl implements LocalEntitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocalEntitiesFactory init() {
		try {
			LocalEntitiesFactory theLocalEntitiesFactory = (LocalEntitiesFactory)EPackage.Registry.INSTANCE.getEFactory(LocalEntitiesPackage.eNS_URI);
			if (theLocalEntitiesFactory != null) {
				return theLocalEntitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LocalEntitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalEntitiesFactoryImpl() {
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
			case LocalEntitiesPackage.BUSINESS_BRANCH: return createBusinessBranch();
			case LocalEntitiesPackage.PERSON: return createPerson();
			case LocalEntitiesPackage.POPULATION: return createPopulation();
			case LocalEntitiesPackage.BUSINESS: return createBusiness();
			case LocalEntitiesPackage.HOUSEHOLD: return createHousehold();
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
	public BusinessBranch createBusinessBranch() {
		BusinessBranchImpl businessBranch = new BusinessBranchImpl();
		return businessBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Population createPopulation() {
		PopulationImpl population = new PopulationImpl();
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Business createBusiness() {
		BusinessImpl business = new BusinessImpl();
		return business;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Household createHousehold() {
		HouseholdImpl household = new HouseholdImpl();
		return household;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalEntitiesPackage getLocalEntitiesPackage() {
		return (LocalEntitiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LocalEntitiesPackage getPackage() {
		return LocalEntitiesPackage.eINSTANCE;
	}

} //LocalEntitiesFactoryImpl
