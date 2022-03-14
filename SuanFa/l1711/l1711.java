package SuanFa.l1711;

import java.util.HashMap;
import java.util.Map;

public class l1711 {

    public int countPairs(int[] deliciousness) {
        int MOD = 1000000007;
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : deliciousness) {
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        long cnt = 0;
        for (int num : m.keySet()) {
            int sum = 1;
            int ci = 0;
            while (sum < 2*num) {
                sum <<= 1;
                ci++;
            }
            for (;ci <= 21;ci++) {
                if (m.containsKey(sum-num)) {
                    if (num != sum - num) {
                        long n1 = m.get(num);
                        long n2 = m.get(sum - num);
                        cnt = (cnt + n1*n2) % MOD;
                    }
                    else {
                        long n = m.get(num);
                        cnt = (cnt + n*(n-1)/2) % MOD;
                    }
                }
                sum <<= 1;
            }
        }
        return (int)cnt;
    }
}
