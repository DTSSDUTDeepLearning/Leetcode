package SuanFa.l1984;

import java.util.Arrays;

public class l1984 {

    public int minimumDifference(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0;i <= len - k;i++) {
            min = Math.min(min, nums[i+k-1] - nums[i]);
        }
        return min;
    }
}
