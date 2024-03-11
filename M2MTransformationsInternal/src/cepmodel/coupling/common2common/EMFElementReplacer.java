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

public class EMFElementReplacer {

	private EMFElementReplacer() {
	}

	public static void replaceElement(EObject root, EObject oldElement, EObject newElement) {
		replaceElementAtTypes(root, oldElement, newElement, Optional.empty());
	}

	public static void replaceElementAtTypes(EObject root, EObject oldElement, EObject newElement,
			List<Class<?>> types) {
		replaceElementAtTypes(root, oldElement, newElement, Optional.of(types));
	}

	public static void replaceManyElements(EObject root, Map<? extends EObject, ? extends EObject> oldToNewElement) {
		replaceManyElementsAtTypes(root, oldToNewElement.keySet(), oldToNewElement, Optional.empty());
	}

	public static void replaceManyElementsAtTypes(EObject root, Map<EObject, EObject> oldToNewElement,
			List<Class<?>> types) {
		replaceManyElementsAtTypes(root, oldToNewElement.keySet(), oldToNewElement, Optional.of(types));
	}

	private static void replaceElementAtTypes(EObject root, EObject oldElement, EObject newElement,
			Optional<List<Class<?>>> maybeTypes) {
		EcoreUtil.replace(oldElement, newElement);

		// Use EcoreUtil to traverse the resource containing the element
		Resource resource = root.eResource();
		if (resource != null) {
			EcoreUtil.resolveAll(resource);

			// Use TreeIterator for traversing the model tree
			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(root, true);
			while (iterator.hasNext()) {
				EObject element = iterator.next();
				replaceReferences(element, oldElement, newElement, maybeTypes);
			}
		}
	}

	private static void replaceReferences(EObject element, EObject oldElement, EObject newElement,
			Optional<List<Class<?>>> maybeTypes) {
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
						if (referencedElement.equals(oldElement)) {
							referencedElements.set(i, newElement);
						}
					}
				}
			} else {
				// Handle references with multiplicity "1"
				EObject referencedElement = (EObject) element.eGet(reference);
				if (referencedElement != null && referencedElement.equals(oldElement)) {
					element.eSet(reference, newElement);
				}
			}
		}
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