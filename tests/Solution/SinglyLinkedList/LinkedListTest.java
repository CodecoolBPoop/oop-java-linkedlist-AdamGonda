package Solution.SinglyLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testEmpty(){
        Integer[] elements = new Integer[]{};
        LinkedList<Integer> singly = new LinkedList<>(elements);

        assertNull(singly.getHead());
        assertNull(singly.getTail());
    }

    @Test
    void testInitList(){
        Integer[] elements = new Integer[]{1,2, 3, 4, 5};
        LinkedList<Integer> singly = new LinkedList<>(elements);

        assertEquals(1,singly.getHead());
        assertEquals(5,singly.getTail());
    }

    @Test
    void testGetLength(){
        Integer[] elements = new Integer[]{1, 2, 3, 4, 5};
        LinkedList<Integer> singly = new LinkedList<>(elements);

        assertEquals(elements.length ,singly.getLength());

    }

}