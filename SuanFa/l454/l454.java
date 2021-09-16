package SuanFa.l454;

import java.util.HashMap;
import java.util.Map;

public class l454 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int a : nums1) {
            for (int b : nums2) {
                m.put(a+b, m.getOrDefault(a+b, 0)+1);
            }
        }
        int cnt = 0;
        for (int c : nums3) {
            for (int d : nums4) {
                if (m.containsKey(-c-d)) {
                    cnt += m.get(-c-d);
                }
            }
        }
        return cnt;
    }
}
