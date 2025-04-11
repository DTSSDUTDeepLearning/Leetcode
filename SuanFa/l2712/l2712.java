package l2712;

public class l2712 {

    public long minimumCost(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        long result = 0;
        for (int i = 1;i < len;i++) {
            if (cs[i] != cs[i-1]) {
                result += Math.min(i, len-i);
            }
        }
        return result;
    }
}
