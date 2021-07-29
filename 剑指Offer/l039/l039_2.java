package JianZhiOffer.l039;

import java.util.Arrays;

public class l039_2 {

    public int majorityElement(int[] nums) {
        int candi = nums[0];
        int cnt = 1;
        int len = nums.length;
        for (int i = 1;i < len;i++) {
            if (candi == nums[i]) {
                cnt++;
            }
            else {
                if (cnt == 1) {
                    candi = nums[i];
                }
                else {
                    cnt--;
                }
            }
        }
        return candi;
    }
}
