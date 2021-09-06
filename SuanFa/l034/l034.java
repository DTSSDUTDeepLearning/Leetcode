package SuanFa.l034;

public class l034 {

    public static void printArray(int[] nums) {
        for (int i = 0;i < nums.length;i++) {
            System.out.print(nums[i]);
            System.out.print("   ");
        }
        System.out.println();
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

    public static int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int[] result = {-1, -1};
        if (len == 0 || nums[0] > target || nums[len-1] < target) {
            return result;
        }
        if (nums[0] == nums[len-1]) {
            if (nums[0] == target) {
                result[0] = 0;
                result[1] = len-1;
                return result;
            }
            else {
                return result;
            }
        }
        int left = searchleft(nums, target);
        int right = searchright(nums, target);
        result[0] = left;
        result[1] = right;
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {5,7,7,8,8,10};
        int target1 = 8;
        int[] nums2 = {5,7,7,8,8,10};
        int target2 = 6;
        int[] nums3 = {};
        int target3 = 0;
        int[] nums4 = {1,1,2};
        int target4 = 1;
        int[] nums5 = {1,2,2};
        int target5 = 2;
        int[] nums6 = {2,2};
        int target6 = 2;
        int[] nums7 = {1,3};
        int target7 = 1;
        printArray(searchRange(nums1, target1));
        printArray(searchRange(nums2, target2));
        printArray(searchRange(nums3, target3));
        printArray(searchRange(nums4, target4));
        printArray(searchRange(nums5, target5));
        printArray(searchRange(nums6, target6));
        printArray(searchRange(nums7, target7));
    }
}
