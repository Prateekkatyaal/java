package DataStructures.arrayDS;

import java.util.*;

public class climbingStairs {
    public int climbStairs(int n){
        int cache[] = new int[n+1];
        Arrays.fill(cache, -1);
        return helper(n, cache);
    }

    public int helper(int n, int[] cache){
        if(n == 0) return 1;
        if(cache[n] != -1) return cache[n];

        int t = helper(n-1, cache);
        if(n >= 2) t += helper(n-2, cache);

        cache[n] = t;
        return t;
    }
}
