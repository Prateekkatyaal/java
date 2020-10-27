package DataStructures.arrayDS;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int res[] = {-1,-1};

        if(nums.length == 0 || nums == null) return res;

        if(nums.length == 1 && nums[0] == target){
            res[0] = res[1] = 0;
        }

        while(l <= r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                int temp = mid;
                while(mid-1 >= 0 && nums[mid-1] == target) mid--;
                res[0] = mid;

                while(temp+1 <= nums.length-1 && nums[temp+1] == target) temp++;
                res[1] = temp;

                break;
            }
            if(nums[mid] > target) r = mid-1;
            else l = mid+1;
        }    

        return res;
    }
}
