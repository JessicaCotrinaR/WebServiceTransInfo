package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 1/26/17.
 */
public class ConditionCollisionTimeSelectioModel extends Model {

    public int idCondionFK;
    public int idPersonInformationVehicleOccupantFK;
    public int idNewPersonFK;
    public int idNewVehicleFK;

    public ConditionCollisionTimeSelectioModel() {
    }

    public int addConditionCollisionTimeSelectioModel (ConditionCollisionTimeSelectioModel conditionCollisionTimeSelectioModel) {
        int result;
        String sql = "INSERT INTO ConditionCollisionTimeSelection (idCondionFK, idPersonInformationVehicleOccupantFK, idNewPersonFK, idNewVehicleFK) VALUES (:idCondionFK, :idPersonInformationVehicleOccupantFK, :idNewPersonFK, :idNewVehicleFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("idCondionFK",  conditionCollisionTimeSelectioModel.idCondionFK);
        insert.setParameter("idPersonInformationVehicleOccupantFK", conditionCollisionTimeSelectioModel.idPersonInformationVehicleOccupantFK);
        insert.setParameter("idNewPersonFK", conditionCollisionTimeSelectioModel.idNewPersonFK);
        insert.setParameter("idNewVehicleFK", conditionCollisionTimeSelectioModel.idNewVehicleFK);

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
