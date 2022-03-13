package SuanFa.l1528;

public class l1528 {

    public String restoreString(String s, int[] indices) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        char[] result = new char[len];
        for (int i = 0;i < len;i++) {
            result[indices[i]] = cs[i];
        }
        return new String(result);
    }
}
