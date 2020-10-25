package DAA;

import java.util.Arrays;

public class knapSackProb {
    public static int knapSack(int W, int wt[], int val[], int n){
        int dp[][] = new int[n][n];
        
        for(int i = 0; i < n; i++) dp[i] = new int[W+1];

        Arrays.fill(dp, -1);

        return helper(W, wt, val, n-1, dp);
    }

    public static int helper(int W, int wt[], int val[], int i, int[][] dp){
        if(i < 0) return 0;
        if(dp[i][W] != -1) return dp[i][W];

        if(wt[i] > W){
            dp[i][W] = helper(W, wt, val, i-1, dp);
            return dp[i][W];
        }else{
            dp[i][W] = Math.max(val[i] + helper(W-wt[i], wt, val, i, dp), helper(W, wt, val, i-1, dp));
        }
        return dp[i][W];
    }

    public static void main(String[] args) {
        int val[] = { 10, 20, 30 }; 
        int wt[] = { 1, 1, 1 }; 
        int W = 2; 
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}
