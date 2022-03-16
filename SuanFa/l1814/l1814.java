package SuanFa.l1814;

import java.util.HashMap;
import java.util.Map;

public class l1814 {

    public int countNicePairs(int[] nums) {
        int MOD = 1000000007;
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : nums) {
            int r = num - rev(num);
            m.put(r, m.getOrDefault(r, 0)+1);
        }
        long result = 0;
        for (int n : m.keySet()) {
            long tmp = m.get(n);
            result = (result + tmp * (tmp - 1) / 2) % MOD;
        }
        return (int)result;
    }

    public int rev(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum * 10 + num % 10;
            num /= 10;
        }
        return sum;
    }
}
