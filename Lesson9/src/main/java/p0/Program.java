package p0;

enum Type {
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}

public class Program {

    public static void main(String[] args) {

        Book b1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("p0.Book '%s' has a type %s", b1.name, b1.bookType);

        switch (b1.bookType) {
            case BELLETRE -> System.out.println("Belletre");
            case SCIENCE -> System.out.println("Science");
            case SCIENCE_FICTION -> System.out.println("Science fiction");
            case PHANTASY -> System.out.println("Phantasy");
        }
    }
}

class Book {

    String name;
    Type bookType;
    String author;

    Book(String name, String author, Type type) {

        bookType = type;
        this.name = name;
        this.author = author;
    }
}