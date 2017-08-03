package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 10/6/16.
 */
public class AffectAreaSelectionModel extends Model {

    public int idCommercialVehicleHazardousMaterialFK;
    public int damageAreaIDFK;
    public int idNewVehicleFK;

   // public AffectAreaSelectionModel() {
   // }

    public int addAfectAreaSelectionModel(AffectAreaSelectionModel affectAreaSelectionModel) {
        int result;
        String sql = "INSERT INTO AffectAreaSelection (IdCommercialVehicleHazardousMaterialFK, damageAreaIDFK, idNewVehicleFK) VALUES (:IdCommercialVehicleHazardousMaterialFK, :damageAreaIDFK, :idNewVehicleFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("IdCommercialVehicleHazardousMaterialFK",  affectAreaSelectionModel.idCommercialVehicleHazardousMaterialFK);
        insert.setParameter("damageAreaIDFK", affectAreaSelectionModel.damageAreaIDFK);
        insert.setParameter("idNewVehicleFK", affectAreaSelectionModel.idNewVehicleFK);
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
