package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 3/28/17.
 */
public class AccidentNarrativaModel extends Model {


    public int accidenteFK;
    public int narrativaFK;

    public AccidentNarrativaModel() {

    }

    public int addAccidentNarrativaModel(AccidentNarrativaModel accidentNarrativaModel){
        int result;

        String sql = "INSERT INTO AccidentNarrativa (AccidenteFK, NarrativaFK) VALUES (:AccidenteFK, :NarrativaFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("AccidenteFK",  accidentNarrativaModel.accidenteFK);
        insert.setParameter("NarrativaFK", accidentNarrativaModel.narrativaFK);

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

//
//    public AccidentNarrativaModel() {
//
//    }
//
//    public int addAccidentNarrativaModel(AccidentNarrativaModel accidentNarrativaModel){
//        int result;
//
//        String sql = "INSERT INTO AccidentNarrativa (AccidenteFK, NarrativaFK) VALUES (:AccidenteFK, :NarrativaFK)";
//        SqlUpdate insert = Ebean.createSqlUpdate(sql);
//        insert.setParameter("AccidenteFK",  accidentNarrativaModel.accidenteFK);
//        insert.setParameter("NarrativaFK", accidentNarrativaModel.narrativaFK);
//
//        System.out.println("Update: " + insert.getSql());
//        try {
//            result = insert.execute();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            result = 0;
//        }
//        return result;
//    }
