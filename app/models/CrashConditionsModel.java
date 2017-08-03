package models;

import com.avaje.ebean.*;
import com.avaje.ebean.annotation.Sql;

import javax.persistence.Entity;

/**
 * Created by jessicacotrina on 10/12/16.
 */
@Entity
@Sql
public class CrashConditionsModel extends Model {
    public String collisionTypeDescriptionES;
    public String eventDescriptionES;
    public String eventLocationDescriptionES;
    public String mannerofColisionDescriptionES;
    public String weatherConditionUno;
    public String weatherConditionDos;
    public String visibilityCondition;
    public String pavementCondition;
    public String environmental;
    public String roadDescription;
    public String withinInterchange;
    public String specifLocation;
    public String inserctionType;
    public String schoolBusRelated;
    public String nearConstruction;
    public String crashLocation;
    public String workerZoneType;
    public String workerPresent;
    public String policePresent;
    public String idCrashBasicInformation;
    public String idCrashConditions;

    public CrashConditionsModel() {
    }

    public long addCrashConditions(CrashConditionsModel crashConditionsModel) {
        long result;
        String sql = "INSERT INTO CrashConditions ( CollisionTypeDescriptionES, EventDescriptionES, EventLocationDescriptionES, MannerofColisionDescriptionES, WeatherConditionUno, WeatherConditionDos, VisibilityCondition, PavementCondition, Environmental, RoadDescription, WithinInterchange, SpecifLocation, InserctionType, SchoolBusRelated, NearConstruction, CrashLocation, WorkerZoneType, WorkerPresent, PolicePresent ) " +
                "VALUES ( :CollisionTypeDescriptionES, :EventDescriptionES, :EventLocationDescriptionES, :MannerofColisionDescriptionES, :WeatherConditionUno, :WeatherConditionDos, :VisibilityCondition, :PavementCondition, :Environmental, :RoadDescription, :WithinInterchange, :SpecifLocation, :InserctionType, :SchoolBusRelated, :NearConstruction, :CrashLocation, :WorkerZoneType, :WorkerPresent, :PolicePresent )";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("CollisionTypeDescriptionES",  crashConditionsModel.collisionTypeDescriptionES);
        insert.setParameter("EventDescriptionES", crashConditionsModel.eventDescriptionES);
        insert.setParameter("EventLocationDescriptionES", crashConditionsModel.eventLocationDescriptionES);
        insert.setParameter("MannerofColisionDescriptionES", crashConditionsModel.mannerofColisionDescriptionES);
        insert.setParameter("WeatherConditionUno", crashConditionsModel.weatherConditionUno);
        insert.setParameter("WeatherConditionDos", crashConditionsModel.weatherConditionDos);
        insert.setParameter("VisibilityCondition", crashConditionsModel.visibilityCondition);
        insert.setParameter("PavementCondition", crashConditionsModel.pavementCondition);
        insert.setParameter("Environmental", crashConditionsModel.environmental);
        insert.setParameter("RoadDescription", crashConditionsModel.roadDescription);
        insert.setParameter("WithinInterchange", crashConditionsModel.withinInterchange);
        insert.setParameter("SpecifLocation", crashConditionsModel.specifLocation);
        insert.setParameter("InserctionType", crashConditionsModel.inserctionType);
        insert.setParameter("SchoolBusRelated", crashConditionsModel.schoolBusRelated);
        insert.setParameter("NearConstruction", crashConditionsModel.nearConstruction);
        insert.setParameter("CrashLocation", crashConditionsModel.crashLocation);
        insert.setParameter("WorkerZoneType", crashConditionsModel.workerZoneType);
        insert.setParameter("WorkerPresent", crashConditionsModel.workerPresent);
        insert.setParameter("PolicePresent", crashConditionsModel.policePresent);


        System.out.println("Update: " + insert.getSql());
        Transaction tx = Ebean.beginTransaction();
        boolean success= true;

        try {


            result = insert.execute();
            String sqlgetId = "SELECT @@IDENTITY as theId";
            SqlRow id = Ebean.createSqlQuery(sqlgetId)
                    .findUnique();
            result = id.getLong("theId");
            System.out.println("Resulting Id: " + result);


        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
            success= false;
        }
        finally {
            if(success){
                tx.commit();
            }
            else {
                tx.rollback();
            }


        }
        return result;
    }



//    private int insertAccidentCondition(int accident_id, int condition_id) {
//        System.out.println(accident_id);
//        System.out.println(condition_id);
//        int result;
//        String sql = "INSERT INTO AccidentCondition (idAccidentFK, idCrashConditionFK)" +
//                "VALUES (:idAccidentFK, :idCrashConditionFK) ";
//        SqlUpdate insert = Ebean.createSqlUpdate(sql);
//        insert.setParameter("idAccidentFK", accident_id);
//        insert.setParameter("idCrashConditionFK", condition_id);
//        System.out.println("Update: " + insert.getSql());
//        try {
//            result = insert.execute();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            result = 0;
//        }
//        return result;
//
//
//    }


}
