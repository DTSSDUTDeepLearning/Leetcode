package SuanFa.l1657;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class l1657 {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (char c : word1.toCharArray()) {
            s1.add(c);
            cnt1[c-'a']++;
        }
        for (char c : word2.toCharArray()) {
            s2.add(c);
            cnt2[c-'a']++;
        }
        if (!s1.equals(s2)) {
            return false;
        }
        Arrays.sort(cnt1);
        Arrays.sort(cnt2);
        return Arrays.equals(cnt1, cnt2);
    }
}
