package JianZhiOffer.l039;

import java.util.Arrays;

public class l039_1 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
