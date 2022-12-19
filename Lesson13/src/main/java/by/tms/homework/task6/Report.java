package by.tms.homework.task6;

//        * Пусть salary будет выровнено по правому краю,
//        десятичное значение имеет 2 знака после запятой
//        и по одной первой букве имени и отчества через точки.
//        * Пример: | Л.Н. Толстой		|		200.34|
public class Report implements Reportable {
    @Override
    public void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("| %-20s|%15.2f|\n", cutPartOfFullName(employee), employee.getSalary());
        }
    }

    private String cutPartOfFullName(Employee employee) {
        String[] partNames = employee.getFullName().split(" ");
        String result = " ";
        for (int i = 1; i < partNames.length; i++) {
            result += partNames[i].substring(0, 1).toUpperCase() + (".");
        }
        result += " " + partNames[0];
        return result.trim();
    }
}