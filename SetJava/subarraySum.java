package SetJava;

import java.util.*;

// Given an array, find if there exists a subarray with sum equals to zero.
public class subarraySum {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int a[] = {2, 1, -4, 3, -2};
        boolean f = false;
        int sum = 0;
        for(int i: a){
            set.add(sum);
            sum += i;
            if(set.contains(sum)){
                f = true;
                break;
            }
        }
        if(f) System.out.println("Subarray found");
        else System.out.println("Not found");
    }
}