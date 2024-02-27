/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.logisticDemand.*;

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
public class LogisticDemandFactoryImpl extends EFactoryImpl implements LogisticDemandFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogisticDemandFactory init() {
		try {
			LogisticDemandFactory theLogisticDemandFactory = (LogisticDemandFactory)EPackage.Registry.INSTANCE.getEFactory(LogisticDemandPackage.eNS_URI);
			if (theLogisticDemandFactory != null) {
				return theLogisticDemandFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogisticDemandFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticDemandFactoryImpl() {
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
			case LogisticDemandPackage.DEMAND: return createDemand();
			case LogisticDemandPackage.OUTSIDE_TO_INSIDE_SHIPMENT: return createOutsideToInsideShipment();
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT: return createInsideToInsideShipment();
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT: return createInsideToOutsideShipment();
			case LogisticDemandPackage.SPLITTED_SHIPMENT: return createSplittedShipment();
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
	public OutsideToInsideShipment createOutsideToInsideShipment() {
		OutsideToInsideShipmentImpl outsideToInsideShipment = new OutsideToInsideShipmentImpl();
		return outsideToInsideShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsideToInsideShipment createInsideToInsideShipment() {
		InsideToInsideShipmentImpl insideToInsideShipment = new InsideToInsideShipmentImpl();
		return insideToInsideShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsideToOutsideShipment createInsideToOutsideShipment() {
		InsideToOutsideShipmentImpl insideToOutsideShipment = new InsideToOutsideShipmentImpl();
		return insideToOutsideShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SplittedShipment createSplittedShipment() {
		SplittedShipmentImpl splittedShipment = new SplittedShipmentImpl();
		return splittedShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticDemandPackage getLogisticDemandPackage() {
		return (LogisticDemandPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogisticDemandPackage getPackage() {
		return LogisticDemandPackage.eINSTANCE;
	}

} //LogisticDemandFactoryImpl
