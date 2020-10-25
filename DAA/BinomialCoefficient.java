package DAA;

import java.util.*;

public class BinomialCoefficient {
    public static int binomialCoeff(int n, int r){
        Vector<Integer> dp[] = new Vector[n+1];
        
        for(int i = 0; i < n+1; i++){
            dp[i] = new Vector<Integer>();
            for(int j = 0; j <= r; j++) dp[i].add(-1);
        }

        return helper(n, r, dp);
    }

    public static int helper(int n, int r, Vector<Integer> dp[]){
        if(dp[n].get(r) != -1) return dp[n].get(r);

        if(r == 0){
            dp[n].add(r, 1);
            return dp[n].get(r);
        }

        if(r == n){
            dp[n].add(r, 1);
            return dp[n].get(r);
        }

        dp[n].add(r, helper(n-1, r-1, dp) + helper(n-1, r, dp));

        return dp[n].get(r);

    }

    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println(binomialCoeff(n, r));
    }
}
