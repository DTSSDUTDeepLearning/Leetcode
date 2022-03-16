package SuanFa.l1805;

import java.util.HashSet;
import java.util.Set;

public class l1805 {

    public int numDifferentIntegers(String word) {
        Set<String> s = new HashSet<>();
        char[] cs = word.toCharArray();
        int len = cs.length;
        StringBuilder sb = new StringBuilder();
        if (cs[0] >= '0' && cs[0] <= '9') {
            sb.append(cs[0]);
        }
        for (int i = 1;i < len;i++) {
            if (cs[i] >= '0' && cs[i] <= '9') {
                sb.append(cs[i]);
            }
            else if (cs[i-1] >= '0' && cs[i-1] <= '9') {
                char[] cssb = sb.toString().toCharArray();
                int sb_len = cssb.length;
                int index = 0;
                while (index < sb_len && cssb[index] == '0') {
                    index++;
                }
                if (index != sb_len) {
                    s.add(sb.substring(index));
                }
                else {
                    s.add("0");
                }
                sb = new StringBuilder();
            }
        }
        if (cs[len-1] >= '0' && cs[len-1] <= '9') {
            char[] cssb = sb.toString().toCharArray();
            int sb_len = cssb.length;
            int index = 0;
            while (index < sb_len && cssb[index] == '0') {
                index++;
            }
            if (index != sb_len) {
                s.add(sb.substring(index));
            }
            else {
                s.add("0");
            }
        }
        return s.size();
    }
}
