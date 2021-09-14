package SuanFa.l387;

import java.util.HashMap;
import java.util.Map;

public class l387 {

    public static int firstUniqChar(String s) {
        int len = s.length();
        boolean[] flags = new boolean[len];
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0;i < len;i++) {
            char c = s.charAt(i);
            if (m.keySet().contains(c)) {
                flags[i] = true;
                flags[m.get(c)] = true;
            }
            else {
                m.put(c, i);
            }
        }
        for (int i = 0;i < len;i++) {
            if (!flags[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s1));
        System.out.println(firstUniqChar(s2));
    }
}
