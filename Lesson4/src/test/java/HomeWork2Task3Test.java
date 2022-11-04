import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork2Task3Test {

    @Test
    void calculateCountOfOddElementsInMatrix() {
        assertEquals(3, HomeWork2Task3.calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(0, HomeWork2Task3.calculateCountOfOddElementsInMatrix(new int[]{}));
        assertEquals(0, HomeWork2Task3.calculateCountOfOddElementsInMatrix(null));
    }
}
