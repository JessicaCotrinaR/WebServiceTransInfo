package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 11/15/16.
 */
public class VehicleInformationModel extends Model{

    public String motorVehicle;
    public String tripDirection;
    public String specialFunctionMotor;
    public String emergencyUse;
    public String mph;
    public String postedSpeedLimit;
    public String motorVehicleManeuver;
    public int idNewVehicleFK;

    public VehicleInformationModel() {
    }
    public int addVehicleInformationModel(VehicleInformationModel vehicleInformationModel) {
        int result;
        String sql = "INSERT INTO  VehicleInformation (MotorVehicle, TripDirection, SpecialFunctionMotor, EmergencyUse, MPH, PostedSpeedLimit, MotorVehicleManeuver, idNewVehicleFK) VALUES (:MotorVehicle, :TripDirection, :SpecialFunctionMotor, :EmergencyUse, :MPH, :PostedSpeedLimit, :MotorVehicleManeuver, :idNewVehicleFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("MotorVehicle",  vehicleInformationModel.motorVehicle);
        insert.setParameter("TripDirection", vehicleInformationModel.tripDirection);
        insert.setParameter("SpecialFunctionMotor", vehicleInformationModel.specialFunctionMotor);
        insert.setParameter("EmergencyUse", vehicleInformationModel.emergencyUse);
        insert.setParameter("MPH", vehicleInformationModel.mph);
        insert.setParameter("PostedSpeedLimit", vehicleInformationModel.postedSpeedLimit);
        insert.setParameter("MotorVehicleManeuver", vehicleInformationModel.motorVehicleManeuver);
        insert.setParameter("idNewVehicleFK", vehicleInformationModel.idNewVehicleFK);

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
