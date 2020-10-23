package PriorityQ;

import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Apple");
        pq.add("Orange");
        pq.add("Banana");
        pq.add("Mango");
        System.out.println(pq);

        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());


        PriorityQueue<Integer> pq2 =  new PriorityQueue<>();
        pq2.add(10);
        pq2.add(6);
        pq2.add(4);
        pq2.add(1);
        pq2.add(3);

        System.out.println(pq2.remove());
        System.out.println(pq2.remove());
        System.out.println(pq2.remove());
        System.out.println(pq2.remove());
        System.out.println(pq2.remove());
    }
}