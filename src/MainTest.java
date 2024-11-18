import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testFindLargestEvenIndex() {
        int[] arr = {1, 3, 6, 8, 2, 5, 12, 7};
        assertEquals(6, Main.findLargestEvenIndex(arr));
    }
}