package SuanFa.l090;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l090_1 {

    // 迭代，时间慢，空间差不多
    List<Integer> l = new LinkedList<>();
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0;i < (1 << len);i++) {
            l.clear();
            boolean flag = true;
            for (int j = 0;j < len;j++) {
                if ((i & (1 << j)) != 0) {
                    if (j > 0 && (i >> (j-1) & 1) == 0 && nums[j] == nums[j-1]) {
                        flag = false;
                        break;
                    }
                    l.add(nums[j]);
                }
            }
            if (flag) {
                result.add(new LinkedList<>(l));
            }
        }
        return result;
    }
}
