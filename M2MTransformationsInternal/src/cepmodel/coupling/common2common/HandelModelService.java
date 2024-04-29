package cepmodel.coupling.common2common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;
import CommonFreightTransportMetamodel.coupling.CouplingPackage;
import MATSimFreightMetamodel.dataExchange.DataExchangeRoot;
import logiToppMetamodel.dataExchange.DataExchangePackage;

public class HandelModelService {
	
	private HandelModelService() {
		
	}
	
	public static DataExchangeRoot loadMATSimModel(String sourceModelPath) {
		EPackage.Registry.INSTANCE.put(MATSimFreightMetamodel.dataExchange.DataExchangePackage.eNS_URI, MATSimFreightMetamodel.dataExchange.DataExchangePackage.eINSTANCE);
		
		// Load the source model
		ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("dataExchange", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createFileURI(sourceModelPath), true);

		return (DataExchangeRoot) resource.getContents().stream()
				.filter(elem -> DataExchangeRoot.class.isInstance(elem)).findFirst().get();
	}

	public static CommonFreightTransportMetamodelRoot loadCommonModelRoot(String sourceModelPath) {
		EPackage.Registry.INSTANCE.put(CouplingPackage.eNS_URI, CouplingPackage.eINSTANCE);
		
		// Load the source model
		ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("coupling", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createFileURI(sourceModelPath), true);

		return (CommonFreightTransportMetamodelRoot) resource.getContents().stream()
				.filter(elem -> CommonFreightTransportMetamodelRoot.class.isInstance(elem)).findFirst().get();
	}
	
	public static void saveModel(EObject rootObject, String targetModelPath) {
		CouplingPackage.eINSTANCE.eClass();
		DataExchangePackage.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		URI targetModelURI = URI.createFileURI(targetModelPath);
		Resource targetResource = resourceSet.createResource(targetModelURI);
		targetResource.getContents().add(rootObject);

		try {
			targetResource.save(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
