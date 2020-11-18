import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeTest {

    @Test
    void sort() {
        Integer a[] = { 5, 3, 1, 4 };
        Merge.sort(a);
        assertTrue(Merge.sorted(a, 0, a.length - 1));
    }

}
