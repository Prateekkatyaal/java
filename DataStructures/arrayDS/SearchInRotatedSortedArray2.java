package DataStructures.arrayDS;

public class SearchInRotatedSortedArray2 {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) return false;

        int l = 0;
        int r = nums.length-1;

        while(l+1 < r){
            int mid = (r-l)/2 + l;
            if(nums[mid] == target) return true;
            if(nums[mid] == nums[l]) l++;
            else if(nums[mid] == nums[r]) r--;
            else if(nums[l] < nums[mid]){
                if(nums[l] == target) return true;
                else if(nums[l] < target && nums[mid] > target) r = mid;
                else l = mid;
            }else{
                if(nums[r] == target) return true;
                else if(nums[r] > target && nums[mid] < target) l = mid;
                else r = mid;
            }
        }
        if(nums[l] == target || nums[r] == target) return true;

        return false;
    }
}
