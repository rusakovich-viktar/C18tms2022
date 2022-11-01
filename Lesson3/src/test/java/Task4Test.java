import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void max() {
        assertEquals(0, Task4.max(new int[]{}));
        assertEquals(10, Task4.max(new int[]{1, 2, 10, 3}));
        assertEquals(0, Task4.max(null));
        assertEquals(100, Task4.max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        assertEquals(1005, Task4.max(new int[]{-5, 999, 1005, 0}));
        assertEquals(0, Task4SecondSolution.max(new int[]{}));
        assertEquals(10, Task4SecondSolution.max(new int[]{1, 2, 10, 3}));
        assertEquals(0, Task4SecondSolution.max(null));
        assertEquals(100, Task4SecondSolution.max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        assertEquals(1005, Task4SecondSolution.max(new int[]{-5, 999, 1005, 0}));
    }
}