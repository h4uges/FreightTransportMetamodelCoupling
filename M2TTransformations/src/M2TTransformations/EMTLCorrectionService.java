package M2TTransformations;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class EMTLCorrectionService {

	private EMTLCorrectionService() {
	}

	public static void correctEMTLFiles() {
		Path binaryFolderPath = Path.of(System.getProperty("user.dir") + "/bin");
		String fileExtension = ".emtl";
		try {
			List<Path> files = Files.walk(binaryFolderPath, Integer.MAX_VALUE, FileVisitOption.FOLLOW_LINKS)
					.filter(path -> path.toString().toLowerCase().endsWith(fileExtension)).toList();

			for (Path file : files) {
				correctFile(file);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void correctFile(Path filePath) {
		try {
			// Document originalDocument = parseXMLFile(filePath);
			// saveXMLFile(Path.of(filePath.toString().replace("emtl", "original")),
			// originalDocument);

			Document document = parseXMLFile(filePath);
			traverseAndReplaceModelReferencesRecursive(document.getDocumentElement());
			saveXMLFile(filePath, document);
		} catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
			e.printStackTrace();
		}
	}

	private static void traverseAndReplaceModelReferencesRecursive(Element element) {
		NamedNodeMap attributes = element.getAttributes();
		for (int i = 0; i < attributes.getLength(); i++) {
			Attr attribute = (Attr) attributes.item(i);
			if (requiresReplacement(attribute)) {
				String newNodeValue = determineNewModelReferenceValue(attribute);
				attribute.setNodeValue(newNodeValue);
			}
		}

		NodeList children = element.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node child = children.item(i);
			if (child instanceof Element childElement) {
				traverseAndReplaceModelReferencesRecursive(childElement);
			}
		}
	}

	private static boolean requiresReplacement(Attr attribute) {
		if (!attribute.getNodeName().equals("href")) {
			return false;
		}

		String hRefValue = attribute.getNodeValue();
		return hRefValue.contains("vehicles#");
	}

	private static String determineNewModelReferenceValue(Attr attribute) {
		String hRefValue = attribute.getNodeValue();

		boolean isPackageReference = attribute.getOwnerElement().getNodeName().equals("takesTypesFrom");
		boolean isEType = attribute.getOwnerElement().getNodeName().equals("eType");
		boolean isReferredProperty = attribute.getOwnerElement().getNodeName().equals("referredProperty");

		if (isPackageReference) {
			return hRefValue.replace("/vehicles#/", "");
		}
		if (isEType) {
			hRefValue = hRefValue.replace("/vehicles#/", "");
			int lastIndex = hRefValue.lastIndexOf("/");

			if (lastIndex == -1) {
				assert (false);
			}

			return hRefValue.substring(0, lastIndex) + "#//" + hRefValue.substring(lastIndex + 1);
		}
		if (isReferredProperty) {
			int baseIndex = hRefValue.indexOf("/vehicles#/");
	        assert baseIndex != -1 : "Invalid input: /vehicles#/ not found in the original string.";
	        
	        String withoutBase = hRefValue.substring(0, baseIndex) + hRefValue.substring(baseIndex + "/vehicles#/".length());
	        int nextSlashIndex = withoutBase.indexOf('/', baseIndex + 1);
	        assert nextSlashIndex != -1 : "Invalid input: Next / not found after /vehicles#/";
	        String transformedString = withoutBase.substring(0, nextSlashIndex) + "#//" + withoutBase.substring(nextSlashIndex + 1);
	        return transformedString;
		}

		assert (false);
		return null;
	}

	private static Document parseXMLFile(Path filePath) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(new File(filePath.toString()));
	}

	private static void saveXMLFile(Path filePath, Document document) throws TransformerException {
		removeEmptyTextNodes(document.getDocumentElement());

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");

		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(new File(filePath.toString()));
		transformer.transform(source, result);
	}

	private static void removeEmptyTextNodes(Node node) {
		NodeList childNodes = node.getChildNodes();
		List<Node> emptyNodes = new ArrayList<>();

		for (int i = 0; i < childNodes.getLength(); i++) {
			Node child = childNodes.item(i);

			if (child.getNodeType() == Node.TEXT_NODE && child.getNodeValue().trim().isEmpty()) {
				emptyNodes.add(child);
			} else if (child.getNodeType() == Node.ELEMENT_NODE) {
				removeEmptyTextNodes(child);
			}
		}

		for (Node emptyNode : emptyNodes) {
			node.removeChild(emptyNode);
		}
	}
}
