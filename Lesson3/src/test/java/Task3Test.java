import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void average() {
        assertEquals(0.0, Task3.average(new int[]{}));
        assertEquals(0.0, Task3.average(null));
        assertEquals(0.0, Task3.average(new int[]{0}));
        assertEquals(1.5, Task3.average(new int[]{0, 3}));
        assertEquals(1.0, Task3.average(new int[]{0, 0, 3}));
        assertEquals(3.0, Task3.average(new int[]{1, 2, 3, 4, 5}));
        assertEquals(1.0, Task3.average(new int[]{0, -2, 3, -1, 5}));


    }
}

