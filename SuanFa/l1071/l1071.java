package SuanFa.l1071;

public class l1071 {

    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        int len1 = str1.length();
        int len2 = str2.length();
        int gcd = gcd(len1, len2);
        if (gcd == 1) {
            return "";
        }
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        for (int i = 1;i < len2/gcd;i++) {
            sb1.append(str1);
        }
        for (int i = 1;i < len1/gcd;i++) {
            sb2.append(str2);
        }
        if (!sb1.toString().equals(sb2.toString())) {
            return "";
        }
        else {
            return str1.substring(0, gcd);
        }
    }

    public int gcd(int m, int n) {
        int r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
}
