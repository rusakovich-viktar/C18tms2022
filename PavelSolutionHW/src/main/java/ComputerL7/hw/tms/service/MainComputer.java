package ComputerL7.hw.tms.service;

import com.tms.model.Computer;

public class MainComputer {

    public static void main(String[] args) {
        int cycleCounter = 10;
        Computer computer = new Computer("Intel", 8000, 1000, cycleCounter);

        computer.off();
        computer.on();
        computer.on();
        computer.on();
        computer.on();
        computer.off();
        computer.on();

        for (int i = 0; i < cycleCounter; i++) {
//            if (computer.isBurned()) {
//                break;
//            }
            computer.on();
            computer.off();
        }
        System.out.println(computer);
    }
}
