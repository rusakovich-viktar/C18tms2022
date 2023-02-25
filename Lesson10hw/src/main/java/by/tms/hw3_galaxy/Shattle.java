package by.tms.hw3_galaxy;

public class Shattle implements IStart {

    public Shattle() {
    }

    @Override
    public boolean checkSystem() {
        int i = (int) (Math.random() * 100);
        if (i > 30) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шаттла запущены. Все системы в норме");

    }

    @Override
    public void launch() {
        System.out.println("Старт Шаттла");
    }
}
