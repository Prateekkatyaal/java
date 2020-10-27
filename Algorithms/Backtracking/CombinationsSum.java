package Algorithms.Backtracking;

import java.util.*;

public class CombinationsSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, list, new ArrayList<>(), 0, 0);
        return list;
    }
    public void helper(int[] candidates, int target, List<List<Integer>> list, List<Integer> curr, int sum, int index){
        if(sum == target){
            list.add(new ArrayList<>(curr));
        }
        if(sum >= target || index > candidates.length-1) return;
        if(sum+candidates[index] <= target){
            curr.add(candidates[index]);
            helper(candidates, target, list, curr, sum+candidates[index], index);
            curr.remove(curr.size()-1);
        }

        helper(candidates, target, list, curr, sum, index+1);
    }
}
