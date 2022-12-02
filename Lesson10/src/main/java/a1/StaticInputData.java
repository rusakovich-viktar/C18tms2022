package a1;

import java.util.ArrayList;
import java.util.List;

import static a1.Person.MALE;

public class StaticInputData implements PersonDao {
    @Override
    public List<Person> getGeneratedPersons() {
        List<Person> personList = new ArrayList<>();
        Address vitebsk = new Address("Belarus", "Vitebsk");
        Address minsk = new Address("Belarus", "Minsk");
        Address grodno = new Address("Belarus", "Гродно");
        Address mogilev = new Address("Belarus", "Могилев");
        {
            Person person = new Person("Konstantin2", 23, MALE, minsk);
            personList.add(person);
        }
        {
            Person person = new Person("Александр", 25, MALE, mogilev);
            personList.add(person);
        }
        {
            Person person = new Person("Konstantin", 22, MALE, new Address("Литва", "Каунас"));
            personList.add(person);
        }
        {
            Person person = new Person("Вадим", 18, MALE, vitebsk);
            personList.add(person);
        }
        {
            Person person = new Person("Дима", 19, MALE, grodno);
            personList.add(person);
        }
        {
            Person person = new Person("Александр", 25, MALE, mogilev);
            personList.add(person);
        }
        {
            Person person = new Person("Александр", 25, MALE, mogilev);
            personList.add(person);
        }
        return personList;
    }
}
