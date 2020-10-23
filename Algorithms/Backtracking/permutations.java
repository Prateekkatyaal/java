package Algorithms.Backtracking;

import java.util.*;

public class permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        backtrack(nums, new ArrayList<Integer>(), list, new HashSet<>());
        return list;
    }

    public void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> list, Set<Integer> tempSet){
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(tempSet.contains(nums[i])) continue;
            temp.add(nums[i]);
            tempSet.add(nums[i]);

            backtrack(nums, temp, list, tempSet);

            tempSet.remove(temp.get(temp.size()-1));
            temp.remove(temp.size()-1);
        }
    }
    
}
