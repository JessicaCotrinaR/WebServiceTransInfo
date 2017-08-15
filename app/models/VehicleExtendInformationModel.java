package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 4/6/17.
 */
public class VehicleExtendInformationModel extends Model {
    public String vehicleType;
    public String occupants;
    public String vehicleMotor;
    public String directionTripCB;
    public String functionSpecialMVT;
    public String motorEmergencyVU;
    public String mPH;
    public String mPHDescription;
    public String maneuverVehicleMotor;
    public String descriptionRoad;
    public String alignment;
    public String slope;
    public String laneCantidad;
    public String laneCategoria;
    public String laneTipoCarril;
    public String typeControlTraffic;
    public String inOperationLost;
    public String primeraCategoriaEvent;
    public String segundaCategoriaEvent;
    public String terceraCategoriaEvent;
    public String cuartaCategoria;
    public String primerEvent;
    public String segundoEvent;
    public String tecerEvent;
    public String cuartoEvent;
    public String busUse;
    public String lefthPlace;
    public String towedDamage;
    public String primerDefectoMecánico;
    public String segundoDefectoMecánico;
    public String initialContactPoint;
    public String affectedArea;
    public String extendDamage;
    public String commercialVehicleUse;
    public String vehicleMoving;
    public String authorizedDriver;
    public String inspectionUpdate;
    public String specialPermit;
    public String grossWeight;
    public String totalAxis;
    public String vehicleConfiguration;
    public String heavyVehicleType;
    public String hazardousMaterial;
    public String diamondIdNumber;
    public String thereHazardousMaterial;
    public int vehicleFK;
    public int idVehicleExtendInformation;

    public VehicleExtendInformationModel() {
    }
    public int addVehicleExtendInformationModel(VehicleExtendInformationModel vehicleExtendInformationModel) {
        int result;
        String sql = "INSERT INTO  VehicleExtendInformation (VehicleType, Occupants, VehicleMotor, DirectionTripCB, FunctionSpecialMVT," +
                "MotorEmergencyVU, MPH, MPHDescription,ManeuverVehicleMotor, DescriptionRoad, Alignment, Slope, LaneCantidad," +
                " LaneCategoria, LaneTipoCarril, TypeControlTraffic, InOperationLost, PrimeraCategoriaEvent, SegundaCategoriaEvent, " +
                " TerceraCategoriaEvent,CuartaCategoria, PrimerEvent, SegundoEvent, TecerEvent, CuartoEvent, BusUse, LefthPlace," +
                "TowedDamage, PrimerDefectoMecánico, SegundoDefectoMecánico, InitialContactPoint, AffectedArea, ExtendDamage, CommercialVehicleUse," +
                " VehicleMoving, AuthorizedDriver, InspectionUpdate, SpecialPermit, GrossWeight, TotalAxis, VehicleConfiguration," +
                " HeavyVehicleType, HazardousMaterial,DiamondIdNumber, ThereHazardousMaterial, VehicleFK) " +

                "VALUES (:VehicleType, :Occupants, :VehicleMotor, :DirectionTripCB, :FunctionSpecialMVT, :MotorEmergencyVU," +
                " :MPH, :MPHDescription, :ManeuverVehicleMotor, :DescriptionRoad, :Alignment, :Slope, :LaneCantidad, :LaneCategoria, :LaneTipoCarril," +
                " :TypeControlTraffic, :InOperationLost, :PrimeraCategoriaEvent, :SegundaCategoriaEvent, :TerceraCategoriaEvent," +
                ":CuartaCategoria, :PrimerEvent, :SegundoEvent, :TecerEvent, :CuartoEvent, :BusUse, :LefthPlace, :TowedDamage, :PrimerDefectoMecánico," +
                " :SegundoDefectoMecánico, :InitialContactPoint, :AffectedArea, :ExtendDamage, :CommercialVehicleUse, :VehicleMoving, :AuthorizedDriver, " +
                "  :InspectionUpdate, :SpecialPermit, :GrossWeight, :TotalAxis, :VehicleConfiguration," +
                " :HeavyVehicleType, :HazardousMaterial, :DiamondIdNumber, :ThereHazardousMaterial, :VehicleFK)";

        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("VehicleType",  vehicleExtendInformationModel.vehicleType);
        insert.setParameter("Occupants", vehicleExtendInformationModel.occupants);
        insert.setParameter("VehicleMotor", vehicleExtendInformationModel.vehicleMotor);
        insert.setParameter("DirectionTripCB", vehicleExtendInformationModel.directionTripCB);
        insert.setParameter("FunctionSpecialMVT", vehicleExtendInformationModel.functionSpecialMVT);
        insert.setParameter("MotorEmergencyVU", vehicleExtendInformationModel.motorEmergencyVU);
        insert.setParameter("MPH", vehicleExtendInformationModel.mPH);
        insert.setParameter("MPHDescription", vehicleExtendInformationModel.mPHDescription);
        insert.setParameter("ManeuverVehicleMotor", vehicleExtendInformationModel.maneuverVehicleMotor);
        insert.setParameter("DescriptionRoad", vehicleExtendInformationModel.descriptionRoad);
        insert.setParameter("Alignment", vehicleExtendInformationModel.alignment);
        insert.setParameter("Slope", vehicleExtendInformationModel.slope);
        insert.setParameter("LaneCantidad", vehicleExtendInformationModel.laneCantidad);
        insert.setParameter("LaneCategoria", vehicleExtendInformationModel.laneCategoria);
        insert.setParameter("LaneTipoCarril", vehicleExtendInformationModel.laneTipoCarril);
        insert.setParameter("TypeControlTraffic", vehicleExtendInformationModel.typeControlTraffic);
        insert.setParameter("InOperationLost", vehicleExtendInformationModel.inOperationLost);
        insert.setParameter("PrimeraCategoriaEvent", vehicleExtendInformationModel.primeraCategoriaEvent);
        insert.setParameter("SegundaCategoriaEvent", vehicleExtendInformationModel.segundaCategoriaEvent);
        insert.setParameter("TerceraCategoriaEvent", vehicleExtendInformationModel.terceraCategoriaEvent);
        insert.setParameter("CuartaCategoria", vehicleExtendInformationModel.cuartaCategoria);
        insert.setParameter("PrimerEvent", vehicleExtendInformationModel.primerEvent);
        insert.setParameter("SegundoEvent", vehicleExtendInformationModel.segundoEvent);
        insert.setParameter("TecerEvent", vehicleExtendInformationModel.tecerEvent);
        insert.setParameter("CuartoEvent", vehicleExtendInformationModel.cuartoEvent);
        insert.setParameter("BusUse", vehicleExtendInformationModel.busUse);
        insert.setParameter("LefthPlace", vehicleExtendInformationModel.lefthPlace);
        insert.setParameter("TowedDamage", vehicleExtendInformationModel.towedDamage);
        insert.setParameter("PrimerDefectoMecánico", vehicleExtendInformationModel.primerDefectoMecánico);
        insert.setParameter("SegundoDefectoMecánico", vehicleExtendInformationModel.segundoDefectoMecánico);
        insert.setParameter("InitialContactPoint", vehicleExtendInformationModel.initialContactPoint);
        insert.setParameter("AffectedArea", vehicleExtendInformationModel.affectedArea);
        insert.setParameter("ExtendDamage", vehicleExtendInformationModel.extendDamage);
        insert.setParameter("CommercialVehicleUse", vehicleExtendInformationModel.commercialVehicleUse);
        insert.setParameter("VehicleMoving", vehicleExtendInformationModel.vehicleMoving);
        insert.setParameter("AuthorizedDriver", vehicleExtendInformationModel.authorizedDriver);
        insert.setParameter("InspectionUpdate", vehicleExtendInformationModel.inspectionUpdate);
        insert.setParameter("SpecialPermit", vehicleExtendInformationModel.specialPermit);
        insert.setParameter("GrossWeight", vehicleExtendInformationModel.grossWeight);
        insert.setParameter("TotalAxis", vehicleExtendInformationModel.totalAxis);
        insert.setParameter("VehicleConfiguration", vehicleExtendInformationModel.vehicleConfiguration);
        insert.setParameter("HeavyVehicleType", vehicleExtendInformationModel.heavyVehicleType);
        insert.setParameter("HazardousMaterial", vehicleExtendInformationModel.hazardousMaterial);
        insert.setParameter("DiamondIdNumber", vehicleExtendInformationModel.diamondIdNumber);
        insert.setParameter("ThereHazardousMaterial", vehicleExtendInformationModel.thereHazardousMaterial);
        insert.setParameter("VehicleFK", vehicleExtendInformationModel.vehicleFK);


        System.out.println("Update: " + insert.getSql());
        try {
            result = insert.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }


    public int updateVehicleExtendInformationModel(VehicleExtendInformationModel vehicleExtendInformationModel) {
        int result;
        String sql = "UPDATE VehicleExtendInformation SET VehicleType = :VehicleType, Occupants = :Occupants, VehicleMotor = :VehicleMotor, DirectionTripCB = :DirectionTripCB, FunctionSpecialMVT = :FunctionSpecialMVT," +
                "MotorEmergencyVU = :MotorEmergencyVU, MPH = :MPH, MPHDescription = :MPHDescription, ManeuverVehicleMotor = :ManeuverVehicleMotor, DescriptionRoad = :DescriptionRoad, Alignment = :Alignment, Slope = :Slope, LaneCantidad = :LaneCantidad," +
                " LaneCategoria = :LaneCategoria, LaneTipoCarril = :LaneTipoCarril, TypeControlTraffic = :TypeControlTraffic, InOperationLost = :InOperationLost, PrimeraCategoriaEvent = :PrimeraCategoriaEvent, SegundaCategoriaEvent = :SegundaCategoriaEvent, " +
                " TerceraCategoriaEvent = :TerceraCategoriaEvent, CuartaCategoria = :CuartaCategoria, PrimerEvent =:PrimerEvent, SegundoEvent = :SegundoEvent, TecerEvent = :TecerEvent, CuartoEvent = :CuartoEvent, BusUse = :BusUse, LefthPlace = :LefthPlace," +
                "TowedDamage = :TowedDamage, PrimerDefectoMecánico = :PrimerDefectoMecánico, SegundoDefectoMecánico = :SegundoDefectoMecánico, InitialContactPoint = :InitialContactPoint, AffectedArea = :AffectedArea, ExtendDamage = :ExtendDamage, CommercialVehicleUse = :CommercialVehicleUse," +
                " VehicleMoving = :VehicleMoving, AuthorizedDriver = :AuthorizedDriver, InspectionUpdate = :InspectionUpdate, SpecialPermit = :SpecialPermit, GrossWeight = :GrossWeight, TotalAxis = :TotalAxis, VehicleConfiguration = :VehicleConfiguration," +
                " HeavyVehicleType = :HeavyVehicleType, HazardousMaterial = :HazardousMaterial,DiamondIdNumber = :DiamondIdNumber, ThereHazardousMaterial = :ThereHazardousMaterial, VehicleFK = :VehicleFK " +
                "WHERE idVehicleExtendInformation = :idVehicleExtendInformation";
        SqlUpdate update = Ebean.createSqlUpdate(sql);

        update.setParameter("VehicleType",  vehicleExtendInformationModel.vehicleType);
        update.setParameter("Occupants", vehicleExtendInformationModel.occupants);
        update.setParameter("VehicleMotor", vehicleExtendInformationModel.vehicleMotor);
        update.setParameter("DirectionTripCB", vehicleExtendInformationModel.directionTripCB);
        update.setParameter("FunctionSpecialMVT", vehicleExtendInformationModel.functionSpecialMVT);
        update.setParameter("MotorEmergencyVU", vehicleExtendInformationModel.motorEmergencyVU);
        update.setParameter("MPH", vehicleExtendInformationModel.mPH);
        update.setParameter("MPHDescription", vehicleExtendInformationModel.mPHDescription);
        update.setParameter("ManeuverVehicleMotor", vehicleExtendInformationModel.maneuverVehicleMotor);
        update.setParameter("DescriptionRoad", vehicleExtendInformationModel.descriptionRoad);
        update.setParameter("Alignment", vehicleExtendInformationModel.alignment);
        update.setParameter("Slope", vehicleExtendInformationModel.slope);
        update.setParameter("LaneCantidad", vehicleExtendInformationModel.laneCantidad);
        update.setParameter("LaneCategoria", vehicleExtendInformationModel.laneCategoria);
        update.setParameter("LaneTipoCarril", vehicleExtendInformationModel.laneTipoCarril);
        update.setParameter("TypeControlTraffic", vehicleExtendInformationModel.typeControlTraffic);
        update.setParameter("InOperationLost", vehicleExtendInformationModel.inOperationLost);
        update.setParameter("PrimeraCategoriaEvent", vehicleExtendInformationModel.primeraCategoriaEvent);
        update.setParameter("SegundaCategoriaEvent", vehicleExtendInformationModel.segundaCategoriaEvent);
        update.setParameter("TerceraCategoriaEvent", vehicleExtendInformationModel.terceraCategoriaEvent);
        update.setParameter("CuartaCategoria", vehicleExtendInformationModel.cuartaCategoria);
        update.setParameter("PrimerEvent", vehicleExtendInformationModel.primerEvent);
        update.setParameter("SegundoEvent", vehicleExtendInformationModel.segundoEvent);
        update.setParameter("TecerEvent", vehicleExtendInformationModel.tecerEvent);
        update.setParameter("CuartoEvent", vehicleExtendInformationModel.cuartoEvent);
        update.setParameter("BusUse", vehicleExtendInformationModel.busUse);
        update.setParameter("LefthPlace", vehicleExtendInformationModel.lefthPlace);
        update.setParameter("TowedDamage", vehicleExtendInformationModel.towedDamage);
        update.setParameter("PrimerDefectoMecánico", vehicleExtendInformationModel.primerDefectoMecánico);
        update.setParameter("SegundoDefectoMecánico", vehicleExtendInformationModel.segundoDefectoMecánico);
        update.setParameter("InitialContactPoint", vehicleExtendInformationModel.initialContactPoint);
        update.setParameter("AffectedArea", vehicleExtendInformationModel.affectedArea);
        update.setParameter("ExtendDamage", vehicleExtendInformationModel.extendDamage);
        update.setParameter("CommercialVehicleUse", vehicleExtendInformationModel.commercialVehicleUse);
        update.setParameter("VehicleMoving", vehicleExtendInformationModel.vehicleMoving);
        update.setParameter("AuthorizedDriver", vehicleExtendInformationModel.authorizedDriver);
        update.setParameter("InspectionUpdate", vehicleExtendInformationModel.inspectionUpdate);
        update.setParameter("SpecialPermit", vehicleExtendInformationModel.specialPermit);
        update.setParameter("GrossWeight", vehicleExtendInformationModel.grossWeight);
        update.setParameter("TotalAxis", vehicleExtendInformationModel.totalAxis);
        update.setParameter("VehicleConfiguration", vehicleExtendInformationModel.vehicleConfiguration);
        update.setParameter("HeavyVehicleType", vehicleExtendInformationModel.heavyVehicleType);
        update.setParameter("HazardousMaterial", vehicleExtendInformationModel.hazardousMaterial);
        update.setParameter("DiamondIdNumber", vehicleExtendInformationModel.diamondIdNumber);
        update.setParameter("ThereHazardousMaterial", vehicleExtendInformationModel.thereHazardousMaterial);
        update.setParameter("VehicleFK", vehicleExtendInformationModel.vehicleFK);

        update.setParameter("idVehicleExtendInformation", vehicleExtendInformationModel.idVehicleExtendInformation);


        try {
            result = update.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }
}
