package SuanFa.l448;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class l448_1 {

    // 使用集合
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            if (!s.contains(num)) {
                s.add(num);
            }
        }
        int len = nums.length;
        List<Integer> l = new LinkedList<>();
        for (int i = 1;i <= len;i++) {
            if (!s.contains(i)) {
                l.add(i);
            }
        }
        return l;
    }
}
