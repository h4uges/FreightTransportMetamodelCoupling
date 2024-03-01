package cepmodel.logitopp.extraction;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import cepmodel.coupling.common2common.HandelModelService;
import cepmodel.logitopp.extraction.demand.LogiToppDemandBuilder;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.population.LogiToppPopulationBuilder;
import cepmodel.logitopp.extraction.solution.LogiToppSolutionBuilder;
import cepmodel.logitopp.extraction.transportInfrastructure.LogiToppTransportInfrastructureBuilder;
import logiToppMetamodel.Demand;
import logiToppMetamodel.DemandExchangeRoot;
import logiToppMetamodel.Population;
import logiToppMetamodel.Solution;
import logiToppMetamodel.SolutionExchangeRoot;
import logiToppMetamodel.TransportInfrastructure;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;
import logiToppMetamodel.logiTopp.parcels.BusinessParcel;
import logiToppMetamodel.mobiTopp.network.RoadNetwork;
import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;

public class LogiToppModelBuilder {

	public static void main(String[] args) {
		String fileRegistryPath = System.getProperty("user.dir") + "/data/rastatt/RastattInputFileRegisty.json";

		LogiToppModelBuilder modelBuilder = new LogiToppModelBuilder(fileRegistryPath);
		DemandExchangeRoot result = modelBuilder.createSolutionModel();

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
		} catch (IOException e) {
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

		restoreMissingData(result);

		return result;
	}

	private void restoreMissingData(SolutionExchangeRoot root) {
		restoreDistributionCenterLocations(root);
		restoreDeliveryVehicleTimes(root);
	}

	private void restoreDeliveryVehicleTimes(SolutionExchangeRoot root) {
		Iterator<EObject> contentIterator = root.eAllContents();
		while (contentIterator.hasNext()) {
			EObject next = (EObject) contentIterator.next();
			if (next instanceof DeliveryVehicle) {
				DeliveryVehicle deliveryVehicle = (DeliveryVehicle) next;
				deliveryVehicle.setEarliestStartTime(LogiToppExtractionUtil.createTime(0));
				deliveryVehicle.setLatestEndTime(LogiToppExtractionUtil.createTime(23 * 60 * 60 + 59 * 60 + 59));
			}
		}
	}

	private void restoreDistributionCenterLocations(SolutionExchangeRoot root) {
		Iterator<EObject> contentIterator = root.eAllContents();
		Map<String, ZoneAndLocation> distributionCenterId2ZoneAndLocation = new HashMap<String, ZoneAndLocation>();
		while (contentIterator.hasNext()) {
			EObject next = contentIterator.next();
			if (next instanceof BusinessParcel) {
				BusinessParcel businessParcel = (BusinessParcel) next;
				if (businessParcel.isIsPickup()) {
					distributionCenterId2ZoneAndLocation.put(
							((DistributionCenter) businessParcel.getConsumer()).getId(),
							EcoreUtil.copy(businessParcel.getZoneAndLocation()));
				}
			}
		}
		contentIterator = root.eAllContents();
		while (contentIterator.hasNext()) {
			EObject next = contentIterator.next();
			if (next instanceof DistributionCenter) {
				DistributionCenter distributionCenter = (DistributionCenter) next;

				if (distributionCenterId2ZoneAndLocation.containsKey(distributionCenter.getId())) {
					distributionCenter.setLocation(
							distributionCenterId2ZoneAndLocation.get(distributionCenter.getId()).getLocation());
				}
			}
		}
	}
}
