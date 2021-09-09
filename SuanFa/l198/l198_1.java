package SuanFa.l198;

public class l198_1 {

    public static int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        boolean flag = false;
        if (nums[1]>nums[0]) {
            flag = true;
        }
        else {
            nums[1] = nums[0];
        }
        for (int i = 2;i < len;i++) {
            if (flag) {
                if (nums[i-2]+nums[i] > nums[i-1]) {
                    nums[i] += nums[i-2];
                }
                else {
                    nums[i] = nums[i-1];
                    flag = false;
                }
            }
            else {
                flag = true;
                nums[i] += nums[i-1];
            }
        }
        return nums[len-1];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {2,7,9,3,1};
        int[] nums3 = {2,1};
        System.out.println(rob(nums1));
        System.out.println(rob(nums2));
        System.out.println(rob(nums3));
    }
}
