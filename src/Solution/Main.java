package Solution;

import Solution.SinglyLinkedList.LinkedList;
import Solution.SinglyLinkedList.Node;

public class Main {
    public static void main(String[] args) {
        //    Implement a SinglyLinkedList (nodes only reference the next node in the list) with these methods:
        //    getItemAt / head / tail / length / insert / remove
        //    Implement a DoublyLinkedList (nodes have a reference for both the previous and next node in the list)
        //    Write unit tests!



    }

    public static void insert(Node node, Integer data){
        if(node.next == null){
            node.next = new Node<>(data);
        }else{
            insert(node.next, data);
        }
    }
}
