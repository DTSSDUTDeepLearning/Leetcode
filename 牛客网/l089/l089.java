package NowCoder.l089;

public class l089 {

    public String trans(String s, int n) {
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        String x = "";
        for (int i = n-1;i >= 0;i--) {
            if (cs[i] == ' ') {
                if (x.length() != 0) {
                    char[] xs = x.toCharArray();
                    for (int j = xs.length-1;j >= 0;j--) {
                        if (xs[j] >= 'a' && xs[j] <= 'z') {
                            sb.append((char)(xs[j]-32));
                        }
                        else {
                            sb.append((char)(xs[j]+32));
                        }
                    }
                }
                x = "";
                sb.append(' ');
            }
            else {
                x+=cs[i];
            }
        }
        char[] xs = x.toCharArray();
        for (int j = xs.length-1;j >= 0;j--) {
            if (xs[j] >= 'a' && xs[j] <= 'z') {
                sb.append((char)(xs[j]-32));
            }
            else {
                sb.append((char)(xs[j]+32));
            }
        }
        return sb.toString();
    }
}
