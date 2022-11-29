import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void main() {
        Assertions.assertArrayEquals(((new int[]{0, 1, 3, 0, 4})),
                Task1.removeElement((new int[]{0, 1, 2, 2, 3, 0, 4, 2}), 2));

    }
}