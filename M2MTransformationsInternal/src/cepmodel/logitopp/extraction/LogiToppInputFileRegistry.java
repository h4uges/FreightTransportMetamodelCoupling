package cepmodel.logitopp.extraction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.google.common.collect.ImmutableList;

public class LogiToppInputFileRegistry {

	// network
	public final ImmutableList<String> nodeCSVs;
	public final ImmutableList<String> edgeCSVs;
	public final ImmutableList<String> zoneCSVs;

	// transportInfrastructure
	public final ImmutableList<String> serviceAreaCSVs;
	public final ImmutableList<String> distributionCenterCSVs;
	public final ImmutableList<String> depotLocationCSVs;
	public final ImmutableList<String> fleetCSVs;
	public final ImmutableList<String> depotRelationCSVs;
	public final ImmutableList<String> timeTableCSVs;

	// population
	public final ImmutableList<String> businessLocationCSVs;
	public final ImmutableList<String> businessCSVs;
	public final ImmutableList<String> businessRelationsCSVs;
	public final ImmutableList<String> householdCSVs;
	public final ImmutableList<String> personCSVs;
	public final ImmutableList<String> fixedDestinationCSVs;

	// demand
	public final ImmutableList<String> parcelOrderBusinessCSVs;
	public final ImmutableList<String> parcelOrdersPrivateCSVs;
	public final ImmutableList<String> parcelProductionBusinessCSVs;

	// solution
	public final ImmutableList<String> plannedToursCSVs;

	public LogiToppInputFileRegistry(@JsonProperty("nodeCSVs") ImmutableList<String> nodeCSVs,
			@JsonProperty("edgeCSVs") ImmutableList<String> edgeCSVs,
			@JsonProperty("zoneCSVs") ImmutableList<String> zoneCSVs,
			@JsonProperty("serviceAreaCSVs") ImmutableList<String> serviceAreaCSVs,
			@JsonProperty("distributionCenterCSVs") ImmutableList<String> distributionCenterCSVs,
			@JsonProperty("depotLocationCSVs") ImmutableList<String> depotLocationCSVs,
			@JsonProperty("fleetCSVs") ImmutableList<String> fleetCSVs,
			@JsonProperty("depotRelationCSVs") ImmutableList<String> depotRelationCSVs,
			@JsonProperty("timeTableCSVs") ImmutableList<String> timeTableCSVs,
			@JsonProperty("businessLocationCSVs") ImmutableList<String> businessLocationCSVs,
			@JsonProperty("businessCSVs") ImmutableList<String> businessCSVs,
			@JsonProperty("businessRelationsCSVs") ImmutableList<String> businessRelationsCSVs,
			@JsonProperty("householdCSVs") ImmutableList<String> householdCSVs,
			@JsonProperty("personCSVs") ImmutableList<String> personCSVs,
			@JsonProperty("fixedDestinationCSVs") ImmutableList<String> fixedDestinationCSVs,
			@JsonProperty("parcelOrderBusinessCSVs") ImmutableList<String> parcelOrderBusinessCSVs,
			@JsonProperty("parcelOrdersPrivateCSVs") ImmutableList<String> parcelOrdersPrivateCSVs,
			@JsonProperty("parcelProductionBusinessCSVs") ImmutableList<String> parcelProductionBusinessCSVs,
			@JsonProperty("plannedToursCSVs") ImmutableList<String> plannedToursCSVs) {
		this.nodeCSVs = nodeCSVs;
		this.edgeCSVs = edgeCSVs;
		this.zoneCSVs = zoneCSVs;
		this.serviceAreaCSVs = serviceAreaCSVs;
		this.distributionCenterCSVs = distributionCenterCSVs;
		this.depotLocationCSVs = depotLocationCSVs;
		this.fleetCSVs = fleetCSVs;
		this.depotRelationCSVs = depotRelationCSVs;
		this.timeTableCSVs = timeTableCSVs;
		this.businessLocationCSVs = businessLocationCSVs;
		this.businessCSVs = businessCSVs;
		this.businessRelationsCSVs = businessRelationsCSVs;
		this.householdCSVs = householdCSVs;
		this.personCSVs = personCSVs;
		this.fixedDestinationCSVs = fixedDestinationCSVs;
		this.parcelOrderBusinessCSVs = parcelOrderBusinessCSVs;
		this.parcelOrdersPrivateCSVs = parcelOrdersPrivateCSVs;
		this.parcelProductionBusinessCSVs = parcelProductionBusinessCSVs;
		this.plannedToursCSVs = plannedToursCSVs;
	}

	public static LogiToppInputFileRegistry createRegistry(String configFilePath) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		SimpleModule module = new SimpleModule();
		module.addDeserializer(ImmutableList.class, new ImmutableListDeserializer());
		objectMapper.registerModule(module);
		return objectMapper.readValue(new File(configFilePath), LogiToppInputFileRegistry.class);
	}

	private static class ImmutableListDeserializer extends JsonDeserializer<ImmutableList<String>> {

		@Override
		public ImmutableList<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
				throws IOException {
			@SuppressWarnings("unchecked")
			List<String> list = jsonParser.readValueAs(ArrayList.class);
			return ImmutableList.copyOf(list);
		}
	}
}
