package SuanFa.l1573;

import java.util.LinkedList;
import java.util.List;

public class l1573 {

    public int numWays(String s) {
        int MOD = 1000000007;
        char[] cs = s.toCharArray();
        int len = cs.length;
        List<Integer> l = new LinkedList<>();
        for (int i = 0;i < len;i++) {
            if (cs[i] == '1') {
                l.add(i);
            }
        }
        int m = l.size();
        if (m % 3 != 0) {
            return 0;
        }
        long a;
        if (m == 0) {
            a = (long)(len-1)*(len-2)/2;
        }
        else {
            a = (long)(l.get(m/3)-l.get(m/3-1))*(l.get(m/3*2)-l.get(m/3*2-1));
        }
        return (int) (a%MOD);
    }
}
