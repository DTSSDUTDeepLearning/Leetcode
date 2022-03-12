package SuanFa.l1433;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class l1433 {

    public boolean checkIfCanBreak(String s1, String s2) {
        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (char c : cs1) {
            cnt1[c-'a']++;
        }
        for (char c : cs2) {
            cnt2[c-'a']++;
        }
        int len1 = cs1.length;
        int len2 = cs2.length;
        int flag = 0;
        for (int i = 0; i < 26; i++) {
            len1 -= cnt1[i];
            len2 -= cnt2[i];
            if (flag == 0) {
                if (len1 < len2) {
                    flag = 1;
                }
                else if (len1 > len2) {
                    flag = -1;
                }
            }
            else if (flag == 1) {
                if (len1 > len2) {
                    return false;
                }
            }
            else if (len1 < len2) {
                return false;
            }
        }
        return true;
    }
}
