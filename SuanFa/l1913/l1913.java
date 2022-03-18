package SuanFa.l1913;

public class l1913 {

    public int maxProductDifference(int[] nums) {
        int len = nums.length;
        int max1 = Math.max(nums[0], nums[1]);
        int max2 = Math.min(nums[0], nums[1]);
        int min1 = max2;
        int min2 = max1;
        for (int i = 2;i < len;i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            }
            else if (nums[i] > max2) {
                max2 = nums[i];
            }
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            }
            else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        return max1*max2 - min1*min2;
    }
}
