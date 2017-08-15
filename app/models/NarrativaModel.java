package models;

import com.avaje.ebean.*;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by jessicacotrina on 10/12/16.
 */

@Entity
public class NarrativaModel extends Model {

    public String notifiedTimePolice;
    public String timeOfArrivalPolice;
    public String notifiedTimeEmergencie;
    public String timeOfArrivalEmergencie;

    public String details;
    @Id
    public int idNarrative;

    public NarrativaModel() {
    }

    public long addNarrativa(NarrativaModel narrativaModel) {
        long result;
        String sql = "INSERT INTO Narrative (NotifiedTimePolice, TimeOfArrivalPolice, NotifiedTimeEmergencie, TimeOfArrivalEmergencie, Details) VALUES (:NotifiedTimePolice, :TimeOfArrivalPolice, :NotifiedTimeEmergencie, :TimeOfArrivalEmergencie, :Details)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("NotifiedTimePolice",  narrativaModel.notifiedTimePolice);
        insert.setParameter("TimeOfArrivalPolice", narrativaModel.timeOfArrivalPolice);
        insert.setParameter("NotifiedTimeEmergencie", narrativaModel.notifiedTimeEmergencie);
        insert.setParameter("TimeOfArrivalEmergencie", narrativaModel.timeOfArrivalEmergencie);
        insert.setParameter("Details", narrativaModel.details);
        System.out.println("Update: " + insert.getSql());
        Transaction tx = Ebean.beginTransaction();
        boolean success= true;

        try {
            result = insert.execute();
            String sqlgetId = "SELECT @@IDENTITY as theId";
            SqlRow id = Ebean.createSqlQuery(sqlgetId)
                    .findUnique();
            result = id.getLong("theId");



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
        System.out.println("Resulting Id: " + result);
        return result;
    }

    public Integer updateNarrativa(NarrativaModel narrativaModel) {

        int result;
        String sql = "UPDATE Narrative SET NotifiedTimePolice = :NotifiedTimePolice, TimeOfArrivalPolice = :TimeOfArrivalPolice, NotifiedTimeEmergencie = :NotifiedTimeEmergencie, TimeOfArrivalEmergencie = :TimeOfArrivalEmergencie, Details = :Details WHERE idNarrative = :idNarrative ";
        SqlUpdate update = Ebean.createSqlUpdate(sql);

        update.setParameter("NotifiedTimePolice",  narrativaModel.notifiedTimePolice);

        update.setParameter("TimeOfArrivalPolice", narrativaModel.timeOfArrivalPolice);

        update.setParameter("NotifiedTimeEmergencie", narrativaModel.notifiedTimeEmergencie);

        update.setParameter("TimeOfArrivalEmergencie", narrativaModel.timeOfArrivalEmergencie);

        update.setParameter("Details", narrativaModel.details);

        update.setParameter("idNarrative", narrativaModel.idNarrative);
        System.out.println("CCC"+ narrativaModel.idNarrative);

        // update.setParameter("idCrashBasicInformation", crashBasicInformationModel.idCrashBasicInformation);
        try {
            result = update.execute();

        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }

}
