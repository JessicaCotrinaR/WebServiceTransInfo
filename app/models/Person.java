package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlUpdate;

/**
 * Created by jessicacotrina on 9/27/16.
 */
public class Person extends Model{

    public long id;
    public String first_name;
    public String last_name;
    public int age;

    public Person() {
    }

    public int addPerson(Person person) {
        int result;
        String sql = "INSERT INTO person (age, first_name, last_name) VALUES (:age, :fn, :ln)";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
//        insert.setParameter("id", person.id);
        insert.setParameter("age", person.age);
        insert.setParameter("fn", person.first_name);
        insert.setParameter("ln", person.last_name);
        try {
            result = insert.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }

    public int updatePerson(Person person) {
        int result;
        String sql = "UPDATE person SET age = :age, first_name = :first_name, last_name = :last_name WHERE id = :id";
        SqlUpdate insert = Ebean.createSqlUpdate(sql);
//        insert.setParameter("id", person.id);
        insert.setParameter("age", person.age);
        insert.setParameter("fn", person.first_name);
        insert.setParameter("ln", person.last_name);
        try {
            result = insert.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }
}
