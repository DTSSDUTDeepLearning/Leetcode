package NowCoder.l001;

public class l001 {

    public String solve (String s, String t) {
        if (s.length() > t.length()) {
            return solve(t, s);
        }
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        int len1 = ss.length;
        int len2 = ts.length;
        boolean flag = false;
        int tmp;
        for (int i = 0;i < len1;i++) {
            tmp = flag?1:0;
            tmp += ss[len1-i-1]+ts[len2-i-1]-2*'0';
            ts[len2-i-1] = (char)(tmp % 10+'0');
            flag = tmp >= 10;
        }
        for (int i = len2-len1-1;i >= 0;i--) {
            if (flag) {
                if (ts[i] == '9') {
                    ts[i] = '0';
                }
                else {
                    ts[i]++;
                    flag = false;
                }
            }
            else {
                break;
            }
        }
        String result = new String(ts);
        if (flag) {
            return '1'+result;
        }
        else {
            return result;
        }
    }
}
