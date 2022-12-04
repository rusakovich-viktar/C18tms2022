package p5;

import p3.Printer;

public enum Test implements Printer.Printable {
    MALE, FEMALE;

    Test() {
        System.out.println("info" + this.name());
    }

    @Override
    public void print() {

    }
}
