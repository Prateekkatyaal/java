package DataStructures.arrayDS;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        
        int count = 1;
        int current = nums[0];
        int old = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != current){
                current = nums[i];
                nums[old+1] = nums[i];
                old++;
                count++;
            }
        }
        return count;
    }
}
