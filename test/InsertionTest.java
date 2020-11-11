import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionTest {

    @Test
    void sort() {
        int a[] = { 5, 3, 1, 4 };
        Insertion.sort(a);
        assertTrue(Insertion.sorted(a, 0, a.length - 1));
    }

}
