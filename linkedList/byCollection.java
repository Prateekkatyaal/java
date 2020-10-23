package linkedList;

import java.util.LinkedList;
import java.util.List;

public class byCollection {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();

        for(int i = 0; i < 10; i++){
            l1.add(i);
        }
        System.out.println(l1);
    }
}