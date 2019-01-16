package Solution.SingleLinkedList;

public class LinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;

    public LinkedList(T[] elements){
        initList(elements);
    }

    private void initList(T[] elements) {
        for (int i = 0; i < elements.length; i++) {

        }
    }

    public Node getItemAt(int index){
        return null;
    }

    public void insert(Node node, T data){
        if(node.next == null){

        }
    }

    public void remove(Node node){

    }

    public void getLength(){

    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
