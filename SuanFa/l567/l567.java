package SuanFa.l567;

import java.util.Arrays;

public class l567 {

    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) {
            return false;
        }
        int[] cnt = new int[26];
        int[] zero = new int[26];
        for (int i = 0;i < len1;i++) {
            cnt[s1.charAt(i)-'a']++;
        }
        for (int i = 0;i < len1;i++) {
            cnt[s2.charAt(i)-'a']--;
        }
        for (int i = 1;i <= len2-len1;i++) {
            if (Arrays.equals(cnt, zero)) {
                return true;
            }
            cnt[s2.charAt(i-1)-'a']++;
            cnt[s2.charAt(i+len1-1)-'a']--;
        }
        if (Arrays.equals(cnt, zero)) {
            return true;
        }
        return false;
    }
}
