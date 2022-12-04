package p3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Journal implements Printer.Printable {//Printable{
    private final String name;

    @Override
    public void print() {
        System.out.println("Journal называется " + name);
    }


}
