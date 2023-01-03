package hw4;

import java.io.*;

public class Task4 {
    private static String FILE = "Lesson15/src/main/java/hw4/Car.ser";

    public static void main(String[] args) {
        Car car = new Car("BMW", new Car.Engine("Gasoline", 8), new Car.GasTank("propane", 40), 220, 50000);
        Car car1 = new Car("mazda", 280, 50000);
        //Запись объектов в файл и чтение из него
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE))) {
            outputStream.writeObject(car); //на car1 что-то похожее получается, на car со сложными полями чет не выходит
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Car carFromFile = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE))) {
            carFromFile = (Car) inputStream.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(carFromFile);
    }
}