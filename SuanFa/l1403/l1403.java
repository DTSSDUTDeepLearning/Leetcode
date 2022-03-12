package SuanFa.l1403;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l1403 {

    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum_total = 0;
        int sum_big = 0;
        List<Integer> l = new LinkedList<>();
        for (int num : nums) {
            sum_total+=num;
        }
        for (int i = nums.length-1;i >= 0;i--) {
            sum_big+=nums[i];
            l.add(nums[i]);
            if (sum_big*2 > sum_total) {
                break;
            }
        }
        return l;
    }
}
