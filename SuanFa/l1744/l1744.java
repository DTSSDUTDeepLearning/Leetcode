package SuanFa.l1744;

public class l1744 {

    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int len1 = candiesCount.length;
        long[] pre = new long[len1];
        pre[0] = candiesCount[0];
        for (int i = 1;i < len1;i++) {
            pre[i] = pre[i-1] + candiesCount[i];
        }
        int len2 = queries.length;
        boolean[] result = new boolean[len2];
        for (int i = 0;i < len2;i++) {
            int type = queries[i][0];
            int day = queries[i][1];
            int candynum = queries[i][2];
            long low = day + 1;
            long high = low * candynum;
            if (type == 0) {
                result[i] = pre[type] >= low;
            }
            else {
                result[i] = !(pre[type] < low || pre[type-1] >= high);
            }
        }
        return result;
    }
}
