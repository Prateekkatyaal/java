package DataStructures.arrayDS;

public class maxProduct {
    public static void main(String[] args) {
        
    }

    public int MaxProduct(int[] nums){
        int n = nums.length;

        int curMax = nums[0];
        int curMin = nums[0];
        int res = curMax;

        for(int i = 1; i < n; i++){
            int temp = curMax;
            curMax = Math.max(temp*nums[i], Math.max(curMin*nums[i], nums[i]));
            curMin = Math.min(temp*nums[i], Math.min(curMin*nums[i], nums[i]));

            res = Math.max(curMax, res);
        }

        return res;
    }
}
