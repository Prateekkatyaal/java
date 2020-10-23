package Algorithms.Backtracking;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        int a[] = {1, 7, 8, 1, 3};
        int sum = 0;
        for (int i = 0; i < a.length; i++) sum +=a[i];


        ArrayList<Integer> ans = new ArrayList<>();
        boolean isPossible = (sum%2 == 0) && partArray(a, sum/2, 0, ans);

        if(isPossible){
            for(int e: ans){
                System.out.print(e + " ");
            }
        }
        else System.out.println("Not possible");
    }

    static boolean partArray(int a[], int sum, int i, ArrayList<Integer> ans){

        if(i >= a.length || sum < 0) return false;
        if(sum == 0) return true;

        ans.add(a[i]);
        boolean leftPossible = partArray(a, sum-a[i], i+1, ans);
        if(leftPossible) return true;

        //line that makes backtracking possible 
        ans.remove(ans.size() - 1);
        return partArray(a, sum, i+1, ans);
    }
}
//Partition an array in two equal sums