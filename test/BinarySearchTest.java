import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search() {
        String a[] = { "apple", "banana", "lemon", "raspberry", "tomato" };
        assertEquals(0, BinarySearch.search("apple", a));
        assertEquals(1, BinarySearch.search("banana", a));
        assertEquals(2, BinarySearch.search("lemon", a));
        assertEquals(-1, BinarySearch.search("pear", a));
        assertEquals(3, BinarySearch.search("raspberry", a));
        assertEquals(4, BinarySearch.search("tomato", a));
        assertEquals(-1, BinarySearch.search("ugli", a));
    }
}