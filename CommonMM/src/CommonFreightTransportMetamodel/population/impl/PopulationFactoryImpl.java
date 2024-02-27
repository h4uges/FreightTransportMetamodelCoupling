/**
 */
package CommonFreightTransportMetamodel.population.impl;

import CommonFreightTransportMetamodel.population.*;

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
public class PopulationFactoryImpl extends EFactoryImpl implements PopulationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PopulationFactory init() {
		try {
			PopulationFactory thePopulationFactory = (PopulationFactory)EPackage.Registry.INSTANCE.getEFactory(PopulationPackage.eNS_URI);
			if (thePopulationFactory != null) {
				return thePopulationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PopulationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationFactoryImpl() {
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
			case PopulationPackage.BUSINESS_BRANCH: return createBusinessBranch();
			case PopulationPackage.PERSON: return createPerson();
			case PopulationPackage.POPULATION: return createPopulation();
			case PopulationPackage.BUSINESS: return createBusiness();
			case PopulationPackage.HOUSEHOLD: return createHousehold();
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
	public PopulationPackage getPopulationPackage() {
		return (PopulationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PopulationPackage getPackage() {
		return PopulationPackage.eINSTANCE;
	}

} //PopulationFactoryImpl
