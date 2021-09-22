package SuanFa.l724;

import java.util.Arrays;

public class l724 {

    public int pivotIndex(int[] nums) {
        int total_sum = Arrays.stream(nums).sum();
        int sum = 0;
        int len = nums.length;
        for (int i = 0;i < nums.length;i++) {
            if (2*sum+nums[i] == total_sum) {
                return i;
            }
            sum+=nums[i];
        }
        return -1;
    }
}
