package SuanFa.l345;

import java.io.StringReader;

public class l345 {

    public static boolean isaeoiu(char c) {
        return c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u' || c == 'A' || c == 'E' || c == 'O' || c == 'I' || c == 'U';
    }

    public static int findnext(char[] s, int left) {
        int len = s.length;
        for (int i = left+1;i < len;i++) {
            if (isaeoiu(s[i])) {
                return i;
            }
        }
        return len-1;
    }

    public static int findbefore(char[] s, int right) {
        for (int i = right-1;i >= 0;i--) {
            if (isaeoiu(s[i])) {
                return i;
            }
        }
        return 0;
    }

    public String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        if (len == 0) {
            return "";
        }
        int left = findnext(cs, -1);
        int right = findbefore(cs, len);
        while (left < right) {
            char tmp = cs[left];
            cs[left] = cs[right];
            cs[right] = tmp;
            left = findnext(cs, left);
            right = findbefore(cs, right);
        }
        return new String(cs);
    }
}
