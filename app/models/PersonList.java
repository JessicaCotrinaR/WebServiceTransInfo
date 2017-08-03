package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Default71721 on 09.04.15.
 */
public class PersonList {
    private static PersonList singleton;
    public List<Person> list = new ArrayList<>();

    private PersonList(){}

    public Person addPerson(Person person)
    {
        list.add(person);
        return person;
    }

    public static PersonList getInstance()
    {
        if (singleton == null)
            return new PersonList();
        return singleton;
    }
}