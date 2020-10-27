package DataStructures.arrayDS;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length-1;
        int i = 0;

        while(i <= n){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[n];
                nums[n] = temp;
                n--;
            }else{
                i++;
            }
        }
        return n+1;
    }
}
