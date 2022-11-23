//package p2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PersonRegistry {
//    private Person[] citizens;// граждане
//
//    public PersonRegistry(Person[] citizens) {
//        this.citizens = citizens;
//    }
//
//    public Person[] findByAddress(String country) {
//        Person[] result = new Person[citizens.length];
////        ArrayList<Person> objects = new ArrayList<>();
//        for (int i = 0; i < citizens.length; i++) {
//            Person person = citizens[i];
//            if (person.getAddress() != null && country != null && country.equals(person.getAddress().getCountry())) {
////                objects.add(person);
//                result[i] = person;
//            }
//        }
//        return result;
//    }
//
//
//    public int countPeople(Address address) { // количество людей проживающих по адрессу
//        int count = 0;
//        for (Person person : citizens) {
//            Address personsAddress = person.getAddress();
//            if (personsAddress.getCountry().equals(address.getCountry())
//                    && personsAddress.getCity().equals(address.getCity())) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public int countPeople(String country) {//проживающий в стране
//        int count = 0;
//        for (Person person : citizens) {
//            Address personsAddress = person.getAddress();
//            if (personsAddress.getCountry().equals(country)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public List<Person> getPeople(Address address) {//количество людей проживющих по адресу
//        //можно ли с массивом сделать?
//        List<Person> peopleList = new ArrayList<>();
//        for (Person person : citizens) {
//            Address personsAddress = person.getAddress();
//            if (personsAddress.getCountry().equals(address.getCountry())
//                    && personsAddress.getCity().equals(address.getCity())) {
//                peopleList.add(person);
//            }
//        }
//        return peopleList;
//    }
//
//
//}
