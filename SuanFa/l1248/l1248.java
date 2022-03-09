package SuanFa.l1248;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l1248 {

    public int numberOfSubarrays(int[] nums, int k) {
        int len = nums.length;
        int[] odd = new int[len+2];
        int cnt = 1;
        for (int i = 0;i < len;i++) {
            if (nums[i] % 2 == 1) {
                odd[cnt++] = i;
            }
        }
        odd[0] = -1;
        odd[cnt] = len;
        int result = 0;
        for (int i = 1;i+k <= cnt;i++) {
            result += (odd[i]-odd[i-1])*(odd[i+k]-odd[i+k-1]);
        }
        return result;
    }
}
