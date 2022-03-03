package SuanFa.l880;

public class l880 {

    public static String decodeAtIndex(String s, int k) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        long size = 0;
        for (char c : cs) {
            if (c >= '0' && c <= '9') {
                size *= c - '0';
            } else {
                size++;
            }
        }
        for (int i = len-1;i >= 0;i--) {
            k %= size;
            if (k == 0 && !(cs[i] >= '0' && cs[i] <= '9')) {
                return String.valueOf(cs[i]);
            }
            if (cs[i] >= '0' && cs[i] <= '9') {
                size /= cs[i] - '0';
            }
            else {
                size--;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String S1 = "leet2code3";
        int K1 = 10;
        String S2 = "ha22";
        int K2 = 5;
        String S3 = "a2345678999999999999999";
        int K3 = 1;
        System.out.println(decodeAtIndex(S1, K1));
        System.out.println(decodeAtIndex(S2, K2));
        System.out.println(decodeAtIndex(S3, K3));
    }
}
