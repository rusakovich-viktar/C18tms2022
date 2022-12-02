package p8;

public class Main {
    public static void main(String[] args) {
        Book book = null;//new Book("Война и мир", "Толстой", 1863);
        System.out.println(book);
//        try {
        Object clone = book.clone();
        System.out.println(clone);
        System.out.println(book == clone);
        System.out.println(book.equals(clone));
//        } catch (CloneNotSupportedException exception) {
//            System.out.println(exception);
//            //доп логика
//        }


    }
}
