package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("RYZEN", 16, 256,5);
        computer.specification();
    }

}
