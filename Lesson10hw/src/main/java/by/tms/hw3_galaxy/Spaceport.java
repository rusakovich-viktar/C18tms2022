package by.tms.hw3_galaxy;

public class Spaceport {
    public Spaceport() {
    }

    public void launch(IStart istart) {
        if (istart.checkSystem()) {
            System.out.println("Предстартовая проверка корабля пройдена успешно");
            int i = (int) (Math.random() * 11);
            if (i > 3) {
                System.out.println("Предстартовая проверка космопорта пройдена успешно");
                threadSleep(600);
                System.out.println("Готовимся к запуску двигателя");
                threadSleep(600);
                istart.startEngine();
                System.out.println("Запускаем обратный отсчет");
                timer(10);
                istart.launch();
            } else {
                threadSleep(400);
                System.out.println("Предстартовая проверка космопорта провалена");
            }
        } else {
            threadSleep(800);
            System.out.println("Предстартовая проверка корабля провалена в самом начале> работы остановлены");
        }
    }

    private void timer(int time) {
        for (int i = time; i > 0; i--) {
            System.out.println(i);
            threadSleep(600);
        }
    }

    private void threadSleep(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}