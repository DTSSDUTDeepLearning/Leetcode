package NowCoder.l145;

public class l145_2 {

    // 用一维数组存储动态规划数组
    public int knapsack (int V, int n, int[][] vw) {
        if(V==0 || n==0 || vw==null){
            return 0;
        }
        int[] result = new int[V+1];
        for (int i = 0;i < n;i++) {
            for (int j = V;j >= vw[i][0];j--) {
                result[j] = Math.max(result[j], result[j-vw[i][0]]+vw[i][1]);
            }
        }
        return result[V];
    }
}
