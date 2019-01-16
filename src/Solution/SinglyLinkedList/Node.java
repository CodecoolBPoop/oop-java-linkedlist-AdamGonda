package Solution.SingleLinkedList;

public class Node<T> {
    public Node next = null;
    public T data;

    public Node(T data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
