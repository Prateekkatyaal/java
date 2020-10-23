package DoublyEndedQueue;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.addFirst(1);
        ad.addFirst(2);
        ad.addFirst(2);

        Set<Integer> set = new HashSet<>(ad);
        System.out.println(set.size());
        set.addAll(ad);

        
        

        System.out.println(ad.peek());
        System.out.println(ad.pop());

    }
}