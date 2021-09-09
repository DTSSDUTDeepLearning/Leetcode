package SuanFa.l153;

public class l153 {

    public static int findMin(int[] nums) {
        int len = nums.length;
        if (len == 1 || nums[0] < nums[len-1]) {
            return nums[0];
        }
        int left = 0;
        int right = len-1;
        while (left < right) {
            int mid = (left+right)/2;
            if (nums[mid] > nums[mid+1]) {
                return nums[mid+1];
            }
            if (nums[mid-1] > nums[mid]) {
                return nums[mid];
            }
            if (nums[0] < nums[mid]) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums1 = {3,4,5,1,2};
        int[] nums2 = {4,5,6,7,0,1,2};
        int[] nums3 = {1};
        int[] nums4 = {4,5,6,7,0,1};
        int[] nums5 = {2,1};
        System.out.println(findMin(nums1));
        System.out.println(findMin(nums2));
        System.out.println(findMin(nums3));
        System.out.println(findMin(nums4));
        System.out.println(findMin(nums5));
    }
}
