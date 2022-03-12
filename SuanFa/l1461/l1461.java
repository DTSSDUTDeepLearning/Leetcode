package SuanFa.l1461;

import java.util.HashSet;
import java.util.Set;

public class l1461 {

    public boolean hasAllCodes(String s, int k) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        if (len < (1 << k)+k-1) {
            return false;
        }
        int num = Integer.parseInt(s.substring(0, k), 2);
        Set<Integer> set = new HashSet<>();
        set.add(num);
        for (int i = 1;i + k <= len;i++) {
            if (cs[i-1] == '1') {
                num-=(1<<(k-1));
            }
            num = num*2+cs[i+k-1]-'0';
            set.add(num);
        }
        return set.size()==(1 << k);
    }
}
