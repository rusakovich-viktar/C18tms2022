package hw4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

// 4) Сериализовать объект Автомобиль(Марка, Двигатель(тип двигателя, количество цилиндров), бак(тип топлива, объем), скорость, цена). Количество цилиндров не должно сереализоватся в файл(это конфедициальная информация)
//         * После сериализации произвести обратный процесс(из потока в объект) и вывести на консоль
@Getter
@Setter
public class Car implements Serializable {
    private String model;
    private Engine engine;
    private GasTank gasTank;
    private int maxSpeed;
    private int price;

    public Car(String model, Engine engine, GasTank gasTank, int maxSpeed, int price) {
        this.model = model;
        this.engine = engine;
        this.gasTank = gasTank;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Car(String model, int maxSpeed, int price) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", gasTank=" + gasTank +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }

    @AllArgsConstructor
    public static class Engine {
        private String type;
        private transient int cylindersQuantity;

        @Override
        public String toString() {
            return "Engine{" +
                    "type='" + type + '\'' +
                    ", cylindersQuantity=" + cylindersQuantity +
                    '}';
        }
    }

    @AllArgsConstructor
    public static class GasTank {
        private String fuelType;
        private int volume;

        @Override
        public String toString() {
            return "GasTank{" +
                    "fuelType='" + fuelType + '\'' +
                    ", volume=" + volume +
                    '}';
        }
    }
}