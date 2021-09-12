package SuanFa.l290;

import java.util.HashMap;
import java.util.Map;

public class l290 {

    public static boolean wordPattern(String pattern, String s) {
        String[] part = s.split(" ");
        if (part.length != pattern.length()) {
            return false;
        }
        Map<Character, String> m1 = new HashMap<>();
        Map<String, Character> m2 = new HashMap<>();
        int len = pattern.length();
        for (int i = 0;i < len;i++) {
            Character a = pattern.charAt(i);
            String b = part[i];
            if (m1.containsKey(a) && !m1.get(a).equals(b)) {
                return false;
            }
            if (m2.containsKey(b) && !m2.get(b).equals(a)) {
                return false;
            }
            m1.put(a, b);
            m2.put(b, a);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        String pattern4 = "abba";
        String s4 = "dog dog dog dog";
        String pattern5 = "aaa";
        String s5 = "aa aa aa aa";
        System.out.println(wordPattern(pattern1, s1));
        System.out.println(wordPattern(pattern2, s2));
        System.out.println(wordPattern(pattern3, s3));
        System.out.println(wordPattern(pattern4, s4));
        System.out.println(wordPattern(pattern5, s5));
    }
}
