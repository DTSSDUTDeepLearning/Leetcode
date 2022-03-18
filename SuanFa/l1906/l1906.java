package SuanFa.l1906;

public class l1906 {

    public int[] minDifference(int[] nums, int[][] queries) {
        int len = nums.length;
        int[][] pre = new int[len+1][101];
        for (int i = 0;i < len;i++) {
            for (int j = 1;j <= 100;j++) {
                pre[i+1][j] = pre[i][j];
            }
            pre[i+1][nums[i]]++;
        }
        len = queries.length;
        int[] results = new int[len];
        for (int i = 0;i < len;i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int last = -1;
            int min = Integer.MAX_VALUE;
            for (int j = 1;j <= 100;j++) {
                if (pre[l][j] < pre[r+1][j]) {
                    if (last != -1) {
                        min = Math.min(min, j - last);
                    }
                    last = j;
                }
            }
            if (min == Integer.MAX_VALUE) {
                min = -1;
            }
            results[i] = min;
        }
        return results;
    }
}
