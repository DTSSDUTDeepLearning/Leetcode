package JianZhiOffer.l050;

import java.util.HashMap;
import java.util.Map;

public class l050 {

    public char firstUniqChar(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        if (len == 0) {
            return ' ';
        }
        Map<Character, Integer> m = new HashMap<>();
        int[] index = new int[26];
        for (int i = 0;i < len;i++) {
            char c = cs[i];
            m.put(c, m.getOrDefault(c, 0)+1);
            index[c-'a'] = i;
        }
        int min_id = len;
        char min_c = ' ';
        for (char c : m.keySet()) {
            if (m.get(c) == 1 && index[c-'a'] < min_id) {
                min_id = index[c-'a'];
                min_c = c;
            }
        }
        return min_c;
    }
}
