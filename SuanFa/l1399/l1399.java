package SuanFa.l1399;

import java.util.HashMap;
import java.util.Map;

public class l1399 {

    public int countLargestGroup(int n) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 1;i <= n;i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum+=num%10;
                num/=10;
            }
            m.put(sum, m.getOrDefault(sum, 0)+1);
        }
        int maxcnt = 0;
        int cnt = 0;
        for (int num : m.keySet()) {
            int numnum = m.get(num);
            if (numnum > maxcnt) {
                cnt = 1;
                maxcnt = numnum;
            }
            else if (numnum == maxcnt) {
                cnt++;
            }
        }
        return cnt;
    }
}
