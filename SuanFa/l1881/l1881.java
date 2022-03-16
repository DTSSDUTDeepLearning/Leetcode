package SuanFa.l1881;

public class l1881 {

    public String maxValue(String n, int x) {
        char[] cs = n.toCharArray();
        int len = cs.length;
        StringBuilder sb = new StringBuilder();
        if (cs[0] != '-') {
            for (int i = 0;i < len;i++) {
                if (x > cs[i] - '0') {
                    sb.append(n, 0, i);
                    sb.append(x);
                    sb.append(n, i, len);
                    return sb.toString();
                }
            }
            return n+x;
        }
        else {
            for (int i = 1;i < len;i++) {
                if (x < cs[i] - '0') {
                    sb.append(n, 0, i);
                    sb.append(x);
                    sb.append(n, i, len);
                    return sb.toString();
                }
            }
            return n+x;
        }
    }
}
