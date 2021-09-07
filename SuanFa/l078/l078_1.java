package SuanFa.l078;

import java.util.LinkedList;
import java.util.List;

public class l078_1 {

    // 迭代，时间慢，空间差不多
    List<Integer> l = new LinkedList<>();
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        for (int i = 0;i < (1 << len);i++) {
            l.clear();
            for (int j = 0;j < len;j++) {
                if ((i & (1 << j)) != 0) {
                    l.add(nums[j]);
                }
            }
            result.add(new LinkedList<>(l));
        }
        return result;
    }
}
