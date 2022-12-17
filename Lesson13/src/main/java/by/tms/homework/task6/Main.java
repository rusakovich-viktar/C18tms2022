package by.tms.homework.task6;

public class Main {
    public static void main(String[] args) {


        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Андрей Иванович", 100.10);
        employees[1] = new Employee("Петров Петр Иванович", 555.12);
        employees[2] = new Employee("Юревич Юрий Иванович", 222.11);
        employees[3] = new Employee("Антоневич Антон Иванович", 435.12);
        employees[4] = new Employee("Архипенко Архип Иванович", 1000.00);
        Report report = new Report();
        report.generateReport(employees);
    }
}
