package VectorsAndStacks;

public class MyStack<E> {

    Node<E> head = null;

    void push(E e){
        Node<E> toPush = new Node<E>(e);
        if(isEmpty()){
            head = toPush;
            return;
        }
        toPush.next = head;
        head = toPush;
    }

    E pop(){
        if(isEmpty()) {
            System.out.println("Condition Underflow!");
            return null;
        }
        Node<E> temp = head;
        head = head.next;
        return temp.data;
    }

    E peek(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return null;
        }else{
            return head.data;
        }        
    }

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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