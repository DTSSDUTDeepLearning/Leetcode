package NowCoder.l122;

public class l122 {

    public boolean match (String str, String pattern) {
        int sl = str.length();
        int pl = pattern.length();
        char[] sc = str.toCharArray();
        char[] pc = pattern.toCharArray();
        if (pl == 0) {
            return sl == 0;
        }
        if (sl == 0) {
            if (pl % 2 == 1) {
                return false;
            }
            else {
                for (int i = 1;i < pl;i+=2) {
                    if (pc[i] != '*') {
                        return false;
                    }
                }
                return true;
            }
        }
        if (pc[pl-1] == '*') {
            if (match(str.substring(0,sl), pattern.substring(0,pl-2))) {
                return true;
            }
            char c0 = pc[pl-2];
            if (c0 == '.') {
                for (int i = sl;i >= 0;i--) {
                    if (match(str.substring(0,i), pattern.substring(0,pl-2))) {
                        return true;
                    }
                }
                return false;
            }
            else {
                for (int i = sl;i > 0;i--) {
                    if (sc[i - 1] == c0) {
                        if (match(str.substring(0, i-1), pattern.substring(0, pl - 2))) {
                            return true;
                        }
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        if (sc[sl-1] == pc[pl-1] || pc[pl-1] == '.') {
            return match(str.substring(0,sl-1), pattern.substring(0,pl-1));
        }
        return false;
    }
}
