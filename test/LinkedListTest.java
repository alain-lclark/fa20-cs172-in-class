import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    void testToString() {
        List l  = new LinkedList<String>();
        l.add("a");
        l.add("b");
        l.add("c");
        assertEquals("[\"a\", \"b\", \"c\", ]", l.toString());
    }

    @Test
    void testEquals() {
        List l1  = new LinkedList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        List l2 = new LinkedList<String>();
        l2.add("a");
        l2.add("b");
        l2.add("c");
        assertEquals(l1, l2);

        List l3 = new LinkedList<String>();
        l3.add("a");
        l3.add("b");
        l3.add("z");
        assertNotEquals(l1, l3);

        List l4 = new LinkedList<String>();
        l4.add("a");
        l4.add("b");
        assertNotEquals(l1, l4);
    }

    @Test
    void testAddAndGet() {
        List l  = new LinkedList<String>();
        l.add("a");
        l.add("b");
        l.add("c");
        assertEquals("a", l.get(0));
        assertEquals("b", l.get(1));
        assertEquals("c", l.get(2));
    }

    @Test
    void testAddAndGetWithInt() {
        List l  = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertEquals(1, l.get(0));
        assertEquals(2, l.get(1));
        assertEquals(3, l.get(2));
    }

    @Test
    void testSize() {
        List l  = new LinkedList<String>();
        assertEquals(0, l.size());
        l.add("a");
        l.add("b");
        l.add("c");
        assertEquals(3, l.size());
    }

    @Test
    void testRemoveAt() {
        List l  = new LinkedList<String>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.removeAt(1);
        assertEquals("a", l.get(0));
        assertEquals("c", l.get(1));
        l.removeAt(0);
        assertEquals("c", l.get(0));
    }

}
