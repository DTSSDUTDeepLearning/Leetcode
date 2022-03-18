package NowCoder.l031;

import java.util.HashMap;
import java.util.Map;

public class l031 {

    public int FirstNotRepeatingChar(String str) {
        Map<Character, Integer> m = new HashMap<>();
        char[] cs = str.toCharArray();
        int len = cs.length;
        for (int i = 0;i < len;i++) {
            char c = cs[i];
            m.put(c, m.getOrDefault(c, 0)+1);
        }
        for (int i = 0;i < len;i++) {
            if (m.get(cs[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
