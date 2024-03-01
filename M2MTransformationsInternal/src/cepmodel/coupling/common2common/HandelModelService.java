package cepmodel.coupling.common2common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;
import CommonFreightTransportMetamodel.coupling.CouplingPackage;
import logiToppMetamodel.LogiToppMetamodelPackage;

public class HandelModelService {

	public static CommonFreightTransportMetamodelRoot loadCommonModelRoot(String sourceModelPath) {
		CouplingPackage.eINSTANCE.eClass();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Load the source model
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createFileURI(sourceModelPath), true);

		return (CommonFreightTransportMetamodelRoot) resource.getContents().stream()
				.filter(elem -> CommonFreightTransportMetamodelRoot.class.isInstance(elem)).findFirst().get();
	}
	
	public static void saveModel(EObject rootObject, String targetModelPath) {
		CouplingPackage.eINSTANCE.eClass();
		LogiToppMetamodelPackage.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		URI targetModelURI = URI.createFileURI(targetModelPath);
		Resource targetResource = resourceSet.createResource(targetModelURI);
		targetResource.getContents().add(rootObject);

		try {
			targetResource.save(null);
			System.out.println("Model saved successfully to: " + targetModelURI.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
