package VectorsAndStacks;

import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i  = 0; i < n; i++){
            int k = sc.nextInt();
            if(k == 1){
                int x = sc.nextInt();
                if(!s.isEmpty()){
                    if(x <= s.peek()){
                        x = s.peek();
                    }
                    s.push(x);
                }
            }else if(k == 2){
                s.pop();
            }else{
                // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                // pq.addAll(s);
                // System.out.println(pq.poll());
                // int max = s.get(0);
                // for(int j = 0; j < s.size(); i++){
                //     max = Math.max(max, s.get(j));
                // }
                System.out.println(s.peek());
            }
        }

        sc.close();
    }
}