package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 10/11/16.
 */
public class DriverCirncunstanceSelectionModel extends Model {

    public int idPersonInformationVehicleOccupant;
    public int contribActionsCircumstanceFK;

    public DriverCirncunstanceSelectionModel() {
    }


    public int addDriverCirncunstanceSelection(DriverCirncunstanceSelectionModel driverCirncunstanceSelectionModel) {
        int result;
        String sql = "INSERT INTO DriverCirncunstanceSelection (IdPersonInformationVehicleOccupant, ContribActionsCircumstanceFK) VALUES (:IdPersonInformationVehicleOccupant, :ContribActionsCircumstanceFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("IdPersonInformationVehicleOccupant",  driverCirncunstanceSelectionModel.idPersonInformationVehicleOccupant);
        insert.setParameter("ContribActionsCircumstanceFK", driverCirncunstanceSelectionModel.contribActionsCircumstanceFK);
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
