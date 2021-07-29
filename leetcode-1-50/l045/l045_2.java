package SuanFa.l045;

public class l045_2 {

    // 正向贪心算法
    public static int jump(int[] nums) {
        int farest = 0;
        int end = 0;
        int step = 0;
        for (int i = 0;i < nums.length-1;i++) {
            farest = Math.max(farest, i+nums[i]);
            if (i == end) {
                end = farest;
                step++;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        System.out.println(jump(nums1));
    }
}
