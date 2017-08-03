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
}
