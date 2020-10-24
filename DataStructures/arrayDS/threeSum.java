package DataStructures.arrayDS;

import java.util.*;

public class threeSum {
    public List<List<Integer>> ThreeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < n-2; i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if(sum < 0) j++;
                else k--;
            }
        }
        return new ArrayList<>(set);
    }
}
