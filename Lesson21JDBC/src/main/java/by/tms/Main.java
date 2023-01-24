package by.tms;

import by.tms.utils.CRUDUtilsCity;
import by.tms.utils.CityServices;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Student student = new Student("Java", "student", 1);
//        System.out.println("Saved students:");
//        System.out.println(CRUDUtils.saveStudent(student));
//        System.out.println("---------------------------------------------------");
////        while (true) {
////            System.out.println("11");
////            CRUDUtils.getAllStudents();
////            Thread.sleep(100000);
////        }
//
        System.out.println("All students:");
        System.out.println(CRUDUtilsCity.getAllStudents());
        System.out.println("---------------------------------------------------");
//
//        System.out.println("Updated students:");
////        System.out.println(CRUDUtils.updateStudent(1, 3));
//        System.out.println("----------------------------------------------------");
//
//        System.out.println("Deleted students: ");
//        System.out.println(CRUDUtils.deleteStudent(8));
        System.out.println("All cities:");
        System.out.println(CityServices.getAllCities());
        System.out.println("---------------------------------------------------");
//        System.out.println("Updated cities:");
//        System.out.println(CityServices.InsertCity(1, new City("Минск")));
//        System.out.println("-------");


    }
}
