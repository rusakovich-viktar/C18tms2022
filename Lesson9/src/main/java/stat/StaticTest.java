package stat;

public class StaticTest {
    static int price = 10;//цена

    int getPrice() {
        return price;
    }

    int addPrice(int value) {
        return price += value;
    }
}
