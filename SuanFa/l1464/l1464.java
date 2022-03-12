package SuanFa.l1464;

import java.util.Arrays;

public class l1464 {

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
