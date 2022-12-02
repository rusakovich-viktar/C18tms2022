package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomInputData implements PersonDao {
    private static final Address[] ADDRESSES = {
            new Address("Belarus", "Vitebsk"),
            new Address("Belarus", "Minsk"),
            new Address("Belarus", "Гродно"),
            new Address("Belarus", "Могилев"),
            new Address("Belarus", "Гомель")
    };

    private static final String[] NAMES = {
            "Александр",
            "Иван",
            "Дмитрий",
            "Костя",
            "Женя",
            "Николай",
            "Алексей",
            "Ян"
    };

    private final Random random = new Random();

    @Override
    public List<Person> getGeneratedPersons() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Person person = new Person(NAMES[generateNameIndex()], generateAge(), getSexByIndex(i), ADDRESSES[generateAddressIndex()]);
            personList.add(person);
        }
        return personList;
    }

    private int generateNameIndex() {
        return random.nextInt(NAMES.length);
    }

    private int generateAddressIndex() {
        return random.nextInt(ADDRESSES.length);
    }

    private int generateAge() {
        return random.nextInt(90);
    }

    private String getSexByIndex(int index) {
//        if (index > 5) {
//            return MALE;
//        } else {
//            return FEMALE;
//        }
        return index > 5 ? Person.MALE : Person.FEMALE;
    }

}
