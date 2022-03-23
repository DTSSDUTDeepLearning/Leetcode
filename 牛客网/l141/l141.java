package NowCoder.l141;

public class l141 {

    public boolean judge (String str) {
        char[] cs = str.toCharArray();
        int len = cs.length;
        for (int i = 0;i < len/2;i++) {
            if (cs[i] != cs[len-1-i]) {
                return false;
            }
        }
        return true;
    }
}
