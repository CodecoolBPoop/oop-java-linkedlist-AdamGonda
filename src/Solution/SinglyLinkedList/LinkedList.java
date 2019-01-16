package Solution.SinglyLinkedList;

public class LinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int length = 0;

    public LinkedList(T[] elements){
        initList(elements);
    }

    private void initList(T[] elements) {
        for (int i = 0; i < elements.length; i++) {
            insert(head, elements[i]);
        }
    }

    public Node<T> getItemAt(int index){
        return null;
    }

    public void insert(Node<T> node, T data){
        if(head != null){
            if(node.next == null){
                Node<T> newNode = new Node<T>(data);
                node.next = newNode;
                tail = newNode;
                length++;
            }else{
                insert(node.next, data);
            }
        }else{
            head = new Node<>(data);
            length++;
        }
    }

    public void remove(T data){

    }

    public int getLength() {
        return length;
    }

    public T getHead() {
        if (head == null){
            return null;
        }else{
            return head.data;
        }
    }

    public T getTail() {
        if (tail == null){
            return null;
        }else{
            return tail.data;
        }
    }
}
