package m2ttransformation;

import MATSimFreightMetamodel.matsim.core.network.Link;
import MATSimFreightMetamodel.matsim.core.network.Network;
import MATSimFreightMetamodel.matsim.core.network.Node;
import java.util.function.Consumer;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

@SuppressWarnings("all")
public class NetworkRepairTool {
  public static void repairNetwork(final Network network) {
    NetworkRepairTool.repairConnectivity(network);
  }

  private static void repairConnectivity(final Network network) {
    final SimpleGraph<Integer, DefaultEdge> graph = new SimpleGraph<Integer, DefaultEdge>(DefaultEdge.class);
    final Consumer<Node> _function = (Node node) -> {
      graph.addVertex(Integer.valueOf(Integer.parseInt(node.getId())));
    };
    network.getNodes().forEach(_function);
    final Consumer<Link> _function_1 = (Link link) -> {
      graph.addEdge(Integer.valueOf(Integer.parseInt(link.getFrom().getId())), Integer.valueOf(Integer.parseInt(link.getTo().getId())));
    };
    network.getLinks().forEach(_function_1);
  }
}
