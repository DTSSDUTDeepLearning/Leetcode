package SuanFa.l1946;

public class l1946 {

    public String maximumNumber(String num, int[] change) {
        char[] cs = num.toCharArray();
        int len = cs.length;
        for (int i = 0;i < len;i++) {
            if (change[cs[i] - '0'] > cs[i] - '0') {
                while (i < len && change[cs[i] - '0'] >= cs[i] - '0') {
                    cs[i] = (char)(change[cs[i] - '0'] + '0');
                    i++;
                }
                break;
            }
        }
        return String.valueOf(cs);
    }
}
