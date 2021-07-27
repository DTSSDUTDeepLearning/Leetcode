package JianZhiOffer.l061;

import java.util.Arrays;

public class l061_2 {

    // 排序+遍历
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int joker = nums[0]==0?1:0;
        for (int i = 1;i < 5;i++) {
            if (nums[i] == 0) {
                joker++;
            }
            else if (nums[i] == nums[i-1]) {
                return false;
            }
        }
        return nums[4]-nums[joker]<5;
    }
}
