package DataStructures.arrayDS;

import java.util.*;

public class combinationSum {

    public List<List<Integer>> combinations(int nums[], int target){
        List<List<Integer>> list = new ArrayList<>();

        generateList(nums, target, 0, 0, list, new ArrayList<>());

        return list;
    }

    public void generateList(int nums[], int target, int i, int sum, List<List<Integer>> list, ArrayList<Integer> current){
        if(sum == target){
            list.add(new ArrayList<>(current));
        }
        if(sum >= target || i > nums.length - 1) return;
        if(sum+nums[i] <= target){
            current.add(nums[i]);
            generateList(nums, target, i, sum+nums[i], list, current);
            current.remove(current.size() - 1);
        }
        generateList(nums, target, i+1, sum, list, current);
    }
}
