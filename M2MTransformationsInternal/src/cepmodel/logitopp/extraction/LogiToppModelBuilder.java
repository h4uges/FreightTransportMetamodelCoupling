package cepmodel.logitopp.extraction;

import cepmodel.coupling.common2common.HandelModelService;
import cepmodel.logitopp.extraction.demand.LogiToppDemandBuilder;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.population.LogiToppPopulationBuilder;
import cepmodel.logitopp.extraction.solution.LogiToppSolutionBuilder;
import cepmodel.logitopp.extraction.transportinfrastructure.LogiToppTransportInfrastructureBuilder;
import logiToppMetamodel.dataExchange.Demand;
import logiToppMetamodel.dataExchange.Population;
import logiToppMetamodel.dataExchange.Solution;
import logiToppMetamodel.dataExchange.SolutionExchangeRoot;
import logiToppMetamodel.dataExchange.TransportInfrastructure;
import logiToppMetamodel.mobiTopp.network.RoadNetwork;

/*
 * Builds a instance of the LogiTopp metamodel from given raw LogiTopp input and output data.
 * Location of the data is described by the LogiToppInputFileRegistry (path to that is the "fileRegistryPath").
 * Location of the produced model is the "outputPath".
 */
public class LogiToppModelBuilder {

	public static void main(String[] args) {
		String fileRegistryPath = System.getProperty("user.dir") + "/data/rastatt/RastattInputFileRegisty.json";
		String outputPath = System.getProperty("user.dir") + "/data/rastatt/rastatt_solution.xmi";

		// build model
		LogiToppModelBuilder modelBuilder = new LogiToppModelBuilder(fileRegistryPath);
		SolutionExchangeRoot result = modelBuilder.createSolutionModel();

		// save result model
		HandelModelService.saveModel(result, outputPath);
	}

	private String fileRegistryPath;

	public LogiToppModelBuilder(String fileRegistryPath) {
		this.fileRegistryPath = fileRegistryPath;
	}

	public SolutionExchangeRoot createSolutionModel() {
		// parse file registry
		LogiToppInputFileRegistry fileRegisty;
		try {
			fileRegisty = LogiToppInputFileRegistry.createRegistry(fileRegistryPath);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		// create builders (these have access to each other in order to easy retrieve
		// model elements created by other builders)
		LogiToppNetworkBuilder networkBuilder = new LogiToppNetworkBuilder(fileRegisty);
		LogiToppTransportInfrastructureBuilder transportInfrastructureBuilder = new LogiToppTransportInfrastructureBuilder(
				fileRegisty, networkBuilder);
		LogiToppPopulationBuilder populationBuilder = new LogiToppPopulationBuilder(fileRegisty, networkBuilder,
				transportInfrastructureBuilder);
		LogiToppDemandBuilder demandBuilder = new LogiToppDemandBuilder(fileRegisty, networkBuilder,
				transportInfrastructureBuilder, populationBuilder);
		LogiToppSolutionBuilder solutionBuilder = new LogiToppSolutionBuilder(fileRegisty, networkBuilder,
				transportInfrastructureBuilder, demandBuilder);

		// create model
		RoadNetwork network = networkBuilder.createNetwork();
		TransportInfrastructure transportInfrastructure = transportInfrastructureBuilder
				.createTransportInfrastructure();
		Population population = populationBuilder.createPopulation();
		Demand demand = demandBuilder.createDemand();
		Solution solution = solutionBuilder.createSolution();
		return LogiToppExtractionUtil.createSolutionExchangeRoot(network, transportInfrastructure, population, demand,
				solution);
	}
}
