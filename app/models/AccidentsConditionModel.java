package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 3/29/17.
 */
public class AccidentsConditionModel extends Model {
    public int accidenteFK;
    public int crashConditionFK;

    public AccidentsConditionModel() {
    }

    public int addAccidentsConditionModel(AccidentsConditionModel accidentsConditionModel){
        int result;

        String sql = "INSERT INTO AccidentCondition (AccidenteFK, CrashConditionFK) VALUES (:AccidenteFK, :CrashConditionFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("AccidenteFK",  accidentsConditionModel.accidenteFK);
        insert.setParameter("CrashConditionFK", accidentsConditionModel.crashConditionFK);

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
