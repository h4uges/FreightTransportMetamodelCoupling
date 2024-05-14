package cepmodel.coupling.common2common;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;

public class CommonTransformation {

	public static void main(String[] args) {
		String mainPath = System.getProperty("user.dir") + "/data/";
		String modelName = "rastatt";

		addShipmentRecords(mainPath, modelName);
		splitTransportChains(mainPath, modelName);
		toSingleDay(mainPath, modelName);
	}

	private static void addShipmentRecords(String mainPath, String modelName) {
		CommonFreightTransportMetamodelRoot initialRoot = HandelModelService
				.loadCommonModelRoot(mainPath + modelName + "/transformation_steps/" + modelName + "_common_0.xmi");
		CreateShipmentRecordsService createShipmentRecordService = new CreateShipmentRecordsService();
		createShipmentRecordService.applyTransformation(initialRoot);
		HandelModelService.saveModel(initialRoot,
				mainPath + modelName + "/transformation_steps/" + modelName + "_common_1.xmi");
	}

	private static void splitTransportChains(String mainPath, String modelName) {
		CommonFreightTransportMetamodelRoot root = HandelModelService
				.loadCommonModelRoot(mainPath + modelName + "/transformation_steps/" + modelName + "_common_1.xmi");
		SplitTransportChainService splitTransportChainService = new SplitTransportChainService();
		splitTransportChainService.applyTransformation(root);
		HandelModelService.saveModel(root,
				mainPath + modelName + "/transformation_steps/" + modelName + "_common_2.xmi");
	}

	private static void toSingleDay(String mainPath, String modelName) {
		for (int day = 0; day < 7; day++) {
			CommonFreightTransportMetamodelRoot root = HandelModelService
					.loadCommonModelRoot(mainPath + modelName + "/transformation_steps/" + modelName + "_common_2.xmi");
			MultiToSingleDayService multiToSingleDayService = new MultiToSingleDayService();
			multiToSingleDayService.setRequestedSimulationDay(day);
			multiToSingleDayService.applyTransformation(root);
			HandelModelService.saveModel(root,
					mainPath + modelName + "/transformation_steps/" + modelName + "_day_" + day + "_common_3.xmi");
		}
	}
}
