package models;

import com.avaje.ebean.*;
import com.avaje.ebean.annotation.Sql;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

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
    public int crashConditionFK;
    public String idCrashConditions;
    public String accidenteFK;

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


        System.out.println("Insert: " + insert.getSql());
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

    public long updateCrashConditions(CrashConditionsModel crashConditionsModel) {
        long result;
        String sql = "UPDATE CrashConditions SET CollisionTypeDescriptionES = :CollisionTypeDescriptionES, EventDescriptionES = :EventDescriptionES, EventLocationDescriptionES = :EventLocationDescriptionES, MannerofColisionDescriptionES = :MannerofColisionDescriptionES, WeatherConditionUno = :WeatherConditionUno, WeatherConditionDos = :WeatherConditionDos, VisibilityCondition = :VisibilityCondition, PavementCondition = :PavementCondition, Environmental = :Environmental, RoadDescription = :RoadDescription, WithinInterchange = :WithinInterchange, SpecifLocation = :SpecifLocation, InserctionType = :InserctionType, SchoolBusRelated = :SchoolBusRelated, NearConstruction = :NearConstruction, CrashLocation = :CrashLocation, WorkerZoneType = :WorkerZoneType, WorkerPresent = :WorkerPresent, PolicePresent = :PolicePresent " +
                "WHERE idCrashConditions = :idCrashConditions";
        SqlUpdate update = Ebean.createSqlUpdate(sql);

        update.setParameter("CollisionTypeDescriptionES",  crashConditionsModel.collisionTypeDescriptionES);
        update.setParameter("EventDescriptionES", crashConditionsModel.eventDescriptionES);
        update.setParameter("EventLocationDescriptionES", crashConditionsModel.eventLocationDescriptionES);
        update.setParameter("MannerofColisionDescriptionES", crashConditionsModel.mannerofColisionDescriptionES);
        update.setParameter("WeatherConditionUno", crashConditionsModel.weatherConditionUno);
        update.setParameter("WeatherConditionDos", crashConditionsModel.weatherConditionDos);
        update.setParameter("VisibilityCondition", crashConditionsModel.visibilityCondition);
        update.setParameter("PavementCondition", crashConditionsModel.pavementCondition);
        update.setParameter("Environmental", crashConditionsModel.environmental);
        update.setParameter("RoadDescription", crashConditionsModel.roadDescription);
        update.setParameter("WithinInterchange", crashConditionsModel.withinInterchange);
        update.setParameter("SpecifLocation", crashConditionsModel.specifLocation);
        update.setParameter("InserctionType", crashConditionsModel.inserctionType);
        update.setParameter("SchoolBusRelated", crashConditionsModel.schoolBusRelated);
        update.setParameter("NearConstruction", crashConditionsModel.nearConstruction);
        update.setParameter("CrashLocation", crashConditionsModel.crashLocation);
        update.setParameter("WorkerZoneType", crashConditionsModel.workerZoneType);
        update.setParameter("WorkerPresent", crashConditionsModel.workerPresent);
        update.setParameter("PolicePresent", crashConditionsModel.policePresent);

        update.setParameter("idCrashConditions", crashConditionsModel.idCrashConditions);

        System.out.println("Update: " + update.getSql());
        Transaction tx = Ebean.beginTransaction();
        boolean success= true;

        try {
            result = update.execute();
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


    public List<CrashConditionsModel> searchByIdAccident(String accidenteFK){

        Transaction t = Ebean.beginTransaction();
        List<CrashConditionsModel> listCondition = new ArrayList<>();
        try {
            String sql = "SELECT c.CollisionTypeDescriptionES, c.EventDescriptionES, c.EventLocationDescriptionES, c.MannerofColisionDescriptionES, c.WeatherConditionUno, c.WeatherConditionDos, c.VisibilityCondition, c.PavementCondition, c.Environmental, c.RoadDescription, c.WithinInterchange, c.SpecifLocation, c.InserctionType, c.SchoolBusRelated, c.NearConstruction, c.CrashLocation, c.WorkerZoneType, c.WorkerPresent, c.PolicePresent,b.CrashConditionFK, c.idCrashConditions, b.AccidenteFK " +
                    "FROM AccidentCondition b, CrashConditions c, Accident a " +
                    "WHERE b.AccidenteFK = a.idCrashBasicInformation AND " +
                    "b.CrashConditionFK = c.idCrashConditions " +
                    "AND a.idCrashBasicInformation = 87";

            RawSql rawSql = RawSqlBuilder.parse(sql)
                    .columnMapping("c.CollisionTypeDescriptionES", "collisionTypeDescriptionES")
                    .columnMapping("c.EventDescriptionES", "eventDescriptionES")
                    .columnMapping("c.EventLocationDescriptionES", "eventLocationDescriptionES")
                    .columnMapping("c.MannerofColisionDescriptionES", "mannerofColisionDescriptionES")
                    .columnMapping("c.WeatherConditionUno", "weatherConditionUno")
                    .columnMapping("c.WeatherConditionDos", "weatherConditionDos")
                    .columnMapping("c.VisibilityCondition", "visibilityCondition")
                    .columnMapping("c.PavementCondition", "pavementCondition")
                    .columnMapping("c.Environmental", "environmental")
                    .columnMapping("c.RoadDescription", "roadDescription")
                    .columnMapping("c.WithinInterchange", "withinInterchange")
                    .columnMapping("c.SpecifLocation", "specifLocation")
                    .columnMapping("c.InserctionType", "inserctionType")
                    .columnMapping("c.SchoolBusRelated", "schoolBusRelated")
                    .columnMapping("c.NearConstruction", "nearConstruction")
                    .columnMapping("c.CrashLocation", "crashLocation")
                    .columnMapping("c.WorkerZoneType", "workerZoneType")
                    .columnMapping("c.WorkerPresent", "workerPresent")
                    .columnMapping("c.PolicePresent", "policePresent")
                    .columnMapping("b.CrashConditionFK", "crashConditionFK")
                    .columnMapping("c.idCrashConditions", "idCrashConditions")
                    .columnMapping("b.AccidenteFK", "accidenteFK")

                    .create();

            Query<CrashConditionsModel> query = Ebean.find(CrashConditionsModel.class);
            query.setRawSql(rawSql)
                    .setParameter("AccidenteFK", accidenteFK);
            listCondition = query.findList();
            t.commit();


        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            t.end();
        }

        return listCondition;

    }



}
