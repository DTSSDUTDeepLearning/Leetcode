package SuanFa.l859;

import java.util.HashSet;
import java.util.Set;

public class l859 {

    public boolean buddyStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        if (a.equals(b)) {
            Set<Character> s = new HashSet<>();
            for (char c : a.toCharArray()) {
                if (s.contains(c)) {
                    return true;
                }
                else {
                    s.add(c);
                }
            }
            return false;
        }
        else {
            int m = -1;
            int n = -1;
            char[] as = a.toCharArray();
            char[] bs = b.toCharArray();
            int len = as.length;
            for (int i = 0;i < len;i++) {
                if (as[i] != bs[i]) {
                    if (m == -1) {
                        m = i;
                    }
                    else if (n == -1) {
                        n = i;
                    }
                    else {
                        return false;
                    }
                }
            }
            if (n == -1 || as[m] != bs[n] || as[n] != bs[m]) {
                return false;
            }
            return true;
        }
    }
}
