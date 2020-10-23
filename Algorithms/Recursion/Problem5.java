package Algorithms.Recursion;

import java.util.*;

public class Problem5 {

    static Set<String> set = new HashSet<>();
    public static void main(String[] args) {
        String s = "sid";
        char a[] = s.toCharArray();
        Arrays.sort(a);
        s = new String(a);
        stringPerm(s, 0, s.length() - 1);
    }
    
    static void stringPerm(String s, int l, int r){

        if(l == r){
            if(set.contains(s)) return;
            set.add(s);
            System.out.println(s);
            return;
        }
        for(int i = l; i <= r; i++){
            s = swap(s, l, i);
            stringPerm(s, l+1, r);
            s = swap(s, l, i);
        }

    }

    static String swap(String s, int a, int b){
        char ar[] = s.toCharArray();
        char temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
        return new String(ar);
    }
}
//Permutation of a string