package SuanFa.l1869;

public class l1869 {

    public boolean checkZeroOnes(String s) {
        int len1 = 0;
        int max1 = 0;
        int len0 = 0;
        int max0 = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                len1++;
                max0 = Math.max(max0, len0);
                len0 = 0;
            }
            else {
                len0++;
                max1 = Math.max(max1, len1);
                len1 = 0;
            }
        }
        max0 = Math.max(max0, len0);
        max1 = Math.max(max1, len1);
        return max1 > max0;
    }
}
