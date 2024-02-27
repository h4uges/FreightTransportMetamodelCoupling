/**
 */
package logiToppMetamodel.logiTopp.util;

import logiToppMetamodel.logiTopp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.LogiToppPackage
 * @generated
 */
public class LogiToppAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogiToppPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogiToppAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogiToppPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogiToppSwitch<Adapter> modelSwitch =
		new LogiToppSwitch<Adapter>() {
			@Override
			public Adapter caseParcelAgent(ParcelAgent object) {
				return createParcelAgentAdapter();
			}
			@Override
			public Adapter caseParcelProducer(ParcelProducer object) {
				return createParcelProducerAdapter();
			}
			@Override
			public Adapter caseParcelConsumer(ParcelConsumer object) {
				return createParcelConsumerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link logiToppMetamodel.logiTopp.ParcelAgent <em>Parcel Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logiToppMetamodel.logiTopp.ParcelAgent
	 * @generated
	 */
	public Adapter createParcelAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logiToppMetamodel.logiTopp.ParcelProducer <em>Parcel Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logiToppMetamodel.logiTopp.ParcelProducer
	 * @generated
	 */
	public Adapter createParcelProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logiToppMetamodel.logiTopp.ParcelConsumer <em>Parcel Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logiToppMetamodel.logiTopp.ParcelConsumer
	 * @generated
	 */
	public Adapter createParcelConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogiToppAdapterFactory
