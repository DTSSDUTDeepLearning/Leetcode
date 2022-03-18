package NowCoder.l048;

public class l048 {

    public int search (int[] nums, int target) {
        if (nums[0] == target) {
            return 0;
        }
        int left = 0;
        int right = nums.length;
        int mid = left+(right-left)/2;
        while (left < right) {
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] < nums[mid]) {
                if (nums[mid] < target || nums[0] > target) {
                    left = mid + 1;
                }
                else {
                    right = mid;
                }
            }
            else {
                if (nums[mid] > target || target > nums[0]) {
                    right = mid;
                }
                else {
                    left = mid + 1;
                }
            }
            mid = left+(right-left)/2;
        }
        return -1;
    }
}
