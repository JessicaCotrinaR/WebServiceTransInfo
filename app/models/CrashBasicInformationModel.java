package models;

/**
 * Created by jessicacotrina on 10/12/16.
 *
 */
import com.avaje.ebean.*;

import javax.persistence.Entity;
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
    public int officerfk;

    public CrashBasicInformationModel() {
    }
    public long addCrashBasicInformation(CrashBasicInformationModel crashBasicInformationModel) {
        long result;
        String sql = "INSERT INTO Accident (CrashType, CaseNumber, CrashDate, Hour, UnitVehiculos, UnitAutomovilistas, UnitPedestrians, UnitInjured, UnitFatalaties, Longitude, Latitude, Address, CityDescriptionES, CountryDescriptionES, NearToDescriptionEs, Name, Distance, MeasurementDescriptionES, DirectionDescriptionES, PropertyDescriptionES, LocationDescriptionES, ZoneTypeDescriptionES, Officerfk) " +
                "VALUES (:CrashType, :CaseNumber, :CrashDate, :Hour, :UnitVehiculos, :UnitAutomovilistas, :UnitPedestrians, :UnitInjured, :UnitFatalaties, :Longitude, :Latitude, :Address, :CityDescriptionES, :CountryDescriptionES, :NearToDescriptionEs, :Name, :Distance, :MeasurementDescriptionES, :DirectionDescriptionES, :PropertyDescriptionES, :LocationDescriptionES, :ZoneTypeDescriptionES, :Officerfk)";
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

        System.out.println(officerfk);
        System.out.println("Update: " + insert.getSql());
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
}
