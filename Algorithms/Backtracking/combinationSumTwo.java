package Algorithms.Backtracking;
import java.util.*;

public class combinationSumTwo {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, target, list, new ArrayList<>(), target, 0);
        return list;
    }

    public void backtrack(int[] nums, int target, List<List<Integer>> list, List<Integer> curr, int remains, int start){
        if(remains < 0) return;
        if(remains == 0){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            backtrack(nums, target, list, curr, remains-nums[i], i+1);
            curr.remove(curr.size()-1);
        }
    }
}
