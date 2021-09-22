package SuanFa.l747;

public class l747 {

    public int dominantIndex(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return -1;
        }
        int max1 = Integer.MIN_VALUE;
        int max1_index = -1;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0;i < len;i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                max1_index = i;
            }
            else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        if (max1 >= 2*max2) {
            return max1_index;
        }
        else {
            return -1;
        }
    }
}
