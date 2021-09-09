package SuanFa.l198;

public class l198_2 {

    // 使用“滚动数组”，也就是用两个数字来代替数组的更替
    public static int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        boolean flag = (nums[1]>nums[0])?true:false;
        int a = nums[0];
        int b = Math.max(nums[0], nums[1]);
        for (int i = 2;i < len;i++) {
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

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {2,7,9,3,1};
        int[] nums3 = {2,1};
        System.out.println(rob(nums1));
        System.out.println(rob(nums2));
        System.out.println(rob(nums3));
    }
}
