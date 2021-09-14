package SuanFa.l368;

import java.util.*;

public class l368 {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return new ArrayList<>(nums[0]);
        }
        Arrays.sort(nums);
        int[] div = new int[len];
        Arrays.fill(div, 1);
        int max_cnt = 1;
        int max_num = nums[0];
        for (int i = 1;i < len;i++) {
            for (int j = 0;j < i;j++) {
                if (nums[i] % nums[j] == 0) {
                    div[i] = Math.max(div[i], div[j]+1);
                }
            }
            if (div[i] > max_cnt) {
                max_cnt = div[i];
                max_num = nums[i];
            }
        }
        List<Integer> result = new LinkedList<>();
        if (max_cnt == 1) {
            result.add(nums[0]);
        }
        else {
            for (int i = len-1;i > 0 && max_cnt > 0;i--) {
                if (div[i] == max_cnt && max_num % nums[i] == 0) {
                    result.add(nums[i]);
                    max_num = nums[i];
                    max_cnt--;
                }
            }
        }
        return result;
    }
}
