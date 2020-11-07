package DataStructures.arrayDS;

public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int p = 2;
        for(int i = 2; i < nums.length; i++){
            if((nums[i] == nums[p-1] && nums[i] != nums[p-2]) || nums[i] != nums[p-1]) nums[p++] = nums[i];
        }
        return p;   
    }
}
