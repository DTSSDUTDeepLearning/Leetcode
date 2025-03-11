package l2379;

public class l2379 {

    public int minimumRecolors(String blocks, int k) {
        char[] cs = blocks.toCharArray();
        int result = 0;
        for (int i = 0;i < k;i++) {
            result+=(cs[i]=='W' ? 1 : 0);
        }
        int cnt = result;
        for (int i = k;i < cs.length;i++) {
            cnt-=(cs[i-k]=='W' ? 1 : 0);
            cnt+=(cs[i]=='W' ? 1 : 0);
            result = Math.min(result, cnt);
        }
        return result;
    }
}
