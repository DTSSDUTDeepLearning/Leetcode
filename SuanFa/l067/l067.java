package SuanFa.l067;

public class l067 {

    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }
        char[] c = new char[a.length()];
        char d = '0';
        for (int i = 1;i <= b.length();i++) {
            if (a.charAt(a.length()-i) == '0') {
                if (b.charAt(b.length()-i) == '0') {
                    c[c.length-i] = d;
                    d = '0';
                }
                else {
                    c[c.length-i] = (d == '0')?'1':'0';
                }
            }
            else {
                if (b.charAt(b.length()-i) == '0') {
                    c[c.length-i] = (d == '0')?'1':'0';
                }
                else {
                    c[c.length-i] = d;
                    d = '1';
                }
            }
        }
        for (int i = b.length()+1;i <= a.length();i++) {
            if (a.charAt(a.length()-i) == '0') {
                c[c.length-i] = d;
                d = '0';
            }
            else {
                c[c.length-i] = (d == '0')?'1':'0';
            }
        }
        String result = (d=='1')?"1":"";
        for (int i = 0;i < c.length;i++) {
            result += (c[i]=='1')?"1":"0";
        }
        return result;
    }

    public static void main(String[] args) {
        String a1 = "11";
        String b1 = "1";
        System.out.println(addBinary(a1, b1));
        String a2 = "1010";
        String b2 = "1011";
        System.out.println(addBinary(a2, b2));
        String a3 = "0";
        String b3 = "0";
        System.out.println(addBinary(a3, b3));
        String a4 = "0";
        String b4 = "11";
        System.out.println(addBinary(a4, b4));
        String a5 = "1010";
        String b5 = "0";
        System.out.println(addBinary(a5, b5));
    }
}
