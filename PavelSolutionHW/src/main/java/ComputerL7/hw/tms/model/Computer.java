package ComputerL7.hw.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public static final String TEMP = "sdf";

    private String cpu;
    private int ram;
    private int disk;
    private int resourceCycles;
    private boolean burned;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public Computer(String cpu, int ram, int disk, int resourceCycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
        this.resourceCycles = resourceCycles;
    }

    public void info() {
        System.out.println("процессор " + cpu + " оперативка " + ram + " жесткий диск " + disk + " ресурс полных циклов работы " + resourceCycles);
        System.out.printf("процессор %s оперативка %d жесткий диск %d ресурс полных циклов работы %d\n", cpu, ram, disk, resourceCycles);
    }

    public void on() {
        if (!isBurned()) {
            System.out.println("Включение...");
            if (checkResourceCycles() && checkAction()) {
                System.out.println("Компьютер включен");
//                off();
            } else {
                burned();
            }
        } else {
            burned();
        }
    }

    private void burned() {
        System.out.println("Компьютер сгорел!");
        burned = true;
    }

    private boolean checkAction() {
        int value = -1;
        do {
            System.out.println("Внимание! Введите 0 или 1");
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                System.out.println("Некорректные данные");
                scanner.next();
            }
        } while (!(value == 0 || value == 1));

        return random.nextInt(2) == value;
    }

    public void off() {
        if (!isBurned() && checkResourceCycles()) {
            System.out.println("Выключение...");
            System.out.println("Компьютер выключен");
            resourceCycles--;
            System.out.println("Количество оставшихся циклов: " + resourceCycles);
//            on();
        } else {
            burned();
        }
    }

    private boolean checkResourceCycles() {
        return resourceCycles > 0;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public int getResourceCycles() {
        return resourceCycles;
    }

    public void setResourceCycles(int resourceCycles) {
        this.resourceCycles = resourceCycles;
    }

    public boolean isBurned() {
        return burned;
    }

    public void setBurned(boolean burned) {
        this.burned = burned;
    }
}
