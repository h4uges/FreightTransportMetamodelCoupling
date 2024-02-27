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

import cepmodel.logitopp.extraction.InputFileRegistry;
import cepmodel.logitopp.extraction.population.LogiToppPopulationUtil;
import logiToppMetamodel.mobiTopp.network.Edge;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Node;
import logiToppMetamodel.mobiTopp.network.RoadNetwork;
import logiToppMetamodel.mobiTopp.network.Zone;
import logiToppMetamodel.mobiTopp.population.Household;

public class LogiToppNetworkBuilder {
	private final Map<Integer, Node> nodes = new HashMap<Integer, Node>();
	private final Map<Integer, Edge> edges = new HashMap<Integer, Edge>();
	private final Map<Integer, Zone> zones = new HashMap<Integer, Zone>();

	private final InputFileRegistry fileRegistry;

	public LogiToppNetworkBuilder(InputFileRegistry fileRegistry) {
		this.fileRegistry = fileRegistry;
	}

	public RoadNetwork createNetwork() {
		// ...
		fileRegistry.zoneCSVs.forEach(file -> parseZonesCsv(file));

		setOppositeEdges();

		return LogiToppNetworkUtil.createNetwork(ImmutableSet.copyOf(nodes.values()),
				ImmutableSet.copyOf(edges.values()), ImmutableSet.of());
	}
	
	public Location createLocationFromString(String locationString) {
		Pattern pattern = Pattern.compile("\\((-?\\d+\\.\\d+),(-?\\d+\\.\\d+): (\\d+), (\\d+\\.\\d+)\\)");
        Matcher matcher = pattern.matcher(locationString);

        assert(matcher.matches());
        
        double x = Double.parseDouble(matcher.group(1));
        double y = Double.parseDouble(matcher.group(2));
        int edgeId = Integer.parseInt(matcher.group(3));
        double edgePosition = Double.parseDouble(matcher.group(4));
        return createLocation(x, y, edgeId, edgePosition);
	}

	public Location createLocation(double x, double y, int edgeId, double edgePosition) {
		Edge edge = edges.get(edgeId);
		return LogiToppNetworkUtil.createLocation(x, y, edge, edgePosition);
	}

	public Zone getZone(int zoneId) {
		return zones.get(zoneId);
	}

	private void addNode(int id, double x, double y) {
		Node node = LogiToppNetworkUtil.createNode(id, x, y);
		nodes.put(id, node);
	}

	private void addEdge(int edgeId, int fromId, int toId) {
		Node fromNode = nodes.get(fromId);
		Node toNode = nodes.get(toId);
		Edge edge = LogiToppNetworkUtil.createEdge(edgeId, fromNode, toNode);
		edges.put(edgeId, edge);
	}

	// TODO: check quotes ""
	private void parseZonesCsv(String filePath) {
		// format: "matrixColumn";"id";"name";"areaType";"regionType";"classification";"parkingPlaces";"centroidLocation";"isDestination";"relief"
		try (Reader reader = new FileReader(filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				int id = Integer.valueOf(record.get("id"));
				String name = record.get("name");
				Location centroid = createLocationFromString(record.get("centroidLocation"));
				
				Zone zone = LogiToppNetworkUtil.createZone(id, name, centroid);
				zones.put(id, zone);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void setOppositeEdges() {
		Map<Integer, Set<Edge>> from2Edges = new HashMap<Integer, Set<Edge>>();
		Map<Integer, Set<Edge>> to2Edges = new HashMap<Integer, Set<Edge>>();
		for (Integer nodeId : nodes.keySet()) {
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
}
