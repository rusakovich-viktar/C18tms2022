package p3;

public class Mian {
    public static void main(String[] args) {
        Printer.Printable.max();

//        Printer.Printable printable = null;
        final String name = "вокруг света";
        Printer.Printable journal = new Journal(name);
        journal.print();
        journal.info();

        //анонимный класс
        Printer.Printable printable2 = new Printer.Printable() {
            @Override
            public void print() {
                System.out.println("sdfsdfsdf");
            }
        };
        printable2.print();


        //1 вариант
        ((Printer.Printable) () -> System.out.println("Journal называется ")).print();
//        journal1.print();

        Printer.Printable.max();

        Printer.Printable printable1 = () -> {
            System.out.println(name);
            System.out.println(name);
            System.out.println(name);
            System.out.println(name);
        };//
        printable1.print();


        {
            Printer.Printable printable = new Printer.Printable() {//сгенерировать лямда и показать
                @Override
                public void print() {
                    System.out.println("print " + name);
                }
            };
            printable.print();
        }

        //2 вариант
//        Printer.Printable journal = new Journal(name);
//        journal.print();
//
//        //3 вариант
//        {
//            Printer.Printable printable = () -> System.out.println("sdfsd " + name);
//            printable.print();
//        }
    }
}
