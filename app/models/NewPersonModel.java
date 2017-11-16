package models;

import com.avaje.ebean.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jessicacotrina on 10/12/16.
 */
@Entity
public class NewPersonModel extends Model {

   // public String personaCategory;
    //public String personaType;
    public String name;
    public String gender;
    public String licenseType;
    public String licenceNumber;
    public String organDonor;
    public String expirationDate;
    public String neighborhood;
    public String streetName;
    public String city;
    public String stateCountry;
    public int zipCode;
    public String phoneNumber;
    //public String idPersonaFK;
    //public int  person_fk;
    public int accidenteFK;

    public int idNewPerson;


    public NewPersonModel() {
    }

    public long addNewPersonModel(NewPersonModel newPersonModel) {

        long result;
        String sql = "INSERT INTO NewPerson (Name, Gender, LicenseType, LicenceNumber, OrganDonor, ExpirationDate, Neighborhood, StreetName, City, StateCountry, ZipCode, PhoneNumber) VALUES" +
                " (:Name, :Gender, :LicenseType, :LicenceNumber, :OrganDonor, :ExpirationDate, :Neighborhood, :StreetName, :City, :StateCountry, :ZipCode, :PhoneNumber )";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
       // insert.setParameter("PersonaCategory",  newPersonModel.personaCategory);
        //insert.setParameter("PersonaType", newPersonModel.personaType);
        insert.setParameter("Name", newPersonModel.name);
        insert.setParameter("Gender", newPersonModel.gender);
        insert.setParameter("LicenseType", newPersonModel.licenseType);
        insert.setParameter("LicenceNumber", newPersonModel.licenceNumber);
        insert.setParameter("OrganDonor", newPersonModel.organDonor);
        insert.setParameter("ExpirationDate", newPersonModel.expirationDate);
        insert.setParameter("Neighborhood", newPersonModel.neighborhood);
        insert.setParameter("StreetName", newPersonModel.streetName);
        insert.setParameter("City", newPersonModel.city);
        insert.setParameter("StateCountry", newPersonModel.stateCountry);
        insert.setParameter("ZipCode", newPersonModel.zipCode);
        insert.setParameter("PhoneNumber", newPersonModel.phoneNumber);
        //insert.setParameter("TransportedByMedicalEmergencies", newPersonModel.transportedByMedicalEmergencies);


        System.out.println("Update: " + insert.getGeneratedSql());
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

            }finally {
                if(success){
                    tx.commit();
                }
                else {
                    tx.rollback();
                }
            }
            return result;

    }

    public List<NewPersonModel> searchByLicencieNPerson(String licenceNumber){

        Transaction t = Ebean.beginTransaction();
        List<NewPersonModel> person = new ArrayList<>();
        try {
            String sql = "SELECT P.idNewPerson, P.Name, P.Gender, P.LicenseType, P.LicenceNumber, P.OrganDonor, P.ExpirationDate, P.Neighborhood, " +
                    "P.StreetName, P.City, P.StateCountry, P.ZipCode, P.PhoneNumber " +
                    "FROM NewPerson P " +
                    "WHERE P.LicenceNumber = :licenceNumber";

            RawSql rawSql = RawSqlBuilder.parse(sql)
                    .columnMapping("P.idNewPerson", "idNewPerson")
                    .columnMapping("P.Name", "name")
                    .columnMapping("P.Gender", "gender")
                    .columnMapping("P.LicenseType", "licenseType")
                    .columnMapping("P.LicenceNumber", "licenceNumber")
                    .columnMapping("P.OrganDonor", "organDonor")
                    .columnMapping("P.ExpirationDate", "expirationDate")
                    .columnMapping("P.Neighborhood", "neighborhood")
                    .columnMapping("P.StreetName", "streetName")
                    .columnMapping("P.City", "city")
                    .columnMapping("P.StateCountry", "stateCountry")
                    .columnMapping("P.ZipCode", "zipCode")
                    .columnMapping("P.PhoneNumber", "phoneNumber")
//                    .columnMapping("P.idPersonaFK", "idPersonaFK")
                    .create();

            Query<NewPersonModel> query = Ebean.find(NewPersonModel.class);
            query.setRawSql(rawSql)
                    .setParameter("licenceNumber", licenceNumber);
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
    public int updatePersonModel(NewPersonModel newPersonModel) {
        int result;
        String sql = "UPDATE NewPerson SET Name = :Name, Gender = :Gender, LicenseType = :LicenseType, LicenceNumber = :LicenceNumber, OrganDonor = :OrganDonor, ExpirationDate = :ExpirationDate, Neighborhood = :Neighborhood, StreetName = :StreetName, City = :City, StateCountry = :StateCountry, ZipCode = :ZipCode, PhoneNumber = :PhoneNumber " +
                "WHERE idNewPerson = :idNewPerson";
        SqlUpdate update = Ebean.createSqlUpdate(sql);

        update.setParameter("Name",  newPersonModel.name);
        update.setParameter("Gender", newPersonModel.gender);
        update.setParameter("LicenseType", newPersonModel.licenseType);
        update.setParameter("LicenceNumber", newPersonModel.licenceNumber);
        update.setParameter("OrganDonor", newPersonModel.organDonor);
        update.setParameter("ExpirationDate", newPersonModel.expirationDate);
        update.setParameter("Neighborhood", newPersonModel.neighborhood);
        update.setParameter("StreetName", newPersonModel.streetName);
        update.setParameter("City", newPersonModel.city);
        update.setParameter("StateCountry", newPersonModel.stateCountry);
        update.setParameter("ZipCode", newPersonModel.zipCode);
        update.setParameter("PhoneNumber", newPersonModel.phoneNumber);
        update.setParameter("idNewPerson", newPersonModel.idNewPerson);

        try {
            update.execute();
            result = idNewPerson;
        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }

    public List<NewPersonModel> ListNewPersonByIdAccident(String accidentId){

        Transaction t = Ebean.beginTransaction();
        List<NewPersonModel> listNewPerson = new ArrayList<>();
        try {
            String sql = "SELECT  n.Name, n.Gender, n.LicenseType, n.LicenceNumber, n.OrganDonor, n.ExpirationDate, n.Neighborhood, n.StreetName, n.City, n.StateCountry, n.ZipCode, n.PhoneNumber, b.Person_fk, b.Accident_fk " +
                    "FROM AccidentPerson b, NewPerson n, Accident a " +
                    "WHERE b.Accident_fk = a.idCrashBasicInformation AND " +
                    "b.Person_fk = n.idNewPerson " +
                    "AND a.idCrashBasicInformation =" + accidentId;

            RawSql rawSql = RawSqlBuilder.parse(sql)
                    .columnMapping("n.Name", "name")
                    .columnMapping("n.Gender", "gender")
                    .columnMapping("n.LicenseType", "licenseType")
                    .columnMapping("n.LicenceNumber", "licenceNumber")
                    .columnMapping("n.OrganDonor", "organDonor")
                    .columnMapping("n.ExpirationDate", "expirationDate")
                    .columnMapping("n.Neighborhood", "neighborhood")
                    .columnMapping("n.StreetName", "streetName")
                    .columnMapping("n.City", "city")
                    .columnMapping("n.StateCountry", "stateCountry")
                    .columnMapping("n.ZipCode", "zipCode")
                    .columnMapping("n.PhoneNumber", "phoneNumber")
                    .columnMapping("b.Person_fk", "idNewPerson")
                    .columnMapping("b.Accident_fk", "accidenteFK")
                   // .columnMapping("n.idNewPerson", "idNarrative")

                    .create();

            Query<NewPersonModel> query = Ebean.find(NewPersonModel.class);
            query.setRawSql(rawSql)
                    .setParameter("AccidenteFK", accidentId);
            listNewPerson = query.findList();
            t.commit();


        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            t.end();
        }

        return listNewPerson;

    }


}
