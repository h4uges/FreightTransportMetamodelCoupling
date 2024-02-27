package cepmodel.coupling.common2common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import CommonFreightTransportMetamodel.CommonFreighTransportMetamodelPackage;
import CommonFreightTransportMetamodel.Utils.FiniteVolumeDimension;
import CommonFreightTransportMetamodel.Utils.FiniteWeightDimension;
import CommonFreightTransportMetamodel.Utils.InfiniteVolumeDimension;
import CommonFreightTransportMetamodel.Utils.UtilsFactory;
import CommonFreightTransportMetamodel.Utils.UtilsPackage;
import CommonFreightTransportMetamodel.Utils.VolumeAndWeightBasedDimension;

public class ToVolumeBased {

	public static void main(String[] args) {
		CommonFreighTransportMetamodelPackage.eINSTANCE.eClass();
		
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
        // Load the source model
        String sourceModelPath = "data/My.xmi";
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.getResource(URI.createFileURI(sourceModelPath), true);

        // Replace instances of old type with new type
        replaceInstances(resource);

        // Save the modified model
        String targetModelPath = "data/My_new.xmi";
        saveModel(resourceSet, URI.createFileURI(targetModelPath));
    }

    private static void replaceInstances(Resource resource) {
        for (EObject rootElement : resource.getContents()) {	
            // Replace instances in the whole metamodel
        	
            replaceInstances(rootElement);
        }
    }

    private static void replaceInstances(EObject element) {
    	if (UtilsPackage.eINSTANCE.getInfiniteWeightDimension().isInstance(element)) {
    		InfiniteVolumeDimension newElement = UtilsFactory.eINSTANCE.createInfiniteVolumeDimension();
    		EcoreUtil.replace(element, newElement);
    	}
    	if (UtilsPackage.eINSTANCE.getFiniteWeightDimension().isInstance(element)) {
    		FiniteWeightDimension element_ = (FiniteWeightDimension) element;
    		FiniteVolumeDimension newElement = UtilsFactory.eINSTANCE.createFiniteVolumeDimension();
    		newElement.setVolumeCubicMetre(element_.getWeightKg() / 200);
    		
    		EcoreUtil.replace(element, newElement);
    	}
		if (UtilsPackage.eINSTANCE.getVolumeAndWeightBasedDimension().isInstance(element)) {
			VolumeAndWeightBasedDimension element_ = (VolumeAndWeightBasedDimension) element;
			
			EcoreUtil.replace(element, element_.getVolumeDimension());
    	}
		
        // Recursively process children
        for (EObject child : element.eContents()) {
            replaceInstances(child);
        }
    }

    private static void saveModel(ResourceSet resourceSet, URI targetModelURI) {
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
