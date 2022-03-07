package MianShiTi.t01.l006;

public class l006 {

    public String compressString(String S) {
        char[] cs = S.toCharArray();
        int len = cs.length;
        if (len == 0) {
            return "";
        }
        int cnt = 1;
        char c = cs[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1;i < len;i++) {
            if (cs[i] == c) {
                cnt++;
            }
            else {
                sb.append(c);
                sb.append(cnt);
                c = cs[i];
                cnt = 1;
            }
        }
        sb.append(c);
        sb.append(cnt);
        return len > sb.length() ? sb.toString() : S;
    }
}
