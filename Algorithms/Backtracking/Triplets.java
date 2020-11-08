package Algorithms.Backtracking;

import java.util.*;

public class Triplets {
    public List<List<Integer>> printTriplets(int[] nums, int target){
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum <= target) set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else k--;
            }
        }
        return new ArrayList<>(set);
    }    
}
