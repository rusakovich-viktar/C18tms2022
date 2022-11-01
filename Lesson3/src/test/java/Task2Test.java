import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void max() {
        assertEquals(349, Task2.max(56,349));
        assertEquals(2147483647, Task2.max(Integer.MAX_VALUE, 349));
        assertEquals(-5, Task2.max(Integer.MIN_VALUE, -5));
    }
}
