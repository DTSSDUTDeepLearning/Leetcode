package SuanFa.l974;

import java.util.HashMap;
import java.util.Map;

public class l974_1 {

    // 哈希表保存前缀和，然后再遍历哈希表求总和
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        int sum = 0;
        int cnt = 0;
        for (int a : A) {
            sum+=a;
            int mod = (sum >= 0)?sum%K:(sum%K+K)%K;
            int num = m.getOrDefault(mod, 0);
            cnt+=num;
            m.put(mod, num+1);
        }
        return cnt;
    }
}
