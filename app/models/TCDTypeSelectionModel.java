package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 10/11/16.
 */
public class TCDTypeSelectionModel extends Model {

    public int tCDTypeID;
    public int idInformationRoadVehiclePasssing;
    public int idNewVehicleFK;

    public TCDTypeSelectionModel() {
    }

    public int addTCDTypeSelection(TCDTypeSelectionModel tCDTypeSelectionModel) {
        int result;


        String sql = "INSERT INTO TCDTypeSelection (TCDTypeID, idInformationRoadVehiclePasssing, idNewVehicleFK) VALUES (:TCDTypeID, :idInformationRoadVehiclePasssing, :idNewVehicleFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("TCDTypeID",  tCDTypeSelectionModel.tCDTypeID);
        insert.setParameter("idInformationRoadVehiclePasssing", tCDTypeSelectionModel.idInformationRoadVehiclePasssing);
        insert.setParameter("idNewVehicleFK", tCDTypeSelectionModel.idNewVehicleFK);
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
