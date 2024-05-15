package cepmodel.coupling.common2common;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/*
 * helper class for all kind of replacement operations in EMF-Models
 */
public class EMFElementReplacer {

	private EMFElementReplacer() {
	}

	// replace element everywhere
	public static void replaceElement(EObject root, EObject oldElement, EObject newElement) {
		replaceManyElementsAtTypes(root, Set.of(oldElement), Map.of(oldElement, newElement), Optional.empty());
	}

	// replace element only at references part of specify types
	public static void replaceElementAtTypes(EObject root, EObject oldElement, EObject newElement,
			List<Class<?>> types) {
		replaceManyElementsAtTypes(root, Set.of(oldElement), Map.of(oldElement, newElement), Optional.of(types));
	}

	// replace multiple elements everywhere
	public static void replaceManyElements(EObject root, Map<? extends EObject, ? extends EObject> oldToNewElement) {
		replaceManyElementsAtTypes(root, oldToNewElement.keySet(), oldToNewElement, Optional.empty());
	}

	// replace multiple elements only at references part of specify types
	public static void replaceManyElementsAtTypes(EObject root, Map<EObject, EObject> oldToNewElement,
			List<Class<?>> types) {
		replaceManyElementsAtTypes(root, oldToNewElement.keySet(), oldToNewElement, Optional.of(types));
	}

	private static void replaceManyElementsAtTypes(EObject root, Set<? extends EObject> elementsToReplace,
			Map<? extends EObject, ? extends EObject> oldToNewElement, Optional<List<Class<?>>> maybeTypes) {
		for (EObject oldElement : elementsToReplace) {
			EcoreUtil.replace(oldElement, oldToNewElement.get(oldElement));
		}

		// Use EcoreUtil to traverse the resource containing the element
		Resource resource = root.eResource();
		if (resource != null) {
			EcoreUtil.resolveAll(resource);

			// Use TreeIterator for traversing the model tree
			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(root, true);
			while (iterator.hasNext()) {
				EObject element = iterator.next();
				replaceManyReferences(element, elementsToReplace, oldToNewElement, maybeTypes);
			}
		}
	}

	private static void replaceManyReferences(EObject element, Set<? extends EObject> elementsToReplace,
			Map<? extends EObject, ? extends EObject> oldToNewElement, Optional<List<Class<?>>> maybeTypes) {
		boolean foundMatch = true;
		if (maybeTypes.isPresent()) {
			foundMatch = maybeTypes.get().stream().anyMatch(type -> type.isInstance(element));
		}
		if (!foundMatch) {
			return;
		}

		// Iterate through all references of the element
		for (EReference reference : element.eClass().getEAllReferences()) {
			if (reference.isMany()) {
				// Handle references with multiplicity "*"
				@SuppressWarnings("unchecked")
				List<EObject> referencedElements = (List<EObject>) element.eGet(reference);
				if (referencedElements != null) {
					for (int i = 0; i < referencedElements.size(); i++) {
						EObject referencedElement = referencedElements.get(i);
						if (elementsToReplace.contains(referencedElement)) {
							referencedElements.set(i, oldToNewElement.get(referencedElement));
						}
					}
				}
			} else {
				// Handle references with multiplicity "1"
				EObject referencedElement = (EObject) element.eGet(reference);
				if (referencedElement != null && elementsToReplace.contains(referencedElement)) {
					element.eSet(reference, oldToNewElement.get(referencedElement));
				}
			}
		}
	}
}