package JianZhiOffer.l053_I;

public class l053_I {

    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0 || nums[0] > target || nums[len-1] < target) {
            return 0;
        }
        if (nums[0] == nums[len-1]) {
            if (nums[0] == target) {
                return len;
            }
            else {
                return 0;
            }
        }
        int left = searchleft(nums, target);
        int right = searchright(nums, target);
        if (left == -1) {
            return 0;
        }
        else {
            return right-left+1;
        }
    }

    public static int searchleft(int[] nums, int target) {
        if (nums[0] == target) {
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        int mid = (left + right) / 2;
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
            mid = (left + right) / 2;
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }

    public static int searchright(int[] nums, int target) {
        int len = nums.length;
        if (nums[len-1] == target) {
            return len-1;
        }
        int left = 0;
        int right = len-1;
        int mid = (left + right) / 2;
        while (left < right) {
            if (nums[mid] == target) {
                if (nums[mid+1] != target) {
                    return mid;
                }
                else {
                    left = mid+1;
                }
            }
            else if (nums[mid] > target) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
            mid = (left + right) / 2;
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }
}
