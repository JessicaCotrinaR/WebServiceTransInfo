package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 10/11/16.
 */
public class ContribActionsCircumstanceSelectionModel extends Model {

    public  int contribActionsCirmstanceFK;
    public  int idPersonInformationVehicleOccupantFK;
    public int idNewPersonFK;
    public int idNewVehicleFK;

    public ContribActionsCircumstanceSelectionModel() {
    }

    public int addContribActionsCircumstanceSelection(ContribActionsCircumstanceSelectionModel contribActionsCircumstanceSelectionModel) {
        int result;
        String sql = "INSERT INTO ContribActionsCircumstanceSelection (ContribActionsCirmstanceFK, IdPersonInformationVehicleOccupantFK, idNewPersonFK,idNewVehicleFK ) VALUES (:ContribActionsCirmstanceFK, :IdPersonInformationVehicleOccupantFK, :idNewPersonFK, :idNewVehicleFK)";

      //  (contribActionsCircumstanceIDFK, idInformationPCFK)

        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("ContribActionsCirmstanceFK",  contribActionsCircumstanceSelectionModel.contribActionsCirmstanceFK);
        insert.setParameter("IdPersonInformationVehicleOccupantFK", contribActionsCircumstanceSelectionModel.idPersonInformationVehicleOccupantFK);
        insert.setParameter("idNewPersonFK", contribActionsCircumstanceSelectionModel.idNewPersonFK);
        insert.setParameter("idNewVehicleFK", contribActionsCircumstanceSelectionModel.idNewVehicleFK);
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
