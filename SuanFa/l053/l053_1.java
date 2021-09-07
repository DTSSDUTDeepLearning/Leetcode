package SuanFa.l053;

public class l053_1 {

    // 使用正向遍历、动态规划来完成
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 1;i < nums.length;i++) {
            if (nums[i-1] >= 0) {
                nums[i] += nums[i-1];
            }
        }
        int max = nums[0];
        for (int i = 1;i < nums.length;i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {-1};
        int[] nums3 = {-2,1};
        int[] nums4 = {-2,-1};
        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
        System.out.println(maxSubArray(nums4));
    }
}
