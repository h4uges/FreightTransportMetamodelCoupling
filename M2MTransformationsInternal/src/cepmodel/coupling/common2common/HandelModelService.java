package cepmodel.coupling.common2common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;
import CommonFreightTransportMetamodel.coupling.CouplingPackage;

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
	
	public static void saveCommonModelRoot(CommonFreightTransportMetamodelRoot root, String targetModelPath) {
		CouplingPackage.eINSTANCE.eClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		
		URI targetModelURI = URI.createFileURI(targetModelPath);
		Resource targetResource = resourceSet.createResource(targetModelURI);
		targetResource.getContents().addAll(resourceSet.getResources().get(0).getContents());

		try {
			targetResource.save(null);
			System.out.println("Model saved successfully to: " + targetModelURI.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
