package by.tms.model;

public class Computer {
    private String cpu;
    private int ram;
    private int ssd;
    private int resourceFullCycles;

    public Computer(String cpu, int ram, int ssd, int resourceFullCycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.resourceFullCycles = resourceFullCycles;
    }

    public void specification() {
        System.out.printf("процессор %s, оперативка %d, жесткий диск %d, ресурс полных циклов работы %d", cpu, ram, ssd, resourceFullCycles);
    }

//    public String powerOn() {
//    }
//
//    public String powerOff() {
//
//    }
}
