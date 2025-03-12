package l3194;

import java.util.Arrays;

public class l3194 {

    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double result = Double.MAX_VALUE;
        for (int i = 0;i < n/2;i++) {
            result = Math.min(result, (nums[i] + nums[n-1-i]) / 2.0);
        }
        return result;
    }
}