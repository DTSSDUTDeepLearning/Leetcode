package NowCoder.l145;

public class l145_1 {

    // 用二维数组存储动态规划数组
    public int knapsack (int V, int n, int[][] vw) {
        if(V==0 || n==0 || vw==null){
            return 0;
        }
        int[][] results = new int[n+1][V+1];
        for (int i = 1;i <= n;i++) {
            for (int j = 1;j <= V;j++) {
                if (j < vw[i-1][0]) {
                    results[i][j] = results[i-1][j];
                }
                else {
                    results[i][j] = Math.max(results[i-1][j], results[i-1][j-vw[i-1][0]]+vw[i-1][1]);
                }
            }
        }
        return results[n][V];
    }
}
