package SuanFa.l673;

import java.util.Arrays;

public class l673 {

    public int findNumberOfLIS(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return len;
        }
        int[] length = new int[len];
        int[] cnt = new int[len];
        Arrays.fill(cnt, 1);
        for (int i = 0;i < len;i++) {
            for (int j = 0;j < i;j++) {
                if (nums[j] < nums[i]) {
                    if (length[j] >= length[i]) {
                        length[i] = length[j] + 1;
                        cnt[i] = cnt[j];
                    }
                    else if (length[j] + 1 == length[i]) {
                        cnt[i] += cnt[j];
                    }
                }
            }
        }
        int longest = 0;
        int max_cnt = 0;
        for (int i = 0;i < len;i++) {
            if (length[i] > longest) {
                longest = length[i];
                max_cnt = cnt[i];
            }
            else if (length[i] == longest) {
                max_cnt += cnt[i];
            }
        }
        return max_cnt;
    }
}
