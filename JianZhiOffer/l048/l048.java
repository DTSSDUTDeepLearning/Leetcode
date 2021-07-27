package JianZhiOffer.l048;

import java.util.HashSet;
import java.util.Set;

public class l048 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] cs = s.toCharArray();
        int len = cs.length;
        int right = 0;
        int max = 0;
        for (int left = 0;left < len;left++) {
            if (left != 0) {
                set.remove(cs[left-1]);
            }
            while (right < len && !set.contains(cs[right])) {
                set.add(cs[right]);
                right++;
            }
            max = Math.max(max, right-left);
        }
        return max;
    }
}
