package cepmodel.logitopp.extraction.network;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.common.collect.ImmutableSet;

import cepmodel.logitopp.extraction.LogiToppInputFileRegistry;
import logiToppMetamodel.mobiTopp.network.Edge;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Node;
import logiToppMetamodel.mobiTopp.network.RoadNetwork;
import logiToppMetamodel.mobiTopp.network.Zone;

// TODO: long-term - add transport modes
public class LogiToppNetworkBuilder {
	private final Map<String, Node> nodes = new HashMap<String, Node>();
	private final Map<String, Edge> edges = new HashMap<String, Edge>();
	private final Map<String, Zone> zones = new HashMap<String, Zone>();
	private final Map<String, Zone> matrixColumn2Zones = new HashMap<String, Zone>();
	
	private final LogiToppInputFileRegistry fileRegistry;

	public LogiToppNetworkBuilder(LogiToppInputFileRegistry fileRegistry) {
		this.fileRegistry = fileRegistry;
	}

	public RoadNetwork createNetwork() {
		fileRegistry.nodeCSVs.forEach(file -> parseNodesCsv(file));
		fileRegistry.edgeCSVs.forEach(file -> parseEdgesCsv(file));
		fileRegistry.zoneCSVs.forEach(file -> parseZonesCsv(file));

		setOppositeEdges();

		return LogiToppNetworkUtil.createNetwork(ImmutableSet.copyOf(nodes.values()),
				ImmutableSet.copyOf(edges.values()), ImmutableSet.copyOf(zones.values()));
	}

	private void setOppositeEdges() {
		Map<String, Set<Edge>> from2Edges = new HashMap<String, Set<Edge>>();
		Map<String, Set<Edge>> to2Edges = new HashMap<String, Set<Edge>>();
		for (String nodeId : nodes.keySet()) {
			from2Edges.put(nodeId, new HashSet<Edge>());
			to2Edges.put(nodeId, new HashSet<Edge>());
		}

		for (Edge edge : edges.values()) {
			from2Edges.get(edge.getFrom().getId()).add(edge);
			to2Edges.get(edge.getTo().getId()).add(edge);
		}

		for (Edge edge : edges.values()) {
			Set<Edge> startAtOpposite = to2Edges.get(edge.getFrom().getId());
			Set<Edge> endAtOpposite = from2Edges.get(edge.getTo().getId());
			startAtOpposite.retainAll(endAtOpposite);

			if (startAtOpposite.size() == 1) {
				edge.setTwin(startAtOpposite.iterator().next());
			}
		}
	}

	private void parseNodesCsv(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader()
						.setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String id = record.get("id");
				double x = Double.valueOf(record.get("x"));
				double y = Double.valueOf(record.get("y"));
				addNode(id, x, y);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addNode(String id, double x, double y) {
		Node node = LogiToppNetworkUtil.createNode(id, x, y);
		nodes.put(id, node);
	}

	private void parseEdgesCsv(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader()
						.setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String id = record.get("id");
				String fromId = record.get("from");
				String toId = record.get("to");
				double length = Double.valueOf(record.get("length"));
				addEdge(id, fromId, toId, length);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addEdge(String edgeId, String fromId, String toId, double length) {
		Node fromNode = nodes.get(fromId);
		Node toNode = nodes.get(toId);
		Edge edge = LogiToppNetworkUtil.createEdge(edgeId, fromNode, toNode, length);
		edges.put(edgeId, edge);
	}

	private void parseZonesCsv(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String id = record.get("id");
				String matrixColumn = record.get("matrixColumn");
				String name = record.get("name");
				Location centroid = createLocationFromString(record.get("centroidLocation"));

				Zone zone = LogiToppNetworkUtil.createZone(id, name, centroid);
				zones.put(id, zone);
				matrixColumn2Zones.put(matrixColumn, zone);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Location createLocationFromString(String locationString) {
		Pattern pattern = Pattern
				.compile("\\((-?\\d+\\.\\d+),(-?\\d+\\.\\d+): (-?\\d+), (-?\\d+(\\.\\d+)?(E-?\\d+)?)\\)");
		Matcher matcher = pattern.matcher(locationString);
		matcher.matches();

		double x = Double.parseDouble(matcher.group(1));
		double y = Double.parseDouble(matcher.group(2));
		String edgeId = matcher.group(3);
		double edgePosition = Double.parseDouble(matcher.group(4));
		return createLocation(x, y, edgeId, edgePosition);
	}

	public Location createLocation(double x, double y, String edgeId, double edgePosition) {
		Edge edge;
		if (edgeId.startsWith("-")) {
			edge = edges.get(edgeId.substring(1) + ":2");
		} else {
			edge = edges.get(edgeId + ":1");
		}

		return LogiToppNetworkUtil.createLocation(x, y, edge, edgePosition);
	}

	public Zone getZone(String zoneId) {
		return zones.get(zoneId);
	}
	
	public Zone getZoneByMatrixColum(String zoneMatrixColumn) {
		return matrixColumn2Zones.get(zoneMatrixColumn);
	}
}
