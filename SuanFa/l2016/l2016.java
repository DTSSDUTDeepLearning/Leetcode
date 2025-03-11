package l2016;

public class l2016 {

    public int maximumDifference(int[] nums) {
        int len = nums.length;
        int left = 0;
        int max = -1;
        for (int right = 1;right < len;right++) {
            if (nums[left] < nums[right]) {
                max = Math.max(max, nums[right] - nums[left]);
            }
            else {
                left = right;
            }
        }
        return max;
    }
}