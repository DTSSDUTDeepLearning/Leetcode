package SuanFa.l1844;

public class l1844 {

    public String replaceDigits(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        for (int i = 1;i < len;i+=2) {
            cs[i] = (char)(cs[i-1] - 48 + cs[i]);
        }
        return String.valueOf(cs);
    }
}
