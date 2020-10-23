package DataStructures.arrayDS;

import java.util.*;

public class subsets {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> subsetsGenerator(int[] nums){
        List<List<Integer>> subsets = new ArrayList<>();

        generateSubsets(nums, 0, new ArrayList<Integer>(), subsets);

        return subsets;
    }

    public void generateSubsets(int[] nums, int index, ArrayList<Integer> curr, List<List<Integer>> subsets){
        subsets.add(new ArrayList<Integer>(curr));
        for(int i = index; i < nums.length; i++){
            curr.add(nums[i]);
            generateSubsets(nums, i+1, curr, subsets);
            curr.remove(curr.size() - 1);
        }
    }
}
