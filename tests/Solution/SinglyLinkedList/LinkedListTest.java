package Solution.SinglyLinkedList;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testInitList(){
        //test add()
        Integer[] elements = new Integer[]{1,2, 3, 4, 5};
        LinkedList<Integer> singly = new LinkedList<>(elements);

        assertEquals(1,singly.getHead());
        assertEquals(5,singly.getTail());

        //test lAdd()
        elements = new Integer[101];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = i;
        }
        singly = new LinkedList<>(elements);

        assertEquals(100, singly.getTail());
    }

    @Test
    void testGetLength(){
        // test width add()
        Integer[] elements = new Integer[]{1, 2, 3, 4, 5};
        LinkedList<Integer> singly = new LinkedList<>(elements);

        assertEquals(elements.length ,singly.getLength());


        //test width lAdd()
        elements = new Integer[101];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = i;
        }
        singly = new LinkedList<>(elements);

        assertEquals(elements.length ,singly.getLength());
    }

    @Test
    void testGetItem(){
        // test width add()
        Integer[] elements = new Integer[]{1, 2, 3, 4, 5};
        LinkedList<Integer> singly = new LinkedList<>(elements);

        Node<Integer> result = singly.getItemAt(2);

        assertNotNull(result);
        assertEquals(3, result.data);


        result = singly.getItemAt(singly.getLength() - 1);
        assertNotNull(result);
        assertEquals(5, result.data);
    }

    @Test
    void testEmptyList(){
        LinkedList<Integer> singly = new LinkedList<>();

        assertNull(singly.getHead());
        assertNull(singly.getTail());
        assertEquals(0,singly.getLength());
        assertThrows(IndexOutOfBoundsException.class, () -> singly.getItemAt(0));
    }

    @Test
    void testInsertAtIndex(){
        LinkedList<Integer> singly = new LinkedList<>();

        singly.insert(1,0);

        assertEquals(1, singly.getHead());
        assertEquals(1, singly.getItemAt(0).data);
        assertThrows(IndexOutOfBoundsException.class, () -> singly.insert(1, 1));
        assertThrows(IndexOutOfBoundsException.class, () -> singly.insert(1, 10));
        assertThrows(IndexOutOfBoundsException.class, () -> singly.insert(1, -1));
    }

    @Test
    void testInsert(){
        LinkedList<Integer> singly = new LinkedList<>();

        singly.insert(1);
        singly.insert(2);
        singly.insert(3);

        assertEquals(1, singly.getHead());
        assertEquals(3, singly.getTail());
        assertEquals(2, singly.getItemAt(1).data);
    }

    @Test
    void testRemove(){
        LinkedList<Integer> singly = new LinkedList<>();
        assertThrows(NoSuchElementException.class, () -> singly.remove(1));

        singly.insert(5);

        assertEquals(5,singly.getHead());

        singly.remove(5);
        assertNull(singly.getHead());
        assertNull(singly.getTail());

        assertThrows(NoSuchElementException.class, () -> singly.remove(5));


        Integer[] elements = new Integer[]{1, 2, 3, 4, 5};
        LinkedList<Integer> singly_2 = new LinkedList<>(elements);

        singly_2.remove(3);
        assertEquals(5, singly_2.getTail());

        singly_2.remove(5);
        assertEquals(4, singly_2.getTail());


        singly_2.remove(1);
        assertEquals(4, singly_2.getTail());
        assertEquals(2, singly_2.getHead());
    }
}