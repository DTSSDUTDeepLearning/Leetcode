package SuanFa.l1995;

import java.util.HashMap;
import java.util.Map;

public class l1995 {

    public int countQuadruplets(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        for (int i = 0;i < len-3;i++) {
            for (int j = i+1;j < len-2;j++) {
                for (int k = j+1;k < len-1;k++) {
                    for (int l = k+1;l < len;l++) {
                        if (nums[i] + nums[j] + nums[k] == nums[l]) {
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
