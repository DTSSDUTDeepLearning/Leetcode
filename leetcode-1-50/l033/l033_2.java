package SuanFa.l033;

public class l033_2 {

    // 二分法，理论上时间复杂度更优，但跑起来没有普通方法快
    public static int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (target >= nums[0] && target < nums[mid]) {
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
            else {
                if (target <= nums[len-1] && target > nums[mid]) {
                    left = mid+1;
                }
                else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        int[] nums2 = nums1;
        int target2 = 3;
        int[] nums3 = {1};
        int target3 = 0;
        int[] nums4 = {1,3};
        int target4 = 0;
        int[] nums5 = {1,3};
        int target5 = 3;
        int[] nums6 = {1,3};
        int target6 = 1;
        int[] nums7 = nums1;
        int target7 = 7;
        int[] nums8 = nums1;
        int target8 = 1;
        int[] nums9 = {3,4,5,6,1,2};
        int target9 = 1;
        System.out.println(search(nums1, target1));
        System.out.println(search(nums2, target2));
        System.out.println(search(nums3, target3));
        System.out.println(search(nums4, target4));
        System.out.println(search(nums5, target5));
        System.out.println(search(nums6, target6));
        System.out.println(search(nums7, target7));
        System.out.println(search(nums8, target8));
        System.out.println(search(nums9, target9));
    }
}
