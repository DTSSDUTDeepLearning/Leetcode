package SuanFa.l1887;

import java.util.Arrays;

public class l1887 {

    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int result = 0;
        for (int i = len-1;i >= 1;i--) {
            if (nums[i] > nums[i-1]) {
                result+=(len-i);
            }
        }
        return result;
    }
}
