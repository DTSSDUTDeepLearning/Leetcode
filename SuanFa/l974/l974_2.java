package SuanFa.l974;

import java.util.HashMap;
import java.util.Map;

public class l974_2 {

    // 哈希表保存前缀和，然后遍历哈希表，用排列计算值
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        int sum = 0;
        int cnt = 0;
        for (int a : A) {
            sum+=a;
            int mod = (sum >= 0)?sum%K:(sum%K+K)%K;
            m.put(mod, m.getOrDefault(mod, 0)+1);
        }
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            cnt += e.getValue()*(e.getValue()-1)/2;
        }
        return cnt;
    }
}
