package cepmodel.coupling.common2common;

import CommonFreightTransportMetamodel.coupling.CommonFreightTransportMetamodelRoot;

/*
 * common transformations for coupling logiTopp -> MATSim at logistic solution exchange point
 * 
 * Location of input and output: data/transformationsteps
 * Name for input: MODELNAME_common_0.xmi
 * Output: MODELNAME_day_SIMULATIONDAY_common_3.xmi
 */
public class CommonTransformation {

	public static void main(String[] args) {
		// configure here
		String modelName = "rastatt";

		String mainPath = System.getProperty("user.dir") + "/data/";
		// execute transformations
		addShipmentRecords(mainPath, modelName);
		splitTransportChains(mainPath, modelName);
		toSingleDay(mainPath, modelName);
	}

	private static void addShipmentRecords(String mainPath, String modelName) {
		CommonFreightTransportMetamodelRoot initialRoot = loadRootFromModelStep(0, mainPath, modelName);
		CreateShipmentRecordsService createShipmentRecordService = new CreateShipmentRecordsService();
		createShipmentRecordService.applyTransformation(initialRoot);
		saveModelAfterStep(1, initialRoot, mainPath, modelName);
	}

	private static void splitTransportChains(String mainPath, String modelName) {
		CommonFreightTransportMetamodelRoot root = loadRootFromModelStep(1, mainPath, modelName);
		SplitTransportChainService splitTransportChainService = new SplitTransportChainService();
		splitTransportChainService.applyTransformation(root);
		saveModelAfterStep(2, root, mainPath, modelName);
	}

	private static void toSingleDay(String mainPath, String modelName) {
		for (int day = 0; day < 7; day++) {
			CommonFreightTransportMetamodelRoot root = loadRootFromModelStep(2, mainPath, modelName);
			MultiToSingleDayService multiToSingleDayService = new MultiToSingleDayService();
			multiToSingleDayService.setRequestedSimulationDay(day);
			multiToSingleDayService.applyTransformation(root);
			HandelModelService.saveModel(root,
					mainPath + modelName + "/transformation_steps/" + modelName + "_day_" + day + "_common_3.xmi");
		}
	}

	private static CommonFreightTransportMetamodelRoot loadRootFromModelStep(int step, String mainPath,
			String modelName) {
		return HandelModelService.loadCommonModelRoot(
				mainPath + modelName + "/transformation_steps/" + modelName + "_common_" + step + ".xmi");
	}

	private static void saveModelAfterStep(int step, CommonFreightTransportMetamodelRoot root, String mainPath,
			String modelName) {
		HandelModelService.saveModel(root,
				mainPath + modelName + "/transformation_steps/" + modelName + "_common_" + step + ".xmi");
	}
}
