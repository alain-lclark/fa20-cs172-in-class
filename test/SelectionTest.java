import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionTest {

    @Test
    void sort() {
        int a[] = { 5, 3, 1, 4 };
        Selection.sort(a);
        assertTrue(Selection.sorted(a, 0, a.length - 1));
    }

}
