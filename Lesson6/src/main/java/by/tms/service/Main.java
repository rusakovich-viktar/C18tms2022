package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("RYZEN 7", 16, 256, 5);

        for (int i = 0; i < computer.getResourcesFullCycles(); i++) {
            if (computer.isBurned()) {
                break;
            }
            computer.powerOn();
            computer.powerOff();
        }
        computer.specification();
    }

}