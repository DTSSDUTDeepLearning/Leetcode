package SuanFa.l1446;

public class l1446 {

    public int maxPower(String s) {
        char[] cs = s.toCharArray();
        int clenmax = 1;
        int clen = 1;
        char before = cs[0];
        int len = cs.length;
        for (int i = 1;i < len;i++) {
            if (cs[i] == before) {
                clen++;
                clenmax = Math.max(clen, clenmax);
            }
            else {
                before = cs[i];
                clen = 1;
            }
        }
        return clenmax;
    }
}
