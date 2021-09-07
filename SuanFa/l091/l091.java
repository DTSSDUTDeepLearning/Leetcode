package SuanFa.l091;

public class l091 {

    public static int numDecodings(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        if (len == 0 || cs[0] == '0') {
            return 0;
        }
        if (len == 1) {
            return 1;
        }
        if (len == 2) {
            if ((cs[0]-'0')*10+(cs[1]-'0')>26) {
                if (cs[1] == '0') {
                    return 0;
                }
                else {
                    return 1;
                }
            }
            else if (cs[1] == '0') {
                return 1;
            }
            else {
                return 2;
            }
        }
        int a = 1;
        int b;
        int c;
        if ((cs[0]-'0')*10+(cs[1]-'0')>26) {
            if (cs[1] == '0') {
                return 0;
            }
            else {
                b = 1;
            }
        }
        else if (cs[1] == '0') {
            b = 1;
        }
        else {
            b = 2;
        }
        for (int i = 2;i < len;i++) {
            if (cs[i] == '0') {
                if (cs[i-1] >= '3' || cs[i-1] == '0') {
                    return 0;
                }
                else {
                    c = a;
                }
            }
            else if (cs[i-1] == '0' || (cs[i-1]-'0')*10+(cs[i]-'0')>26) {
                c = b;
            }
            else {
                c = a+b;
            }
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        String s1 = "12";
        String s2 = "226";
        String s3 = "0";
        String s4 = "06";
        String s5 = "11106";
        String s6 = "305";
        String s7 = "350";
        System.out.println(numDecodings(s1));
        System.out.println(numDecodings(s2));
        System.out.println(numDecodings(s3));
        System.out.println(numDecodings(s4));
        System.out.println(numDecodings(s5));
        System.out.println(numDecodings(s6));
        System.out.println(numDecodings(s7));
    }
}
