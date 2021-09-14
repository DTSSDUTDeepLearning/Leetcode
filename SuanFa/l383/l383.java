package SuanFa.l383;

import java.util.HashMap;
import java.util.Map;

public class l383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> m = new HashMap<>();
        int len2 = magazine.length();
        for (int i = 0;i < len2;i++) {
            char c = magazine.charAt(i);
            m.put(c, m.getOrDefault(c, 0)+1);
        }
        int len1 = ransomNote.length();
        for (int i = 0;i < len1;i++) {
            char c = ransomNote.charAt(i);
            if (!m.containsKey(c)) {
                return false;
            }
            int num = m.get(c);
            if (num == 0) {
                return false;
            }
            m.put(c, num-1);
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote1 = "a";
        String magazine1 = "b";
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println(canConstruct(ransomNote1, magazine1));
        System.out.println(canConstruct(ransomNote2, magazine2));
        System.out.println(canConstruct(ransomNote3, magazine3));
    }
}
