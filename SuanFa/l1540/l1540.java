package SuanFa.l1540;

import java.util.HashMap;
import java.util.Map;

public class l1540 {

    public boolean canConvertString(String s, String t, int k) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] cs1 = s.toCharArray();
        char[] cs2 = t.toCharArray();
        int len = cs1.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0;i < len;i++) {
            int times = cs2[i]-cs1[i];
            if (times < 0) {
                times+=26;
            }
            if (times != 0) {
                m.put(times, m.getOrDefault(times, 0)+1);
            }
        }
        for (int n : m.keySet()) {
            if (n+(m.get(n)-1)*26 > k) {
                return false;
            }
        }
        return true;
    }
}
