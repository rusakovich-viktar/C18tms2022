//package p2;
//
//import java.util.Arrays;
//
//public class MainRegistry {
//    public static void main(String[] args) {
//        //создаем людей и добавляем в Registry
//        Address konstantinsAddress = new Address("Belarus", "Vitebsk");
//        Person konstantin = new Person(konstantinsAddress, 20, "Konstantin", Person.MALE);
//
//        Address glebsAddress = new Address("Belarus", "Vitebsk");
//        Person gleb = new Person(glebsAddress, 25, "Gleb", Person.MALE);
//
//        Address olegsAddress = new Address("Belarus", "Braslav");
//        Person oleg = new Person(olegsAddress, 38, "Oleg", Person.MALE);
//        changeAge(oleg);
//
//        Address vadimsAddress = new Address("Belarus", "Smorgon'");
//        Person vadim = new Person(vadimsAddress, 27, "Vadim", Person.MALE);
//
//        Address olgasAddress = new Address("Belarus", "Vitebsk");
//        Person olga = new Person(olgasAddress, 20, "Olga", Person.FEMALE);
////
//        Person[] citizens = {gleb, konstantin, oleg, vadim, olga};
//        System.out.println(Arrays.toString(citizens));
////
//        PersonRegistry registry = new PersonRegistry(citizens);
//
//        System.out.println(Arrays.toString(registry.findByAddress("Belarus")));
//    }
//
//    private static void changeAge(Person oleg) {
////        oleg.setAge(44);
//    }
//
//}
