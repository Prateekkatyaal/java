package MyQueue;

public class MyQueue<E> {

    private Node<E> head, rear;

    public void enqueue(E data){
        Node<E> newNode = new Node(data);
        if(head == null){
            head = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = rear.next;
    }
    
    public E dequeue(){
        if(head == null) {
            System.out.println("Queue Empty");
            return null;
        }
        Node<E> temp = head;
        head = head.next;
        if(head == null) rear = null;
        return temp.data;
    }

    static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data){
            this.data = data;
            next = null;
        }
    }
}