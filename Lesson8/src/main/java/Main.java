import static model.PersonRegistry.people;

public class Main {


    public static void main(String[] args) {
        for (int i = 0; i < people.length; i++) {

            System.out.println(people[i]);
            System.out.println(people[i].toString());
        }
    }
}
