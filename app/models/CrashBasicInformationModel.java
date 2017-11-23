package models;

/**
 * Created by jessicacotrina on 10/12/16.
 *
 */
import com.avaje.ebean.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CrashBasicInformationModel extends Model {

    public String crashType;
    public String caseNumber;
    public String crashDate;
    public String hour;
    public String unitVehiculos;
    public String unitAutomovilistas;
    public String unitPedestrians;
    public String unitInjured;
    public String unitFatalaties;
    public double longitude ;
    public double latitude;
    public String address;
    public String cityDescriptionES;
    public String countryDescriptionES;
    public String nearToDescriptionEs;
    public String name;
    public double distance;
    public String measurementDescriptionES;
    public String directionDescriptionES;
    public String propertyDescriptionES;
    public String locationDescriptionES;
    public String zoneTypeDescriptionES;
    public String status;
    public int officerfk;
    public int idCrashBasicInformation;

    public CrashBasicInformationModel() {
    }
    public long addCrashBasicInformation(CrashBasicInformationModel crashBasicInformationModel) {
        long result;
        String sql = "INSERT INTO Accident (CrashType, CaseNumber, CrashDate, Hour, UnitVehiculos, UnitAutomovilistas, UnitPedestrians, UnitInjured, UnitFatalaties, Longitude, Latitude, Address, CityDescriptionES, CountryDescriptionES, NearToDescriptionEs, Name, Distance, MeasurementDescriptionES, DirectionDescriptionES, PropertyDescriptionES, LocationDescriptionES, ZoneTypeDescriptionES, Officerfk, Status) " +
                "VALUES (:CrashType, :CaseNumber, :CrashDate, :Hour, :UnitVehiculos, :UnitAutomovilistas, :UnitPedestrians, :UnitInjured, :UnitFatalaties, :Longitude, :Latitude, :Address, :CityDescriptionES, :CountryDescriptionES, :NearToDescriptionEs, :Name, :Distance, :MeasurementDescriptionES, :DirectionDescriptionES, :PropertyDescriptionES, :LocationDescriptionES, :ZoneTypeDescriptionES, :Officerfk, :Status)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
        insert.setParameter("CrashType",  crashBasicInformationModel.crashType);
        insert.setParameter("CaseNumber", crashBasicInformationModel.caseNumber);
        insert.setParameter("CrashDate", crashBasicInformationModel.crashDate);
        insert.setParameter("Hour", crashBasicInformationModel.hour);
        insert.setParameter("UnitVehiculos", crashBasicInformationModel.unitVehiculos);
        insert.setParameter("UnitAutomovilistas", crashBasicInformationModel.unitAutomovilistas);
        insert.setParameter("UnitPedestrians", crashBasicInformationModel.unitPedestrians);
        insert.setParameter("UnitInjured", crashBasicInformationModel.unitInjured);
        insert.setParameter("UnitFatalaties", crashBasicInformationModel.unitFatalaties);
        insert.setParameter("Longitude", crashBasicInformationModel.longitude);
        insert.setParameter("Latitude", crashBasicInformationModel.latitude);
        insert.setParameter("Address", crashBasicInformationModel.address);
        insert.setParameter("CityDescriptionES", crashBasicInformationModel.cityDescriptionES);
        insert.setParameter("CountryDescriptionES", crashBasicInformationModel.countryDescriptionES);
        insert.setParameter("NearToDescriptionEs", crashBasicInformationModel.nearToDescriptionEs);
        insert.setParameter("Name", crashBasicInformationModel.name);
        insert.setParameter("Distance", crashBasicInformationModel.distance);
        insert.setParameter("MeasurementDescriptionES", crashBasicInformationModel.measurementDescriptionES);
        insert.setParameter("DirectionDescriptionES", crashBasicInformationModel.directionDescriptionES);
        insert.setParameter("PropertyDescriptionES", crashBasicInformationModel.propertyDescriptionES);
        insert.setParameter("LocationDescriptionES", crashBasicInformationModel.locationDescriptionES);
        insert.setParameter("ZoneTypeDescriptionES", crashBasicInformationModel.zoneTypeDescriptionES);
        insert.setParameter("Officerfk", crashBasicInformationModel.officerfk);
        insert.setParameter("Status", crashBasicInformationModel.status);

        System.out.println(officerfk);
        System.out.println("Update: " + insert.getSql());
        Transaction tx = Ebean.beginTransaction();
        boolean success= true;

        System.out.println("Update: " + insert.getSql());
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
        } finally {
            if(success){
                tx.commit();
            }
            else {
                tx.rollback();
            }

        }
        return result;
    }

    public long updateCrashBasicInformation(CrashBasicInformationModel crashBasicInformationModel) {
        long result;
        String sql = "UPDATE Accident SET CrashType = :CrashType, CaseNumber = :CaseNumber, CrashDate = :CrashDate, Hour = :Hour, UnitVehiculos = :UnitVehiculos, UnitAutomovilistas = :UnitAutomovilistas, UnitPedestrians = :UnitPedestrians, UnitInjured = :UnitInjured, UnitFatalaties = :UnitFatalaties, Longitude = :Longitude, Latitude = :Latitude, Address = :Address, CityDescriptionES = :CityDescriptionES, CountryDescriptionES = :CountryDescriptionES, NearToDescriptionEs = :NearToDescriptionEs, Name = :Name, Distance = :Distance, MeasurementDescriptionES = :MeasurementDescriptionES, DirectionDescriptionES = :DirectionDescriptionES, PropertyDescriptionES = :PropertyDescriptionES, LocationDescriptionES = :LocationDescriptionES, ZoneTypeDescriptionES = :ZoneTypeDescriptionES, Officerfk = :Officerfk, Status = :Status " +
                "WHERE idCrashBasicInformation = :idCrashBasicInformation";
        System.out.println(sql);
        SqlUpdate update = Ebean.createSqlUpdate(sql);

        update.setParameter("CrashType", crashBasicInformationModel.crashType);
        update.setParameter("CaseNumber", crashBasicInformationModel.caseNumber);
        update.setParameter("CrashDate", crashBasicInformationModel.crashDate);
        update.setParameter("Hour", crashBasicInformationModel.hour);
        update.setParameter("UnitVehiculos", crashBasicInformationModel.unitVehiculos);
        update.setParameter("UnitAutomovilistas", crashBasicInformationModel.unitAutomovilistas);
        update.setParameter("UnitPedestrians", crashBasicInformationModel.unitPedestrians);
        update.setParameter("UnitInjured", crashBasicInformationModel.unitInjured);
        update.setParameter("UnitFatalaties", crashBasicInformationModel.unitFatalaties);
        update.setParameter("Longitude", crashBasicInformationModel.longitude);
        update.setParameter("Latitude", crashBasicInformationModel.latitude);
        update.setParameter("Address", crashBasicInformationModel.address);
        update.setParameter("CityDescriptionES", crashBasicInformationModel.cityDescriptionES);
        update.setParameter("CountryDescriptionES", crashBasicInformationModel.countryDescriptionES);
        update.setParameter("NearToDescriptionEs", crashBasicInformationModel.nearToDescriptionEs);
        update.setParameter("Name", crashBasicInformationModel.name);
        update.setParameter("Distance", crashBasicInformationModel.distance);
        update.setParameter("MeasurementDescriptionES", crashBasicInformationModel.measurementDescriptionES);
        update.setParameter("DirectionDescriptionES", crashBasicInformationModel.directionDescriptionES);
        update.setParameter("PropertyDescriptionES", crashBasicInformationModel.propertyDescriptionES);
        update.setParameter("LocationDescriptionES", crashBasicInformationModel.locationDescriptionES);
        update.setParameter("ZoneTypeDescriptionES", crashBasicInformationModel.zoneTypeDescriptionES);
        update.setParameter("Officerfk", crashBasicInformationModel.officerfk);
        update.setParameter("Status", crashBasicInformationModel.status);
        update.setParameter("idCrashBasicInformation", crashBasicInformationModel.idCrashBasicInformation);


        System.out.println("Update: " + update.getSql());


        try {
            update.execute();
            result = idCrashBasicInformation;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }


    public List<CrashBasicInformationModel> searchByCaseNumber(String caseNumber){

        Transaction t = Ebean.beginTransaction();
        List<CrashBasicInformationModel> listCrashBasic = new ArrayList<>();
        try {
            String sql = "SELECT a.idCrashBasicInformation, a.CrashType, a.CaseNumber, a.CrashDate, a.Hour, a.UnitVehiculos, a.UnitAutomovilistas, a.UnitPedestrians, a.UnitInjured, a.UnitFatalaties, a.Longitude, a.Latitude, a.Address, a.CityDescriptionES, a.CountryDescriptionES, a.NearToDescriptionEs, a.Name, a.Distance, a.MeasurementDescriptionES, a.DirectionDescriptionES, a.PropertyDescriptionES, a.LocationDescriptionES, a.ZoneTypeDescriptionES, a.Officerfk, a.Status " +
                    "FROM Accident a " +
                    "WHERE a.CaseNumber = :CaseNumber";

            RawSql rawSql = RawSqlBuilder.parse(sql)
                    .columnMapping("a.CrashType", "crashType")
                    .columnMapping("a.CaseNumber", "caseNumber")
                    .columnMapping("a.CrashDate", "crashDate")
                    .columnMapping("a.Hour", "hour")
                    .columnMapping("a.UnitVehiculos", "unitVehiculos")
                    .columnMapping("a.UnitAutomovilistas", "unitAutomovilistas")
                    .columnMapping("a.UnitPedestrians", "unitPedestrians")
                    .columnMapping("a.UnitInjured", "unitInjured")
                    .columnMapping("a.UnitFatalaties", "unitFatalaties")
                    .columnMapping("a.Longitude", "longitude")
                    .columnMapping("a.Latitude", "latitude")
                    .columnMapping("a.Address", "address")
                    .columnMapping("a.CityDescriptionES", "cityDescriptionES")
                    .columnMapping("a.CountryDescriptionES", "countryDescriptionES")
                    .columnMapping("a.NearToDescriptionEs", "nearToDescriptionEs")
                    .columnMapping("a.Name", "name")
                    .columnMapping("a.Distance", "distance")
                    .columnMapping("a.MeasurementDescriptionES", "measurementDescriptionES")
                    .columnMapping("a.DirectionDescriptionES", "directionDescriptionES")
                    .columnMapping("a.DirectionDescriptionES", "directionDescriptionES")
                    .columnMapping("a.PropertyDescriptionES", "propertyDescriptionES")
                    .columnMapping("a.PropertyDescriptionES", "propertyDescriptionES")
                    .columnMapping("a.LocationDescriptionES", "locationDescriptionES")
                    .columnMapping("a.ZoneTypeDescriptionES", "zoneTypeDescriptionES")
                    .columnMapping("a.Officerfk", "officerfk")
                    .columnMapping("a.idCrashBasicInformation", "idCrashBasicInformation")
                    .columnMapping("a.Status", "status")
                    .create();

            Query<CrashBasicInformationModel> query = Ebean.find(CrashBasicInformationModel.class);
            query.setRawSql(rawSql)
                    .setParameter("CaseNumber", caseNumber);
            listCrashBasic = query.findList();
            t.commit();


        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            t.end();
        }

        return listCrashBasic;

    }


    public List<CrashBasicInformationModel> searchByStatus0(String statuss){

        Transaction t = Ebean.beginTransaction();
        List<CrashBasicInformationModel> listCrashBasic = new ArrayList<>();
        try {
            String sql = "SELECT a.idCrashBasicInformation, a.CrashType, a.CaseNumber, a.CrashDate, a.Hour, a.UnitVehiculos, a.UnitAutomovilistas, a.UnitPedestrians, a.UnitInjured, a.UnitFatalaties, a.Longitude, a.Latitude, a.Address, a.CityDescriptionES, a.CountryDescriptionES, a.NearToDescriptionEs, a.Name, a.Distance, a.MeasurementDescriptionES, a.DirectionDescriptionES, a.PropertyDescriptionES, a.LocationDescriptionES, a.ZoneTypeDescriptionES, a.Officerfk, a.Status " +
                    "FROM Accident a " +
                    "WHERE a.Status = :Status";

            RawSql rawSql = RawSqlBuilder.parse(sql)
                    .columnMapping("a.CrashType", "crashType")
                    .columnMapping("a.CaseNumber", "caseNumber")
                    .columnMapping("a.CrashDate", "crashDate")
                    .columnMapping("a.Hour", "hour")
                    .columnMapping("a.UnitVehiculos", "unitVehiculos")
                    .columnMapping("a.UnitAutomovilistas", "unitAutomovilistas")
                    .columnMapping("a.UnitPedestrians", "unitPedestrians")
                    .columnMapping("a.UnitInjured", "unitInjured")
                    .columnMapping("a.UnitFatalaties", "unitFatalaties")
                    .columnMapping("a.Longitude", "longitude")
                    .columnMapping("a.Latitude", "latitude")
                    .columnMapping("a.Address", "address")
                    .columnMapping("a.CityDescriptionES", "cityDescriptionES")
                    .columnMapping("a.CountryDescriptionES", "countryDescriptionES")
                    .columnMapping("a.NearToDescriptionEs", "nearToDescriptionEs")
                    .columnMapping("a.Name", "name")
                    .columnMapping("a.Distance", "distance")
                    .columnMapping("a.MeasurementDescriptionES", "measurementDescriptionES")
                    .columnMapping("a.DirectionDescriptionES", "directionDescriptionES")
                    .columnMapping("a.DirectionDescriptionES", "directionDescriptionES")
                    .columnMapping("a.PropertyDescriptionES", "propertyDescriptionES")
                    .columnMapping("a.PropertyDescriptionES", "propertyDescriptionES")
                    .columnMapping("a.LocationDescriptionES", "locationDescriptionES")
                    .columnMapping("a.ZoneTypeDescriptionES", "zoneTypeDescriptionES")
                    .columnMapping("a.Officerfk", "officerfk")
                    .columnMapping("a.idCrashBasicInformation", "idCrashBasicInformation")
                    .columnMapping("a.Status", "status")
                    .create();

            Query<CrashBasicInformationModel> query = Ebean.find(CrashBasicInformationModel.class);
            query.setRawSql(rawSql)
                    .setParameter("Status", statuss);
            listCrashBasic = query.findList();
            t.commit();


        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            t.end();
        }

        return listCrashBasic;

    }

    public List<CrashBasicInformationModel> searchByStatus1(String statuss){

        Transaction t = Ebean.beginTransaction();
        List<CrashBasicInformationModel> listCrashBasic = new ArrayList<>();
        try {
            String sql = "SELECT a.idCrashBasicInformation, a.CrashType, a.CaseNumber, a.CrashDate, a.Hour, a.UnitVehiculos, a.UnitAutomovilistas, a.UnitPedestrians, a.UnitInjured, a.UnitFatalaties, a.Longitude, a.Latitude, a.Address, a.CityDescriptionES, a.CountryDescriptionES, a.NearToDescriptionEs, a.Name, a.Distance, a.MeasurementDescriptionES, a.DirectionDescriptionES, a.PropertyDescriptionES, a.LocationDescriptionES, a.ZoneTypeDescriptionES, a.Officerfk, a.Status " +
                    "FROM Accident a " +
                    "WHERE a.Status = :Status";

            RawSql rawSql = RawSqlBuilder.parse(sql)
                    .columnMapping("a.CrashType", "crashType")
                    .columnMapping("a.CaseNumber", "caseNumber")
                    .columnMapping("a.CrashDate", "crashDate")
                    .columnMapping("a.Hour", "hour")
                    .columnMapping("a.UnitVehiculos", "unitVehiculos")
                    .columnMapping("a.UnitAutomovilistas", "unitAutomovilistas")
                    .columnMapping("a.UnitPedestrians", "unitPedestrians")
                    .columnMapping("a.UnitInjured", "unitInjured")
                    .columnMapping("a.UnitFatalaties", "unitFatalaties")
                    .columnMapping("a.Longitude", "longitude")
                    .columnMapping("a.Latitude", "latitude")
                    .columnMapping("a.Address", "address")
                    .columnMapping("a.CityDescriptionES", "cityDescriptionES")
                    .columnMapping("a.CountryDescriptionES", "countryDescriptionES")
                    .columnMapping("a.NearToDescriptionEs", "nearToDescriptionEs")
                    .columnMapping("a.Name", "name")
                    .columnMapping("a.Distance", "distance")
                    .columnMapping("a.MeasurementDescriptionES", "measurementDescriptionES")
                    .columnMapping("a.DirectionDescriptionES", "directionDescriptionES")
                    .columnMapping("a.DirectionDescriptionES", "directionDescriptionES")
                    .columnMapping("a.PropertyDescriptionES", "propertyDescriptionES")
                    .columnMapping("a.PropertyDescriptionES", "propertyDescriptionES")
                    .columnMapping("a.LocationDescriptionES", "locationDescriptionES")
                    .columnMapping("a.ZoneTypeDescriptionES", "zoneTypeDescriptionES")
                    .columnMapping("a.Officerfk", "officerfk")
                    .columnMapping("a.idCrashBasicInformation", "idCrashBasicInformation")
                    .columnMapping("a.Status", "status")
                    .create();

            Query<CrashBasicInformationModel> query = Ebean.find(CrashBasicInformationModel.class);
            query.setRawSql(rawSql)
                    .setParameter("Status", statuss);
            listCrashBasic = query.findList();
            t.commit();


        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            t.end();
        }

        return listCrashBasic;

    }


    public List<CrashBasicInformationModel> searchByStatus2(String statuss){

        Transaction t = Ebean.beginTransaction();
        List<CrashBasicInformationModel> listCrashBasic = new ArrayList<>();
        try {
            String sql = "SELECT a.idCrashBasicInformation, a.CrashType, a.CaseNumber, a.CrashDate, a.Hour, a.UnitVehiculos, a.UnitAutomovilistas, a.UnitPedestrians, a.UnitInjured, a.UnitFatalaties, a.Longitude, a.Latitude, a.Address, a.CityDescriptionES, a.CountryDescriptionES, a.NearToDescriptionEs, a.Name, a.Distance, a.MeasurementDescriptionES, a.DirectionDescriptionES, a.PropertyDescriptionES, a.LocationDescriptionES, a.ZoneTypeDescriptionES, a.Officerfk, a.Status " +
                    "FROM Accident a " +
                    "WHERE a.Status = :Status";

            RawSql rawSql = RawSqlBuilder.parse(sql)
                    .columnMapping("a.CrashType", "crashType")
                    .columnMapping("a.CaseNumber", "caseNumber")
                    .columnMapping("a.CrashDate", "crashDate")
                    .columnMapping("a.Hour", "hour")
                    .columnMapping("a.UnitVehiculos", "unitVehiculos")
                    .columnMapping("a.UnitAutomovilistas", "unitAutomovilistas")
                    .columnMapping("a.UnitPedestrians", "unitPedestrians")
                    .columnMapping("a.UnitInjured", "unitInjured")
                    .columnMapping("a.UnitFatalaties", "unitFatalaties")
                    .columnMapping("a.Longitude", "longitude")
                    .columnMapping("a.Latitude", "latitude")
                    .columnMapping("a.Address", "address")
                    .columnMapping("a.CityDescriptionES", "cityDescriptionES")
                    .columnMapping("a.CountryDescriptionES", "countryDescriptionES")
                    .columnMapping("a.NearToDescriptionEs", "nearToDescriptionEs")
                    .columnMapping("a.Name", "name")
                    .columnMapping("a.Distance", "distance")
                    .columnMapping("a.MeasurementDescriptionES", "measurementDescriptionES")
                    .columnMapping("a.DirectionDescriptionES", "directionDescriptionES")
                    .columnMapping("a.DirectionDescriptionES", "directionDescriptionES")
                    .columnMapping("a.PropertyDescriptionES", "propertyDescriptionES")
                    .columnMapping("a.PropertyDescriptionES", "propertyDescriptionES")
                    .columnMapping("a.LocationDescriptionES", "locationDescriptionES")
                    .columnMapping("a.ZoneTypeDescriptionES", "zoneTypeDescriptionES")
                    .columnMapping("a.Officerfk", "officerfk")
                    .columnMapping("a.idCrashBasicInformation", "idCrashBasicInformation")
                    .columnMapping("a.Status", "status")
                    .create();

            Query<CrashBasicInformationModel> query = Ebean.find(CrashBasicInformationModel.class);
            query.setRawSql(rawSql)
                    .setParameter("Status", statuss);
            listCrashBasic = query.findList();
            t.commit();


        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            t.end();
        }

        return listCrashBasic;

    }

}
