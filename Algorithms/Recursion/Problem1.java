package Algorithms.Recursion;

import java.util.*;

public class Problem1{

    static int sumNumber(int n){
        if(n == 1) return 1; // base case
        return n + sumNumber(n-1);  // generalized funciton/recursive call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = sumNumber(n);
        System.out.println(sum);

    }
}
// Sum of first N Natural Numbers