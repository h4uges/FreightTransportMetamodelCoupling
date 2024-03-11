package cepmodel.logitopp.extraction;

import cepmodel.coupling.common2common.HandelModelService;
import cepmodel.logitopp.extraction.demand.LogiToppDemandBuilder;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.population.LogiToppPopulationBuilder;
import cepmodel.logitopp.extraction.solution.LogiToppSolutionBuilder;
import cepmodel.logitopp.extraction.transportInfrastructure.LogiToppTransportInfrastructureBuilder;
import logiToppMetamodel.dataExchange.Demand;
import logiToppMetamodel.dataExchange.Population;
import logiToppMetamodel.dataExchange.Solution;
import logiToppMetamodel.dataExchange.SolutionExchangeRoot;
import logiToppMetamodel.dataExchange.TransportInfrastructure;
import logiToppMetamodel.mobiTopp.network.RoadNetwork;

public class LogiToppModelBuilder {

	public static void main(String[] args) {
		String fileRegistryPath = System.getProperty("user.dir") + "/data/rastatt/RastattInputFileRegisty.json";

		LogiToppModelBuilder modelBuilder = new LogiToppModelBuilder(fileRegistryPath);
		SolutionExchangeRoot result = modelBuilder.createSolutionModel();

		HandelModelService.saveModel(result, System.getProperty("user.dir") + "/data/rastatt/rastatt_solution.xmi");
	}

	private String fileRegistryPath;

	public LogiToppModelBuilder(String fileRegistryPath) {
		this.fileRegistryPath = fileRegistryPath;
	}

	public SolutionExchangeRoot createSolutionModel() {
		LogiToppInputFileRegistry fileRegisty;
		try {
			fileRegisty = LogiToppInputFileRegistry.createRegistry(fileRegistryPath);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		LogiToppNetworkBuilder networkBuilder = new LogiToppNetworkBuilder(fileRegisty);
		LogiToppTransportInfrastructureBuilder transportInfrastructureBuilder = new LogiToppTransportInfrastructureBuilder(
				fileRegisty, networkBuilder);
		LogiToppPopulationBuilder populationBuilder = new LogiToppPopulationBuilder(fileRegisty, networkBuilder,
				transportInfrastructureBuilder);
		LogiToppDemandBuilder demandBuilder = new LogiToppDemandBuilder(fileRegisty, networkBuilder,
				transportInfrastructureBuilder, populationBuilder);
		LogiToppSolutionBuilder solutionBuilder = new LogiToppSolutionBuilder(fileRegisty, networkBuilder,
				transportInfrastructureBuilder, demandBuilder);

		RoadNetwork network = networkBuilder.createNetwork();
		TransportInfrastructure transportInfrastructure = transportInfrastructureBuilder
				.createTransportInfrastructure();
		Population population = populationBuilder.createPopulation();
		Demand demand = demandBuilder.createDemand();
		Solution solution = solutionBuilder.createSolution();

		SolutionExchangeRoot result = LogiToppExtractionUtil.createSolutionExchangeRoot(network,
				transportInfrastructure, population, demand, solution);

		return result;
	}
}
