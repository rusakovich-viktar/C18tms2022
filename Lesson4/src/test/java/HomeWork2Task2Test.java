import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork2Task2Test {

    @Test
    void operation() {
        assertEquals(2, HomeWork2Task2.operation(1));
        assertEquals(10, HomeWork2Task2.operation(0));
        assertEquals(-3, HomeWork2Task2.operation(-1));
    }
}
