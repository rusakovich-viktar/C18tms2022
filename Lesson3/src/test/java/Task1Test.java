import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void sum() {
        assertEquals(300, Task1.sum(100,200));
        assertEquals(-300, Task1.sum(-100, -200));
        assertEquals(-1, Task1.sum(Integer.MAX_VALUE, 23));
        assertEquals(-1, Task1.sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals(-1, Task1.sum(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}
