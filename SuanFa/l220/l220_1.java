package SuanFa.l220;

import java.util.TreeSet;

public class l220_1 {

    // 使用TreeSet保存数据的大小信息，注意ceiling()方法
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int len = nums.length;
        TreeSet<Long> s = new TreeSet<>();
        for (int i = 0;i < len;i++) {
            Long ceil = s.ceiling((long)nums[i] - (long)t);
            if (ceil != null && ceil <= (long)nums[i] + (long)t) {
                return true;
            }
            s.add((long)nums[i]);
            if (i >= k) {
                s.remove((long)nums[i-k]);
            }
        }
        return false;
    }
}
