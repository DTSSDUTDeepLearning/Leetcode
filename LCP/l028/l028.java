package LCP.l028;

import java.util.Arrays;

public class l028 {

    public int purchasePlans(int[] nums, int target) {
        int MOD = 1000000007;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        long sum = 0;
        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right--;
            }
            else {
                sum = (sum + right - left) % MOD;
                left++;
            }
        }
        return (int)sum;
    }
}
