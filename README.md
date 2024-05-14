# Master Thesis Simon Haug

Prototypical Implementation of a Model Coupling from logiTopp to MATSim Freight over the logistic solution exchange point.

  

## Overview

**Metamodels:**
 - CommonMM: The common metamodel (Ecore)
	 - Including the optional Results Viewpoint
 - LogiToppMM: The logiTopp metamodel (Ecore)
 - MATSimMM: The MATSim-Freight metamodel (Ecore)
	 - Including elements of the freight receivers contribution

**Transformations:**
- M2MTransformations
	- Transformation logiTopp metamodel ⇒ common metamodel (`transforms/cepmodel/coupling/logitopp2common`)
	- Transformation common metamodel ⇒ MATSim-Freight metamodel (`transforms/cepmodel/coupling/common2matsim`)
- M2MTransformationsInternal
	- LogiToppModelBuilder (`src/cepmodel/logitopp/extraction`,`LogiToppModelBuilder.java`)
	- "common transformations" (`src/cepmodel/coupling/common2common`, `CommonTransformation.java`)
		- create shipment records (`CreateShipmentRecordsService.java`)
		- multi to single day (`MultiToSingleDayService.java`)
		- split transport chain (`SplitTransportChainService.java`)
- M2TTransformations
	- MATSimInputGenerator (`MATSimExport.xtend`)

**Evaluation:**
 - CouplingEvaluation: Evaluation of relational constraints between a logiTopp source model and a MATSim-Freight target model

All parts of this Implementation may be tailored to the single supported use-case of the prototype.

## Setup

 - List of probably required Plugins/Tools/... for Eclipse:
	 - Modeling Modelling Tools
	 - XTend/XPand
	 - QVT
	 - Maven
	 - ...
 - Setup:
	 - Manually create code derived from the metamodels using the `.genmodel`
	 - Clean and Build Project Using Maven
	 - Then: Manually add the required input data and execute each transformation step.

