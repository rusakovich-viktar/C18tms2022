import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void calculateHypotenuse() {
        assertEquals(5.0, Task5.calculateHypotenuse(3, 4));
        assertEquals(20.0, Task5.calculateHypotenuse(12, 16));
        assertEquals(5.0, Task5SecondSolution.calculateHypotenuse(3, 4));
        assertEquals(20.0, Task5SecondSolution.calculateHypotenuse(12, 16));
    }
}