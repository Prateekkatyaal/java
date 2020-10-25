package DAA;

public class LongestCommonSubsequence {
    public static void lcs(String s1, String s2, int m, int n){
        int[][] dp = new int[m+1][n+1];

        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
                else if(s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = dp[i-1][j-1]++;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        int idx = dp[m][n];
        int temp = idx;

        char[] lcs = new char[idx+1];
        lcs[idx] = '\0';

        int i = m, j = n;
        while(i > 0 && j > 0){
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs[idx - 1] = s1.charAt(i - 1);
        
                i--;
                j--;
                idx--;
              }
        
              else if (dp[i - 1][j] > dp[i][j - 1])
                i--;
              else
                j--;
        }

        System.out.print("S1 : " + s1 + "\nS2 : " + s2 + "\nLCS: ");
        for (int k = 0; k <= temp; k++)
            System.out.print(lcs[k]);
        System.out.println("");
    }

    public static void main(String[] args) {
        String S1 = "ACADB";
        String S2 = "CBDA";
        int m = S1.length();
        int n = S2.length();
        lcs(S1, S2, m, n);
    }
}
