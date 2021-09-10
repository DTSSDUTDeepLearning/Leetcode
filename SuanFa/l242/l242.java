package SuanFa.l242;

import java.util.HashMap;
import java.util.Map;

public class l242 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int len = s.length();
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < len; i++) {
            char c = t.charAt(i);
            m.put(c, m.getOrDefault(c, 0) - 1);
            if (m.get(c) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s1, t1));
        System.out.println(isAnagram(s2, t2));
    }
}
