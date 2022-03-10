package SuanFa.l1332;

public class l1332 {

    public int removePalindromeSub(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        if (len == 0) {
            return 0;
        }
        for (int i = 0;2*i < len;i++) {
            if (cs[i] != cs[len-i-1]) {
                return 2;
            }
        }
        return 1;
    }
}
