import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionTest {

    @Test
    void sort() {
        Integer[] a = { 5, 3, 1, 4 };
        Insertion.sort(a);
        assertTrue(Insertion.sorted(a, 0, a.length - 1));

        String[] s = { "zebra", "hello", "biscuit", "alligator" };
        Insertion.sort(s);
        assertTrue(Insertion.sorted(s, 0, s.length - 1));

        Vector[] v = new Vector[]{ new Vector(new double[]{ 0.0, 0.1 }),
                                   new Vector(new double[]{ 0.0 }),
                                   new Vector(new double[]{ -1.0 })
                                 };
        Vector[] expect = new Vector[]{ new Vector(new double[]{ -1.0 }),
                                        new Vector(new double[]{ 0.0 }),
                                        new Vector(new double[]{ 0.0, 0.1 })
                                      };
        Insertion.sort(v);
        assertArrayEquals(expect, v);
    }

}
