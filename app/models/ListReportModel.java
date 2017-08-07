package models;

import com.avaje.ebean.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jessicacotrina on 4/18/17.
 */
@Entity
public class ListReportModel extends Model {

    public String crashType;
    public String crashDate;
    public String hour;
    public String address;
    public String countryDescriptionES;
    public String firstName;
    public String lastName;
    public String name;
    public String licenseType;
    public String licenceNumber;
    public String plateNumber;
    public String make;
    public String modelo;

    public List<ListReportModel> searchByDateReporAccident(String plateNumber){

        Transaction t = Ebean.beginTransaction();
        List<ListReportModel> report = new ArrayList<>();
        try {
            String sql = "SELECT a.CrashType, a.CrashDate, a.Hour, a.Address, a.CountryDescriptionES, " +
                    "o.FirstName, o.LastName, p.Name, p.LicenseType, p.LicenceNumber, v.PlateNumber, v.Make, v.modelos "+

                    "FROM Accident a, Officer o, AccidentPerson ap, NewPerson p, NewVehicle v " +
                    "WHERE a.Officerfk = o.OfficerID " +
                    "AND a.idCrashBasicInformation = ap.Accident_fk " +
                    "AND ap.person_fk = p.idNewPerson " +
                    "AND p.idNewPerson = v.idPersonaFK " +
                    "AND o.PlateNumber = :plateNumber ";

            RawSql rawSql = RawSqlBuilder.parse(sql)
                    .columnMapping("a.CrashType", "crashType")
                    .columnMapping("a.CrashDate", "crashDate")
                    .columnMapping("a.Hour", "hour")
                    .columnMapping("a.Address", "address")
                    .columnMapping("a.CountryDescriptionES", "countryDescriptionES")
                    .columnMapping("o.FirstName", "firstName")
                    .columnMapping("o.LastName", "lastName")
                    .columnMapping("p.Name", "name")
                    .columnMapping("p.LicenseType", "licenseType")
                    .columnMapping("p.LicenceNumber", "licenceNumber")
                    .columnMapping("v.PlateNumber", "plateNumber")
                    .columnMapping("v.Make", "make")
                    .columnMapping("v.modelos", "modelo")

                    .create();

            Query<ListReportModel> query = Ebean.find(ListReportModel.class);
            query.setRawSql(rawSql)
                    .setParameter("plateNumber", plateNumber);
            report = query.findList();
            t.commit();


        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            t.end();
        }

        return report;

    }


}
