package SuanFa.l1903;

public class l1903 {

    public String largestOddNumber(String num) {
        char[] cs = num.toCharArray();
        int len = cs.length;
        for (int i = len-1;i >= 0;i--) {
            if ((cs[i] - 48) % 2 == 1) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
