package SuanFa.l848;

public class l848 {

    public String shiftingLetters(String s, int[] shifts) {
        int len = shifts.length;
        long[] pre = new long[len];
        pre[len-1] = shifts[len-1];
        for (int i = len-2;i >= 0;i--) {
            pre[i] = pre[i+1] + shifts[i];
        }
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < len;i++) {
            sb.append((char)((cs[i]-'a'+pre[i])%26+'a'));
        }
        return sb.toString();
    }
}
