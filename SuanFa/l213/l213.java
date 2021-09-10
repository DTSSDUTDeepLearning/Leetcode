package SuanFa.l213;

public class l213 {

    public static int rob_1(int[]nums, int left, int right) {
        int len = nums.length;
        boolean flag = (nums[left+1]>nums[left])?true:false;
        int a = nums[left];
        int b = Math.max(nums[left], nums[left+1]);
        for (int i = left+2;i <= right;i++) {
            int c = nums[i];
            if (flag) {
                if (a+c > b) {
                    c += a;
                }
                else {
                    c = b;
                    flag = false;
                }
            }
            else {
                flag = true;
                c += b;
            }
            a = b;
            b = c;
        }
        return b;
    }

    public static int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(rob_1(nums, 0, len-2), rob_1(nums, 1, len-1));
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,2};
        int[] nums2 = {1,2,3,1};
        int[] nums3 = {0};
        int[] nums4 = {1,2};
        int[] nums5 = {3,2,3};
        System.out.println(rob(nums1));
        System.out.println(rob(nums2));
        System.out.println(rob(nums3));
        System.out.println(rob(nums4));
        System.out.println(rob(nums5));
    }
}
