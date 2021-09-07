package SuanFa.l053;

public class l053_2 {

    public static int[] getfournum(int[] nums, int left, int right) {
        if (left == right){
            int[] result = {nums[left], nums[left], nums[left], nums[left]};
            return result;
        }
        else {
            int mid = (left + right) / 2;
            int[] result1 = getfournum(nums, left, mid);
            int[] result2 = getfournum(nums, mid+1, right);
            int isum = result1[3] + result2[3];
            int lsum = Math.max(result1[0], result1[3]+result2[0]);
            int rsum = Math.max(result2[1], result1[1]+result2[3]);
            int msum = Math.max(Math.max(result1[2], result2[2]), result1[1]+result2[0]);
            int[] result = {lsum, rsum, msum, isum};
            return result;
        }
    }

    // 使用分治法
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        return getfournum(nums, left, right)[2];
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
