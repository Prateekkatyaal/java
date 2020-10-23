package VectorsAndStacks;

import java.util.Stack;

public class stackCollection {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < 10; i++){
            s.push(i);
        }
        System.out.println(s);
        int x[] = new int[s.size()];

        int popped = s.pop();
        System.out.println(popped);
        
        int peeked = s.peek();
        System.out.println(peeked);
        System.out.println(s);
    }
}