package SuanFa.l448;

import java.util.LinkedList;
import java.util.List;

public class l448_2 {

    // 官方题解二
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            int i = Math.abs(num)-1;
            nums[i] = -Math.abs(nums[i]);
        }
        List<Integer> l = new LinkedList<>();
        int len = nums.length;
        for (int i = 0;i < len;i++) {
            if (nums[i] > 0) {
                l.add(i+1);
            }
        }
        return l;
    }
}
