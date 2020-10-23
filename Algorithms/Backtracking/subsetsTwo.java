package Algorithms.Backtracking;
import java.util.*;

public class subsetsTwo {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), list, 0);
        return list;
    }
    public void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> list, int start){
        list.add(new ArrayList<>(curr));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            backtrack(nums, curr, list, i+1);
            curr.remove(curr.size()-1);
        }
    }
}
