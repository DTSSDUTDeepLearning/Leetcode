package SuanFa.l081;

public class l081_1 {

    // 二分法，时间为O(n)
    public boolean search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return false;
        }
        if (len == 1) {
            return nums[0] == target;
        }
        int left = 0;
        int right = len-1;
        int mid = left + (right-left)/2;
        while (left <= right) {
            if (nums[mid] == target) {
                return true;
            }
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }
            else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
            mid = left + (right-left)/2;
        }
        return false;
    }
}
