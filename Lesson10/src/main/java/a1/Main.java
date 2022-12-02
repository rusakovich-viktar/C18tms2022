package a1;

import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Задача: Наполнить список людьми (3 способа),
     * далее данные люди будут ипользоваться в регитратуре ваенкомата.
     */
    public static void main(String[] args) {

//        PersonDao personDao = new ConsoleInputData();
//        List<Person> generatedPersons = personDao.getGeneratedPersons();


//        PersonDao data = new ConsoleInputData();
//        List<Person> generatedPersons = data.getGeneratedPersons();
//        PersonDao data = new StaticInputData();
//        PersonDao data = new RandomInputData();
//        List<Person> generatedPersons = data.getGeneratedPersons();
//        for (Person generatedPerson : generatedPersons) {
//            System.out.println(generatedPerson);
//        }

        InputDataFactory factory = new InputDataFactory();
        PersonDao data = choiceGeneratedData(factory);
        List<Person> persons = data.getGeneratedPersons();
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    private static PersonDao choiceGeneratedData(InputDataFactory factory) {
        System.out.println("Введите число от 0 до 2 для наполнения базы людьми:");
        System.out.println("0 - ввод данных с консоли");
        System.out.println("1 - наполнение статическими(не изменяемыми) данными");
        System.out.println("2 - наполнение рандомными данными");
        System.out.println("5 - наполнение рандомными данными и статическими");
        Scanner scanner = new Scanner(System.in);
        return factory.createData(scanner.nextInt());
    }
}
