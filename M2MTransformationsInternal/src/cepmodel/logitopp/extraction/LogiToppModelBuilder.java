package cepmodel.logitopp.extraction;

import java.io.IOException;

import cepmodel.logitopp.extraction.demand.LogiToppDemandBuilder;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.population.LogiToppPopulationBuilder;
import cepmodel.logitopp.extraction.transportInfrastructure.LogiToppTransportInfrastructureBuilder;
import logiToppMetamodel.Demand;
import logiToppMetamodel.DemandExchangeRoot;
import logiToppMetamodel.Population;
import logiToppMetamodel.TransportInfrastructure;
import logiToppMetamodel.mobiTopp.network.RoadNetwork;

public class LogiToppModelBuilder {

	
	public DemandExchangeRoot createDemandModel() {
		InputFileRegistry fileRegisty;
		try {
			fileRegisty = InputFileRegistry.createRegistry("TODO");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		LogiToppNetworkBuilder networkBuilder = new LogiToppNetworkBuilder(fileRegisty);
		LogiToppTransportInfrastructureBuilder transportInfrastructureBuilder = new LogiToppTransportInfrastructureBuilder(fileRegisty, networkBuilder);
		LogiToppPopulationBuilder populationBuilder = new LogiToppPopulationBuilder(fileRegisty, networkBuilder, transportInfrastructureBuilder);
		LogiToppDemandBuilder demandBuilder = new LogiToppDemandBuilder(fileRegisty, networkBuilder, populationBuilder);
		
		RoadNetwork network = networkBuilder.createNetwork();
		TransportInfrastructure transportInfrastructure = transportInfrastructureBuilder.createTransportInfrastructure();
		Population population = populationBuilder.createPopulation();
		Demand demand = demandBuilder.createDemand();
		
		return LogiToppExtractionUtil.createDemandExchangeRoot(network, transportInfrastructure, population, demand);
	}
	
	public void createSolutionModel() {
		// ...
	}
}
