package SuanFa.l045;

public class l045_1 {

    // 动态规划
    public static int jump(int[] nums) {
        int[] step = new int[nums.length];
        step[0] = 0;
        for (int i = 1;i < nums.length;i++) {
            step[i] = Integer.MAX_VALUE;
        }
        for (int i = 0;i < nums.length-1;i++) {
            for (int j = 1;j <= nums[i];j++) {
                if (i+j < nums.length) {
                    if (step[i+j] > step[i] + 1) {
                        step[i+j] = step[i] + 1;
                    }
                }
                else {
                    break;
                }
            }
        }
        return step[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        System.out.println(jump(nums1));
    }
}
