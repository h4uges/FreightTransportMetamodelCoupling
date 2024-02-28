package cepmodel.logitopp.extraction;

import logiToppMetamodel.Demand;
import logiToppMetamodel.DemandExchangeRoot;
import logiToppMetamodel.LogiToppMetamodelFactory;
import logiToppMetamodel.Population;
import logiToppMetamodel.TransportInfrastructure;
import logiToppMetamodel.mobiTopp.network.RoadNetwork;

public class LogiToppExtractionUtil {

	public static DemandExchangeRoot createDemandExchangeRoot(RoadNetwork network, TransportInfrastructure transportInfrastructure, Population population, Demand demand) {
		DemandExchangeRoot result = LogiToppMetamodelFactory.eINSTANCE.createDemandExchangeRoot();
		result.setNetwork(network);
		result.setTransportNetwork(transportInfrastructure);
		result.setPopulation(population);
		result.setDemand(demand);
		return result;
	}
}
