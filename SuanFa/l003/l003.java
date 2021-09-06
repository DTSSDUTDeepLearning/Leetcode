package SuanFa.l003;

import java.util.*;

public class l003 {

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
