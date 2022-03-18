package SuanFa.l1968;

import java.util.Arrays;

public class l1968 {

    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int[] result = new int[len];
        if ((len & 1) == 0) {
            for (int i = 0;i < len/2;i++) {
                result[2*i] = nums[i];
                result[2*i+1] = nums[i+len/2];
            }
        }
        else {
            for (int i = 0;i < len/2;i++) {
                result[2*i] = nums[i];
                result[2*i+1] = nums[i+len/2+1];
            }
            result[len-1] = nums[len/2];
        }
        return result;
    }
}
