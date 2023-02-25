package by.tms.hw3_galaxy;

public class SpaceX implements IStart {

    @Override
    public boolean checkSystem() {
        int i = (int) (Math.random() * 100);
        if (i > 20) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме");

    }

    @Override
    public void launch() {
        System.out.println("Старт SpaceX");
    }
}
