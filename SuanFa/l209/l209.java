package SuanFa.l209;

public class l209 {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int len = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int right = 0;right < len;right++) {
            sum += nums[right];
            if (sum >= target) {
                while (left <= right && sum >= target) {
                    sum -= nums[left++];
                }
                if (left > right) {
                    return 1;
                }
                min = Math.min(min, right-left+2);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        else {
            return min;
        }
    }
}