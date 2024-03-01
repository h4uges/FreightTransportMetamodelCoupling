package cepmodel.logitopp.extraction;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO: minor - make lists immutable + final
public class LogiToppInputFileRegistry {
	
	// network
	public List<String> nodeCSVs;
	public List<String> edgeCSVs;
	public List<String> zoneCSVs;
	
	// transportInfrastructure
	public List<String> serviceAreaCSVs;
	public List<String> distributionCenterCSVs;
	public List<String> fleetCSVs;
	public List<String> depotRelationCSVs;
	public List<String> timeTableCSVs;
	
	//population
	public List<String> businessLocationCSVs;
	public List<String> businessCSVs;
	public List<String> businessRelationsCSVs;
	public List<String> householdCSVs;
	public List<String> personCSVs;
	public List<String> fixedDestinationCSVs;
	
	//demand
	public List<String> parcelOrderBusinessCSVs;
	public List<String> parcelOrdersPrivateCSVs;
	public List<String> parcelProductionBusinessCSVs;
	
	//solution
	public List<String> plannedToursCSVs;

	public static LogiToppInputFileRegistry createRegistry(String configFilePath) throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		LogiToppInputFileRegistry config = objectMapper.readValue(new File(configFilePath), LogiToppInputFileRegistry.class);
		return config;
	}
	
}
