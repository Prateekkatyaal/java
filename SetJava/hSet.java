package SetJava;

import java.util.*;

public class hSet {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        System.out.println(fruits.add("Apple"));
        System.out.println(fruits.add("Orange"));
        System.out.println(fruits.add("Kiwi"));
        System.out.println(fruits.add("Banana"));
        System.out.println(fruits.add("Lemon"));

        System.out.println(fruits);

        System.out.println(fruits.add("Lemon"));
        System.out.println(fruits);

        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        x.add(1);
        x.add(2);
        x.add(3);
        y.add(4);
        y.add(2);
        y.add(6);
    
        x.retainAll(y);
        System.out.println(x);
        x.addAll(y);
        System.out.println(x);

        
    }
}