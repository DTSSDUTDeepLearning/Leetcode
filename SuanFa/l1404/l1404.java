package SuanFa.l1404;

public class l1404 {

    public int numSteps(String s) {
        StringBuilder sb = new StringBuilder(s);
        int step = 0;
        int len = sb.length();
        while (len != 1) {
            step++;
            if (sb.charAt(len-1) == '0') {
                s = sb.substring(0, len - 1);
                sb = new StringBuilder(s);
                len--;
            }
            else {
                int i = len-2;
                while (i > 0 && sb.charAt(i) == '1') {
                    i--;
                }
                if (i == 0) {
                    return step+len;
                }
                else {
                    step+=(len-i-1);
                    s = sb.substring(0, i);
                    sb = new StringBuilder(s);
                    sb.append('1');
                    len = sb.length();
                }
            }
        }
        return step;
    }
}
