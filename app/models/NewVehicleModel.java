package models;

import com.avaje.ebean.*;

import javax.persistence.Entity;
import java.util.ArrayList;

import java.util.List;

/**
 * Created by jessicacotrina on 10/12/16.
 */
@Entity
public class NewVehicleModel extends Model {

   // public String vehicleType;
    public String plateNumber;
    public String vehicleJurisdiction;
    public String state;
    public String vin;
    public String year;
    public String make;
    public String modelos;
    public String registrationNumber;
    public String insuranceCompany;
    public String purchaseDate;
    public String expirationDate;
    public String idPersonaFK;
    public int idNewVehicle;
    public String name;
    public String licenceNumber;


    public NewVehicleModel() {
    }


    public long addNewVehicleModel(NewVehicleModel newVehicleModel) {

        long result;
        String sql = "INSERT INTO NewVehicle (PlateNumber, VehicleJurisdiction, State, Vin, Year, Make, modelos, RegistrationNumber, InsuranceCompany, PurchaseDate, ExpirationDate, idPersonaFK ) " +
                "VALUES (:PlateNumber, :VehicleJurisdiction, :State, :Vin, :Year, :Make, :modelos, :RegistrationNumber, :InsuranceCompany, :PurchaseDate, :ExpirationDate, :idPersonaFK)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);

        insert.setParameter("PlateNumber", newVehicleModel.plateNumber);
        insert.setParameter("VehicleJurisdiction", newVehicleModel.vehicleJurisdiction);
        insert.setParameter("State", newVehicleModel.state);
        insert.setParameter("Vin", newVehicleModel.vin);
        insert.setParameter("Year", newVehicleModel.year);
        insert.setParameter("Make", newVehicleModel.make);
        insert.setParameter("modelos", newVehicleModel.modelos);
        insert.setParameter("RegistrationNumber", newVehicleModel.registrationNumber);
        insert.setParameter("InsuranceCompany", newVehicleModel.insuranceCompany);
        insert.setParameter("PurchaseDate", newVehicleModel.purchaseDate);
        insert.setParameter("ExpirationDate", newVehicleModel.expirationDate);
        insert.setParameter("idPersonaFK", newVehicleModel.idPersonaFK);
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

    public List<NewVehicleModel> searchByPlateVehicle(String plateNumber){

        Transaction t = Ebean.beginTransaction();
        List<NewVehicleModel> vehicles = new ArrayList<>();
        try {
            String sql = "SELECT V.idNewVehicle,V.PlateNumber,V.VehicleJurisdiction,V.State,V.Vin,V.Year, " +
                    "V.Make,V.modelos,V.RegistrationNumber,V.InsuranceCompany,V.PurchaseDate,V.ExpirationDate,V.idPersonaFK, " +
                    "P.Name, P.LicenceNumber " +
                    "FROM NewVehicle V " +
                    "INNER JOIN NewPerson P ON V.idPersonaFK = P.idNewPerson " +
                    "WHERE V.PlateNumber = :plateNumber";

            RawSql rawSql = RawSqlBuilder.parse(sql)
                    .columnMapping("V.idNewVehicle", "idNewVehicle")
                    .columnMapping("V.State", "state")
                    .columnMapping("V.PlateNumber", "plateNumber")
                    .columnMapping("V.VehicleJurisdiction", "vehicleJurisdiction")
                    .columnMapping("V.Vin", "vin")
                    .columnMapping("V.Year", "year")
                    .columnMapping("V.Make", "make")
                    .columnMapping("V.modelos", "modelos")
                    .columnMapping("V.RegistrationNumber", "registrationNumber")
                    .columnMapping("V.InsuranceCompany", "insuranceCompany")
                    .columnMapping("V.PurchaseDate", "purchaseDate")
                    .columnMapping("V.ExpirationDate", "expirationDate")
                    .columnMapping("V.idPersonaFK", "idPersonaFK")
                    .columnMapping("P.Name", "name")
                    .columnMapping("P.LicenceNumber", "licenceNumber")
                    .create();

            Query<NewVehicleModel> query = Ebean.find(NewVehicleModel.class);
            query.setRawSql(rawSql)
                    .setParameter("plateNumber", plateNumber);
            vehicles = query.findList();
            t.commit();


        }
    catch (Exception e){
        System.out.println(e.getMessage());

    }finally {
            t.end();
        }

        return vehicles;

    }

    public int updateVehicleModel(NewVehicleModel newVehicleModel) {
        int result;
        String sql = "UPDATE NewVehicle SET PlateNumber = :PlateNumber, VehicleJurisdiction = :VehicleJurisdiction, State = :State, Vin = :Vin, Year = :Year, Make = :Make, modelos = :modelos, RegistrationNumber = :RegistrationNumber, InsuranceCompany = :InsuranceCompany, PurchaseDate = :PurchaseDate, ExpirationDate = :ExpirationDate, idPersonaFK = :idPersonaFK WHERE idNewVehicle = :idNewVehicle";
        SqlUpdate update = Ebean.createSqlUpdate(sql);

        update.setParameter("PlateNumber",  newVehicleModel.plateNumber);
        update.setParameter("VehicleJurisdiction", newVehicleModel.vehicleJurisdiction);
        update.setParameter("State", newVehicleModel.state);
        update.setParameter("Vin", newVehicleModel.vin);
        update.setParameter("Year", newVehicleModel.year);
        update.setParameter("Make", newVehicleModel.make);
        update.setParameter("modelos", newVehicleModel.modelos);
        update.setParameter("RegistrationNumber", newVehicleModel.registrationNumber);
        update.setParameter("InsuranceCompany", newVehicleModel.insuranceCompany);
        update.setParameter("PurchaseDate", newVehicleModel.purchaseDate);
        update.setParameter("ExpirationDate", newVehicleModel.expirationDate);
        update.setParameter("idPersonaFK", newVehicleModel.idPersonaFK);

        update.setParameter("idNewVehicle", newVehicleModel.idNewVehicle);

        try {
            result = update.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }


}
