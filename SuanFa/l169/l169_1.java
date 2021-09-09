package SuanFa.l169;

import java.util.Arrays;

public class l169_1 {

    // 用排序，中位数一定是众数
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
