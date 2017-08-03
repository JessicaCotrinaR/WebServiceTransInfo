package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 4/4/17.
 */
public class VehicleAccidentModel extends Model {
    public int accidentfk;
    public int vehiclefk;

    public VehicleAccidentModel() {
    }

    public int addVehicleAccidentModel(VehicleAccidentModel vehicleAccidentModel){
        int result;
        String sql = "INSERT INTO AccidentVehicle (Accidentfk, Vehiclefk) VALUES (:Accidentfk, :Vehiclefk)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("Accidentfk",  vehicleAccidentModel.accidentfk);
        insert.setParameter("Vehiclefk", vehicleAccidentModel.vehiclefk);
//
//        System.out.println(accidentfk +"accident");
//        System.out.println(vehiclefk + "vehicle");
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
