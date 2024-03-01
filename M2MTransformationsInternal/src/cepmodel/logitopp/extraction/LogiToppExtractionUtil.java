package cepmodel.logitopp.extraction;

import logiToppMetamodel.Demand;
import logiToppMetamodel.DemandExchangeRoot;
import logiToppMetamodel.LogiToppMetamodelFactory;
import logiToppMetamodel.Population;
import logiToppMetamodel.Solution;
import logiToppMetamodel.SolutionExchangeRoot;
import logiToppMetamodel.TransportInfrastructure;
import logiToppMetamodel.base.BaseFactory;
import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.mobiTopp.network.RoadNetwork;

public class LogiToppExtractionUtil {

	public static SolutionExchangeRoot createSolutionExchangeRoot(RoadNetwork network,
			TransportInfrastructure transportInfrastructure, Population population, Demand demand, Solution solution) {
		SolutionExchangeRoot result = LogiToppMetamodelFactory.eINSTANCE.createSolutionExchangeRoot();
		result.setNetwork(network);
		result.setTransportNetwork(transportInfrastructure);
		result.setPopulation(population);
		result.setDemand(demand);
		result.setSolution(solution);
		return result;
	}

	public static DemandExchangeRoot createDemandExchangeRoot(RoadNetwork network,
			TransportInfrastructure transportInfrastructure, Population population, Demand demand) {
		DemandExchangeRoot result = LogiToppMetamodelFactory.eINSTANCE.createDemandExchangeRoot();
		result.setNetwork(network);
		result.setTransportNetwork(transportInfrastructure);
		result.setPopulation(population);
		result.setDemand(demand);
		return result;
	}

	public static Time createTime(int seconds) {
		Time result = BaseFactory.eINSTANCE.createTime();
		result.setSeconds(seconds);
		return result;
	}

	public static RelativeTime createRelativeTime(int seconds) {
		RelativeTime result = BaseFactory.eINSTANCE.createRelativeTime();
		result.setSeconds(seconds);
		return result;
	}
}
