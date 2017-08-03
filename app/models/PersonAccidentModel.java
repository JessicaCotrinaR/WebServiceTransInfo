package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 4/3/17.
 */
public class PersonAccidentModel extends Model {
    public int accident_fk;
    public int person_fk;

    public PersonAccidentModel() {
    }

    public int addPersonAccidentModel(PersonAccidentModel personAccidentModel){
        int result;

        String sql = "INSERT INTO AccidentPerson (Accident_fk, Person_fk) VALUES (:Accident_fk, :Person_fk)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("Accident_fk",  personAccidentModel.accident_fk);
        insert.setParameter("Person_fk", personAccidentModel.person_fk);
//        System.out.println(accident_fk);
//        System.out.println(person_fk);
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
