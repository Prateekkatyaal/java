package DataStructures.arrayDS;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int r = nums.length-1;
        int l = 0;
        while(l <= r){
            int mid = (l+r)/2;
            if(nums[mid] == target) return mid;
            if(nums[l] <= nums[mid]){
                if(nums[l] <= target && nums[mid] >= target) r = mid-1;
                else l = mid+1;
            }else{
                if(target >= nums[mid] && target <= nums[r]) l = mid+1;
                else r = mid-1;
            }
        }
        return -1;
    }
}
