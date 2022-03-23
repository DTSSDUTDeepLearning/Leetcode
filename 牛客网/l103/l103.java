package NowCoder.l103;

public class l103 {

    public String solve (String str) {
        char[] cs = str.toCharArray();
        int len = cs.length;
        for (int i = 0;i < len/2;i++) {
            char tmp = cs[i];
            cs[i] = cs[len-i-1];
            cs[len-i-1] = tmp;
        }
        return new String(cs);
    }
}
