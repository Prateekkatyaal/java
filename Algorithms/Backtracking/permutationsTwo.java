package Algorithms.Backtracking;
import java.util.*;

public class permutationsTwo {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, list, new ArrayList<>(), new boolean[nums.length]);
        return list;
    }
    public void backtrack(int[] nums, List<List<Integer>> list, List<Integer> curr, boolean[] used){
        if(curr.size() == nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
            used[i] = true;
            curr.add(nums[i]);
            backtrack(nums, list, curr, used);
            used[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}
