package by.tms;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private int ram;
    private int ssd;
    private int resourcesFullCycles;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    private boolean burned;

    public boolean isBurned() {
        return burned;
    }

    public int getResourcesFullCycles() {
        return resourcesFullCycles;
    }

    public Computer(String cpu, int ram, int ssd, int resourcesFullCycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.resourcesFullCycles = resourcesFullCycles;
    }

    public void specification() {
        System.out.printf("процессор %s, оперативка %d Гб, жесткий диск %d Гб, ресурс полных циклов работы %d", cpu, ram, ssd, resourcesFullCycles);
    }

    public void powerOn() {
        if (!isBurned()) {
            if (waitUserAction() && checkResourcesFullCycles()) {
                System.out.println("...Идет включение...");
                System.out.println("Компьютер включен");
            } else {
                burned();
            }
        } else {
            burned();
        }
    }

    private boolean waitUserAction() {
        int value = -1;
        do {
            System.out.println("Внимание! Введите 0 или 1");
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                System.out.println("Проверьте введенное значение");
            }
        } while (!(value == 0 || value == 1));
        return random.nextInt(2) == value;
    }

    private boolean checkResourcesFullCycles() {
        return resourcesFullCycles > 0;
    }

    private void burned() {
        System.out.println("Компьютер сгорел!");
        burned = true;
    }

    public void powerOff() {
        if (!isBurned() && checkResourcesFullCycles()) {
            System.out.println("...Идет выключение...");
            System.out.println("Компьютер выключен");
            resourcesFullCycles--;
            System.out.printf("Осталось полных циклов: %d\n", resourcesFullCycles);
        } else {
            burned();
        }
    }
}