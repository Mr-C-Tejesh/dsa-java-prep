package BinarySearch.Medium;

public class FindMinRotatedArray_LC153 {
    public int findMin(int[] nums) {
        int l = 0; int r = nums.length-1;int ans = nums[0];
        while(l <= r) {
            if (nums[l] < nums[r]){
                ans = Math.min(nums[l],ans);
                break;
            }
            int m = l + (r - l)/2;
            ans = Math.min(ans , nums[m]);
            if (nums[m] >= nums[l]) l = m + 1 ;
            else r = m;
        }
        return ans;
    }
}
