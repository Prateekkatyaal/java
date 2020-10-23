package HackerRank;

import java.util.*;

public class arrayList {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        ArrayList<Integer> a[] = new ArrayList[q];
        for(int i = 0; i < q; i++){
            int k = sc.nextInt();
            a[i] = new ArrayList<Integer>();
            for(int j = 0; j < k; j++){
                int x = sc.nextInt();
                a[i].add(x);
            }
        }
        int p = sc.nextInt();
        for(int i = 0; i < p; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x < q){
                if(y < a[x-1].size()){
                    System.out.println(a[x-1].get(y-1));
                }else{
                    System.out.println("ERROR!");
                }
            }else{
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}