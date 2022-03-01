package SuanFa.l821;

public class l821 {

    public int[] shortestToChar(String s, char c) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        int[] dis = new int[len];
        for (int i = 0;i < len;i++) {
            dis[i] = Integer.MAX_VALUE;
        }
        for (int i = 0;i < len;i++) {
            if (cs[i] == c) {
                dis[i] = 0;
                int j = 1;
                while (i-j >= 0 && dis[i-j] > j) {
                    dis[i-j] = j;
                    j++;
                }
                j = 1;
                while (i+j < len && cs[i+j] != c) {
                    dis[i+j] = j;
                    j++;
                }
            }
        }
        return dis;
    }
}
