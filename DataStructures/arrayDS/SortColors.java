package DataStructures.arrayDS;

public class SortColors {
    public void sortColors(int[] nums) {
        int[] temp = new int[3];

        for(int i: nums) temp[i]++;

        int i = 0;
        while(temp[0]-- > 0){
            nums[i++] = 0;
        }
        while(temp[1]-- > 0){
            nums[i++] = 1;
        }
        while(temp[2]-- > 0){
            nums[i++] = 2;
        }
    }
}
