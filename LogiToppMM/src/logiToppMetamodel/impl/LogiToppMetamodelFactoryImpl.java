/**
 */
package logiToppMetamodel.impl;

import logiToppMetamodel.*;

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
public class LogiToppMetamodelFactoryImpl extends EFactoryImpl implements LogiToppMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogiToppMetamodelFactory init() {
		try {
			LogiToppMetamodelFactory theLogiToppMetamodelFactory = (LogiToppMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(LogiToppMetamodelPackage.eNS_URI);
			if (theLogiToppMetamodelFactory != null) {
				return theLogiToppMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogiToppMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogiToppMetamodelFactoryImpl() {
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
			case LogiToppMetamodelPackage.DEMAND: return createDemand();
			case LogiToppMetamodelPackage.POPULATION: return createPopulation();
			case LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE: return createTransportInfrastructure();
			case LogiToppMetamodelPackage.SOLUTION: return createSolution();
			case LogiToppMetamodelPackage.DEMAND_EXCHANGE_ROOT: return createDemandExchangeRoot();
			case LogiToppMetamodelPackage.SOLUTION_EXCHANGE_ROOT: return createSolutionExchangeRoot();
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
	public Demand createDemand() {
		DemandImpl demand = new DemandImpl();
		return demand;
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
	public TransportInfrastructure createTransportInfrastructure() {
		TransportInfrastructureImpl transportInfrastructure = new TransportInfrastructureImpl();
		return transportInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Solution createSolution() {
		SolutionImpl solution = new SolutionImpl();
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DemandExchangeRoot createDemandExchangeRoot() {
		DemandExchangeRootImpl demandExchangeRoot = new DemandExchangeRootImpl();
		return demandExchangeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolutionExchangeRoot createSolutionExchangeRoot() {
		SolutionExchangeRootImpl solutionExchangeRoot = new SolutionExchangeRootImpl();
		return solutionExchangeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogiToppMetamodelPackage getLogiToppMetamodelPackage() {
		return (LogiToppMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogiToppMetamodelPackage getPackage() {
		return LogiToppMetamodelPackage.eINSTANCE;
	}

} //LogiToppMetamodelFactoryImpl
