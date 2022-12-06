package CarMilitaryLesson8.tms.model;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public int findCountPersonByName(String name) {
        int counter = 0;
        Person[] people = personRegistry.getRecruits();
        for (Person person : people) {
            if (person.getName().equals(name)) {
                counter++;
            }
        }
        return counter;
    }

    public int findCountRecruitsByAge(int from, int to) {
        Person[] recruits = personRegistry.getRecruits(from, to);
        return recruits.length;
    }
}
