package SuanFa.l152;

public class l152 {

    public int maxProduct(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for (int i = 1; i < len; ++i) {
            int t1 = max;
            int t2 = min;
            max = Math.max(t1 * nums[i], Math.max(nums[i], t2 * nums[i]));
            min = Math.min(t2 * nums[i], Math.min(nums[i], t1 * nums[i]));
            result = Math.max(max, result);
        }
        return result;
    }
}
