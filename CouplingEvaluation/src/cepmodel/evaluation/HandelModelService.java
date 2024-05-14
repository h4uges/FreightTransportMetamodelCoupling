package cepmodel.evaluation;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import MATSimFreightMetamodel.dataExchange.DataExchangeRoot;
import logiToppMetamodel.dataExchange.SolutionExchangeRoot;

/*
 * service for loading logiTopp and MATSim model instances from xmi files and extracting the root object
 */
public class HandelModelService {

	private HandelModelService() {
	}

	public static DataExchangeRoot loadMATSimModel(String sourceModelPath) {
		EPackage.Registry.INSTANCE.put(MATSimFreightMetamodel.dataExchange.DataExchangePackage.eNS_URI,
				MATSimFreightMetamodel.dataExchange.DataExchangePackage.eINSTANCE);

		// Load the MATSim model
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Resource resource = resourceSet.getResource(URI.createFileURI(sourceModelPath), true);

		// find and return root object
		Optional<EObject> optionalRoot = resource.getContents().stream().filter(DataExchangeRoot.class::isInstance)
				.findFirst();
		if (optionalRoot.isEmpty()) {
			throw new IllegalArgumentException("could not find MATSim root in model");
		}
		return (DataExchangeRoot) optionalRoot.get();
	}

	public static SolutionExchangeRoot loadLogiToppModel(String sourceModelPath) {
		EPackage.Registry.INSTANCE.put(logiToppMetamodel.dataExchange.DataExchangePackage.eNS_URI,
				logiToppMetamodel.dataExchange.DataExchangePackage.eINSTANCE);

		// Load the LogiTopp model
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createFileURI(sourceModelPath), true);

		// find and return root object for logistic solution exchange point
		Optional<EObject> optionalRoot = resource.getContents().stream().filter(SolutionExchangeRoot.class::isInstance)
				.findFirst();
		if (optionalRoot.isEmpty()) {
			throw new IllegalArgumentException("could not find LogiTopp solution exchange root in model");
		}
		return (SolutionExchangeRoot) optionalRoot.get();
	}
}
