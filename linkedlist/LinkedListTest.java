import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Author : Michael Zhang
 */

public class LinkedListTest {
    @Test
    public void basicTest() {
        LinkedList l = new LinkedList();
        assertEquals(0, l.size());
        l = new LinkedList(2);
        l.insertBack(3);
        assertEquals(2, l.getFront());
        l.insertFront(10);
        assertEquals(10, l.getFront());
    }

    /** Runs tests. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(LinkedListTest.class);
    }
}   