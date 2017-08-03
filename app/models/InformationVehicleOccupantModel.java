package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 10/12/16.
 */
public class InformationVehicleOccupantModel extends Model {

    public String row;
    public String seat;
    public String otherLocation;
    public String restraintSystem;
    public String airbagActivation;
    public String expulsion;
    public String speedRelatedDescription;
    public String extractionDescription;
    public String distractedDriver;
    public String safetyEquipment;
    public int idNewPersonFK;
    public int idNewVehicleFK;

    public InformationVehicleOccupantModel() {
    }
    public int addInformationVehicleOccupantModel(InformationVehicleOccupantModel informationVehicleOccupantModel) {
        int result;
        String sql = "INSERT INTO InformationVehicleOccupant (Row, Seat, OtherLocation, RestraintSystem, AirbagActivation, Expulsion, SpeedRelatedDescription, ExtractionDescription, DistractedDriver, SafetyEquipment, idNewPersonFK,idNewVehicleFK )" + " VALUES (:Row, :Seat, :OtherLocation, :RestraintSystem, :AirbagActivation, :Expulsion, :SpeedRelatedDescription, :ExtractionDescription, :DistractedDriver, :SafetyEquipment, :idNewPersonFK, :idNewVehicleFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("Row",  informationVehicleOccupantModel.row);
        insert.setParameter("Seat", informationVehicleOccupantModel.seat);
        insert.setParameter("OtherLocation", informationVehicleOccupantModel.otherLocation);
        insert.setParameter("RestraintSystem", informationVehicleOccupantModel.restraintSystem);
        insert.setParameter("AirbagActivation", informationVehicleOccupantModel.airbagActivation);
        insert.setParameter("Expulsion", informationVehicleOccupantModel.expulsion);
        insert.setParameter("SpeedRelatedDescription", informationVehicleOccupantModel.speedRelatedDescription);
        insert.setParameter("ExtractionDescription", informationVehicleOccupantModel.extractionDescription);
        insert.setParameter("DistractedDriver", informationVehicleOccupantModel.distractedDriver);
        insert.setParameter("SafetyEquipment", informationVehicleOccupantModel.safetyEquipment);
        insert.setParameter("idNewPersonFK", informationVehicleOccupantModel.idNewPersonFK);
        insert.setParameter("idNewVehicleFK", informationVehicleOccupantModel.idNewVehicleFK);

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
