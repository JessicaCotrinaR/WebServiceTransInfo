package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 9/28/16.
 */
public class ActionCollisionTimeSelectionModel extends Model {



    public int actionPriorToCrashIDFK;
    public int idInformationPCVFK;
    public int idNewVehicleFK;
    public int idNewPersonFK;

    public ActionCollisionTimeSelectionModel() {
    }
    public int addActionCollisionTimeSelection(ActionCollisionTimeSelectionModel actionCollisionTimeSelectionModel) {
        int result;
        String sql = "INSERT INTO ActionBeforeCollisionSelection (actionPriorToCrashIDFK, idInformationPCVFK, idNewVehicleFK, idNewPersonFK) VALUES (:actionPriorToCrashIDFK, :idInformationPCVFK, :idNewVehicleFK, :idNewPersonFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("actionPriorToCrashIDFK",  actionCollisionTimeSelectionModel.actionPriorToCrashIDFK);
        insert.setParameter("idInformationPCVFK", actionCollisionTimeSelectionModel.idInformationPCVFK);
        insert.setParameter("idNewVehicleFK", actionCollisionTimeSelectionModel.idNewVehicleFK);
        insert.setParameter("idNewPersonFK", actionCollisionTimeSelectionModel.idNewPersonFK);
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
