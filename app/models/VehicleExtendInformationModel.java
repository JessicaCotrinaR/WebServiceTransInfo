package models;

import com.avaje.ebean.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jessicacotrina on 4/6/17.
 */
@Entity
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
    public long addVehicleExtendInformationModel(VehicleExtendInformationModel vehicleExtendInformationModel) {
        long result;
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
        Transaction tx = Ebean.beginTransaction();
        boolean success= true;

        try {
            result = insert.execute();
            String sqlgetId = "SELECT @@IDENTITY as theId";
            SqlRow id = Ebean.createSqlQuery(sqlgetId)
                    .findUnique();
            result = id.getLong("theId");
            System.out.println("Resulting Id: " + result);


        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
            success= false;
        }
        finally {
            if(success){
                tx.commit();
            }
            else {
                tx.rollback();
            }
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
            update.execute();
            result = idVehicleExtendInformation;
        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }

    public List<VehicleExtendInformationModel> vehicleExtendInformationByIdNewVehicle(String newVehicleId){

        Transaction t = Ebean.beginTransaction();
        List<VehicleExtendInformationModel> listVehicleExtendInformation = new ArrayList<>();
        try {
            String sql = "SELECT  n.VehicleType, n.Occupants, n.VehicleMotor, n.DirectionTripCB, n.FunctionSpecialMVT," +
                    "n.MotorEmergencyVU, n.MPH, n.MPHDescription, n.ManeuverVehicleMotor, n.DescriptionRoad, n.Alignment, n.Slope, n.LaneCantidad," +
                    " n.LaneCategoria, n.LaneTipoCarril, n.TypeControlTraffic, n.InOperationLost, n.PrimeraCategoriaEvent, n.SegundaCategoriaEvent, " +
                    " n.TerceraCategoriaEvent, n.CuartaCategoria, n.PrimerEvent, n.SegundoEvent, n.TecerEvent, n.CuartoEvent, n.BusUse, n.LefthPlace," +
                    "n.TowedDamage, n.PrimerDefectoMecánico, n.SegundoDefectoMecánico, n.InitialContactPoint, n.AffectedArea, n.ExtendDamage, n.CommercialVehicleUse," +
                    " n.VehicleMoving, n.AuthorizedDriver, n.InspectionUpdate, n.SpecialPermit, n.GrossWeight, n.TotalAxis, n.VehicleConfiguration," +
                    " n.HeavyVehicleType, n.HazardousMaterial, n.DiamondIdNumber, n.ThereHazardousMaterial, n.VehicleFK, n.idVehicleExtendInformation " +


                    "FROM NewVehicle b, VehicleExtendInformation n " +
                    "WHERE b.idNewVehicle = n.VehicleFK AND " +
                    "b.idNewVehicle =" + newVehicleId;

                    RawSql rawSql = RawSqlBuilder.parse(sql)
                    .columnMapping("n.VehicleType",  "vehicleType")
                    .columnMapping("n.Occupants", "occupants")
                    .columnMapping("n.VehicleMotor", "vehicleMotor")
                    .columnMapping("n.DirectionTripCB", "directionTripCB")
                    .columnMapping("n.FunctionSpecialMVT", "functionSpecialMVT")
                    .columnMapping("n.MotorEmergencyVU", "motorEmergencyVU")
                    .columnMapping("n.MPH", "mPH")
                    .columnMapping("n.MPHDescription", "mPHDescription")
                    .columnMapping("n.ManeuverVehicleMotor", "maneuverVehicleMotor")
                    .columnMapping("n.DescriptionRoad", "descriptionRoad")
                    .columnMapping("n.Alignment", "alignment")
                    .columnMapping("n.Slope", "slope")
                    .columnMapping("n.LaneCantidad", "laneCantidad")
                    .columnMapping("n.LaneCategoria", "laneCategoria")
                    .columnMapping("n.LaneTipoCarril", "laneTipoCarril")
                    .columnMapping("n.TypeControlTraffic", "typeControlTraffic")
                    .columnMapping("n.InOperationLost", "inOperationLost")
                    .columnMapping("n.PrimeraCategoriaEvent", "primeraCategoriaEvent")
                    .columnMapping("n.SegundaCategoriaEvent", "segundaCategoriaEvent")
                    .columnMapping("n.TerceraCategoriaEvent", "terceraCategoriaEvent")
                    .columnMapping("n.CuartaCategoria", "cuartaCategoria")
                    .columnMapping("n.PrimerEvent", "primerEvent")
                    .columnMapping("n.SegundoEvent", "segundoEvent")
                    .columnMapping("n.TecerEvent", "tecerEvent")
                    .columnMapping("n.CuartoEvent", "cuartoEvent")
                    .columnMapping("n.BusUse", "busUse")
                    .columnMapping("n.LefthPlace", "lefthPlace")
                    .columnMapping("n.TowedDamage", "towedDamage")
                    .columnMapping("n.PrimerDefectoMecánico", "primerDefectoMecánico")
                    .columnMapping("n.SegundoDefectoMecánico", "segundoDefectoMecánico")
                    .columnMapping("n.InitialContactPoint", "initialContactPoint")
                    .columnMapping("n.AffectedArea", "affectedArea")
                    .columnMapping("n.ExtendDamage", "extendDamage")
                    .columnMapping("n.CommercialVehicleUse", "commercialVehicleUse")
                    .columnMapping("n.VehicleMoving", "vehicleMoving")
                    .columnMapping("n.AuthorizedDriver", "authorizedDriver")
                    .columnMapping("n.InspectionUpdate", "inspectionUpdate")
                    .columnMapping("n.SpecialPermit", "specialPermit")
                    .columnMapping("n.GrossWeight", "grossWeight")
                    .columnMapping("n.TotalAxis", "totalAxis")
                    .columnMapping("n.VehicleConfiguration", "vehicleConfiguration")
                    .columnMapping("n.HeavyVehicleType", "heavyVehicleType")
                    .columnMapping("n.HazardousMaterial", "hazardousMaterial")
                    .columnMapping("n.DiamondIdNumber", "diamondIdNumber")
                    .columnMapping("n.ThereHazardousMaterial", "thereHazardousMaterial")
                    .columnMapping("n.VehicleFK", "vehicleFK")
                    .columnMapping("n.idVehicleExtendInformation", "idVehicleExtendInformation")
                    .create();

            Query<VehicleExtendInformationModel> query = Ebean.find(VehicleExtendInformationModel.class);
            query.setRawSql(rawSql)
                    .setParameter("idNewVehicle", newVehicleId);
            listVehicleExtendInformation = query.findList();
            t.commit();


        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            t.end();
        }

        return listVehicleExtendInformation;

    }
}
