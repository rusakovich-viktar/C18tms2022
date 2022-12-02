package a1;

import java.util.ArrayList;
import java.util.List;

/**
 * Фабрика по производству людей
 * https://javarush.ru/groups/posts/2372--patternih-proektirovanija-factorymethod
 * Шаблон проектирования фабричный метод решает проблему создания различных групп продуктов,
 * каждая из которых обладает некоторой спецификой.
 */
public class InputDataFactory {

    /**
     * Паттерн проектирования Фабричный метод
     *
     * @param type - создание объекта зависит от входного типа от 0 до 2
     * @return объект интерфейса PersonDao(в нутри будет находиться конкретный объект)
     */
    public PersonDao createData(int type) {
        PersonDao inputData = null;
        switch (type) {
            case 0:
                inputData = new ConsoleInputData();
                break;
            case 1:
                inputData = new StaticInputData();
                break;
            case 2:
                inputData = new RandomInputData();
                break;
            case 3:
                inputData = new FileInputData();
                break;
            case 5:
                inputData = getRandomAndStaticData();
                break;
        }
        return inputData;
    }

    private PersonDao getRandomAndStaticData() {
        PersonDao dao = new PersonDao() {
            @Override
            public List<Person> getGeneratedPersons() {
                List<Person> personList = new ArrayList<>();
                ConsoleInputData consoleInputData = new ConsoleInputData();
                personList.addAll(consoleInputData.getGeneratedPersons());
                StaticInputData staticInputData = new StaticInputData();
                personList.addAll(staticInputData.getGeneratedPersons());
                RandomInputData randomInputData = new RandomInputData();
                personList.addAll(randomInputData.getGeneratedPersons());
                return personList;
            }
        };
        return dao;
    }
}
