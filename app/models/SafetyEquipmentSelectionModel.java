package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 10/11/16.
 */
public class SafetyEquipmentSelectionModel extends Model {
    public int safetyEquipmentIDFK;
    public int idPersonVehicleOccupantFK;
    public int idNewVehicleFK;
    public int idNewPersonFK;


    public SafetyEquipmentSelectionModel() {
    }
    public int addSafetyEquipmentSelection(SafetyEquipmentSelectionModel safetyEquipmentSelectionModel) {
        int result;
        String sql = "INSERT INTO SafetyEquipmentSelection (SafetyEquipmentIDFK, idPersonVehicleOccupantFK, idNewVehicleFK, idNewPersonFK  ) VALUES (:SafetyEquipmentIDFK, :idPersonVehicleOccupantFK, :idNewVehicleFK, :idNewPersonFK )";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("SafetyEquipmentIDFK",  safetyEquipmentSelectionModel.safetyEquipmentIDFK);
        insert.setParameter("idPersonVehicleOccupantFK", safetyEquipmentSelectionModel.idPersonVehicleOccupantFK);
        insert.setParameter("idNewVehicleFK", safetyEquipmentSelectionModel.idNewVehicleFK);
        insert.setParameter("idNewPersonFK", safetyEquipmentSelectionModel.idNewPersonFK);
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
