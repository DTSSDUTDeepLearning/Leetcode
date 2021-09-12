package SuanFa.l268;

public class l268_1 {

    // 使用数学方法，求和来计算
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len;
        for (int i = 0;i < len;i++) {
            sum+=i;
            sum-=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,0,1};
        int[] nums2 = {0,1};
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        int[] nums4 = {0};
        System.out.println(missingNumber(nums1));
        System.out.println(missingNumber(nums2));
        System.out.println(missingNumber(nums3));
        System.out.println(missingNumber(nums4));
    }
}
