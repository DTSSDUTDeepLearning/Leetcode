package SuanFa.l976;

import java.util.Arrays;

public class l976 {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = len-1;i >= 2;i--) {
            if (nums[i-2] + nums[i-1] > nums[i]) {
                return nums[i-2] + nums[i-1] + nums[i];
            }
        }
        return 0;
    }
}
