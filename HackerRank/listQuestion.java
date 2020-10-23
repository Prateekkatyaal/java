package HackerRank;

import java.util.*;

public class listQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new LinkedList<>();
        
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            l.add(x);
        }
        
        int q = sc.nextInt();

        for(int i = 0; i < q; i++){
            String query = sc.next();
            if(query.equals("Insert")){
                int x = sc.nextInt();
                int ele = sc.nextInt();
                l.add(x, ele);
            }else{
                int x = sc.nextInt();
                l.remove(x);
            }
        }
        printList(l);
    }
    static void printList(List<Integer> l){
        for(int i = 0; i < l.size(); i++){
            System.out.println(l.get(i)+" ");
        }
    }
}