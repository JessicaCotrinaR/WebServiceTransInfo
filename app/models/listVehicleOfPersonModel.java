package models;

import com.avaje.ebean.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jessicacotrina on 4/18/17.
 */
@Entity
public class listVehicleOfPersonModel extends Model {
    public String plateNumber;
    public String make;
    public String modelo;
    public String year;

    public listVehicleOfPersonModel() {
    }
    public List<listVehicleOfPersonModel> GetVehiclePerson(int idPersona){

        Transaction t = Ebean.beginTransaction();
        List<listVehicleOfPersonModel> person = new ArrayList<>();
        try {
            String sql = "SELECT v.PlateNumber, v.Make, v.modelos, v.Year " +
                    "FROM NewVehicle v " +
                    "WHERE v.idPersonaFK = :idPersonaFK";

            RawSql rawSql = RawSqlBuilder.parse(sql)
                    .columnMapping("v.PlateNumber", "plateNumber")
                    .columnMapping("v.Make", "make")
                    .columnMapping("v.modelos", "modelo")
                    .columnMapping("v.Year", "year")
                    .create();

            Query<listVehicleOfPersonModel> query = Ebean.find(listVehicleOfPersonModel.class);
            query.setRawSql(rawSql)
                    .setParameter("idPersonaFK", idPersona);
            person = query.findList();
            t.commit();


        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            t.end();
        }

        return person;

    }
}
