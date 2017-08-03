package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 9/29/16.
 */
public class ActionCollisionTimeSModel extends Model {

    public int contribActionsCircumstanceIDFK;
    public int idInformationPCFK;
    public int idNewVehicleFK;
    public int idNewPersonFK;

    public ActionCollisionTimeSModel() {
    }

    public int addActionCollisionTimeS(ActionCollisionTimeSModel actionCollisionTimeSelectionModel) {
        int result;
        String sql = "INSERT INTO ActionCollisionTimeSelection (contribActionsCircumstanceIDFK, idInformationPCFK, idNewVehicleFK, idNewPersonFK ) VALUES (:contribActionsCircumstanceIDFK, :idInformationPCFK, :idNewPersonFK, :idNewPersonFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("contribActionsCircumstanceIDFK",  actionCollisionTimeSelectionModel.contribActionsCircumstanceIDFK);
        insert.setParameter("idInformationPCFK", actionCollisionTimeSelectionModel.idInformationPCFK);
        insert.setParameter("idNewVehicleFK", actionCollisionTimeSelectionModel.idNewVehicleFK);
        insert.setParameter("idNewPersonFK", actionCollisionTimeSelectionModel.idNewPersonFK);
        System.out.println("Update: " + insert.getGeneratedSql());
        try {
            result = insert.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }
}
