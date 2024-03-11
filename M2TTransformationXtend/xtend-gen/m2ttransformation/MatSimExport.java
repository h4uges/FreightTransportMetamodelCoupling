package m2ttransformation;

import MATSimFreightMetamodel.dataExchange.DataExchangePackage;
import MATSimFreightMetamodel.dataExchange.DataExchangeRoot;
import MATSimFreightMetamodel.freightContrib.Carrier;
import MATSimFreightMetamodel.freightContrib.CarrierPlan;
import MATSimFreightMetamodel.freightContrib.CarrierService;
import MATSimFreightMetamodel.freightContrib.CarrierShipment;
import MATSimFreightMetamodel.freightContrib.CarrierVehicle;
import MATSimFreightMetamodel.freightContrib.FleetSize;
import MATSimFreightMetamodel.freightContrib.ScheduledTour;
import MATSimFreightMetamodel.freightContrib.tour.Delivery;
import MATSimFreightMetamodel.freightContrib.tour.End;
import MATSimFreightMetamodel.freightContrib.tour.Leg;
import MATSimFreightMetamodel.freightContrib.tour.Pickup;
import MATSimFreightMetamodel.freightContrib.tour.ServiceActivity;
import MATSimFreightMetamodel.freightContrib.tour.Start;
import MATSimFreightMetamodel.freightContrib.tour.TourElement;
import MATSimFreightMetamodel.matsim.TransportMode;
import MATSimFreightMetamodel.matsim.core.network.Link;
import MATSimFreightMetamodel.matsim.core.network.Network;
import MATSimFreightMetamodel.matsim.core.network.Node;
import MATSimFreightMetamodel.matsim.vehicles.VehicleType;
import MATSimFreightMetamodel.matsim.vehicles.VehicleTypes;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class MatSimExport {
  public static void main(final String[] args) {
    final String modelName = "example1";
    final String inputFolder = Path.of(System.getProperty("user.dir"), "data", modelName).toString();
    final String outputFolder = Path.of(System.getProperty("user.dir"), "data", modelName).toString();
    final DataExchangeRoot matSimDataExchangeRoot = MatSimExport.loadMatSimModel(inputFolder, modelName);
    MatSimExport.buildNetworkFile(matSimDataExchangeRoot, outputFolder, modelName);
    MatSimExport.buildVehicleTypesFile(matSimDataExchangeRoot, outputFolder, modelName);
    MatSimExport.buildCarriersFile(matSimDataExchangeRoot, outputFolder, modelName);
  }

  public static String secondsToTimeStamp(final double seconds) {
    int _intValue = Double.valueOf(seconds).intValue();
    final int hours = (_intValue / 3600);
    int _intValue_1 = Double.valueOf(seconds).intValue();
    int _modulo = (_intValue_1 % 3600);
    final int minutes = (_modulo / 60);
    int _intValue_2 = Double.valueOf(seconds).intValue();
    final int secondsPart = (_intValue_2 % 60);
    return String.format("%02d:%02d:%02d", Integer.valueOf(hours), Integer.valueOf(minutes), Integer.valueOf(secondsPart));
  }

  public static DataExchangeRoot loadMatSimModel(final String inputFolder, final String modelName) {
    final ResourceSet resourceSet = MatSimExport.createAndInitializeResourceSet();
    final Resource resource = resourceSet.getResource(
      URI.createFileURI(Path.of(inputFolder, (modelName + "_matsim.xmi")).toString()), true);
    boolean _isEmpty = resource.getErrors().isEmpty();
    if (_isEmpty) {
      EObject _get = resource.getContents().get(0);
      return ((DataExchangeRoot) _get);
    } else {
      final Function<Resource.Diagnostic, String> _function = (Resource.Diagnostic e) -> {
        return e.getMessage();
      };
      String _collect = resource.getErrors().stream().<String>map(_function).collect(Collectors.joining(", "));
      String _plus = ((("loading model " + modelName) + " caused: ") + _collect);
      throw new IllegalArgumentException(_plus);
    }
  }

  public static ResourceSet createAndInitializeResourceSet() {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    DataExchangePackage.eINSTANCE.eClass();
    resourceSet.getPackageRegistry().put(DataExchangePackage.eNS_URI, DataExchangePackage.eINSTANCE);
    Map<String, Object> _extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    Map<String, Object> _extensionToFactoryMap_1 = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl_1 = new XMIResourceFactoryImpl();
    _extensionToFactoryMap_1.put("dataExchange", _xMIResourceFactoryImpl_1);
    return resourceSet;
  }

  public static Path buildNetworkFile(final DataExchangeRoot root, final String outputFolder, final String modelName) {
    try {
      Path _xblockexpression = null;
      {
        final CharSequence fileContent = MatSimExport.generateNetwork(root.getNetwork());
        Path filePath = Path.of(outputFolder, (("network_" + modelName) + ".xml"));
        _xblockexpression = Files.write(filePath, fileContent.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, 
          StandardOpenOption.TRUNCATE_EXISTING);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static CharSequence generateNetwork(final Network network) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<!DOCTYPE network SYSTEM \"http://www.matsim.org/files/dtd/network_v1.dtd\">");
    _builder.newLine();
    _builder.append("<network capDivider=\"");
    double _capacityPeriod = network.getCapacityPeriod();
    _builder.append(_capacityPeriod);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<nodes>");
    _builder.newLine();
    {
      EList<Node> _nodes = network.getNodes();
      for(final Node node : _nodes) {
        _builder.append("\t\t");
        CharSequence _generateNode = MatSimExport.generateNode(node);
        _builder.append(_generateNode, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</nodes>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<links capperiod=\"");
    double _capacityPeriod_1 = network.getCapacityPeriod();
    _builder.append(_capacityPeriod_1, "\t");
    _builder.append("\" effectivecellsize=\"");
    double _effectiveCellSize = network.getEffectiveCellSize();
    _builder.append(_effectiveCellSize, "\t");
    _builder.append("\" effectivelanewidth=\"");
    double _effectiveLaneWidht = network.getEffectiveLaneWidht();
    _builder.append(_effectiveLaneWidht, "\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      EList<Link> _links = network.getLinks();
      for(final Link link : _links) {
        _builder.append("\t\t");
        CharSequence _generateLink = MatSimExport.generateLink(link);
        _builder.append(_generateLink, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</links>");
    _builder.newLine();
    _builder.append("</network>");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generateNode(final Node node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<node id=\"");
    String _id = node.getId();
    _builder.append(_id);
    _builder.append("\" x=\"");
    double _x = node.getCoord().getX();
    _builder.append(_x);
    _builder.append("\" y=\"");
    double _y = node.getCoord().getY();
    _builder.append(_y);
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public static CharSequence generateLink(final Link link) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<link id=\"");
    String _id = link.getId();
    _builder.append(_id);
    _builder.append("\" from=\"");
    String _id_1 = link.getFrom().getId();
    _builder.append(_id_1);
    _builder.append("\" to=\"");
    String _id_2 = link.getTo().getId();
    _builder.append(_id_2);
    _builder.append("\" length=\"");
    double _length = link.getLength();
    _builder.append(_length);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("freespeed=\"");
    double _freespeed = link.getFreespeed();
    _builder.append(_freespeed, "      ");
    _builder.append("\" capacity=\"");
    double _capacity = link.getCapacity();
    _builder.append(_capacity, "      ");
    _builder.append("\" permlanes=\"");
    double _nofLanes = link.getNofLanes();
    _builder.append(_nofLanes, "      ");
    _builder.append("\" oneway=\"1\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public static Path buildVehicleTypesFile(final DataExchangeRoot root, final String outputFolder, final String modelName) {
    try {
      Path _xblockexpression = null;
      {
        final CharSequence fileContent = MatSimExport.generateVehicleTypes(root.getVehicleTypes());
        Path filePath = Path.of(outputFolder, (("vehicleTypes_" + modelName) + ".xml"));
        _xblockexpression = Files.write(filePath, fileContent.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, 
          StandardOpenOption.TRUNCATE_EXISTING);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static CharSequence generateVehicleTypes(final VehicleTypes vehicleTypes) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<vehicleDefinitions xmlns=\"http://www.matsim.org/files/dtd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.matsim.org/files/dtd http://www.matsim.org/files/dtd/vehicleDefinitions_v2.0.xsd\">");
    _builder.newLine();
    {
      EList<VehicleType> _vehicleTypes = vehicleTypes.getVehicleTypes();
      for(final VehicleType vehicleType : _vehicleTypes) {
        _builder.append("\t");
        CharSequence _generateVehicleType = MatSimExport.generateVehicleType(vehicleType);
        _builder.append(_generateVehicleType, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</vehicleDefinitions>");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generateVehicleType(final VehicleType vehicleType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<vehicleType id=\"");
    String _id = vehicleType.getId();
    _builder.append(_id);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<description>");
    String _description = vehicleType.getDescription();
    _builder.append(_description, "\t");
    _builder.append("</description>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    _builder.append("<capacity seats=\"");
    int _seats = vehicleType.getCapacity().getSeats();
    _builder.append(_seats, "\t   ");
    _builder.append("\" standingRoomInPersons=\"");
    int _standingRoom = vehicleType.getCapacity().getStandingRoom();
    _builder.append(_standingRoom, "\t   ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t             ");
    _builder.append("volumeInCubicMeters=\"");
    double _volumeInCubicMeters = vehicleType.getCapacity().getVolumeInCubicMeters();
    _builder.append(_volumeInCubicMeters, "\t             ");
    _builder.append("\" weightInTons=\"");
    double _weightInTons = vehicleType.getCapacity().getWeightInTons();
    _builder.append(_weightInTons, "\t             ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t             ");
    _builder.append("other=\"");
    double _other = vehicleType.getCapacity().getOther();
    _builder.append(_other, "\t             ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    _builder.append("<length meter=\"");
    double _length = vehicleType.getLength();
    _builder.append(_length, "\t   ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<widht meter=\"");
    double _width = vehicleType.getWidth();
    _builder.append(_width, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateDummyCostInformation = MatSimExport.generateDummyCostInformation();
    _builder.append(_generateDummyCostInformation, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateDummyEngineInformation = MatSimExport.generateDummyEngineInformation();
    _builder.append(_generateDummyEngineInformation, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<passengerCarEquivalents meter=\"");
    double _pcuEquivalents = vehicleType.getPcuEquivalents();
    _builder.append(_pcuEquivalents, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<networkMode networkMode=\"");
    TransportMode _networkMode = vehicleType.getNetworkMode();
    _builder.append(_networkMode, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<flowEfficiencyFactor factor=\"");
    double _flowEfficiencyFactor = vehicleType.getFlowEfficiencyFactor();
    _builder.append(_flowEfficiencyFactor, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("</vehicleType>");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generateDummyCostInformation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<costInformation fixedCostsPerDay=\"20.0\" costsPerMeter=\"0.35\" costsPerSecond=\"30.0\">");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generateDummyEngineInformation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<engineInformation>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<attributes>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<attribute name=\"fuelConsumptionLitersPerMeter\" class=\"java.lang.Double\">0.02</attribute>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<attribute name=\"fuelType\" class=\"org.matsim.vehicles.EngineInformation$FuelType\">gasoline</attribute>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</attributes>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</engineInformation>");
    _builder.newLine();
    return _builder;
  }

  public static Path buildCarriersFile(final DataExchangeRoot root, final String outputFolder, final String modelName) {
    try {
      Path _xblockexpression = null;
      {
        final CharSequence fileContent = MatSimExport.generateMATSimCarriers(root.getCarriers());
        Path filePath = Path.of(outputFolder, (("carrierPlans_" + modelName) + ".xml"));
        _xblockexpression = Files.write(filePath, fileContent.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, 
          StandardOpenOption.TRUNCATE_EXISTING);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static CharSequence generateMATSimCarriers(final Collection<Carrier> carriers) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<carriers xmlns=\"http://www.matsim.org/files/dtd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.matsim.org/files/dtd http://www.matsim.org/files/dtd/carriersDefinitions_v2.1.xsd\">");
    _builder.newLine();
    {
      for(final Carrier carrier : carriers) {
        _builder.append("    ");
        CharSequence _generateCarrier = MatSimExport.generateCarrier(carrier);
        _builder.append(_generateCarrier, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</carriers>");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generateCarrier(final Carrier carrier) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<carrier id=\"");
    String _id = carrier.getId();
    _builder.append(_id);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<capabilities fleetSize=\"");
    FleetSize _fleetSize = carrier.getCarrierCapabilities().getFleetSize();
    _builder.append(_fleetSize, "    ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<vehicles>");
    _builder.newLine();
    {
      EList<CarrierVehicle> _carrierVehicles = carrier.getCarrierCapabilities().getCarrierVehicles();
      for(final CarrierVehicle vehicle : _carrierVehicles) {
        _builder.append("\t\t\t");
        CharSequence _generateVehicle = MatSimExport.generateVehicle(vehicle);
        _builder.append(_generateVehicle, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("</vehicles>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</capabilities>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<services>");
    _builder.newLine();
    {
      EList<CarrierService> _services = carrier.getServices();
      for(final CarrierService carrierService : _services) {
        _builder.append("\t\t");
        CharSequence _generateCarrierService = MatSimExport.generateCarrierService(carrierService);
        _builder.append(_generateCarrierService, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</services>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<shipments>");
    _builder.newLine();
    {
      EList<CarrierShipment> _shipments = carrier.getShipments();
      for(final CarrierShipment carrierShipment : _shipments) {
        _builder.append("\t \t");
        CharSequence _generateCarrierShipment = MatSimExport.generateCarrierShipment(carrierShipment);
        _builder.append(_generateCarrierShipment, "\t \t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</shipments>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<plans>");
    _builder.newLine();
    {
      CarrierPlan _plan = carrier.getPlan();
      boolean _tripleNotEquals = (_plan != null);
      if (_tripleNotEquals) {
        _builder.append("\t\t");
        CharSequence _generateCarrierPlan = MatSimExport.generateCarrierPlan(carrier.getPlan());
        _builder.append(_generateCarrierPlan, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</plans>");
    _builder.newLine();
    _builder.append("</carrier>");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generateVehicle(final CarrierVehicle vehicle) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<vehicle id=\"");
    String _id = vehicle.getId();
    _builder.append(_id);
    _builder.append("\" depotLinkId=\"");
    String _id_1 = vehicle.getLocation().getId();
    _builder.append(_id_1);
    _builder.append("\" typeId=\"");
    String _id_2 = vehicle.getType().getId();
    _builder.append(_id_2);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("earliestStart=\"");
    String _secondsToTimeStamp = MatSimExport.secondsToTimeStamp(vehicle.getEarliestStartTime());
    _builder.append(_secondsToTimeStamp, "\t");
    _builder.append("\" latestEnd=\"");
    String _secondsToTimeStamp_1 = MatSimExport.secondsToTimeStamp(vehicle.getLatestEndTime());
    _builder.append(_secondsToTimeStamp_1, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public static CharSequence generateCarrierService(final CarrierService carrierService) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<service id=\"");
    String _id = carrierService.getId();
    _builder.append(_id);
    _builder.append("\" to=\"");
    String _id_1 = carrierService.getLocation().getId();
    _builder.append(_id_1);
    _builder.append("\" capacityDemand=\"");
    int _capacityDemand = carrierService.getCapacityDemand();
    _builder.append(_capacityDemand);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("earliestStart=\"");
    String _secondsToTimeStamp = MatSimExport.secondsToTimeStamp(carrierService.getTimeWindow().getStart());
    _builder.append(_secondsToTimeStamp, "         ");
    _builder.append("\" latestEnd=\"");
    String _secondsToTimeStamp_1 = MatSimExport.secondsToTimeStamp(carrierService.getTimeWindow().getEnd());
    _builder.append(_secondsToTimeStamp_1, "         ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("serviceDuration=\"");
    String _secondsToTimeStamp_2 = MatSimExport.secondsToTimeStamp(carrierService.getServiceDuration());
    _builder.append(_secondsToTimeStamp_2, "         ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("</service>");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generateCarrierShipment(final CarrierShipment carrierShipment) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<shipment id=\"");
    String _id = carrierShipment.getId();
    _builder.append(_id);
    _builder.append("\" from=\"");
    String _id_1 = carrierShipment.getFrom().getId();
    _builder.append(_id_1);
    _builder.append("\" to=\"");
    String _id_2 = carrierShipment.getTo().getId();
    _builder.append(_id_2);
    _builder.append("\" size=\"");
    int _size = carrierShipment.getSize();
    _builder.append(_size);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("          ");
    _builder.append("startPickup=\"");
    String _secondsToTimeStamp = MatSimExport.secondsToTimeStamp(carrierShipment.getPickupTimeWindow().getStart());
    _builder.append(_secondsToTimeStamp, "          ");
    _builder.append("\" endPickup=\"");
    String _secondsToTimeStamp_1 = MatSimExport.secondsToTimeStamp(carrierShipment.getPickupTimeWindow().getEnd());
    _builder.append(_secondsToTimeStamp_1, "          ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("          ");
    _builder.append("pickupServiceTime=\"");
    String _secondsToTimeStamp_2 = MatSimExport.secondsToTimeStamp(carrierShipment.getPickupServiceTime());
    _builder.append(_secondsToTimeStamp_2, "          ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("          ");
    _builder.append("startDelivery=\"");
    String _secondsToTimeStamp_3 = MatSimExport.secondsToTimeStamp(carrierShipment.getDeliveryTimeWindow().getStart());
    _builder.append(_secondsToTimeStamp_3, "          ");
    _builder.append("\" endDelivery=\"");
    String _secondsToTimeStamp_4 = MatSimExport.secondsToTimeStamp(carrierShipment.getDeliveryTimeWindow().getEnd());
    _builder.append(_secondsToTimeStamp_4, "          ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("          ");
    _builder.append("deliveryServiceTime=\"");
    String _secondsToTimeStamp_5 = MatSimExport.secondsToTimeStamp(carrierShipment.getDeliveryServiceTime());
    _builder.append(_secondsToTimeStamp_5, "          ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("</shipment>");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generateCarrierPlan(final CarrierPlan plan) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<plan score=\"");
    double _score = plan.getScore();
    _builder.append(_score);
    _builder.append("\" selected=\"true\">");
    _builder.newLineIfNotEmpty();
    {
      EList<ScheduledTour> _scheduledTours = plan.getScheduledTours();
      for(final ScheduledTour tour : _scheduledTours) {
        _builder.append("\t");
        CharSequence _generateTour = MatSimExport.generateTour(tour);
        _builder.append(_generateTour, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</plan>");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generateTour(final ScheduledTour tour) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tour tourId=\"");
    String _id = tour.getTour().getId();
    _builder.append(_id);
    _builder.append("\" vehicleId=\"");
    String _id_1 = tour.getVehicle().getId();
    _builder.append(_id_1);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      EList<TourElement> _tourElements = tour.getTour().getTourElements();
      for(final TourElement tourElement : _tourElements) {
        {
          if ((tourElement instanceof ServiceActivity)) {
            _builder.append("\t");
            CharSequence _generateServiceActivity = MatSimExport.generateServiceActivity(((ServiceActivity) tourElement));
            _builder.append(_generateServiceActivity, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((tourElement instanceof Start)) {
            _builder.append("\t");
            CharSequence _generateStart = MatSimExport.generateStart(((Start) tourElement), tour.getDepartureTime());
            _builder.append(_generateStart, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((tourElement instanceof End)) {
            _builder.append("\t");
            CharSequence _generateEnd = MatSimExport.generateEnd(((End) tourElement));
            _builder.append(_generateEnd, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((tourElement instanceof Pickup)) {
            _builder.append("\t");
            CharSequence _generatePickup = MatSimExport.generatePickup(((Pickup) tourElement));
            _builder.append(_generatePickup, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((tourElement instanceof Delivery)) {
            _builder.append("\t");
            CharSequence _generateDelivery = MatSimExport.generateDelivery(((Delivery) tourElement));
            _builder.append(_generateDelivery, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((tourElement instanceof ServiceActivity)) {
            _builder.append("\t");
            CharSequence _generateLeg = MatSimExport.generateLeg(((Leg) tourElement));
            _builder.append(_generateLeg, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("</tour>");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generateServiceActivity(final ServiceActivity serviceActivity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<act type=\"service\" serviceId=\"");
    String _id = serviceActivity.getService().getId();
    _builder.append(_id);
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public static CharSequence generateStart(final Start start, final double departureTime) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<act type=\"start\" end_time=\"");
    String _secondsToTimeStamp = MatSimExport.secondsToTimeStamp(departureTime);
    _builder.append(_secondsToTimeStamp);
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public static CharSequence generateEnd(final End end) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<act type=\"end\"/>");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence generatePickup(final Pickup pickup) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<act type=\"pickup\" shipmentId=\"");
    String _id = pickup.getShipment().getId();
    _builder.append(_id);
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public static CharSequence generateDelivery(final Delivery delivery) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<act type=\"delivery\" shipmentId=\"");
    String _id = delivery.getShipment().getId();
    _builder.append(_id);
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public static CharSequence generateLeg(final Leg leg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<leg expected_dep_time=\"");
    String _secondsToTimeStamp = MatSimExport.secondsToTimeStamp(leg.getExpectedDepartureTime());
    _builder.append(_secondsToTimeStamp);
    _builder.append("\" expected_transp_time=\"");
    String _secondsToTimeStamp_1 = MatSimExport.secondsToTimeStamp(leg.getExpectedTransportTime());
    _builder.append(_secondsToTimeStamp_1);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<route></route>");
    _builder.newLine();
    _builder.append("</leg>");
    _builder.newLine();
    return _builder;
  }
}
