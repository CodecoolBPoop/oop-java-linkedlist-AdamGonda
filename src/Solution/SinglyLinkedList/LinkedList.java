package Solution.SinglyLinkedList;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int length = 0;

    public LinkedList(){

    }

    public LinkedList(T[] elements){
        initList(elements);
    }

    private void initList(T[] elements) {
        if(elements.length > 100){
            for (int i = 0; i < elements.length; i++) {
                addLoopVersion(elements[i]);
            }
        }else{
            for (int i = 0; i < elements.length; i++) {
                add(head, elements[i]);
            }
        }
    }

    private void add(Node<T> node, T data){
        if(head != null){
            if(node.next == null){
                Node<T> newNode = new Node<T>(data);
                node.next = newNode;
                tail = newNode;
                length++;
            }else{
                add(node.next, data);
            }
        }else{
            head = new Node<>(data);
            length = 1;
        }
    }

    private void addLoopVersion(T data){
        if(head != null){
            Node<T> tmpNode = head;
            while(tmpNode.next != null){
                tmpNode = tmpNode.next;
            }
            Node<T> newNode = new Node<T>(data);
            tmpNode.next = newNode;
            tail = newNode;
            length++;
        }else{
            head = new Node<>(data);
            length = 1;
        }
    }

    public void insert(T data){
        addLoopVersion(data);
    }

    public void insert(T data, int index){
        //if index is too big throw exception
        if(head != null){
            Node<T> targetNode = getItemAt(index);
            targetNode.data = data;
        }else{
            if(index == 0){
                head = new Node<>(data);
                tail = head;
            }else{
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public Node<T> getItemAt(int index){
        if(head == null) throw new IndexOutOfBoundsException();
        Node<T> tmpNode = head;
        int idx = 0;
        while(idx != index){
            if(tmpNode.next != null){
                tmpNode = tmpNode.next;
                idx++;
            }else{
                throw new IndexOutOfBoundsException();
            }
        }
        return tmpNode;
    }

    public void remove(T data){
        //first node with data will be removed, if not found throw exception
        // removes the fist occurrence of the data
        if(head != null){
            int idx = 0;
            Node<T> tmpNode = head;
            Node<T> previous = head;
            while(tmpNode.data != data) {
                if (tmpNode.next != null) {
                    previous = tmpNode;
                    tmpNode = tmpNode.next;
                    idx++;
                } else {
                    throw new NoSuchElementException();
                }
            }

            if(idx == 0){
                //remove the head
                head = head.next;
            }else if(idx == length - 1){
                //remove the tail
                previous.next = null;
                tail = previous;
            }else{
                //remove from in between
                previous.next = tmpNode.next;
            }
            length--;
        }else{
            throw new NoSuchElementException();
        }
    }

    public int getLength() {
        return length;
    }

    public void print(){
        if(head != null){
            Node<T> tmpNode = head;
            while(tmpNode.next != null){
                System.out.print(tmpNode.data + " ");
                tmpNode = tmpNode.next;
            }
            System.out.println(tmpNode.data);
        }else{
            System.out.println("List is empty");
        }
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
