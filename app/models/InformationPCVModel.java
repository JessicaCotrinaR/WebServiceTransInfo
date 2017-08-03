package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 10/12/16.
 */
public class InformationPCVModel extends Model {

    public String waySchool;
    public String locationWhenCollision;
    public int idNewVehiclesFK;
    public int idNewPersonFK;


    public InformationPCVModel() {
    }
    public int addInformationPCV(InformationPCVModel informationPCVModel) {
        int result;
        String sql = "INSERT INTO InformationPCV (WaySchool, locationWhenCollision, idNewVehiclesFK, idNewPersonFK) VALUES (:WaySchool, :locationWhenCollision, :idNewVehiclesFK, :idNewPersonFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("WaySchool",  informationPCVModel.waySchool);
        insert.setParameter("locationWhenCollision", informationPCVModel.locationWhenCollision);
        insert.setParameter("idNewVehiclesFK", informationPCVModel.idNewVehiclesFK);
        insert.setParameter("idNewPersonFK", informationPCVModel.idNewPersonFK);
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
