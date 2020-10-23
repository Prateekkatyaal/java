package DoublyEndedQueue;

public class MyDeque<E> {

    Node<E> head = null, tail = null;

    public void addToFront(E data){
        Node<E> newNode = new Node<E>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        head.next = newNode;
        newNode.prev = head;
        head = newNode;
    }

    public E removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return null;
        }
        Node<E> temp = tail;
        tail = tail.next;
        tail.prev = null;
        if(tail == null) head = null;
        return temp.data;
    }

    public static class Node<E>{
        E data;
        Node<E> next, prev;
        public Node(E data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
}