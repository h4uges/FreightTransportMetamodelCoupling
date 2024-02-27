package cepmodel.logitopp.extraction;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
Example:
{
  "distributionCenterCSVs": ["dc1.csv", "dc2.csv"],
  "depotRelationCSVs": ["depot_relation1.csv", "depot_relation2.csv"],
  ...
  "parcelProductionBusinessCSVs": ["parcel_production_business1.csv", "parcel_production_business2.csv"]
}
 */

// TODO: make lists immutable + final
public class InputFileRegistry {
	
	// network
	// ...
	public List<String> zoneCSVs;
	
	// transportInfrastructure
	public List<String> distributionCenterCSVs;
	public List<String> depotRelationCSVs;
	public List<String> timeTableCSVs;
	
	//population
	public List<String> businessCSVs;
	public List<String> businessRelationsCSVs;
	public List<String> householdCSVs;
	public List<String> personCSVs;
	// ...
	
	//demand
	public List<String> parcelOrderBusinessCSVs;
	public List<String> parcelOrdersPrivateCSVs;
	public List<String> parcelProductionBusinessCSVs;

	public static InputFileRegistry createRegistry(String configFilePath) throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		InputFileRegistry config = objectMapper.readValue(new File("configFilePath"), InputFileRegistry.class);
		return config;
	}
	
}
