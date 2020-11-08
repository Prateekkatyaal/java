package Algorithms.Backtracking;

public class CountWays {
    public int countWays(int[] nums, int target){
        return helper(nums, nums.length-1, target);
    }
    public int helper(int[] nums, int n, int target){
        if(target == 0) return 1;
        if(n < 0) return 0;

        int exclude = helper(nums, n-1, target);

        int include = helper(nums, n-1, target-nums[n]) + helper(nums, n-1, target+nums[n]);

        return exclude + include;
    }
}
