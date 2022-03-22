package NowCoder.l095;

import java.util.HashSet;
import java.util.Set;

public class l095 {

    public int MLS (int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int a : arr) {
            s.add(a);
        }
        int longest = 0;
        for (int num : s) {
            if (!s.contains(num - 1)) {
                int curr_num = num;
                int curr_len = 1;
                while (s.contains(curr_num + 1)) {
                    curr_num += 1;
                    curr_len += 1;
                }
                longest = Math.max(longest, curr_len);
            }
        }
        return longest;
    }
}
