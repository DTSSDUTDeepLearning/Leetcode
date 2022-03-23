package NowCoder.l105;

public class l105 {

    public int search (int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums[0] == target) {
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        int mid = left+(right-left)/2;
        while (left < right) {
            if (nums[mid] == target) {
                if (nums[mid-1] != target) {
                    return mid;
                }
                else {
                    right = mid-1;
                }
            }
            else if (nums[mid] > target) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
            mid = left+(right-left)/2;
        }
        if (nums[left] == target) {
            return left;
        }
        else {
            return -1;
        }
    }
}
