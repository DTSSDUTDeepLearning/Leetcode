package SuanFa.l035;

public class l035 {

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
            mid = (left + right) / 2;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 0;
        int[] nums2 = {};
        int target5 = 1;
        int[] nums3 = {1};
        int target6 = 1;
        System.out.println(searchInsert(nums1, target1));
        System.out.println(searchInsert(nums1, target2));
        System.out.println(searchInsert(nums1, target3));
        System.out.println(searchInsert(nums1, target4));
        System.out.println(searchInsert(nums2, target5));
        System.out.println(searchInsert(nums3, target6));
    }
}
