package p0_1;

import java.io.Serializable;

public abstract class Geom {
    int width, color;//характеристик

    abstract void draw();//метод
}

class Line extends Geom implements GeomInterface {
    void draw() {
        System.out.println("Рисование линии");
    }

    @Override
    public double[] getCoords() {
        double[] mass = new double[3];
        mass[0] = 3.2;
        mass[1] = 3.4;
        mass[2] = 2.5;
        return mass;
    }
}

class Rectangle extends Geom implements MathGeom, GeomInterface, Serializable {
    void draw() {
        System.out.println("Рисование прямоугольника");
    }

    @Override
    public double getSquare() {
        return 3 * 3;
    }

    @Override
    public double[] getCoords() {
        double[] mass = new double[3];
        mass[0] = 3.2;
        mass[1] = 3.4;
        mass[2] = 3.5;
        return mass;
    }
}

class Triangle extends Geom implements MathGeom, GeomInterface, Serializable {
    void draw() {
        System.out.println("Рисование треугольника");
    }

    @Override
    public double getSquare() {
        return 0.5 * 4 * 10;
    }

    @Override
    public double[] getCoords() {
        double[] mass = new double[3];
        mass[0] = 1.2;
        mass[1] = 3.4;
        mass[2] = 3.5;
        return mass;
    }
}