package SuanFa.l1876;

public class l1876 {

    public int countGoodSubstrings(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        if (len < 3) {
            return 0;
        }
        char[] c = new char[3];
        for (int i = 0;i < 3;i++) {
            c[i] = cs[i];
        }
        int cnt = c[0]!=c[1]&&c[0]!=c[2]&&c[1]!=c[2]?1:0;
        for (int i = 3;i < len;i++) {
            c[i%3] = cs[i];
            if (c[0]!=c[1]&&c[0]!=c[2]&&c[1]!=c[2]) {
                cnt++;
            }
        }
        return cnt;
    }
}
